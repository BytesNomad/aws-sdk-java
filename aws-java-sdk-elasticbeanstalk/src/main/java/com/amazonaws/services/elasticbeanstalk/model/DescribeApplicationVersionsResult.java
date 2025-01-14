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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Result message wrapping a list of application version descriptions.
 * </p>
 */
public class DescribeApplicationVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of <code>ApplicationVersionDescription</code> objects sorted in order of creation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ApplicationVersionDescription> applicationVersions;
    /**
     * <p>
     * For a paginated request, the token that you can pass in a subsequent request to get the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of <code>ApplicationVersionDescription</code> objects sorted in order of creation.
     * </p>
     * 
     * @return List of <code>ApplicationVersionDescription</code> objects sorted in order of creation.
     */

    public java.util.List<ApplicationVersionDescription> getApplicationVersions() {
        if (applicationVersions == null) {
            applicationVersions = new com.amazonaws.internal.SdkInternalList<ApplicationVersionDescription>();
        }
        return applicationVersions;
    }

    /**
     * <p>
     * List of <code>ApplicationVersionDescription</code> objects sorted in order of creation.
     * </p>
     * 
     * @param applicationVersions
     *        List of <code>ApplicationVersionDescription</code> objects sorted in order of creation.
     */

    public void setApplicationVersions(java.util.Collection<ApplicationVersionDescription> applicationVersions) {
        if (applicationVersions == null) {
            this.applicationVersions = null;
            return;
        }

        this.applicationVersions = new com.amazonaws.internal.SdkInternalList<ApplicationVersionDescription>(applicationVersions);
    }

    /**
     * <p>
     * List of <code>ApplicationVersionDescription</code> objects sorted in order of creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationVersions(java.util.Collection)} or {@link #withApplicationVersions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param applicationVersions
     *        List of <code>ApplicationVersionDescription</code> objects sorted in order of creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationVersionsResult withApplicationVersions(ApplicationVersionDescription... applicationVersions) {
        if (this.applicationVersions == null) {
            setApplicationVersions(new com.amazonaws.internal.SdkInternalList<ApplicationVersionDescription>(applicationVersions.length));
        }
        for (ApplicationVersionDescription ele : applicationVersions) {
            this.applicationVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of <code>ApplicationVersionDescription</code> objects sorted in order of creation.
     * </p>
     * 
     * @param applicationVersions
     *        List of <code>ApplicationVersionDescription</code> objects sorted in order of creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationVersionsResult withApplicationVersions(java.util.Collection<ApplicationVersionDescription> applicationVersions) {
        setApplicationVersions(applicationVersions);
        return this;
    }

    /**
     * <p>
     * For a paginated request, the token that you can pass in a subsequent request to get the next page.
     * </p>
     * 
     * @param nextToken
     *        For a paginated request, the token that you can pass in a subsequent request to get the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For a paginated request, the token that you can pass in a subsequent request to get the next page.
     * </p>
     * 
     * @return For a paginated request, the token that you can pass in a subsequent request to get the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For a paginated request, the token that you can pass in a subsequent request to get the next page.
     * </p>
     * 
     * @param nextToken
     *        For a paginated request, the token that you can pass in a subsequent request to get the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationVersionsResult withNextToken(String nextToken) {
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
        if (getApplicationVersions() != null)
            sb.append("ApplicationVersions: ").append(getApplicationVersions()).append(",");
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

        if (obj instanceof DescribeApplicationVersionsResult == false)
            return false;
        DescribeApplicationVersionsResult other = (DescribeApplicationVersionsResult) obj;
        if (other.getApplicationVersions() == null ^ this.getApplicationVersions() == null)
            return false;
        if (other.getApplicationVersions() != null && other.getApplicationVersions().equals(this.getApplicationVersions()) == false)
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

        hashCode = prime * hashCode + ((getApplicationVersions() == null) ? 0 : getApplicationVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationVersionsResult clone() {
        try {
            return (DescribeApplicationVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
