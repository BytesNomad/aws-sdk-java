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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;

/**
 * <p>
 * Used to filter the workflow executions in visibility APIs by their <code>workflowId</code>.
 * </p>
 */
public class WorkflowExecutionFilter implements Serializable, Cloneable {

    /**
     * <p>
     * The workflowId to pass of match the criteria of this filter.
     * </p>
     */
    private String workflowId;

    /**
     * <p>
     * The workflowId to pass of match the criteria of this filter.
     * </p>
     * 
     * @param workflowId
     *        The workflowId to pass of match the criteria of this filter.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * The workflowId to pass of match the criteria of this filter.
     * </p>
     * 
     * @return The workflowId to pass of match the criteria of this filter.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * The workflowId to pass of match the criteria of this filter.
     * </p>
     * 
     * @param workflowId
     *        The workflowId to pass of match the criteria of this filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionFilter withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
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
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowExecutionFilter == false)
            return false;
        WorkflowExecutionFilter other = (WorkflowExecutionFilter) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowExecutionFilter clone() {
        try {
            return (WorkflowExecutionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
