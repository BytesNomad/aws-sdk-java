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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;

/**
 * 
 */
public class PutRecordBatchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of records that might have failed processing.
     * </p>
     */
    private Integer failedPutCount;
    /**
     * <p>
     * The results array. For each record, the index of the response element is the same as the index used in the
     * request array.
     * </p>
     */
    private java.util.List<PutRecordBatchResponseEntry> requestResponses;

    /**
     * <p>
     * The number of records that might have failed processing.
     * </p>
     * 
     * @param failedPutCount
     *        The number of records that might have failed processing.
     */

    public void setFailedPutCount(Integer failedPutCount) {
        this.failedPutCount = failedPutCount;
    }

    /**
     * <p>
     * The number of records that might have failed processing.
     * </p>
     * 
     * @return The number of records that might have failed processing.
     */

    public Integer getFailedPutCount() {
        return this.failedPutCount;
    }

    /**
     * <p>
     * The number of records that might have failed processing.
     * </p>
     * 
     * @param failedPutCount
     *        The number of records that might have failed processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordBatchResult withFailedPutCount(Integer failedPutCount) {
        setFailedPutCount(failedPutCount);
        return this;
    }

    /**
     * <p>
     * The results array. For each record, the index of the response element is the same as the index used in the
     * request array.
     * </p>
     * 
     * @return The results array. For each record, the index of the response element is the same as the index used in
     *         the request array.
     */

    public java.util.List<PutRecordBatchResponseEntry> getRequestResponses() {
        return requestResponses;
    }

    /**
     * <p>
     * The results array. For each record, the index of the response element is the same as the index used in the
     * request array.
     * </p>
     * 
     * @param requestResponses
     *        The results array. For each record, the index of the response element is the same as the index used in the
     *        request array.
     */

    public void setRequestResponses(java.util.Collection<PutRecordBatchResponseEntry> requestResponses) {
        if (requestResponses == null) {
            this.requestResponses = null;
            return;
        }

        this.requestResponses = new java.util.ArrayList<PutRecordBatchResponseEntry>(requestResponses);
    }

    /**
     * <p>
     * The results array. For each record, the index of the response element is the same as the index used in the
     * request array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequestResponses(java.util.Collection)} or {@link #withRequestResponses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param requestResponses
     *        The results array. For each record, the index of the response element is the same as the index used in the
     *        request array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordBatchResult withRequestResponses(PutRecordBatchResponseEntry... requestResponses) {
        if (this.requestResponses == null) {
            setRequestResponses(new java.util.ArrayList<PutRecordBatchResponseEntry>(requestResponses.length));
        }
        for (PutRecordBatchResponseEntry ele : requestResponses) {
            this.requestResponses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The results array. For each record, the index of the response element is the same as the index used in the
     * request array.
     * </p>
     * 
     * @param requestResponses
     *        The results array. For each record, the index of the response element is the same as the index used in the
     *        request array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordBatchResult withRequestResponses(java.util.Collection<PutRecordBatchResponseEntry> requestResponses) {
        setRequestResponses(requestResponses);
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
        if (getFailedPutCount() != null)
            sb.append("FailedPutCount: ").append(getFailedPutCount()).append(",");
        if (getRequestResponses() != null)
            sb.append("RequestResponses: ").append(getRequestResponses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRecordBatchResult == false)
            return false;
        PutRecordBatchResult other = (PutRecordBatchResult) obj;
        if (other.getFailedPutCount() == null ^ this.getFailedPutCount() == null)
            return false;
        if (other.getFailedPutCount() != null && other.getFailedPutCount().equals(this.getFailedPutCount()) == false)
            return false;
        if (other.getRequestResponses() == null ^ this.getRequestResponses() == null)
            return false;
        if (other.getRequestResponses() != null && other.getRequestResponses().equals(this.getRequestResponses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedPutCount() == null) ? 0 : getFailedPutCount().hashCode());
        hashCode = prime * hashCode + ((getRequestResponses() == null) ? 0 : getRequestResponses().hashCode());
        return hashCode;
    }

    @Override
    public PutRecordBatchResult clone() {
        try {
            return (PutRecordBatchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
