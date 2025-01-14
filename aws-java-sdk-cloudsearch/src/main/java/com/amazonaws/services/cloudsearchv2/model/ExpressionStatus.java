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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

/**
 * <p>
 * The value of an <code>Expression</code> and its current status.
 * </p>
 */
public class ExpressionStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The expression that is evaluated for sorting while processing a search request.
     * </p>
     */
    private Expression options;

    private OptionStatus status;

    /**
     * <p>
     * The expression that is evaluated for sorting while processing a search request.
     * </p>
     * 
     * @param options
     *        The expression that is evaluated for sorting while processing a search request.
     */

    public void setOptions(Expression options) {
        this.options = options;
    }

    /**
     * <p>
     * The expression that is evaluated for sorting while processing a search request.
     * </p>
     * 
     * @return The expression that is evaluated for sorting while processing a search request.
     */

    public Expression getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The expression that is evaluated for sorting while processing a search request.
     * </p>
     * 
     * @param options
     *        The expression that is evaluated for sorting while processing a search request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpressionStatus withOptions(Expression options) {
        setOptions(options);
        return this;
    }

    /**
     * @param status
     */

    public void setStatus(OptionStatus status) {
        this.status = status;
    }

    /**
     * @return
     */

    public OptionStatus getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpressionStatus withStatus(OptionStatus status) {
        setStatus(status);
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
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpressionStatus == false)
            return false;
        ExpressionStatus other = (ExpressionStatus) obj;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ExpressionStatus clone() {
        try {
            return (ExpressionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
