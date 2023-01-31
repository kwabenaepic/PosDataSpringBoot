package com.kwabena.posdataapi.controller;


import com.kwabena.posdataapi.Assembler.ProductModelAssembler;
import com.kwabena.posdataapi.exceptions.ProductNotFoundException;
import com.kwabena.posdataapi.model.Product;
import com.kwabena.posdataapi.model.ReorderView;
import com.kwabena.posdataapi.repository.ProductRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.stream.Collectors;


@CrossOrigin(value = "http://localhost:3000")
@RestController
//@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "Requestor-Type")
//@RequestMapping(value= "/api/v1/", produces="application/json")
public class ProductController {



    private final ProductRepository repository;
    private final ProductModelAssembler assembler;

    public ProductController(ProductRepository repository, ProductModelAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }


    @ApiOperation("Create ne Product")
    @PostMapping("/products")
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        EntityModel<Product> entityModel = assembler.toModel(repository.save(product));

        return ResponseEntity //
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
                .body(entityModel);
    }


    @GetMapping("/products")
    public List<EntityModel<Product>>getAllProducts(){
        List<EntityModel<Product>> product = repository.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());


//        return CollectionModel.of(product, linkTo(methodOn(ProductController.class).getAllProducts()).withSelfRel());
            return product;


//     return repository.findAll();

    }
    @GetMapping("/products/{id}")
    public EntityModel<Product> getProductById(@PathVariable Long id){
        Product product = repository.findById(id)//
                .orElseThrow(() -> new ProductNotFoundException(id));
        return assembler.toModel(product);
    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<?> updateProduct(@RequestBody Long id, @PathVariable Product product){
        Product updatedProduct = repository.findById(id) //
                .map(employee -> {
                    product.setAttribute(product.getAttribute());
                    product.setCategory(product.getCategory());
                    product.setDescription(product.getDescription());
                    product.setName(product.getName());
                    product.setSize(product.getSize());
                    product.setALU(product.getALU());
                    product.setUPC(product.getUPC());
                    product.setVendorcode(product.getVendorcode());
                    product.setCostprice(product.getCostprice());
                    product.setUnitprice(product.getUnitprice());
                    product.setQuantity(product.getQuantity());
                    product.setReorderlevel(product.getReorderlevel());
                    return repository.save(employee);
                }) //
                .orElseGet(() -> {
                    product.setId(id);
                    return repository.save(product);
                });

        EntityModel<Product> entityModel = assembler.toModel(updatedProduct);

        return ResponseEntity //
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
                .body(entityModel);
    }

//    @GetMapping("/products/reorderlist")
//    public CollectionModel<EntityModel<Product>> getReorderList(){
//
////        List<EntityModel<Product>> product = repository.findAll(Sort.by(Sort.Direction.DESC,("name"))).stream()
//        List<EntityModel<Product>> product = repository.findByQuantityIsLessThan().stream()
//                .map(assembler::toModel)
//                .collect(Collectors.toList());
//
//        return CollectionModel.of(product, linkTo(methodOn(ProductController.class).getReorderList()).withSelfRel());
//    }



}
