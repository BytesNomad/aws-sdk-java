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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the name and values of a manual DB snapshot attribute
 * </p>
 * <p>
 * Manual DB snapshot attributes are used to authorize other AWS accounts to restore a manual DB snapshot. For more
 * information, see the <a>ModifyDBSnapshotAttribute</a> API.
 * </p>
 */
public class DBSnapshotAttribute implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the manual DB snapshot attribute.
     * </p>
     * <p>
     * The attribute named <code>restore</code> refers to the list of AWS accounts that have permission to copy or
     * restore the manual DB cluster snapshot. For more information, see the <a>ModifyDBSnapshotAttribute</a> API
     * action.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The value or values for the manual DB snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list of IDs
     * of the AWS accounts that are authorized to copy or restore the manual DB snapshot. If a value of <code>all</code>
     * is in the list, then the manual DB snapshot is public and available for any AWS account to copy or restore.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> attributeValues;

    /**
     * <p>
     * The name of the manual DB snapshot attribute.
     * </p>
     * <p>
     * The attribute named <code>restore</code> refers to the list of AWS accounts that have permission to copy or
     * restore the manual DB cluster snapshot. For more information, see the <a>ModifyDBSnapshotAttribute</a> API
     * action.
     * </p>
     * 
     * @param attributeName
     *        The name of the manual DB snapshot attribute.</p>
     *        <p>
     *        The attribute named <code>restore</code> refers to the list of AWS accounts that have permission to copy
     *        or restore the manual DB cluster snapshot. For more information, see the <a>ModifyDBSnapshotAttribute</a>
     *        API action.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the manual DB snapshot attribute.
     * </p>
     * <p>
     * The attribute named <code>restore</code> refers to the list of AWS accounts that have permission to copy or
     * restore the manual DB cluster snapshot. For more information, see the <a>ModifyDBSnapshotAttribute</a> API
     * action.
     * </p>
     * 
     * @return The name of the manual DB snapshot attribute.</p>
     *         <p>
     *         The attribute named <code>restore</code> refers to the list of AWS accounts that have permission to copy
     *         or restore the manual DB cluster snapshot. For more information, see the <a>ModifyDBSnapshotAttribute</a>
     *         API action.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the manual DB snapshot attribute.
     * </p>
     * <p>
     * The attribute named <code>restore</code> refers to the list of AWS accounts that have permission to copy or
     * restore the manual DB cluster snapshot. For more information, see the <a>ModifyDBSnapshotAttribute</a> API
     * action.
     * </p>
     * 
     * @param attributeName
     *        The name of the manual DB snapshot attribute.</p>
     *        <p>
     *        The attribute named <code>restore</code> refers to the list of AWS accounts that have permission to copy
     *        or restore the manual DB cluster snapshot. For more information, see the <a>ModifyDBSnapshotAttribute</a>
     *        API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotAttribute withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The value or values for the manual DB snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list of IDs
     * of the AWS accounts that are authorized to copy or restore the manual DB snapshot. If a value of <code>all</code>
     * is in the list, then the manual DB snapshot is public and available for any AWS account to copy or restore.
     * </p>
     * 
     * @return The value or values for the manual DB snapshot attribute.</p>
     *         <p>
     *         If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list
     *         of IDs of the AWS accounts that are authorized to copy or restore the manual DB snapshot. If a value of
     *         <code>all</code> is in the list, then the manual DB snapshot is public and available for any AWS account
     *         to copy or restore.
     */

    public java.util.List<String> getAttributeValues() {
        if (attributeValues == null) {
            attributeValues = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return attributeValues;
    }

    /**
     * <p>
     * The value or values for the manual DB snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list of IDs
     * of the AWS accounts that are authorized to copy or restore the manual DB snapshot. If a value of <code>all</code>
     * is in the list, then the manual DB snapshot is public and available for any AWS account to copy or restore.
     * </p>
     * 
     * @param attributeValues
     *        The value or values for the manual DB snapshot attribute.</p>
     *        <p>
     *        If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list
     *        of IDs of the AWS accounts that are authorized to copy or restore the manual DB snapshot. If a value of
     *        <code>all</code> is in the list, then the manual DB snapshot is public and available for any AWS account
     *        to copy or restore.
     */

    public void setAttributeValues(java.util.Collection<String> attributeValues) {
        if (attributeValues == null) {
            this.attributeValues = null;
            return;
        }

        this.attributeValues = new com.amazonaws.internal.SdkInternalList<String>(attributeValues);
    }

    /**
     * <p>
     * The value or values for the manual DB snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list of IDs
     * of the AWS accounts that are authorized to copy or restore the manual DB snapshot. If a value of <code>all</code>
     * is in the list, then the manual DB snapshot is public and available for any AWS account to copy or restore.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeValues(java.util.Collection)} or {@link #withAttributeValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributeValues
     *        The value or values for the manual DB snapshot attribute.</p>
     *        <p>
     *        If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list
     *        of IDs of the AWS accounts that are authorized to copy or restore the manual DB snapshot. If a value of
     *        <code>all</code> is in the list, then the manual DB snapshot is public and available for any AWS account
     *        to copy or restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotAttribute withAttributeValues(String... attributeValues) {
        if (this.attributeValues == null) {
            setAttributeValues(new com.amazonaws.internal.SdkInternalList<String>(attributeValues.length));
        }
        for (String ele : attributeValues) {
            this.attributeValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value or values for the manual DB snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list of IDs
     * of the AWS accounts that are authorized to copy or restore the manual DB snapshot. If a value of <code>all</code>
     * is in the list, then the manual DB snapshot is public and available for any AWS account to copy or restore.
     * </p>
     * 
     * @param attributeValues
     *        The value or values for the manual DB snapshot attribute.</p>
     *        <p>
     *        If the <code>AttributeName</code> field is set to <code>restore</code>, then this element returns a list
     *        of IDs of the AWS accounts that are authorized to copy or restore the manual DB snapshot. If a value of
     *        <code>all</code> is in the list, then the manual DB snapshot is public and available for any AWS account
     *        to copy or restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshotAttribute withAttributeValues(java.util.Collection<String> attributeValues) {
        setAttributeValues(attributeValues);
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getAttributeValues() != null)
            sb.append("AttributeValues: ").append(getAttributeValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBSnapshotAttribute == false)
            return false;
        DBSnapshotAttribute other = (DBSnapshotAttribute) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValues() == null ^ this.getAttributeValues() == null)
            return false;
        if (other.getAttributeValues() != null && other.getAttributeValues().equals(this.getAttributeValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeValues() == null) ? 0 : getAttributeValues().hashCode());
        return hashCode;
    }

    @Override
    public DBSnapshotAttribute clone() {
        try {
            return (DBSnapshotAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
