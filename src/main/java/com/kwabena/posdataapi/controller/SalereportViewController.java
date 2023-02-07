package com.kwabena.posdataapi.controller;



import com.kwabena.posdataapi.Assembler.SalereportViewModelAssembler;
import com.kwabena.posdataapi.model.SalesReportView;
import com.kwabena.posdataapi.repository.SalereportViewRepository;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

//@CrossOrigin(value = "http://localhost:3000")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
//@RequestMapping("/api/v1/")
public class SalereportViewController {

    private final SalereportViewModelAssembler assembler;
    private final SalereportViewRepository repository;


    public SalereportViewController(SalereportViewRepository repository, SalereportViewModelAssembler assembler) {
        this.assembler = assembler;
        this.repository = repository;
    }

    @GetMapping("/salereports")
    public List<EntityModel<SalesReportView>> getAllSales(){
//        List<EntityModel<Product>> product = repository.findAll(Sort.by(Sort.Direction.DESC,("name"))).stream()
        List<EntityModel<SalesReportView>> salereportView = repository.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());

//        return CollectionModel.of(reorderView, linkTo(methodOn(ReorderViewController.class).getAllProducts()).withSelfRel());
        return salereportView;
    }


}
