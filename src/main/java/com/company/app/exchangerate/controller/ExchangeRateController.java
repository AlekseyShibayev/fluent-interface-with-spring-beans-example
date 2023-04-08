package com.company.app.exchangerate.controller;

import com.company.app.exchangerate.ExchangeRateFacade;
import com.company.app.exchangerate.entity.ExchangeRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchangeRate")
public class ExchangeRateController {

	@Autowired
	ExchangeRateFacade exchangeRateFacade;

	/**
	 * пример запроса: http://localhost:8080/exchangeRate/get
	 */
	@GetMapping(value = "/get", produces = "application/json")
	public ResponseEntity<ExchangeRate> get() {
		return ResponseEntity.ok(exchangeRateFacade.extract());
	}
}