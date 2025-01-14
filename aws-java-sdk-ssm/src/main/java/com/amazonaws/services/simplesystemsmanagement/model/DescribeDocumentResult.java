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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeDocumentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the SSM document.
     * </p>
     */
    private DocumentDescription document;

    /**
     * <p>
     * Information about the SSM document.
     * </p>
     * 
     * @param document
     *        Information about the SSM document.
     */

    public void setDocument(DocumentDescription document) {
        this.document = document;
    }

    /**
     * <p>
     * Information about the SSM document.
     * </p>
     * 
     * @return Information about the SSM document.
     */

    public DocumentDescription getDocument() {
        return this.document;
    }

    /**
     * <p>
     * Information about the SSM document.
     * </p>
     * 
     * @param document
     *        Information about the SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDocumentResult withDocument(DocumentDescription document) {
        setDocument(document);
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
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDocumentResult == false)
            return false;
        DescribeDocumentResult other = (DescribeDocumentResult) obj;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDocumentResult clone() {
        try {
            return (DescribeDocumentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
