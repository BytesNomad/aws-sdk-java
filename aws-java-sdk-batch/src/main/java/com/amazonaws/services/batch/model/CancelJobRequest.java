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
public class CancelJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of up to 100 job IDs to cancel.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * A message to attach to the job that explains the reason for cancelling it. This message is returned by future
     * <a>DescribeJobs</a> operations on the job. This message is also recorded in the AWS Batch activity logs.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * A list of up to 100 job IDs to cancel.
     * </p>
     * 
     * @param jobId
     *        A list of up to 100 job IDs to cancel.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * A list of up to 100 job IDs to cancel.
     * </p>
     * 
     * @return A list of up to 100 job IDs to cancel.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * A list of up to 100 job IDs to cancel.
     * </p>
     * 
     * @param jobId
     *        A list of up to 100 job IDs to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * A message to attach to the job that explains the reason for cancelling it. This message is returned by future
     * <a>DescribeJobs</a> operations on the job. This message is also recorded in the AWS Batch activity logs.
     * </p>
     * 
     * @param reason
     *        A message to attach to the job that explains the reason for cancelling it. This message is returned by
     *        future <a>DescribeJobs</a> operations on the job. This message is also recorded in the AWS Batch activity
     *        logs.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A message to attach to the job that explains the reason for cancelling it. This message is returned by future
     * <a>DescribeJobs</a> operations on the job. This message is also recorded in the AWS Batch activity logs.
     * </p>
     * 
     * @return A message to attach to the job that explains the reason for cancelling it. This message is returned by
     *         future <a>DescribeJobs</a> operations on the job. This message is also recorded in the AWS Batch activity
     *         logs.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A message to attach to the job that explains the reason for cancelling it. This message is returned by future
     * <a>DescribeJobs</a> operations on the job. This message is also recorded in the AWS Batch activity logs.
     * </p>
     * 
     * @param reason
     *        A message to attach to the job that explains the reason for cancelling it. This message is returned by
     *        future <a>DescribeJobs</a> operations on the job. This message is also recorded in the AWS Batch activity
     *        logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobRequest withReason(String reason) {
        setReason(reason);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelJobRequest == false)
            return false;
        CancelJobRequest other = (CancelJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public CancelJobRequest clone() {
        return (CancelJobRequest) super.clone();
    }

}
