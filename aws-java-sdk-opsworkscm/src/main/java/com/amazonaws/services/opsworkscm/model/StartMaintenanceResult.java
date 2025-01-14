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

/**
 * 
 */
public class StartMaintenanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the response to a <code>StartMaintenance</code> request.
     * </p>
     */
    private Server server;

    /**
     * <p>
     * Contains the response to a <code>StartMaintenance</code> request.
     * </p>
     * 
     * @param server
     *        Contains the response to a <code>StartMaintenance</code> request.
     */

    public void setServer(Server server) {
        this.server = server;
    }

    /**
     * <p>
     * Contains the response to a <code>StartMaintenance</code> request.
     * </p>
     * 
     * @return Contains the response to a <code>StartMaintenance</code> request.
     */

    public Server getServer() {
        return this.server;
    }

    /**
     * <p>
     * Contains the response to a <code>StartMaintenance</code> request.
     * </p>
     * 
     * @param server
     *        Contains the response to a <code>StartMaintenance</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMaintenanceResult withServer(Server server) {
        setServer(server);
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
        if (getServer() != null)
            sb.append("Server: ").append(getServer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMaintenanceResult == false)
            return false;
        StartMaintenanceResult other = (StartMaintenanceResult) obj;
        if (other.getServer() == null ^ this.getServer() == null)
            return false;
        if (other.getServer() != null && other.getServer().equals(this.getServer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServer() == null) ? 0 : getServer().hashCode());
        return hashCode;
    }

    @Override
    public StartMaintenanceResult clone() {
        try {
            return (StartMaintenanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
