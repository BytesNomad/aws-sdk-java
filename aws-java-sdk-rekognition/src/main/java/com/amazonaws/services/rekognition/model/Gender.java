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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Gender of the face and the confidence level in the determination.
 * </p>
 */
public class Gender implements Serializable, Cloneable {

    /**
     * <p>
     * Gender of the face.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Level of confidence in the determination.
     * </p>
     */
    private Float confidence;

    /**
     * <p>
     * Gender of the face.
     * </p>
     * 
     * @param value
     *        Gender of the face.
     * @see GenderType
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Gender of the face.
     * </p>
     * 
     * @return Gender of the face.
     * @see GenderType
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Gender of the face.
     * </p>
     * 
     * @param value
     *        Gender of the face.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GenderType
     */

    public Gender withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Gender of the face.
     * </p>
     * 
     * @param value
     *        Gender of the face.
     * @see GenderType
     */

    public void setValue(GenderType value) {
        this.value = value.toString();
    }

    /**
     * <p>
     * Gender of the face.
     * </p>
     * 
     * @param value
     *        Gender of the face.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GenderType
     */

    public Gender withValue(GenderType value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Level of confidence in the determination.
     * </p>
     * 
     * @param confidence
     *        Level of confidence in the determination.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Level of confidence in the determination.
     * </p>
     * 
     * @return Level of confidence in the determination.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * Level of confidence in the determination.
     * </p>
     * 
     * @param confidence
     *        Level of confidence in the determination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gender withConfidence(Float confidence) {
        setConfidence(confidence);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Gender == false)
            return false;
        Gender other = (Gender) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public Gender clone() {
        try {
            return (Gender) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
