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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * The resource lifecycle configuration for an application. Defines lifecycle settings for resources that belong to the
 * application, and the service role that Elastic Beanstalk assumes in order to apply lifecycle settings. The version
 * lifecycle configuration defines lifecycle settings for application versions.
 * </p>
 */
public class ApplicationResourceLifecycleConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of an IAM service role that Elastic Beanstalk has permission to assume.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * The application version lifecycle configuration.
     * </p>
     */
    private ApplicationVersionLifecycleConfig versionLifecycleConfig;

    /**
     * <p>
     * The ARN of an IAM service role that Elastic Beanstalk has permission to assume.
     * </p>
     * 
     * @param serviceRole
     *        The ARN of an IAM service role that Elastic Beanstalk has permission to assume.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The ARN of an IAM service role that Elastic Beanstalk has permission to assume.
     * </p>
     * 
     * @return The ARN of an IAM service role that Elastic Beanstalk has permission to assume.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The ARN of an IAM service role that Elastic Beanstalk has permission to assume.
     * </p>
     * 
     * @param serviceRole
     *        The ARN of an IAM service role that Elastic Beanstalk has permission to assume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationResourceLifecycleConfig withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * The application version lifecycle configuration.
     * </p>
     * 
     * @param versionLifecycleConfig
     *        The application version lifecycle configuration.
     */

    public void setVersionLifecycleConfig(ApplicationVersionLifecycleConfig versionLifecycleConfig) {
        this.versionLifecycleConfig = versionLifecycleConfig;
    }

    /**
     * <p>
     * The application version lifecycle configuration.
     * </p>
     * 
     * @return The application version lifecycle configuration.
     */

    public ApplicationVersionLifecycleConfig getVersionLifecycleConfig() {
        return this.versionLifecycleConfig;
    }

    /**
     * <p>
     * The application version lifecycle configuration.
     * </p>
     * 
     * @param versionLifecycleConfig
     *        The application version lifecycle configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationResourceLifecycleConfig withVersionLifecycleConfig(ApplicationVersionLifecycleConfig versionLifecycleConfig) {
        setVersionLifecycleConfig(versionLifecycleConfig);
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
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getVersionLifecycleConfig() != null)
            sb.append("VersionLifecycleConfig: ").append(getVersionLifecycleConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationResourceLifecycleConfig == false)
            return false;
        ApplicationResourceLifecycleConfig other = (ApplicationResourceLifecycleConfig) obj;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getVersionLifecycleConfig() == null ^ this.getVersionLifecycleConfig() == null)
            return false;
        if (other.getVersionLifecycleConfig() != null && other.getVersionLifecycleConfig().equals(this.getVersionLifecycleConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getVersionLifecycleConfig() == null) ? 0 : getVersionLifecycleConfig().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationResourceLifecycleConfig clone() {
        try {
            return (ApplicationResourceLifecycleConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
