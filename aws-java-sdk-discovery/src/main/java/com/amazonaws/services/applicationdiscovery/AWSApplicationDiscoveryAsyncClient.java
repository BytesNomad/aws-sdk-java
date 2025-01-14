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
package com.amazonaws.services.applicationdiscovery;

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing AWS Application Discovery Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Application Discovery Service</fullname>
 * <p>
 * AWS Application Discovery Service helps you plan application migration projects by automatically identifying servers,
 * virtual machines (VMs), software, and software dependencies running in your on-premises data centers. Application
 * Discovery Service also collects application performance data, which can help you assess the outcome of your
 * migration. The data collected by Application Discovery Service is securely retained in an Amazon-hosted and managed
 * database in the cloud. You can export the data as a CSV or XML file into your preferred visualization tool or
 * cloud-migration solution to plan your migration. For more information, see the Application Discovery Service <a
 * href="http://aws.amazon.com/application-discovery/faqs/">FAQ</a>.
 * </p>
 * <p>
 * Application Discovery Service offers two modes of operation.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Agentless discovery</b> mode is recommended for environments that use VMware vCenter Server. This mode doesn't
 * require you to install an agent on each host. Agentless discovery gathers server information regardless of the
 * operating systems, which minimizes the time required for initial on-premises infrastructure assessment. Agentless
 * discovery doesn't collect information about software and software dependencies. It also doesn't work in non-VMware
 * environments. We recommend that you use agent-based discovery for non-VMware environments and if you want to collect
 * information about software and software dependencies. You can also run agent-based and agentless discovery
 * simultaneously. Use agentless discovery to quickly complete the initial infrastructure assessment and then install
 * agents on select hosts to gather information about software and software dependencies.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Agent-based discovery</b> mode collects a richer set of data than agentless discovery by using Amazon software,
 * the AWS Application Discovery Agent, which you install on one or more hosts in your data center. The agent captures
 * infrastructure and application information, including an inventory of installed software applications, system and
 * process performance, resource utilization, and network dependencies between workloads. The information collected by
 * agents is secured at rest and in transit to the Application Discovery Service database in the cloud.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Application Discovery Service integrates with application discovery solutions from AWS Partner Network (APN)
 * partners. Third-party application discovery tools can query the Application Discovery Service and write to the
 * Application Discovery Service database using a public API. You can then import the data into either a visualization
 * tool or cloud-migration solution.
 * </p>
 * <important>
 * <p>
 * Application Discovery Service doesn't gather sensitive information. All data is handled according to the <a
 * href="http://aws.amazon.com/privacy/">AWS Privacy Policy</a>. You can operate Application Discovery Service using
 * offline mode to inspect collected data before it is shared with the service.
 * </p>
 * </important>
 * <p>
 * Your AWS account must be granted access to Application Discovery Service, a process called <i>whitelisting</i>. This
 * is true for AWS partners and customers alike. To request access, sign up for the AWS Application Discovery Service <a
 * href="http://aws.amazon.com/application-discovery/preview/">here</a>. We will send you information about how to get
 * started.
 * </p>
 * <p>
 * This API reference provides descriptions, syntax, and usage examples for each of the actions and data types for the
 * Application Discovery Service. The topic for each action shows the API request parameters and the response.
 * Alternatively, you can use one of the AWS SDKs to access an API that is tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * <p>
 * This guide is intended for use with the <a href="http://docs.aws.amazon.com/application-discovery/latest/userguide/">
 * <i>AWS Application Discovery Service User Guide</i> </a>.
 * </p>
 */
