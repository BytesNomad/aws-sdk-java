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
package com.amazonaws.services.simpleemail.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * IdentityDkimAttributes StAX Unmarshaller
 */
public class IdentityDkimAttributesStaxUnmarshaller implements Unmarshaller<IdentityDkimAttributes, StaxUnmarshallerContext> {

    public IdentityDkimAttributes unmarshall(StaxUnmarshallerContext context) throws Exception {
        IdentityDkimAttributes identityDkimAttributes = new IdentityDkimAttributes();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return identityDkimAttributes;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DkimEnabled", targetDepth)) {
                    identityDkimAttributes.setDkimEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DkimVerificationStatus", targetDepth)) {
                    identityDkimAttributes.setDkimVerificationStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DkimTokens", targetDepth)) {
                    identityDkimAttributes.withDkimTokens(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("DkimTokens/member", targetDepth)) {
                    identityDkimAttributes.withDkimTokens(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return identityDkimAttributes;
                }
            }
        }
    }

    private static IdentityDkimAttributesStaxUnmarshaller instance;

    public static IdentityDkimAttributesStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new IdentityDkimAttributesStaxUnmarshaller();
        return instance;
    }
}
