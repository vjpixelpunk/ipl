package com.example.iplstats.dao;

import com.example.iplstats.domain.AppCurrency;

import java.util.List;

public interface AppCurrencyDao {

    AppCurrency insertCurrency(AppCurrency appCurrency);
    List<AppCurrency> selectAppCurrencies();
    AppCurrency updateAppCurrency(AppCurrency appCurrency);
    AppCurrency selectAppCurrencies(String code);
    AppCurrency deleteAppCurrency(String code);
}
