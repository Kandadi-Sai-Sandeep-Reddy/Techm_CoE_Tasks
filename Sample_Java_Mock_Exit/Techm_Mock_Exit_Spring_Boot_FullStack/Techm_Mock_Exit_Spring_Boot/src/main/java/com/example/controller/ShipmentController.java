package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Shipment;
import com.example.service.ShipmentService;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {
	
	@Autowired
	private ShipmentService shipmentService;
	
	@GetMapping("/{trackNo}")
    public ResponseEntity<Shipment> getShipmentByTrackNo(@PathVariable String trackNo) {
        Optional<Shipment> shipment = shipmentService.getShipmentByTrackNo(trackNo);
        return shipment.map(ResponseEntity::ok)
                       .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @DeleteMapping("/{shipId}")
    public ResponseEntity<String> deleteShipmentById(@PathVariable Integer shipId) {
        boolean isDeleted = shipmentService.deleteShipmentById(shipId);
        if (isDeleted) {
            return ResponseEntity.ok("The requested shipId-" + shipId + " got deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Shipment with shipId-" + shipId + " not found");
        }
    }
}
