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
package com.amazonaws.services.rds.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeDBEngineVersionsResult StAX Unmarshaller
 */
public class DescribeDBEngineVersionsResultStaxUnmarshaller implements Unmarshaller<DescribeDBEngineVersionsResult, StaxUnmarshallerContext> {

    public DescribeDBEngineVersionsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeDBEngineVersionsResult describeDBEngineVersionsResult = new DescribeDBEngineVersionsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeDBEngineVersionsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Marker", targetDepth)) {
                    describeDBEngineVersionsResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBEngineVersions", targetDepth)) {
                    describeDBEngineVersionsResult.withDBEngineVersions(new ArrayList<DBEngineVersion>());
                    continue;
                }

                if (context.testExpression("DBEngineVersions/DBEngineVersion", targetDepth)) {
                    describeDBEngineVersionsResult.withDBEngineVersions(DBEngineVersionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeDBEngineVersionsResult;
                }
            }
        }
    }

    private static DescribeDBEngineVersionsResultStaxUnmarshaller instance;

    public static DescribeDBEngineVersionsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDBEngineVersionsResultStaxUnmarshaller();
        return instance;
    }
}
