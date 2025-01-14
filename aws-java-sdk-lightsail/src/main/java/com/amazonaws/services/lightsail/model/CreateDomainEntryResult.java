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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * 
 */
public class CreateDomainEntryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of key-value pairs containing information about the operation.
     * </p>
     */
    private Operation operation;

    /**
     * <p>
     * An array of key-value pairs containing information about the operation.
     * </p>
     * 
     * @param operation
     *        An array of key-value pairs containing information about the operation.
     */

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the operation.
     * </p>
     * 
     * @return An array of key-value pairs containing information about the operation.
     */

    public Operation getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the operation.
     * </p>
     * 
     * @param operation
     *        An array of key-value pairs containing information about the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainEntryResult withOperation(Operation operation) {
        setOperation(operation);
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
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainEntryResult == false)
            return false;
        CreateDomainEntryResult other = (CreateDomainEntryResult) obj;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainEntryResult clone() {
        try {
            return (CreateDomainEntryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
