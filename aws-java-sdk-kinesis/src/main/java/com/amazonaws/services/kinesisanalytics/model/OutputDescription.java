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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the application output configuration, which includes the in-application stream name and the destination
 * where the stream data is written. The destination can be an Amazon Kinesis stream or an Amazon Kinesis Firehose
 * delivery stream.
 * </p>
 */
public class OutputDescription implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the output configuration.
     * </p>
     */
    private String outputId;
    /**
     * <p>
     * Name of the in-application stream configured as output.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes Amazon Kinesis stream configured as the destination where output is written.
     * </p>
     */
    private KinesisStreamsOutputDescription kinesisStreamsOutputDescription;
    /**
     * <p>
     * Describes the Amazon Kinesis Firehose delivery stream configured as the destination where output is written.
     * </p>
     */
    private KinesisFirehoseOutputDescription kinesisFirehoseOutputDescription;
    /**
     * <p>
     * Data format used for writing data to the destination.
     * </p>
     */
    private DestinationSchema destinationSchema;

    /**
     * <p>
     * A unique identifier for the output configuration.
     * </p>
     * 
     * @param outputId
     *        A unique identifier for the output configuration.
     */

    public void setOutputId(String outputId) {
        this.outputId = outputId;
    }

    /**
     * <p>
     * A unique identifier for the output configuration.
     * </p>
     * 
     * @return A unique identifier for the output configuration.
     */

    public String getOutputId() {
        return this.outputId;
    }

    /**
     * <p>
     * A unique identifier for the output configuration.
     * </p>
     * 
     * @param outputId
     *        A unique identifier for the output configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDescription withOutputId(String outputId) {
        setOutputId(outputId);
        return this;
    }

    /**
     * <p>
     * Name of the in-application stream configured as output.
     * </p>
     * 
     * @param name
     *        Name of the in-application stream configured as output.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the in-application stream configured as output.
     * </p>
     * 
     * @return Name of the in-application stream configured as output.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the in-application stream configured as output.
     * </p>
     * 
     * @param name
     *        Name of the in-application stream configured as output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Describes Amazon Kinesis stream configured as the destination where output is written.
     * </p>
     * 
     * @param kinesisStreamsOutputDescription
     *        Describes Amazon Kinesis stream configured as the destination where output is written.
     */

    public void setKinesisStreamsOutputDescription(KinesisStreamsOutputDescription kinesisStreamsOutputDescription) {
        this.kinesisStreamsOutputDescription = kinesisStreamsOutputDescription;
    }

    /**
     * <p>
     * Describes Amazon Kinesis stream configured as the destination where output is written.
     * </p>
     * 
     * @return Describes Amazon Kinesis stream configured as the destination where output is written.
     */

    public KinesisStreamsOutputDescription getKinesisStreamsOutputDescription() {
        return this.kinesisStreamsOutputDescription;
    }

    /**
     * <p>
     * Describes Amazon Kinesis stream configured as the destination where output is written.
     * </p>
     * 
     * @param kinesisStreamsOutputDescription
     *        Describes Amazon Kinesis stream configured as the destination where output is written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDescription withKinesisStreamsOutputDescription(KinesisStreamsOutputDescription kinesisStreamsOutputDescription) {
        setKinesisStreamsOutputDescription(kinesisStreamsOutputDescription);
        return this;
    }

    /**
     * <p>
     * Describes the Amazon Kinesis Firehose delivery stream configured as the destination where output is written.
     * </p>
     * 
     * @param kinesisFirehoseOutputDescription
     *        Describes the Amazon Kinesis Firehose delivery stream configured as the destination where output is
     *        written.
     */

    public void setKinesisFirehoseOutputDescription(KinesisFirehoseOutputDescription kinesisFirehoseOutputDescription) {
        this.kinesisFirehoseOutputDescription = kinesisFirehoseOutputDescription;
    }

    /**
     * <p>
     * Describes the Amazon Kinesis Firehose delivery stream configured as the destination where output is written.
     * </p>
     * 
     * @return Describes the Amazon Kinesis Firehose delivery stream configured as the destination where output is
     *         written.
     */

    public KinesisFirehoseOutputDescription getKinesisFirehoseOutputDescription() {
        return this.kinesisFirehoseOutputDescription;
    }

    /**
     * <p>
     * Describes the Amazon Kinesis Firehose delivery stream configured as the destination where output is written.
     * </p>
     * 
     * @param kinesisFirehoseOutputDescription
     *        Describes the Amazon Kinesis Firehose delivery stream configured as the destination where output is
     *        written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDescription withKinesisFirehoseOutputDescription(KinesisFirehoseOutputDescription kinesisFirehoseOutputDescription) {
        setKinesisFirehoseOutputDescription(kinesisFirehoseOutputDescription);
        return this;
    }

    /**
     * <p>
     * Data format used for writing data to the destination.
     * </p>
     * 
     * @param destinationSchema
     *        Data format used for writing data to the destination.
     */

    public void setDestinationSchema(DestinationSchema destinationSchema) {
        this.destinationSchema = destinationSchema;
    }

    /**
     * <p>
     * Data format used for writing data to the destination.
     * </p>
     * 
     * @return Data format used for writing data to the destination.
     */

    public DestinationSchema getDestinationSchema() {
        return this.destinationSchema;
    }

    /**
     * <p>
     * Data format used for writing data to the destination.
     * </p>
     * 
     * @param destinationSchema
     *        Data format used for writing data to the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDescription withDestinationSchema(DestinationSchema destinationSchema) {
        setDestinationSchema(destinationSchema);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOutputId() != null)
            sb.append("OutputId: ").append(getOutputId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getKinesisStreamsOutputDescription() != null)
            sb.append("KinesisStreamsOutputDescription: ").append(getKinesisStreamsOutputDescription()).append(",");
        if (getKinesisFirehoseOutputDescription() != null)
            sb.append("KinesisFirehoseOutputDescription: ").append(getKinesisFirehoseOutputDescription()).append(",");
        if (getDestinationSchema() != null)
            sb.append("DestinationSchema: ").append(getDestinationSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputDescription == false)
            return false;
        OutputDescription other = (OutputDescription) obj;
        if (other.getOutputId() == null ^ this.getOutputId() == null)
            return false;
        if (other.getOutputId() != null && other.getOutputId().equals(this.getOutputId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getKinesisStreamsOutputDescription() == null ^ this.getKinesisStreamsOutputDescription() == null)
            return false;
        if (other.getKinesisStreamsOutputDescription() != null
                && other.getKinesisStreamsOutputDescription().equals(this.getKinesisStreamsOutputDescription()) == false)
            return false;
        if (other.getKinesisFirehoseOutputDescription() == null ^ this.getKinesisFirehoseOutputDescription() == null)
            return false;
        if (other.getKinesisFirehoseOutputDescription() != null
                && other.getKinesisFirehoseOutputDescription().equals(this.getKinesisFirehoseOutputDescription()) == false)
            return false;
        if (other.getDestinationSchema() == null ^ this.getDestinationSchema() == null)
            return false;
        if (other.getDestinationSchema() != null && other.getDestinationSchema().equals(this.getDestinationSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputId() == null) ? 0 : getOutputId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getKinesisStreamsOutputDescription() == null) ? 0 : getKinesisStreamsOutputDescription().hashCode());
        hashCode = prime * hashCode + ((getKinesisFirehoseOutputDescription() == null) ? 0 : getKinesisFirehoseOutputDescription().hashCode());
        hashCode = prime * hashCode + ((getDestinationSchema() == null) ? 0 : getDestinationSchema().hashCode());
        return hashCode;
    }

    @Override
    public OutputDescription clone() {
        try {
            return (OutputDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
