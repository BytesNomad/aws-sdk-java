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
public class CreateProtectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object that is created.
     * </p>
     */
    private String protectionId;

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object that is created.
     * </p>
     * 
     * @param protectionId
     *        The unique identifier (ID) for the <a>Protection</a> object that is created.
     */

    public void setProtectionId(String protectionId) {
        this.protectionId = protectionId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object that is created.
     * </p>
     * 
     * @return The unique identifier (ID) for the <a>Protection</a> object that is created.
     */

    public String getProtectionId() {
        return this.protectionId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object that is created.
     * </p>
     * 
     * @param protectionId
     *        The unique identifier (ID) for the <a>Protection</a> object that is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProtectionResult withProtectionId(String protectionId) {
        setProtectionId(protectionId);
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
        if (getProtectionId() != null)
            sb.append("ProtectionId: ").append(getProtectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProtectionResult == false)
            return false;
        CreateProtectionResult other = (CreateProtectionResult) obj;
        if (other.getProtectionId() == null ^ this.getProtectionId() == null)
            return false;
        if (other.getProtectionId() != null && other.getProtectionId().equals(this.getProtectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectionId() == null) ? 0 : getProtectionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateProtectionResult clone() {
        try {
            return (CreateProtectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
