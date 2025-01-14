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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateStateMachineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the state machine. This name must be unique for your AWS account and region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon States Language definition of the state machine.
     * </p>
     */
    private String definition;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the state machine. This name must be unique for your AWS account and region.
     * </p>
     * 
     * @param name
     *        The name of the state machine. This name must be unique for your AWS account and region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the state machine. This name must be unique for your AWS account and region.
     * </p>
     * 
     * @return The name of the state machine. This name must be unique for your AWS account and region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the state machine. This name must be unique for your AWS account and region.
     * </p>
     * 
     * @param name
     *        The name of the state machine. This name must be unique for your AWS account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStateMachineRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine.
     * </p>
     * 
     * @param definition
     *        The Amazon States Language definition of the state machine.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine.
     * </p>
     * 
     * @return The Amazon States Language definition of the state machine.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine.
     * </p>
     * 
     * @param definition
     *        The Amazon States Language definition of the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStateMachineRequest withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStateMachineRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStateMachineRequest == false)
            return false;
        CreateStateMachineRequest other = (CreateStateMachineRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateStateMachineRequest clone() {
        return (CreateStateMachineRequest) super.clone();
    }

}
