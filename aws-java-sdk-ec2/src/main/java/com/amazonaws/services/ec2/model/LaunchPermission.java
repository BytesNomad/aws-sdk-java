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
 * Describes a launch permission.
 * </p>
 */
public class LaunchPermission implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String group;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param userId
     *        The AWS account ID.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @return The AWS account ID.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param userId
     *        The AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermission withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param group
     *        The name of the group.
     * @see PermissionGroup
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     * @see PermissionGroup
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param group
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionGroup
     */

    public LaunchPermission withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param group
     *        The name of the group.
     * @see PermissionGroup
     */

    public void setGroup(PermissionGroup group) {
        this.group = group.toString();
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param group
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionGroup
     */

    public LaunchPermission withGroup(PermissionGroup group) {
        setGroup(group);
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchPermission == false)
            return false;
        LaunchPermission other = (LaunchPermission) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        return hashCode;
    }

    @Override
    public LaunchPermission clone() {
        try {
            return (LaunchPermission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
