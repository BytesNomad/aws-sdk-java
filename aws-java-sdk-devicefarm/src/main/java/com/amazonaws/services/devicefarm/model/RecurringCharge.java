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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies whether charges for devices will be recurring.
 * </p>
 */
public class RecurringCharge implements Serializable, Cloneable {

    /**
     * <p>
     * The cost of the recurring charge.
     * </p>
     */
    private MonetaryAmount cost;
    /**
     * <p>
     * The frequency in which charges will recur.
     * </p>
     */
    private String frequency;

    /**
     * <p>
     * The cost of the recurring charge.
     * </p>
     * 
     * @param cost
     *        The cost of the recurring charge.
     */

    public void setCost(MonetaryAmount cost) {
        this.cost = cost;
    }

    /**
     * <p>
     * The cost of the recurring charge.
     * </p>
     * 
     * @return The cost of the recurring charge.
     */

    public MonetaryAmount getCost() {
        return this.cost;
    }

    /**
     * <p>
     * The cost of the recurring charge.
     * </p>
     * 
     * @param cost
     *        The cost of the recurring charge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecurringCharge withCost(MonetaryAmount cost) {
        setCost(cost);
        return this;
    }

    /**
     * <p>
     * The frequency in which charges will recur.
     * </p>
     * 
     * @param frequency
     *        The frequency in which charges will recur.
     * @see RecurringChargeFrequency
     */

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * The frequency in which charges will recur.
     * </p>
     * 
     * @return The frequency in which charges will recur.
     * @see RecurringChargeFrequency
     */

    public String getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * The frequency in which charges will recur.
     * </p>
     * 
     * @param frequency
     *        The frequency in which charges will recur.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecurringChargeFrequency
     */

    public RecurringCharge withFrequency(String frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * The frequency in which charges will recur.
     * </p>
     * 
     * @param frequency
     *        The frequency in which charges will recur.
     * @see RecurringChargeFrequency
     */

    public void setFrequency(RecurringChargeFrequency frequency) {
        this.frequency = frequency.toString();
    }

    /**
     * <p>
     * The frequency in which charges will recur.
     * </p>
     * 
     * @param frequency
     *        The frequency in which charges will recur.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecurringChargeFrequency
     */

    public RecurringCharge withFrequency(RecurringChargeFrequency frequency) {
        setFrequency(frequency);
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
        if (getCost() != null)
            sb.append("Cost: ").append(getCost()).append(",");
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency());
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
        if (other.getCost() == null ^ this.getCost() == null)
            return false;
        if (other.getCost() != null && other.getCost().equals(this.getCost()) == false)
            return false;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCost() == null) ? 0 : getCost().hashCode());
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
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
