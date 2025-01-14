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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * SslPolicy StAX Unmarshaller
 */
public class SslPolicyStaxUnmarshaller implements Unmarshaller<SslPolicy, StaxUnmarshallerContext> {

    public SslPolicy unmarshall(StaxUnmarshallerContext context) throws Exception {
        SslPolicy sslPolicy = new SslPolicy();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return sslPolicy;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("SslProtocols", targetDepth)) {
                    sslPolicy.withSslProtocols(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SslProtocols/member", targetDepth)) {
                    sslPolicy.withSslProtocols(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Ciphers", targetDepth)) {
                    sslPolicy.withCiphers(new ArrayList<Cipher>());
                    continue;
                }

                if (context.testExpression("Ciphers/member", targetDepth)) {
                    sslPolicy.withCiphers(CipherStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Name", targetDepth)) {
                    sslPolicy.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return sslPolicy;
                }
            }
        }
    }

    private static SslPolicyStaxUnmarshaller instance;

    public static SslPolicyStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SslPolicyStaxUnmarshaller();
        return instance;
    }
}
