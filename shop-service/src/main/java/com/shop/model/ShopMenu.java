/**
 * Copyright @ of 101 Digital 2023
 */
package com.shop.model;

import java.time.LocalDateTime;

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
@Entity(name = "shop_menu")
public class ShopMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String description;

	@ManyToOne
	@JoinColumn(name = "shopId")
	private Shop shop;

	private String categoryId;

	private int position;

	private LocalDateTime modifiedAt;

	private LocalDateTime createdAt;

}
