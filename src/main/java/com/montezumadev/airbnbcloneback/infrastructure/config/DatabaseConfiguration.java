package com.montezumadev.airbnbcloneback.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = {
        "com.montezumadev.airbnbcloneback.user.repository",
        "com.montezumadev.airbnbcloneback.listing.repository",
        "com.montezumadev.airbnbcloneback.booking.repository",
}
)
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {
}