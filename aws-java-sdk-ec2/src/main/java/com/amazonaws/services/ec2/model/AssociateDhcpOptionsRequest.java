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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AssociateDhcpOptionsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for AssociateDhcpOptions.
 * </p>
 */
public class AssociateDhcpOptionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<AssociateDhcpOptionsRequest> {

    /**
     * <p>
     * The ID of the DHCP options set, or <code>default</code> to associate no DHCP options with the VPC.
     * </p>
     */
    private String dhcpOptionsId;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * Default constructor for AssociateDhcpOptionsRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public AssociateDhcpOptionsRequest() {
    }

    /**
     * Constructs a new AssociateDhcpOptionsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param vpcId
     *        The ID of the VPC.
     */
    public AssociateDhcpOptionsRequest(String vpcId) {
        setVpcId(vpcId);
    }

    /**
     * <p>
     * The ID of the DHCP options set, or <code>default</code> to associate no DHCP options with the VPC.
     * </p>
     * 
     * @param dhcpOptionsId
     *        The ID of the DHCP options set, or <code>default</code> to associate no DHCP options with the VPC.
     */

    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }

    /**
     * <p>
     * The ID of the DHCP options set, or <code>default</code> to associate no DHCP options with the VPC.
     * </p>
     * 
     * @return The ID of the DHCP options set, or <code>default</code> to associate no DHCP options with the VPC.
     */

    public String getDhcpOptionsId() {
        return this.dhcpOptionsId;
    }

    /**
     * <p>
     * The ID of the DHCP options set, or <code>default</code> to associate no DHCP options with the VPC.
     * </p>
     * 
     * @param dhcpOptionsId
     *        The ID of the DHCP options set, or <code>default</code> to associate no DHCP options with the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDhcpOptionsRequest withDhcpOptionsId(String dhcpOptionsId) {
        setDhcpOptionsId(dhcpOptionsId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDhcpOptionsRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AssociateDhcpOptionsRequest> getDryRunRequest() {
        Request<AssociateDhcpOptionsRequest> request = new AssociateDhcpOptionsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDhcpOptionsId() != null)
            sb.append("DhcpOptionsId: ").append(getDhcpOptionsId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateDhcpOptionsRequest == false)
            return false;
        AssociateDhcpOptionsRequest other = (AssociateDhcpOptionsRequest) obj;
        if (other.getDhcpOptionsId() == null ^ this.getDhcpOptionsId() == null)
            return false;
        if (other.getDhcpOptionsId() != null && other.getDhcpOptionsId().equals(this.getDhcpOptionsId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDhcpOptionsId() == null) ? 0 : getDhcpOptionsId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateDhcpOptionsRequest clone() {
        return (AssociateDhcpOptionsRequest) super.clone();
    }
}
