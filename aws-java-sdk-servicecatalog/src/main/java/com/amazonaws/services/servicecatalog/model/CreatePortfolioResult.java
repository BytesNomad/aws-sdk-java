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

/**
 * 
 */
public class CreatePortfolioResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The resulting detailed portfolio information.
     * </p>
     */
    private PortfolioDetail portfolioDetail;
    /**
     * <p>
     * Tags successfully associated with the new portfolio.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The resulting detailed portfolio information.
     * </p>
     * 
     * @param portfolioDetail
     *        The resulting detailed portfolio information.
     */

    public void setPortfolioDetail(PortfolioDetail portfolioDetail) {
        this.portfolioDetail = portfolioDetail;
    }

    /**
     * <p>
     * The resulting detailed portfolio information.
     * </p>
     * 
     * @return The resulting detailed portfolio information.
     */

    public PortfolioDetail getPortfolioDetail() {
        return this.portfolioDetail;
    }

    /**
     * <p>
     * The resulting detailed portfolio information.
     * </p>
     * 
     * @param portfolioDetail
     *        The resulting detailed portfolio information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortfolioResult withPortfolioDetail(PortfolioDetail portfolioDetail) {
        setPortfolioDetail(portfolioDetail);
        return this;
    }

    /**
     * <p>
     * Tags successfully associated with the new portfolio.
     * </p>
     * 
     * @return Tags successfully associated with the new portfolio.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags successfully associated with the new portfolio.
     * </p>
     * 
     * @param tags
     *        Tags successfully associated with the new portfolio.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags successfully associated with the new portfolio.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags successfully associated with the new portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortfolioResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags successfully associated with the new portfolio.
     * </p>
     * 
     * @param tags
     *        Tags successfully associated with the new portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortfolioResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getPortfolioDetail() != null)
            sb.append("PortfolioDetail: ").append(getPortfolioDetail()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePortfolioResult == false)
            return false;
        CreatePortfolioResult other = (CreatePortfolioResult) obj;
        if (other.getPortfolioDetail() == null ^ this.getPortfolioDetail() == null)
            return false;
        if (other.getPortfolioDetail() != null && other.getPortfolioDetail().equals(this.getPortfolioDetail()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortfolioDetail() == null) ? 0 : getPortfolioDetail().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePortfolioResult clone() {
        try {
            return (CreatePortfolioResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
