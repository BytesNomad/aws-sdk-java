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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a unique message ID.
 * </p>
 */
public class SendRawEmailResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique message identifier returned from the <code>SendRawEmail</code> action.
     * </p>
     */
    private String messageId;

    /**
     * <p>
     * The unique message identifier returned from the <code>SendRawEmail</code> action.
     * </p>
     * 
     * @param messageId
     *        The unique message identifier returned from the <code>SendRawEmail</code> action.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The unique message identifier returned from the <code>SendRawEmail</code> action.
     * </p>
     * 
     * @return The unique message identifier returned from the <code>SendRawEmail</code> action.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The unique message identifier returned from the <code>SendRawEmail</code> action.
     * </p>
     * 
     * @param messageId
     *        The unique message identifier returned from the <code>SendRawEmail</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendRawEmailResult withMessageId(String messageId) {
        setMessageId(messageId);
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
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendRawEmailResult == false)
            return false;
        SendRawEmailResult other = (SendRawEmailResult) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        return hashCode;
    }

    @Override
    public SendRawEmailResult clone() {
        try {
            return (SendRawEmailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
