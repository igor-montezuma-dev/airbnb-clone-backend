package com.montezumadev.airbnbcloneback.user.application.dto;

import java.util.Set;
import java.util.UUID;

public record ReadUserDTO(
        UUID publicID,
        String firstName,
        String lastName,
        String email,
        String imageUrl,
        Set<String> authorities
) {
}
