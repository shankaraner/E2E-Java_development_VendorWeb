package com.shankar.vendor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shankar.vendor.entities.Vendor;
import com.shankar.vendor.service.VendorService;

@Controller
public class VendorController {
	
	@Autowired
	private VendorService vendorService;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createVendor";
	}
	
	@RequestMapping("/saveVendor")
	public String saveVendor(@ModelAttribute("vendor")Vendor vendor , ModelMap modelMap) {
		Vendor vendor2 = vendorService.saveVendor(vendor);
		String msg= "Vendor data saved for id "+vendor2.getId();
		modelMap.addAttribute("msg", msg);
		return "createVendor";		
	}
	
	@RequestMapping("/displayVendor")
	public String displayVendor(ModelMap modelMap) {
		List<Vendor> allVendor = vendorService.getAllVendor();
		modelMap.addAttribute("vendor",allVendor);
		return "displayVendor";		
	}
	
	@RequestMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("id")int id,ModelMap modelMap) {		
		Vendor vendorbyId = vendorService.getVendorbyId(id);
		vendorService.deleteVendor(vendorbyId);
		List<Vendor> allVendor = vendorService.getAllVendor();
		modelMap.addAttribute("vendor", allVendor);		
		return "displayVendor";		
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id")int id,ModelMap modelMap) {
		Vendor vendorbyId = vendorService.getVendorbyId(id);
		modelMap.addAttribute("Vendor", vendorbyId);
		return "updateVendor";
		
	}
	
	@RequestMapping("/updateVendor")
	public String updateVendor(@ModelAttribute("vendor")Vendor vendor , ModelMap modelMap) {	
		vendorService.updateVendor(vendor);		
		List<Vendor> allVendor = vendorService.getAllVendor();
		modelMap.addAttribute("vendor", allVendor);		
		return "displayVendor";
		
		
	}

}
