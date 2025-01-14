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

/**
 * Interface for accessing AWS Shield asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.shield.AbstractAWSShieldAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Shield Advanced</fullname>
 * <p>
 * This is the <i>AWS Shield Advanced API Reference</i>. This guide is for developers who need detailed information
 * about the AWS Shield Advanced API actions, data types, and errors. For detailed information about AWS WAF and AWS
 * Shield Advanced features and an overview of how to use the AWS WAF and AWS Shield Advanced APIs, see the <a
 * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and AWS Shield Developer Guide</a>.
 * </p>
 */
public interface AWSShieldAsync extends AWSShield {

    /**
     * <p>
     * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution,
     * Elastic Load Balancing load balancer, or an Amazon Route 53 hosted zone.
     * </p>
     * 
     * @param createProtectionRequest
     * @return A Java Future containing the result of the CreateProtection operation returned by the service.
     * @sample AWSShieldAsync.CreateProtection
     */
    java.util.concurrent.Future<CreateProtectionResult> createProtectionAsync(CreateProtectionRequest createProtectionRequest);

    /**
     * <p>
     * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution,
     * Elastic Load Balancing load balancer, or an Amazon Route 53 hosted zone.
     * </p>
     * 
     * @param createProtectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProtection operation returned by the service.
     * @sample AWSShieldAsyncHandler.CreateProtection
     */
    java.util.concurrent.Future<CreateProtectionResult> createProtectionAsync(CreateProtectionRequest createProtectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProtectionRequest, CreateProtectionResult> asyncHandler);

    /**
     * <p>
     * Activates AWS Shield Advanced for an account.
     * </p>
     * 
     * @param createSubscriptionRequest
     * @return A Java Future containing the result of the CreateSubscription operation returned by the service.
     * @sample AWSShieldAsync.CreateSubscription
     */
    java.util.concurrent.Future<CreateSubscriptionResult> createSubscriptionAsync(CreateSubscriptionRequest createSubscriptionRequest);

