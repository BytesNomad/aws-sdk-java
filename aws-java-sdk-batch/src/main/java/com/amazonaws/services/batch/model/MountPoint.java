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
package com.amazonaws.services.batch.model;

import java.io.Serializable;

/**
 * <p>
 * Details on a volume mount point that is used in a job's container properties.
 * </p>
 */
public class MountPoint implements Serializable, Cloneable {

    /**
     * <p>
     * The path on the container at which to mount the host volume.
     * </p>
     */
    private String containerPath;
    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume; otherwise, the container
     * can write to the volume. The default value is <code>false</code>.
     * </p>
     */
    private Boolean readOnly;
    /**
     * <p>
     * The name of the volume to mount.
     * </p>
     */
    private String sourceVolume;

    /**
     * <p>
     * The path on the container at which to mount the host volume.
     * </p>
     * 
     * @param containerPath
     *        The path on the container at which to mount the host volume.
     */

    public void setContainerPath(String containerPath) {
        this.containerPath = containerPath;
    }

    /**
     * <p>
     * The path on the container at which to mount the host volume.
     * </p>
     * 
     * @return The path on the container at which to mount the host volume.
     */

    public String getContainerPath() {
        return this.containerPath;
    }

    /**
     * <p>
     * The path on the container at which to mount the host volume.
     * </p>
     * 
     * @param containerPath
     *        The path on the container at which to mount the host volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountPoint withContainerPath(String containerPath) {
        setContainerPath(containerPath);
        return this;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume; otherwise, the container
     * can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @param readOnly
     *        If this value is <code>true</code>, the container has read-only access to the volume; otherwise, the
     *        container can write to the volume. The default value is <code>false</code>.
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume; otherwise, the container
     * can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @return If this value is <code>true</code>, the container has read-only access to the volume; otherwise, the
     *         container can write to the volume. The default value is <code>false</code>.
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume; otherwise, the container
     * can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @param readOnly
     *        If this value is <code>true</code>, the container has read-only access to the volume; otherwise, the
     *        container can write to the volume. The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountPoint withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume; otherwise, the container
     * can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @return If this value is <code>true</code>, the container has read-only access to the volume; otherwise, the
     *         container can write to the volume. The default value is <code>false</code>.
     */

    public Boolean isReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * The name of the volume to mount.
     * </p>
     * 
     * @param sourceVolume
     *        The name of the volume to mount.
     */

    public void setSourceVolume(String sourceVolume) {
        this.sourceVolume = sourceVolume;
    }

    /**
     * <p>
     * The name of the volume to mount.
     * </p>
     * 
     * @return The name of the volume to mount.
     */

    public String getSourceVolume() {
        return this.sourceVolume;
    }

    /**
     * <p>
     * The name of the volume to mount.
     * </p>
     * 
     * @param sourceVolume
     *        The name of the volume to mount.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountPoint withSourceVolume(String sourceVolume) {
        setSourceVolume(sourceVolume);
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
        if (getContainerPath() != null)
            sb.append("ContainerPath: ").append(getContainerPath()).append(",");
        if (getReadOnly() != null)
            sb.append("ReadOnly: ").append(getReadOnly()).append(",");
        if (getSourceVolume() != null)
            sb.append("SourceVolume: ").append(getSourceVolume());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MountPoint == false)
            return false;
        MountPoint other = (MountPoint) obj;
        if (other.getContainerPath() == null ^ this.getContainerPath() == null)
            return false;
        if (other.getContainerPath() != null && other.getContainerPath().equals(this.getContainerPath()) == false)
            return false;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        if (other.getSourceVolume() == null ^ this.getSourceVolume() == null)
            return false;
        if (other.getSourceVolume() != null && other.getSourceVolume().equals(this.getSourceVolume()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerPath() == null) ? 0 : getContainerPath().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode + ((getSourceVolume() == null) ? 0 : getSourceVolume().hashCode());
        return hashCode;
    }

    @Override
    public MountPoint clone() {
        try {
            return (MountPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
