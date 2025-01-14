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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceResult;

/**
 * A simple result wrapper around the InstanceAttribute object that was sent over the wire.
 */
public class DescribeInstanceAttributeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes an instance attribute.
     * </p>
     */
    private InstanceAttribute instanceAttribute;

    /**
     * <p>
     * Describes an instance attribute.
     * </p>
     * 
     * @param instanceAttribute
     *        Describes an instance attribute.
     */

    public void setInstanceAttribute(InstanceAttribute instanceAttribute) {
        this.instanceAttribute = instanceAttribute;
    }

    /**
     * <p>
     * Describes an instance attribute.
     * </p>
     * 
     * @return Describes an instance attribute.
     */

    public InstanceAttribute getInstanceAttribute() {
        return this.instanceAttribute;
    }

    /**
     * <p>
     * Describes an instance attribute.
     * </p>
     * 
     * @param instanceAttribute
     *        Describes an instance attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceAttributeResult withInstanceAttribute(InstanceAttribute instanceAttribute) {
        setInstanceAttribute(instanceAttribute);
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
        if (getInstanceAttribute() != null)
            sb.append("InstanceAttribute: ").append(getInstanceAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceAttributeResult == false)
            return false;
        DescribeInstanceAttributeResult other = (DescribeInstanceAttributeResult) obj;
        if (other.getInstanceAttribute() == null ^ this.getInstanceAttribute() == null)
            return false;
        if (other.getInstanceAttribute() != null && other.getInstanceAttribute().equals(this.getInstanceAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceAttribute() == null) ? 0 : getInstanceAttribute().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceAttributeResult clone() {
        try {
            return (DescribeInstanceAttributeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
