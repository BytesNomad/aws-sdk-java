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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateApplicationResourceLifecycleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The lifecycle configuration.
     * </p>
     */
    private ApplicationResourceLifecycleConfig resourceLifecycleConfig;

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationResourceLifecycleRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The lifecycle configuration.
     * </p>
     * 
     * @param resourceLifecycleConfig
     *        The lifecycle configuration.
     */

    public void setResourceLifecycleConfig(ApplicationResourceLifecycleConfig resourceLifecycleConfig) {
        this.resourceLifecycleConfig = resourceLifecycleConfig;
    }

    /**
     * <p>
     * The lifecycle configuration.
     * </p>
     * 
     * @return The lifecycle configuration.
     */

    public ApplicationResourceLifecycleConfig getResourceLifecycleConfig() {
        return this.resourceLifecycleConfig;
    }

    /**
     * <p>
     * The lifecycle configuration.
     * </p>
     * 
     * @param resourceLifecycleConfig
     *        The lifecycle configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationResourceLifecycleRequest withResourceLifecycleConfig(ApplicationResourceLifecycleConfig resourceLifecycleConfig) {
        setResourceLifecycleConfig(resourceLifecycleConfig);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getResourceLifecycleConfig() != null)
            sb.append("ResourceLifecycleConfig: ").append(getResourceLifecycleConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationResourceLifecycleRequest == false)
            return false;
        UpdateApplicationResourceLifecycleRequest other = (UpdateApplicationResourceLifecycleRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getResourceLifecycleConfig() == null ^ this.getResourceLifecycleConfig() == null)
            return false;
        if (other.getResourceLifecycleConfig() != null && other.getResourceLifecycleConfig().equals(this.getResourceLifecycleConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getResourceLifecycleConfig() == null) ? 0 : getResourceLifecycleConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationResourceLifecycleRequest clone() {
        return (UpdateApplicationResourceLifecycleRequest) super.clone();
    }

}