@ThreadSafe
public class AWSApplicationDiscoveryAsyncClient extends AWSApplicationDiscoveryClient implements AWSApplicationDiscoveryAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service. A
     * credentials provider chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSApplicationDiscoveryAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service. A
     * credentials provider chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Application Discovery Service
     *        (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified AWS account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified AWS account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified AWS account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * provided AWS account credentials provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified AWS account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified AWS account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSApplicationDiscoveryAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration, java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Application Discovery Service using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSApplicationDiscoveryAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AssociateConfigurationItemsToApplicationResult> associateConfigurationItemsToApplicationAsync(
            AssociateConfigurationItemsToApplicationRequest request) {

        return associateConfigurationItemsToApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateConfigurationItemsToApplicationResult> associateConfigurationItemsToApplicationAsync(
            final AssociateConfigurationItemsToApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateConfigurationItemsToApplicationRequest, AssociateConfigurationItemsToApplicationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AssociateConfigurationItemsToApplicationResult>() {
            @Override
            public AssociateConfigurationItemsToApplicationResult call() throws Exception {
                AssociateConfigurationItemsToApplicationResult result;

                try {
                    result = associateConfigurationItemsToApplication(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
            @Override
            public CreateApplicationResult call() throws Exception {
                CreateApplicationResult result;

                try {
                    result = createApplication(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(final CreateTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateTagsResult>() {
            @Override
            public CreateTagsResult call() throws Exception {
                CreateTagsResult result;

                try {
                    result = createTags(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationsResult> deleteApplicationsAsync(DeleteApplicationsRequest request) {

        return deleteApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationsResult> deleteApplicationsAsync(final DeleteApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationsRequest, DeleteApplicationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationsResult>() {
            @Override
            public DeleteApplicationsResult call() throws Exception {
                DeleteApplicationsResult result;

                try {
                    result = deleteApplications(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagsResult>() {
            @Override
            public DeleteTagsResult call() throws Exception {
                DeleteTagsResult result;

                try {
                    result = deleteTags(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAgentsResult> describeAgentsAsync(DescribeAgentsRequest request) {

        return describeAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAgentsResult> describeAgentsAsync(final DescribeAgentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAgentsRequest, DescribeAgentsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAgentsResult>() {
            @Override
            public DescribeAgentsResult call() throws Exception {
                DescribeAgentsResult result;

                try {
                    result = describeAgents(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationsResult> describeConfigurationsAsync(DescribeConfigurationsRequest request) {

        return describeConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationsResult> describeConfigurationsAsync(final DescribeConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationsRequest, DescribeConfigurationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationsResult>() {
            @Override
            public DescribeConfigurationsResult call() throws Exception {
                DescribeConfigurationsResult result;

                try {
                    result = describeConfigurations(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeExportConfigurationsResult> describeExportConfigurationsAsync(DescribeExportConfigurationsRequest request) {

        return describeExportConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportConfigurationsResult> describeExportConfigurationsAsync(final DescribeExportConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExportConfigurationsRequest, DescribeExportConfigurationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeExportConfigurationsResult>() {
            @Override
            public DescribeExportConfigurationsResult call() throws Exception {
                DescribeExportConfigurationsResult result;

                try {
                    result = describeExportConfigurations(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(final DescribeTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeTagsResult>() {
            @Override
            public DescribeTagsResult call() throws Exception {
                DescribeTagsResult result;

                try {
                    result = describeTags(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateConfigurationItemsFromApplicationResult> disassociateConfigurationItemsFromApplicationAsync(
            DisassociateConfigurationItemsFromApplicationRequest request) {

        return disassociateConfigurationItemsFromApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateConfigurationItemsFromApplicationResult> disassociateConfigurationItemsFromApplicationAsync(
            final DisassociateConfigurationItemsFromApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateConfigurationItemsFromApplicationRequest, DisassociateConfigurationItemsFromApplicationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DisassociateConfigurationItemsFromApplicationResult>() {
            @Override
            public DisassociateConfigurationItemsFromApplicationResult call() throws Exception {
                DisassociateConfigurationItemsFromApplicationResult result;

                try {
                    result = disassociateConfigurationItemsFromApplication(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ExportConfigurationsResult> exportConfigurationsAsync(ExportConfigurationsRequest request) {

        return exportConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportConfigurationsResult> exportConfigurationsAsync(final ExportConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportConfigurationsRequest, ExportConfigurationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ExportConfigurationsResult>() {
            @Override
            public ExportConfigurationsResult call() throws Exception {
                ExportConfigurationsResult result;

                try {
                    result = exportConfigurations(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDiscoverySummaryResult> getDiscoverySummaryAsync(GetDiscoverySummaryRequest request) {

        return getDiscoverySummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDiscoverySummaryResult> getDiscoverySummaryAsync(final GetDiscoverySummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDiscoverySummaryRequest, GetDiscoverySummaryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetDiscoverySummaryResult>() {
            @Override
            public GetDiscoverySummaryResult call() throws Exception {
                GetDiscoverySummaryResult result;

                try {
                    result = getDiscoverySummary(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest request) {

        return listConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(final ListConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigurationsRequest, ListConfigurationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListConfigurationsResult>() {
            @Override
            public ListConfigurationsResult call() throws Exception {
                ListConfigurationsResult result;

                try {
                    result = listConfigurations(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListServerNeighborsResult> listServerNeighborsAsync(ListServerNeighborsRequest request) {

        return listServerNeighborsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServerNeighborsResult> listServerNeighborsAsync(final ListServerNeighborsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServerNeighborsRequest, ListServerNeighborsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListServerNeighborsResult>() {
            @Override
            public ListServerNeighborsResult call() throws Exception {
                ListServerNeighborsResult result;

                try {
                    result = listServerNeighbors(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartDataCollectionByAgentIdsResult> startDataCollectionByAgentIdsAsync(StartDataCollectionByAgentIdsRequest request) {

        return startDataCollectionByAgentIdsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDataCollectionByAgentIdsResult> startDataCollectionByAgentIdsAsync(
            final StartDataCollectionByAgentIdsRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDataCollectionByAgentIdsRequest, StartDataCollectionByAgentIdsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StartDataCollectionByAgentIdsResult>() {
            @Override
            public StartDataCollectionByAgentIdsResult call() throws Exception {
                StartDataCollectionByAgentIdsResult result;

                try {
                    result = startDataCollectionByAgentIds(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopDataCollectionByAgentIdsResult> stopDataCollectionByAgentIdsAsync(StopDataCollectionByAgentIdsRequest request) {

        return stopDataCollectionByAgentIdsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDataCollectionByAgentIdsResult> stopDataCollectionByAgentIdsAsync(final StopDataCollectionByAgentIdsRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopDataCollectionByAgentIdsRequest, StopDataCollectionByAgentIdsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StopDataCollectionByAgentIdsResult>() {
            @Override
            public StopDataCollectionByAgentIdsResult call() throws Exception {
                StopDataCollectionByAgentIdsResult result;

                try {
                    result = stopDataCollectionByAgentIds(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
            @Override
            public UpdateApplicationResult call() throws Exception {
                UpdateApplicationResult result;

                try {
                    result = updateApplication(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
