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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;

/**
 * <p>
 * Identifies the S3 bucket and object that contains the reference data. Also identifies the IAM role Amazon Kinesis
 * Analytics can assume to read this object on your behalf.
 * </p>
 * <p>
 * An Amazon Kinesis Analytics application loads reference data only once. If the data changes, you call the
 * <a>UpdateApplication</a> operation to trigger reloading of data into your application.
 * </p>
 */
public class S3ReferenceDataSource implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     */
    private String bucketARN;
    /**
     * <p>
     * Object key name containing reference data.
     * </p>
     */
    private String fileKey;
    /**
     * <p>
     * ARN of the IAM role that the service can assume to read data on your behalf. This role must have permission for
     * the <code>s3:GetObject</code> action on the object and trust policy that allows Amazon Kinesis Analytics service
     * principal to assume this role.
     * </p>
     */
    private String referenceRoleARN;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @param bucketARN
     *        Amazon Resource Name (ARN) of the S3 bucket.
     */

    public void setBucketARN(String bucketARN) {
        this.bucketARN = bucketARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the S3 bucket.
     */

    public String getBucketARN() {
        return this.bucketARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @param bucketARN
     *        Amazon Resource Name (ARN) of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReferenceDataSource withBucketARN(String bucketARN) {
        setBucketARN(bucketARN);
        return this;
    }

    /**
     * <p>
     * Object key name containing reference data.
     * </p>
     * 
     * @param fileKey
     *        Object key name containing reference data.
     */

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    /**
     * <p>
     * Object key name containing reference data.
     * </p>
     * 
     * @return Object key name containing reference data.
     */

    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * <p>
     * Object key name containing reference data.
     * </p>
     * 
     * @param fileKey
     *        Object key name containing reference data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReferenceDataSource withFileKey(String fileKey) {
        setFileKey(fileKey);
        return this;
    }

    /**
     * <p>
     * ARN of the IAM role that the service can assume to read data on your behalf. This role must have permission for
     * the <code>s3:GetObject</code> action on the object and trust policy that allows Amazon Kinesis Analytics service
     * principal to assume this role.
     * </p>
     * 
     * @param referenceRoleARN
     *        ARN of the IAM role that the service can assume to read data on your behalf. This role must have
     *        permission for the <code>s3:GetObject</code> action on the object and trust policy that allows Amazon
     *        Kinesis Analytics service principal to assume this role.
     */

    public void setReferenceRoleARN(String referenceRoleARN) {
        this.referenceRoleARN = referenceRoleARN;
    }

    /**
     * <p>
     * ARN of the IAM role that the service can assume to read data on your behalf. This role must have permission for
     * the <code>s3:GetObject</code> action on the object and trust policy that allows Amazon Kinesis Analytics service
     * principal to assume this role.
     * </p>
     * 
     * @return ARN of the IAM role that the service can assume to read data on your behalf. This role must have
     *         permission for the <code>s3:GetObject</code> action on the object and trust policy that allows Amazon
     *         Kinesis Analytics service principal to assume this role.
     */

    public String getReferenceRoleARN() {
        return this.referenceRoleARN;
    }

    /**
     * <p>
     * ARN of the IAM role that the service can assume to read data on your behalf. This role must have permission for
     * the <code>s3:GetObject</code> action on the object and trust policy that allows Amazon Kinesis Analytics service
     * principal to assume this role.
     * </p>
     * 
     * @param referenceRoleARN
     *        ARN of the IAM role that the service can assume to read data on your behalf. This role must have
     *        permission for the <code>s3:GetObject</code> action on the object and trust policy that allows Amazon
     *        Kinesis Analytics service principal to assume this role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReferenceDataSource withReferenceRoleARN(String referenceRoleARN) {
        setReferenceRoleARN(referenceRoleARN);
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
        if (getBucketARN() != null)
            sb.append("BucketARN: ").append(getBucketARN()).append(",");
        if (getFileKey() != null)
            sb.append("FileKey: ").append(getFileKey()).append(",");
        if (getReferenceRoleARN() != null)
            sb.append("ReferenceRoleARN: ").append(getReferenceRoleARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ReferenceDataSource == false)
            return false;
        S3ReferenceDataSource other = (S3ReferenceDataSource) obj;
        if (other.getBucketARN() == null ^ this.getBucketARN() == null)
            return false;
        if (other.getBucketARN() != null && other.getBucketARN().equals(this.getBucketARN()) == false)
            return false;
        if (other.getFileKey() == null ^ this.getFileKey() == null)
            return false;
        if (other.getFileKey() != null && other.getFileKey().equals(this.getFileKey()) == false)
            return false;
        if (other.getReferenceRoleARN() == null ^ this.getReferenceRoleARN() == null)
            return false;
        if (other.getReferenceRoleARN() != null && other.getReferenceRoleARN().equals(this.getReferenceRoleARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketARN() == null) ? 0 : getBucketARN().hashCode());
        hashCode = prime * hashCode + ((getFileKey() == null) ? 0 : getFileKey().hashCode());
        hashCode = prime * hashCode + ((getReferenceRoleARN() == null) ? 0 : getReferenceRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public S3ReferenceDataSource clone() {
        try {
            return (S3ReferenceDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
