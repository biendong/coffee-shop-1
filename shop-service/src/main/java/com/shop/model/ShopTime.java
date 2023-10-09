/**
 * Copyright @ of 101 Digital 2023
 */
package com.shop.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

/**
 * @author haitrand
 *
 */
@Data
@Entity(name = "shop_time")
public class ShopTime {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "shopId")
	private Shop shop;

	private String season;

	private LocalTime openAt;

	private LocalTime closeAt;

	private LocalDateTime modifiedAt;

	private LocalDateTime createdAt;
}
