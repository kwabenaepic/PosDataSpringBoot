package com.kwabena.posdataapi.Assembler;

import com.kwabena.posdataapi.controller.ProductController;
import com.kwabena.posdataapi.controller.ReceiptsController;
import com.kwabena.posdataapi.model.Receipts;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class ReceiptsModelAssembler implements RepresentationModelAssembler<Receipts, EntityModel<Receipts>> {
    @Override
    public EntityModel<Receipts> toModel(Receipts receipts) {
        return EntityModel.of(receipts, //
//                linkTo(methodOn(ProductController.class).getProductById(receipts.getId())).withSelfRel(),
                linkTo(methodOn(ReceiptsController.class).getAllReceipts()).withRel("receipts"));
    }
}
