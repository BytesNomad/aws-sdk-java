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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a block device mapping. This data type maps directly to the Amazon EC2 <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html">BlockDeviceMapping</a> data
 * type.
 * </p>
 */
public class BlockDeviceMapping implements Serializable, Cloneable {

    /**
     * <p>
     * The device name that is exposed to the instance, such as <code>/dev/sdh</code>. For the root device, you can use
     * the explicit device name or you can set this parameter to <code>ROOT_DEVICE</code> and AWS OpsWorks will provide
     * the correct device name.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * Suppresses the specified device included in the AMI's block device mapping.
     * </p>
     */
    private String noDevice;
    /**
     * <p>
     * The virtual device name. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html">BlockDeviceMapping</a>.
     * </p>
     */
    private String virtualName;
    /**
     * <p>
     * An <code>EBSBlockDevice</code> that defines how to configure an Amazon EBS volume when the instance is launched.
     * </p>
     */
    private EbsBlockDevice ebs;

    /**
     * <p>
     * The device name that is exposed to the instance, such as <code>/dev/sdh</code>. For the root device, you can use
     * the explicit device name or you can set this parameter to <code>ROOT_DEVICE</code> and AWS OpsWorks will provide
     * the correct device name.
     * </p>
     * 
     * @param deviceName
     *        The device name that is exposed to the instance, such as <code>/dev/sdh</code>. For the root device, you
     *        can use the explicit device name or you can set this parameter to <code>ROOT_DEVICE</code> and AWS
     *        OpsWorks will provide the correct device name.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device name that is exposed to the instance, such as <code>/dev/sdh</code>. For the root device, you can use
     * the explicit device name or you can set this parameter to <code>ROOT_DEVICE</code> and AWS OpsWorks will provide
     * the correct device name.
     * </p>
     * 
     * @return The device name that is exposed to the instance, such as <code>/dev/sdh</code>. For the root device, you
     *         can use the explicit device name or you can set this parameter to <code>ROOT_DEVICE</code> and AWS
     *         OpsWorks will provide the correct device name.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The device name that is exposed to the instance, such as <code>/dev/sdh</code>. For the root device, you can use
     * the explicit device name or you can set this parameter to <code>ROOT_DEVICE</code> and AWS OpsWorks will provide
     * the correct device name.
     * </p>
     * 
     * @param deviceName
     *        The device name that is exposed to the instance, such as <code>/dev/sdh</code>. For the root device, you
     *        can use the explicit device name or you can set this parameter to <code>ROOT_DEVICE</code> and AWS
     *        OpsWorks will provide the correct device name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockDeviceMapping withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * Suppresses the specified device included in the AMI's block device mapping.
     * </p>
     * 
     * @param noDevice
     *        Suppresses the specified device included in the AMI's block device mapping.
     */

    public void setNoDevice(String noDevice) {
        this.noDevice = noDevice;
    }

    /**
     * <p>
     * Suppresses the specified device included in the AMI's block device mapping.
     * </p>
     * 
     * @return Suppresses the specified device included in the AMI's block device mapping.
     */

    public String getNoDevice() {
        return this.noDevice;
    }

    /**
     * <p>
     * Suppresses the specified device included in the AMI's block device mapping.
     * </p>
     * 
     * @param noDevice
     *        Suppresses the specified device included in the AMI's block device mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockDeviceMapping withNoDevice(String noDevice) {
        setNoDevice(noDevice);
        return this;
    }

    /**
     * <p>
     * The virtual device name. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html">BlockDeviceMapping</a>.
     * </p>
     * 
     * @param virtualName
     *        The virtual device name. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html"
     *        >BlockDeviceMapping</a>.
     */

    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }

    /**
     * <p>
     * The virtual device name. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html">BlockDeviceMapping</a>.
     * </p>
     * 
     * @return The virtual device name. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html"
     *         >BlockDeviceMapping</a>.
     */

    public String getVirtualName() {
        return this.virtualName;
    }

    /**
     * <p>
     * The virtual device name. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html">BlockDeviceMapping</a>.
     * </p>
     * 
     * @param virtualName
     *        The virtual device name. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html"
     *        >BlockDeviceMapping</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockDeviceMapping withVirtualName(String virtualName) {
        setVirtualName(virtualName);
        return this;
    }

    /**
     * <p>
     * An <code>EBSBlockDevice</code> that defines how to configure an Amazon EBS volume when the instance is launched.
     * </p>
     * 
     * @param ebs
     *        An <code>EBSBlockDevice</code> that defines how to configure an Amazon EBS volume when the instance is
     *        launched.
     */

    public void setEbs(EbsBlockDevice ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * An <code>EBSBlockDevice</code> that defines how to configure an Amazon EBS volume when the instance is launched.
     * </p>
     * 
     * @return An <code>EBSBlockDevice</code> that defines how to configure an Amazon EBS volume when the instance is
     *         launched.
     */

    public EbsBlockDevice getEbs() {
        return this.ebs;
    }

    /**
     * <p>
     * An <code>EBSBlockDevice</code> that defines how to configure an Amazon EBS volume when the instance is launched.
     * </p>
     * 
     * @param ebs
     *        An <code>EBSBlockDevice</code> that defines how to configure an Amazon EBS volume when the instance is
     *        launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockDeviceMapping withEbs(EbsBlockDevice ebs) {
        setEbs(ebs);
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
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getNoDevice() != null)
            sb.append("NoDevice: ").append(getNoDevice()).append(",");
        if (getVirtualName() != null)
            sb.append("VirtualName: ").append(getVirtualName()).append(",");
        if (getEbs() != null)
            sb.append("Ebs: ").append(getEbs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockDeviceMapping == false)
            return false;
        BlockDeviceMapping other = (BlockDeviceMapping) obj;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getNoDevice() == null ^ this.getNoDevice() == null)
            return false;
        if (other.getNoDevice() != null && other.getNoDevice().equals(this.getNoDevice()) == false)
            return false;
        if (other.getVirtualName() == null ^ this.getVirtualName() == null)
            return false;
        if (other.getVirtualName() != null && other.getVirtualName().equals(this.getVirtualName()) == false)
            return false;
        if (other.getEbs() == null ^ this.getEbs() == null)
            return false;
        if (other.getEbs() != null && other.getEbs().equals(this.getEbs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getNoDevice() == null) ? 0 : getNoDevice().hashCode());
        hashCode = prime * hashCode + ((getVirtualName() == null) ? 0 : getVirtualName().hashCode());
        hashCode = prime * hashCode + ((getEbs() == null) ? 0 : getEbs().hashCode());
        return hashCode;
    }

    @Override
    public BlockDeviceMapping clone() {
        try {
            return (BlockDeviceMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
