package com.gaurav.project.airBnbApp.strategy;

import com.gaurav.project.airBnbApp.entity.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
