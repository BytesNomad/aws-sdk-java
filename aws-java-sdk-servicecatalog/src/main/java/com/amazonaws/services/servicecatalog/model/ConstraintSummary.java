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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * An administrator-specified constraint to apply when provisioning a product.
 * </p>
 */
public class ConstraintSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the constraint.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The text description of the constraint.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The type of the constraint.
     * </p>
     * 
     * @param type
     *        The type of the constraint.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the constraint.
     * </p>
     * 
     * @return The type of the constraint.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the constraint.
     * </p>
     * 
     * @param type
     *        The type of the constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConstraintSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The text description of the constraint.
     * </p>
     * 
     * @param description
     *        The text description of the constraint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The text description of the constraint.
     * </p>
     * 
     * @return The text description of the constraint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The text description of the constraint.
     * </p>
     * 
     * @param description
     *        The text description of the constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConstraintSummary withDescription(String description) {
        setDescription(description);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConstraintSummary == false)
            return false;
        ConstraintSummary other = (ConstraintSummary) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ConstraintSummary clone() {
        try {
            return (ConstraintSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
