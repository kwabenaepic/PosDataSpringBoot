package com.kwabena.posdataapi.controller;

import com.kwabena.posdataapi.Assembler.UserModelAssembler;
import com.kwabena.posdataapi.model.Product;
import com.kwabena.posdataapi.model.User;
import com.kwabena.posdataapi.repository.UserRepository;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(value = "http://localhost:3000")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
//@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "Requestor-Type")
//@RequestMapping(value= "/api/v1/", produces="application/json")
public class UserController {

    private final UserRepository repository;
    private final UserModelAssembler assembler;

    public UserController(UserRepository repository, UserModelAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @PostMapping("/user")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        EntityModel<User> entityModel = assembler.toModel(repository.save(user));

        return ResponseEntity //
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
                .body(entityModel);
    }
}
