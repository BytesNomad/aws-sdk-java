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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EndpointBatchItem JSON Unmarshaller
 */
public class EndpointBatchItemJsonUnmarshaller implements Unmarshaller<EndpointBatchItem, JsonUnmarshallerContext> {

    public EndpointBatchItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        EndpointBatchItem endpointBatchItem = new EndpointBatchItem();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Address", targetDepth)) {
                    context.nextToken();
                    endpointBatchItem.setAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    context.nextToken();
                    endpointBatchItem.setAttributes(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("ChannelType", targetDepth)) {
                    context.nextToken();
                    endpointBatchItem.setChannelType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Demographic", targetDepth)) {
                    context.nextToken();
                    endpointBatchItem.setDemographic(EndpointDemographicJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EffectiveDate", targetDepth)) {
                    context.nextToken();
                    endpointBatchItem.setEffectiveDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointStatus", targetDepth)) {
                    context.nextToken();
                    endpointBatchItem.setEndpointStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    endpointBatchItem.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Location", targetDepth)) {
                    context.nextToken();
                    endpointBatchItem.setLocation(EndpointLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Metrics", targetDepth)) {
                    context.nextToken();
                    endpointBatchItem.setMetrics(new MapUnmarshaller<String, Double>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Double.class)).unmarshall(context));
                }
                if (context.testExpression("OptOut", targetDepth)) {
                    context.nextToken();
                    endpointBatchItem.setOptOut(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    endpointBatchItem.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("User", targetDepth)) {
                    context.nextToken();
                    endpointBatchItem.setUser(EndpointUserJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return endpointBatchItem;
    }

    private static EndpointBatchItemJsonUnmarshaller instance;

    public static EndpointBatchItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointBatchItemJsonUnmarshaller();
        return instance;
    }
}
