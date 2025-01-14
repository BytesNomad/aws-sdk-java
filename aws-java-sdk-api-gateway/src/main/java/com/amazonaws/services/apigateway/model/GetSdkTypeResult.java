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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * A type of SDK that API Gateway can generate.
 * </p>
 */
public class GetSdkTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of an <a>SdkType</a> instance.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> instance.
     * </p>
     */
    private String friendlyName;
    /**
     * <p>
     * The description of an <a>SdkType</a>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of configuration properties of an <a>SdkType</a>.
     * </p>
     */
    private java.util.List<SdkConfigurationProperty> configurationProperties;

    /**
     * <p>
     * The identifier of an <a>SdkType</a> instance.
     * </p>
     * 
     * @param id
     *        The identifier of an <a>SdkType</a> instance.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of an <a>SdkType</a> instance.
     * </p>
     * 
     * @return The identifier of an <a>SdkType</a> instance.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of an <a>SdkType</a> instance.
     * </p>
     * 
     * @param id
     *        The identifier of an <a>SdkType</a> instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkTypeResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> instance.
     * </p>
     * 
     * @param friendlyName
     *        The user-friendly name of an <a>SdkType</a> instance.
     */

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> instance.
     * </p>
     * 
     * @return The user-friendly name of an <a>SdkType</a> instance.
     */

    public String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * <p>
     * The user-friendly name of an <a>SdkType</a> instance.
     * </p>
     * 
     * @param friendlyName
     *        The user-friendly name of an <a>SdkType</a> instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkTypeResult withFriendlyName(String friendlyName) {
        setFriendlyName(friendlyName);
        return this;
    }

    /**
     * <p>
     * The description of an <a>SdkType</a>.
     * </p>
     * 
     * @param description
     *        The description of an <a>SdkType</a>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of an <a>SdkType</a>.
     * </p>
     * 
     * @return The description of an <a>SdkType</a>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of an <a>SdkType</a>.
     * </p>
     * 
     * @param description
     *        The description of an <a>SdkType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkTypeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of configuration properties of an <a>SdkType</a>.
     * </p>
     * 
     * @return A list of configuration properties of an <a>SdkType</a>.
     */

    public java.util.List<SdkConfigurationProperty> getConfigurationProperties() {
        return configurationProperties;
    }

    /**
     * <p>
     * A list of configuration properties of an <a>SdkType</a>.
     * </p>
     * 
     * @param configurationProperties
     *        A list of configuration properties of an <a>SdkType</a>.
     */

    public void setConfigurationProperties(java.util.Collection<SdkConfigurationProperty> configurationProperties) {
        if (configurationProperties == null) {
            this.configurationProperties = null;
            return;
        }

        this.configurationProperties = new java.util.ArrayList<SdkConfigurationProperty>(configurationProperties);
    }

    /**
     * <p>
     * A list of configuration properties of an <a>SdkType</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationProperties(java.util.Collection)} or
     * {@link #withConfigurationProperties(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationProperties
     *        A list of configuration properties of an <a>SdkType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkTypeResult withConfigurationProperties(SdkConfigurationProperty... configurationProperties) {
        if (this.configurationProperties == null) {
            setConfigurationProperties(new java.util.ArrayList<SdkConfigurationProperty>(configurationProperties.length));
        }
        for (SdkConfigurationProperty ele : configurationProperties) {
            this.configurationProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of configuration properties of an <a>SdkType</a>.
     * </p>
     * 
     * @param configurationProperties
     *        A list of configuration properties of an <a>SdkType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkTypeResult withConfigurationProperties(java.util.Collection<SdkConfigurationProperty> configurationProperties) {
        setConfigurationProperties(configurationProperties);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getFriendlyName() != null)
            sb.append("FriendlyName: ").append(getFriendlyName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getConfigurationProperties() != null)
            sb.append("ConfigurationProperties: ").append(getConfigurationProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSdkTypeResult == false)
            return false;
        GetSdkTypeResult other = (GetSdkTypeResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getFriendlyName() == null ^ this.getFriendlyName() == null)
            return false;
        if (other.getFriendlyName() != null && other.getFriendlyName().equals(this.getFriendlyName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getConfigurationProperties() == null ^ this.getConfigurationProperties() == null)
            return false;
        if (other.getConfigurationProperties() != null && other.getConfigurationProperties().equals(this.getConfigurationProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getFriendlyName() == null) ? 0 : getFriendlyName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getConfigurationProperties() == null) ? 0 : getConfigurationProperties().hashCode());
        return hashCode;
    }

    @Override
    public GetSdkTypeResult clone() {
        try {
            return (GetSdkTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
