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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a <code>DescribeStackSummary</code> request.
 * </p>
 */
public class DescribeStackSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>StackSummary</code> object that contains the results.
     * </p>
     */
    private StackSummary stackSummary;

    /**
     * <p>
     * A <code>StackSummary</code> object that contains the results.
     * </p>
     * 
     * @param stackSummary
     *        A <code>StackSummary</code> object that contains the results.
     */

    public void setStackSummary(StackSummary stackSummary) {
        this.stackSummary = stackSummary;
    }

    /**
     * <p>
     * A <code>StackSummary</code> object that contains the results.
     * </p>
     * 
     * @return A <code>StackSummary</code> object that contains the results.
     */

    public StackSummary getStackSummary() {
        return this.stackSummary;
    }

    /**
     * <p>
     * A <code>StackSummary</code> object that contains the results.
     * </p>
     * 
     * @param stackSummary
     *        A <code>StackSummary</code> object that contains the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackSummaryResult withStackSummary(StackSummary stackSummary) {
        setStackSummary(stackSummary);
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
        if (getStackSummary() != null)
            sb.append("StackSummary: ").append(getStackSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackSummaryResult == false)
            return false;
        DescribeStackSummaryResult other = (DescribeStackSummaryResult) obj;
        if (other.getStackSummary() == null ^ this.getStackSummary() == null)
            return false;
        if (other.getStackSummary() != null && other.getStackSummary().equals(this.getStackSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSummary() == null) ? 0 : getStackSummary().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStackSummaryResult clone() {
        try {
            return (DescribeStackSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
