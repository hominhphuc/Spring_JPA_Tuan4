package com.jmaster.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jmaster.entity.ChuyenBay;
import com.jmaster.entity.MayBay;

public interface MayBayRepo  extends JpaRepository<MayBay, Integer>  {
	
	@Query("Select m  from  MayBay m  where m.tamBay > 10000")
	List<MayBay> orderTamBay();
}
