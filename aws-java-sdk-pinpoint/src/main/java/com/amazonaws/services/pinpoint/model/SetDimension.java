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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * 
 */
public class SetDimension implements Serializable, Cloneable {

    /**
     * The type of dimension: INCLUSIVE – Endpoints that match the criteria are included in the segment. EXCLUSIVE –
     * Endpoints that match the criteria are excluded from the segment.
     */
    private String dimensionType;
    /**
     * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded
     * from the segment, depending on the setting for Type.
     */
    private java.util.List<String> values;

    /**
     * The type of dimension: INCLUSIVE – Endpoints that match the criteria are included in the segment. EXCLUSIVE –
     * Endpoints that match the criteria are excluded from the segment.
     * 
     * @param dimensionType
     *        The type of dimension: INCLUSIVE – Endpoints that match the criteria are included in the segment.
     *        EXCLUSIVE – Endpoints that match the criteria are excluded from the segment.
     * @see DimensionType
     */

    public void setDimensionType(String dimensionType) {
        this.dimensionType = dimensionType;
    }

    /**
     * The type of dimension: INCLUSIVE – Endpoints that match the criteria are included in the segment. EXCLUSIVE –
     * Endpoints that match the criteria are excluded from the segment.
     * 
     * @return The type of dimension: INCLUSIVE – Endpoints that match the criteria are included in the segment.
     *         EXCLUSIVE – Endpoints that match the criteria are excluded from the segment.
     * @see DimensionType
     */

    public String getDimensionType() {
        return this.dimensionType;
    }

    /**
     * The type of dimension: INCLUSIVE – Endpoints that match the criteria are included in the segment. EXCLUSIVE –
     * Endpoints that match the criteria are excluded from the segment.
     * 
     * @param dimensionType
     *        The type of dimension: INCLUSIVE – Endpoints that match the criteria are included in the segment.
     *        EXCLUSIVE – Endpoints that match the criteria are excluded from the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionType
     */

    public SetDimension withDimensionType(String dimensionType) {
        setDimensionType(dimensionType);
        return this;
    }

    /**
     * The type of dimension: INCLUSIVE – Endpoints that match the criteria are included in the segment. EXCLUSIVE –
     * Endpoints that match the criteria are excluded from the segment.
     * 
     * @param dimensionType
     *        The type of dimension: INCLUSIVE – Endpoints that match the criteria are included in the segment.
     *        EXCLUSIVE – Endpoints that match the criteria are excluded from the segment.
     * @see DimensionType
     */

    public void setDimensionType(DimensionType dimensionType) {
        this.dimensionType = dimensionType.toString();
    }

    /**
     * The type of dimension: INCLUSIVE – Endpoints that match the criteria are included in the segment. EXCLUSIVE –
     * Endpoints that match the criteria are excluded from the segment.
     * 
     * @param dimensionType
     *        The type of dimension: INCLUSIVE – Endpoints that match the criteria are included in the segment.
     *        EXCLUSIVE – Endpoints that match the criteria are excluded from the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionType
     */

    public SetDimension withDimensionType(DimensionType dimensionType) {
        setDimensionType(dimensionType);
        return this;
    }

    /**
     * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded
     * from the segment, depending on the setting for Type.
     * 
     * @return The criteria values for the segment dimension. Endpoints with matching attribute values are included or
     *         excluded from the segment, depending on the setting for Type.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded
     * from the segment, depending on the setting for Type.
     * 
     * @param values
     *        The criteria values for the segment dimension. Endpoints with matching attribute values are included or
     *        excluded from the segment, depending on the setting for Type.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded
     * from the segment, depending on the setting for Type.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The criteria values for the segment dimension. Endpoints with matching attribute values are included or
     *        excluded from the segment, depending on the setting for Type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetDimension withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded
     * from the segment, depending on the setting for Type.
     * 
     * @param values
     *        The criteria values for the segment dimension. Endpoints with matching attribute values are included or
     *        excluded from the segment, depending on the setting for Type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetDimension withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getDimensionType() != null)
            sb.append("DimensionType: ").append(getDimensionType()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetDimension == false)
            return false;
        SetDimension other = (SetDimension) obj;
        if (other.getDimensionType() == null ^ this.getDimensionType() == null)
            return false;
        if (other.getDimensionType() != null && other.getDimensionType().equals(this.getDimensionType()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensionType() == null) ? 0 : getDimensionType().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public SetDimension clone() {
        try {
            return (SetDimension) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
