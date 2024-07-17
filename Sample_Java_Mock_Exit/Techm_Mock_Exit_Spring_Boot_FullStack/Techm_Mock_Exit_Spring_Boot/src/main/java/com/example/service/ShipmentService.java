package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Shipment;
import com.example.repo.ShipmentRepository;

@Service
public class ShipmentService {
	
	@Autowired
	private ShipmentRepository shiprepo;
	
	public Optional<Shipment> getShipmentByTrackNo(String trackNo){
		return shiprepo.findShipmentByTrackNo(trackNo);
	}
	
	public boolean deleteShipmentById(int shipId) {
		Optional<Shipment> shipment=shiprepo.findById(shipId);
		if(shipment.isPresent()) {
			shiprepo.deleteById(shipId);
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
