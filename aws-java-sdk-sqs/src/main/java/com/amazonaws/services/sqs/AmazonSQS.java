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
package com.amazonaws.services.sqs;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.sqs.model.*;

/**
 * Interface for accessing Amazon SQS.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sqs.AbstractAmazonSQS} instead.
 * </p>
 * <p>
 * <p>
 * Welcome to the <i>Amazon Simple Queue Service API Reference</i>.
 * </p>
 * <p>
 * Amazon Simple Queue Service (Amazon SQS) is a reliable, highly-scalable hosted queue for storing messages as they
 * travel between applications or microservices. Amazon SQS moves data between distributed application components and
 * helps you decouple these components.
 * </p>
 * <note>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/standard-queues.html">Standard
 * queues</a> are available in all regions. <a
 * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO queues</a> are
 * available in US West (Oregon) and US East (Ohio).
 * </p>
 * </note>
 * <p>
 * You can use <a href="http://aws.amazon.com/tools/#sdk">AWS SDKs</a> to access Amazon SQS using your favorite
 * programming language. The SDKs perform tasks such as the following automatically:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Cryptographically sign your service requests
 * </p>
 * </li>
 * <li>
 * <p>
 * Retry requests
 * </p>
 * </li>
 * <li>
 * <p>
 * Handle error responses
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Additional Information</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/sqs/">Amazon SQS Product Page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Amazon SQS Developer Guide</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/MakingRequestsArticle.html">Making
 * API Requests</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Using
 * Amazon SQS Message Attributes</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">Using
 * Amazon SQS Dead Letter Queues</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <i>Amazon Web Services General Reference</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sqs_region">Regions and Endpoints</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 */
public interface AmazonSQS {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "sqs";

    /**
     * Overrides the default endpoint for this client ("https://sqs.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "sqs.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://sqs.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "sqs.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://sqs.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonSQS#setEndpoint(String)}, sets the regional endpoint for this client's service
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
     * Adds a permission to a queue for a specific <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a>. This allows sharing access to
     * the queue.
     * </p>
     * <p>
     * When you create a queue, you have full control access rights for the queue. Only you, the owner of the queue, can
     * grant or deny permissions to the queue. For more information about these permissions, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html">Shared
     * Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <code>AddPermission</code> writes an Amazon-SQS-generated policy. If you want to write your own policy, use
     * <code> <a>SetQueueAttributes</a> </code> to upload your policy. For more information about writing your own
     * policy, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AccessPolicyLanguage.html">Using
     * The Access Policy Language</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * Some actions take lists of parameters. These lists are specified using the <code>param.n</code> notation. Values
     * of <code>n</code> are integers starting from 1. For example, a parameter list with two elements looks like this:
     * </p>
     * <p>
     * <code>&amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;Attribute.2=that</code>
     * </p>
     * </note>
     * 
     * @param addPermissionRequest
     * @return Result of the AddPermission operation returned by the service.
     * @throws OverLimitException
     *         The action that you requested would violate a limit. For example, <code>ReceiveMessage</code> returns
     *         this error if the maximum number of inflight messages is reached. <code> <a>AddPermission</a> </code>
     *         returns this error if the maximum number of permissions for the queue is reached.
     * @sample AmazonSQS.AddPermission
     */
    AddPermissionResult addPermission(AddPermissionRequest addPermissionRequest);

    /**
     * Simplified method form for invoking the AddPermission operation.
     *
     * @see #addPermission(AddPermissionRequest)
     */
    AddPermissionResult addPermission(String queueUrl, String label, java.util.List<String> aWSAccountIds, java.util.List<String> actions);

