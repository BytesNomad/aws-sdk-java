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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
public class AssociateSubnetCidrBlockResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * Information about the IPv6 CIDR block association.
     * </p>
     */
    private SubnetIpv6CidrBlockAssociation ipv6CidrBlockAssociation;

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @return The ID of the subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateSubnetCidrBlockResult withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR block association.
     * </p>
     * 
     * @param ipv6CidrBlockAssociation
     *        Information about the IPv6 CIDR block association.
     */

    public void setIpv6CidrBlockAssociation(SubnetIpv6CidrBlockAssociation ipv6CidrBlockAssociation) {
        this.ipv6CidrBlockAssociation = ipv6CidrBlockAssociation;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR block association.
     * </p>
     * 
     * @return Information about the IPv6 CIDR block association.
     */

    public SubnetIpv6CidrBlockAssociation getIpv6CidrBlockAssociation() {
        return this.ipv6CidrBlockAssociation;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR block association.
     * </p>
     * 
     * @param ipv6CidrBlockAssociation
     *        Information about the IPv6 CIDR block association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateSubnetCidrBlockResult withIpv6CidrBlockAssociation(SubnetIpv6CidrBlockAssociation ipv6CidrBlockAssociation) {
        setIpv6CidrBlockAssociation(ipv6CidrBlockAssociation);
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
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getIpv6CidrBlockAssociation() != null)
            sb.append("Ipv6CidrBlockAssociation: ").append(getIpv6CidrBlockAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateSubnetCidrBlockResult == false)
            return false;
        AssociateSubnetCidrBlockResult other = (AssociateSubnetCidrBlockResult) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getIpv6CidrBlockAssociation() == null ^ this.getIpv6CidrBlockAssociation() == null)
            return false;
        if (other.getIpv6CidrBlockAssociation() != null && other.getIpv6CidrBlockAssociation().equals(this.getIpv6CidrBlockAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getIpv6CidrBlockAssociation() == null) ? 0 : getIpv6CidrBlockAssociation().hashCode());
        return hashCode;
    }

    @Override
    public AssociateSubnetCidrBlockResult clone() {
        try {
            return (AssociateSubnetCidrBlockResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
