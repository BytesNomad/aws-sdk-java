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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the results of the <a>CreateSnapshot</a> operation.
 * </p>
 */
public class CreateSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the snapshot that was created.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The identifier of the snapshot that was created.
     * </p>
     * 
     * @param snapshotId
     *        The identifier of the snapshot that was created.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The identifier of the snapshot that was created.
     * </p>
     * 
     * @return The identifier of the snapshot that was created.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The identifier of the snapshot that was created.
     * </p>
     * 
     * @param snapshotId
     *        The identifier of the snapshot that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotResult withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotResult == false)
            return false;
        CreateSnapshotResult other = (CreateSnapshotResult) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public CreateSnapshotResult clone() {
        try {
            return (CreateSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
