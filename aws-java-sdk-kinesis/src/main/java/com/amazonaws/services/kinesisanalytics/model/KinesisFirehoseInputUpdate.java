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
 * When updating application input configuration, provides information about an Amazon Kinesis Firehose delivery stream
 * as the streaming source.
 * </p>
 */
public class KinesisFirehoseInputUpdate implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of the input Amazon Kinesis Firehose delivery stream to read.
     * </p>
     */
    private String resourceARNUpdate;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your
     * behalf. You need to grant necessary permissions to this role.
     * </p>
     */
    private String roleARNUpdate;

    /**
     * <p>
     * ARN of the input Amazon Kinesis Firehose delivery stream to read.
     * </p>
     * 
     * @param resourceARNUpdate
     *        ARN of the input Amazon Kinesis Firehose delivery stream to read.
     */

    public void setResourceARNUpdate(String resourceARNUpdate) {
        this.resourceARNUpdate = resourceARNUpdate;
    }

    /**
     * <p>
     * ARN of the input Amazon Kinesis Firehose delivery stream to read.
     * </p>
     * 
     * @return ARN of the input Amazon Kinesis Firehose delivery stream to read.
     */

    public String getResourceARNUpdate() {
        return this.resourceARNUpdate;
    }

    /**
     * <p>
     * ARN of the input Amazon Kinesis Firehose delivery stream to read.
     * </p>
     * 
     * @param resourceARNUpdate
     *        ARN of the input Amazon Kinesis Firehose delivery stream to read.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisFirehoseInputUpdate withResourceARNUpdate(String resourceARNUpdate) {
        setResourceARNUpdate(resourceARNUpdate);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your
     * behalf. You need to grant necessary permissions to this role.
     * </p>
     * 
     * @param roleARNUpdate
     *        Amazon Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to access the stream
     *        on your behalf. You need to grant necessary permissions to this role.
     */

    public void setRoleARNUpdate(String roleARNUpdate) {
        this.roleARNUpdate = roleARNUpdate;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your
     * behalf. You need to grant necessary permissions to this role.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to access the stream
     *         on your behalf. You need to grant necessary permissions to this role.
     */

    public String getRoleARNUpdate() {
        return this.roleARNUpdate;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your
     * behalf. You need to grant necessary permissions to this role.
     * </p>
     * 
     * @param roleARNUpdate
     *        Amazon Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to access the stream
     *        on your behalf. You need to grant necessary permissions to this role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisFirehoseInputUpdate withRoleARNUpdate(String roleARNUpdate) {
        setRoleARNUpdate(roleARNUpdate);
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
        if (getResourceARNUpdate() != null)
            sb.append("ResourceARNUpdate: ").append(getResourceARNUpdate()).append(",");
        if (getRoleARNUpdate() != null)
            sb.append("RoleARNUpdate: ").append(getRoleARNUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisFirehoseInputUpdate == false)
            return false;
        KinesisFirehoseInputUpdate other = (KinesisFirehoseInputUpdate) obj;
        if (other.getResourceARNUpdate() == null ^ this.getResourceARNUpdate() == null)
            return false;
        if (other.getResourceARNUpdate() != null && other.getResourceARNUpdate().equals(this.getResourceARNUpdate()) == false)
            return false;
        if (other.getRoleARNUpdate() == null ^ this.getRoleARNUpdate() == null)
            return false;
        if (other.getRoleARNUpdate() != null && other.getRoleARNUpdate().equals(this.getRoleARNUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARNUpdate() == null) ? 0 : getResourceARNUpdate().hashCode());
        hashCode = prime * hashCode + ((getRoleARNUpdate() == null) ? 0 : getRoleARNUpdate().hashCode());
        return hashCode;
    }

    @Override
    public KinesisFirehoseInputUpdate clone() {
        try {
            return (KinesisFirehoseInputUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
