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

/**
 * 
 */
public class CampaignsResponse implements Serializable, Cloneable {

    /** A list of campaigns. */
    private java.util.List<CampaignResponse> item;
    /** The string that you use in a subsequent request to get the next page of results in a paginated response. */
    private String nextToken;

    /**
     * A list of campaigns.
     * 
     * @return A list of campaigns.
     */

    public java.util.List<CampaignResponse> getItem() {
        return item;
    }

    /**
     * A list of campaigns.
     * 
     * @param item
     *        A list of campaigns.
     */

    public void setItem(java.util.Collection<CampaignResponse> item) {
        if (item == null) {
            this.item = null;
            return;
        }

        this.item = new java.util.ArrayList<CampaignResponse>(item);
    }

    /**
     * A list of campaigns.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItem(java.util.Collection)} or {@link #withItem(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param item
     *        A list of campaigns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignsResponse withItem(CampaignResponse... item) {
        if (this.item == null) {
            setItem(new java.util.ArrayList<CampaignResponse>(item.length));
        }
        for (CampaignResponse ele : item) {
            this.item.add(ele);
        }
        return this;
    }

    /**
     * A list of campaigns.
     * 
     * @param item
     *        A list of campaigns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignsResponse withItem(java.util.Collection<CampaignResponse> item) {
        setItem(item);
        return this;
    }

    /**
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next page of results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * 
     * @return The string that you use in a subsequent request to get the next page of results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next page of results in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignsResponse withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getItem() != null)
            sb.append("Item: ").append(getItem()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignsResponse == false)
            return false;
        CampaignsResponse other = (CampaignsResponse) obj;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public CampaignsResponse clone() {
        try {
            return (CampaignsResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
