package com.kwabena.posdataapi.controller;


import com.kwabena.posdataapi.Assembler.SaleitemModelAssembler;
import com.kwabena.posdataapi.model.Receipts;
import com.kwabena.posdataapi.model.SaleItem;
import com.kwabena.posdataapi.repository.SaleItemRepository;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

//@CrossOrigin(value = "http://localhost:3000")
@RestController
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
//@RequestMapping("/api/v1/")
public class SaleItemController {

    private final SaleItemRepository repository;
    private final SaleitemModelAssembler assembler;

    public SaleItemController(SaleItemRepository repository, SaleitemModelAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @PostMapping("/saleitems")
    public ResponseEntity<?> saveSaleitem(@RequestBody SaleItem receipts){
        EntityModel<SaleItem> entityModel = assembler.toModel(repository.save(receipts));

        return ResponseEntity //
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
                .body(entityModel);
    }

    @PostMapping("/saleitemsall")
    public ResponseEntity<?> saveSaleitemAll(@RequestBody List<SaleItem> receipts){
      repository.saveAll(receipts);

//        return ResponseEntity //
//                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
//                .body(entityModel);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/saleitems")
    public List<EntityModel<SaleItem>> getAllSaleitems(){
        List<EntityModel<SaleItem>> receipts = repository.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());
//        return CollectionModel.of(product, linkTo(methodOn(ProductController.class).getAllProducts()).withSelfRel());
        return receipts;
//     return repository.findAll();

    }


}
