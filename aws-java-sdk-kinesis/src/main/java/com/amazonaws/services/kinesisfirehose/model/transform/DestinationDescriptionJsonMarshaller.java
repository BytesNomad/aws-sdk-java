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
package com.amazonaws.services.kinesisfirehose.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DestinationDescriptionMarshaller
 */
public class DestinationDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DestinationDescription destinationDescription, StructuredJsonGenerator jsonGenerator) {

        if (destinationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (destinationDescription.getDestinationId() != null) {
                jsonGenerator.writeFieldName("DestinationId").writeValue(destinationDescription.getDestinationId());
            }
            if (destinationDescription.getS3DestinationDescription() != null) {
                jsonGenerator.writeFieldName("S3DestinationDescription");
                S3DestinationDescriptionJsonMarshaller.getInstance().marshall(destinationDescription.getS3DestinationDescription(), jsonGenerator);
            }
            if (destinationDescription.getExtendedS3DestinationDescription() != null) {
                jsonGenerator.writeFieldName("ExtendedS3DestinationDescription");
                ExtendedS3DestinationDescriptionJsonMarshaller.getInstance().marshall(destinationDescription.getExtendedS3DestinationDescription(),
                        jsonGenerator);
            }
            if (destinationDescription.getRedshiftDestinationDescription() != null) {
                jsonGenerator.writeFieldName("RedshiftDestinationDescription");
                RedshiftDestinationDescriptionJsonMarshaller.getInstance().marshall(destinationDescription.getRedshiftDestinationDescription(), jsonGenerator);
            }
            if (destinationDescription.getElasticsearchDestinationDescription() != null) {
                jsonGenerator.writeFieldName("ElasticsearchDestinationDescription");
                ElasticsearchDestinationDescriptionJsonMarshaller.getInstance().marshall(destinationDescription.getElasticsearchDestinationDescription(),
                        jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DestinationDescriptionJsonMarshaller instance;

    public static DestinationDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DestinationDescriptionJsonMarshaller();
        return instance;
    }

}
