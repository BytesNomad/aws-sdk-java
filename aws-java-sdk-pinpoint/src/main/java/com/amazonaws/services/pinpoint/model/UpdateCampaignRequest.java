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
public class UpdateCampaignRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String applicationId;

    private String campaignId;

    private WriteCampaignRequest writeCampaignRequest;

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

    public UpdateCampaignRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * @param campaignId
     */

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * @return
     */

    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * @param campaignId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignRequest withCampaignId(String campaignId) {
        setCampaignId(campaignId);
        return this;
    }

    /**
     * @param writeCampaignRequest
     */

    public void setWriteCampaignRequest(WriteCampaignRequest writeCampaignRequest) {
        this.writeCampaignRequest = writeCampaignRequest;
    }

    /**
     * @return
     */

    public WriteCampaignRequest getWriteCampaignRequest() {
        return this.writeCampaignRequest;
    }

    /**
     * @param writeCampaignRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignRequest withWriteCampaignRequest(WriteCampaignRequest writeCampaignRequest) {
        setWriteCampaignRequest(writeCampaignRequest);
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
        if (getCampaignId() != null)
            sb.append("CampaignId: ").append(getCampaignId()).append(",");
        if (getWriteCampaignRequest() != null)
            sb.append("WriteCampaignRequest: ").append(getWriteCampaignRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCampaignRequest == false)
            return false;
        UpdateCampaignRequest other = (UpdateCampaignRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCampaignId() == null ^ this.getCampaignId() == null)
            return false;
        if (other.getCampaignId() != null && other.getCampaignId().equals(this.getCampaignId()) == false)
            return false;
        if (other.getWriteCampaignRequest() == null ^ this.getWriteCampaignRequest() == null)
            return false;
        if (other.getWriteCampaignRequest() != null && other.getWriteCampaignRequest().equals(this.getWriteCampaignRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCampaignId() == null) ? 0 : getCampaignId().hashCode());
        hashCode = prime * hashCode + ((getWriteCampaignRequest() == null) ? 0 : getWriteCampaignRequest().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCampaignRequest clone() {
        return (UpdateCampaignRequest) super.clone();
    }

}
