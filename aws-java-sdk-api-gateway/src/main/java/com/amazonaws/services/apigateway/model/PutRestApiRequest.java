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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A PUT request to update an existing API, with external API definitions specified as the request body.
 * </p>
 */
public class PutRestApiRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the <a>RestApi</a> to be updated.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The <code>mode</code> query parameter to specify the update mode. Valid values are "merge" and "overwrite". By
     * default, the update mode is "merge".
     * </p>
     */
    private String mode;
    /**
     * <p>
     * A query parameter to indicate whether to rollback the API update (<code>true</code>) or not (<code>false</code>)
     * when a warning is encountered. The default value is <code>false</code>.
     * </p>
     */
    private Boolean failOnWarnings;
    /**
     * <p>
     * Custom headers supplied as part of the request.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * The PUT request body containing external API definitions. Currently, only Swagger definition JSON files are
     * supported.
     * </p>
     */
    private java.nio.ByteBuffer body;

    /**
     * <p>
     * The identifier of the <a>RestApi</a> to be updated.
     * </p>
     * 
     * @param restApiId
     *        The identifier of the <a>RestApi</a> to be updated.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The identifier of the <a>RestApi</a> to be updated.
     * </p>
     * 
     * @return The identifier of the <a>RestApi</a> to be updated.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The identifier of the <a>RestApi</a> to be updated.
     * </p>
     * 
     * @param restApiId
     *        The identifier of the <a>RestApi</a> to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRestApiRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The <code>mode</code> query parameter to specify the update mode. Valid values are "merge" and "overwrite". By
     * default, the update mode is "merge".
     * </p>
     * 
     * @param mode
     *        The <code>mode</code> query parameter to specify the update mode. Valid values are "merge" and
     *        "overwrite". By default, the update mode is "merge".
     * @see PutMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The <code>mode</code> query parameter to specify the update mode. Valid values are "merge" and "overwrite". By
     * default, the update mode is "merge".
     * </p>
     * 
     * @return The <code>mode</code> query parameter to specify the update mode. Valid values are "merge" and
     *         "overwrite". By default, the update mode is "merge".
     * @see PutMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The <code>mode</code> query parameter to specify the update mode. Valid values are "merge" and "overwrite". By
     * default, the update mode is "merge".
     * </p>
     * 
     * @param mode
     *        The <code>mode</code> query parameter to specify the update mode. Valid values are "merge" and
     *        "overwrite". By default, the update mode is "merge".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PutMode
     */

    public PutRestApiRequest withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The <code>mode</code> query parameter to specify the update mode. Valid values are "merge" and "overwrite". By
     * default, the update mode is "merge".
     * </p>
     * 
     * @param mode
     *        The <code>mode</code> query parameter to specify the update mode. Valid values are "merge" and
     *        "overwrite". By default, the update mode is "merge".
     * @see PutMode
     */

    public void setMode(PutMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * The <code>mode</code> query parameter to specify the update mode. Valid values are "merge" and "overwrite". By
     * default, the update mode is "merge".
     * </p>
     * 
     * @param mode
     *        The <code>mode</code> query parameter to specify the update mode. Valid values are "merge" and
     *        "overwrite". By default, the update mode is "merge".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PutMode
     */

    public PutRestApiRequest withMode(PutMode mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback the API update (<code>true</code>) or not (<code>false</code>)
     * when a warning is encountered. The default value is <code>false</code>.
     * </p>
     * 
     * @param failOnWarnings
     *        A query parameter to indicate whether to rollback the API update (<code>true</code>) or not (
     *        <code>false</code>) when a warning is encountered. The default value is <code>false</code>.
     */

    public void setFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback the API update (<code>true</code>) or not (<code>false</code>)
     * when a warning is encountered. The default value is <code>false</code>.
     * </p>
     * 
     * @return A query parameter to indicate whether to rollback the API update (<code>true</code>) or not (
     *         <code>false</code>) when a warning is encountered. The default value is <code>false</code>.
     */

    public Boolean getFailOnWarnings() {
        return this.failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback the API update (<code>true</code>) or not (<code>false</code>)
     * when a warning is encountered. The default value is <code>false</code>.
     * </p>
     * 
     * @param failOnWarnings
     *        A query parameter to indicate whether to rollback the API update (<code>true</code>) or not (
     *        <code>false</code>) when a warning is encountered. The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRestApiRequest withFailOnWarnings(Boolean failOnWarnings) {
        setFailOnWarnings(failOnWarnings);
        return this;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback the API update (<code>true</code>) or not (<code>false</code>)
     * when a warning is encountered. The default value is <code>false</code>.
     * </p>
     * 
     * @return A query parameter to indicate whether to rollback the API update (<code>true</code>) or not (
     *         <code>false</code>) when a warning is encountered. The default value is <code>false</code>.
     */

    public Boolean isFailOnWarnings() {
        return this.failOnWarnings;
    }

    /**
     * <p>
     * Custom headers supplied as part of the request.
     * </p>
     * 
     * @return Custom headers supplied as part of the request.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Custom headers supplied as part of the request.
     * </p>
     * 
     * @param parameters
     *        Custom headers supplied as part of the request.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Custom headers supplied as part of the request.
     * </p>
     * 
     * @param parameters
     *        Custom headers supplied as part of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRestApiRequest withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public PutRestApiRequest addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRestApiRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The PUT request body containing external API definitions. Currently, only Swagger definition JSON files are
     * supported.
     * </p>
     * <p>
     * AWS SDK for Java performs a Base64 encoding on this field before sending this request to AWS service by default.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param body
     *        The PUT request body containing external API definitions. Currently, only Swagger definition JSON files
     *        are supported.
     */

    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * The PUT request body containing external API definitions. Currently, only Swagger definition JSON files are
     * supported.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The PUT request body containing external API definitions. Currently, only Swagger definition JSON files
     *         are supported.
     */

    public java.nio.ByteBuffer getBody() {
        return this.body;
    }

    /**
     * <p>
     * The PUT request body containing external API definitions. Currently, only Swagger definition JSON files are
     * supported.
     * </p>
     * 
     * @param body
     *        The PUT request body containing external API definitions. Currently, only Swagger definition JSON files
     *        are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRestApiRequest withBody(java.nio.ByteBuffer body) {
        setBody(body);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getFailOnWarnings() != null)
            sb.append("FailOnWarnings: ").append(getFailOnWarnings()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRestApiRequest == false)
            return false;
        PutRestApiRequest other = (PutRestApiRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getFailOnWarnings() == null ^ this.getFailOnWarnings() == null)
            return false;
        if (other.getFailOnWarnings() != null && other.getFailOnWarnings().equals(this.getFailOnWarnings()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getFailOnWarnings() == null) ? 0 : getFailOnWarnings().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        return hashCode;
    }

    @Override
    public PutRestApiRequest clone() {
        return (PutRestApiRequest) super.clone();
    }

}
