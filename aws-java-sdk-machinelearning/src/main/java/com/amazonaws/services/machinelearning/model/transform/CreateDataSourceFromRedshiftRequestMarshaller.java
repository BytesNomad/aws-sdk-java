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
package com.amazonaws.services.machinelearning.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateDataSourceFromRedshiftRequest Marshaller
 */
public class CreateDataSourceFromRedshiftRequestMarshaller implements
        Marshaller<Request<CreateDataSourceFromRedshiftRequest>, CreateDataSourceFromRedshiftRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CreateDataSourceFromRedshiftRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateDataSourceFromRedshiftRequest> marshall(CreateDataSourceFromRedshiftRequest createDataSourceFromRedshiftRequest) {

        if (createDataSourceFromRedshiftRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDataSourceFromRedshiftRequest> request = new DefaultRequest<CreateDataSourceFromRedshiftRequest>(createDataSourceFromRedshiftRequest,
                "AmazonMachineLearning");
        request.addHeader("X-Amz-Target", "AmazonML_20141212.CreateDataSourceFromRedshift");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createDataSourceFromRedshiftRequest.getDataSourceId() != null) {
                jsonGenerator.writeFieldName("DataSourceId").writeValue(createDataSourceFromRedshiftRequest.getDataSourceId());
            }
            if (createDataSourceFromRedshiftRequest.getDataSourceName() != null) {
                jsonGenerator.writeFieldName("DataSourceName").writeValue(createDataSourceFromRedshiftRequest.getDataSourceName());
            }
            if (createDataSourceFromRedshiftRequest.getDataSpec() != null) {
                jsonGenerator.writeFieldName("DataSpec");
                RedshiftDataSpecJsonMarshaller.getInstance().marshall(createDataSourceFromRedshiftRequest.getDataSpec(), jsonGenerator);
            }
            if (createDataSourceFromRedshiftRequest.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(createDataSourceFromRedshiftRequest.getRoleARN());
            }
            if (createDataSourceFromRedshiftRequest.getComputeStatistics() != null) {
                jsonGenerator.writeFieldName("ComputeStatistics").writeValue(createDataSourceFromRedshiftRequest.getComputeStatistics());
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
