package com.example.iplstats.service;

import com.example.iplstats.domain.AppCurrency;

import java.util.List;

public interface AppCurrencyService {

    AppCurrency addCurrency(AppCurrency appCurrency);
    List<AppCurrency> getAppCurrencies();
    AppCurrency updateAppCurrency(AppCurrency appCurrency);
    AppCurrency getAppCurrencies(String code);
    AppCurrency deleteCurrency(String code);
}
