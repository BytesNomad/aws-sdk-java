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
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ListSSHPublicKeysResult StAX Unmarshaller
 */
public class ListSSHPublicKeysResultStaxUnmarshaller implements Unmarshaller<ListSSHPublicKeysResult, StaxUnmarshallerContext> {

    public ListSSHPublicKeysResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListSSHPublicKeysResult listSSHPublicKeysResult = new ListSSHPublicKeysResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listSSHPublicKeysResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("SSHPublicKeys", targetDepth)) {
                    listSSHPublicKeysResult.withSSHPublicKeys(new ArrayList<SSHPublicKeyMetadata>());
                    continue;
                }

                if (context.testExpression("SSHPublicKeys/member", targetDepth)) {
                    listSSHPublicKeysResult.withSSHPublicKeys(SSHPublicKeyMetadataStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsTruncated", targetDepth)) {
                    listSSHPublicKeysResult.setIsTruncated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    listSSHPublicKeysResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listSSHPublicKeysResult;
                }
            }
        }
    }

    private static ListSSHPublicKeysResultStaxUnmarshaller instance;

    public static ListSSHPublicKeysResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListSSHPublicKeysResultStaxUnmarshaller();
        return instance;
    }
}
