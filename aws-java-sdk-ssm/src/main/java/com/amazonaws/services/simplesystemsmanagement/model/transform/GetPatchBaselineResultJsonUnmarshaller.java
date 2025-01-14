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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetPatchBaselineResult JSON Unmarshaller
 */
public class GetPatchBaselineResultJsonUnmarshaller implements Unmarshaller<GetPatchBaselineResult, JsonUnmarshallerContext> {

    public GetPatchBaselineResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetPatchBaselineResult getPatchBaselineResult = new GetPatchBaselineResult();

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
                if (context.testExpression("BaselineId", targetDepth)) {
                    context.nextToken();
                    getPatchBaselineResult.setBaselineId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getPatchBaselineResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GlobalFilters", targetDepth)) {
                    context.nextToken();
                    getPatchBaselineResult.setGlobalFilters(PatchFilterGroupJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ApprovalRules", targetDepth)) {
                    context.nextToken();
                    getPatchBaselineResult.setApprovalRules(PatchRuleGroupJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ApprovedPatches", targetDepth)) {
                    context.nextToken();
                    getPatchBaselineResult.setApprovedPatches(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("RejectedPatches", targetDepth)) {
                    context.nextToken();
                    getPatchBaselineResult.setRejectedPatches(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("PatchGroups", targetDepth)) {
                    context.nextToken();
                    getPatchBaselineResult.setPatchGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    getPatchBaselineResult.setCreatedDate(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("ModifiedDate", targetDepth)) {
                    context.nextToken();
                    getPatchBaselineResult.setModifiedDate(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getPatchBaselineResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getPatchBaselineResult;
    }

    private static GetPatchBaselineResultJsonUnmarshaller instance;

    public static GetPatchBaselineResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPatchBaselineResultJsonUnmarshaller();
        return instance;
    }
}
