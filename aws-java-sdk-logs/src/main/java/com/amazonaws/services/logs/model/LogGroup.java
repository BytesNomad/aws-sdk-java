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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a log group.
 * </p>
 */
public class LogGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The creation time of the log group.
     * </p>
     */
    private Long creationTime;

    private Integer retentionInDays;
    /**
     * <p>
     * The number of metric filters.
     * </p>
     */
    private Integer metricFilterCount;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The number of bytes stored.
     * </p>
     */
    private Long storedBytes;

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @return The name of the log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroup withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The creation time of the log group.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the log group.
     */

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the log group.
     * </p>
     * 
     * @return The creation time of the log group.
     */

    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the log group.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroup withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param retentionInDays
     */

    public void setRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
    }

    /**
     * @return
     */

    public Integer getRetentionInDays() {
        return this.retentionInDays;
    }

    /**
     * @param retentionInDays
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroup withRetentionInDays(Integer retentionInDays) {
        setRetentionInDays(retentionInDays);
        return this;
    }

    /**
     * <p>
     * The number of metric filters.
     * </p>
     * 
     * @param metricFilterCount
     *        The number of metric filters.
     */

    public void setMetricFilterCount(Integer metricFilterCount) {
        this.metricFilterCount = metricFilterCount;
    }

    /**
     * <p>
     * The number of metric filters.
     * </p>
     * 
     * @return The number of metric filters.
     */

    public Integer getMetricFilterCount() {
        return this.metricFilterCount;
    }

    /**
     * <p>
     * The number of metric filters.
     * </p>
     * 
     * @param metricFilterCount
     *        The number of metric filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroup withMetricFilterCount(Integer metricFilterCount) {
        setMetricFilterCount(metricFilterCount);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the log group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the log group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroup withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * 
     * @param storedBytes
     *        The number of bytes stored.
     */

    public void setStoredBytes(Long storedBytes) {
        this.storedBytes = storedBytes;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * 
     * @return The number of bytes stored.
     */

    public Long getStoredBytes() {
        return this.storedBytes;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * 
     * @param storedBytes
     *        The number of bytes stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogGroup withStoredBytes(Long storedBytes) {
        setStoredBytes(storedBytes);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getRetentionInDays() != null)
            sb.append("RetentionInDays: ").append(getRetentionInDays()).append(",");
        if (getMetricFilterCount() != null)
            sb.append("MetricFilterCount: ").append(getMetricFilterCount()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStoredBytes() != null)
            sb.append("StoredBytes: ").append(getStoredBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogGroup == false)
            return false;
        LogGroup other = (LogGroup) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getRetentionInDays() == null ^ this.getRetentionInDays() == null)
            return false;
        if (other.getRetentionInDays() != null && other.getRetentionInDays().equals(this.getRetentionInDays()) == false)
            return false;
        if (other.getMetricFilterCount() == null ^ this.getMetricFilterCount() == null)
            return false;
        if (other.getMetricFilterCount() != null && other.getMetricFilterCount().equals(this.getMetricFilterCount()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStoredBytes() == null ^ this.getStoredBytes() == null)
            return false;
        if (other.getStoredBytes() != null && other.getStoredBytes().equals(this.getStoredBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getRetentionInDays() == null) ? 0 : getRetentionInDays().hashCode());
        hashCode = prime * hashCode + ((getMetricFilterCount() == null) ? 0 : getMetricFilterCount().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStoredBytes() == null) ? 0 : getStoredBytes().hashCode());
        return hashCode;
    }

    @Override
    public LogGroup clone() {
        try {
            return (LogGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
