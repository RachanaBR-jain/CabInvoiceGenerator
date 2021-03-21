package com.bridgelabs;

import com.bridgelab.CabInvoiceGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTesting {

    CabInvoiceGenerator invoice =null;

    @BeforeEach
    public void initialize_object() {
        invoice = new CabInvoiceGenerator();
    }

    @Test
    public void given_distance_Generate_total_fare() {
        double distance = 5.0;
        int time = 20;
        double fare = invoice.calculateNormalFare(distance, time);
        System.out.println(fare);
        Assertions.assertEquals(70, fare, 0.0);
    }

    @Test
    public void given_smalldistance_shouldfail_minimumfare() {
        double distance = 0.2;
        int time = 2;
        double fare = invoice.calculateNormalFare(distance, time);
        System.out.println(fare);
        Assertions.assertEquals(5, fare, 0.0);
    }
}
