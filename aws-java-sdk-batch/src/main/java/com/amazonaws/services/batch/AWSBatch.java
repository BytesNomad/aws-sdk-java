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
package com.amazonaws.services.batch;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.batch.model.*;

/**
 * Interface for accessing AWS Batch.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.batch.AbstractAWSBatch} instead.
 * </p>
 * <p>
 * <p>
 * AWS Batch enables you to run batch computing workloads on the AWS Cloud. Batch computing is a common way for
 * developers, scientists, and engineers to access large amounts of compute resources, and AWS Batch removes the
 * undifferentiated heavy lifting of configuring and managing the required infrastructure. AWS Batch will be familiar to
 * users of traditional batch computing software. This service can efficiently provision resources in response to jobs
 * submitted in order to eliminate capacity constraints, reduce compute costs, and deliver results quickly.
 * </p>
 * <p>
 * As a fully managed service, AWS Batch enables developers, scientists, and engineers to run batch computing workloads
 * of any scale. AWS Batch automatically provisions compute resources and optimizes the workload distribution based on
 * the quantity and scale of the workloads. With AWS Batch, there is no need to install or manage batch computing
 * software, which allows you to focus on analyzing results and solving problems. AWS Batch reduces operational
 * complexities, saves time, and reduces costs, which makes it easy for developers, scientists, and engineers to run
 * their batch jobs in the AWS Cloud.
 * </p>
 */
public interface AWSBatch {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "batch";

    /**
     * Overrides the default endpoint for this client ("batch.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "batch.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "batch.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "batch.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "batch.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSBatch#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Cancels jobs in an AWS Batch job queue. Jobs that are in the <code>SUBMITTED</code>, <code>PENDING</code>, or
     * <code>RUNNABLE</code> state are cancelled. Jobs that have progressed to <code>STARTING</code> or
     * <code>RUNNING</code> are not cancelled (but the API operation still succeeds, even if no jobs are cancelled);
     * these jobs must be terminated with the <a>TerminateJob</a> operation.
     * </p>
     * 
     * @param cancelJobRequest
     * @return Result of the CancelJob operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.CancelJob
     */
    CancelJobResult cancelJob(CancelJobRequest cancelJobRequest);

    /**
     * <p>
     * Creates an AWS Batch compute environment. You can create <code>MANAGED</code> or <code>UNMANAGED</code>compute
     * environments.
     * </p>
     * <p>
     * In a managed compute environment, AWS Batch manages the compute resources within the environment, based on the
     * compute resources that you specify. Instances launched into a managed compute environment use the latest Amazon
     * ECS-optimized AMI. You can choose to use Amazon EC2 On-Demand instances in your managed compute environment, or
     * you can use Amazon EC2 Spot instances that only launch when the Spot bid price is below a specified percentage of
     * the On-Demand price.
     * </p>
     * <p>
     * In an unmanaged compute environment, you can manage your own compute resources. This provides more compute
     * resource configuration options, such as using a custom AMI, but you must ensure that your AMI meets the Amazon
     * ECS container instance AMI specification. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/container_instance_AMIs.html">Container Instance
     * AMIs</a> in the <i>Amazon EC2 Container Service Developer Guide</i>. After you have created your unmanaged
     * compute environment, you can use the <a>DescribeComputeEnvironments</a> operation to find the Amazon ECS cluster
     * that is associated with it and then manually launch your container instances into that Amazon ECS cluster. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_container_instance.html">Launching an
     * Amazon ECS Container Instance</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * 
     * @param createComputeEnvironmentRequest
     * @return Result of the CreateComputeEnvironment operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.CreateComputeEnvironment
     */
    CreateComputeEnvironmentResult createComputeEnvironment(CreateComputeEnvironmentRequest createComputeEnvironmentRequest);

    /**
     * <p>
     * Creates an AWS Batch job queue. When you create a job queue, you associate one or more compute environments to
     * the queue and assign an order of preference for the compute environments.
     * </p>
     * <p>
     * You also set a priority to the job queue that determines the order in which the AWS Batch scheduler places jobs
     * onto its associated compute environments. For example, if a compute environment is associated with more than one
     * job queue, the job queue with a higher priority is given preference for scheduling jobs to that compute
     * environment.
     * </p>
     * 
     * @param createJobQueueRequest
     * @return Result of the CreateJobQueue operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.CreateJobQueue
     */
    CreateJobQueueResult createJobQueue(CreateJobQueueRequest createJobQueueRequest);

    /**
     * <p>
     * Deletes an AWS Batch compute environment.
     * </p>
     * <p>
     * Before you can delete a compute environment, you must set its state to <code>DISABLED</code> with the
     * <a>UpdateComputeEnvironment</a> API operation and disassociate it from any job queues with the
     * <a>UpdateJobQueue</a> API operation.
     * </p>
     * 
     * @param deleteComputeEnvironmentRequest
     * @return Result of the DeleteComputeEnvironment operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DeleteComputeEnvironment
     */
    DeleteComputeEnvironmentResult deleteComputeEnvironment(DeleteComputeEnvironmentRequest deleteComputeEnvironmentRequest);