    /**
     * <p>
     * Changes the visibility timeout of a specified message in a queue to a new value. The maximum allowed timeout
     * value is 12 hours. Thus, you can't extend the timeout of a message in an existing queue to more than a total
     * visibility timeout of 12 hours. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * For example, you have a message and with the default visibility timeout of 5 minutes. After 3 minutes, you call
     * <code>ChangeMessageVisiblity</code> with a timeout of 10 minutes. At that time, the timeout for the message is
     * extended by 10 minutes beyond the time of the <code>ChangeMessageVisibility</code> action. This results in a
     * total visibility timeout of 13 minutes. You can continue to call the <code>ChangeMessageVisibility</code> to
     * extend the visibility timeout to a maximum of 12 hours. If you try to extend the visibility timeout beyond 12
     * hours, your request is rejected.
     * </p>
     * <p>
     * A message is considered to be <i>in flight</i> after it's received from a queue by a consumer, but not yet
     * deleted from the queue.
     * </p>
     * <p>
     * For standard queues, there can be a maximum of 120,000 inflight messages per queue. If you reach this limit,
     * Amazon SQS returns the <code>OverLimit</code> error message. To avoid reaching the limit, you should delete
     * messages from the queue after they're processed. You can also increase the number of queues you use to process
     * your messages.
     * </p>
     * <p>
     * For FIFO queues, there can be a maximum of 20,000 inflight messages per queue. If you reach this limit, Amazon
     * SQS returns no error messages.
     * </p>
     * <important>
     * <p>
     * If you attempt to set the <code>VisibilityTimeout</code> to a value greater than the maximum time left, Amazon
     * SQS returns an error. Amazon SQS doesn't automatically recalculate and increase the timeout to the maximum
     * remaining time.
     * </p>
     * <p>
     * Unlike with a queue, when you change the visibility timeout for a specific message the timeout value is applied
     * immediately but isn't saved in memory for that message. If you don't delete a message after it is received, the
     * visibility timeout for the message reverts to the original timeout value (not to the value you set using the
     * <code>ChangeMessageVisibility</code> action) the next time the message is received.
     * </p>
     * </important>
     * 
     * @param changeMessageVisibilityRequest
     * @return Result of the ChangeMessageVisibility operation returned by the service.
     * @throws MessageNotInflightException
     *         The message referred to isn't in flight.
     * @throws ReceiptHandleIsInvalidException
     *         The receipt handle provided isn't valid.
     * @sample AmazonSQS.ChangeMessageVisibility
     */
    ChangeMessageVisibilityResult changeMessageVisibility(ChangeMessageVisibilityRequest changeMessageVisibilityRequest);

    /**
     * Simplified method form for invoking the ChangeMessageVisibility operation.
     *
     * @see #changeMessageVisibility(ChangeMessageVisibilityRequest)
     */
    ChangeMessageVisibilityResult changeMessageVisibility(String queueUrl, String receiptHandle, Integer visibilityTimeout);

    /**
     * <p>
     * Changes the visibility timeout of multiple messages. This is a batch version of
     * <code> <a>ChangeMessageVisibility</a> </code>. The result of the action on each message is reported individually
     * in the response. You can send up to 10 <code> <a>ChangeMessageVisibility</a> </code> requests with each
     * <code>ChangeMessageVisibilityBatch</code> action.
     * </p>
     * <important>
     * <p>
     * Because the batch request can result in a combination of successful and unsuccessful actions, you should check
     * for batch errors even when the call returns an HTTP status code of <code>200</code>.
     * </p>
     * </important> <note>
     * <p>
     * Some actions take lists of parameters. These lists are specified using the <code>param.n</code> notation. Values
     * of <code>n</code> are integers starting from 1. For example, a parameter list with two elements looks like this:
     * </p>
     * <p>
     * <code>&amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;Attribute.2=that</code>
     * </p>
     * </note>
     * 
     * @param changeMessageVisibilityBatchRequest
     * @return Result of the ChangeMessageVisibilityBatch operation returned by the service.
     * @throws TooManyEntriesInBatchRequestException
     *         The batch request contains more entries than permissible.
     * @throws EmptyBatchRequestException
     *         The batch request doesn't contain any entries.
     * @throws BatchEntryIdsNotDistinctException
     *         Two or more batch entries in the request have the same <code>Id</code>.
     * @throws InvalidBatchEntryIdException
     *         The <code>Id</code> of a batch entry in a batch request doesn't abide by the specification.
     * @sample AmazonSQS.ChangeMessageVisibilityBatch
     */
    ChangeMessageVisibilityBatchResult changeMessageVisibilityBatch(ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest);

