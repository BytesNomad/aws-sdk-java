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
 * Represents the output of a <i>GetItem</i> operation.
 * </p>
 */
public class GetItemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A map of attribute names to <i>AttributeValue</i> objects, as specified by <i>AttributesToGet</i>.
     * </p>
     */
    private java.util.Map<String, AttributeValue> item;

    private ConsumedCapacity consumedCapacity;

    /**
     * <p>
     * A map of attribute names to <i>AttributeValue</i> objects, as specified by <i>AttributesToGet</i>.
     * </p>
     * 
     * @return A map of attribute names to <i>AttributeValue</i> objects, as specified by <i>AttributesToGet</i>.
     */

    public java.util.Map<String, AttributeValue> getItem() {
        return item;
    }

    /**
     * <p>
     * A map of attribute names to <i>AttributeValue</i> objects, as specified by <i>AttributesToGet</i>.
     * </p>
     * 
     * @param item
     *        A map of attribute names to <i>AttributeValue</i> objects, as specified by <i>AttributesToGet</i>.
     */

    public void setItem(java.util.Map<String, AttributeValue> item) {
        this.item = item;
    }

    /**
     * <p>
     * A map of attribute names to <i>AttributeValue</i> objects, as specified by <i>AttributesToGet</i>.
     * </p>
     * 
     * @param item
     *        A map of attribute names to <i>AttributeValue</i> objects, as specified by <i>AttributesToGet</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetItemResult withItem(java.util.Map<String, AttributeValue> item) {
        setItem(item);
        return this;
    }

    public GetItemResult addItemEntry(String key, AttributeValue value) {
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

    public GetItemResult clearItemEntries() {
        this.item = null;
        return this;
    }

    /**
     * @param consumedCapacity
     */

    public void setConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
    }

    /**
     * @return
     */

    public ConsumedCapacity getConsumedCapacity() {
        return this.consumedCapacity;
    }

    /**
     * @param consumedCapacity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetItemResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
        setConsumedCapacity(consumedCapacity);
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
            sb.append("Item: ").append(getItem()).append(",");
        if (getConsumedCapacity() != null)
            sb.append("ConsumedCapacity: ").append(getConsumedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetItemResult == false)
            return false;
        GetItemResult other = (GetItemResult) obj;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null)
            return false;
        if (other.getConsumedCapacity() != null && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode());
        return hashCode;
    }

    @Override
    public GetItemResult clone() {
        try {
            return (GetItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
