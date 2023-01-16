package com.kwabena.posdataapi.Assembler;

import com.kwabena.posdataapi.controller.ReorderViewController;
import com.kwabena.posdataapi.model.ReorderView;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
@Component
public class ReorderViewModelAssembler implements RepresentationModelAssembler<ReorderView, EntityModel<ReorderView>> {
    @Override
    public EntityModel<ReorderView> toModel(ReorderView reorderView) {
        return EntityModel.of(reorderView, //
//                linkTo(methodOn(ReorderViewController.class).getAllProducts(reorderView.getId())).withSelfRel(),
                linkTo(methodOn(ReorderViewController.class).getAllProducts()).withRel("reorderView"));
    }

}
