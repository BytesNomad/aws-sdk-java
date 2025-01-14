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
public class StopExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution to stop.
     * </p>
     */
    private String executionArn;
    /**
     * <p>
     * An arbitrary error code that identifies the cause of the termination.
     * </p>
     */
    private String error;
    /**
     * <p>
     * A more detailed explanation of the cause of the termination.
     * </p>
     */
    private String cause;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution to stop.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) of the execution to stop.
     */

    public void setExecutionArn(String executionArn) {
        this.executionArn = executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution to stop.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the execution to stop.
     */

    public String getExecutionArn() {
        return this.executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution to stop.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) of the execution to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopExecutionRequest withExecutionArn(String executionArn) {
        setExecutionArn(executionArn);
        return this;
    }

    /**
     * <p>
     * An arbitrary error code that identifies the cause of the termination.
     * </p>
     * 
     * @param error
     *        An arbitrary error code that identifies the cause of the termination.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * An arbitrary error code that identifies the cause of the termination.
     * </p>
     * 
     * @return An arbitrary error code that identifies the cause of the termination.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * An arbitrary error code that identifies the cause of the termination.
     * </p>
     * 
     * @param error
     *        An arbitrary error code that identifies the cause of the termination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopExecutionRequest withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * A more detailed explanation of the cause of the termination.
     * </p>
     * 
     * @param cause
     *        A more detailed explanation of the cause of the termination.
     */

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * A more detailed explanation of the cause of the termination.
     * </p>
     * 
     * @return A more detailed explanation of the cause of the termination.
     */

    public String getCause() {
        return this.cause;
    }

    /**
     * <p>
     * A more detailed explanation of the cause of the termination.
     * </p>
     * 
     * @param cause
     *        A more detailed explanation of the cause of the termination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopExecutionRequest withCause(String cause) {
        setCause(cause);
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
        if (getExecutionArn() != null)
            sb.append("ExecutionArn: ").append(getExecutionArn()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getCause() != null)
            sb.append("Cause: ").append(getCause());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopExecutionRequest == false)
            return false;
        StopExecutionRequest other = (StopExecutionRequest) obj;
        if (other.getExecutionArn() == null ^ this.getExecutionArn() == null)
            return false;
        if (other.getExecutionArn() != null && other.getExecutionArn().equals(this.getExecutionArn()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getCause() == null ^ this.getCause() == null)
            return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionArn() == null) ? 0 : getExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        return hashCode;
    }

    @Override
    public StopExecutionRequest clone() {
        return (StopExecutionRequest) super.clone();
    }

}
