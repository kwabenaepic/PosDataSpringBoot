package com.kwabena.posdataapi.Assembler;

import com.kwabena.posdataapi.model.Product;
import com.kwabena.posdataapi.model.User;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class UserModelAssembler implements RepresentationModelAssembler<User, EntityModel<User>> {
    @Override
    public EntityModel<User> toModel(User entity) {
        return null;
    }
}
