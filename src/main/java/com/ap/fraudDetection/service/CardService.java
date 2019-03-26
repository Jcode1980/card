package com.ap.fraudDetection.service;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Set;

public interface CardService {
    public Set<String> verifyTransactions(InputStream is, BigDecimal priceThreshold);
}
