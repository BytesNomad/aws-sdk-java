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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class StartMaintenanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the server on which to run maintenance.
     * </p>
     */
    private String serverName;

    /**
     * <p>
     * The name of the server on which to run maintenance.
     * </p>
     * 
     * @param serverName
     *        The name of the server on which to run maintenance.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server on which to run maintenance.
     * </p>
     * 
     * @return The name of the server on which to run maintenance.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server on which to run maintenance.
     * </p>
     * 
     * @param serverName
     *        The name of the server on which to run maintenance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMaintenanceRequest withServerName(String serverName) {
        setServerName(serverName);
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
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMaintenanceRequest == false)
            return false;
        StartMaintenanceRequest other = (StartMaintenanceRequest) obj;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        return hashCode;
    }

    @Override
    public StartMaintenanceRequest clone() {
        return (StartMaintenanceRequest) super.clone();
    }

}
