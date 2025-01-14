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
package com.amazonaws.services.datapipeline.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ValidatePipelineDefinitionRequest Marshaller
 */
public class ValidatePipelineDefinitionRequestMarshaller implements Marshaller<Request<ValidatePipelineDefinitionRequest>, ValidatePipelineDefinitionRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ValidatePipelineDefinitionRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ValidatePipelineDefinitionRequest> marshall(ValidatePipelineDefinitionRequest validatePipelineDefinitionRequest) {

        if (validatePipelineDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ValidatePipelineDefinitionRequest> request = new DefaultRequest<ValidatePipelineDefinitionRequest>(validatePipelineDefinitionRequest,
                "DataPipeline");
        request.addHeader("X-Amz-Target", "DataPipeline.ValidatePipelineDefinition");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (validatePipelineDefinitionRequest.getPipelineId() != null) {
                jsonGenerator.writeFieldName("pipelineId").writeValue(validatePipelineDefinitionRequest.getPipelineId());
            }

            com.amazonaws.internal.SdkInternalList<PipelineObject> pipelineObjectsList = (com.amazonaws.internal.SdkInternalList<PipelineObject>) validatePipelineDefinitionRequest
                    .getPipelineObjects();
            if (!pipelineObjectsList.isEmpty() || !pipelineObjectsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("pipelineObjects");
                jsonGenerator.writeStartArray();
                for (PipelineObject pipelineObjectsListValue : pipelineObjectsList) {
                    if (pipelineObjectsListValue != null) {

                        PipelineObjectJsonMarshaller.getInstance().marshall(pipelineObjectsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<ParameterObject> parameterObjectsList = (com.amazonaws.internal.SdkInternalList<ParameterObject>) validatePipelineDefinitionRequest
                    .getParameterObjects();
            if (!parameterObjectsList.isEmpty() || !parameterObjectsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("parameterObjects");
                jsonGenerator.writeStartArray();
                for (ParameterObject parameterObjectsListValue : parameterObjectsList) {
                    if (parameterObjectsListValue != null) {

                        ParameterObjectJsonMarshaller.getInstance().marshall(parameterObjectsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<ParameterValue> parameterValuesList = (com.amazonaws.internal.SdkInternalList<ParameterValue>) validatePipelineDefinitionRequest
                    .getParameterValues();
            if (!parameterValuesList.isEmpty() || !parameterValuesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("parameterValues");
                jsonGenerator.writeStartArray();
                for (ParameterValue parameterValuesListValue : parameterValuesList) {
                    if (parameterValuesListValue != null) {

                        ParameterValueJsonMarshaller.getInstance().marshall(parameterValuesListValue, jsonGenerator);
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
