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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeAttackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) for the attack that to be described.
     * </p>
     */
    private String attackId;

    /**
     * <p>
     * The unique identifier (ID) for the attack that to be described.
     * </p>
     * 
     * @param attackId
     *        The unique identifier (ID) for the attack that to be described.
     */

    public void setAttackId(String attackId) {
        this.attackId = attackId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the attack that to be described.
     * </p>
     * 
     * @return The unique identifier (ID) for the attack that to be described.
     */

    public String getAttackId() {
        return this.attackId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the attack that to be described.
     * </p>
     * 
     * @param attackId
     *        The unique identifier (ID) for the attack that to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAttackRequest withAttackId(String attackId) {
        setAttackId(attackId);
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
        if (getAttackId() != null)
            sb.append("AttackId: ").append(getAttackId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAttackRequest == false)
            return false;
        DescribeAttackRequest other = (DescribeAttackRequest) obj;
        if (other.getAttackId() == null ^ this.getAttackId() == null)
            return false;
        if (other.getAttackId() != null && other.getAttackId().equals(this.getAttackId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttackId() == null) ? 0 : getAttackId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAttackRequest clone() {
        return (DescribeAttackRequest) super.clone();
    }

}
