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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetActivityTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the activity to retrieve tasks from.
     * </p>
     */
    private String activityArn;
    /**
     * <p>
     * An arbitrary name may be provided in order to identify the worker that the task is assigned to. This name will be
     * used when it is logged in the execution history.
     * </p>
     */
    private String workerName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the activity to retrieve tasks from.
     * </p>
     * 
     * @param activityArn
     *        The Amazon Resource Name (ARN) of the activity to retrieve tasks from.
     */

    public void setActivityArn(String activityArn) {
        this.activityArn = activityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the activity to retrieve tasks from.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the activity to retrieve tasks from.
     */

    public String getActivityArn() {
        return this.activityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the activity to retrieve tasks from.
     * </p>
     * 
     * @param activityArn
     *        The Amazon Resource Name (ARN) of the activity to retrieve tasks from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActivityTaskRequest withActivityArn(String activityArn) {
        setActivityArn(activityArn);
        return this;
    }

    /**
     * <p>
     * An arbitrary name may be provided in order to identify the worker that the task is assigned to. This name will be
     * used when it is logged in the execution history.
     * </p>
     * 
     * @param workerName
     *        An arbitrary name may be provided in order to identify the worker that the task is assigned to. This name
     *        will be used when it is logged in the execution history.
     */

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    /**
     * <p>
     * An arbitrary name may be provided in order to identify the worker that the task is assigned to. This name will be
     * used when it is logged in the execution history.
     * </p>
     * 
     * @return An arbitrary name may be provided in order to identify the worker that the task is assigned to. This name
     *         will be used when it is logged in the execution history.
     */

    public String getWorkerName() {
        return this.workerName;
    }

    /**
     * <p>
     * An arbitrary name may be provided in order to identify the worker that the task is assigned to. This name will be
     * used when it is logged in the execution history.
     * </p>
     * 
     * @param workerName
     *        An arbitrary name may be provided in order to identify the worker that the task is assigned to. This name
     *        will be used when it is logged in the execution history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActivityTaskRequest withWorkerName(String workerName) {
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
        if (getActivityArn() != null)
            sb.append("ActivityArn: ").append(getActivityArn()).append(",");
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

        if (obj instanceof GetActivityTaskRequest == false)
            return false;
        GetActivityTaskRequest other = (GetActivityTaskRequest) obj;
        if (other.getActivityArn() == null ^ this.getActivityArn() == null)
            return false;
        if (other.getActivityArn() != null && other.getActivityArn().equals(this.getActivityArn()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getActivityArn() == null) ? 0 : getActivityArn().hashCode());
        hashCode = prime * hashCode + ((getWorkerName() == null) ? 0 : getWorkerName().hashCode());
        return hashCode;
    }

    @Override
    public GetActivityTaskRequest clone() {
        return (GetActivityTaskRequest) super.clone();
    }

}