    /**
     * Simplified method form for invoking the ChangeMessageVisibilityBatch operation.
     *
     * @see #changeMessageVisibilityBatch(ChangeMessageVisibilityBatchRequest)
     */
    ChangeMessageVisibilityBatchResult changeMessageVisibilityBatch(String queueUrl, java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries);

    /**
     * <p>
     * Creates a new standard or FIFO queue or returns the URL of an existing queue. You can pass one or more attributes
     * in the request. Keep the following caveats in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't specify the <code>FifoQueue</code> attribute, Amazon SQS creates a standard queue.
     * </p>
     * <note>
     * <p>
     * You can't change the queue type after you create it and you can't convert an existing standard queue into a FIFO
     * queue. You must either create a new FIFO queue for your application or delete your existing standard queue and
     * recreate it as a FIFO queue. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-moving">
     * Moving From a Standard Queue to a FIFO Queue</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * If you don't provide a value for an attribute, the queue is created with the default value for the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To successfully create a new queue, you must provide a queue name that adheres to the <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/limits-queues.html">limits
     * related to queues</a> and is unique within the scope of your queues.
     * </p>
     * <p>
     * To get the queue URL, use the <code> <a>GetQueueUrl</a> </code> action. <code> <a>GetQueueUrl</a> </code>
     * requires only the <code>QueueName</code> parameter. be aware of existing queue names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you provide the name of an existing queue along with the exact names and values of all the queue's attributes,
     * <code>CreateQueue</code> returns the queue URL for the existing queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the queue name, attribute names, or attribute values don't match an existing queue, <code>CreateQueue</code>
     * returns an error.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Some actions take lists of parameters. These lists are specified using the <code>param.n</code> notation. Values
     * of <code>n</code> are integers starting from 1. For example, a parameter list with two elements looks like this:
     * </p>
     * <p>
     * <code>&amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;Attribute.2=that</code>
     * </p>
     * </note>
     * 
     * @param createQueueRequest
     * @return Result of the CreateQueue operation returned by the service.
     * @throws QueueDeletedRecentlyException
     *         You must wait 60 seconds after deleting a queue before you can create another one with the same name.
     * @throws QueueNameExistsException
     *         A queue already exists with this name. Amazon SQS returns this error only if the request includes
     *         attributes whose values differ from those of the existing queue.
     * @sample AmazonSQS.CreateQueue
     */
    CreateQueueResult createQueue(CreateQueueRequest createQueueRequest);

    /**
     * Simplified method form for invoking the CreateQueue operation.
     *
     * @see #createQueue(CreateQueueRequest)
     */
    CreateQueueResult createQueue(String queueName);

    /**
     * <p>
     * Deletes the specified message from the specified queue. You specify the message by using the message's <i>receipt
     * handle</i> and not the <i>MessageId</i> you receive when you send the message. Even if the message is locked by
     * another reader due to the visibility timeout setting, it is still deleted from the queue. If you leave a message
     * in the queue for longer than the queue's configured retention period, Amazon SQS automatically deletes the
     * message.
     * </p>
     * <note>
     * <p>
     * The receipt handle is associated with a specific instance of receiving the message. If you receive a message more
     * than once, the receipt handle you get each time you receive the message is different. If you don't provide the
     * most recently received receipt handle for the message when you use the <code>DeleteMessage</code> action, the
     * request succeeds, but the message might not be deleted.
     * </p>
     * <p>
     * For standard queues, it is possible to receive a message even after you deleting it. This might happen on rare
     * occasions if one of the servers storing a copy of the message is unavailable when you send the request to delete
     * the message. The copy remains on the server and might be returned to you on a subsequent receive request. You
     * should ensure that your application is idempotent, so that receiving a message more than once does not cause
     * issues.
     * </p>
     * </note>
     * 
     * @param deleteMessageRequest
     * @return Result of the DeleteMessage operation returned by the service.
     * @throws InvalidIdFormatException
     *         The receipt handle isn't valid for the current version.
     * @throws ReceiptHandleIsInvalidException
     *         The receipt handle provided isn't valid.
     * @sample AmazonSQS.DeleteMessage
     */
    DeleteMessageResult deleteMessage(DeleteMessageRequest deleteMessageRequest);

