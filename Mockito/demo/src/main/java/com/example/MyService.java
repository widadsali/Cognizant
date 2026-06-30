package com.example;

public class MyService {
    private ExternalApi api;

    // Constructor
    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}