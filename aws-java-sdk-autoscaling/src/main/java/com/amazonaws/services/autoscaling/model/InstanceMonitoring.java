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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes whether instance monitoring is enabled.
 * </p>
 */
public class InstanceMonitoring implements Serializable, Cloneable {

    /**
     * <p>
     * If <code>True</code>, instance monitoring is enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * If <code>True</code>, instance monitoring is enabled.
     * </p>
     * 
     * @param enabled
     *        If <code>True</code>, instance monitoring is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * If <code>True</code>, instance monitoring is enabled.
     * </p>
     * 
     * @return If <code>True</code>, instance monitoring is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * If <code>True</code>, instance monitoring is enabled.
     * </p>
     * 
     * @param enabled
     *        If <code>True</code>, instance monitoring is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceMonitoring withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * If <code>True</code>, instance monitoring is enabled.
     * </p>
     * 
     * @return If <code>True</code>, instance monitoring is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceMonitoring == false)
            return false;
        InstanceMonitoring other = (InstanceMonitoring) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public InstanceMonitoring clone() {
        try {
            return (InstanceMonitoring) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
