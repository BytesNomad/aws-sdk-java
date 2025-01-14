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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;

/**
 * 
 */
public class StartOnDemandReplicationRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String replicationRunId;

    /**
     * @param replicationRunId
     */

    public void setReplicationRunId(String replicationRunId) {
        this.replicationRunId = replicationRunId;
    }

    /**
     * @return
     */

    public String getReplicationRunId() {
        return this.replicationRunId;
    }

    /**
     * @param replicationRunId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOnDemandReplicationRunResult withReplicationRunId(String replicationRunId) {
        setReplicationRunId(replicationRunId);
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
        if (getReplicationRunId() != null)
            sb.append("ReplicationRunId: ").append(getReplicationRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartOnDemandReplicationRunResult == false)
            return false;
        StartOnDemandReplicationRunResult other = (StartOnDemandReplicationRunResult) obj;
        if (other.getReplicationRunId() == null ^ this.getReplicationRunId() == null)
            return false;
        if (other.getReplicationRunId() != null && other.getReplicationRunId().equals(this.getReplicationRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationRunId() == null) ? 0 : getReplicationRunId().hashCode());
        return hashCode;
    }

    @Override
    public StartOnDemandReplicationRunResult clone() {
        try {
            return (StartOnDemandReplicationRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
