/**
 * Copyright @ of 101 Digital 2023
 */
package com.shop.constant;

import lombok.Getter;

/**
 * @author haitrand
 *
 */
@Getter
public enum Season {
	SPRING("Spring"), SUMMER("Summer"), AUTUMN("Autumn"), WINTER("Winter");

	private String value;

	/**
	 * 
	 * @param value
	 */
	private Season(String value) {
		this.value = value;
	}
}
