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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains additional details about a service-specific credential.
 * </p>
 */
public class ServiceSpecificCredentialMetadata implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the IAM user associated with the service-specific credential.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The status of the service-specific credential. <code>Active</code> means the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The generated user name for the service-specific credential.
     * </p>
     */
    private String serviceUserName;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     * service-specific credential were created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The unique identifier for the service-specific credential.
     * </p>
     */
    private String serviceSpecificCredentialId;
    /**
     * <p>
     * The name of the service associated with the service-specific credential.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The name of the IAM user associated with the service-specific credential.
     * </p>
     * 
     * @param userName
     *        The name of the IAM user associated with the service-specific credential.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user associated with the service-specific credential.
     * </p>
     * 
     * @return The name of the IAM user associated with the service-specific credential.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the IAM user associated with the service-specific credential.
     * </p>
     * 
     * @param userName
     *        The name of the IAM user associated with the service-specific credential.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSpecificCredentialMetadata withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The status of the service-specific credential. <code>Active</code> means the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the service-specific credential. <code>Active</code> means the key is valid for API calls,
     *        while <code>Inactive</code> means it is not.
     * @see StatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the service-specific credential. <code>Active</code> means the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @return The status of the service-specific credential. <code>Active</code> means the key is valid for API calls,
     *         while <code>Inactive</code> means it is not.
     * @see StatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the service-specific credential. <code>Active</code> means the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the service-specific credential. <code>Active</code> means the key is valid for API calls,
     *        while <code>Inactive</code> means it is not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public ServiceSpecificCredentialMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the service-specific credential. <code>Active</code> means the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the service-specific credential. <code>Active</code> means the key is valid for API calls,
     *        while <code>Inactive</code> means it is not.
     * @see StatusType
     */

    public void setStatus(StatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the service-specific credential. <code>Active</code> means the key is valid for API calls, while
     * <code>Inactive</code> means it is not.
     * </p>
     * 
     * @param status
     *        The status of the service-specific credential. <code>Active</code> means the key is valid for API calls,
     *        while <code>Inactive</code> means it is not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public ServiceSpecificCredentialMetadata withStatus(StatusType status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The generated user name for the service-specific credential.
     * </p>
     * 
     * @param serviceUserName
     *        The generated user name for the service-specific credential.
     */

    public void setServiceUserName(String serviceUserName) {
        this.serviceUserName = serviceUserName;
    }

    /**
     * <p>
     * The generated user name for the service-specific credential.
     * </p>
     * 
     * @return The generated user name for the service-specific credential.
     */

    public String getServiceUserName() {
        return this.serviceUserName;
    }

    /**
     * <p>
     * The generated user name for the service-specific credential.
     * </p>
     * 
     * @param serviceUserName
     *        The generated user name for the service-specific credential.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSpecificCredentialMetadata withServiceUserName(String serviceUserName) {
        setServiceUserName(serviceUserName);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     * service-specific credential were created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        service-specific credential were created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     * service-specific credential were created.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         service-specific credential were created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     * service-specific credential were created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        service-specific credential were created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSpecificCredentialMetadata withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the service-specific credential.
     * </p>
     * 
     * @param serviceSpecificCredentialId
     *        The unique identifier for the service-specific credential.
     */

    public void setServiceSpecificCredentialId(String serviceSpecificCredentialId) {
        this.serviceSpecificCredentialId = serviceSpecificCredentialId;
    }

    /**
     * <p>
     * The unique identifier for the service-specific credential.
     * </p>
     * 
     * @return The unique identifier for the service-specific credential.
     */

    public String getServiceSpecificCredentialId() {
        return this.serviceSpecificCredentialId;
    }

    /**
     * <p>
     * The unique identifier for the service-specific credential.
     * </p>
     * 
     * @param serviceSpecificCredentialId
     *        The unique identifier for the service-specific credential.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSpecificCredentialMetadata withServiceSpecificCredentialId(String serviceSpecificCredentialId) {
        setServiceSpecificCredentialId(serviceSpecificCredentialId);
        return this;
    }

    /**
     * <p>
     * The name of the service associated with the service-specific credential.
     * </p>
     * 
     * @param serviceName
     *        The name of the service associated with the service-specific credential.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service associated with the service-specific credential.
     * </p>
     * 
     * @return The name of the service associated with the service-specific credential.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service associated with the service-specific credential.
     * </p>
     * 
     * @param serviceName
     *        The name of the service associated with the service-specific credential.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSpecificCredentialMetadata withServiceName(String serviceName) {
        setServiceName(serviceName);
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getServiceUserName() != null)
            sb.append("ServiceUserName: ").append(getServiceUserName()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getServiceSpecificCredentialId() != null)
            sb.append("ServiceSpecificCredentialId: ").append(getServiceSpecificCredentialId()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceSpecificCredentialMetadata == false)
            return false;
        ServiceSpecificCredentialMetadata other = (ServiceSpecificCredentialMetadata) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getServiceUserName() == null ^ this.getServiceUserName() == null)
            return false;
        if (other.getServiceUserName() != null && other.getServiceUserName().equals(this.getServiceUserName()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getServiceSpecificCredentialId() == null ^ this.getServiceSpecificCredentialId() == null)
            return false;
        if (other.getServiceSpecificCredentialId() != null && other.getServiceSpecificCredentialId().equals(this.getServiceSpecificCredentialId()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getServiceUserName() == null) ? 0 : getServiceUserName().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getServiceSpecificCredentialId() == null) ? 0 : getServiceSpecificCredentialId().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public ServiceSpecificCredentialMetadata clone() {
        try {
            return (ServiceSpecificCredentialMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
