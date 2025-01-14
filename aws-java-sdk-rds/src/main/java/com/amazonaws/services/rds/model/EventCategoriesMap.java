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
 * Contains the results of a successful invocation of the <a>DescribeEventCategories</a> action.
 * </p>
 */
public class EventCategoriesMap implements Serializable, Cloneable {

    /**
     * <p>
     * The source type that the returned categories belong to
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The event categories for the specified source type
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> eventCategories;

    /**
     * <p>
     * The source type that the returned categories belong to
     * </p>
     * 
     * @param sourceType
     *        The source type that the returned categories belong to
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type that the returned categories belong to
     * </p>
     * 
     * @return The source type that the returned categories belong to
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source type that the returned categories belong to
     * </p>
     * 
     * @param sourceType
     *        The source type that the returned categories belong to
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventCategoriesMap withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The event categories for the specified source type
     * </p>
     * 
     * @return The event categories for the specified source type
     */

    public java.util.List<String> getEventCategories() {
        if (eventCategories == null) {
            eventCategories = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return eventCategories;
    }

    /**
     * <p>
     * The event categories for the specified source type
     * </p>
     * 
     * @param eventCategories
     *        The event categories for the specified source type
     */

    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        this.eventCategories = new com.amazonaws.internal.SdkInternalList<String>(eventCategories);
    }

    /**
     * <p>
     * The event categories for the specified source type
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategories(java.util.Collection)} or {@link #withEventCategories(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventCategories
     *        The event categories for the specified source type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventCategoriesMap withEventCategories(String... eventCategories) {
        if (this.eventCategories == null) {
            setEventCategories(new com.amazonaws.internal.SdkInternalList<String>(eventCategories.length));
        }
        for (String ele : eventCategories) {
            this.eventCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event categories for the specified source type
     * </p>
     * 
     * @param eventCategories
     *        The event categories for the specified source type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventCategoriesMap withEventCategories(java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
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
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getEventCategories() != null)
            sb.append("EventCategories: ").append(getEventCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventCategoriesMap == false)
            return false;
        EventCategoriesMap other = (EventCategoriesMap) obj;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getEventCategories() == null ^ this.getEventCategories() == null)
            return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode());
        return hashCode;
    }

    @Override
    public EventCategoriesMap clone() {
        try {
            return (EventCategoriesMap) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
