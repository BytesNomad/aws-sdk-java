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
public class GetExecutionHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of events that occurred in the execution.
     * </p>
     */
    private java.util.List<HistoryEvent> events;
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
     * The list of events that occurred in the execution.
     * </p>
     * 
     * @return The list of events that occurred in the execution.
     */

    public java.util.List<HistoryEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * The list of events that occurred in the execution.
     * </p>
     * 
     * @param events
     *        The list of events that occurred in the execution.
     */

    public void setEvents(java.util.Collection<HistoryEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<HistoryEvent>(events);
    }

    /**
     * <p>
     * The list of events that occurred in the execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        The list of events that occurred in the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExecutionHistoryResult withEvents(HistoryEvent... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<HistoryEvent>(events.length));
        }
        for (HistoryEvent ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of events that occurred in the execution.
     * </p>
     * 
     * @param events
     *        The list of events that occurred in the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExecutionHistoryResult withEvents(java.util.Collection<HistoryEvent> events) {
        setEvents(events);
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

    public GetExecutionHistoryResult withNextToken(String nextToken) {
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
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
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

        if (obj instanceof GetExecutionHistoryResult == false)
            return false;
        GetExecutionHistoryResult other = (GetExecutionHistoryResult) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
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

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetExecutionHistoryResult clone() {
        try {
            return (GetExecutionHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
