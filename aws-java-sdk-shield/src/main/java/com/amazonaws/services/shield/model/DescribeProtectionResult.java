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
package com.amazonaws.services.shield.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeProtectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <a>Protection</a> object that is described.
     * </p>
     */
    private Protection protection;

    /**
     * <p>
     * The <a>Protection</a> object that is described.
     * </p>
     * 
     * @param protection
     *        The <a>Protection</a> object that is described.
     */

    public void setProtection(Protection protection) {
        this.protection = protection;
    }

    /**
     * <p>
     * The <a>Protection</a> object that is described.
     * </p>
     * 
     * @return The <a>Protection</a> object that is described.
     */

    public Protection getProtection() {
        return this.protection;
    }

    /**
     * <p>
     * The <a>Protection</a> object that is described.
     * </p>
     * 
     * @param protection
     *        The <a>Protection</a> object that is described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectionResult withProtection(Protection protection) {
        setProtection(protection);
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
        if (getProtection() != null)
            sb.append("Protection: ").append(getProtection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProtectionResult == false)
            return false;
        DescribeProtectionResult other = (DescribeProtectionResult) obj;
        if (other.getProtection() == null ^ this.getProtection() == null)
            return false;
        if (other.getProtection() != null && other.getProtection().equals(this.getProtection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtection() == null) ? 0 : getProtection().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProtectionResult clone() {
        try {
            return (DescribeProtectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
