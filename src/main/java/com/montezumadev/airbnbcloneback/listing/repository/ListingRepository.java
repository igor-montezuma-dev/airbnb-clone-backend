package com.montezumadev.airbnbcloneback.listing.repository;

import com.montezumadev.airbnbcloneback.listing.domain.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing, Long> {
}
