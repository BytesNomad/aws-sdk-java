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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeEventDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331", "arn:aws:health:us-west-1::event/AWS_EBS_LOST_VOLUME_xyz"</code>
     * </p>
     */
    private java.util.List<String> eventArns;
    /**
     * <p>
     * The locale (language) to return information in. The default is English.
     * </p>
     */
    private String locale;

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331", "arn:aws:health:us-west-1::event/AWS_EBS_LOST_VOLUME_xyz"</code>
     * </p>
     * 
     * @return A list of event ARNs (unique identifiers). For example:
     *         <code>"arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331", "arn:aws:health:us-west-1::event/AWS_EBS_LOST_VOLUME_xyz"</code>
     */

    public java.util.List<String> getEventArns() {
        return eventArns;
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331", "arn:aws:health:us-west-1::event/AWS_EBS_LOST_VOLUME_xyz"</code>
     * </p>
     * 
     * @param eventArns
     *        A list of event ARNs (unique identifiers). For example:
     *        <code>"arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331", "arn:aws:health:us-west-1::event/AWS_EBS_LOST_VOLUME_xyz"</code>
     */

    public void setEventArns(java.util.Collection<String> eventArns) {
        if (eventArns == null) {
            this.eventArns = null;
            return;
        }

        this.eventArns = new java.util.ArrayList<String>(eventArns);
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331", "arn:aws:health:us-west-1::event/AWS_EBS_LOST_VOLUME_xyz"</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventArns(java.util.Collection)} or {@link #withEventArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventArns
     *        A list of event ARNs (unique identifiers). For example:
     *        <code>"arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331", "arn:aws:health:us-west-1::event/AWS_EBS_LOST_VOLUME_xyz"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventDetailsRequest withEventArns(String... eventArns) {
        if (this.eventArns == null) {
            setEventArns(new java.util.ArrayList<String>(eventArns.length));
        }
        for (String ele : eventArns) {
            this.eventArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331", "arn:aws:health:us-west-1::event/AWS_EBS_LOST_VOLUME_xyz"</code>
     * </p>
     * 
     * @param eventArns
     *        A list of event ARNs (unique identifiers). For example:
     *        <code>"arn:aws:health:us-east-1::event/AWS_EC2_MAINTENANCE_5331", "arn:aws:health:us-west-1::event/AWS_EBS_LOST_VOLUME_xyz"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventDetailsRequest withEventArns(java.util.Collection<String> eventArns) {
        setEventArns(eventArns);
        return this;
    }

    /**
     * <p>
     * The locale (language) to return information in. The default is English.
     * </p>
     * 
     * @param locale
     *        The locale (language) to return information in. The default is English.
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale (language) to return information in. The default is English.
     * </p>
     * 
     * @return The locale (language) to return information in. The default is English.
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The locale (language) to return information in. The default is English.
     * </p>
     * 
     * @param locale
     *        The locale (language) to return information in. The default is English.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventDetailsRequest withLocale(String locale) {
        setLocale(locale);
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
        if (getEventArns() != null)
            sb.append("EventArns: ").append(getEventArns()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventDetailsRequest == false)
            return false;
        DescribeEventDetailsRequest other = (DescribeEventDetailsRequest) obj;
        if (other.getEventArns() == null ^ this.getEventArns() == null)
            return false;
        if (other.getEventArns() != null && other.getEventArns().equals(this.getEventArns()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventArns() == null) ? 0 : getEventArns().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventDetailsRequest clone() {
        return (DescribeEventDetailsRequest) super.clone();
    }

}
