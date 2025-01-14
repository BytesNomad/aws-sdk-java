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
 * 
 */
public class DescribeProductResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The summary metadata about the specified product.
     * </p>
     */
    private ProductViewSummary productViewSummary;
    /**
     * <p>
     * A list of provisioning artifact objects for the specified product. The <code>ProvisioningArtifacts</code>
     * parameter represent the ways the specified product can be provisioned.
     * </p>
     */
    private java.util.List<ProvisioningArtifact> provisioningArtifacts;

    /**
     * <p>
     * The summary metadata about the specified product.
     * </p>
     * 
     * @param productViewSummary
     *        The summary metadata about the specified product.
     */

    public void setProductViewSummary(ProductViewSummary productViewSummary) {
        this.productViewSummary = productViewSummary;
    }

    /**
     * <p>
     * The summary metadata about the specified product.
     * </p>
     * 
     * @return The summary metadata about the specified product.
     */

    public ProductViewSummary getProductViewSummary() {
        return this.productViewSummary;
    }

    /**
     * <p>
     * The summary metadata about the specified product.
     * </p>
     * 
     * @param productViewSummary
     *        The summary metadata about the specified product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductResult withProductViewSummary(ProductViewSummary productViewSummary) {
        setProductViewSummary(productViewSummary);
        return this;
    }

    /**
     * <p>
     * A list of provisioning artifact objects for the specified product. The <code>ProvisioningArtifacts</code>
     * parameter represent the ways the specified product can be provisioned.
     * </p>
     * 
     * @return A list of provisioning artifact objects for the specified product. The <code>ProvisioningArtifacts</code>
     *         parameter represent the ways the specified product can be provisioned.
     */

    public java.util.List<ProvisioningArtifact> getProvisioningArtifacts() {
        return provisioningArtifacts;
    }

    /**
     * <p>
     * A list of provisioning artifact objects for the specified product. The <code>ProvisioningArtifacts</code>
     * parameter represent the ways the specified product can be provisioned.
     * </p>
     * 
     * @param provisioningArtifacts
     *        A list of provisioning artifact objects for the specified product. The <code>ProvisioningArtifacts</code>
     *        parameter represent the ways the specified product can be provisioned.
     */

    public void setProvisioningArtifacts(java.util.Collection<ProvisioningArtifact> provisioningArtifacts) {
        if (provisioningArtifacts == null) {
            this.provisioningArtifacts = null;
            return;
        }

        this.provisioningArtifacts = new java.util.ArrayList<ProvisioningArtifact>(provisioningArtifacts);
    }

    /**
     * <p>
     * A list of provisioning artifact objects for the specified product. The <code>ProvisioningArtifacts</code>
     * parameter represent the ways the specified product can be provisioned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisioningArtifacts(java.util.Collection)} or
     * {@link #withProvisioningArtifacts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisioningArtifacts
     *        A list of provisioning artifact objects for the specified product. The <code>ProvisioningArtifacts</code>
     *        parameter represent the ways the specified product can be provisioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductResult withProvisioningArtifacts(ProvisioningArtifact... provisioningArtifacts) {
        if (this.provisioningArtifacts == null) {
            setProvisioningArtifacts(new java.util.ArrayList<ProvisioningArtifact>(provisioningArtifacts.length));
        }
        for (ProvisioningArtifact ele : provisioningArtifacts) {
            this.provisioningArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of provisioning artifact objects for the specified product. The <code>ProvisioningArtifacts</code>
     * parameter represent the ways the specified product can be provisioned.
     * </p>
     * 
     * @param provisioningArtifacts
     *        A list of provisioning artifact objects for the specified product. The <code>ProvisioningArtifacts</code>
     *        parameter represent the ways the specified product can be provisioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductResult withProvisioningArtifacts(java.util.Collection<ProvisioningArtifact> provisioningArtifacts) {
        setProvisioningArtifacts(provisioningArtifacts);
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
        if (getProductViewSummary() != null)
            sb.append("ProductViewSummary: ").append(getProductViewSummary()).append(",");
        if (getProvisioningArtifacts() != null)
            sb.append("ProvisioningArtifacts: ").append(getProvisioningArtifacts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProductResult == false)
            return false;
        DescribeProductResult other = (DescribeProductResult) obj;
        if (other.getProductViewSummary() == null ^ this.getProductViewSummary() == null)
            return false;
        if (other.getProductViewSummary() != null && other.getProductViewSummary().equals(this.getProductViewSummary()) == false)
            return false;
        if (other.getProvisioningArtifacts() == null ^ this.getProvisioningArtifacts() == null)
            return false;
        if (other.getProvisioningArtifacts() != null && other.getProvisioningArtifacts().equals(this.getProvisioningArtifacts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductViewSummary() == null) ? 0 : getProductViewSummary().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifacts() == null) ? 0 : getProvisioningArtifacts().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProductResult clone() {
        try {
            return (DescribeProductResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
