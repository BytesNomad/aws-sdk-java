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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DescribeAccountAttributesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Account quota information.
     * </p>
     */
    private java.util.List<AccountQuota> accountQuotas;

    /**
     * <p>
     * Account quota information.
     * </p>
     * 
     * @return Account quota information.
     */

    public java.util.List<AccountQuota> getAccountQuotas() {
        return accountQuotas;
    }

    /**
     * <p>
     * Account quota information.
     * </p>
     * 
     * @param accountQuotas
     *        Account quota information.
     */

    public void setAccountQuotas(java.util.Collection<AccountQuota> accountQuotas) {
        if (accountQuotas == null) {
            this.accountQuotas = null;
            return;
        }

        this.accountQuotas = new java.util.ArrayList<AccountQuota>(accountQuotas);
    }

    /**
     * <p>
     * Account quota information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountQuotas(java.util.Collection)} or {@link #withAccountQuotas(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param accountQuotas
     *        Account quota information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountAttributesResult withAccountQuotas(AccountQuota... accountQuotas) {
        if (this.accountQuotas == null) {
            setAccountQuotas(new java.util.ArrayList<AccountQuota>(accountQuotas.length));
        }
        for (AccountQuota ele : accountQuotas) {
            this.accountQuotas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Account quota information.
     * </p>
     * 
     * @param accountQuotas
     *        Account quota information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountAttributesResult withAccountQuotas(java.util.Collection<AccountQuota> accountQuotas) {
        setAccountQuotas(accountQuotas);
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
        if (getAccountQuotas() != null)
            sb.append("AccountQuotas: ").append(getAccountQuotas());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountAttributesResult == false)
            return false;
        DescribeAccountAttributesResult other = (DescribeAccountAttributesResult) obj;
        if (other.getAccountQuotas() == null ^ this.getAccountQuotas() == null)
            return false;
        if (other.getAccountQuotas() != null && other.getAccountQuotas().equals(this.getAccountQuotas()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountQuotas() == null) ? 0 : getAccountQuotas().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountAttributesResult clone() {
        try {
            return (DescribeAccountAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
