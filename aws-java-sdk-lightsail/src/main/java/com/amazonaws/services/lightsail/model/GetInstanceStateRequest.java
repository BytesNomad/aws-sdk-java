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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetInstanceStateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the instance to get state information about.
     * </p>
     */
    private String instanceName;

    /**
     * <p>
     * The name of the instance to get state information about.
     * </p>
     * 
     * @param instanceName
     *        The name of the instance to get state information about.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the instance to get state information about.
     * </p>
     * 
     * @return The name of the instance to get state information about.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The name of the instance to get state information about.
     * </p>
     * 
     * @param instanceName
     *        The name of the instance to get state information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceStateRequest withInstanceName(String instanceName) {
        setInstanceName(instanceName);
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
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceStateRequest == false)
            return false;
        GetInstanceStateRequest other = (GetInstanceStateRequest) obj;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceStateRequest clone() {
        return (GetInstanceStateRequest) super.clone();
    }

}
