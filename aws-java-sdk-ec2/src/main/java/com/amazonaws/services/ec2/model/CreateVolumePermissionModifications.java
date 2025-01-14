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
 * Describes modifications to the permissions for a volume.
 * </p>
 */
public class CreateVolumePermissionModifications implements Serializable, Cloneable {

    /**
     * <p>
     * Adds a specific AWS account ID or group to a volume's list of create volume permissions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CreateVolumePermission> add;
    /**
     * <p>
     * Removes a specific AWS account ID or group from a volume's list of create volume permissions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CreateVolumePermission> remove;

    /**
     * <p>
     * Adds a specific AWS account ID or group to a volume's list of create volume permissions.
     * </p>
     * 
     * @return Adds a specific AWS account ID or group to a volume's list of create volume permissions.
     */

    public java.util.List<CreateVolumePermission> getAdd() {
        if (add == null) {
            add = new com.amazonaws.internal.SdkInternalList<CreateVolumePermission>();
        }
        return add;
    }

    /**
     * <p>
     * Adds a specific AWS account ID or group to a volume's list of create volume permissions.
     * </p>
     * 
     * @param add
     *        Adds a specific AWS account ID or group to a volume's list of create volume permissions.
     */

    public void setAdd(java.util.Collection<CreateVolumePermission> add) {
        if (add == null) {
            this.add = null;
            return;
        }

        this.add = new com.amazonaws.internal.SdkInternalList<CreateVolumePermission>(add);
    }

    /**
     * <p>
     * Adds a specific AWS account ID or group to a volume's list of create volume permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdd(java.util.Collection)} or {@link #withAdd(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param add
     *        Adds a specific AWS account ID or group to a volume's list of create volume permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumePermissionModifications withAdd(CreateVolumePermission... add) {
        if (this.add == null) {
            setAdd(new com.amazonaws.internal.SdkInternalList<CreateVolumePermission>(add.length));
        }
        for (CreateVolumePermission ele : add) {
            this.add.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Adds a specific AWS account ID or group to a volume's list of create volume permissions.
     * </p>
     * 
     * @param add
     *        Adds a specific AWS account ID or group to a volume's list of create volume permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumePermissionModifications withAdd(java.util.Collection<CreateVolumePermission> add) {
        setAdd(add);
        return this;
    }

    /**
     * <p>
     * Removes a specific AWS account ID or group from a volume's list of create volume permissions.
     * </p>
     * 
     * @return Removes a specific AWS account ID or group from a volume's list of create volume permissions.
     */

    public java.util.List<CreateVolumePermission> getRemove() {
        if (remove == null) {
            remove = new com.amazonaws.internal.SdkInternalList<CreateVolumePermission>();
        }
        return remove;
    }

    /**
     * <p>
     * Removes a specific AWS account ID or group from a volume's list of create volume permissions.
     * </p>
     * 
     * @param remove
     *        Removes a specific AWS account ID or group from a volume's list of create volume permissions.
     */

    public void setRemove(java.util.Collection<CreateVolumePermission> remove) {
        if (remove == null) {
            this.remove = null;
            return;
        }

        this.remove = new com.amazonaws.internal.SdkInternalList<CreateVolumePermission>(remove);
    }

    /**
     * <p>
     * Removes a specific AWS account ID or group from a volume's list of create volume permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemove(java.util.Collection)} or {@link #withRemove(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param remove
     *        Removes a specific AWS account ID or group from a volume's list of create volume permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumePermissionModifications withRemove(CreateVolumePermission... remove) {
        if (this.remove == null) {
            setRemove(new com.amazonaws.internal.SdkInternalList<CreateVolumePermission>(remove.length));
        }
        for (CreateVolumePermission ele : remove) {
            this.remove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Removes a specific AWS account ID or group from a volume's list of create volume permissions.
     * </p>
     * 
     * @param remove
     *        Removes a specific AWS account ID or group from a volume's list of create volume permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumePermissionModifications withRemove(java.util.Collection<CreateVolumePermission> remove) {
        setRemove(remove);
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
        if (getAdd() != null)
            sb.append("Add: ").append(getAdd()).append(",");
        if (getRemove() != null)
            sb.append("Remove: ").append(getRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVolumePermissionModifications == false)
            return false;
        CreateVolumePermissionModifications other = (CreateVolumePermissionModifications) obj;
        if (other.getAdd() == null ^ this.getAdd() == null)
            return false;
        if (other.getAdd() != null && other.getAdd().equals(this.getAdd()) == false)
            return false;
        if (other.getRemove() == null ^ this.getRemove() == null)
            return false;
        if (other.getRemove() != null && other.getRemove().equals(this.getRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdd() == null) ? 0 : getAdd().hashCode());
        hashCode = prime * hashCode + ((getRemove() == null) ? 0 : getRemove().hashCode());
        return hashCode;
    }

    @Override
    public CreateVolumePermissionModifications clone() {
        try {
            return (CreateVolumePermissionModifications) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
