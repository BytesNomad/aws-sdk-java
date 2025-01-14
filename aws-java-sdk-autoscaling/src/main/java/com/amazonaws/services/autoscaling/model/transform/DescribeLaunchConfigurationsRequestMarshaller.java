/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeLaunchConfigurationsRequest Marshaller
 */

public class DescribeLaunchConfigurationsRequestMarshaller implements
        Marshaller<Request<DescribeLaunchConfigurationsRequest>, DescribeLaunchConfigurationsRequest> {

    public Request<DescribeLaunchConfigurationsRequest> marshall(DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest) {

        if (describeLaunchConfigurationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLaunchConfigurationsRequest> request = new DefaultRequest<DescribeLaunchConfigurationsRequest>(describeLaunchConfigurationsRequest,
                "AmazonAutoScaling");
        request.addParameter("Action", "DescribeLaunchConfigurations");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> launchConfigurationNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeLaunchConfigurationsRequest
                .getLaunchConfigurationNames();
        if (!launchConfigurationNamesList.isEmpty() || !launchConfigurationNamesList.isAutoConstruct()) {
            int launchConfigurationNamesListIndex = 1;

            for (String launchConfigurationNamesListValue : launchConfigurationNamesList) {
                if (launchConfigurationNamesListValue != null) {
                    request.addParameter("LaunchConfigurationNames.member." + launchConfigurationNamesListIndex,
                            StringUtils.fromString(launchConfigurationNamesListValue));
                }
                launchConfigurationNamesListIndex++;
            }
        }

        if (describeLaunchConfigurationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeLaunchConfigurationsRequest.getNextToken()));
        }

        if (describeLaunchConfigurationsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeLaunchConfigurationsRequest.getMaxRecords()));
        }

        return request;
    }

}