    /**
     * Simplified method form for invoking the DeleteMessage operation.
     *
     * @see #deleteMessage(DeleteMessageRequest)
     */
    DeleteMessageResult deleteMessage(String queueUrl, String receiptHandle);

    /**
     * <p>
     * Deletes up to ten messages from the specified queue. This is a batch version of
     * <code> <a>DeleteMessage</a> </code>. The result of the action on each message is reported individually in the
     * response.
     * </p>
     * <important>
     * <p>
     * Because the batch request can result in a combination of successful and unsuccessful actions, you should check
     * for batch errors even when the call returns an HTTP status code of <code>200</code>.
     * </p>
     * </important> <note>
     * <p>
     * Some actions take lists of parameters. These lists are specified using the <code>param.n</code> notation. Values
     * of <code>n</code> are integers starting from 1. For example, a parameter list with two elements looks like this:
     * </p>
     * <p>
     * <code>&amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;Attribute.2=that</code>
     * </p>
     * </note>
     * 
     * @param deleteMessageBatchRequest
     * @return Result of the DeleteMessageBatch operation returned by the service.
     * @throws TooManyEntriesInBatchRequestException
     *         The batch request contains more entries than permissible.
     * @throws EmptyBatchRequestException
     *         The batch request doesn't contain any entries.
     * @throws BatchEntryIdsNotDistinctException
     *         Two or more batch entries in the request have the same <code>Id</code>.
     * @throws InvalidBatchEntryIdException
     *         The <code>Id</code> of a batch entry in a batch request doesn't abide by the specification.
     * @sample AmazonSQS.DeleteMessageBatch
     */
    DeleteMessageBatchResult deleteMessageBatch(DeleteMessageBatchRequest deleteMessageBatchRequest);

    /**
     * Simplified method form for invoking the DeleteMessageBatch operation.
     *
     * @see #deleteMessageBatch(DeleteMessageBatchRequest)
     */
    DeleteMessageBatchResult deleteMessageBatch(String queueUrl, java.util.List<DeleteMessageBatchRequestEntry> entries);

    /**
     * <p>
     * Deletes the queue specified by the <code>QueueUrl</code>, even if the queue is empty. If the specified queue
     * doesn't exist, Amazon SQS returns a successful response.
     * </p>
     * <important>
     * <p>
     * Be careful with the <code>DeleteQueue</code> action: When you delete a queue, any messages in the queue are no
     * longer available.
     * </p>
     * </important>
     * <p>
     * When you delete a queue, the deletion process takes up to 60 seconds. Requests you send involving that queue
     * during the 60 seconds might succeed. For example, a <code> <a>SendMessage</a> </code> request might succeed, but
     * after 60 seconds the queue and the message you sent no longer exist.
     * </p>
     * <p>
     * When you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.
     * </p>
     * 
     * @param deleteQueueRequest
     * @return Result of the DeleteQueue operation returned by the service.
     * @sample AmazonSQS.DeleteQueue
     */
    DeleteQueueResult deleteQueue(DeleteQueueRequest deleteQueueRequest);

    /**
     * Simplified method form for invoking the DeleteQueue operation.
     *
     * @see #deleteQueue(DeleteQueueRequest)
     */
    DeleteQueueResult deleteQueue(String queueUrl);

    /**
     * <p>
     * Gets attributes for the specified queue.
     * </p>
     * <note>
     * <p>
     * Some actions take lists of parameters. These lists are specified using the <code>param.n</code> notation. Values
     * of <code>n</code> are integers starting from 1. For example, a parameter list with two elements looks like this:
     * </p>
     * <p>
     * <code>&amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;Attribute.2=that</code>
     * </p>
     * </note>
     * 
     * @param getQueueAttributesRequest
     * @return Result of the GetQueueAttributes operation returned by the service.
     * @throws InvalidAttributeNameException
     *         The attribute referred to doesn't exist.
     * @sample AmazonSQS.GetQueueAttributes
     */
    GetQueueAttributesResult getQueueAttributes(GetQueueAttributesRequest getQueueAttributesRequest);

