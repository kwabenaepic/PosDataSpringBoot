package com.kwabena.posdataapi.controller;

import com.kwabena.posdataapi.Assembler.ReceiptsModelAssembler;
import com.kwabena.posdataapi.model.Product;
import com.kwabena.posdataapi.model.Receipts;
import com.kwabena.posdataapi.repository.ReceiptsRepository;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ReceiptsController {

    private final ReceiptsRepository repository;
    private final ReceiptsModelAssembler assembler;

    public ReceiptsController(ReceiptsRepository repository, ReceiptsModelAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @PostMapping("/receipts")
    public ResponseEntity<?> saveReceipt(@RequestBody Receipts receipts){
        EntityModel<Receipts> entityModel = assembler.toModel(repository.save(receipts));

        return ResponseEntity //
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
                .body(entityModel);
    }

    @GetMapping("/receipts")
    public List<EntityModel<Receipts>> getAllReceipts(){
        List<EntityModel<Receipts>> receipts = repository.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());
//        return CollectionModel.of(product, linkTo(methodOn(ProductController.class).getAllProducts()).withSelfRel());
        return receipts;
//     return repository.findAll();

    }
}
