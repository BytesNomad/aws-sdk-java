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
public class UpdateApnsChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private APNSChannelRequest aPNSChannelRequest;

    private String applicationId;

    /**
     * @param aPNSChannelRequest
     */

    public void setAPNSChannelRequest(APNSChannelRequest aPNSChannelRequest) {
        this.aPNSChannelRequest = aPNSChannelRequest;
    }

    /**
     * @return
     */

    public APNSChannelRequest getAPNSChannelRequest() {
        return this.aPNSChannelRequest;
    }

    /**
     * @param aPNSChannelRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApnsChannelRequest withAPNSChannelRequest(APNSChannelRequest aPNSChannelRequest) {
        setAPNSChannelRequest(aPNSChannelRequest);
        return this;
    }

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

    public UpdateApnsChannelRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
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
        if (getAPNSChannelRequest() != null)
            sb.append("APNSChannelRequest: ").append(getAPNSChannelRequest()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApnsChannelRequest == false)
            return false;
        UpdateApnsChannelRequest other = (UpdateApnsChannelRequest) obj;
        if (other.getAPNSChannelRequest() == null ^ this.getAPNSChannelRequest() == null)
            return false;
        if (other.getAPNSChannelRequest() != null && other.getAPNSChannelRequest().equals(this.getAPNSChannelRequest()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAPNSChannelRequest() == null) ? 0 : getAPNSChannelRequest().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApnsChannelRequest clone() {
        return (UpdateApnsChannelRequest) super.clone();
    }

}
