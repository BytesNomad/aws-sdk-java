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

/**
 * <p>
 * Describes an egress-only Internet gateway.
 * </p>
 */
public class EgressOnlyInternetGateway implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the egress-only Internet gateway.
     * </p>
     */
    private String egressOnlyInternetGatewayId;
    /**
     * <p>
     * Information about the attachment of the egress-only Internet gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InternetGatewayAttachment> attachments;

    /**
     * <p>
     * The ID of the egress-only Internet gateway.
     * </p>
     * 
     * @param egressOnlyInternetGatewayId
     *        The ID of the egress-only Internet gateway.
     */

    public void setEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * The ID of the egress-only Internet gateway.
     * </p>
     * 
     * @return The ID of the egress-only Internet gateway.
     */

    public String getEgressOnlyInternetGatewayId() {
        return this.egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * The ID of the egress-only Internet gateway.
     * </p>
     * 
     * @param egressOnlyInternetGatewayId
     *        The ID of the egress-only Internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EgressOnlyInternetGateway withEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        setEgressOnlyInternetGatewayId(egressOnlyInternetGatewayId);
        return this;
    }

    /**
     * <p>
     * Information about the attachment of the egress-only Internet gateway.
     * </p>
     * 
     * @return Information about the attachment of the egress-only Internet gateway.
     */

    public java.util.List<InternetGatewayAttachment> getAttachments() {
        if (attachments == null) {
            attachments = new com.amazonaws.internal.SdkInternalList<InternetGatewayAttachment>();
        }
        return attachments;
    }

    /**
     * <p>
     * Information about the attachment of the egress-only Internet gateway.
     * </p>
     * 
     * @param attachments
     *        Information about the attachment of the egress-only Internet gateway.
     */

    public void setAttachments(java.util.Collection<InternetGatewayAttachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new com.amazonaws.internal.SdkInternalList<InternetGatewayAttachment>(attachments);
    }

    /**
     * <p>
     * Information about the attachment of the egress-only Internet gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        Information about the attachment of the egress-only Internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EgressOnlyInternetGateway withAttachments(InternetGatewayAttachment... attachments) {
        if (this.attachments == null) {
            setAttachments(new com.amazonaws.internal.SdkInternalList<InternetGatewayAttachment>(attachments.length));
        }
        for (InternetGatewayAttachment ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the attachment of the egress-only Internet gateway.
     * </p>
     * 
     * @param attachments
     *        Information about the attachment of the egress-only Internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EgressOnlyInternetGateway withAttachments(java.util.Collection<InternetGatewayAttachment> attachments) {
        setAttachments(attachments);
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
        if (getEgressOnlyInternetGatewayId() != null)
            sb.append("EgressOnlyInternetGatewayId: ").append(getEgressOnlyInternetGatewayId()).append(",");
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EgressOnlyInternetGateway == false)
            return false;
        EgressOnlyInternetGateway other = (EgressOnlyInternetGateway) obj;
        if (other.getEgressOnlyInternetGatewayId() == null ^ this.getEgressOnlyInternetGatewayId() == null)
            return false;
        if (other.getEgressOnlyInternetGatewayId() != null && other.getEgressOnlyInternetGatewayId().equals(this.getEgressOnlyInternetGatewayId()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEgressOnlyInternetGatewayId() == null) ? 0 : getEgressOnlyInternetGatewayId().hashCode());
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        return hashCode;
    }

    @Override
    public EgressOnlyInternetGateway clone() {
        try {
            return (EgressOnlyInternetGateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
