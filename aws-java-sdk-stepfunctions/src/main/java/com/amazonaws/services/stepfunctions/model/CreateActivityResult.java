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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;

/**
 * 
 */
public class CreateActivityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the created activity.
     * </p>
     */
    private String activityArn;
    /**
     * <p>
     * The date the activity was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the created activity.
     * </p>
     * 
     * @param activityArn
     *        The Amazon Resource Name (ARN) that identifies the created activity.
     */

    public void setActivityArn(String activityArn) {
        this.activityArn = activityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the created activity.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the created activity.
     */

    public String getActivityArn() {
        return this.activityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the created activity.
     * </p>
     * 
     * @param activityArn
     *        The Amazon Resource Name (ARN) that identifies the created activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivityResult withActivityArn(String activityArn) {
        setActivityArn(activityArn);
        return this;
    }

    /**
     * <p>
     * The date the activity was created.
     * </p>
     * 
     * @param creationDate
     *        The date the activity was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the activity was created.
     * </p>
     * 
     * @return The date the activity was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the activity was created.
     * </p>
     * 
     * @param creationDate
     *        The date the activity was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivityResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getActivityArn() != null)
            sb.append("ActivityArn: ").append(getActivityArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateActivityResult == false)
            return false;
        CreateActivityResult other = (CreateActivityResult) obj;
        if (other.getActivityArn() == null ^ this.getActivityArn() == null)
            return false;
        if (other.getActivityArn() != null && other.getActivityArn().equals(this.getActivityArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivityArn() == null) ? 0 : getActivityArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public CreateActivityResult clone() {
        try {
            return (CreateActivityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
