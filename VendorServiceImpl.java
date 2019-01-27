package com.shankar.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shankar.vendor.VendorRepository;
import com.shankar.vendor.entities.Vendor;

@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorRepository vendorRepository;

	@Override
	public Vendor saveVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return vendorRepository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return vendorRepository.save(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		 vendorRepository.delete(vendor); ;
	}

	@Override
	public Vendor getVendorbyId(int id) {
		// TODO Auto-generated method stub
		return vendorRepository.findById(id).get();
	}

	@Override
	public List<Vendor> getAllVendor() {
		// TODO Auto-generated method stub
		return vendorRepository.findAll();
	}

	public VendorRepository getVendorRepository() {
		return vendorRepository;
	}

	public void setVendorRepository(VendorRepository vendorRepository) {
		this.vendorRepository = vendorRepository;
	}
	
	

}
