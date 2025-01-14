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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;

/**
 * <p>
 * Provides updates to the parallelism count.
 * </p>
 */
public class InputParallelismUpdate implements Serializable, Cloneable {

    /**
     * <p>
     * Number of in-application streams to create for the specified streaming source.
     * </p>
     */
    private Integer countUpdate;

    /**
     * <p>
     * Number of in-application streams to create for the specified streaming source.
     * </p>
     * 
     * @param countUpdate
     *        Number of in-application streams to create for the specified streaming source.
     */

    public void setCountUpdate(Integer countUpdate) {
        this.countUpdate = countUpdate;
    }

    /**
     * <p>
     * Number of in-application streams to create for the specified streaming source.
     * </p>
     * 
     * @return Number of in-application streams to create for the specified streaming source.
     */

    public Integer getCountUpdate() {
        return this.countUpdate;
    }

    /**
     * <p>
     * Number of in-application streams to create for the specified streaming source.
     * </p>
     * 
     * @param countUpdate
     *        Number of in-application streams to create for the specified streaming source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputParallelismUpdate withCountUpdate(Integer countUpdate) {
        setCountUpdate(countUpdate);
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
        if (getCountUpdate() != null)
            sb.append("CountUpdate: ").append(getCountUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputParallelismUpdate == false)
            return false;
        InputParallelismUpdate other = (InputParallelismUpdate) obj;
        if (other.getCountUpdate() == null ^ this.getCountUpdate() == null)
            return false;
        if (other.getCountUpdate() != null && other.getCountUpdate().equals(this.getCountUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountUpdate() == null) ? 0 : getCountUpdate().hashCode());
        return hashCode;
    }

    @Override
    public InputParallelismUpdate clone() {
        try {
            return (InputParallelismUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
