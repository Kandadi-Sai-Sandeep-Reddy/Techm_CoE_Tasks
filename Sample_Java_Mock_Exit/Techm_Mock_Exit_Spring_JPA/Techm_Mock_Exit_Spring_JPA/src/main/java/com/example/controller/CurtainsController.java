package com.example.controller;


import com.example.model.*;
import com.example.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/curtains")
public class CurtainsController {

	@Autowired
	 private CurtainsRepository curtainrepo;

	 @GetMapping("/byPrice")
	 public List<Curtains> getCurtainsByPrice(@RequestParam int price) {
	     return curtainrepo.getIdByPrice(price);
	 }

	 @GetMapping("/byBrand")
	 public List<Curtains> getCurtainsByBrand(@RequestParam String brand) {
	     return curtainrepo.getIdByBrand(brand);
	 }
}


