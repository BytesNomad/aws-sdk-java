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
package com.amazonaws.services.waf.model;

import java.io.Serializable;

/**
 * 
 */
public class GetWebACLForResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the web ACL that you specified in the <code>GetWebACLForResource</code> request. If there is no
     * associated resource, a null WebACLSummary is returned.
     * </p>
     */
    private WebACLSummary webACLSummary;

    /**
     * <p>
     * Information about the web ACL that you specified in the <code>GetWebACLForResource</code> request. If there is no
     * associated resource, a null WebACLSummary is returned.
     * </p>
     * 
     * @param webACLSummary
     *        Information about the web ACL that you specified in the <code>GetWebACLForResource</code> request. If
     *        there is no associated resource, a null WebACLSummary is returned.
     */

    public void setWebACLSummary(WebACLSummary webACLSummary) {
        this.webACLSummary = webACLSummary;
    }

    /**
     * <p>
     * Information about the web ACL that you specified in the <code>GetWebACLForResource</code> request. If there is no
     * associated resource, a null WebACLSummary is returned.
     * </p>
     * 
     * @return Information about the web ACL that you specified in the <code>GetWebACLForResource</code> request. If
     *         there is no associated resource, a null WebACLSummary is returned.
     */

    public WebACLSummary getWebACLSummary() {
        return this.webACLSummary;
    }

    /**
     * <p>
     * Information about the web ACL that you specified in the <code>GetWebACLForResource</code> request. If there is no
     * associated resource, a null WebACLSummary is returned.
     * </p>
     * 
     * @param webACLSummary
     *        Information about the web ACL that you specified in the <code>GetWebACLForResource</code> request. If
     *        there is no associated resource, a null WebACLSummary is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebACLForResourceResult withWebACLSummary(WebACLSummary webACLSummary) {
        setWebACLSummary(webACLSummary);
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
        if (getWebACLSummary() != null)
            sb.append("WebACLSummary: ").append(getWebACLSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWebACLForResourceResult == false)
            return false;
        GetWebACLForResourceResult other = (GetWebACLForResourceResult) obj;
        if (other.getWebACLSummary() == null ^ this.getWebACLSummary() == null)
            return false;
        if (other.getWebACLSummary() != null && other.getWebACLSummary().equals(this.getWebACLSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebACLSummary() == null) ? 0 : getWebACLSummary().hashCode());
        return hashCode;
    }

    @Override
    public GetWebACLForResourceResult clone() {
        try {
            return (GetWebACLForResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
