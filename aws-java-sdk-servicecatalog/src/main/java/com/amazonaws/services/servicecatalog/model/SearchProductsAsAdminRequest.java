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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class SearchProductsAsAdminRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The portfolio identifier.
     * </p>
     */
    private String portfolioId;
    /**
     * <p>
     * The list of filters with which to limit search results. If no search filters are specified, the output is all the
     * products to which the administrator has access.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> filters;
    /**
     * <p>
     * The sort field specifier. If no value is specified, results are not sorted.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order specifier. If no value is specified, results are not sorted.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The page token of the first page retrieved. If null, this retrieves the first page of size <code>PageSize</code>.
     * </p>
     */
    private String pageToken;
    /**
     * <p>
     * The maximum number of items to return in the results. If more results exist than fit in the specified
     * <code>PageSize</code>, the value of <code>NextPageToken</code> in the response is non-null.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * Access level of the source of the product.
     * </p>
     */
    private String productSource;

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @param acceptLanguage
     *        The language code to use for this operation. Supported language codes are as follows:</p>
     *        <p>
     *        "en" (English)
     *        </p>
     *        <p>
     *        "jp" (Japanese)
     *        </p>
     *        <p>
     *        "zh" (Chinese)
     *        </p>
     *        <p>
     *        If no code is specified, "en" is used as the default.
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @return The language code to use for this operation. Supported language codes are as follows:</p>
     *         <p>
     *         "en" (English)
     *         </p>
     *         <p>
     *         "jp" (Japanese)
     *         </p>
     *         <p>
     *         "zh" (Chinese)
     *         </p>
     *         <p>
     *         If no code is specified, "en" is used as the default.
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @param acceptLanguage
     *        The language code to use for this operation. Supported language codes are as follows:</p>
     *        <p>
     *        "en" (English)
     *        </p>
     *        <p>
     *        "jp" (Japanese)
     *        </p>
     *        <p>
     *        "zh" (Chinese)
     *        </p>
     *        <p>
     *        If no code is specified, "en" is used as the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProductsAsAdminRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @param portfolioId
     *        The portfolio identifier.
     */

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @return The portfolio identifier.
     */

    public String getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @param portfolioId
     *        The portfolio identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProductsAsAdminRequest withPortfolioId(String portfolioId) {
        setPortfolioId(portfolioId);
        return this;
    }

    /**
     * <p>
     * The list of filters with which to limit search results. If no search filters are specified, the output is all the
     * products to which the administrator has access.
     * </p>
     * 
     * @return The list of filters with which to limit search results. If no search filters are specified, the output is
     *         all the products to which the administrator has access.
     */

    public java.util.Map<String, java.util.List<String>> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The list of filters with which to limit search results. If no search filters are specified, the output is all the
     * products to which the administrator has access.
     * </p>
     * 
     * @param filters
     *        The list of filters with which to limit search results. If no search filters are specified, the output is
     *        all the products to which the administrator has access.
     */

    public void setFilters(java.util.Map<String, java.util.List<String>> filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The list of filters with which to limit search results. If no search filters are specified, the output is all the
     * products to which the administrator has access.
     * </p>
     * 
     * @param filters
     *        The list of filters with which to limit search results. If no search filters are specified, the output is
     *        all the products to which the administrator has access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProductsAsAdminRequest withFilters(java.util.Map<String, java.util.List<String>> filters) {
        setFilters(filters);
        return this;
    }

    public SearchProductsAsAdminRequest addFiltersEntry(String key, java.util.List<String> value) {
        if (null == this.filters) {
            this.filters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.filters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProductsAsAdminRequest clearFiltersEntries() {
        this.filters = null;
        return this;
    }

    /**
     * <p>
     * The sort field specifier. If no value is specified, results are not sorted.
     * </p>
     * 
     * @param sortBy
     *        The sort field specifier. If no value is specified, results are not sorted.
     * @see ProductViewSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The sort field specifier. If no value is specified, results are not sorted.
     * </p>
     * 
     * @return The sort field specifier. If no value is specified, results are not sorted.
     * @see ProductViewSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The sort field specifier. If no value is specified, results are not sorted.
     * </p>
     * 
     * @param sortBy
     *        The sort field specifier. If no value is specified, results are not sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductViewSortBy
     */

    public SearchProductsAsAdminRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The sort field specifier. If no value is specified, results are not sorted.
     * </p>
     * 
     * @param sortBy
     *        The sort field specifier. If no value is specified, results are not sorted.
     * @see ProductViewSortBy
     */

    public void setSortBy(ProductViewSortBy sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * The sort field specifier. If no value is specified, results are not sorted.
     * </p>
     * 
     * @param sortBy
     *        The sort field specifier. If no value is specified, results are not sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductViewSortBy
     */

    public SearchProductsAsAdminRequest withSortBy(ProductViewSortBy sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The sort order specifier. If no value is specified, results are not sorted.
     * </p>
     * 
     * @param sortOrder
     *        The sort order specifier. If no value is specified, results are not sorted.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order specifier. If no value is specified, results are not sorted.
     * </p>
     * 
     * @return The sort order specifier. If no value is specified, results are not sorted.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order specifier. If no value is specified, results are not sorted.
     * </p>
     * 
     * @param sortOrder
     *        The sort order specifier. If no value is specified, results are not sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SearchProductsAsAdminRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order specifier. If no value is specified, results are not sorted.
     * </p>
     * 
     * @param sortOrder
     *        The sort order specifier. If no value is specified, results are not sorted.
     * @see SortOrder
     */

    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The sort order specifier. If no value is specified, results are not sorted.
     * </p>
     * 
     * @param sortOrder
     *        The sort order specifier. If no value is specified, results are not sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SearchProductsAsAdminRequest withSortOrder(SortOrder sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The page token of the first page retrieved. If null, this retrieves the first page of size <code>PageSize</code>.
     * </p>
     * 
     * @param pageToken
     *        The page token of the first page retrieved. If null, this retrieves the first page of size
     *        <code>PageSize</code>.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The page token of the first page retrieved. If null, this retrieves the first page of size <code>PageSize</code>.
     * </p>
     * 
     * @return The page token of the first page retrieved. If null, this retrieves the first page of size
     *         <code>PageSize</code>.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * The page token of the first page retrieved. If null, this retrieves the first page of size <code>PageSize</code>.
     * </p>
     * 
     * @param pageToken
     *        The page token of the first page retrieved. If null, this retrieves the first page of size
     *        <code>PageSize</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProductsAsAdminRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return in the results. If more results exist than fit in the specified
     * <code>PageSize</code>, the value of <code>NextPageToken</code> in the response is non-null.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to return in the results. If more results exist than fit in the specified
     *        <code>PageSize</code>, the value of <code>NextPageToken</code> in the response is non-null.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return in the results. If more results exist than fit in the specified
     * <code>PageSize</code>, the value of <code>NextPageToken</code> in the response is non-null.
     * </p>
     * 
     * @return The maximum number of items to return in the results. If more results exist than fit in the specified
     *         <code>PageSize</code>, the value of <code>NextPageToken</code> in the response is non-null.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return in the results. If more results exist than fit in the specified
     * <code>PageSize</code>, the value of <code>NextPageToken</code> in the response is non-null.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to return in the results. If more results exist than fit in the specified
     *        <code>PageSize</code>, the value of <code>NextPageToken</code> in the response is non-null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProductsAsAdminRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * Access level of the source of the product.
     * </p>
     * 
     * @param productSource
     *        Access level of the source of the product.
     * @see ProductSource
     */

    public void setProductSource(String productSource) {
        this.productSource = productSource;
    }

    /**
     * <p>
     * Access level of the source of the product.
     * </p>
     * 
     * @return Access level of the source of the product.
     * @see ProductSource
     */

    public String getProductSource() {
        return this.productSource;
    }

    /**
     * <p>
     * Access level of the source of the product.
     * </p>
     * 
     * @param productSource
     *        Access level of the source of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductSource
     */

    public SearchProductsAsAdminRequest withProductSource(String productSource) {
        setProductSource(productSource);
        return this;
    }

    /**
     * <p>
     * Access level of the source of the product.
     * </p>
     * 
     * @param productSource
     *        Access level of the source of the product.
     * @see ProductSource
     */

    public void setProductSource(ProductSource productSource) {
        this.productSource = productSource.toString();
    }

    /**
     * <p>
     * Access level of the source of the product.
     * </p>
     * 
     * @param productSource
     *        Access level of the source of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductSource
     */

    public SearchProductsAsAdminRequest withProductSource(ProductSource productSource) {
        setProductSource(productSource);
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getPortfolioId() != null)
            sb.append("PortfolioId: ").append(getPortfolioId()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getProductSource() != null)
            sb.append("ProductSource: ").append(getProductSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchProductsAsAdminRequest == false)
            return false;
        SearchProductsAsAdminRequest other = (SearchProductsAsAdminRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null && other.getPortfolioId().equals(this.getPortfolioId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getProductSource() == null ^ this.getProductSource() == null)
            return false;
        if (other.getProductSource() != null && other.getProductSource().equals(this.getProductSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getProductSource() == null) ? 0 : getProductSource().hashCode());
        return hashCode;
    }

    @Override
    public SearchProductsAsAdminRequest clone() {
        return (SearchProductsAsAdminRequest) super.clone();
    }

}
