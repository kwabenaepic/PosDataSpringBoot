package com.kwabena.posdataapi.Assembler;

import com.kwabena.posdataapi.controller.ReceiptsController;
import com.kwabena.posdataapi.controller.SaleItemController;
import com.kwabena.posdataapi.model.Product;
import com.kwabena.posdataapi.model.Receipts;
import com.kwabena.posdataapi.model.SaleItem;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class SaleitemModelAssembler implements RepresentationModelAssembler<SaleItem, EntityModel<SaleItem>> {
    @Override
    public EntityModel<SaleItem> toModel(SaleItem receipts) {
        return EntityModel.of(receipts, //
//                linkTo(methodOn(ProductController.class).getProductById(receipts.getId())).withSelfRel(),
                linkTo(methodOn(SaleItemController.class).getAllSaleitems()).withRel("saleitem"));
    }


}
