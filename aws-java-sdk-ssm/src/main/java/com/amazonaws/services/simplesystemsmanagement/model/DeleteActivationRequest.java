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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteActivationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the activation that you want to delete.
     * </p>
     */
    private String activationId;

    /**
     * <p>
     * The ID of the activation that you want to delete.
     * </p>
     * 
     * @param activationId
     *        The ID of the activation that you want to delete.
     */

    public void setActivationId(String activationId) {
        this.activationId = activationId;
    }

    /**
     * <p>
     * The ID of the activation that you want to delete.
     * </p>
     * 
     * @return The ID of the activation that you want to delete.
     */

    public String getActivationId() {
        return this.activationId;
    }

    /**
     * <p>
     * The ID of the activation that you want to delete.
     * </p>
     * 
     * @param activationId
     *        The ID of the activation that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteActivationRequest withActivationId(String activationId) {
        setActivationId(activationId);
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
        if (getActivationId() != null)
            sb.append("ActivationId: ").append(getActivationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteActivationRequest == false)
            return false;
        DeleteActivationRequest other = (DeleteActivationRequest) obj;
        if (other.getActivationId() == null ^ this.getActivationId() == null)
            return false;
        if (other.getActivationId() != null && other.getActivationId().equals(this.getActivationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivationId() == null) ? 0 : getActivationId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteActivationRequest clone() {
        return (DeleteActivationRequest) super.clone();
    }

}
