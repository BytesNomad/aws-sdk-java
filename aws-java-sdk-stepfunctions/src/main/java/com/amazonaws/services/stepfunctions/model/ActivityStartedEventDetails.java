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
public class ActivityStartedEventDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the worker that the task was assigned to. These names are provided by the workers when calling
     * <a>GetActivityTask</a>.
     * </p>
     */
    private String workerName;

    /**
     * <p>
     * The name of the worker that the task was assigned to. These names are provided by the workers when calling
     * <a>GetActivityTask</a>.
     * </p>
     * 
     * @param workerName
     *        The name of the worker that the task was assigned to. These names are provided by the workers when calling
     *        <a>GetActivityTask</a>.
     */

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    /**
     * <p>
     * The name of the worker that the task was assigned to. These names are provided by the workers when calling
     * <a>GetActivityTask</a>.
     * </p>
     * 
     * @return The name of the worker that the task was assigned to. These names are provided by the workers when
     *         calling <a>GetActivityTask</a>.
     */

    public String getWorkerName() {
        return this.workerName;
    }

    /**
     * <p>
     * The name of the worker that the task was assigned to. These names are provided by the workers when calling
     * <a>GetActivityTask</a>.
     * </p>
     * 
     * @param workerName
     *        The name of the worker that the task was assigned to. These names are provided by the workers when calling
     *        <a>GetActivityTask</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityStartedEventDetails withWorkerName(String workerName) {
        setWorkerName(workerName);
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
        if (getWorkerName() != null)
            sb.append("WorkerName: ").append(getWorkerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivityStartedEventDetails == false)
            return false;
        ActivityStartedEventDetails other = (ActivityStartedEventDetails) obj;
        if (other.getWorkerName() == null ^ this.getWorkerName() == null)
            return false;
        if (other.getWorkerName() != null && other.getWorkerName().equals(this.getWorkerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkerName() == null) ? 0 : getWorkerName().hashCode());
        return hashCode;
    }

    @Override
    public ActivityStartedEventDetails clone() {
        try {
            return (ActivityStartedEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
