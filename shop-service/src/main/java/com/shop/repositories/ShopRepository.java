/**
 * Copyright @ of 101 Digital 2023
 */
package com.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.Shop;

/**
 * @author haitrand
 *
 */
public interface ShopRepository extends JpaRepository<Shop, Integer> {

}
