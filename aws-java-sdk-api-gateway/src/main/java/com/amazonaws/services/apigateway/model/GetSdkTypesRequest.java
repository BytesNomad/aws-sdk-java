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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Get the <a>SdkTypes</a> collection.
 * </p>
 */
public class GetSdkTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The position of the last fetched element in the <a>SdkTypes</a> collection.
     * </p>
     */
    private String position;
    /**
     * <p>
     * The maximum number of <a>SdkType</a> instances to be returned.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The position of the last fetched element in the <a>SdkTypes</a> collection.
     * </p>
     * 
     * @param position
     *        The position of the last fetched element in the <a>SdkTypes</a> collection.
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * The position of the last fetched element in the <a>SdkTypes</a> collection.
     * </p>
     * 
     * @return The position of the last fetched element in the <a>SdkTypes</a> collection.
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The position of the last fetched element in the <a>SdkTypes</a> collection.
     * </p>
     * 
     * @param position
     *        The position of the last fetched element in the <a>SdkTypes</a> collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkTypesRequest withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The maximum number of <a>SdkType</a> instances to be returned.
     * </p>
     * 
     * @param limit
     *        The maximum number of <a>SdkType</a> instances to be returned.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of <a>SdkType</a> instances to be returned.
     * </p>
     * 
     * @return The maximum number of <a>SdkType</a> instances to be returned.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of <a>SdkType</a> instances to be returned.
     * </p>
     * 
     * @param limit
     *        The maximum number of <a>SdkType</a> instances to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkTypesRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSdkTypesRequest == false)
            return false;
        GetSdkTypesRequest other = (GetSdkTypesRequest) obj;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public GetSdkTypesRequest clone() {
        return (GetSdkTypesRequest) super.clone();
    }

}
