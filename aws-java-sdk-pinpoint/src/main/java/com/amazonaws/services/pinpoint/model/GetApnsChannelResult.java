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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * 
 */
public class GetApnsChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private APNSChannelResponse aPNSChannelResponse;

    /**
     * @param aPNSChannelResponse
     */

    public void setAPNSChannelResponse(APNSChannelResponse aPNSChannelResponse) {
        this.aPNSChannelResponse = aPNSChannelResponse;
    }

    /**
     * @return
     */

    public APNSChannelResponse getAPNSChannelResponse() {
        return this.aPNSChannelResponse;
    }

    /**
     * @param aPNSChannelResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApnsChannelResult withAPNSChannelResponse(APNSChannelResponse aPNSChannelResponse) {
        setAPNSChannelResponse(aPNSChannelResponse);
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
        if (getAPNSChannelResponse() != null)
            sb.append("APNSChannelResponse: ").append(getAPNSChannelResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApnsChannelResult == false)
            return false;
        GetApnsChannelResult other = (GetApnsChannelResult) obj;
        if (other.getAPNSChannelResponse() == null ^ this.getAPNSChannelResponse() == null)
            return false;
        if (other.getAPNSChannelResponse() != null && other.getAPNSChannelResponse().equals(this.getAPNSChannelResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAPNSChannelResponse() == null) ? 0 : getAPNSChannelResponse().hashCode());
        return hashCode;
    }

    @Override
    public GetApnsChannelResult clone() {
        try {
            return (GetApnsChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
