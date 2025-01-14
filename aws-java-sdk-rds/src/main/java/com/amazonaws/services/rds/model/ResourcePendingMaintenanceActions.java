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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the pending maintenance actions for a resource.
 * </p>
 */
public class ResourcePendingMaintenanceActions implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the resource that has pending maintenance actions.
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * A list that provides details about the pending maintenance actions for the resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PendingMaintenanceAction> pendingMaintenanceActionDetails;

    /**
     * <p>
     * The ARN of the resource that has pending maintenance actions.
     * </p>
     * 
     * @param resourceIdentifier
     *        The ARN of the resource that has pending maintenance actions.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The ARN of the resource that has pending maintenance actions.
     * </p>
     * 
     * @return The ARN of the resource that has pending maintenance actions.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The ARN of the resource that has pending maintenance actions.
     * </p>
     * 
     * @param resourceIdentifier
     *        The ARN of the resource that has pending maintenance actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePendingMaintenanceActions withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * A list that provides details about the pending maintenance actions for the resource.
     * </p>
     * 
     * @return A list that provides details about the pending maintenance actions for the resource.
     */

    public java.util.List<PendingMaintenanceAction> getPendingMaintenanceActionDetails() {
        if (pendingMaintenanceActionDetails == null) {
            pendingMaintenanceActionDetails = new com.amazonaws.internal.SdkInternalList<PendingMaintenanceAction>();
        }
        return pendingMaintenanceActionDetails;
    }

    /**
     * <p>
     * A list that provides details about the pending maintenance actions for the resource.
     * </p>
     * 
     * @param pendingMaintenanceActionDetails
     *        A list that provides details about the pending maintenance actions for the resource.
     */

    public void setPendingMaintenanceActionDetails(java.util.Collection<PendingMaintenanceAction> pendingMaintenanceActionDetails) {
        if (pendingMaintenanceActionDetails == null) {
            this.pendingMaintenanceActionDetails = null;
            return;
        }

        this.pendingMaintenanceActionDetails = new com.amazonaws.internal.SdkInternalList<PendingMaintenanceAction>(pendingMaintenanceActionDetails);
    }

    /**
     * <p>
     * A list that provides details about the pending maintenance actions for the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPendingMaintenanceActionDetails(java.util.Collection)} or
     * {@link #withPendingMaintenanceActionDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param pendingMaintenanceActionDetails
     *        A list that provides details about the pending maintenance actions for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePendingMaintenanceActions withPendingMaintenanceActionDetails(PendingMaintenanceAction... pendingMaintenanceActionDetails) {
        if (this.pendingMaintenanceActionDetails == null) {
            setPendingMaintenanceActionDetails(new com.amazonaws.internal.SdkInternalList<PendingMaintenanceAction>(pendingMaintenanceActionDetails.length));
        }
        for (PendingMaintenanceAction ele : pendingMaintenanceActionDetails) {
            this.pendingMaintenanceActionDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that provides details about the pending maintenance actions for the resource.
     * </p>
     * 
     * @param pendingMaintenanceActionDetails
     *        A list that provides details about the pending maintenance actions for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePendingMaintenanceActions withPendingMaintenanceActionDetails(java.util.Collection<PendingMaintenanceAction> pendingMaintenanceActionDetails) {
        setPendingMaintenanceActionDetails(pendingMaintenanceActionDetails);
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
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getPendingMaintenanceActionDetails() != null)
            sb.append("PendingMaintenanceActionDetails: ").append(getPendingMaintenanceActionDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcePendingMaintenanceActions == false)
            return false;
        ResourcePendingMaintenanceActions other = (ResourcePendingMaintenanceActions) obj;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getPendingMaintenanceActionDetails() == null ^ this.getPendingMaintenanceActionDetails() == null)
            return false;
        if (other.getPendingMaintenanceActionDetails() != null
                && other.getPendingMaintenanceActionDetails().equals(this.getPendingMaintenanceActionDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPendingMaintenanceActionDetails() == null) ? 0 : getPendingMaintenanceActionDetails().hashCode());
        return hashCode;
    }

    @Override
    public ResourcePendingMaintenanceActions clone() {
        try {
            return (ResourcePendingMaintenanceActions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
