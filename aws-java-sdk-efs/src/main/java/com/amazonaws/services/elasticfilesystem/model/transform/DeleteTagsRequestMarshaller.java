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
 * DeleteTagsRequest Marshaller
 */
public class DeleteTagsRequestMarshaller implements Marshaller<Request<DeleteTagsRequest>, DeleteTagsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DeleteTagsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeleteTagsRequest> marshall(DeleteTagsRequest deleteTagsRequest) {

        if (deleteTagsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteTagsRequest> request = new DefaultRequest<DeleteTagsRequest>(deleteTagsRequest, "AmazonElasticFileSystem");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2015-02-01/delete-tags/{FileSystemId}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "FileSystemId", deleteTagsRequest.getFileSystemId());
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> tagKeysList = (com.amazonaws.internal.SdkInternalList<String>) deleteTagsRequest.getTagKeys();
            if (!tagKeysList.isEmpty() || !tagKeysList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("TagKeys");
                jsonGenerator.writeStartArray();
                for (String tagKeysListValue : tagKeysList) {
                    if (tagKeysListValue != null) {
                        jsonGenerator.writeValue(tagKeysListValue);
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
