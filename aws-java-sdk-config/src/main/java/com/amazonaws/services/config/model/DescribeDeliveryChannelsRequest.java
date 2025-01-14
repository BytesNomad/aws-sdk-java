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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <a>DescribeDeliveryChannels</a> action.
 * </p>
 */
public class DescribeDeliveryChannelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of delivery channel names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> deliveryChannelNames;

    /**
     * <p>
     * A list of delivery channel names.
     * </p>
     * 
     * @return A list of delivery channel names.
     */

    public java.util.List<String> getDeliveryChannelNames() {
        if (deliveryChannelNames == null) {
            deliveryChannelNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return deliveryChannelNames;
    }

    /**
     * <p>
     * A list of delivery channel names.
     * </p>
     * 
     * @param deliveryChannelNames
     *        A list of delivery channel names.
     */

    public void setDeliveryChannelNames(java.util.Collection<String> deliveryChannelNames) {
        if (deliveryChannelNames == null) {
            this.deliveryChannelNames = null;
            return;
        }

        this.deliveryChannelNames = new com.amazonaws.internal.SdkInternalList<String>(deliveryChannelNames);
    }

    /**
     * <p>
     * A list of delivery channel names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeliveryChannelNames(java.util.Collection)} or {@link #withDeliveryChannelNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param deliveryChannelNames
     *        A list of delivery channel names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeliveryChannelsRequest withDeliveryChannelNames(String... deliveryChannelNames) {
        if (this.deliveryChannelNames == null) {
            setDeliveryChannelNames(new com.amazonaws.internal.SdkInternalList<String>(deliveryChannelNames.length));
        }
        for (String ele : deliveryChannelNames) {
            this.deliveryChannelNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of delivery channel names.
     * </p>
     * 
     * @param deliveryChannelNames
     *        A list of delivery channel names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeliveryChannelsRequest withDeliveryChannelNames(java.util.Collection<String> deliveryChannelNames) {
        setDeliveryChannelNames(deliveryChannelNames);
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
        if (getDeliveryChannelNames() != null)
            sb.append("DeliveryChannelNames: ").append(getDeliveryChannelNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDeliveryChannelsRequest == false)
            return false;
        DescribeDeliveryChannelsRequest other = (DescribeDeliveryChannelsRequest) obj;
        if (other.getDeliveryChannelNames() == null ^ this.getDeliveryChannelNames() == null)
            return false;
        if (other.getDeliveryChannelNames() != null && other.getDeliveryChannelNames().equals(this.getDeliveryChannelNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryChannelNames() == null) ? 0 : getDeliveryChannelNames().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeliveryChannelsRequest clone() {
        return (DescribeDeliveryChannelsRequest) super.clone();
    }

}
