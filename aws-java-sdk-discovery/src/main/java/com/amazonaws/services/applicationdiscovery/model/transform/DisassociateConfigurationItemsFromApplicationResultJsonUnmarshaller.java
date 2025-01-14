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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DisassociateConfigurationItemsFromApplicationResult JSON Unmarshaller
 */
public class DisassociateConfigurationItemsFromApplicationResultJsonUnmarshaller implements
        Unmarshaller<DisassociateConfigurationItemsFromApplicationResult, JsonUnmarshallerContext> {

    public DisassociateConfigurationItemsFromApplicationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DisassociateConfigurationItemsFromApplicationResult disassociateConfigurationItemsFromApplicationResult = new DisassociateConfigurationItemsFromApplicationResult();

        return disassociateConfigurationItemsFromApplicationResult;
    }

    private static DisassociateConfigurationItemsFromApplicationResultJsonUnmarshaller instance;

    public static DisassociateConfigurationItemsFromApplicationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisassociateConfigurationItemsFromApplicationResultJsonUnmarshaller();
        return instance;
    }
}
