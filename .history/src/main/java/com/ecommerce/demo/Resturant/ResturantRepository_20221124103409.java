package com.ecommerce.demo.Resturant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ResturantRepository extends JpaRepository<Resturant, Integer> {

    @Query(value = "SELECT * FROM resturant WHERE res_id = ?1", nativeQuery = true)
    Resturant returnResturants(int id);
}
