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
public class CreateProvisioningArtifactResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The resulting detailed provisioning artifact information.
     * </p>
     */
    private ProvisioningArtifactDetail provisioningArtifactDetail;
    /**
     * <p>
     * Additional information about the provisioning artifact create request.
     * </p>
     */
    private java.util.Map<String, String> info;
    /**
     * <p>
     * The status of the current request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The resulting detailed provisioning artifact information.
     * </p>
     * 
     * @param provisioningArtifactDetail
     *        The resulting detailed provisioning artifact information.
     */

    public void setProvisioningArtifactDetail(ProvisioningArtifactDetail provisioningArtifactDetail) {
        this.provisioningArtifactDetail = provisioningArtifactDetail;
    }

    /**
     * <p>
     * The resulting detailed provisioning artifact information.
     * </p>
     * 
     * @return The resulting detailed provisioning artifact information.
     */

    public ProvisioningArtifactDetail getProvisioningArtifactDetail() {
        return this.provisioningArtifactDetail;
    }

    /**
     * <p>
     * The resulting detailed provisioning artifact information.
     * </p>
     * 
     * @param provisioningArtifactDetail
     *        The resulting detailed provisioning artifact information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisioningArtifactResult withProvisioningArtifactDetail(ProvisioningArtifactDetail provisioningArtifactDetail) {
        setProvisioningArtifactDetail(provisioningArtifactDetail);
        return this;
    }

    /**
     * <p>
     * Additional information about the provisioning artifact create request.
     * </p>
     * 
     * @return Additional information about the provisioning artifact create request.
     */

    public java.util.Map<String, String> getInfo() {
        return info;
    }

    /**
     * <p>
     * Additional information about the provisioning artifact create request.
     * </p>
     * 
     * @param info
     *        Additional information about the provisioning artifact create request.
     */

    public void setInfo(java.util.Map<String, String> info) {
        this.info = info;
    }

    /**
     * <p>
     * Additional information about the provisioning artifact create request.
     * </p>
     * 
     * @param info
     *        Additional information about the provisioning artifact create request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisioningArtifactResult withInfo(java.util.Map<String, String> info) {
        setInfo(info);
        return this;
    }

    public CreateProvisioningArtifactResult addInfoEntry(String key, String value) {
        if (null == this.info) {
            this.info = new java.util.HashMap<String, String>();
        }
        if (this.info.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.info.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Info.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisioningArtifactResult clearInfoEntries() {
        this.info = null;
        return this;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @param status
     *        The status of the current request.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @return The status of the current request.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @param status
     *        The status of the current request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public CreateProvisioningArtifactResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @param status
     *        The status of the current request.
     * @see Status
     */

    public void setStatus(Status status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * 
     * @param status
     *        The status of the current request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public CreateProvisioningArtifactResult withStatus(Status status) {
        setStatus(status);
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
        if (getProvisioningArtifactDetail() != null)
            sb.append("ProvisioningArtifactDetail: ").append(getProvisioningArtifactDetail()).append(",");
        if (getInfo() != null)
            sb.append("Info: ").append(getInfo()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProvisioningArtifactResult == false)
            return false;
        CreateProvisioningArtifactResult other = (CreateProvisioningArtifactResult) obj;
        if (other.getProvisioningArtifactDetail() == null ^ this.getProvisioningArtifactDetail() == null)
            return false;
        if (other.getProvisioningArtifactDetail() != null && other.getProvisioningArtifactDetail().equals(this.getProvisioningArtifactDetail()) == false)
            return false;
        if (other.getInfo() == null ^ this.getInfo() == null)
            return false;
        if (other.getInfo() != null && other.getInfo().equals(this.getInfo()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisioningArtifactDetail() == null) ? 0 : getProvisioningArtifactDetail().hashCode());
        hashCode = prime * hashCode + ((getInfo() == null) ? 0 : getInfo().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateProvisioningArtifactResult clone() {
        try {
            return (CreateProvisioningArtifactResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
