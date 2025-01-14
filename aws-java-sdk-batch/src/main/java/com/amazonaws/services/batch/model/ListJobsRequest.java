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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the job queue with which to list jobs.
     * </p>
     */
    private String jobQueue;
    /**
     * <p>
     * The job status with which to filter jobs in the specified queue.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The maximum number of results returned by <code>ListJobs</code> in paginated output. When this parameter is used,
     * <code>ListJobs</code> only returns <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another <code>ListJobs</code> request with the returned <code>nextToken</code> value. This value can be between 1
     * and 100. If this parameter is not used, then <code>ListJobs</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListJobs</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the job queue with which to list jobs.
     * </p>
     * 
     * @param jobQueue
     *        The name or full Amazon Resource Name (ARN) of the job queue with which to list jobs.
     */

    public void setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
    }

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the job queue with which to list jobs.
     * </p>
     * 
     * @return The name or full Amazon Resource Name (ARN) of the job queue with which to list jobs.
     */

    public String getJobQueue() {
        return this.jobQueue;
    }

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the job queue with which to list jobs.
     * </p>
     * 
     * @param jobQueue
     *        The name or full Amazon Resource Name (ARN) of the job queue with which to list jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withJobQueue(String jobQueue) {
        setJobQueue(jobQueue);
        return this;
    }

    /**
     * <p>
     * The job status with which to filter jobs in the specified queue.
     * </p>
     * 
     * @param jobStatus
     *        The job status with which to filter jobs in the specified queue.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The job status with which to filter jobs in the specified queue.
     * </p>
     * 
     * @return The job status with which to filter jobs in the specified queue.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The job status with which to filter jobs in the specified queue.
     * </p>
     * 
     * @param jobStatus
     *        The job status with which to filter jobs in the specified queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListJobsRequest withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The job status with which to filter jobs in the specified queue.
     * </p>
     * 
     * @param jobStatus
     *        The job status with which to filter jobs in the specified queue.
     * @see JobStatus
     */

    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * The job status with which to filter jobs in the specified queue.
     * </p>
     * 
     * @param jobStatus
     *        The job status with which to filter jobs in the specified queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListJobsRequest withJobStatus(JobStatus jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListJobs</code> in paginated output. When this parameter is used,
     * <code>ListJobs</code> only returns <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another <code>ListJobs</code> request with the returned <code>nextToken</code> value. This value can be between 1
     * and 100. If this parameter is not used, then <code>ListJobs</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code>ListJobs</code> in paginated output. When this parameter
     *        is used, <code>ListJobs</code> only returns <code>maxResults</code> results in a single page along with a
     *        <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     *        sending another <code>ListJobs</code> request with the returned <code>nextToken</code> value. This value
     *        can be between 1 and 100. If this parameter is not used, then <code>ListJobs</code> returns up to 100
     *        results and a <code>nextToken</code> value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListJobs</code> in paginated output. When this parameter is used,
     * <code>ListJobs</code> only returns <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another <code>ListJobs</code> request with the returned <code>nextToken</code> value. This value can be between 1
     * and 100. If this parameter is not used, then <code>ListJobs</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of results returned by <code>ListJobs</code> in paginated output. When this parameter
     *         is used, <code>ListJobs</code> only returns <code>maxResults</code> results in a single page along with a
     *         <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     *         sending another <code>ListJobs</code> request with the returned <code>nextToken</code> value. This value
     *         can be between 1 and 100. If this parameter is not used, then <code>ListJobs</code> returns up to 100
     *         results and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListJobs</code> in paginated output. When this parameter is used,
     * <code>ListJobs</code> only returns <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the initial request can be seen by sending
     * another <code>ListJobs</code> request with the returned <code>nextToken</code> value. This value can be between 1
     * and 100. If this parameter is not used, then <code>ListJobs</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code>ListJobs</code> in paginated output. When this parameter
     *        is used, <code>ListJobs</code> only returns <code>maxResults</code> results in a single page along with a
     *        <code>nextToken</code> response element. The remaining results of the initial request can be seen by
     *        sending another <code>ListJobs</code> request with the returned <code>nextToken</code> value. This value
     *        can be between 1 and 100. If this parameter is not used, then <code>ListJobs</code> returns up to 100
     *        results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListJobs</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListJobs</code> request where
     *        <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListJobs</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListJobs</code> request where
     *         <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *         is <code>null</code> when there are no more results to return.</p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListJobs</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListJobs</code> request where
     *        <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getJobQueue() != null)
            sb.append("JobQueue: ").append(getJobQueue()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsRequest == false)
            return false;
        ListJobsRequest other = (ListJobsRequest) obj;
        if (other.getJobQueue() == null ^ this.getJobQueue() == null)
            return false;
        if (other.getJobQueue() != null && other.getJobQueue().equals(this.getJobQueue()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobQueue() == null) ? 0 : getJobQueue().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListJobsRequest clone() {
        return (ListJobsRequest) super.clone();
    }

}
