package com.mijnproject.flyerautomation.service;

public class BudgetVerzendService extends VerzendService {
    @Override
    public double berekenKosten(int gewichtInGram) {
        return 0.03 * gewichtInGram;
    }

    @Override
    public String getNaam() {
        return "BudgetExpress";
    }
}
