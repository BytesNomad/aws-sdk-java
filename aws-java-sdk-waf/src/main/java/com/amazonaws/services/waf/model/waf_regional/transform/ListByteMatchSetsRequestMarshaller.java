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
package com.amazonaws.services.waf.model.waf_regional.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ListByteMatchSetsRequest Marshaller
 */
public class ListByteMatchSetsRequestMarshaller implements Marshaller<Request<ListByteMatchSetsRequest>, ListByteMatchSetsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListByteMatchSetsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListByteMatchSetsRequest> marshall(ListByteMatchSetsRequest listByteMatchSetsRequest) {

        if (listByteMatchSetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListByteMatchSetsRequest> request = new DefaultRequest<ListByteMatchSetsRequest>(listByteMatchSetsRequest, "AWSWAFRegional");
        request.addHeader("X-Amz-Target", "AWSWAF_Regional_20161128.ListByteMatchSets");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (listByteMatchSetsRequest.getNextMarker() != null) {
                jsonGenerator.writeFieldName("NextMarker").writeValue(listByteMatchSetsRequest.getNextMarker());
            }
            if (listByteMatchSetsRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(listByteMatchSetsRequest.getLimit());
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
