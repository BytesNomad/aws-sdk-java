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
package com.amazonaws.services.cloudsearchdomain.model.transform;

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
import com.amazonaws.services.cloudsearchdomain.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * UploadDocumentsRequest Marshaller
 */
public class UploadDocumentsRequestMarshaller implements Marshaller<Request<UploadDocumentsRequest>, UploadDocumentsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UploadDocumentsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UploadDocumentsRequest> marshall(UploadDocumentsRequest uploadDocumentsRequest) {

        if (uploadDocumentsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UploadDocumentsRequest> request = new DefaultRequest<UploadDocumentsRequest>(uploadDocumentsRequest, "AmazonCloudSearchDomain");

        request.setHttpMethod(HttpMethodName.POST);

        if (uploadDocumentsRequest.getContentType() != null) {
            request.addHeader("Content-Type", StringUtils.fromString(uploadDocumentsRequest.getContentType()));
        }

        if (uploadDocumentsRequest.getContentLength() != null) {
            request.addHeader("Content-Length", StringUtils.fromLong(uploadDocumentsRequest.getContentLength()));
        }

        String uriResourcePath = "/2013-01-01/documents/batch?format=sdk";

        uriResourcePath = com.amazonaws.util.UriResourcePathUtils.addStaticQueryParamtersToRequest(request, uriResourcePath);

        request.setResourcePath(uriResourcePath);

        request.setContent(uploadDocumentsRequest.getDocuments());
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
