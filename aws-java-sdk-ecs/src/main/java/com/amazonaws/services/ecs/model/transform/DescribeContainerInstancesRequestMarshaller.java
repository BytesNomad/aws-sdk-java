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
package com.amazonaws.services.ecs.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DescribeContainerInstancesRequest Marshaller
 */
public class DescribeContainerInstancesRequestMarshaller implements Marshaller<Request<DescribeContainerInstancesRequest>, DescribeContainerInstancesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeContainerInstancesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeContainerInstancesRequest> marshall(DescribeContainerInstancesRequest describeContainerInstancesRequest) {

        if (describeContainerInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeContainerInstancesRequest> request = new DefaultRequest<DescribeContainerInstancesRequest>(describeContainerInstancesRequest,
                "AmazonECS");
        request.addHeader("X-Amz-Target", "AmazonEC2ContainerServiceV20141113.DescribeContainerInstances");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeContainerInstancesRequest.getCluster() != null) {
                jsonGenerator.writeFieldName("cluster").writeValue(describeContainerInstancesRequest.getCluster());
            }

            com.amazonaws.internal.SdkInternalList<String> containerInstancesList = (com.amazonaws.internal.SdkInternalList<String>) describeContainerInstancesRequest
                    .getContainerInstances();
            if (!containerInstancesList.isEmpty() || !containerInstancesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("containerInstances");
                jsonGenerator.writeStartArray();
                for (String containerInstancesListValue : containerInstancesList) {
                    if (containerInstancesListValue != null) {
                        jsonGenerator.writeValue(containerInstancesListValue);
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
