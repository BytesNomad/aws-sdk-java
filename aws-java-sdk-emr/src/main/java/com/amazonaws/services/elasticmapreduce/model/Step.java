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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * This represents a step in a cluster.
 * </p>
 */
public class Step implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the cluster step.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the cluster step.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Hadoop job configuration of the cluster step.
     * </p>
     */
    private HadoopStepConfig config;
    /**
     * <p>
     * This specifies what action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER,
     * CANCEL_AND_WAIT, and CONTINUE.
     * </p>
     */
    private String actionOnFailure;
    /**
     * <p>
     * The current execution status details of the cluster step.
     * </p>
     */
    private StepStatus status;

    /**
     * <p>
     * The identifier of the cluster step.
     * </p>
     * 
     * @param id
     *        The identifier of the cluster step.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the cluster step.
     * </p>
     * 
     * @return The identifier of the cluster step.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the cluster step.
     * </p>
     * 
     * @param id
     *        The identifier of the cluster step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the cluster step.
     * </p>
     * 
     * @param name
     *        The name of the cluster step.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cluster step.
     * </p>
     * 
     * @return The name of the cluster step.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the cluster step.
     * </p>
     * 
     * @param name
     *        The name of the cluster step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Hadoop job configuration of the cluster step.
     * </p>
     * 
     * @param config
     *        The Hadoop job configuration of the cluster step.
     */

    public void setConfig(HadoopStepConfig config) {
        this.config = config;
    }

    /**
     * <p>
     * The Hadoop job configuration of the cluster step.
     * </p>
     * 
     * @return The Hadoop job configuration of the cluster step.
     */

    public HadoopStepConfig getConfig() {
        return this.config;
    }

    /**
     * <p>
     * The Hadoop job configuration of the cluster step.
     * </p>
     * 
     * @param config
     *        The Hadoop job configuration of the cluster step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withConfig(HadoopStepConfig config) {
        setConfig(config);
        return this;
    }

    /**
     * <p>
     * This specifies what action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER,
     * CANCEL_AND_WAIT, and CONTINUE.
     * </p>
     * 
     * @param actionOnFailure
     *        This specifies what action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER,
     *        CANCEL_AND_WAIT, and CONTINUE.
     * @see ActionOnFailure
     */

    public void setActionOnFailure(String actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
    }

    /**
     * <p>
     * This specifies what action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER,
     * CANCEL_AND_WAIT, and CONTINUE.
     * </p>
     * 
     * @return This specifies what action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER,
     *         CANCEL_AND_WAIT, and CONTINUE.
     * @see ActionOnFailure
     */

    public String getActionOnFailure() {
        return this.actionOnFailure;
    }

    /**
     * <p>
     * This specifies what action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER,
     * CANCEL_AND_WAIT, and CONTINUE.
     * </p>
     * 
     * @param actionOnFailure
     *        This specifies what action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER,
     *        CANCEL_AND_WAIT, and CONTINUE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionOnFailure
     */

    public Step withActionOnFailure(String actionOnFailure) {
        setActionOnFailure(actionOnFailure);
        return this;
    }

    /**
     * <p>
     * This specifies what action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER,
     * CANCEL_AND_WAIT, and CONTINUE.
     * </p>
     * 
     * @param actionOnFailure
     *        This specifies what action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER,
     *        CANCEL_AND_WAIT, and CONTINUE.
     * @see ActionOnFailure
     */

    public void setActionOnFailure(ActionOnFailure actionOnFailure) {
        this.actionOnFailure = actionOnFailure.toString();
    }

    /**
     * <p>
     * This specifies what action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER,
     * CANCEL_AND_WAIT, and CONTINUE.
     * </p>
     * 
     * @param actionOnFailure
     *        This specifies what action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER,
     *        CANCEL_AND_WAIT, and CONTINUE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionOnFailure
     */

    public Step withActionOnFailure(ActionOnFailure actionOnFailure) {
        setActionOnFailure(actionOnFailure);
        return this;
    }

    /**
     * <p>
     * The current execution status details of the cluster step.
     * </p>
     * 
     * @param status
     *        The current execution status details of the cluster step.
     */

    public void setStatus(StepStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current execution status details of the cluster step.
     * </p>
     * 
     * @return The current execution status details of the cluster step.
     */

    public StepStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current execution status details of the cluster step.
     * </p>
     * 
     * @param status
     *        The current execution status details of the cluster step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withStatus(StepStatus status) {
        setStatus(status);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getConfig() != null)
            sb.append("Config: ").append(getConfig()).append(",");
        if (getActionOnFailure() != null)
            sb.append("ActionOnFailure: ").append(getActionOnFailure()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Step == false)
            return false;
        Step other = (Step) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        if (other.getActionOnFailure() == null ^ this.getActionOnFailure() == null)
            return false;
        if (other.getActionOnFailure() != null && other.getActionOnFailure().equals(this.getActionOnFailure()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode());
        hashCode = prime * hashCode + ((getActionOnFailure() == null) ? 0 : getActionOnFailure().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Step clone() {
        try {
            return (Step) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
