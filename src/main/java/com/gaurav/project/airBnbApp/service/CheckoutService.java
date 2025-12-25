package com.gaurav.project.airBnbApp.service;

import com.gaurav.project.airBnbApp.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);
}
