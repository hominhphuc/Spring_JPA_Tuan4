package com.jmaster.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmaster.entity.ChuyenBay;
import com.jmaster.entity.MayBay;
import com.jmaster.repo.ChuyenBayRepo;
import com.jmaster.repo.MayBayRepo;

@RestController
@RequestMapping("/api")
public class MayBayAPI {

	@Autowired
	private MayBayRepo mayBayRepo;
	
	
	@GetMapping("/planes")
	public List<MayBay> getbyDL() {
		return mayBayRepo.orderTamBay();
	}
	
	
}