    /**
     * Simplified method form for invoking the GetQueueAttributes operation.
     *
     * @see #getQueueAttributes(GetQueueAttributesRequest)
     */
    GetQueueAttributesResult getQueueAttributes(String queueUrl, java.util.List<String> attributeNames);

    /**
     * <p>
     * Returns the URL of an existing queue. This action provides a simple way to retrieve the URL of an Amazon SQS
     * queue.
     * </p>
     * <p>
     * To access a queue that belongs to another AWS account, use the <code>QueueOwnerAWSAccountId</code> parameter to
     * specify the account ID of the queue's owner. The queue's owner must grant you permission to access the queue. For
     * more information about shared queue access, see <code> <a>AddPermission</a> </code> or see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html">Shared
     * Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param getQueueUrlRequest
     * @return Result of the GetQueueUrl operation returned by the service.
     * @throws QueueDoesNotExistException
     *         The queue referred to doesn't exist.
     * @sample AmazonSQS.GetQueueUrl
     */
    GetQueueUrlResult getQueueUrl(GetQueueUrlRequest getQueueUrlRequest);

    /**
     * Simplified method form for invoking the GetQueueUrl operation.
     *
     * @see #getQueueUrl(GetQueueUrlRequest)
     */
    GetQueueUrlResult getQueueUrl(String queueName);

    /**
     * <p>
     * Returns a list of your queues that have the <code>RedrivePolicy</code> queue attribute configured with a dead
     * letter queue.
     * </p>
     * <p>
     * For more information about using dead letter queues, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param listDeadLetterSourceQueuesRequest
     * @return Result of the ListDeadLetterSourceQueues operation returned by the service.
     * @throws QueueDoesNotExistException
     *         The queue referred to doesn't exist.
     * @sample AmazonSQS.ListDeadLetterSourceQueues
     */
    ListDeadLetterSourceQueuesResult listDeadLetterSourceQueues(ListDeadLetterSourceQueuesRequest listDeadLetterSourceQueuesRequest);

    /**
     * <p>
     * Returns a list of your queues. The maximum number of queues that can be returned is 1,000. If you specify a value
     * for the optional <code>QueueNamePrefix</code> parameter, only queues with a name that begins with the specified
     * value are returned.
     * </p>
     * 
     * @param listQueuesRequest
     * @return Result of the ListQueues operation returned by the service.
     * @sample AmazonSQS.ListQueues
     */
    ListQueuesResult listQueues(ListQueuesRequest listQueuesRequest);

    /**
     * Simplified method form for invoking the ListQueues operation.
     *
     * @see #listQueues(ListQueuesRequest)
     */
    ListQueuesResult listQueues();

    /**
     * Simplified method form for invoking the ListQueues operation.
     *
     * @see #listQueues(ListQueuesRequest)
     */
    ListQueuesResult listQueues(String queueNamePrefix);

    /**
     * <p>
     * Deletes the messages in a queue specified by the <code>QueueURL</code> parameter.
     * </p>
     * <important>
     * <p>
     * When you use the <code>PurgeQueue</code> action, you can't retrieve a message deleted from a queue.
     * </p>
     * </important>
     * <p>
     * When you purge a queue, the message deletion process takes up to 60 seconds. All messages sent to the queue
     * before calling the <code>PurgeQueue</code> action are deleted. Messages sent to the queue while it is being
     * purged might be deleted. While the queue is being purged, messages sent to the queue before
     * <code>PurgeQueue</code> is called might be received, but are deleted within the next minute.
     * </p>
     * 
     * @param purgeQueueRequest
     * @return Result of the PurgeQueue operation returned by the service.
     * @throws QueueDoesNotExistException
     *         The queue referred to doesn't exist.
     * @throws PurgeQueueInProgressException
     *         Indicates that the specified queue previously received a <code>PurgeQueue</code> request within the last
     *         60 seconds (the time it can take to delete the messages in the queue).
     * @sample AmazonSQS.PurgeQueue
     */
    PurgeQueueResult purgeQueue(PurgeQueueRequest purgeQueueRequest);

