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
package com.amazonaws.services.elasticfilesystem.model.transform;

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
import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * CreateMountTargetRequest Marshaller
 */
public class CreateMountTargetRequestMarshaller implements Marshaller<Request<CreateMountTargetRequest>, CreateMountTargetRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CreateMountTargetRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateMountTargetRequest> marshall(CreateMountTargetRequest createMountTargetRequest) {

        if (createMountTargetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateMountTargetRequest> request = new DefaultRequest<CreateMountTargetRequest>(createMountTargetRequest, "AmazonElasticFileSystem");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2015-02-01/mount-targets";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (createMountTargetRequest.getFileSystemId() != null) {
                jsonGenerator.writeFieldName("FileSystemId").writeValue(createMountTargetRequest.getFileSystemId());
            }
            if (createMountTargetRequest.getSubnetId() != null) {
                jsonGenerator.writeFieldName("SubnetId").writeValue(createMountTargetRequest.getSubnetId());
            }
            if (createMountTargetRequest.getIpAddress() != null) {
                jsonGenerator.writeFieldName("IpAddress").writeValue(createMountTargetRequest.getIpAddress());
            }

            com.amazonaws.internal.SdkInternalList<String> securityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) createMountTargetRequest
                    .getSecurityGroups();
            if (!securityGroupsList.isEmpty() || !securityGroupsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("SecurityGroups");
                jsonGenerator.writeStartArray();
                for (String securityGroupsListValue : securityGroupsList) {
                    if (securityGroupsListValue != null) {
                        jsonGenerator.writeValue(securityGroupsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
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
