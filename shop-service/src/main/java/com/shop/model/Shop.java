/**
 * Copyright @ of 101 Digital 2023
 */
package com.shop.model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

/**
 * @author haitrand
 *
 */
@Data
@Entity
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String description;

	private String website;

	private String email;

	private String phoneNumber;

	private int addressId;

	private LocalTime openAt;

	private LocalTime closeAt;

	private LocalDateTime modifiedAt;

	private LocalDateTime createdAt;

	@OneToMany(mappedBy = "shop")
	private List<ShopMenu> menus;

	@OneToMany(mappedBy = "shop")
	private List<ShopTime> times;
}
