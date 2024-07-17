package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Curtains;

@Repository
public interface CurtainsRepository extends CrudRepository<Curtains, Long>  {
	
	
	@Query("SELECT c FROM Curtains c WHERE c.price > :price")
    List<Curtains> getIdByPrice(int price);

    @Query("SELECT c FROM Curtains c WHERE c.brand = :brand")
    List<Curtains> getIdByBrand(String brand);

}
