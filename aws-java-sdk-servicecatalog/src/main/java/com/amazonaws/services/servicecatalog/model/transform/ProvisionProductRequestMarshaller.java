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
package com.amazonaws.services.servicecatalog.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ProvisionProductRequest Marshaller
 */
public class ProvisionProductRequestMarshaller implements Marshaller<Request<ProvisionProductRequest>, ProvisionProductRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ProvisionProductRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ProvisionProductRequest> marshall(ProvisionProductRequest provisionProductRequest) {

        if (provisionProductRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ProvisionProductRequest> request = new DefaultRequest<ProvisionProductRequest>(provisionProductRequest, "AWSServiceCatalog");
        request.addHeader("X-Amz-Target", "AWS242ServiceCatalogService.ProvisionProduct");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (provisionProductRequest.getAcceptLanguage() != null) {
                jsonGenerator.writeFieldName("AcceptLanguage").writeValue(provisionProductRequest.getAcceptLanguage());
            }
            if (provisionProductRequest.getProductId() != null) {
                jsonGenerator.writeFieldName("ProductId").writeValue(provisionProductRequest.getProductId());
            }
            if (provisionProductRequest.getProvisioningArtifactId() != null) {
                jsonGenerator.writeFieldName("ProvisioningArtifactId").writeValue(provisionProductRequest.getProvisioningArtifactId());
            }
            if (provisionProductRequest.getPathId() != null) {
                jsonGenerator.writeFieldName("PathId").writeValue(provisionProductRequest.getPathId());
            }
            if (provisionProductRequest.getProvisionedProductName() != null) {
                jsonGenerator.writeFieldName("ProvisionedProductName").writeValue(provisionProductRequest.getProvisionedProductName());
            }

            java.util.List<ProvisioningParameter> provisioningParametersList = provisionProductRequest.getProvisioningParameters();
            if (provisioningParametersList != null) {
                jsonGenerator.writeFieldName("ProvisioningParameters");
                jsonGenerator.writeStartArray();
                for (ProvisioningParameter provisioningParametersListValue : provisioningParametersList) {
                    if (provisioningParametersListValue != null) {

                        ProvisioningParameterJsonMarshaller.getInstance().marshall(provisioningParametersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<Tag> tagsList = provisionProductRequest.getTags();
            if (tagsList != null) {
                jsonGenerator.writeFieldName("Tags");
                jsonGenerator.writeStartArray();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> notificationArnsList = provisionProductRequest.getNotificationArns();
            if (notificationArnsList != null) {
                jsonGenerator.writeFieldName("NotificationArns");
                jsonGenerator.writeStartArray();
                for (String notificationArnsListValue : notificationArnsList) {
                    if (notificationArnsListValue != null) {
                        jsonGenerator.writeValue(notificationArnsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            jsonGenerator.writeFieldName("ProvisionToken").writeValue(IdempotentUtils.resolveString(provisionProductRequest.getProvisionToken()));

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