    /**
     * <p>
     * Deletes the specified job queue. You must first disable submissions for a queue with the <a>UpdateJobQueue</a>
     * operation and terminate any jobs that have not completed with the <a>TerminateJob</a>.
     * </p>
     * <p>
     * It is not necessary to disassociate compute environments from a queue before submitting a
     * <code>DeleteJobQueue</code> request.
     * </p>
     * 
     * @param deleteJobQueueRequest
     * @return Result of the DeleteJobQueue operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DeleteJobQueue
     */
    DeleteJobQueueResult deleteJobQueue(DeleteJobQueueRequest deleteJobQueueRequest);

    /**
     * <p>
     * Deregisters an AWS Batch job definition.
     * </p>
     * 
     * @param deregisterJobDefinitionRequest
     * @return Result of the DeregisterJobDefinition operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DeregisterJobDefinition
     */
    DeregisterJobDefinitionResult deregisterJobDefinition(DeregisterJobDefinitionRequest deregisterJobDefinitionRequest);

    /**
     * <p>
     * Describes one or more of your compute environments.
     * </p>
     * <p>
     * If you are using an unmanaged compute environment, you can use the <code>DescribeComputeEnvironment</code>
     * operation to determine the <code>ecsClusterArn</code> that you should launch your Amazon ECS container instances
     * into.
     * </p>
     * 
     * @param describeComputeEnvironmentsRequest
     * @return Result of the DescribeComputeEnvironments operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DescribeComputeEnvironments
     */
    DescribeComputeEnvironmentsResult describeComputeEnvironments(DescribeComputeEnvironmentsRequest describeComputeEnvironmentsRequest);

    /**
     * <p>
     * Describes a list of job definitions. You can specify a <code>status</code> (such as <code>ACTIVE</code>) to only
     * return job definitions that match that status.
     * </p>
     * 
     * @param describeJobDefinitionsRequest
     * @return Result of the DescribeJobDefinitions operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DescribeJobDefinitions
     */
    DescribeJobDefinitionsResult describeJobDefinitions(DescribeJobDefinitionsRequest describeJobDefinitionsRequest);

    /**
     * <p>
     * Describes one or more of your job queues.
     * </p>
     * 
     * @param describeJobQueuesRequest
     * @return Result of the DescribeJobQueues operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DescribeJobQueues
     */
    DescribeJobQueuesResult describeJobQueues(DescribeJobQueuesRequest describeJobQueuesRequest);

    /**
     * <p>
     * Describes a list of AWS Batch jobs.
     * </p>
     * 
     * @param describeJobsRequest
     * @return Result of the DescribeJobs operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DescribeJobs
     */
    DescribeJobsResult describeJobs(DescribeJobsRequest describeJobsRequest);

    /**
     * <p>
     * Returns a list of task jobs for a specified job queue. You can filter the results by job status with the
     * <code>jobStatus</code> parameter.
     * </p>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.ListJobs
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Registers an AWS Batch job definition.
     * </p>
     * 
     * @param registerJobDefinitionRequest
     * @return Result of the RegisterJobDefinition operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.RegisterJobDefinition
     */
    RegisterJobDefinitionResult registerJobDefinition(RegisterJobDefinitionRequest registerJobDefinitionRequest);

    /**
     * <p>
     * Submits an AWS Batch job from a job definition. Parameters specified during <a>SubmitJob</a> override parameters
     * defined in the job definition.
     * </p>
     * 
     * @param submitJobRequest
     * @return Result of the SubmitJob operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.SubmitJob
     */
    SubmitJobResult submitJob(SubmitJobRequest submitJobRequest);

    /**
     * <p>
     * Terminates jobs in a job queue. Jobs that are in the <code>STARTING</code> or <code>RUNNING</code> state are
     * terminated, which causes them to transition to <code>FAILED</code>. Jobs that have not progressed to the
     * <code>STARTING</code> state are cancelled.
     * </p>
     * 
     * @param terminateJobRequest
     * @return Result of the TerminateJob operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.TerminateJob
     */
    TerminateJobResult terminateJob(TerminateJobRequest terminateJobRequest);

    /**
     * <p>
     * Updates an AWS Batch compute environment.
     * </p>
     * 
     * @param updateComputeEnvironmentRequest
     * @return Result of the UpdateComputeEnvironment operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.UpdateComputeEnvironment
     */
    UpdateComputeEnvironmentResult updateComputeEnvironment(UpdateComputeEnvironmentRequest updateComputeEnvironmentRequest);

    /**
     * <p>
     * Updates a job queue.
     * </p>
     * 
     * @param updateJobQueueRequest
     * @return Result of the UpdateJobQueue operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.UpdateJobQueue
     */
    UpdateJobQueueResult updateJobQueue(UpdateJobQueueRequest updateJobQueueRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
