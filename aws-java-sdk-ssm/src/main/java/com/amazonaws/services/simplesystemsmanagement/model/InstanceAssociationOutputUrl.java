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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * <p>
 * The URL of Amazon S3 bucket where you want to store the results of this request.
 * </p>
 */
public class InstanceAssociationOutputUrl implements Serializable, Cloneable {

    /**
     * <p>
     * The URL of Amazon S3 bucket where you want to store the results of this request.
     * </p>
     */
    private S3OutputUrl s3OutputUrl;

    /**
     * <p>
     * The URL of Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @param s3OutputUrl
     *        The URL of Amazon S3 bucket where you want to store the results of this request.
     */

    public void setS3OutputUrl(S3OutputUrl s3OutputUrl) {
        this.s3OutputUrl = s3OutputUrl;
    }

    /**
     * <p>
     * The URL of Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @return The URL of Amazon S3 bucket where you want to store the results of this request.
     */

    public S3OutputUrl getS3OutputUrl() {
        return this.s3OutputUrl;
    }

    /**
     * <p>
     * The URL of Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @param s3OutputUrl
     *        The URL of Amazon S3 bucket where you want to store the results of this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAssociationOutputUrl withS3OutputUrl(S3OutputUrl s3OutputUrl) {
        setS3OutputUrl(s3OutputUrl);
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
        if (getS3OutputUrl() != null)
            sb.append("S3OutputUrl: ").append(getS3OutputUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceAssociationOutputUrl == false)
            return false;
        InstanceAssociationOutputUrl other = (InstanceAssociationOutputUrl) obj;
        if (other.getS3OutputUrl() == null ^ this.getS3OutputUrl() == null)
            return false;
        if (other.getS3OutputUrl() != null && other.getS3OutputUrl().equals(this.getS3OutputUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3OutputUrl() == null) ? 0 : getS3OutputUrl().hashCode());
        return hashCode;
    }

    @Override
    public InstanceAssociationOutputUrl clone() {
        try {
            return (InstanceAssociationOutputUrl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
