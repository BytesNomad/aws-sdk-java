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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeStacksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of stack details.
     * </p>
     */
    private java.util.List<Stack> stacks;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of stack details.
     * </p>
     * 
     * @return The list of stack details.
     */

    public java.util.List<Stack> getStacks() {
        return stacks;
    }

    /**
     * <p>
     * The list of stack details.
     * </p>
     * 
     * @param stacks
     *        The list of stack details.
     */

    public void setStacks(java.util.Collection<Stack> stacks) {
        if (stacks == null) {
            this.stacks = null;
            return;
        }

        this.stacks = new java.util.ArrayList<Stack>(stacks);
    }

    /**
     * <p>
     * The list of stack details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStacks(java.util.Collection)} or {@link #withStacks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param stacks
     *        The list of stack details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStacksResult withStacks(Stack... stacks) {
        if (this.stacks == null) {
            setStacks(new java.util.ArrayList<Stack>(stacks.length));
        }
        for (Stack ele : stacks) {
            this.stacks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of stack details.
     * </p>
     * 
     * @param stacks
     *        The list of stack details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStacksResult withStacks(java.util.Collection<Stack> stacks) {
        setStacks(stacks);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStacksResult withNextToken(String nextToken) {
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
        if (getStacks() != null)
            sb.append("Stacks: ").append(getStacks()).append(",");
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

        if (obj instanceof DescribeStacksResult == false)
            return false;
        DescribeStacksResult other = (DescribeStacksResult) obj;
        if (other.getStacks() == null ^ this.getStacks() == null)
            return false;
        if (other.getStacks() != null && other.getStacks().equals(this.getStacks()) == false)
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

        hashCode = prime * hashCode + ((getStacks() == null) ? 0 : getStacks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStacksResult clone() {
        try {
            return (DescribeStacksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
