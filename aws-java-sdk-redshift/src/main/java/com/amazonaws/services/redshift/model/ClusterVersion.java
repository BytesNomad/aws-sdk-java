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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a cluster version, including the parameter group family and description of the version.
 * </p>
 */
public class ClusterVersion implements Serializable, Cloneable {

    /**
     * <p>
     * The version number used by the cluster.
     * </p>
     */
    private String clusterVersion;
    /**
     * <p>
     * The name of the cluster parameter group family for the cluster.
     * </p>
     */
    private String clusterParameterGroupFamily;
    /**
     * <p>
     * The description of the cluster version.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The version number used by the cluster.
     * </p>
     * 
     * @param clusterVersion
     *        The version number used by the cluster.
     */

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    /**
     * <p>
     * The version number used by the cluster.
     * </p>
     * 
     * @return The version number used by the cluster.
     */

    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * <p>
     * The version number used by the cluster.
     * </p>
     * 
     * @param clusterVersion
     *        The version number used by the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterVersion withClusterVersion(String clusterVersion) {
        setClusterVersion(clusterVersion);
        return this;
    }

    /**
     * <p>
     * The name of the cluster parameter group family for the cluster.
     * </p>
     * 
     * @param clusterParameterGroupFamily
     *        The name of the cluster parameter group family for the cluster.
     */

    public void setClusterParameterGroupFamily(String clusterParameterGroupFamily) {
        this.clusterParameterGroupFamily = clusterParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the cluster parameter group family for the cluster.
     * </p>
     * 
     * @return The name of the cluster parameter group family for the cluster.
     */

    public String getClusterParameterGroupFamily() {
        return this.clusterParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the cluster parameter group family for the cluster.
     * </p>
     * 
     * @param clusterParameterGroupFamily
     *        The name of the cluster parameter group family for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterVersion withClusterParameterGroupFamily(String clusterParameterGroupFamily) {
        setClusterParameterGroupFamily(clusterParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * The description of the cluster version.
     * </p>
     * 
     * @param description
     *        The description of the cluster version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the cluster version.
     * </p>
     * 
     * @return The description of the cluster version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the cluster version.
     * </p>
     * 
     * @param description
     *        The description of the cluster version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterVersion withDescription(String description) {
        setDescription(description);
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
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: ").append(getClusterVersion()).append(",");
        if (getClusterParameterGroupFamily() != null)
            sb.append("ClusterParameterGroupFamily: ").append(getClusterParameterGroupFamily()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterVersion == false)
            return false;
        ClusterVersion other = (ClusterVersion) obj;
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null)
            return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false)
            return false;
        if (other.getClusterParameterGroupFamily() == null ^ this.getClusterParameterGroupFamily() == null)
            return false;
        if (other.getClusterParameterGroupFamily() != null && other.getClusterParameterGroupFamily().equals(this.getClusterParameterGroupFamily()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode + ((getClusterParameterGroupFamily() == null) ? 0 : getClusterParameterGroupFamily().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ClusterVersion clone() {
        try {
            return (ClusterVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
