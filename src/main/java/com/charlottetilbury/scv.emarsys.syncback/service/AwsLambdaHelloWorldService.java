package com.charlottetilbury.scv.emarsys.syncback.service;

import javax.inject.Inject;

public class AwsLambdaHelloWorldService {

    @Inject
    public AwsLambdaHelloWorldService() {}

    public String helloWorld(String name) {

        return "Hello " + name;
    }
}
