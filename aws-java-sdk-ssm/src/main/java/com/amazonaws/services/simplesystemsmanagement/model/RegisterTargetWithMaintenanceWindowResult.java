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
 * 
 */
public class RegisterTargetWithMaintenanceWindowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the target definition in this Maintenance Window.
     * </p>
     */
    private String windowTargetId;

    /**
     * <p>
     * The ID of the target definition in this Maintenance Window.
     * </p>
     * 
     * @param windowTargetId
     *        The ID of the target definition in this Maintenance Window.
     */

    public void setWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
    }

    /**
     * <p>
     * The ID of the target definition in this Maintenance Window.
     * </p>
     * 
     * @return The ID of the target definition in this Maintenance Window.
     */

    public String getWindowTargetId() {
        return this.windowTargetId;
    }

    /**
     * <p>
     * The ID of the target definition in this Maintenance Window.
     * </p>
     * 
     * @param windowTargetId
     *        The ID of the target definition in this Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTargetWithMaintenanceWindowResult withWindowTargetId(String windowTargetId) {
        setWindowTargetId(windowTargetId);
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
        if (getWindowTargetId() != null)
            sb.append("WindowTargetId: ").append(getWindowTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTargetWithMaintenanceWindowResult == false)
            return false;
        RegisterTargetWithMaintenanceWindowResult other = (RegisterTargetWithMaintenanceWindowResult) obj;
        if (other.getWindowTargetId() == null ^ this.getWindowTargetId() == null)
            return false;
        if (other.getWindowTargetId() != null && other.getWindowTargetId().equals(this.getWindowTargetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowTargetId() == null) ? 0 : getWindowTargetId().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTargetWithMaintenanceWindowResult clone() {
        try {
            return (RegisterTargetWithMaintenanceWindowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
