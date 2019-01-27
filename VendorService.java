package com.shankar.vendor.service;

import java.util.List;

import com.shankar.vendor.entities.Vendor;

public interface VendorService {

	Vendor saveVendor(Vendor vendor);

	Vendor updateVendor(Vendor vendor);

	void deleteVendor(Vendor vendor);

	Vendor getVendorbyId(int id);

	List<Vendor> getAllVendor();

}
