package com.kwabena.posdataapi.controller;

import com.kwabena.posdataapi.Assembler.ProductByTicketNumberViewModelAssembler;
import com.kwabena.posdataapi.model.ProductByTicketNumberView;
import com.kwabena.posdataapi.repository.ProductByTicketNumberViewRepository;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ProductByTicketNumberViewController {

    private final ProductByTicketNumberViewRepository repository;
    private final ProductByTicketNumberViewModelAssembler assembler;


    public ProductByTicketNumberViewController(ProductByTicketNumberViewRepository repository, ProductByTicketNumberViewModelAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @GetMapping("/productbyticketnumber/{ticketnumber}")
    public ResponseEntity<List<ProductByTicketNumberView>> findByTicketnumber(@RequestParam(value ="ticketnumber") String ticketnumber){
        return new ResponseEntity<List<ProductByTicketNumberView>>(repository.findByTicketnumber(ticketnumber), HttpStatus.OK);

    }

    @GetMapping("/productbyticketnumber")
    public List<EntityModel<ProductByTicketNumberView>> getAllSaleItems(){
//        List<EntityModel<Product>> product = repository.findAll(Sort.by(Sort.Direction.DESC,("name"))).stream()
        List<EntityModel<ProductByTicketNumberView>> saleitemView = repository.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());

//        return CollectionModel.of(reorderView, linkTo(methodOn(ReorderViewController.class).getAllProducts()).withSelfRel());
        return saleitemView;
    }
}
