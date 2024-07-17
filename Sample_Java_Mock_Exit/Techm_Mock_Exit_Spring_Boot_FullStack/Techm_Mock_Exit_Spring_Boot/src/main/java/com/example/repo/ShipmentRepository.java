package com.example.repo;

//import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Shipment;

@Repository
public interface ShipmentRepository extends CrudRepository<Shipment, Integer> {
	
	Optional<Shipment> findShipmentByTrackNo(String trackNo);

}
