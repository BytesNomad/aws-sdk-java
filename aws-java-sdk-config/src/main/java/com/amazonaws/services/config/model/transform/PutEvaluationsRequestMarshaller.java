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
package com.amazonaws.services.config.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * PutEvaluationsRequest Marshaller
 */
public class PutEvaluationsRequestMarshaller implements Marshaller<Request<PutEvaluationsRequest>, PutEvaluationsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public PutEvaluationsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PutEvaluationsRequest> marshall(PutEvaluationsRequest putEvaluationsRequest) {

        if (putEvaluationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutEvaluationsRequest> request = new DefaultRequest<PutEvaluationsRequest>(putEvaluationsRequest, "AmazonConfig");
        request.addHeader("X-Amz-Target", "StarlingDoveService.PutEvaluations");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<Evaluation> evaluationsList = (com.amazonaws.internal.SdkInternalList<Evaluation>) putEvaluationsRequest
                    .getEvaluations();
            if (!evaluationsList.isEmpty() || !evaluationsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Evaluations");
                jsonGenerator.writeStartArray();
                for (Evaluation evaluationsListValue : evaluationsList) {
                    if (evaluationsListValue != null) {

                        EvaluationJsonMarshaller.getInstance().marshall(evaluationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (putEvaluationsRequest.getResultToken() != null) {
                jsonGenerator.writeFieldName("ResultToken").writeValue(putEvaluationsRequest.getResultToken());
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
