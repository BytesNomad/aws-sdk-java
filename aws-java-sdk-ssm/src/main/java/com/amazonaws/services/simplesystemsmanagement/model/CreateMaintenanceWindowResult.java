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
public class CreateMaintenanceWindowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the created Maintenance Window.
     * </p>
     */
    private String windowId;

    /**
     * <p>
     * The ID of the created Maintenance Window.
     * </p>
     * 
     * @param windowId
     *        The ID of the created Maintenance Window.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the created Maintenance Window.
     * </p>
     * 
     * @return The ID of the created Maintenance Window.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The ID of the created Maintenance Window.
     * </p>
     * 
     * @param windowId
     *        The ID of the created Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMaintenanceWindowResult withWindowId(String windowId) {
        setWindowId(windowId);
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
        if (getWindowId() != null)
            sb.append("WindowId: ").append(getWindowId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMaintenanceWindowResult == false)
            return false;
        CreateMaintenanceWindowResult other = (CreateMaintenanceWindowResult) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        return hashCode;
    }

    @Override
    public CreateMaintenanceWindowResult clone() {
        try {
            return (CreateMaintenanceWindowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
