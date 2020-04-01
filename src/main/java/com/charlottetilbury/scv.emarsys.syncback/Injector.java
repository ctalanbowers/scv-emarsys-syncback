package com.charlottetilbury.scv.emarsys.syncback;

import com.charlottetilbury.scv.emarsys.syncback.service.AwsLambdaEntryPointService;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component
public interface Injector {

    void inject(AwsLambdaEntryPointService awsLambdaEntryPointService);
}
