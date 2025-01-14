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
package com.amazonaws.services.xray.model;

import java.io.Serializable;

/**
 * <p>
 * Information about requests that failed with a 5xx Server Error status code.
 * </p>
 */
public class FaultStatistics implements Serializable, Cloneable {

    /**
     * <p>
     * The number of requests that failed with untracked 5xx Server Error status codes.
     * </p>
     */
    private Long otherCount;
    /**
     * <p>
     * The total number of requests that failed with a 5xx Server Error status code.
     * </p>
     */
    private Long totalCount;

    /**
     * <p>
     * The number of requests that failed with untracked 5xx Server Error status codes.
     * </p>
     * 
     * @param otherCount
     *        The number of requests that failed with untracked 5xx Server Error status codes.
     */

    public void setOtherCount(Long otherCount) {
        this.otherCount = otherCount;
    }

    /**
     * <p>
     * The number of requests that failed with untracked 5xx Server Error status codes.
     * </p>
     * 
     * @return The number of requests that failed with untracked 5xx Server Error status codes.
     */

    public Long getOtherCount() {
        return this.otherCount;
    }

    /**
     * <p>
     * The number of requests that failed with untracked 5xx Server Error status codes.
     * </p>
     * 
     * @param otherCount
     *        The number of requests that failed with untracked 5xx Server Error status codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaultStatistics withOtherCount(Long otherCount) {
        setOtherCount(otherCount);
        return this;
    }

    /**
     * <p>
     * The total number of requests that failed with a 5xx Server Error status code.
     * </p>
     * 
     * @param totalCount
     *        The total number of requests that failed with a 5xx Server Error status code.
     */

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of requests that failed with a 5xx Server Error status code.
     * </p>
     * 
     * @return The total number of requests that failed with a 5xx Server Error status code.
     */

    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of requests that failed with a 5xx Server Error status code.
     * </p>
     * 
     * @param totalCount
     *        The total number of requests that failed with a 5xx Server Error status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FaultStatistics withTotalCount(Long totalCount) {
        setTotalCount(totalCount);
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
        if (getOtherCount() != null)
            sb.append("OtherCount: ").append(getOtherCount()).append(",");
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FaultStatistics == false)
            return false;
        FaultStatistics other = (FaultStatistics) obj;
        if (other.getOtherCount() == null ^ this.getOtherCount() == null)
            return false;
        if (other.getOtherCount() != null && other.getOtherCount().equals(this.getOtherCount()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOtherCount() == null) ? 0 : getOtherCount().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public FaultStatistics clone() {
        try {
            return (FaultStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
