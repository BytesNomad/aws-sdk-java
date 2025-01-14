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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * 
 */
public class GetDefaultPatchBaselineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the default patch baseline.
     * </p>
     */
    private String baselineId;

    /**
     * <p>
     * The ID of the default patch baseline.
     * </p>
     * 
     * @param baselineId
     *        The ID of the default patch baseline.
     */

    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    /**
     * <p>
     * The ID of the default patch baseline.
     * </p>
     * 
     * @return The ID of the default patch baseline.
     */

    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * <p>
     * The ID of the default patch baseline.
     * </p>
     * 
     * @param baselineId
     *        The ID of the default patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDefaultPatchBaselineResult withBaselineId(String baselineId) {
        setBaselineId(baselineId);
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
        if (getBaselineId() != null)
            sb.append("BaselineId: ").append(getBaselineId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDefaultPatchBaselineResult == false)
            return false;
        GetDefaultPatchBaselineResult other = (GetDefaultPatchBaselineResult) obj;
        if (other.getBaselineId() == null ^ this.getBaselineId() == null)
            return false;
        if (other.getBaselineId() != null && other.getBaselineId().equals(this.getBaselineId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineId() == null) ? 0 : getBaselineId().hashCode());
        return hashCode;
    }

    @Override
    public GetDefaultPatchBaselineResult clone() {
        try {
            return (GetDefaultPatchBaselineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
