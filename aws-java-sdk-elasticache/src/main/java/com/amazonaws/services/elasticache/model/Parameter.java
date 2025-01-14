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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an individual setting that controls some aspect of ElastiCache behavior.
 * </p>
 */
public class Parameter implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String parameterName;
    /**
     * <p>
     * The value of the parameter.
     * </p>
     */
    private String parameterValue;
    /**
     * <p>
     * A description of the parameter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The source of the parameter.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The valid data type for the parameter.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     */
    private String allowedValues;
    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the parameter can be modified. Some parameters
     * have security or operational implications that prevent them from being changed.
     * </p>
     */
    private Boolean isModifiable;
    /**
     * <p>
     * The earliest cache engine version to which the parameter can apply.
     * </p>
     */
    private String minimumEngineVersion;
    /**
     * <p>
     * Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to be
     * applied. You can force a reboot or wait until the next maintenance window's reboot. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Clusters.Rebooting.html">Rebooting a
     * Cluster</a>.
     * </p>
     */
    private String changeType;

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param parameterName
     *        The name of the parameter.
     */

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @return The name of the parameter.
     */

    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param parameterName
     *        The name of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withParameterName(String parameterName) {
        setParameterName(parameterName);
        return this;
    }

    /**
     * <p>
     * The value of the parameter.
     * </p>
     * 
     * @param parameterValue
     *        The value of the parameter.
     */

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * <p>
     * The value of the parameter.
     * </p>
     * 
     * @return The value of the parameter.
     */

    public String getParameterValue() {
        return this.parameterValue;
    }

    /**
     * <p>
     * The value of the parameter.
     * </p>
     * 
     * @param parameterValue
     *        The value of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withParameterValue(String parameterValue) {
        setParameterValue(parameterValue);
        return this;
    }

    /**
     * <p>
     * A description of the parameter.
     * </p>
     * 
     * @param description
     *        A description of the parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the parameter.
     * </p>
     * 
     * @return A description of the parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the parameter.
     * </p>
     * 
     * @param description
     *        A description of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The source of the parameter.
     * </p>
     * 
     * @param source
     *        The source of the parameter.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the parameter.
     * </p>
     * 
     * @return The source of the parameter.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the parameter.
     * </p>
     * 
     * @param source
     *        The source of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The valid data type for the parameter.
     * </p>
     * 
     * @param dataType
     *        The valid data type for the parameter.
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The valid data type for the parameter.
     * </p>
     * 
     * @return The valid data type for the parameter.
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The valid data type for the parameter.
     * </p>
     * 
     * @param dataType
     *        The valid data type for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     * 
     * @param allowedValues
     *        The valid range of values for the parameter.
     */

    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     * 
     * @return The valid range of values for the parameter.
     */

    public String getAllowedValues() {
        return this.allowedValues;
    }

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     * 
     * @param allowedValues
     *        The valid range of values for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withAllowedValues(String allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the parameter can be modified. Some parameters
     * have security or operational implications that prevent them from being changed.
     * </p>
     * 
     * @param isModifiable
     *        Indicates whether (<code>true</code>) or not (<code>false</code>) the parameter can be modified. Some
     *        parameters have security or operational implications that prevent them from being changed.
     */

    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }

    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the parameter can be modified. Some parameters
     * have security or operational implications that prevent them from being changed.
     * </p>
     * 
     * @return Indicates whether (<code>true</code>) or not (<code>false</code>) the parameter can be modified. Some
     *         parameters have security or operational implications that prevent them from being changed.
     */

    public Boolean getIsModifiable() {
        return this.isModifiable;
    }

    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the parameter can be modified. Some parameters
     * have security or operational implications that prevent them from being changed.
     * </p>
     * 
     * @param isModifiable
     *        Indicates whether (<code>true</code>) or not (<code>false</code>) the parameter can be modified. Some
     *        parameters have security or operational implications that prevent them from being changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withIsModifiable(Boolean isModifiable) {
        setIsModifiable(isModifiable);
        return this;
    }

    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the parameter can be modified. Some parameters
     * have security or operational implications that prevent them from being changed.
     * </p>
     * 
     * @return Indicates whether (<code>true</code>) or not (<code>false</code>) the parameter can be modified. Some
     *         parameters have security or operational implications that prevent them from being changed.
     */

    public Boolean isModifiable() {
        return this.isModifiable;
    }

    /**
     * <p>
     * The earliest cache engine version to which the parameter can apply.
     * </p>
     * 
     * @param minimumEngineVersion
     *        The earliest cache engine version to which the parameter can apply.
     */

    public void setMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
    }

    /**
     * <p>
     * The earliest cache engine version to which the parameter can apply.
     * </p>
     * 
     * @return The earliest cache engine version to which the parameter can apply.
     */

    public String getMinimumEngineVersion() {
        return this.minimumEngineVersion;
    }

    /**
     * <p>
     * The earliest cache engine version to which the parameter can apply.
     * </p>
     * 
     * @param minimumEngineVersion
     *        The earliest cache engine version to which the parameter can apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withMinimumEngineVersion(String minimumEngineVersion) {
        setMinimumEngineVersion(minimumEngineVersion);
        return this;
    }

    /**
     * <p>
     * Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to be
     * applied. You can force a reboot or wait until the next maintenance window's reboot. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Clusters.Rebooting.html">Rebooting a
     * Cluster</a>.
     * </p>
     * 
     * @param changeType
     *        Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to
     *        be applied. You can force a reboot or wait until the next maintenance window's reboot. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Clusters.Rebooting.html">Rebooting a
     *        Cluster</a>.
     * @see ChangeType
     */

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * <p>
     * Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to be
     * applied. You can force a reboot or wait until the next maintenance window's reboot. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Clusters.Rebooting.html">Rebooting a
     * Cluster</a>.
     * </p>
     * 
     * @return Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to
     *         be applied. You can force a reboot or wait until the next maintenance window's reboot. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Clusters.Rebooting.html">Rebooting a
     *         Cluster</a>.
     * @see ChangeType
     */

    public String getChangeType() {
        return this.changeType;
    }

    /**
     * <p>
     * Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to be
     * applied. You can force a reboot or wait until the next maintenance window's reboot. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Clusters.Rebooting.html">Rebooting a
     * Cluster</a>.
     * </p>
     * 
     * @param changeType
     *        Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to
     *        be applied. You can force a reboot or wait until the next maintenance window's reboot. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Clusters.Rebooting.html">Rebooting a
     *        Cluster</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public Parameter withChangeType(String changeType) {
        setChangeType(changeType);
        return this;
    }

    /**
     * <p>
     * Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to be
     * applied. You can force a reboot or wait until the next maintenance window's reboot. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Clusters.Rebooting.html">Rebooting a
     * Cluster</a>.
     * </p>
     * 
     * @param changeType
     *        Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to
     *        be applied. You can force a reboot or wait until the next maintenance window's reboot. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Clusters.Rebooting.html">Rebooting a
     *        Cluster</a>.
     * @see ChangeType
     */

    public void setChangeType(ChangeType changeType) {
        this.changeType = changeType.toString();
    }

    /**
     * <p>
     * Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to be
     * applied. You can force a reboot or wait until the next maintenance window's reboot. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Clusters.Rebooting.html">Rebooting a
     * Cluster</a>.
     * </p>
     * 
     * @param changeType
     *        Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to
     *        be applied. You can force a reboot or wait until the next maintenance window's reboot. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Clusters.Rebooting.html">Rebooting a
     *        Cluster</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public Parameter withChangeType(ChangeType changeType) {
        setChangeType(changeType);
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
        if (getParameterName() != null)
            sb.append("ParameterName: ").append(getParameterName()).append(",");
        if (getParameterValue() != null)
            sb.append("ParameterValue: ").append(getParameterValue()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getIsModifiable() != null)
            sb.append("IsModifiable: ").append(getIsModifiable()).append(",");
        if (getMinimumEngineVersion() != null)
            sb.append("MinimumEngineVersion: ").append(getMinimumEngineVersion()).append(",");
        if (getChangeType() != null)
            sb.append("ChangeType: ").append(getChangeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parameter == false)
            return false;
        Parameter other = (Parameter) obj;
        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false)
            return false;
        if (other.getParameterValue() == null ^ this.getParameterValue() == null)
            return false;
        if (other.getParameterValue() != null && other.getParameterValue().equals(this.getParameterValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getIsModifiable() == null ^ this.getIsModifiable() == null)
            return false;
        if (other.getIsModifiable() != null && other.getIsModifiable().equals(this.getIsModifiable()) == false)
            return false;
        if (other.getMinimumEngineVersion() == null ^ this.getMinimumEngineVersion() == null)
            return false;
        if (other.getMinimumEngineVersion() != null && other.getMinimumEngineVersion().equals(this.getMinimumEngineVersion()) == false)
            return false;
        if (other.getChangeType() == null ^ this.getChangeType() == null)
            return false;
        if (other.getChangeType() != null && other.getChangeType().equals(this.getChangeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getIsModifiable() == null) ? 0 : getIsModifiable().hashCode());
        hashCode = prime * hashCode + ((getMinimumEngineVersion() == null) ? 0 : getMinimumEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        return hashCode;
    }

    @Override
    public Parameter clone() {
        try {
            return (Parameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
