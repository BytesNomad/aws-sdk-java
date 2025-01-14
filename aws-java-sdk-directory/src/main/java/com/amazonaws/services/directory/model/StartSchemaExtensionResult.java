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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * 
 */
public class StartSchemaExtensionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the schema extension that will be applied.
     * </p>
     */
    private String schemaExtensionId;

    /**
     * <p>
     * The identifier of the schema extension that will be applied.
     * </p>
     * 
     * @param schemaExtensionId
     *        The identifier of the schema extension that will be applied.
     */

    public void setSchemaExtensionId(String schemaExtensionId) {
        this.schemaExtensionId = schemaExtensionId;
    }

    /**
     * <p>
     * The identifier of the schema extension that will be applied.
     * </p>
     * 
     * @return The identifier of the schema extension that will be applied.
     */

    public String getSchemaExtensionId() {
        return this.schemaExtensionId;
    }

    /**
     * <p>
     * The identifier of the schema extension that will be applied.
     * </p>
     * 
     * @param schemaExtensionId
     *        The identifier of the schema extension that will be applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSchemaExtensionResult withSchemaExtensionId(String schemaExtensionId) {
        setSchemaExtensionId(schemaExtensionId);
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
        if (getSchemaExtensionId() != null)
            sb.append("SchemaExtensionId: ").append(getSchemaExtensionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSchemaExtensionResult == false)
            return false;
        StartSchemaExtensionResult other = (StartSchemaExtensionResult) obj;
        if (other.getSchemaExtensionId() == null ^ this.getSchemaExtensionId() == null)
            return false;
        if (other.getSchemaExtensionId() != null && other.getSchemaExtensionId().equals(this.getSchemaExtensionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaExtensionId() == null) ? 0 : getSchemaExtensionId().hashCode());
        return hashCode;
    }

    @Override
    public StartSchemaExtensionResult clone() {
        try {
            return (StartSchemaExtensionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
