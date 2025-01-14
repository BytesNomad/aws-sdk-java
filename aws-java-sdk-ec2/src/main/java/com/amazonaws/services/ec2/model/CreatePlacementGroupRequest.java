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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreatePlacementGroupRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreatePlacementGroup.
 * </p>
 */
public class CreatePlacementGroupRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreatePlacementGroupRequest> {

    /**
     * <p>
     * A name for the placement group.
     * </p>
     * <p>
     * Constraints: Up to 255 ASCII characters
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The placement strategy.
     * </p>
     */
    private String strategy;

    /**
     * Default constructor for CreatePlacementGroupRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreatePlacementGroupRequest() {
    }

    /**
     * Constructs a new CreatePlacementGroupRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param groupName
     *        A name for the placement group.</p>
     *        <p>
     *        Constraints: Up to 255 ASCII characters
     * @param strategy
     *        The placement strategy.
     */
    public CreatePlacementGroupRequest(String groupName, String strategy) {
        setGroupName(groupName);
        setStrategy(strategy);
    }

    /**
     * Constructs a new CreatePlacementGroupRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param groupName
     *        A name for the placement group.</p>
     *        <p>
     *        Constraints: Up to 255 ASCII characters
     * @param strategy
     *        The placement strategy.
     */
    public CreatePlacementGroupRequest(String groupName, PlacementStrategy strategy) {
        setGroupName(groupName);
        setStrategy(strategy.toString());
    }

    /**
     * <p>
     * A name for the placement group.
     * </p>
     * <p>
     * Constraints: Up to 255 ASCII characters
     * </p>
     * 
     * @param groupName
     *        A name for the placement group.</p>
     *        <p>
     *        Constraints: Up to 255 ASCII characters
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * A name for the placement group.
     * </p>
     * <p>
     * Constraints: Up to 255 ASCII characters
     * </p>
     * 
     * @return A name for the placement group.</p>
     *         <p>
     *         Constraints: Up to 255 ASCII characters
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * A name for the placement group.
     * </p>
     * <p>
     * Constraints: Up to 255 ASCII characters
     * </p>
     * 
     * @param groupName
     *        A name for the placement group.</p>
     *        <p>
     *        Constraints: Up to 255 ASCII characters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlacementGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * 
     * @param strategy
     *        The placement strategy.
     * @see PlacementStrategy
     */

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * 
     * @return The placement strategy.
     * @see PlacementStrategy
     */

    public String getStrategy() {
        return this.strategy;
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * 
     * @param strategy
     *        The placement strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementStrategy
     */

    public CreatePlacementGroupRequest withStrategy(String strategy) {
        setStrategy(strategy);
        return this;
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * 
     * @param strategy
     *        The placement strategy.
     * @see PlacementStrategy
     */

    public void setStrategy(PlacementStrategy strategy) {
        this.strategy = strategy.toString();
    }

    /**
     * <p>
     * The placement strategy.
     * </p>
     * 
     * @param strategy
     *        The placement strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementStrategy
     */

    public CreatePlacementGroupRequest withStrategy(PlacementStrategy strategy) {
        setStrategy(strategy);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreatePlacementGroupRequest> getDryRunRequest() {
        Request<CreatePlacementGroupRequest> request = new CreatePlacementGroupRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getStrategy() != null)
            sb.append("Strategy: ").append(getStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePlacementGroupRequest == false)
            return false;
        CreatePlacementGroupRequest other = (CreatePlacementGroupRequest) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getStrategy() == null ^ this.getStrategy() == null)
            return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
        return hashCode;
    }

    @Override
    public CreatePlacementGroupRequest clone() {
        return (CreatePlacementGroupRequest) super.clone();
    }
}
