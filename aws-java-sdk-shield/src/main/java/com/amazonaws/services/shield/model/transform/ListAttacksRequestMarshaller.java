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
package com.amazonaws.services.shield.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.shield.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ListAttacksRequest Marshaller
 */
public class ListAttacksRequestMarshaller implements Marshaller<Request<ListAttacksRequest>, ListAttacksRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListAttacksRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListAttacksRequest> marshall(ListAttacksRequest listAttacksRequest) {

        if (listAttacksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListAttacksRequest> request = new DefaultRequest<ListAttacksRequest>(listAttacksRequest, "AWSShield");
        request.addHeader("X-Amz-Target", "AWSShield_20160616.ListAttacks");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            java.util.List<String> resourceArnsList = listAttacksRequest.getResourceArns();
            if (resourceArnsList != null) {
                jsonGenerator.writeFieldName("ResourceArns");
                jsonGenerator.writeStartArray();
                for (String resourceArnsListValue : resourceArnsList) {
                    if (resourceArnsListValue != null) {
                        jsonGenerator.writeValue(resourceArnsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (listAttacksRequest.getStartTime() != null) {
                jsonGenerator.writeFieldName("StartTime");
                TimeRangeJsonMarshaller.getInstance().marshall(listAttacksRequest.getStartTime(), jsonGenerator);
            }
            if (listAttacksRequest.getEndTime() != null) {
                jsonGenerator.writeFieldName("EndTime");
                TimeRangeJsonMarshaller.getInstance().marshall(listAttacksRequest.getEndTime(), jsonGenerator);
            }
            if (listAttacksRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(listAttacksRequest.getNextToken());
            }
            if (listAttacksRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("MaxResults").writeValue(listAttacksRequest.getMaxResults());
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
