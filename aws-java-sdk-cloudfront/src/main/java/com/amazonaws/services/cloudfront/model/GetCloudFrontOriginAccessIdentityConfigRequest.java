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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The origin access identity's configuration information. For more information, see
 * <a>CloudFrontOriginAccessIdentityConfigComplexType</a>.
 * </p>
 */
public class GetCloudFrontOriginAccessIdentityConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identity's ID.
     * </p>
     */
    private String id;

    /**
     * Default constructor for GetCloudFrontOriginAccessIdentityConfigRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize the object after creating it.
     */
    public GetCloudFrontOriginAccessIdentityConfigRequest() {
    }

    /**
     * Constructs a new GetCloudFrontOriginAccessIdentityConfigRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize any additional object members.
     * 
     * @param id
     *        The identity's ID.
     */
    public GetCloudFrontOriginAccessIdentityConfigRequest(String id) {
        setId(id);
    }

    /**
     * <p>
     * The identity's ID.
     * </p>
     * 
     * @param id
     *        The identity's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identity's ID.
     * </p>
     * 
     * @return The identity's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identity's ID.
     * </p>
     * 
     * @param id
     *        The identity's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCloudFrontOriginAccessIdentityConfigRequest withId(String id) {
        setId(id);
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
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCloudFrontOriginAccessIdentityConfigRequest == false)
            return false;
        GetCloudFrontOriginAccessIdentityConfigRequest other = (GetCloudFrontOriginAccessIdentityConfigRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public GetCloudFrontOriginAccessIdentityConfigRequest clone() {
        return (GetCloudFrontOriginAccessIdentityConfigRequest) super.clone();
    }

}
