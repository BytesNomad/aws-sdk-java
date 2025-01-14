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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes information about the instance ports.
 * </p>
 */
public class InstancePortInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The first port in the range.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * The last port in the range.
     * </p>
     */
    private Integer toPort;
    /**
     * <p>
     * The protocol.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The location from which access is allowed (e.g., <code>Anywhere (0.0.0.0/0)</code>).
     * </p>
     */
    private String accessFrom;
    /**
     * <p>
     * The type of access (<code>Public</code> or <code>Private</code>).
     * </p>
     */
    private String accessType;
    /**
     * <p>
     * The common name.
     * </p>
     */
    private String commonName;
    /**
     * <p>
     * The access direction (<code>inbound</code> or <code>outbound</code>).
     * </p>
     */
    private String accessDirection;

    /**
     * <p>
     * The first port in the range.
     * </p>
     * 
     * @param fromPort
     *        The first port in the range.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The first port in the range.
     * </p>
     * 
     * @return The first port in the range.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The first port in the range.
     * </p>
     * 
     * @param fromPort
     *        The first port in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortInfo withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The last port in the range.
     * </p>
     * 
     * @param toPort
     *        The last port in the range.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The last port in the range.
     * </p>
     * 
     * @return The last port in the range.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The last port in the range.
     * </p>
     * 
     * @param toPort
     *        The last port in the range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortInfo withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @see NetworkProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @return The protocol.
     * @see NetworkProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProtocol
     */

    public InstancePortInfo withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @see NetworkProtocol
     */

    public void setProtocol(NetworkProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProtocol
     */

    public InstancePortInfo withProtocol(NetworkProtocol protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The location from which access is allowed (e.g., <code>Anywhere (0.0.0.0/0)</code>).
     * </p>
     * 
     * @param accessFrom
     *        The location from which access is allowed (e.g., <code>Anywhere (0.0.0.0/0)</code>).
     */

    public void setAccessFrom(String accessFrom) {
        this.accessFrom = accessFrom;
    }

    /**
     * <p>
     * The location from which access is allowed (e.g., <code>Anywhere (0.0.0.0/0)</code>).
     * </p>
     * 
     * @return The location from which access is allowed (e.g., <code>Anywhere (0.0.0.0/0)</code>).
     */

    public String getAccessFrom() {
        return this.accessFrom;
    }

    /**
     * <p>
     * The location from which access is allowed (e.g., <code>Anywhere (0.0.0.0/0)</code>).
     * </p>
     * 
     * @param accessFrom
     *        The location from which access is allowed (e.g., <code>Anywhere (0.0.0.0/0)</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortInfo withAccessFrom(String accessFrom) {
        setAccessFrom(accessFrom);
        return this;
    }

    /**
     * <p>
     * The type of access (<code>Public</code> or <code>Private</code>).
     * </p>
     * 
     * @param accessType
     *        The type of access (<code>Public</code> or <code>Private</code>).
     * @see PortAccessType
     */

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    /**
     * <p>
     * The type of access (<code>Public</code> or <code>Private</code>).
     * </p>
     * 
     * @return The type of access (<code>Public</code> or <code>Private</code>).
     * @see PortAccessType
     */

    public String getAccessType() {
        return this.accessType;
    }

    /**
     * <p>
     * The type of access (<code>Public</code> or <code>Private</code>).
     * </p>
     * 
     * @param accessType
     *        The type of access (<code>Public</code> or <code>Private</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortAccessType
     */

    public InstancePortInfo withAccessType(String accessType) {
        setAccessType(accessType);
        return this;
    }

    /**
     * <p>
     * The type of access (<code>Public</code> or <code>Private</code>).
     * </p>
     * 
     * @param accessType
     *        The type of access (<code>Public</code> or <code>Private</code>).
     * @see PortAccessType
     */

    public void setAccessType(PortAccessType accessType) {
        this.accessType = accessType.toString();
    }

    /**
     * <p>
     * The type of access (<code>Public</code> or <code>Private</code>).
     * </p>
     * 
     * @param accessType
     *        The type of access (<code>Public</code> or <code>Private</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortAccessType
     */

    public InstancePortInfo withAccessType(PortAccessType accessType) {
        setAccessType(accessType);
        return this;
    }

    /**
     * <p>
     * The common name.
     * </p>
     * 
     * @param commonName
     *        The common name.
     */

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    /**
     * <p>
     * The common name.
     * </p>
     * 
     * @return The common name.
     */

    public String getCommonName() {
        return this.commonName;
    }

    /**
     * <p>
     * The common name.
     * </p>
     * 
     * @param commonName
     *        The common name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstancePortInfo withCommonName(String commonName) {
        setCommonName(commonName);
        return this;
    }

    /**
     * <p>
     * The access direction (<code>inbound</code> or <code>outbound</code>).
     * </p>
     * 
     * @param accessDirection
     *        The access direction (<code>inbound</code> or <code>outbound</code>).
     * @see AccessDirection
     */

    public void setAccessDirection(String accessDirection) {
        this.accessDirection = accessDirection;
    }

    /**
     * <p>
     * The access direction (<code>inbound</code> or <code>outbound</code>).
     * </p>
     * 
     * @return The access direction (<code>inbound</code> or <code>outbound</code>).
     * @see AccessDirection
     */

    public String getAccessDirection() {
        return this.accessDirection;
    }

    /**
     * <p>
     * The access direction (<code>inbound</code> or <code>outbound</code>).
     * </p>
     * 
     * @param accessDirection
     *        The access direction (<code>inbound</code> or <code>outbound</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessDirection
     */

    public InstancePortInfo withAccessDirection(String accessDirection) {
        setAccessDirection(accessDirection);
        return this;
    }

    /**
     * <p>
     * The access direction (<code>inbound</code> or <code>outbound</code>).
     * </p>
     * 
     * @param accessDirection
     *        The access direction (<code>inbound</code> or <code>outbound</code>).
     * @see AccessDirection
     */

    public void setAccessDirection(AccessDirection accessDirection) {
        this.accessDirection = accessDirection.toString();
    }

    /**
     * <p>
     * The access direction (<code>inbound</code> or <code>outbound</code>).
     * </p>
     * 
     * @param accessDirection
     *        The access direction (<code>inbound</code> or <code>outbound</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessDirection
     */

    public InstancePortInfo withAccessDirection(AccessDirection accessDirection) {
        setAccessDirection(accessDirection);
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
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getAccessFrom() != null)
            sb.append("AccessFrom: ").append(getAccessFrom()).append(",");
        if (getAccessType() != null)
            sb.append("AccessType: ").append(getAccessType()).append(",");
        if (getCommonName() != null)
            sb.append("CommonName: ").append(getCommonName()).append(",");
        if (getAccessDirection() != null)
            sb.append("AccessDirection: ").append(getAccessDirection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstancePortInfo == false)
            return false;
        InstancePortInfo other = (InstancePortInfo) obj;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getAccessFrom() == null ^ this.getAccessFrom() == null)
            return false;
        if (other.getAccessFrom() != null && other.getAccessFrom().equals(this.getAccessFrom()) == false)
            return false;
        if (other.getAccessType() == null ^ this.getAccessType() == null)
            return false;
        if (other.getAccessType() != null && other.getAccessType().equals(this.getAccessType()) == false)
            return false;
        if (other.getCommonName() == null ^ this.getCommonName() == null)
            return false;
        if (other.getCommonName() != null && other.getCommonName().equals(this.getCommonName()) == false)
            return false;
        if (other.getAccessDirection() == null ^ this.getAccessDirection() == null)
            return false;
        if (other.getAccessDirection() != null && other.getAccessDirection().equals(this.getAccessDirection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getAccessFrom() == null) ? 0 : getAccessFrom().hashCode());
        hashCode = prime * hashCode + ((getAccessType() == null) ? 0 : getAccessType().hashCode());
        hashCode = prime * hashCode + ((getCommonName() == null) ? 0 : getCommonName().hashCode());
        hashCode = prime * hashCode + ((getAccessDirection() == null) ? 0 : getAccessDirection().hashCode());
        return hashCode;
    }

    @Override
    public InstancePortInfo clone() {
        try {
            return (InstancePortInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
