package com.kwabena.posdataapi;

import com.kwabena.posdataapi.model.Product;
import com.kwabena.posdataapi.model.ReorderView;
import com.kwabena.posdataapi.repository.ProductRepository;
import com.kwabena.posdataapi.repository.ReorderViewRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
//@EnableSwagger2
public class PosDataApiApplication implements CommandLineRunner {
//    private final String URI_PRODUCTS = "/products";
//    private final String URI_USERS_ID = "/users/{id}";

    private final ProductRepository productRepository;
    private final ReorderViewRepository reorderViewRepository;
    private static final Logger log = LoggerFactory.getLogger(PosDataApiApplication.class);

    public PosDataApiApplication(ProductRepository productRepository, ReorderViewRepository reorderViewRepository) {
        this.productRepository = productRepository;
        this.reorderViewRepository = reorderViewRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(PosDataApiApplication.class, args);


    }


    @Override
    public void run(String... args) throws Exception {

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
