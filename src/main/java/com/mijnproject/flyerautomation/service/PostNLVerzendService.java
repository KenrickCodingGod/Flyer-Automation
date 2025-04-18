package com.mijnproject.flyerautomation.service;

public class PostNLVerzendService extends VerzendService {
    @Override
    public double berekenKosten(int gewichtInGram) {
        return 0.05 * gewichtInGram;
    }

    @Override
    public String getNaam() {
        return "PostNL";
    }
}
