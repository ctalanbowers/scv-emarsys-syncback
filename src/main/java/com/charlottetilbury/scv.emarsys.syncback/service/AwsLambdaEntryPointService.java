package com.charlottetilbury.scv.emarsys.syncback.service;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.charlottetilbury.scv.emarsys.syncback.DaggerInjector;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@Getter
@Setter
public class AwsLambdaEntryPointService implements RequestHandler<String, Void> {

    private static final Logger LOG = LoggerFactory.getLogger(AwsLambdaEntryPointService.class);

    @Inject
    AwsLambdaHelloWorldService awsLambdaHelloWorldService;

    @Override
    public Void handleRequest(String input, Context context) {

        DaggerInjector.builder().build().inject(this);

        LOG.info(awsLambdaHelloWorldService.helloWorld(input));

        return null;
    }

}
