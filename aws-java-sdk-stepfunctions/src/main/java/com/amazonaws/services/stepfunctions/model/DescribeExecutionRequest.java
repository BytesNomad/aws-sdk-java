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
public class DescribeExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution to describe.
     * </p>
     */
    private String executionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution to describe.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) of the execution to describe.
     */

    public void setExecutionArn(String executionArn) {
        this.executionArn = executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution to describe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the execution to describe.
     */

    public String getExecutionArn() {
        return this.executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution to describe.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) of the execution to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionRequest withExecutionArn(String executionArn) {
        setExecutionArn(executionArn);
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
            sb.append("ExecutionArn: ").append(getExecutionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExecutionRequest == false)
            return false;
        DescribeExecutionRequest other = (DescribeExecutionRequest) obj;
        if (other.getExecutionArn() == null ^ this.getExecutionArn() == null)
            return false;
        if (other.getExecutionArn() != null && other.getExecutionArn().equals(this.getExecutionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionArn() == null) ? 0 : getExecutionArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExecutionRequest clone() {
        return (DescribeExecutionRequest) super.clone();
    }

}