    /**
     * <p>
     * Retrieves one or more messages (up to 10), from the specified queue. Using the <code>WaitTimeSeconds</code>
     * parameter enables long-poll support. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html">Amazon SQS
     * Long Polling</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * Short poll is the default behavior where a weighted random set of machines is sampled on a
     * <code>ReceiveMessage</code> call. Thus, only the messages on the sampled machines are returned. If the number of
     * messages in the queue is small (fewer than 1,000), you most likely get fewer messages than you requested per
     * <code>ReceiveMessage</code> call. If the number of messages in the queue is extremely small, you might not
     * receive any messages in a particular <code>ReceiveMessage</code> response. If this happens, repeat the request.
     * </p>
     * <p>
     * For each message returned, the response includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message body.
     * </p>
     * </li>
     * <li>
     * <p>
     * An MD5 digest of the message body. For information on MD5, see <a
     * href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>MessageId</code> you received when you sent the message to the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * The receipt handle.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * An MD5 digest of the message attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The receipt handle is the identifier you must provide when deleting the message. For more information, see <a
     * href
     * ="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html"
     * >Queue and Message Identifiers</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * You can provide the <code>VisibilityTimeout</code> parameter in your request. The parameter is applied to the
     * messages that Amazon SQS returns in the response. If you don't include the parameter, the overall visibility
     * timeout for the queue is used for the returned messages. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * A message that isn't deleted or a message whose visibility isn't extended before the visibility timeout expires
     * counts as a failed receive. Depending on the configuration of the queue, the message might be sent to the dead
     * letter queue.
     * </p>
     * <note>
     * <p>
     * In the future, new attributes might be added. If you write code that calls this action, we recommend that you
     * structure your code so that it can handle new attributes gracefully.
     * </p>
     * </note>
     * 
     * @param receiveMessageRequest
     * @return Result of the ReceiveMessage operation returned by the service.
     * @throws OverLimitException
     *         The action that you requested would violate a limit. For example, <code>ReceiveMessage</code> returns
     *         this error if the maximum number of inflight messages is reached. <code> <a>AddPermission</a> </code>
     *         returns this error if the maximum number of permissions for the queue is reached.
     * @sample AmazonSQS.ReceiveMessage
     */
    ReceiveMessageResult receiveMessage(ReceiveMessageRequest receiveMessageRequest);

    /**
     * Simplified method form for invoking the ReceiveMessage operation.
     *
     * @see #receiveMessage(ReceiveMessageRequest)
     */
    ReceiveMessageResult receiveMessage(String queueUrl);

    /**
     * <p>
     * Revokes any permissions in the queue policy that matches the specified <code>Label</code> parameter. Only the
     * owner of the queue can remove permissions.
     * </p>
     * 
     * @param removePermissionRequest
     * @return Result of the RemovePermission operation returned by the service.
     * @sample AmazonSQS.RemovePermission
     */
    RemovePermissionResult removePermission(RemovePermissionRequest removePermissionRequest);

    /**
     * Simplified method form for invoking the RemovePermission operation.
     *
     * @see #removePermission(RemovePermissionRequest)
     */
    RemovePermissionResult removePermission(String queueUrl, String label);

    /**
     * <p>
     * Delivers a message to the specified queue.
     * </p>
     * <important>
     * <p>
     * The following list shows the characters (in Unicode) that are allowed in your message, according to the W3C XML
     * specification:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#x9</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>#xA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>#xD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>#x20</code> to <code>#xD7FF</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>#xE000</code> to <code>#xFFFD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>#x10000</code> to <code>#x10FFFF</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>. If you send any characters
     * that aren't included in this list, your request is rejected.
     * </p>
     * </important>
     * 
     * @param sendMessageRequest
     * @return Result of the SendMessage operation returned by the service.
     * @throws InvalidMessageContentsException
     *         The message contains characters outside the allowed set.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.SendMessage
     */
    SendMessageResult sendMessage(SendMessageRequest sendMessageRequest);

    /**
     * Simplified method form for invoking the SendMessage operation.
     *
     * @see #sendMessage(SendMessageRequest)
     */
    SendMessageResult sendMessage(String queueUrl, String messageBody);

