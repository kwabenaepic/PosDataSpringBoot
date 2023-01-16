package com.kwabena.posdataapi.Assembler;

import com.kwabena.posdataapi.controller.ProductByTicketNumberViewController;
import com.kwabena.posdataapi.controller.SalereportViewController;
import com.kwabena.posdataapi.model.Product;
import com.kwabena.posdataapi.model.ProductByTicketNumberView;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class ProductByTicketNumberViewModelAssembler implements RepresentationModelAssembler<ProductByTicketNumberView, EntityModel<ProductByTicketNumberView>> {
    @Override
    public EntityModel<ProductByTicketNumberView> toModel(ProductByTicketNumberView entity) {
        return EntityModel.of(entity, //
//                linkTo(methodOn(ReorderViewController.class).getAllProducts(reorderView.getId())).withSelfRel(),
                linkTo(methodOn(ProductByTicketNumberViewController.class).getAllSaleItems()).withRel("productByTicketNumberView"));

    }
}
