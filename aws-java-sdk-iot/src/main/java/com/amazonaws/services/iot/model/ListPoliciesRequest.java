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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the ListPolicies operation.
 * </p>
 */
public class ListPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The result page size.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * Specifies the order for results. If true, the results are returned in ascending creation order.
     * </p>
     */
    private Boolean ascendingOrder;

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @return The marker for the next set of results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The result page size.
     * </p>
     * 
     * @param pageSize
     *        The result page size.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The result page size.
     * </p>
     * 
     * @return The result page size.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The result page size.
     * </p>
     * 
     * @param pageSize
     *        The result page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * Specifies the order for results. If true, the results are returned in ascending creation order.
     * </p>
     * 
     * @param ascendingOrder
     *        Specifies the order for results. If true, the results are returned in ascending creation order.
     */

    public void setAscendingOrder(Boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
    }

    /**
     * <p>
     * Specifies the order for results. If true, the results are returned in ascending creation order.
     * </p>
     * 
     * @return Specifies the order for results. If true, the results are returned in ascending creation order.
     */

    public Boolean getAscendingOrder() {
        return this.ascendingOrder;
    }

    /**
     * <p>
     * Specifies the order for results. If true, the results are returned in ascending creation order.
     * </p>
     * 
     * @param ascendingOrder
     *        Specifies the order for results. If true, the results are returned in ascending creation order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesRequest withAscendingOrder(Boolean ascendingOrder) {
        setAscendingOrder(ascendingOrder);
        return this;
    }

    /**
     * <p>
     * Specifies the order for results. If true, the results are returned in ascending creation order.
     * </p>
     * 
     * @return Specifies the order for results. If true, the results are returned in ascending creation order.
     */

    public Boolean isAscendingOrder() {
        return this.ascendingOrder;
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getAscendingOrder() != null)
            sb.append("AscendingOrder: ").append(getAscendingOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPoliciesRequest == false)
            return false;
        ListPoliciesRequest other = (ListPoliciesRequest) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getAscendingOrder() == null ^ this.getAscendingOrder() == null)
            return false;
        if (other.getAscendingOrder() != null && other.getAscendingOrder().equals(this.getAscendingOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getAscendingOrder() == null) ? 0 : getAscendingOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListPoliciesRequest clone() {
        return (ListPoliciesRequest) super.clone();
    }

}
