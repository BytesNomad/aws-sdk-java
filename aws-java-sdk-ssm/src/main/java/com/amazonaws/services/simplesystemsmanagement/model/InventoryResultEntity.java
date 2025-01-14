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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Inventory query results.
 * </p>
 */
public class InventoryResultEntity implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the inventory result entity. For example, for managed instance inventory the result will be the managed
     * instance ID. For EC2 instance inventory, the result will be the instance ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The data section in the inventory result entity json.
     * </p>
     */
    private java.util.Map<String, InventoryResultItem> data;

    /**
     * <p>
     * ID of the inventory result entity. For example, for managed instance inventory the result will be the managed
     * instance ID. For EC2 instance inventory, the result will be the instance ID.
     * </p>
     * 
     * @param id
     *        ID of the inventory result entity. For example, for managed instance inventory the result will be the
     *        managed instance ID. For EC2 instance inventory, the result will be the instance ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID of the inventory result entity. For example, for managed instance inventory the result will be the managed
     * instance ID. For EC2 instance inventory, the result will be the instance ID.
     * </p>
     * 
     * @return ID of the inventory result entity. For example, for managed instance inventory the result will be the
     *         managed instance ID. For EC2 instance inventory, the result will be the instance ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * ID of the inventory result entity. For example, for managed instance inventory the result will be the managed
     * instance ID. For EC2 instance inventory, the result will be the instance ID.
     * </p>
     * 
     * @param id
     *        ID of the inventory result entity. For example, for managed instance inventory the result will be the
     *        managed instance ID. For EC2 instance inventory, the result will be the instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryResultEntity withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The data section in the inventory result entity json.
     * </p>
     * 
     * @return The data section in the inventory result entity json.
     */

    public java.util.Map<String, InventoryResultItem> getData() {
        return data;
    }

    /**
     * <p>
     * The data section in the inventory result entity json.
     * </p>
     * 
     * @param data
     *        The data section in the inventory result entity json.
     */

    public void setData(java.util.Map<String, InventoryResultItem> data) {
        this.data = data;
    }

    /**
     * <p>
     * The data section in the inventory result entity json.
     * </p>
     * 
     * @param data
     *        The data section in the inventory result entity json.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryResultEntity withData(java.util.Map<String, InventoryResultItem> data) {
        setData(data);
        return this;
    }

    public InventoryResultEntity addDataEntry(String key, InventoryResultItem value) {
        if (null == this.data) {
            this.data = new java.util.HashMap<String, InventoryResultItem>();
        }
        if (this.data.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.data.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Data.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryResultEntity clearDataEntries() {
        this.data = null;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryResultEntity == false)
            return false;
        InventoryResultEntity other = (InventoryResultEntity) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public InventoryResultEntity clone() {
        try {
            return (InventoryResultEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
