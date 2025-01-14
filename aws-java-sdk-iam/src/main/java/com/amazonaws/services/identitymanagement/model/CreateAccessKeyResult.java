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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>CreateAccessKey</a> request.
 * </p>
 */
public class CreateAccessKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure with details about the access key.
     * </p>
     */
    private AccessKey accessKey;

    /**
     * <p>
     * A structure with details about the access key.
     * </p>
     * 
     * @param accessKey
     *        A structure with details about the access key.
     */

    public void setAccessKey(AccessKey accessKey) {
        this.accessKey = accessKey;
    }

    /**
     * <p>
     * A structure with details about the access key.
     * </p>
     * 
     * @return A structure with details about the access key.
     */

    public AccessKey getAccessKey() {
        return this.accessKey;
    }

    /**
     * <p>
     * A structure with details about the access key.
     * </p>
     * 
     * @param accessKey
     *        A structure with details about the access key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessKeyResult withAccessKey(AccessKey accessKey) {
        setAccessKey(accessKey);
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
        if (getAccessKey() != null)
            sb.append("AccessKey: ").append(getAccessKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessKeyResult == false)
            return false;
        CreateAccessKeyResult other = (CreateAccessKeyResult) obj;
        if (other.getAccessKey() == null ^ this.getAccessKey() == null)
            return false;
        if (other.getAccessKey() != null && other.getAccessKey().equals(this.getAccessKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKey() == null) ? 0 : getAccessKey().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessKeyResult clone() {
        try {
            return (CreateAccessKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
