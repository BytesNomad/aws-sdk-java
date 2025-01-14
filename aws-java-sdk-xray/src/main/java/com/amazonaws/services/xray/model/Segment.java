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
package com.amazonaws.services.xray.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a segment
 * </p>
 */
public class Segment implements Serializable, Cloneable {

    /**
     * <p>
     * The segment's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The segment document.
     * </p>
     */
    private String document;

    /**
     * <p>
     * The segment's ID.
     * </p>
     * 
     * @param id
     *        The segment's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The segment's ID.
     * </p>
     * 
     * @return The segment's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The segment's ID.
     * </p>
     * 
     * @param id
     *        The segment's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The segment document.
     * </p>
     * 
     * @param document
     *        The segment document.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The segment document.
     * </p>
     * 
     * @return The segment document.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The segment document.
     * </p>
     * 
     * @param document
     *        The segment document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withDocument(String document) {
        setDocument(document);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Segment == false)
            return false;
        Segment other = (Segment) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        return hashCode;
    }

    @Override
    public Segment clone() {
        try {
            return (Segment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
