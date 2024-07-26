package com.montezumadev.airbnbcloneback.listing.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ListingPictureMapper.class})
public interface ListingPictureMapper {
}
