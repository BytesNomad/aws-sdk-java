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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a request to perform a <i>PutItem</i> operation on an item.
 * </p>
 */
public class PutRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A map of attribute name to attribute values, representing the primary key of an item to be processed by
     * <i>PutItem</i>. All of the table's primary key attributes must be specified, and their data types must match
     * those of the table's key schema. If any attributes are present in the item which are part of an index key schema
     * for the table, their types must match the index key schema.
     * </p>
     */
    private java.util.Map<String, AttributeValue> item;

    /**
     * Default constructor for PutRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public PutRequest() {
    }

    /**
     * Constructs a new PutRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param item
     *        A map of attribute name to attribute values, representing the primary key of an item to be processed by
     *        <i>PutItem</i>. All of the table's primary key attributes must be specified, and their data types must
     *        match those of the table's key schema. If any attributes are present in the item which are part of an
     *        index key schema for the table, their types must match the index key schema.
     */
    public PutRequest(java.util.Map<String, AttributeValue> item) {
        setItem(item);
    }

    /**
     * <p>
     * A map of attribute name to attribute values, representing the primary key of an item to be processed by
     * <i>PutItem</i>. All of the table's primary key attributes must be specified, and their data types must match
     * those of the table's key schema. If any attributes are present in the item which are part of an index key schema
     * for the table, their types must match the index key schema.
     * </p>
     * 
     * @return A map of attribute name to attribute values, representing the primary key of an item to be processed by
     *         <i>PutItem</i>. All of the table's primary key attributes must be specified, and their data types must
     *         match those of the table's key schema. If any attributes are present in the item which are part of an
     *         index key schema for the table, their types must match the index key schema.
     */

    public java.util.Map<String, AttributeValue> getItem() {
        return item;
    }

    /**
     * <p>
     * A map of attribute name to attribute values, representing the primary key of an item to be processed by
     * <i>PutItem</i>. All of the table's primary key attributes must be specified, and their data types must match
     * those of the table's key schema. If any attributes are present in the item which are part of an index key schema
     * for the table, their types must match the index key schema.
     * </p>
     * 
     * @param item
     *        A map of attribute name to attribute values, representing the primary key of an item to be processed by
     *        <i>PutItem</i>. All of the table's primary key attributes must be specified, and their data types must
     *        match those of the table's key schema. If any attributes are present in the item which are part of an
     *        index key schema for the table, their types must match the index key schema.
     */

    public void setItem(java.util.Map<String, AttributeValue> item) {
        this.item = item;
    }

    /**
     * <p>
     * A map of attribute name to attribute values, representing the primary key of an item to be processed by
     * <i>PutItem</i>. All of the table's primary key attributes must be specified, and their data types must match
     * those of the table's key schema. If any attributes are present in the item which are part of an index key schema
     * for the table, their types must match the index key schema.
     * </p>
     * 
     * @param item
     *        A map of attribute name to attribute values, representing the primary key of an item to be processed by
     *        <i>PutItem</i>. All of the table's primary key attributes must be specified, and their data types must
     *        match those of the table's key schema. If any attributes are present in the item which are part of an
     *        index key schema for the table, their types must match the index key schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRequest withItem(java.util.Map<String, AttributeValue> item) {
        setItem(item);
        return this;
    }

    public PutRequest addItemEntry(String key, AttributeValue value) {
        if (null == this.item) {
            this.item = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.item.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.item.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Item.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRequest clearItemEntries() {
        this.item = null;
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
        if (getItem() != null)
            sb.append("Item: ").append(getItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRequest == false)
            return false;
        PutRequest other = (PutRequest) obj;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        return hashCode;
    }

    @Override
    public PutRequest clone() {
        try {
            return (PutRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
