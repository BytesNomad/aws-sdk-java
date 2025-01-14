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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeregisterJobDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name and revision (<code>name:revision</code>) or full Amazon Resource Name (ARN) of the job definition to
     * deregister.
     * </p>
     */
    private String jobDefinition;

    /**
     * <p>
     * The name and revision (<code>name:revision</code>) or full Amazon Resource Name (ARN) of the job definition to
     * deregister.
     * </p>
     * 
     * @param jobDefinition
     *        The name and revision (<code>name:revision</code>) or full Amazon Resource Name (ARN) of the job
     *        definition to deregister.
     */

    public void setJobDefinition(String jobDefinition) {
        this.jobDefinition = jobDefinition;
    }

    /**
     * <p>
     * The name and revision (<code>name:revision</code>) or full Amazon Resource Name (ARN) of the job definition to
     * deregister.
     * </p>
     * 
     * @return The name and revision (<code>name:revision</code>) or full Amazon Resource Name (ARN) of the job
     *         definition to deregister.
     */

    public String getJobDefinition() {
        return this.jobDefinition;
    }

    /**
     * <p>
     * The name and revision (<code>name:revision</code>) or full Amazon Resource Name (ARN) of the job definition to
     * deregister.
     * </p>
     * 
     * @param jobDefinition
     *        The name and revision (<code>name:revision</code>) or full Amazon Resource Name (ARN) of the job
     *        definition to deregister.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterJobDefinitionRequest withJobDefinition(String jobDefinition) {
        setJobDefinition(jobDefinition);
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
        if (getJobDefinition() != null)
            sb.append("JobDefinition: ").append(getJobDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterJobDefinitionRequest == false)
            return false;
        DeregisterJobDefinitionRequest other = (DeregisterJobDefinitionRequest) obj;
        if (other.getJobDefinition() == null ^ this.getJobDefinition() == null)
            return false;
        if (other.getJobDefinition() != null && other.getJobDefinition().equals(this.getJobDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobDefinition() == null) ? 0 : getJobDefinition().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterJobDefinitionRequest clone() {
        return (DeregisterJobDefinitionRequest) super.clone();
    }

}
