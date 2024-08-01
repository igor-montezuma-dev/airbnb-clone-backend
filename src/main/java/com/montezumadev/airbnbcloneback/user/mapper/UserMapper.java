package com.montezumadev.airbnbcloneback.user.mapper;

import com.montezumadev.airbnbcloneback.user.application.dto.ReadUserDTO;
import com.montezumadev.airbnbcloneback.user.domain.Authority;
import com.montezumadev.airbnbcloneback.user.domain.User;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }
}
