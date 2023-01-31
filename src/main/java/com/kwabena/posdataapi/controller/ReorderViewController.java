package com.kwabena.posdataapi.controller;

import com.kwabena.posdataapi.Assembler.ReorderViewModelAssembler;
import com.kwabena.posdataapi.model.ReorderView;
import com.kwabena.posdataapi.repository.ReorderViewRepository;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@CrossOrigin(value = "http://localhost:3000")
@RestController
//@RequestMapping("/api/v1/")
public class ReorderViewController {

    private final ReorderViewRepository repository;
    private final ReorderViewModelAssembler assembler;

    public ReorderViewController(ReorderViewRepository repository, ReorderViewModelAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @GetMapping("/reorderlist")
    public List<EntityModel<ReorderView>> getAllProducts(){
//        List<EntityModel<Product>> product = repository.findAll(Sort.by(Sort.Direction.DESC,("name"))).stream()
        List<EntityModel<ReorderView>> reorderView = repository.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());

//        return CollectionModel.of(reorderView, linkTo(methodOn(ReorderViewController.class).getAllProducts()).withSelfRel());
        return reorderView;
    }
}
