package com.jmaster.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmaster.entity.ChuyenBay;
import com.jmaster.repo.ChuyenBayRepo;

@RestController
@RequestMapping("/api")
public class ChuyenBayAPI {
	@Autowired
	private ChuyenBayRepo chuyenBayRepo;
	
	
	@GetMapping("/lines")
	public List<ChuyenBay> getbyDL() {
		return chuyenBayRepo.chuyenBays();
	}
	
	

}
