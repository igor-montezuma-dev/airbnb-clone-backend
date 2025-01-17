package com.montezumadev.airbnbcloneback.listing.repository;

import com.montezumadev.airbnbcloneback.listing.domain.ListingPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long> {
}
