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
import com.amazonaws.services.ec2.model.transform.DisassociateVpcCidrBlockRequestMarshaller;

/**
 * 
 */
public class DisassociateVpcCidrBlockRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DisassociateVpcCidrBlockRequest> {

    /**
     * <p>
     * The association ID for the CIDR block.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The association ID for the CIDR block.
     * </p>
     * 
     * @param associationId
     *        The association ID for the CIDR block.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The association ID for the CIDR block.
     * </p>
     * 
     * @return The association ID for the CIDR block.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The association ID for the CIDR block.
     * </p>
     * 
     * @param associationId
     *        The association ID for the CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateVpcCidrBlockRequest withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DisassociateVpcCidrBlockRequest> getDryRunRequest() {
        Request<DisassociateVpcCidrBlockRequest> request = new DisassociateVpcCidrBlockRequestMarshaller().marshall(this);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateVpcCidrBlockRequest == false)
            return false;
        DisassociateVpcCidrBlockRequest other = (DisassociateVpcCidrBlockRequest) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateVpcCidrBlockRequest clone() {
        return (DisassociateVpcCidrBlockRequest) super.clone();
    }
}
