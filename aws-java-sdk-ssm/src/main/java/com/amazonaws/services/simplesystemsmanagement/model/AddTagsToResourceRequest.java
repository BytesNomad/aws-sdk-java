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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class AddTagsToResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the type of resource you are tagging.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The resource ID you want to tag.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * One or more tags. The value parameter is required, but if you don't want the tag to have a value, specify the
     * parameter with no value, and we set the value to an empty string.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * Specifies the type of resource you are tagging.
     * </p>
     * 
     * @param resourceType
     *        Specifies the type of resource you are tagging.
     * @see ResourceTypeForTagging
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Specifies the type of resource you are tagging.
     * </p>
     * 
     * @return Specifies the type of resource you are tagging.
     * @see ResourceTypeForTagging
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Specifies the type of resource you are tagging.
     * </p>
     * 
     * @param resourceType
     *        Specifies the type of resource you are tagging.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeForTagging
     */

    public AddTagsToResourceRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of resource you are tagging.
     * </p>
     * 
     * @param resourceType
     *        Specifies the type of resource you are tagging.
     * @see ResourceTypeForTagging
     */

    public void setResourceType(ResourceTypeForTagging resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * Specifies the type of resource you are tagging.
     * </p>
     * 
     * @param resourceType
     *        Specifies the type of resource you are tagging.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeForTagging
     */

    public AddTagsToResourceRequest withResourceType(ResourceTypeForTagging resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource ID you want to tag.
     * </p>
     * 
     * @param resourceId
     *        The resource ID you want to tag.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID you want to tag.
     * </p>
     * 
     * @return The resource ID you want to tag.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID you want to tag.
     * </p>
     * 
     * @param resourceId
     *        The resource ID you want to tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsToResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * One or more tags. The value parameter is required, but if you don't want the tag to have a value, specify the
     * parameter with no value, and we set the value to an empty string.
     * </p>
     * 
     * @return One or more tags. The value parameter is required, but if you don't want the tag to have a value, specify
     *         the parameter with no value, and we set the value to an empty string.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * One or more tags. The value parameter is required, but if you don't want the tag to have a value, specify the
     * parameter with no value, and we set the value to an empty string.
     * </p>
     * 
     * @param tags
     *        One or more tags. The value parameter is required, but if you don't want the tag to have a value, specify
     *        the parameter with no value, and we set the value to an empty string.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * One or more tags. The value parameter is required, but if you don't want the tag to have a value, specify the
     * parameter with no value, and we set the value to an empty string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags. The value parameter is required, but if you don't want the tag to have a value, specify
     *        the parameter with no value, and we set the value to an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsToResourceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags. The value parameter is required, but if you don't want the tag to have a value, specify the
     * parameter with no value, and we set the value to an empty string.
     * </p>
     * 
     * @param tags
     *        One or more tags. The value parameter is required, but if you don't want the tag to have a value, specify
     *        the parameter with no value, and we set the value to an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsToResourceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
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

        if (obj instanceof AddTagsToResourceRequest == false)
            return false;
        AddTagsToResourceRequest other = (AddTagsToResourceRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
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

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AddTagsToResourceRequest clone() {
        return (AddTagsToResourceRequest) super.clone();
    }

}
