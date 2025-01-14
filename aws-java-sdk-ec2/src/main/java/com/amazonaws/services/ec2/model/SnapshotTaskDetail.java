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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Details about the import snapshot task.
 * </p>
 */
public class SnapshotTaskDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The size of the disk in the snapshot, in GiB.
     * </p>
     */
    private Double diskImageSize;
    /**
     * <p>
     * The description of the snapshot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The format of the disk image from which the snapshot is created.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The URL of the disk image from which the snapshot is created.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The S3 bucket for the disk image.
     * </p>
     */
    private UserBucketDetails userBucket;
    /**
     * <p>
     * The snapshot ID of the disk being imported.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The percentage of completion for the import snapshot task.
     * </p>
     */
    private String progress;
    /**
     * <p>
     * A detailed status message for the import snapshot task.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * A brief status for the import snapshot task.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The size of the disk in the snapshot, in GiB.
     * </p>
     * 
     * @param diskImageSize
     *        The size of the disk in the snapshot, in GiB.
     */

    public void setDiskImageSize(Double diskImageSize) {
        this.diskImageSize = diskImageSize;
    }

    /**
     * <p>
     * The size of the disk in the snapshot, in GiB.
     * </p>
     * 
     * @return The size of the disk in the snapshot, in GiB.
     */

    public Double getDiskImageSize() {
        return this.diskImageSize;
    }

    /**
     * <p>
     * The size of the disk in the snapshot, in GiB.
     * </p>
     * 
     * @param diskImageSize
     *        The size of the disk in the snapshot, in GiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTaskDetail withDiskImageSize(Double diskImageSize) {
        setDiskImageSize(diskImageSize);
        return this;
    }

    /**
     * <p>
     * The description of the snapshot.
     * </p>
     * 
     * @param description
     *        The description of the snapshot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the snapshot.
     * </p>
     * 
     * @return The description of the snapshot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the snapshot.
     * </p>
     * 
     * @param description
     *        The description of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTaskDetail withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The format of the disk image from which the snapshot is created.
     * </p>
     * 
     * @param format
     *        The format of the disk image from which the snapshot is created.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the disk image from which the snapshot is created.
     * </p>
     * 
     * @return The format of the disk image from which the snapshot is created.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the disk image from which the snapshot is created.
     * </p>
     * 
     * @param format
     *        The format of the disk image from which the snapshot is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTaskDetail withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The URL of the disk image from which the snapshot is created.
     * </p>
     * 
     * @param url
     *        The URL of the disk image from which the snapshot is created.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of the disk image from which the snapshot is created.
     * </p>
     * 
     * @return The URL of the disk image from which the snapshot is created.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL of the disk image from which the snapshot is created.
     * </p>
     * 
     * @param url
     *        The URL of the disk image from which the snapshot is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTaskDetail withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The S3 bucket for the disk image.
     * </p>
     * 
     * @param userBucket
     *        The S3 bucket for the disk image.
     */

    public void setUserBucket(UserBucketDetails userBucket) {
        this.userBucket = userBucket;
    }

    /**
     * <p>
     * The S3 bucket for the disk image.
     * </p>
     * 
     * @return The S3 bucket for the disk image.
     */

    public UserBucketDetails getUserBucket() {
        return this.userBucket;
    }

    /**
     * <p>
     * The S3 bucket for the disk image.
     * </p>
     * 
     * @param userBucket
     *        The S3 bucket for the disk image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTaskDetail withUserBucket(UserBucketDetails userBucket) {
        setUserBucket(userBucket);
        return this;
    }

    /**
     * <p>
     * The snapshot ID of the disk being imported.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID of the disk being imported.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot ID of the disk being imported.
     * </p>
     * 
     * @return The snapshot ID of the disk being imported.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot ID of the disk being imported.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID of the disk being imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTaskDetail withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The percentage of completion for the import snapshot task.
     * </p>
     * 
     * @param progress
     *        The percentage of completion for the import snapshot task.
     */

    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The percentage of completion for the import snapshot task.
     * </p>
     * 
     * @return The percentage of completion for the import snapshot task.
     */

    public String getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * The percentage of completion for the import snapshot task.
     * </p>
     * 
     * @param progress
     *        The percentage of completion for the import snapshot task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTaskDetail withProgress(String progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * A detailed status message for the import snapshot task.
     * </p>
     * 
     * @param statusMessage
     *        A detailed status message for the import snapshot task.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed status message for the import snapshot task.
     * </p>
     * 
     * @return A detailed status message for the import snapshot task.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A detailed status message for the import snapshot task.
     * </p>
     * 
     * @param statusMessage
     *        A detailed status message for the import snapshot task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTaskDetail withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * A brief status for the import snapshot task.
     * </p>
     * 
     * @param status
     *        A brief status for the import snapshot task.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A brief status for the import snapshot task.
     * </p>
     * 
     * @return A brief status for the import snapshot task.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A brief status for the import snapshot task.
     * </p>
     * 
     * @param status
     *        A brief status for the import snapshot task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotTaskDetail withStatus(String status) {
        setStatus(status);
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
        if (getDiskImageSize() != null)
            sb.append("DiskImageSize: ").append(getDiskImageSize()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getUserBucket() != null)
            sb.append("UserBucket: ").append(getUserBucket()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotTaskDetail == false)
            return false;
        SnapshotTaskDetail other = (SnapshotTaskDetail) obj;
        if (other.getDiskImageSize() == null ^ this.getDiskImageSize() == null)
            return false;
        if (other.getDiskImageSize() != null && other.getDiskImageSize().equals(this.getDiskImageSize()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getUserBucket() == null ^ this.getUserBucket() == null)
            return false;
        if (other.getUserBucket() != null && other.getUserBucket().equals(this.getUserBucket()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskImageSize() == null) ? 0 : getDiskImageSize().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getUserBucket() == null) ? 0 : getUserBucket().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotTaskDetail clone() {
        try {
            return (SnapshotTaskDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
