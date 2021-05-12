package com.fetchrewards.points.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fetchrewards.points.dto.request.AddPoints;
import com.fetchrewards.points.dto.request.SpendPoints;
import com.fetchrewards.points.dto.response.PointBalances;
import com.fetchrewards.points.dto.response.PointsSpent;
import com.fetchrewards.points.service.PointsService;

@RestController
@RequestMapping("/payer/points")
public class PointsController{

	@Autowired
	private PointsService pointsService;
	
	@PostMapping(value = "/add",consumes = "application/json")
	public ResponseEntity addPoints(@RequestBody AddPoints addPointsReqBody) {
		pointsService.addPoints(addPointsReqBody);
		//TODO - catch any bubbled up errors from service and throw 400 error with appropriate message
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PostMapping(value = "/spend",consumes = "application/json")
	public ResponseEntity<List<PointsSpent>> spendPoints(@RequestBody SpendPoints spendPoints) {
		//TODO
		return new ResponseEntity<List<PointsSpent>>(new ArrayList(),HttpStatus.OK);
	}
	
	@GetMapping("/balances")
	public ResponseEntity<PointBalances> getBalancePoints() {
		//TODO
		return new ResponseEntity<PointBalances>(new PointBalances(),HttpStatus.OK);
	}
	
	
}
