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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListClosedWorkflowExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that contains the workflow executions to list.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * If specified, the workflow executions are included in the returned results based on whether their start times are
     * within the range specified by this filter. Also, if this parameter is specified, the returned results are ordered
     * by their start times.
     * </p>
     * <note><code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one
     * of these in a request but not both.</note>
     */
    private ExecutionTimeFilter startTimeFilter;
    /**
     * <p>
     * If specified, the workflow executions are included in the returned results based on whether their close times are
     * within the range specified by this filter. Also, if this parameter is specified, the returned results are ordered
     * by their close times.
     * </p>
     * <note><code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one
     * of these in a request but not both.</note>
     */
    private ExecutionTimeFilter closeTimeFilter;
    /**
     * <p>
     * If specified, only workflow executions matching the workflow ID specified in the filter are returned.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     */
    private WorkflowExecutionFilter executionFilter;
    /**
     * <p>
     * If specified, only workflow executions that match this <i>close status</i> are listed. For example, if TERMINATED
     * is specified, then only TERMINATED workflow executions are listed.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     */
    private CloseStatusFilter closeStatusFilter;
    /**
     * <p>
     * If specified, only executions of the type specified in the filter are returned.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     */
    private WorkflowTypeFilter typeFilter;
    /**
     * <p>
     * If specified, only executions that have the matching tag are listed.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     */
    private TagFilter tagFilter;
    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     */
    private String nextPageToken;
    /**
     * <p>
     * The maximum number of results that will be returned per call. <code>nextPageToken</code> can be used to obtain
     * futher pages of results. The default is 1000, which is the maximum allowed page size. You can, however, specify a
     * page size <i>smaller</i> than the maximum.
     * </p>
     * <p>
     * This is an upper limit only; the actual number of results returned per call may be fewer than the specified
     * maximum.
     * </p>
     */
    private Integer maximumPageSize;
    /**
     * <p>
     * When set to <code>true</code>, returns the results in reverse order. By default the results are returned in
     * descending order of the start or the close time of the executions.
     * </p>
     */
    private Boolean reverseOrder;

    /**
     * <p>
     * The name of the domain that contains the workflow executions to list.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the workflow executions to list.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the workflow executions to list.
     * </p>
     * 
     * @return The name of the domain that contains the workflow executions to list.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that contains the workflow executions to list.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the workflow executions to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClosedWorkflowExecutionsRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * If specified, the workflow executions are included in the returned results based on whether their start times are
     * within the range specified by this filter. Also, if this parameter is specified, the returned results are ordered
     * by their start times.
     * </p>
     * <note><code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one
     * of these in a request but not both.</note>
     * 
     * @param startTimeFilter
     *        If specified, the workflow executions are included in the returned results based on whether their start
     *        times are within the range specified by this filter. Also, if this parameter is specified, the returned
     *        results are ordered by their start times.</p> <note><code>startTimeFilter</code> and
     *        <code>closeTimeFilter</code> are mutually exclusive. You must specify one of these in a request but not
     *        both.
     */

    public void setStartTimeFilter(ExecutionTimeFilter startTimeFilter) {
        this.startTimeFilter = startTimeFilter;
    }

    /**
     * <p>
     * If specified, the workflow executions are included in the returned results based on whether their start times are
     * within the range specified by this filter. Also, if this parameter is specified, the returned results are ordered
     * by their start times.
     * </p>
     * <note><code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one
     * of these in a request but not both.</note>
     * 
     * @return If specified, the workflow executions are included in the returned results based on whether their start
     *         times are within the range specified by this filter. Also, if this parameter is specified, the returned
     *         results are ordered by their start times.</p> <note><code>startTimeFilter</code> and
     *         <code>closeTimeFilter</code> are mutually exclusive. You must specify one of these in a request but not
     *         both.
     */

    public ExecutionTimeFilter getStartTimeFilter() {
        return this.startTimeFilter;
    }

    /**
     * <p>
     * If specified, the workflow executions are included in the returned results based on whether their start times are
     * within the range specified by this filter. Also, if this parameter is specified, the returned results are ordered
     * by their start times.
     * </p>
     * <note><code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one
     * of these in a request but not both.</note>
     * 
     * @param startTimeFilter
     *        If specified, the workflow executions are included in the returned results based on whether their start
     *        times are within the range specified by this filter. Also, if this parameter is specified, the returned
     *        results are ordered by their start times.</p> <note><code>startTimeFilter</code> and
     *        <code>closeTimeFilter</code> are mutually exclusive. You must specify one of these in a request but not
     *        both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClosedWorkflowExecutionsRequest withStartTimeFilter(ExecutionTimeFilter startTimeFilter) {
        setStartTimeFilter(startTimeFilter);
        return this;
    }

    /**
     * <p>
     * If specified, the workflow executions are included in the returned results based on whether their close times are
     * within the range specified by this filter. Also, if this parameter is specified, the returned results are ordered
     * by their close times.
     * </p>
     * <note><code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one
     * of these in a request but not both.</note>
     * 
     * @param closeTimeFilter
     *        If specified, the workflow executions are included in the returned results based on whether their close
     *        times are within the range specified by this filter. Also, if this parameter is specified, the returned
     *        results are ordered by their close times.</p> <note><code>startTimeFilter</code> and
     *        <code>closeTimeFilter</code> are mutually exclusive. You must specify one of these in a request but not
     *        both.
     */

    public void setCloseTimeFilter(ExecutionTimeFilter closeTimeFilter) {
        this.closeTimeFilter = closeTimeFilter;
    }

    /**
     * <p>
     * If specified, the workflow executions are included in the returned results based on whether their close times are
     * within the range specified by this filter. Also, if this parameter is specified, the returned results are ordered
     * by their close times.
     * </p>
     * <note><code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one
     * of these in a request but not both.</note>
     * 
     * @return If specified, the workflow executions are included in the returned results based on whether their close
     *         times are within the range specified by this filter. Also, if this parameter is specified, the returned
     *         results are ordered by their close times.</p> <note><code>startTimeFilter</code> and
     *         <code>closeTimeFilter</code> are mutually exclusive. You must specify one of these in a request but not
     *         both.
     */

    public ExecutionTimeFilter getCloseTimeFilter() {
        return this.closeTimeFilter;
    }

    /**
     * <p>
     * If specified, the workflow executions are included in the returned results based on whether their close times are
     * within the range specified by this filter. Also, if this parameter is specified, the returned results are ordered
     * by their close times.
     * </p>
     * <note><code>startTimeFilter</code> and <code>closeTimeFilter</code> are mutually exclusive. You must specify one
     * of these in a request but not both.</note>
     * 
     * @param closeTimeFilter
     *        If specified, the workflow executions are included in the returned results based on whether their close
     *        times are within the range specified by this filter. Also, if this parameter is specified, the returned
     *        results are ordered by their close times.</p> <note><code>startTimeFilter</code> and
     *        <code>closeTimeFilter</code> are mutually exclusive. You must specify one of these in a request but not
     *        both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClosedWorkflowExecutionsRequest withCloseTimeFilter(ExecutionTimeFilter closeTimeFilter) {
        setCloseTimeFilter(closeTimeFilter);
        return this;
    }

    /**
     * <p>
     * If specified, only workflow executions matching the workflow ID specified in the filter are returned.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     * 
     * @param executionFilter
     *        If specified, only workflow executions matching the workflow ID specified in the filter are returned.</p>
     *        <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     */

    public void setExecutionFilter(WorkflowExecutionFilter executionFilter) {
        this.executionFilter = executionFilter;
    }

    /**
     * <p>
     * If specified, only workflow executions matching the workflow ID specified in the filter are returned.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     * 
     * @return If specified, only workflow executions matching the workflow ID specified in the filter are returned.</p>
     *         <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     */

    public WorkflowExecutionFilter getExecutionFilter() {
        return this.executionFilter;
    }

    /**
     * <p>
     * If specified, only workflow executions matching the workflow ID specified in the filter are returned.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     * 
     * @param executionFilter
     *        If specified, only workflow executions matching the workflow ID specified in the filter are returned.</p>
     *        <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClosedWorkflowExecutionsRequest withExecutionFilter(WorkflowExecutionFilter executionFilter) {
        setExecutionFilter(executionFilter);
        return this;
    }

    /**
     * <p>
     * If specified, only workflow executions that match this <i>close status</i> are listed. For example, if TERMINATED
     * is specified, then only TERMINATED workflow executions are listed.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     * 
     * @param closeStatusFilter
     *        If specified, only workflow executions that match this <i>close status</i> are listed. For example, if
     *        TERMINATED is specified, then only TERMINATED workflow executions are listed.</p> <note>
     *        <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     */

    public void setCloseStatusFilter(CloseStatusFilter closeStatusFilter) {
        this.closeStatusFilter = closeStatusFilter;
    }

    /**
     * <p>
     * If specified, only workflow executions that match this <i>close status</i> are listed. For example, if TERMINATED
     * is specified, then only TERMINATED workflow executions are listed.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     * 
     * @return If specified, only workflow executions that match this <i>close status</i> are listed. For example, if
     *         TERMINATED is specified, then only TERMINATED workflow executions are listed.</p> <note>
     *         <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     */

    public CloseStatusFilter getCloseStatusFilter() {
        return this.closeStatusFilter;
    }

    /**
     * <p>
     * If specified, only workflow executions that match this <i>close status</i> are listed. For example, if TERMINATED
     * is specified, then only TERMINATED workflow executions are listed.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     * 
     * @param closeStatusFilter
     *        If specified, only workflow executions that match this <i>close status</i> are listed. For example, if
     *        TERMINATED is specified, then only TERMINATED workflow executions are listed.</p> <note>
     *        <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClosedWorkflowExecutionsRequest withCloseStatusFilter(CloseStatusFilter closeStatusFilter) {
        setCloseStatusFilter(closeStatusFilter);
        return this;
    }

    /**
     * <p>
     * If specified, only executions of the type specified in the filter are returned.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     * 
     * @param typeFilter
     *        If specified, only executions of the type specified in the filter are returned.</p> <note>
     *        <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     */

    public void setTypeFilter(WorkflowTypeFilter typeFilter) {
        this.typeFilter = typeFilter;
    }

    /**
     * <p>
     * If specified, only executions of the type specified in the filter are returned.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     * 
     * @return If specified, only executions of the type specified in the filter are returned.</p> <note>
     *         <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     */

    public WorkflowTypeFilter getTypeFilter() {
        return this.typeFilter;
    }

    /**
     * <p>
     * If specified, only executions of the type specified in the filter are returned.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     * 
     * @param typeFilter
     *        If specified, only executions of the type specified in the filter are returned.</p> <note>
     *        <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClosedWorkflowExecutionsRequest withTypeFilter(WorkflowTypeFilter typeFilter) {
        setTypeFilter(typeFilter);
        return this;
    }

    /**
     * <p>
     * If specified, only executions that have the matching tag are listed.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     * 
     * @param tagFilter
     *        If specified, only executions that have the matching tag are listed.</p> <note>
     *        <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     */

    public void setTagFilter(TagFilter tagFilter) {
        this.tagFilter = tagFilter;
    }

    /**
     * <p>
     * If specified, only executions that have the matching tag are listed.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     * 
     * @return If specified, only executions that have the matching tag are listed.</p> <note>
     *         <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *         <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     */

    public TagFilter getTagFilter() {
        return this.tagFilter;
    }

    /**
     * <p>
     * If specified, only executions that have the matching tag are listed.
     * </p>
     * <note><code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     * <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.</note>
     * 
     * @param tagFilter
     *        If specified, only executions that have the matching tag are listed.</p> <note>
     *        <code>closeStatusFilter</code>, <code>executionFilter</code>, <code>typeFilter</code> and
     *        <code>tagFilter</code> are mutually exclusive. You can specify at most one of these in a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClosedWorkflowExecutionsRequest withTagFilter(TagFilter tagFilter) {
        setTagFilter(tagFilter);
        return this;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @param nextPageToken
     *        If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To
     *        retrieve the next page of results, make the call again using the returned token in
     *        <code>nextPageToken</code>. Keep all other arguments unchanged.</p>
     *        <p>
     *        The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @return If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To
     *         retrieve the next page of results, make the call again using the returned token in
     *         <code>nextPageToken</code>. Keep all other arguments unchanged.</p>
     *         <p>
     *         The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @param nextPageToken
     *        If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To
     *        retrieve the next page of results, make the call again using the returned token in
     *        <code>nextPageToken</code>. Keep all other arguments unchanged.</p>
     *        <p>
     *        The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClosedWorkflowExecutionsRequest withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results that will be returned per call. <code>nextPageToken</code> can be used to obtain
     * futher pages of results. The default is 1000, which is the maximum allowed page size. You can, however, specify a
     * page size <i>smaller</i> than the maximum.
     * </p>
     * <p>
     * This is an upper limit only; the actual number of results returned per call may be fewer than the specified
     * maximum.
     * </p>
     * 
     * @param maximumPageSize
     *        The maximum number of results that will be returned per call. <code>nextPageToken</code> can be used to
     *        obtain futher pages of results. The default is 1000, which is the maximum allowed page size. You can,
     *        however, specify a page size <i>smaller</i> than the maximum.</p>
     *        <p>
     *        This is an upper limit only; the actual number of results returned per call may be fewer than the
     *        specified maximum.
     */

    public void setMaximumPageSize(Integer maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
    }

    /**
     * <p>
     * The maximum number of results that will be returned per call. <code>nextPageToken</code> can be used to obtain
     * futher pages of results. The default is 1000, which is the maximum allowed page size. You can, however, specify a
     * page size <i>smaller</i> than the maximum.
     * </p>
     * <p>
     * This is an upper limit only; the actual number of results returned per call may be fewer than the specified
     * maximum.
     * </p>
     * 
     * @return The maximum number of results that will be returned per call. <code>nextPageToken</code> can be used to
     *         obtain futher pages of results. The default is 1000, which is the maximum allowed page size. You can,
     *         however, specify a page size <i>smaller</i> than the maximum.</p>
     *         <p>
     *         This is an upper limit only; the actual number of results returned per call may be fewer than the
     *         specified maximum.
     */

    public Integer getMaximumPageSize() {
        return this.maximumPageSize;
    }

    /**
     * <p>
     * The maximum number of results that will be returned per call. <code>nextPageToken</code> can be used to obtain
     * futher pages of results. The default is 1000, which is the maximum allowed page size. You can, however, specify a
     * page size <i>smaller</i> than the maximum.
     * </p>
     * <p>
     * This is an upper limit only; the actual number of results returned per call may be fewer than the specified
     * maximum.
     * </p>
     * 
     * @param maximumPageSize
     *        The maximum number of results that will be returned per call. <code>nextPageToken</code> can be used to
     *        obtain futher pages of results. The default is 1000, which is the maximum allowed page size. You can,
     *        however, specify a page size <i>smaller</i> than the maximum.</p>
     *        <p>
     *        This is an upper limit only; the actual number of results returned per call may be fewer than the
     *        specified maximum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClosedWorkflowExecutionsRequest withMaximumPageSize(Integer maximumPageSize) {
        setMaximumPageSize(maximumPageSize);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, returns the results in reverse order. By default the results are returned in
     * descending order of the start or the close time of the executions.
     * </p>
     * 
     * @param reverseOrder
     *        When set to <code>true</code>, returns the results in reverse order. By default the results are returned
     *        in descending order of the start or the close time of the executions.
     */

    public void setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }

    /**
     * <p>
     * When set to <code>true</code>, returns the results in reverse order. By default the results are returned in
     * descending order of the start or the close time of the executions.
     * </p>
     * 
     * @return When set to <code>true</code>, returns the results in reverse order. By default the results are returned
     *         in descending order of the start or the close time of the executions.
     */

    public Boolean getReverseOrder() {
        return this.reverseOrder;
    }

    /**
     * <p>
     * When set to <code>true</code>, returns the results in reverse order. By default the results are returned in
     * descending order of the start or the close time of the executions.
     * </p>
     * 
     * @param reverseOrder
     *        When set to <code>true</code>, returns the results in reverse order. By default the results are returned
     *        in descending order of the start or the close time of the executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClosedWorkflowExecutionsRequest withReverseOrder(Boolean reverseOrder) {
        setReverseOrder(reverseOrder);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, returns the results in reverse order. By default the results are returned in
     * descending order of the start or the close time of the executions.
     * </p>
     * 
     * @return When set to <code>true</code>, returns the results in reverse order. By default the results are returned
     *         in descending order of the start or the close time of the executions.
     */

    public Boolean isReverseOrder() {
        return this.reverseOrder;
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getStartTimeFilter() != null)
            sb.append("StartTimeFilter: ").append(getStartTimeFilter()).append(",");
        if (getCloseTimeFilter() != null)
            sb.append("CloseTimeFilter: ").append(getCloseTimeFilter()).append(",");
        if (getExecutionFilter() != null)
            sb.append("ExecutionFilter: ").append(getExecutionFilter()).append(",");
        if (getCloseStatusFilter() != null)
            sb.append("CloseStatusFilter: ").append(getCloseStatusFilter()).append(",");
        if (getTypeFilter() != null)
            sb.append("TypeFilter: ").append(getTypeFilter()).append(",");
        if (getTagFilter() != null)
            sb.append("TagFilter: ").append(getTagFilter()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken()).append(",");
        if (getMaximumPageSize() != null)
            sb.append("MaximumPageSize: ").append(getMaximumPageSize()).append(",");
        if (getReverseOrder() != null)
            sb.append("ReverseOrder: ").append(getReverseOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClosedWorkflowExecutionsRequest == false)
            return false;
        ListClosedWorkflowExecutionsRequest other = (ListClosedWorkflowExecutionsRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getStartTimeFilter() == null ^ this.getStartTimeFilter() == null)
            return false;
        if (other.getStartTimeFilter() != null && other.getStartTimeFilter().equals(this.getStartTimeFilter()) == false)
            return false;
        if (other.getCloseTimeFilter() == null ^ this.getCloseTimeFilter() == null)
            return false;
        if (other.getCloseTimeFilter() != null && other.getCloseTimeFilter().equals(this.getCloseTimeFilter()) == false)
            return false;
        if (other.getExecutionFilter() == null ^ this.getExecutionFilter() == null)
            return false;
        if (other.getExecutionFilter() != null && other.getExecutionFilter().equals(this.getExecutionFilter()) == false)
            return false;
        if (other.getCloseStatusFilter() == null ^ this.getCloseStatusFilter() == null)
            return false;
        if (other.getCloseStatusFilter() != null && other.getCloseStatusFilter().equals(this.getCloseStatusFilter()) == false)
            return false;
        if (other.getTypeFilter() == null ^ this.getTypeFilter() == null)
            return false;
        if (other.getTypeFilter() != null && other.getTypeFilter().equals(this.getTypeFilter()) == false)
            return false;
        if (other.getTagFilter() == null ^ this.getTagFilter() == null)
            return false;
        if (other.getTagFilter() != null && other.getTagFilter().equals(this.getTagFilter()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        if (other.getMaximumPageSize() == null ^ this.getMaximumPageSize() == null)
            return false;
        if (other.getMaximumPageSize() != null && other.getMaximumPageSize().equals(this.getMaximumPageSize()) == false)
            return false;
        if (other.getReverseOrder() == null ^ this.getReverseOrder() == null)
            return false;
        if (other.getReverseOrder() != null && other.getReverseOrder().equals(this.getReverseOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getStartTimeFilter() == null) ? 0 : getStartTimeFilter().hashCode());
        hashCode = prime * hashCode + ((getCloseTimeFilter() == null) ? 0 : getCloseTimeFilter().hashCode());
        hashCode = prime * hashCode + ((getExecutionFilter() == null) ? 0 : getExecutionFilter().hashCode());
        hashCode = prime * hashCode + ((getCloseStatusFilter() == null) ? 0 : getCloseStatusFilter().hashCode());
        hashCode = prime * hashCode + ((getTypeFilter() == null) ? 0 : getTypeFilter().hashCode());
        hashCode = prime * hashCode + ((getTagFilter() == null) ? 0 : getTagFilter().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        hashCode = prime * hashCode + ((getMaximumPageSize() == null) ? 0 : getMaximumPageSize().hashCode());
        hashCode = prime * hashCode + ((getReverseOrder() == null) ? 0 : getReverseOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListClosedWorkflowExecutionsRequest clone() {
        return (ListClosedWorkflowExecutionsRequest) super.clone();
    }

}
