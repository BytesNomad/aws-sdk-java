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
package com.amazonaws.services.lambda.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * AddPermissionRequest Marshaller
 */
public class AddPermissionRequestMarshaller implements Marshaller<Request<AddPermissionRequest>, AddPermissionRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public AddPermissionRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<AddPermissionRequest> marshall(AddPermissionRequest addPermissionRequest) {

        if (addPermissionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AddPermissionRequest> request = new DefaultRequest<AddPermissionRequest>(addPermissionRequest, "AWSLambda");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2015-03-31/functions/{FunctionName}/policy";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "FunctionName", addPermissionRequest.getFunctionName());
        request.setResourcePath(uriResourcePath);

        if (addPermissionRequest.getQualifier() != null) {
            request.addParameter("Qualifier", StringUtils.fromString(addPermissionRequest.getQualifier()));
        }

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (addPermissionRequest.getStatementId() != null) {
                jsonGenerator.writeFieldName("StatementId").writeValue(addPermissionRequest.getStatementId());
            }
            if (addPermissionRequest.getAction() != null) {
                jsonGenerator.writeFieldName("Action").writeValue(addPermissionRequest.getAction());
            }
            if (addPermissionRequest.getPrincipal() != null) {
                jsonGenerator.writeFieldName("Principal").writeValue(addPermissionRequest.getPrincipal());
            }
            if (addPermissionRequest.getSourceArn() != null) {
                jsonGenerator.writeFieldName("SourceArn").writeValue(addPermissionRequest.getSourceArn());
            }
            if (addPermissionRequest.getSourceAccount() != null) {
                jsonGenerator.writeFieldName("SourceAccount").writeValue(addPermissionRequest.getSourceAccount());
            }
            if (addPermissionRequest.getEventSourceToken() != null) {
                jsonGenerator.writeFieldName("EventSourceToken").writeValue(addPermissionRequest.getEventSourceToken());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
