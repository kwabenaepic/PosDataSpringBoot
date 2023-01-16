package com.kwabena.posdataapi.Assembler;

import com.kwabena.posdataapi.controller.ReorderViewController;
import com.kwabena.posdataapi.controller.SalereportViewController;
import com.kwabena.posdataapi.model.ReorderView;
import com.kwabena.posdataapi.model.SalesReportView;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class SalereportViewModelAssembler implements RepresentationModelAssembler<SalesReportView, EntityModel<SalesReportView>> {


    @Override
    public EntityModel<SalesReportView> toModel(SalesReportView entity) {
        return EntityModel.of(entity, //
//                linkTo(methodOn(ReorderViewController.class).getAllProducts(reorderView.getId())).withSelfRel(),
                linkTo(methodOn(SalereportViewController.class).getAllSales()).withRel("salesReportView"));

    }
}
