/**
 * Copyright @ of 101 Digital 2023
 */
package com.shop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.api.AirTravelClearancesApiDelegate;
import com.shop.pojo.AirTravelClearanceResponses;

/**
 * @author haitrand
 *
 */
@RestController
@RequestMapping("/airTravelClearances")
public class AirTravelClearancesController implements AirTravelClearancesApiDelegate {
	@Override
	public ResponseEntity<AirTravelClearanceResponses> airTravelClearancesGet(String authorization, String xApiKey,
			Boolean shared, String sharingUid) {
		// TODO Auto-generated method stub
		return AirTravelClearancesApiDelegate.super.airTravelClearancesGet(authorization, xApiKey, shared, sharingUid);
	}
}
