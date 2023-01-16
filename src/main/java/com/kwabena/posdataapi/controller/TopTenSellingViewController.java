package com.kwabena.posdataapi.controller;





import com.kwabena.posdataapi.Assembler.TopTenSellingViewModelAssembler;
import com.kwabena.posdataapi.model.TopTenSellingView;
import com.kwabena.posdataapi.repository.TopTenSellingViewRepository;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class TopTenSellingViewController {

    private final TopTenSellingViewRepository repository;
    private final TopTenSellingViewModelAssembler assembler;

    public TopTenSellingViewController(TopTenSellingViewRepository repository, TopTenSellingViewModelAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @GetMapping("/toptenselling")
    public List<EntityModel<TopTenSellingView>> getAllProducts(){
//        List<EntityModel<Product>> product = repository.findAll(Sort.by(Sort.Direction.DESC,("name"))).stream()
        List<EntityModel<TopTenSellingView>> toptenselling = repository.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());

//        return CollectionModel.of(reorderView, linkTo(methodOn(ReorderViewController.class).getAllProducts()).withSelfRel());
        return toptenselling;
    }
}
