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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateProtectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Friendly name for the <code>Protection</code> you are creating.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * Friendly name for the <code>Protection</code> you are creating.
     * </p>
     * 
     * @param name
     *        Friendly name for the <code>Protection</code> you are creating.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Friendly name for the <code>Protection</code> you are creating.
     * </p>
     * 
     * @return Friendly name for the <code>Protection</code> you are creating.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Friendly name for the <code>Protection</code> you are creating.
     * </p>
     * 
     * @param name
     *        Friendly name for the <code>Protection</code> you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProtectionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
     * </p>
     * 
     * @param resourceArn
     *        The ARN (Amazon Resource Name) of the resource to be protected.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the resource to be protected.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
     * </p>
     * 
     * @param resourceArn
     *        The ARN (Amazon Resource Name) of the resource to be protected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProtectionRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProtectionRequest == false)
            return false;
        CreateProtectionRequest other = (CreateProtectionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateProtectionRequest clone() {
        return (CreateProtectionRequest) super.clone();
    }

}
