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
 * Provides details of the <code>StartTimer</code> decision.
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
public class StartTimerDecisionAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * <b>Required.</b> The unique ID of the timer.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     */
    private String timerId;
    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent workflow tasks.
     * </p>
     */
    private String control;
    /**
     * <p>
     * <b>Required.</b> The duration to wait before firing the timer.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0.
     * </p>
     */
    private String startToFireTimeout;

    /**
     * <p>
     * <b>Required.</b> The unique ID of the timer.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @param timerId
     *        Required.</b> The unique ID of the timer.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|
     */

    public void setTimerId(String timerId) {
        this.timerId = timerId;
    }

    /**
     * <p>
     * <b>Required.</b> The unique ID of the timer.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @return Required.</b> The unique ID of the timer.</p>
     *         <p>
     *         The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|
     */

    public String getTimerId() {
        return this.timerId;
    }

    /**
     * <p>
     * <b>Required.</b> The unique ID of the timer.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @param timerId
     *        Required.</b> The unique ID of the timer.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTimerDecisionAttributes withTimerId(String timerId) {
        setTimerId(timerId);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent workflow tasks.
     * </p>
     * 
     * @param control
     *        Optional.
     */

    public void setControl(String control) {
        this.control = control;
    }

    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent workflow tasks.
     * </p>
     * 
     * @return Optional.
     */

    public String getControl() {
        return this.control;
    }

    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent workflow tasks.
     * </p>
     * 
     * @param control
     *        Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTimerDecisionAttributes withControl(String control) {
        setControl(control);
        return this;
    }

    /**
     * <p>
     * <b>Required.</b> The duration to wait before firing the timer.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0.
     * </p>
     * 
     * @param startToFireTimeout
     *        Required.</b> The duration to wait before firing the timer.</p>
     */

    public void setStartToFireTimeout(String startToFireTimeout) {
        this.startToFireTimeout = startToFireTimeout;
    }

    /**
     * <p>
     * <b>Required.</b> The duration to wait before firing the timer.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0.
     * </p>
     * 
     * @return Required.</b> The duration to wait before firing the timer.</p>
     */

    public String getStartToFireTimeout() {
        return this.startToFireTimeout;
    }

    /**
     * <p>
     * <b>Required.</b> The duration to wait before firing the timer.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0.
     * </p>
     * 
     * @param startToFireTimeout
     *        Required.</b> The duration to wait before firing the timer.</p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTimerDecisionAttributes withStartToFireTimeout(String startToFireTimeout) {
        setStartToFireTimeout(startToFireTimeout);
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
        if (getTimerId() != null)
            sb.append("TimerId: ").append(getTimerId()).append(",");
        if (getControl() != null)
            sb.append("Control: ").append(getControl()).append(",");
        if (getStartToFireTimeout() != null)
            sb.append("StartToFireTimeout: ").append(getStartToFireTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTimerDecisionAttributes == false)
            return false;
        StartTimerDecisionAttributes other = (StartTimerDecisionAttributes) obj;
        if (other.getTimerId() == null ^ this.getTimerId() == null)
            return false;
        if (other.getTimerId() != null && other.getTimerId().equals(this.getTimerId()) == false)
            return false;
        if (other.getControl() == null ^ this.getControl() == null)
            return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false)
            return false;
        if (other.getStartToFireTimeout() == null ^ this.getStartToFireTimeout() == null)
            return false;
        if (other.getStartToFireTimeout() != null && other.getStartToFireTimeout().equals(this.getStartToFireTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimerId() == null) ? 0 : getTimerId().hashCode());
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode());
        hashCode = prime * hashCode + ((getStartToFireTimeout() == null) ? 0 : getStartToFireTimeout().hashCode());
        return hashCode;
    }

    @Override
    public StartTimerDecisionAttributes clone() {
        try {
            return (StartTimerDecisionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
