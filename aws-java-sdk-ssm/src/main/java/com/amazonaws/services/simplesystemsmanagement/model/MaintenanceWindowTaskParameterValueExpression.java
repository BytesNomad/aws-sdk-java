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
 * <p>
 * Defines the values for a task parameter.
 * </p>
 */
public class MaintenanceWindowTaskParameterValueExpression implements Serializable, Cloneable {

    /**
     * <p>
     * This field contains an array of 0 or more strings, each 1 to 255 characters in length.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * This field contains an array of 0 or more strings, each 1 to 255 characters in length.
     * </p>
     * 
     * @return This field contains an array of 0 or more strings, each 1 to 255 characters in length.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * This field contains an array of 0 or more strings, each 1 to 255 characters in length.
     * </p>
     * 
     * @param values
     *        This field contains an array of 0 or more strings, each 1 to 255 characters in length.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * This field contains an array of 0 or more strings, each 1 to 255 characters in length.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        This field contains an array of 0 or more strings, each 1 to 255 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTaskParameterValueExpression withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This field contains an array of 0 or more strings, each 1 to 255 characters in length.
     * </p>
     * 
     * @param values
     *        This field contains an array of 0 or more strings, each 1 to 255 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTaskParameterValueExpression withValues(java.util.Collection<String> values) {
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

        if (obj instanceof MaintenanceWindowTaskParameterValueExpression == false)
            return false;
        MaintenanceWindowTaskParameterValueExpression other = (MaintenanceWindowTaskParameterValueExpression) obj;
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

        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceWindowTaskParameterValueExpression clone() {
        try {
            return (MaintenanceWindowTaskParameterValueExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
