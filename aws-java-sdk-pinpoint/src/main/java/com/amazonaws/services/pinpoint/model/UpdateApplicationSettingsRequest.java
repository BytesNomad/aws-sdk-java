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
public class UpdateApplicationSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String applicationId;

    private WriteApplicationSettingsRequest writeApplicationSettingsRequest;

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

    public UpdateApplicationSettingsRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * @param writeApplicationSettingsRequest
     */

    public void setWriteApplicationSettingsRequest(WriteApplicationSettingsRequest writeApplicationSettingsRequest) {
        this.writeApplicationSettingsRequest = writeApplicationSettingsRequest;
    }

    /**
     * @return
     */

    public WriteApplicationSettingsRequest getWriteApplicationSettingsRequest() {
        return this.writeApplicationSettingsRequest;
    }

    /**
     * @param writeApplicationSettingsRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsRequest withWriteApplicationSettingsRequest(WriteApplicationSettingsRequest writeApplicationSettingsRequest) {
        setWriteApplicationSettingsRequest(writeApplicationSettingsRequest);
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
        if (getWriteApplicationSettingsRequest() != null)
            sb.append("WriteApplicationSettingsRequest: ").append(getWriteApplicationSettingsRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationSettingsRequest == false)
            return false;
        UpdateApplicationSettingsRequest other = (UpdateApplicationSettingsRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getWriteApplicationSettingsRequest() == null ^ this.getWriteApplicationSettingsRequest() == null)
            return false;
        if (other.getWriteApplicationSettingsRequest() != null
                && other.getWriteApplicationSettingsRequest().equals(this.getWriteApplicationSettingsRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getWriteApplicationSettingsRequest() == null) ? 0 : getWriteApplicationSettingsRequest().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationSettingsRequest clone() {
        return (UpdateApplicationSettingsRequest) super.clone();
    }

}
