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
package com.amazonaws.services.stepfunctions.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.stepfunctions.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StateExitedEventDetails JSON Unmarshaller
 */
public class StateExitedEventDetailsJsonUnmarshaller implements Unmarshaller<StateExitedEventDetails, JsonUnmarshallerContext> {

    public StateExitedEventDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        StateExitedEventDetails stateExitedEventDetails = new StateExitedEventDetails();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    stateExitedEventDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("output", targetDepth)) {
                    context.nextToken();
                    stateExitedEventDetails.setOutput(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return stateExitedEventDetails;
    }

    private static StateExitedEventDetailsJsonUnmarshaller instance;

    public static StateExitedEventDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StateExitedEventDetailsJsonUnmarshaller();
        return instance;
    }
}