    /**
     * <p>
     * Delivers up to ten messages to the specified queue. This is a batch version of <code> <a>SendMessage</a> </code>.
     * For a FIFO queue, multiple messages within a single batch are enqueued in the order they are sent.
     * </p>
     * <p>
     * The result of sending each message is reported individually in the response. Because the batch request can result
     * in a combination of successful and unsuccessful actions, you should check for batch errors even when the call
     * returns an HTTP status code of <code>200</code>.
     * </p>
     * <p>
     * The maximum allowed individual message size and the maximum total payload size (the sum of the individual lengths
     * of all of the batched messages) are both 256 KB (262,144 bytes).
     * </p>
     * <important>
     * <p>
     * The following list shows the characters (in Unicode) that are allowed in your message, according to the W3C XML
     * specification:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#x9</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>#xA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>#xD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>#x20</code> to <code>#xD7FF</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>#xE000</code> to <code>#xFFFD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>#x10000</code> to <code>#x10FFFF</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>. If you send any characters
     * that aren't included in this list, your request is rejected.
     * </p>
     * </important>
     * <p>
     * If you don't specify the <code>DelaySeconds</code> parameter for an entry, Amazon SQS uses the default value for
     * the queue.
     * </p>
     * <note>
     * <p>
     * Some actions take lists of parameters. These lists are specified using the <code>param.n</code> notation. Values
     * of <code>n</code> are integers starting from 1. For example, a parameter list with two elements looks like this:
     * </p>
     * <p>
     * <code>&amp;Attribute.1=this</code>
     * </p>
     * <p>
     * <code>&amp;Attribute.2=that</code>
     * </p>
     * </note>
     * 
     * @param sendMessageBatchRequest
     * @return Result of the SendMessageBatch operation returned by the service.
     * @throws TooManyEntriesInBatchRequestException
     *         The batch request contains more entries than permissible.
     * @throws EmptyBatchRequestException
     *         The batch request doesn't contain any entries.
     * @throws BatchEntryIdsNotDistinctException
     *         Two or more batch entries in the request have the same <code>Id</code>.
     * @throws BatchRequestTooLongException
     *         The length of all the messages put together is more than the limit.
     * @throws InvalidBatchEntryIdException
     *         The <code>Id</code> of a batch entry in a batch request doesn't abide by the specification.
     * @throws UnsupportedOperationException
     *         Error code 400. Unsupported operation.
     * @sample AmazonSQS.SendMessageBatch
     */
    SendMessageBatchResult sendMessageBatch(SendMessageBatchRequest sendMessageBatchRequest);

    /**
     * Simplified method form for invoking the SendMessageBatch operation.
     *
     * @see #sendMessageBatch(SendMessageBatchRequest)
     */
    SendMessageBatchResult sendMessageBatch(String queueUrl, java.util.List<SendMessageBatchRequestEntry> entries);

    /**
     * <p>
     * Sets the value of one or more queue attributes. When you change a queue's attributes, the change can take up to
     * 60 seconds for most of the attributes to propagate throughout the Amazon SQS system. Changes made to the
     * <code>MessageRetentionPeriod</code> attribute can take up to 15 minutes.
     * </p>
     * <note>
     * <p>
     * In the future, new attributes might be added. If you write code that calls this action, we recommend that you
     * structure your code so that it can handle new attributes gracefully.
     * </p>
     * </note>
     * 
     * @param setQueueAttributesRequest
     * @return Result of the SetQueueAttributes operation returned by the service.
     * @throws InvalidAttributeNameException
     *         The attribute referred to doesn't exist.
     * @sample AmazonSQS.SetQueueAttributes
     */
    SetQueueAttributesResult setQueueAttributes(SetQueueAttributesRequest setQueueAttributesRequest);

    /**
     * Simplified method form for invoking the SetQueueAttributes operation.
     *
     * @see #setQueueAttributes(SetQueueAttributesRequest)
     */
    SetQueueAttributesResult setQueueAttributes(String queueUrl, java.util.Map<String, String> attributes);

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
