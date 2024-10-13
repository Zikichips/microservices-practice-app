package com.zikichips.microservices.currency_exchange_service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencyExchangeService {
    private final CurrencyExchangeRepository repository;

    public CurrencyExchange findByFromAndTo(String from, String to) {
        return repository.findByFromAndTo(from,to);
    }
}
