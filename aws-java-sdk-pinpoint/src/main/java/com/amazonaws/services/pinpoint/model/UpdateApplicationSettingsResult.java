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
public class UpdateApplicationSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private ApplicationSettingsResource applicationSettingsResource;

    /**
     * @param applicationSettingsResource
     */

    public void setApplicationSettingsResource(ApplicationSettingsResource applicationSettingsResource) {
        this.applicationSettingsResource = applicationSettingsResource;
    }

    /**
     * @return
     */

    public ApplicationSettingsResource getApplicationSettingsResource() {
        return this.applicationSettingsResource;
    }

    /**
     * @param applicationSettingsResource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsResult withApplicationSettingsResource(ApplicationSettingsResource applicationSettingsResource) {
        setApplicationSettingsResource(applicationSettingsResource);
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
        if (getApplicationSettingsResource() != null)
            sb.append("ApplicationSettingsResource: ").append(getApplicationSettingsResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationSettingsResult == false)
            return false;
        UpdateApplicationSettingsResult other = (UpdateApplicationSettingsResult) obj;
        if (other.getApplicationSettingsResource() == null ^ this.getApplicationSettingsResource() == null)
            return false;
        if (other.getApplicationSettingsResource() != null && other.getApplicationSettingsResource().equals(this.getApplicationSettingsResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationSettingsResource() == null) ? 0 : getApplicationSettingsResource().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationSettingsResult clone() {
        try {
            return (UpdateApplicationSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
