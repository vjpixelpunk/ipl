package com.example.iplstats.service;

import com.example.iplstats.dao.AppCurrencyDao;
import com.example.iplstats.domain.AppCurrency;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
@Service
@Slf4j
@RequiredArgsConstructor
public class AppCurrencyServiceImpl implements AppCurrencyService{
    private final AppCurrencyDao appCurrencyDao;

    @Override
    public AppCurrency addCurrency(AppCurrency appCurrency) {
        Assert.notNull(appCurrency,"App Currency object cant be null");
        Assert.notNull(appCurrency.getCode(),"Currency code cant be null");
        Assert.notNull(appCurrency.getName(),"Currency name cant be null");
        AppCurrency retAppCurrency = appCurrencyDao.insertCurrency(appCurrency);
        return retAppCurrency;
    }

    @Override
    public List<AppCurrency> getAppCurrencies() {
        return null;
    }

    @Override
    public AppCurrency updateAppCurrency(AppCurrency appCurrency) {
        return null;
    }

    @Override
    public AppCurrency getAppCurrencies(String code) {
        return null;
    }

    @Override
    public AppCurrency deleteCurrency(String code) {
        return null;
    }
}
