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
 * Describes an attachment between a virtual private gateway and a VPC.
 * </p>
 */
public class VpcAttachment implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The current state of the attachment.
     * </p>
     */
    private String state;

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

    public VpcAttachment withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The current state of the attachment.
     * </p>
     * 
     * @param state
     *        The current state of the attachment.
     * @see AttachmentStatus
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the attachment.
     * </p>
     * 
     * @return The current state of the attachment.
     * @see AttachmentStatus
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the attachment.
     * </p>
     * 
     * @param state
     *        The current state of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentStatus
     */

    public VpcAttachment withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the attachment.
     * </p>
     * 
     * @param state
     *        The current state of the attachment.
     * @see AttachmentStatus
     */

    public void setState(AttachmentStatus state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the attachment.
     * </p>
     * 
     * @param state
     *        The current state of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentStatus
     */

    public VpcAttachment withState(AttachmentStatus state) {
        setState(state);
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcAttachment == false)
            return false;
        VpcAttachment other = (VpcAttachment) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public VpcAttachment clone() {
        try {
            return (VpcAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
