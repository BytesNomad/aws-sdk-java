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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * 
 */
public class ListProvisioningArtifactsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of detailed provisioning artifact information objects.
     * </p>
     */
    private java.util.List<ProvisioningArtifactDetail> provisioningArtifactDetails;
    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * List of detailed provisioning artifact information objects.
     * </p>
     * 
     * @return List of detailed provisioning artifact information objects.
     */

    public java.util.List<ProvisioningArtifactDetail> getProvisioningArtifactDetails() {
        return provisioningArtifactDetails;
    }

    /**
     * <p>
     * List of detailed provisioning artifact information objects.
     * </p>
     * 
     * @param provisioningArtifactDetails
     *        List of detailed provisioning artifact information objects.
     */

    public void setProvisioningArtifactDetails(java.util.Collection<ProvisioningArtifactDetail> provisioningArtifactDetails) {
        if (provisioningArtifactDetails == null) {
            this.provisioningArtifactDetails = null;
            return;
        }

        this.provisioningArtifactDetails = new java.util.ArrayList<ProvisioningArtifactDetail>(provisioningArtifactDetails);
    }

    /**
     * <p>
     * List of detailed provisioning artifact information objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisioningArtifactDetails(java.util.Collection)} or
     * {@link #withProvisioningArtifactDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisioningArtifactDetails
     *        List of detailed provisioning artifact information objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisioningArtifactsResult withProvisioningArtifactDetails(ProvisioningArtifactDetail... provisioningArtifactDetails) {
        if (this.provisioningArtifactDetails == null) {
            setProvisioningArtifactDetails(new java.util.ArrayList<ProvisioningArtifactDetail>(provisioningArtifactDetails.length));
        }
        for (ProvisioningArtifactDetail ele : provisioningArtifactDetails) {
            this.provisioningArtifactDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of detailed provisioning artifact information objects.
     * </p>
     * 
     * @param provisioningArtifactDetails
     *        List of detailed provisioning artifact information objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisioningArtifactsResult withProvisioningArtifactDetails(java.util.Collection<ProvisioningArtifactDetail> provisioningArtifactDetails) {
        setProvisioningArtifactDetails(provisioningArtifactDetails);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next page of results for this operation. If there are no more pages,
     *        this value is null.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @return The page token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next page of results for this operation. If there are no more pages,
     *        this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisioningArtifactsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getProvisioningArtifactDetails() != null)
            sb.append("ProvisioningArtifactDetails: ").append(getProvisioningArtifactDetails()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProvisioningArtifactsResult == false)
            return false;
        ListProvisioningArtifactsResult other = (ListProvisioningArtifactsResult) obj;
        if (other.getProvisioningArtifactDetails() == null ^ this.getProvisioningArtifactDetails() == null)
            return false;
        if (other.getProvisioningArtifactDetails() != null && other.getProvisioningArtifactDetails().equals(this.getProvisioningArtifactDetails()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisioningArtifactDetails() == null) ? 0 : getProvisioningArtifactDetails().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProvisioningArtifactsResult clone() {
        try {
            return (ListProvisioningArtifactsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
