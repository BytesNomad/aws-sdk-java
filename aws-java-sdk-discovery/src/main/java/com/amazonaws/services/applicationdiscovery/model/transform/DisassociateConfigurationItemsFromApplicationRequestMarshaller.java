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

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DisassociateConfigurationItemsFromApplicationRequest Marshaller
 */
public class DisassociateConfigurationItemsFromApplicationRequestMarshaller implements
        Marshaller<Request<DisassociateConfigurationItemsFromApplicationRequest>, DisassociateConfigurationItemsFromApplicationRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DisassociateConfigurationItemsFromApplicationRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DisassociateConfigurationItemsFromApplicationRequest> marshall(
            DisassociateConfigurationItemsFromApplicationRequest disassociateConfigurationItemsFromApplicationRequest) {

        if (disassociateConfigurationItemsFromApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisassociateConfigurationItemsFromApplicationRequest> request = new DefaultRequest<DisassociateConfigurationItemsFromApplicationRequest>(
                disassociateConfigurationItemsFromApplicationRequest, "AWSApplicationDiscovery");
        request.addHeader("X-Amz-Target", "AWSPoseidonService_V2015_11_01.DisassociateConfigurationItemsFromApplication");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (disassociateConfigurationItemsFromApplicationRequest.getApplicationConfigurationId() != null) {
                jsonGenerator.writeFieldName("applicationConfigurationId").writeValue(
                        disassociateConfigurationItemsFromApplicationRequest.getApplicationConfigurationId());
            }

            java.util.List<String> configurationIdsList = disassociateConfigurationItemsFromApplicationRequest.getConfigurationIds();
            if (configurationIdsList != null) {
                jsonGenerator.writeFieldName("configurationIds");
                jsonGenerator.writeStartArray();
                for (String configurationIdsListValue : configurationIdsList) {
                    if (configurationIdsListValue != null) {
                        jsonGenerator.writeValue(configurationIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
