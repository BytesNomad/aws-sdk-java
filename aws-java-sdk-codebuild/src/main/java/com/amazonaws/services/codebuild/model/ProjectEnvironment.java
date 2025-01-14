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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the build project's build environment.
 * </p>
 */
public class ProjectEnvironment implements Serializable, Cloneable {

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <p>
     * The only valid value is <code>LINUX_CONTAINER</code>, which represents a Linux-based build environment.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The ID of the Docker image to use for this build project.
     * </p>
     */
    private String image;
    /**
     * <p>
     * Information about the compute resources the build project will use. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * </ul>
     */
    private String computeType;
    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     */
    private java.util.List<EnvironmentVariable> environmentVariables;

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <p>
     * The only valid value is <code>LINUX_CONTAINER</code>, which represents a Linux-based build environment.
     * </p>
     * 
     * @param type
     *        The type of build environment to use for related builds.</p>
     *        <p>
     *        The only valid value is <code>LINUX_CONTAINER</code>, which represents a Linux-based build environment.
     * @see EnvironmentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <p>
     * The only valid value is <code>LINUX_CONTAINER</code>, which represents a Linux-based build environment.
     * </p>
     * 
     * @return The type of build environment to use for related builds.</p>
     *         <p>
     *         The only valid value is <code>LINUX_CONTAINER</code>, which represents a Linux-based build environment.
     * @see EnvironmentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <p>
     * The only valid value is <code>LINUX_CONTAINER</code>, which represents a Linux-based build environment.
     * </p>
     * 
     * @param type
     *        The type of build environment to use for related builds.</p>
     *        <p>
     *        The only valid value is <code>LINUX_CONTAINER</code>, which represents a Linux-based build environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentType
     */

    public ProjectEnvironment withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <p>
     * The only valid value is <code>LINUX_CONTAINER</code>, which represents a Linux-based build environment.
     * </p>
     * 
     * @param type
     *        The type of build environment to use for related builds.</p>
     *        <p>
     *        The only valid value is <code>LINUX_CONTAINER</code>, which represents a Linux-based build environment.
     * @see EnvironmentType
     */

    public void setType(EnvironmentType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <p>
     * The only valid value is <code>LINUX_CONTAINER</code>, which represents a Linux-based build environment.
     * </p>
     * 
     * @param type
     *        The type of build environment to use for related builds.</p>
     *        <p>
     *        The only valid value is <code>LINUX_CONTAINER</code>, which represents a Linux-based build environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentType
     */

    public ProjectEnvironment withType(EnvironmentType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The ID of the Docker image to use for this build project.
     * </p>
     * 
     * @param image
     *        The ID of the Docker image to use for this build project.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The ID of the Docker image to use for this build project.
     * </p>
     * 
     * @return The ID of the Docker image to use for this build project.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The ID of the Docker image to use for this build project.
     * </p>
     * 
     * @param image
     *        The ID of the Docker image to use for this build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * Information about the compute resources the build project will use. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        Information about the compute resources the build project will use. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     * @see ComputeType
     */

    public void setComputeType(String computeType) {
        this.computeType = computeType;
    }

    /**
     * <p>
     * Information about the compute resources the build project will use. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the compute resources the build project will use. Available values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     *         </p>
     *         </li>
     * @see ComputeType
     */

    public String getComputeType() {
        return this.computeType;
    }

    /**
     * <p>
     * Information about the compute resources the build project will use. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        Information about the compute resources the build project will use. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public ProjectEnvironment withComputeType(String computeType) {
        setComputeType(computeType);
        return this;
    }

    /**
     * <p>
     * Information about the compute resources the build project will use. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        Information about the compute resources the build project will use. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     * @see ComputeType
     */

    public void setComputeType(ComputeType computeType) {
        this.computeType = computeType.toString();
    }

    /**
     * <p>
     * Information about the compute resources the build project will use. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        Information about the compute resources the build project will use. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for builds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BUILD_GENERAL1_LARGE</code>: Use up to 15 GB memory and 8 vCPUs for builds.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public ProjectEnvironment withComputeType(ComputeType computeType) {
        setComputeType(computeType);
        return this;
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     * 
     * @return A set of environment variables to make available to builds for this build project.
     */

    public java.util.List<EnvironmentVariable> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     * 
     * @param environmentVariables
     *        A set of environment variables to make available to builds for this build project.
     */

    public void setEnvironmentVariables(java.util.Collection<EnvironmentVariable> environmentVariables) {
        if (environmentVariables == null) {
            this.environmentVariables = null;
            return;
        }

        this.environmentVariables = new java.util.ArrayList<EnvironmentVariable>(environmentVariables);
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentVariables(java.util.Collection)} or {@link #withEnvironmentVariables(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param environmentVariables
     *        A set of environment variables to make available to builds for this build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withEnvironmentVariables(EnvironmentVariable... environmentVariables) {
        if (this.environmentVariables == null) {
            setEnvironmentVariables(new java.util.ArrayList<EnvironmentVariable>(environmentVariables.length));
        }
        for (EnvironmentVariable ele : environmentVariables) {
            this.environmentVariables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build project.
     * </p>
     * 
     * @param environmentVariables
     *        A set of environment variables to make available to builds for this build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectEnvironment withEnvironmentVariables(java.util.Collection<EnvironmentVariable> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getComputeType() != null)
            sb.append("ComputeType: ").append(getComputeType()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectEnvironment == false)
            return false;
        ProjectEnvironment other = (ProjectEnvironment) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getComputeType() == null ^ this.getComputeType() == null)
            return false;
        if (other.getComputeType() != null && other.getComputeType().equals(this.getComputeType()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getComputeType() == null) ? 0 : getComputeType().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        return hashCode;
    }

    @Override
    public ProjectEnvironment clone() {
        try {
            return (ProjectEnvironment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
