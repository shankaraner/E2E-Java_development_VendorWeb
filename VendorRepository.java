package com.shankar.vendor;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shankar.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