    /**
     * <p>
     * Activates AWS Shield Advanced for an account.
     * </p>
     * 
     * @param createSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubscription operation returned by the service.
     * @sample AWSShieldAsyncHandler.CreateSubscription
     */
    java.util.concurrent.Future<CreateSubscriptionResult> createSubscriptionAsync(CreateSubscriptionRequest createSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriptionRequest, CreateSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Deletes an AWS Shield Advanced <a>Protection</a>.
     * </p>
     * 
     * @param deleteProtectionRequest
     * @return A Java Future containing the result of the DeleteProtection operation returned by the service.
     * @sample AWSShieldAsync.DeleteProtection
     */
    java.util.concurrent.Future<DeleteProtectionResult> deleteProtectionAsync(DeleteProtectionRequest deleteProtectionRequest);

    /**
     * <p>
     * Deletes an AWS Shield Advanced <a>Protection</a>.
     * </p>
     * 
     * @param deleteProtectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProtection operation returned by the service.
     * @sample AWSShieldAsyncHandler.DeleteProtection
     */
    java.util.concurrent.Future<DeleteProtectionResult> deleteProtectionAsync(DeleteProtectionRequest deleteProtectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProtectionRequest, DeleteProtectionResult> asyncHandler);

    /**
     * <p>
     * Removes AWS Shield Advanced from an account.
     * </p>
     * 
     * @param deleteSubscriptionRequest
     * @return A Java Future containing the result of the DeleteSubscription operation returned by the service.
     * @sample AWSShieldAsync.DeleteSubscription
     */
    java.util.concurrent.Future<DeleteSubscriptionResult> deleteSubscriptionAsync(DeleteSubscriptionRequest deleteSubscriptionRequest);

    /**
     * <p>
     * Removes AWS Shield Advanced from an account.
     * </p>
     * 
     * @param deleteSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubscription operation returned by the service.
     * @sample AWSShieldAsyncHandler.DeleteSubscription
     */
    java.util.concurrent.Future<DeleteSubscriptionResult> deleteSubscriptionAsync(DeleteSubscriptionRequest deleteSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionRequest, DeleteSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Describes the details of a DDoS attack.
     * </p>
     * 
     * @param describeAttackRequest
     * @return A Java Future containing the result of the DescribeAttack operation returned by the service.
     * @sample AWSShieldAsync.DescribeAttack
     */
    java.util.concurrent.Future<DescribeAttackResult> describeAttackAsync(DescribeAttackRequest describeAttackRequest);

    /**
     * <p>
     * Describes the details of a DDoS attack.
     * </p>
     * 
     * @param describeAttackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAttack operation returned by the service.
     * @sample AWSShieldAsyncHandler.DescribeAttack
     */
    java.util.concurrent.Future<DescribeAttackResult> describeAttackAsync(DescribeAttackRequest describeAttackRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAttackRequest, DescribeAttackResult> asyncHandler);

    /**
     * <p>
     * Lists the details of a <a>Protection</a> object.
     * </p>
     * 
     * @param describeProtectionRequest
     * @return A Java Future containing the result of the DescribeProtection operation returned by the service.
     * @sample AWSShieldAsync.DescribeProtection
     */
    java.util.concurrent.Future<DescribeProtectionResult> describeProtectionAsync(DescribeProtectionRequest describeProtectionRequest);

    /**
     * <p>
     * Lists the details of a <a>Protection</a> object.
     * </p>
     * 
     * @param describeProtectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProtection operation returned by the service.
     * @sample AWSShieldAsyncHandler.DescribeProtection
     */
    java.util.concurrent.Future<DescribeProtectionResult> describeProtectionAsync(DescribeProtectionRequest describeProtectionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProtectionRequest, DescribeProtectionResult> asyncHandler);

    /**
     * <p>
     * Provides details about the AWS Shield Advanced subscription for an account.
     * </p>
     * 
     * @param describeSubscriptionRequest
     * @return A Java Future containing the result of the DescribeSubscription operation returned by the service.
     * @sample AWSShieldAsync.DescribeSubscription
     */
    java.util.concurrent.Future<DescribeSubscriptionResult> describeSubscriptionAsync(DescribeSubscriptionRequest describeSubscriptionRequest);

    /**
     * <p>
     * Provides details about the AWS Shield Advanced subscription for an account.
     * </p>
     * 
     * @param describeSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSubscription operation returned by the service.
     * @sample AWSShieldAsyncHandler.DescribeSubscription
     */
    java.util.concurrent.Future<DescribeSubscriptionResult> describeSubscriptionAsync(DescribeSubscriptionRequest describeSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSubscriptionRequest, DescribeSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
     * </p>
     * 
     * @param listAttacksRequest
     * @return A Java Future containing the result of the ListAttacks operation returned by the service.
     * @sample AWSShieldAsync.ListAttacks
     */
    java.util.concurrent.Future<ListAttacksResult> listAttacksAsync(ListAttacksRequest listAttacksRequest);

    /**
     * <p>
     * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
     * </p>
     * 
     * @param listAttacksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAttacks operation returned by the service.
     * @sample AWSShieldAsyncHandler.ListAttacks
     */
    java.util.concurrent.Future<ListAttacksResult> listAttacksAsync(ListAttacksRequest listAttacksRequest,
            com.amazonaws.handlers.AsyncHandler<ListAttacksRequest, ListAttacksResult> asyncHandler);

    /**
     * <p>
     * Lists all <a>Protection</a> objects for the account.
     * </p>
     * 
     * @param listProtectionsRequest
     * @return A Java Future containing the result of the ListProtections operation returned by the service.
     * @sample AWSShieldAsync.ListProtections
     */
    java.util.concurrent.Future<ListProtectionsResult> listProtectionsAsync(ListProtectionsRequest listProtectionsRequest);

    /**
     * <p>
     * Lists all <a>Protection</a> objects for the account.
     * </p>
     * 
     * @param listProtectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProtections operation returned by the service.
     * @sample AWSShieldAsyncHandler.ListProtections
     */
    java.util.concurrent.Future<ListProtectionsResult> listProtectionsAsync(ListProtectionsRequest listProtectionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProtectionsRequest, ListProtectionsResult> asyncHandler);

}
