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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;

/**
 * <p>
 * Represents an operating-system neutral workspace for running and managing tests.
 * </p>
 */
public class Project implements Serializable, Cloneable {

    /**
     * <p>
     * The project's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The project's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * When the project was created.
     * </p>
     */
    private java.util.Date created;

    /**
     * <p>
     * The project's ARN.
     * </p>
     * 
     * @param arn
     *        The project's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The project's ARN.
     * </p>
     * 
     * @return The project's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The project's ARN.
     * </p>
     * 
     * @param arn
     *        The project's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The project's name.
     * </p>
     * 
     * @param name
     *        The project's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The project's name.
     * </p>
     * 
     * @return The project's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The project's name.
     * </p>
     * 
     * @param name
     *        The project's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * When the project was created.
     * </p>
     * 
     * @param created
     *        When the project was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * When the project was created.
     * </p>
     * 
     * @return When the project was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * When the project was created.
     * </p>
     * 
     * @param created
     *        When the project was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withCreated(java.util.Date created) {
        setCreated(created);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Project == false)
            return false;
        Project other = (Project) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        return hashCode;
    }

    @Override
    public Project clone() {
        try {
            return (Project) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
