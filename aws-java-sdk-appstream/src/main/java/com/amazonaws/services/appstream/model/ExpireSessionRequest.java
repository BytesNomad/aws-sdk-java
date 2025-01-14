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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ExpireSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the streaming session to be stopped.
     * </p>
     */
    private String sessionId;

    /**
     * <p>
     * The unique identifier of the streaming session to be stopped.
     * </p>
     * 
     * @param sessionId
     *        The unique identifier of the streaming session to be stopped.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The unique identifier of the streaming session to be stopped.
     * </p>
     * 
     * @return The unique identifier of the streaming session to be stopped.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The unique identifier of the streaming session to be stopped.
     * </p>
     * 
     * @param sessionId
     *        The unique identifier of the streaming session to be stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpireSessionRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
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
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpireSessionRequest == false)
            return false;
        ExpireSessionRequest other = (ExpireSessionRequest) obj;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        return hashCode;
    }

    @Override
    public ExpireSessionRequest clone() {
        return (ExpireSessionRequest) super.clone();
    }

}
