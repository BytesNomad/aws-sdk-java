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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a recurring charge.
 * </p>
 */
public class RecurringCharge implements Serializable, Cloneable {

    /**
     * <p>
     * The frequency of the recurring charge.
     * </p>
     */
    private String frequency;
    /**
     * <p>
     * The amount of the recurring charge.
     * </p>
     */
    private Double amount;

    /**
     * <p>
     * The frequency of the recurring charge.
     * </p>
     * 
     * @param frequency
     *        The frequency of the recurring charge.
     * @see RecurringChargeFrequency
     */

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * The frequency of the recurring charge.
     * </p>
     * 
     * @return The frequency of the recurring charge.
     * @see RecurringChargeFrequency
     */

    public String getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * The frequency of the recurring charge.
     * </p>
     * 
     * @param frequency
     *        The frequency of the recurring charge.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecurringChargeFrequency
     */

    public RecurringCharge withFrequency(String frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * The frequency of the recurring charge.
     * </p>
     * 
     * @param frequency
     *        The frequency of the recurring charge.
     * @see RecurringChargeFrequency
     */

    public void setFrequency(RecurringChargeFrequency frequency) {
        this.frequency = frequency.toString();
    }

    /**
     * <p>
     * The frequency of the recurring charge.
     * </p>
     * 
     * @param frequency
     *        The frequency of the recurring charge.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecurringChargeFrequency
     */

    public RecurringCharge withFrequency(RecurringChargeFrequency frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * The amount of the recurring charge.
     * </p>
     * 
     * @param amount
     *        The amount of the recurring charge.
     */

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The amount of the recurring charge.
     * </p>
     * 
     * @return The amount of the recurring charge.
     */

    public Double getAmount() {
        return this.amount;
    }

    /**
     * <p>
     * The amount of the recurring charge.
     * </p>
     * 
     * @param amount
     *        The amount of the recurring charge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurringCharge withAmount(Double amount) {
        setAmount(amount);
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
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency()).append(",");
        if (getAmount() != null)
            sb.append("Amount: ").append(getAmount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecurringCharge == false)
            return false;
        RecurringCharge other = (RecurringCharge) obj;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getAmount() == null ^ this.getAmount() == null)
            return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getAmount() == null) ? 0 : getAmount().hashCode());
        return hashCode;
    }

    @Override
    public RecurringCharge clone() {
        try {
            return (RecurringCharge) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
