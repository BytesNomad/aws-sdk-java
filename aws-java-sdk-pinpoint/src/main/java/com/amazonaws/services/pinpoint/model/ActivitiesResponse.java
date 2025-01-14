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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * 
 */
public class ActivitiesResponse implements Serializable, Cloneable {

    /** List of campaign activities */
    private java.util.List<ActivityResponse> item;

    /**
     * List of campaign activities
     * 
     * @return List of campaign activities
     */

    public java.util.List<ActivityResponse> getItem() {
        return item;
    }

    /**
     * List of campaign activities
     * 
     * @param item
     *        List of campaign activities
     */

    public void setItem(java.util.Collection<ActivityResponse> item) {
        if (item == null) {
            this.item = null;
            return;
        }

        this.item = new java.util.ArrayList<ActivityResponse>(item);
    }

    /**
     * List of campaign activities
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItem(java.util.Collection)} or {@link #withItem(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param item
     *        List of campaign activities
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivitiesResponse withItem(ActivityResponse... item) {
        if (this.item == null) {
            setItem(new java.util.ArrayList<ActivityResponse>(item.length));
        }
        for (ActivityResponse ele : item) {
            this.item.add(ele);
        }
        return this;
    }

    /**
     * List of campaign activities
     * 
     * @param item
     *        List of campaign activities
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivitiesResponse withItem(java.util.Collection<ActivityResponse> item) {
        setItem(item);
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

        if (obj instanceof ActivitiesResponse == false)
            return false;
        ActivitiesResponse other = (ActivitiesResponse) obj;
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
    public ActivitiesResponse clone() {
        try {
            return (ActivitiesResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
