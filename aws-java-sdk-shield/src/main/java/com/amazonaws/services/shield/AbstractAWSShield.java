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
package com.amazonaws.services.shield;

import com.amazonaws.services.shield.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSShield}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSShield implements AWSShield {

    protected AbstractAWSShield() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateProtectionResult createProtection(CreateProtectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSubscriptionResult createSubscription(CreateSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteProtectionResult deleteProtection(DeleteProtectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSubscriptionResult deleteSubscription(DeleteSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAttackResult describeAttack(DescribeAttackRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeProtectionResult describeProtection(DescribeProtectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSubscriptionResult describeSubscription(DescribeSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAttacksResult listAttacks(ListAttacksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListProtectionsResult listProtections(ListProtectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
