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
 * The request to get an invalidation's information.
 * </p>
 */
public class GetInvalidationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The distribution's ID.
     * </p>
     */
    private String distributionId;
    /**
     * <p>
     * The identifier for the invalidation request, for example, <code>IDFDVBD632BHDS5</code>.
     * </p>
     */
    private String id;

    /**
     * Default constructor for GetInvalidationRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public GetInvalidationRequest() {
    }

    /**
     * Constructs a new GetInvalidationRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param distributionId
     *        The distribution's ID.
     * @param id
     *        The identifier for the invalidation request, for example, <code>IDFDVBD632BHDS5</code>.
     */
    public GetInvalidationRequest(String distributionId, String id) {
        setDistributionId(distributionId);
        setId(id);
    }

    /**
     * <p>
     * The distribution's ID.
     * </p>
     * 
     * @param distributionId
     *        The distribution's ID.
     */

    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }

    /**
     * <p>
     * The distribution's ID.
     * </p>
     * 
     * @return The distribution's ID.
     */

    public String getDistributionId() {
        return this.distributionId;
    }

    /**
     * <p>
     * The distribution's ID.
     * </p>
     * 
     * @param distributionId
     *        The distribution's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInvalidationRequest withDistributionId(String distributionId) {
        setDistributionId(distributionId);
        return this;
    }

    /**
     * <p>
     * The identifier for the invalidation request, for example, <code>IDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @param id
     *        The identifier for the invalidation request, for example, <code>IDFDVBD632BHDS5</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the invalidation request, for example, <code>IDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @return The identifier for the invalidation request, for example, <code>IDFDVBD632BHDS5</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the invalidation request, for example, <code>IDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @param id
     *        The identifier for the invalidation request, for example, <code>IDFDVBD632BHDS5</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInvalidationRequest withId(String id) {
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
        if (getDistributionId() != null)
            sb.append("DistributionId: ").append(getDistributionId()).append(",");
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

        if (obj instanceof GetInvalidationRequest == false)
            return false;
        GetInvalidationRequest other = (GetInvalidationRequest) obj;
        if (other.getDistributionId() == null ^ this.getDistributionId() == null)
            return false;
        if (other.getDistributionId() != null && other.getDistributionId().equals(this.getDistributionId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getDistributionId() == null) ? 0 : getDistributionId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public GetInvalidationRequest clone() {
        return (GetInvalidationRequest) super.clone();
    }

}
