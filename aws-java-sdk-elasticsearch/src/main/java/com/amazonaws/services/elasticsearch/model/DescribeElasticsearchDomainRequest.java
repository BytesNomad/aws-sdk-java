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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code><a>DescribeElasticsearchDomain</a></code> operation.
 * </p>
 */
public class DescribeElasticsearchDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Elasticsearch domain for which you want information.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The name of the Elasticsearch domain for which you want information.
     * </p>
     * 
     * @param domainName
     *        The name of the Elasticsearch domain for which you want information.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the Elasticsearch domain for which you want information.
     * </p>
     * 
     * @return The name of the Elasticsearch domain for which you want information.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the Elasticsearch domain for which you want information.
     * </p>
     * 
     * @param domainName
     *        The name of the Elasticsearch domain for which you want information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticsearchDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeElasticsearchDomainRequest == false)
            return false;
        DescribeElasticsearchDomainRequest other = (DescribeElasticsearchDomainRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeElasticsearchDomainRequest clone() {
        return (DescribeElasticsearchDomainRequest) super.clone();
    }

}
