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
 * Provides details of the <code>RequestCancelActivityTask</code> decision.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
 * </p>
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
 * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
 * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
 * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
 * Amazon SWF Workflows</a>.
 * </p>
 */
public class RequestCancelActivityTaskDecisionAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>activityId</code> of the activity task to be canceled.
     * </p>
     */
    private String activityId;

    /**
     * <p>
     * The <code>activityId</code> of the activity task to be canceled.
     * </p>
     * 
     * @param activityId
     *        The <code>activityId</code> of the activity task to be canceled.
     */

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * <p>
     * The <code>activityId</code> of the activity task to be canceled.
     * </p>
     * 
     * @return The <code>activityId</code> of the activity task to be canceled.
     */

    public String getActivityId() {
        return this.activityId;
    }

    /**
     * <p>
     * The <code>activityId</code> of the activity task to be canceled.
     * </p>
     * 
     * @param activityId
     *        The <code>activityId</code> of the activity task to be canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCancelActivityTaskDecisionAttributes withActivityId(String activityId) {
        setActivityId(activityId);
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
        if (getActivityId() != null)
            sb.append("ActivityId: ").append(getActivityId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestCancelActivityTaskDecisionAttributes == false)
            return false;
        RequestCancelActivityTaskDecisionAttributes other = (RequestCancelActivityTaskDecisionAttributes) obj;
        if (other.getActivityId() == null ^ this.getActivityId() == null)
            return false;
        if (other.getActivityId() != null && other.getActivityId().equals(this.getActivityId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivityId() == null) ? 0 : getActivityId().hashCode());
        return hashCode;
    }

    @Override
    public RequestCancelActivityTaskDecisionAttributes clone() {
        try {
            return (RequestCancelActivityTaskDecisionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
