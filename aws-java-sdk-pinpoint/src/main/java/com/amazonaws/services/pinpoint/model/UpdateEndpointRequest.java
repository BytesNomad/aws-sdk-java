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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String applicationId;

    private String endpointId;

    private EndpointRequest endpointRequest;

    /**
     * @param applicationId
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * @return
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @param applicationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * @param endpointId
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * @return
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @param endpointId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointRequest withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * @param endpointRequest
     */

    public void setEndpointRequest(EndpointRequest endpointRequest) {
        this.endpointRequest = endpointRequest;
    }

    /**
     * @return
     */

    public EndpointRequest getEndpointRequest() {
        return this.endpointRequest;
    }

    /**
     * @param endpointRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointRequest withEndpointRequest(EndpointRequest endpointRequest) {
        setEndpointRequest(endpointRequest);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append(getEndpointId()).append(",");
        if (getEndpointRequest() != null)
            sb.append("EndpointRequest: ").append(getEndpointRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndpointRequest == false)
            return false;
        UpdateEndpointRequest other = (UpdateEndpointRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getEndpointRequest() == null ^ this.getEndpointRequest() == null)
            return false;
        if (other.getEndpointRequest() != null && other.getEndpointRequest().equals(this.getEndpointRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getEndpointRequest() == null) ? 0 : getEndpointRequest().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEndpointRequest clone() {
        return (UpdateEndpointRequest) super.clone();
    }

}
