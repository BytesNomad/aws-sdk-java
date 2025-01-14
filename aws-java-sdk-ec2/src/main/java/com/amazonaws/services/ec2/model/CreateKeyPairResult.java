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
import com.amazonaws.AmazonWebServiceResult;

/**
 * A simple result wrapper around the KeyPair object that was sent over the wire.
 */
public class CreateKeyPairResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes a key pair.
     * </p>
     */
    private KeyPair keyPair;

    /**
     * <p>
     * Describes a key pair.
     * </p>
     * 
     * @param keyPair
     *        Describes a key pair.
     */

    public void setKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
    }

    /**
     * <p>
     * Describes a key pair.
     * </p>
     * 
     * @return Describes a key pair.
     */

    public KeyPair getKeyPair() {
        return this.keyPair;
    }

    /**
     * <p>
     * Describes a key pair.
     * </p>
     * 
     * @param keyPair
     *        Describes a key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyPairResult withKeyPair(KeyPair keyPair) {
        setKeyPair(keyPair);
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
        if (getKeyPair() != null)
            sb.append("KeyPair: ").append(getKeyPair());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeyPairResult == false)
            return false;
        CreateKeyPairResult other = (CreateKeyPairResult) obj;
        if (other.getKeyPair() == null ^ this.getKeyPair() == null)
            return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeyPairResult clone() {
        try {
            return (CreateKeyPairResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
