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

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribePoliciesResult StAX Unmarshaller
 */
public class DescribePoliciesResultStaxUnmarshaller implements Unmarshaller<DescribePoliciesResult, StaxUnmarshallerContext> {

    public DescribePoliciesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribePoliciesResult describePoliciesResult = new DescribePoliciesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describePoliciesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ScalingPolicies", targetDepth)) {
                    describePoliciesResult.withScalingPolicies(new ArrayList<ScalingPolicy>());
                    continue;
                }

                if (context.testExpression("ScalingPolicies/member", targetDepth)) {
                    describePoliciesResult.withScalingPolicies(ScalingPolicyStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextToken", targetDepth)) {
                    describePoliciesResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describePoliciesResult;
                }
            }
        }
    }

    private static DescribePoliciesResultStaxUnmarshaller instance;

    public static DescribePoliciesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePoliciesResultStaxUnmarshaller();
        return instance;
    }
}
