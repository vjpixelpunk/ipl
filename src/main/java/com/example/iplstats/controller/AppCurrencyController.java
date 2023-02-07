package com.example.iplstats.controller;

import com.example.iplstats.domain.AppCurrency;
import com.example.iplstats.service.AppCurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/currency")
@RequiredArgsConstructor
public class AppCurrencyController {

private final AppCurrencyService appCurrencyService;
@PostMapping
public ResponseEntity<AppCurrency> addAppCurrency(@RequestBody AppCurrency appCurrency){
    AppCurrency retAppCurrency = appCurrencyService.addCurrency(appCurrency);
    return ResponseEntity.ok(retAppCurrency);
}
}
