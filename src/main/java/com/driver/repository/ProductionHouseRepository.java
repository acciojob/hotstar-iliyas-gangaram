package com.driver.repository;

import com.driver.model.ProductionHouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionHouseRepository extends JpaRepository<ProductionHouse,Integer> {

          public ProductionHouse findByame(String name);

}
