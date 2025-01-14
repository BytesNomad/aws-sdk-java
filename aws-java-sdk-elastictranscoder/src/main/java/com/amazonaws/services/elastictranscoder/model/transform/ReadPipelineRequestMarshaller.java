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
package com.amazonaws.services.elastictranscoder.model.transform;

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
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * ReadPipelineRequest Marshaller
 */
public class ReadPipelineRequestMarshaller implements Marshaller<Request<ReadPipelineRequest>, ReadPipelineRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ReadPipelineRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ReadPipelineRequest> marshall(ReadPipelineRequest readPipelineRequest) {

        if (readPipelineRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ReadPipelineRequest> request = new DefaultRequest<ReadPipelineRequest>(readPipelineRequest, "AmazonElasticTranscoder");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2012-09-25/pipelines/{Id}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "Id", readPipelineRequest.getId());
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
