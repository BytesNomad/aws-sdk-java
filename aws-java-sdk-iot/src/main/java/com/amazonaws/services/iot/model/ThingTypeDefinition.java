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
package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The definition of the thing type, including thing type name and description.
 * </p>
 */
public class ThingTypeDefinition implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing type.
     * </p>
     */
    private String thingTypeName;
    /**
     * <p>
     * The ThingTypeProperties for the thing type.
     * </p>
     */
    private ThingTypeProperties thingTypeProperties;

    private ThingTypeMetadata thingTypeMetadata;

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * 
     * @param thingTypeName
     *        The name of the thing type.
     */

    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * 
     * @return The name of the thing type.
     */

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * 
     * @param thingTypeName
     *        The name of the thing type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingTypeDefinition withThingTypeName(String thingTypeName) {
        setThingTypeName(thingTypeName);
        return this;
    }

    /**
     * <p>
     * The ThingTypeProperties for the thing type.
     * </p>
     * 
     * @param thingTypeProperties
     *        The ThingTypeProperties for the thing type.
     */

    public void setThingTypeProperties(ThingTypeProperties thingTypeProperties) {
        this.thingTypeProperties = thingTypeProperties;
    }

    /**
     * <p>
     * The ThingTypeProperties for the thing type.
     * </p>
     * 
     * @return The ThingTypeProperties for the thing type.
     */

    public ThingTypeProperties getThingTypeProperties() {
        return this.thingTypeProperties;
    }

    /**
     * <p>
     * The ThingTypeProperties for the thing type.
     * </p>
     * 
     * @param thingTypeProperties
     *        The ThingTypeProperties for the thing type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingTypeDefinition withThingTypeProperties(ThingTypeProperties thingTypeProperties) {
        setThingTypeProperties(thingTypeProperties);
        return this;
    }

    /**
     * @param thingTypeMetadata
     */

    public void setThingTypeMetadata(ThingTypeMetadata thingTypeMetadata) {
        this.thingTypeMetadata = thingTypeMetadata;
    }

    /**
     * @return
     */

    public ThingTypeMetadata getThingTypeMetadata() {
        return this.thingTypeMetadata;
    }

    /**
     * @param thingTypeMetadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingTypeDefinition withThingTypeMetadata(ThingTypeMetadata thingTypeMetadata) {
        setThingTypeMetadata(thingTypeMetadata);
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
        if (getThingTypeName() != null)
            sb.append("ThingTypeName: ").append(getThingTypeName()).append(",");
        if (getThingTypeProperties() != null)
            sb.append("ThingTypeProperties: ").append(getThingTypeProperties()).append(",");
        if (getThingTypeMetadata() != null)
            sb.append("ThingTypeMetadata: ").append(getThingTypeMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingTypeDefinition == false)
            return false;
        ThingTypeDefinition other = (ThingTypeDefinition) obj;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getThingTypeProperties() == null ^ this.getThingTypeProperties() == null)
            return false;
        if (other.getThingTypeProperties() != null && other.getThingTypeProperties().equals(this.getThingTypeProperties()) == false)
            return false;
        if (other.getThingTypeMetadata() == null ^ this.getThingTypeMetadata() == null)
            return false;
        if (other.getThingTypeMetadata() != null && other.getThingTypeMetadata().equals(this.getThingTypeMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode + ((getThingTypeProperties() == null) ? 0 : getThingTypeProperties().hashCode());
        hashCode = prime * hashCode + ((getThingTypeMetadata() == null) ? 0 : getThingTypeMetadata().hashCode());
        return hashCode;
    }

    @Override
    public ThingTypeDefinition clone() {
        try {
            return (ThingTypeDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
