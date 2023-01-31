package com.kwabena.posdataapi;

import com.kwabena.posdataapi.model.User;
import com.kwabena.posdataapi.repository.ProductRepository;
import com.kwabena.posdataapi.repository.ReorderViewRepository;
import com.kwabena.posdataapi.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
//@EnableSwagger2
public class PosDataApiApplication implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final ReorderViewRepository reorderViewRepository;

    private final UserRepository userRepository;
    private static final Logger log = LoggerFactory.getLogger(PosDataApiApplication.class);

    public PosDataApiApplication(ProductRepository productRepository, ReorderViewRepository reorderViewRepository, UserRepository userRepository) {
        this.productRepository = productRepository;
        this.reorderViewRepository = reorderViewRepository;
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(PosDataApiApplication.class, args);


    }


    @Override
    public void run(String... args) throws Exception {
        User b1 = new User( "$2a$12$2fAxR2i1/IoPsG4mooZoJuqUDS.2bSv9s4bzaK/OJk5vkrp28b8U.",  "user1", true, "products");
        User b2 = new User( "$2a$12$2fAxR2i1/IoPsG4mooZoJuqUDS.2bSv9s4bzaK/OJk5vkrp28b8U.",  "user2", true, "products:receipts");

        Set<User> users = new HashSet<>();
        users.add(b1);
        users.add(b2);

        userRepository.saveAll(users);
        // fetch all customers
//        log.info("Products found with findAll():");
//        log.info("-------------------------------");
//        for (ReorderView product : reorderViewRepository.findAll()) {
////            log.info(product.toString());
//        }
//        log.info("");
//
//        for (Product product: productRepository.findDescription("Diaper")
//             ) {
//            System.out.println(product.toString());
//        }
//        System.out.println(productRepository.findByDescription("Diaper"));
    }
}
