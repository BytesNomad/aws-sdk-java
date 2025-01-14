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

/**
 * <p>
 * Information about the approval status of a patch.
 * </p>
 */
public class PatchStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
     * </p>
     */
    private String deploymentStatus;
    /**
     * <p>
     * The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).
     * </p>
     */
    private java.util.Date approvalDate;

    /**
     * <p>
     * The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
     * </p>
     * 
     * @param deploymentStatus
     *        The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
     * @see PatchDeploymentStatus
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
     * </p>
     * 
     * @return The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
     * @see PatchDeploymentStatus
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
     * </p>
     * 
     * @param deploymentStatus
     *        The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchDeploymentStatus
     */

    public PatchStatus withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
     * </p>
     * 
     * @param deploymentStatus
     *        The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
     * @see PatchDeploymentStatus
     */

    public void setDeploymentStatus(PatchDeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
    }

    /**
     * <p>
     * The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
     * </p>
     * 
     * @param deploymentStatus
     *        The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchDeploymentStatus
     */

    public PatchStatus withDeploymentStatus(PatchDeploymentStatus deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).
     * </p>
     * 
     * @param approvalDate
     *        The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).
     */

    public void setApprovalDate(java.util.Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    /**
     * <p>
     * The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).
     * </p>
     * 
     * @return The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).
     */

    public java.util.Date getApprovalDate() {
        return this.approvalDate;
    }

    /**
     * <p>
     * The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).
     * </p>
     * 
     * @param approvalDate
     *        The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchStatus withApprovalDate(java.util.Date approvalDate) {
        setApprovalDate(approvalDate);
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
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus()).append(",");
        if (getApprovalDate() != null)
            sb.append("ApprovalDate: ").append(getApprovalDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchStatus == false)
            return false;
        PatchStatus other = (PatchStatus) obj;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        if (other.getApprovalDate() == null ^ this.getApprovalDate() == null)
            return false;
        if (other.getApprovalDate() != null && other.getApprovalDate().equals(this.getApprovalDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getApprovalDate() == null) ? 0 : getApprovalDate().hashCode());
        return hashCode;
    }

    @Override
    public PatchStatus clone() {
        try {
            return (PatchStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
