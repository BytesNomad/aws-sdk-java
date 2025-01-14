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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Option group option settings are used to display settings available for each option with their default values and
 * other information. These values are used with the DescribeOptionGroupOptions action.
 * </p>
 */
public class OptionGroupOptionSetting implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the option group option.
     * </p>
     */
    private String settingName;
    /**
     * <p>
     * The description of the option group option.
     * </p>
     */
    private String settingDescription;
    /**
     * <p>
     * The default value for the option group option.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The DB engine specific parameter type for the option group option.
     * </p>
     */
    private String applyType;
    /**
     * <p>
     * Indicates the acceptable values for the option group option.
     * </p>
     */
    private String allowedValues;
    /**
     * <p>
     * Boolean value where true indicates that this option group option can be changed from the default value.
     * </p>
     */
    private Boolean isModifiable;

    /**
     * <p>
     * The name of the option group option.
     * </p>
     * 
     * @param settingName
     *        The name of the option group option.
     */

    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

    /**
     * <p>
     * The name of the option group option.
     * </p>
     * 
     * @return The name of the option group option.
     */

    public String getSettingName() {
        return this.settingName;
    }

    /**
     * <p>
     * The name of the option group option.
     * </p>
     * 
     * @param settingName
     *        The name of the option group option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withSettingName(String settingName) {
        setSettingName(settingName);
        return this;
    }

    /**
     * <p>
     * The description of the option group option.
     * </p>
     * 
     * @param settingDescription
     *        The description of the option group option.
     */

    public void setSettingDescription(String settingDescription) {
        this.settingDescription = settingDescription;
    }

    /**
     * <p>
     * The description of the option group option.
     * </p>
     * 
     * @return The description of the option group option.
     */

    public String getSettingDescription() {
        return this.settingDescription;
    }

    /**
     * <p>
     * The description of the option group option.
     * </p>
     * 
     * @param settingDescription
     *        The description of the option group option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withSettingDescription(String settingDescription) {
        setSettingDescription(settingDescription);
        return this;
    }

    /**
     * <p>
     * The default value for the option group option.
     * </p>
     * 
     * @param defaultValue
     *        The default value for the option group option.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value for the option group option.
     * </p>
     * 
     * @return The default value for the option group option.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value for the option group option.
     * </p>
     * 
     * @param defaultValue
     *        The default value for the option group option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The DB engine specific parameter type for the option group option.
     * </p>
     * 
     * @param applyType
     *        The DB engine specific parameter type for the option group option.
     */

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    /**
     * <p>
     * The DB engine specific parameter type for the option group option.
     * </p>
     * 
     * @return The DB engine specific parameter type for the option group option.
     */

    public String getApplyType() {
        return this.applyType;
    }

    /**
     * <p>
     * The DB engine specific parameter type for the option group option.
     * </p>
     * 
     * @param applyType
     *        The DB engine specific parameter type for the option group option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withApplyType(String applyType) {
        setApplyType(applyType);
        return this;
    }

    /**
     * <p>
     * Indicates the acceptable values for the option group option.
     * </p>
     * 
     * @param allowedValues
     *        Indicates the acceptable values for the option group option.
     */

    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * Indicates the acceptable values for the option group option.
     * </p>
     * 
     * @return Indicates the acceptable values for the option group option.
     */

    public String getAllowedValues() {
        return this.allowedValues;
    }

    /**
     * <p>
     * Indicates the acceptable values for the option group option.
     * </p>
     * 
     * @param allowedValues
     *        Indicates the acceptable values for the option group option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withAllowedValues(String allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * Boolean value where true indicates that this option group option can be changed from the default value.
     * </p>
     * 
     * @param isModifiable
     *        Boolean value where true indicates that this option group option can be changed from the default value.
     */

    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }

    /**
     * <p>
     * Boolean value where true indicates that this option group option can be changed from the default value.
     * </p>
     * 
     * @return Boolean value where true indicates that this option group option can be changed from the default value.
     */

    public Boolean getIsModifiable() {
        return this.isModifiable;
    }

    /**
     * <p>
     * Boolean value where true indicates that this option group option can be changed from the default value.
     * </p>
     * 
     * @param isModifiable
     *        Boolean value where true indicates that this option group option can be changed from the default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupOptionSetting withIsModifiable(Boolean isModifiable) {
        setIsModifiable(isModifiable);
        return this;
    }

    /**
     * <p>
     * Boolean value where true indicates that this option group option can be changed from the default value.
     * </p>
     * 
     * @return Boolean value where true indicates that this option group option can be changed from the default value.
     */

    public Boolean isModifiable() {
        return this.isModifiable;
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
        if (getSettingName() != null)
            sb.append("SettingName: ").append(getSettingName()).append(",");
        if (getSettingDescription() != null)
            sb.append("SettingDescription: ").append(getSettingDescription()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getApplyType() != null)
            sb.append("ApplyType: ").append(getApplyType()).append(",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getIsModifiable() != null)
            sb.append("IsModifiable: ").append(getIsModifiable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionGroupOptionSetting == false)
            return false;
        OptionGroupOptionSetting other = (OptionGroupOptionSetting) obj;
        if (other.getSettingName() == null ^ this.getSettingName() == null)
            return false;
        if (other.getSettingName() != null && other.getSettingName().equals(this.getSettingName()) == false)
            return false;
        if (other.getSettingDescription() == null ^ this.getSettingDescription() == null)
            return false;
        if (other.getSettingDescription() != null && other.getSettingDescription().equals(this.getSettingDescription()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getApplyType() == null ^ this.getApplyType() == null)
            return false;
        if (other.getApplyType() != null && other.getApplyType().equals(this.getApplyType()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getIsModifiable() == null ^ this.getIsModifiable() == null)
            return false;
        if (other.getIsModifiable() != null && other.getIsModifiable().equals(this.getIsModifiable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSettingName() == null) ? 0 : getSettingName().hashCode());
        hashCode = prime * hashCode + ((getSettingDescription() == null) ? 0 : getSettingDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getApplyType() == null) ? 0 : getApplyType().hashCode());
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getIsModifiable() == null) ? 0 : getIsModifiable().hashCode());
        return hashCode;
    }

    @Override
    public OptionGroupOptionSetting clone() {
        try {
            return (OptionGroupOptionSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
