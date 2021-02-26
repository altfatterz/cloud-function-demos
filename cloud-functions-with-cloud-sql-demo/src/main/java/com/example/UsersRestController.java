package com.example;

import com.google.api.services.sqladmin.SQLAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@RestController
public class UsersRestController {

    private final JdbcTemplate jdbcTemplate;
    private final Logger logger = LoggerFactory.getLogger(UsersRestController.class);

    public UsersRestController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Bean
    public Supplier<List<String>> function() {
        return () -> {
            logger.info("handling /users request...");
            return jdbcTemplate.queryForList("SELECT * FROM users").stream()
                    .map(m -> m.values().toString())
                    .collect(Collectors.toList());
        };
    }


}