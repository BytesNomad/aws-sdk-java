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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;

/**
 * 
 */
public class ListActivitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of activities.
     * </p>
     */
    private java.util.List<ActivityListItem> activities;
    /**
     * <p>
     * If a <code>nextToken</code> is returned, there are more results available. To retrieve the next page of results,
     * make the call again using the returned token in <code>nextToken</code>. Keep all other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of activities.
     * </p>
     * 
     * @return The list of activities.
     */

    public java.util.List<ActivityListItem> getActivities() {
        return activities;
    }

    /**
     * <p>
     * The list of activities.
     * </p>
     * 
     * @param activities
     *        The list of activities.
     */

    public void setActivities(java.util.Collection<ActivityListItem> activities) {
        if (activities == null) {
            this.activities = null;
            return;
        }

        this.activities = new java.util.ArrayList<ActivityListItem>(activities);
    }

    /**
     * <p>
     * The list of activities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActivities(java.util.Collection)} or {@link #withActivities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param activities
     *        The list of activities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListActivitiesResult withActivities(ActivityListItem... activities) {
        if (this.activities == null) {
            setActivities(new java.util.ArrayList<ActivityListItem>(activities.length));
        }
        for (ActivityListItem ele : activities) {
            this.activities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of activities.
     * </p>
     * 
     * @param activities
     *        The list of activities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListActivitiesResult withActivities(java.util.Collection<ActivityListItem> activities) {
        setActivities(activities);
        return this;
    }

    /**
     * <p>
     * If a <code>nextToken</code> is returned, there are more results available. To retrieve the next page of results,
     * make the call again using the returned token in <code>nextToken</code>. Keep all other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @param nextToken
     *        If a <code>nextToken</code> is returned, there are more results available. To retrieve the next page of
     *        results, make the call again using the returned token in <code>nextToken</code>. Keep all other arguments
     *        unchanged.</p>
     *        <p>
     *        The configured <code>maxResults</code> determines how many results can be returned in a single call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a <code>nextToken</code> is returned, there are more results available. To retrieve the next page of results,
     * make the call again using the returned token in <code>nextToken</code>. Keep all other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @return If a <code>nextToken</code> is returned, there are more results available. To retrieve the next page of
     *         results, make the call again using the returned token in <code>nextToken</code>. Keep all other arguments
     *         unchanged.</p>
     *         <p>
     *         The configured <code>maxResults</code> determines how many results can be returned in a single call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a <code>nextToken</code> is returned, there are more results available. To retrieve the next page of results,
     * make the call again using the returned token in <code>nextToken</code>. Keep all other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @param nextToken
     *        If a <code>nextToken</code> is returned, there are more results available. To retrieve the next page of
     *        results, make the call again using the returned token in <code>nextToken</code>. Keep all other arguments
     *        unchanged.</p>
     *        <p>
     *        The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListActivitiesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getActivities() != null)
            sb.append("Activities: ").append(getActivities()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListActivitiesResult == false)
            return false;
        ListActivitiesResult other = (ListActivitiesResult) obj;
        if (other.getActivities() == null ^ this.getActivities() == null)
            return false;
        if (other.getActivities() != null && other.getActivities().equals(this.getActivities()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivities() == null) ? 0 : getActivities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListActivitiesResult clone() {
        try {
            return (ListActivitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
