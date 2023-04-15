package com.myApi.oraclecloud.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myApi.oraclecloud.Model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudApiService {

	ArrayList<CloudVendor> cvlist=new ArrayList<>();
	
	@GetMapping
	public CloudVendor getCloudVendorDetails(@RequestBody String VendorId) {
		int j=0;
		System.out.println(VendorId);
		for(int i=0;i<cvlist.size();i++) {
			if(VendorId.equalsIgnoreCase(cvlist.get(i).getVendorId())) {
				j=i;
			}
		}
		return cvlist.get(j);
	}
	
	@PostMapping
	public String creatCloudVendorDetails(@RequestBody CloudVendor cloudv) {
		
		this.cvlist.add(cloudv);
		return "Cloud Vendor created successfully";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudv) {
		
		this.cvlist.add(cloudv);
		
		return "Cloud Vendor created successfully";
	}
}
