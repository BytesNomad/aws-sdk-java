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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * The attributes applicable to a container instance when it is registered.
 * </p>
 */
public class Attribute implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the container instance attribute.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the container instance attribute (at this time, the value here is <code>Null</code>, but this could
     * change in future revisions for expandability).
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the container instance attribute.
     * </p>
     * 
     * @param name
     *        The name of the container instance attribute.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the container instance attribute.
     * </p>
     * 
     * @return The name of the container instance attribute.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the container instance attribute.
     * </p>
     * 
     * @param name
     *        The name of the container instance attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the container instance attribute (at this time, the value here is <code>Null</code>, but this could
     * change in future revisions for expandability).
     * </p>
     * 
     * @param value
     *        The value of the container instance attribute (at this time, the value here is <code>Null</code>, but this
     *        could change in future revisions for expandability).
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the container instance attribute (at this time, the value here is <code>Null</code>, but this could
     * change in future revisions for expandability).
     * </p>
     * 
     * @return The value of the container instance attribute (at this time, the value here is <code>Null</code>, but
     *         this could change in future revisions for expandability).
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the container instance attribute (at this time, the value here is <code>Null</code>, but this could
     * change in future revisions for expandability).
     * </p>
     * 
     * @param value
     *        The value of the container instance attribute (at this time, the value here is <code>Null</code>, but this
     *        could change in future revisions for expandability).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attribute withValue(String value) {
        setValue(value);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attribute == false)
            return false;
        Attribute other = (Attribute) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Attribute clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
