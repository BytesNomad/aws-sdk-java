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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>CreateOpenIDConnectProvider</a> request.
 * </p>
 */
public class CreateOpenIDConnectProviderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new IAM OpenID Connect provider that is created. For more information, see
     * <a>OpenIDConnectProviderListEntry</a>.
     * </p>
     */
    private String openIDConnectProviderArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new IAM OpenID Connect provider that is created. For more information, see
     * <a>OpenIDConnectProviderListEntry</a>.
     * </p>
     * 
     * @param openIDConnectProviderArn
     *        The Amazon Resource Name (ARN) of the new IAM OpenID Connect provider that is created. For more
     *        information, see <a>OpenIDConnectProviderListEntry</a>.
     */

    public void setOpenIDConnectProviderArn(String openIDConnectProviderArn) {
        this.openIDConnectProviderArn = openIDConnectProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new IAM OpenID Connect provider that is created. For more information, see
     * <a>OpenIDConnectProviderListEntry</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the new IAM OpenID Connect provider that is created. For more
     *         information, see <a>OpenIDConnectProviderListEntry</a>.
     */

    public String getOpenIDConnectProviderArn() {
        return this.openIDConnectProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new IAM OpenID Connect provider that is created. For more information, see
     * <a>OpenIDConnectProviderListEntry</a>.
     * </p>
     * 
     * @param openIDConnectProviderArn
     *        The Amazon Resource Name (ARN) of the new IAM OpenID Connect provider that is created. For more
     *        information, see <a>OpenIDConnectProviderListEntry</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOpenIDConnectProviderResult withOpenIDConnectProviderArn(String openIDConnectProviderArn) {
        setOpenIDConnectProviderArn(openIDConnectProviderArn);
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
        if (getOpenIDConnectProviderArn() != null)
            sb.append("OpenIDConnectProviderArn: ").append(getOpenIDConnectProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOpenIDConnectProviderResult == false)
            return false;
        CreateOpenIDConnectProviderResult other = (CreateOpenIDConnectProviderResult) obj;
        if (other.getOpenIDConnectProviderArn() == null ^ this.getOpenIDConnectProviderArn() == null)
            return false;
        if (other.getOpenIDConnectProviderArn() != null && other.getOpenIDConnectProviderArn().equals(this.getOpenIDConnectProviderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpenIDConnectProviderArn() == null) ? 0 : getOpenIDConnectProviderArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateOpenIDConnectProviderResult clone() {
        try {
            return (CreateOpenIDConnectProviderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
