package com.kwabena.posdataapi.Assembler;

import com.kwabena.posdataapi.controller.TopTenSellingViewController;
import com.kwabena.posdataapi.model.TopTenSellingView;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class TopTenSellingViewModelAssembler implements RepresentationModelAssembler<TopTenSellingView, EntityModel<TopTenSellingView>> {
    @Override
    public EntityModel<TopTenSellingView> toModel(TopTenSellingView topTenSellingView) {
        return EntityModel.of(topTenSellingView, //
//                linkTo(methodOn(ReorderViewController.class).getAllProducts(reorderView.getId())).withSelfRel(),
                linkTo(methodOn(TopTenSellingViewController.class).getAllProducts()).withRel("topTenSellingView"));
    }
}
