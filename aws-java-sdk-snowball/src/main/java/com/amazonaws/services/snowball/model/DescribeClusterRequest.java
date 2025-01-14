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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     */
    private String clusterId;

    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     * 
     * @param clusterId
     *        The automatically generated ID for a cluster.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     * 
     * @return The automatically generated ID for a cluster.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The automatically generated ID for a cluster.
     * </p>
     * 
     * @param clusterId
     *        The automatically generated ID for a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterRequest == false)
            return false;
        DescribeClusterRequest other = (DescribeClusterRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClusterRequest clone() {
        return (DescribeClusterRequest) super.clone();
    }

}
