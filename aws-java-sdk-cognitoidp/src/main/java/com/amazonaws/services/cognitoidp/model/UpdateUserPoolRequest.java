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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to update the user pool.
 * </p>
 */
public class UpdateUserPoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool you want to update.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * A container with the policies you wish to update in a user pool.
     * </p>
     */
    private UserPoolPolicyType policies;
    /**
     * <p>
     * The AWS Lambda configuration information from the request to update the user pool.
     * </p>
     */
    private LambdaConfigType lambdaConfig;
    /**
     * <p>
     * The attributes that are automatically verified when the Amazon Cognito service makes a request to update user
     * pools.
     * </p>
     */
    private java.util.List<String> autoVerifiedAttributes;
    /**
     * <p>
     * A container with information about the SMS verification message.
     * </p>
     */
    private String smsVerificationMessage;
    /**
     * <p>
     * The contents of the email verification message.
     * </p>
     */
    private String emailVerificationMessage;
    /**
     * <p>
     * The subject of the email verfication message.
     * </p>
     */
    private String emailVerificationSubject;
    /**
     * <p>
     * The contents of the SMS authentication message.
     * </p>
     */
    private String smsAuthenticationMessage;
    /**
     * <p>
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when you are
     * initially creating a user pool.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     * </p>
     * </li>
     * </ul>
     */
    private String mfaConfiguration;
    /**
     * <p>
     * Device configuration.
     * </p>
     */
    private DeviceConfigurationType deviceConfiguration;
    /**
     * <p>
     * Email configuration.
     * </p>
     */
    private EmailConfigurationType emailConfiguration;
    /**
     * <p>
     * SMS configuration.
     * </p>
     */
    private SmsConfigurationType smsConfiguration;
    /**
     * <p>
     * The cost allocation tags for the user pool. For more information, see <a
     * href="http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-cost-allocation-tagging.html"
     * >Adding Cost Allocation Tags to Your User Pool</a>
     * </p>
     */
    private java.util.Map<String, String> userPoolTags;
    /**
     * <p>
     * The configuration for AdminCreateUser requests.
     * </p>
     */
    private AdminCreateUserConfigType adminCreateUserConfig;

    /**
     * <p>
     * The user pool ID for the user pool you want to update.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool you want to update.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool you want to update.
     * </p>
     * 
     * @return The user pool ID for the user pool you want to update.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool you want to update.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * A container with the policies you wish to update in a user pool.
     * </p>
     * 
     * @param policies
     *        A container with the policies you wish to update in a user pool.
     */

    public void setPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
    }

    /**
     * <p>
     * A container with the policies you wish to update in a user pool.
     * </p>
     * 
     * @return A container with the policies you wish to update in a user pool.
     */

    public UserPoolPolicyType getPolicies() {
        return this.policies;
    }

    /**
     * <p>
     * A container with the policies you wish to update in a user pool.
     * </p>
     * 
     * @param policies
     *        A container with the policies you wish to update in a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withPolicies(UserPoolPolicyType policies) {
        setPolicies(policies);
        return this;
    }

    /**
     * <p>
     * The AWS Lambda configuration information from the request to update the user pool.
     * </p>
     * 
     * @param lambdaConfig
     *        The AWS Lambda configuration information from the request to update the user pool.
     */

    public void setLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    /**
     * <p>
     * The AWS Lambda configuration information from the request to update the user pool.
     * </p>
     * 
     * @return The AWS Lambda configuration information from the request to update the user pool.
     */

    public LambdaConfigType getLambdaConfig() {
        return this.lambdaConfig;
    }

    /**
     * <p>
     * The AWS Lambda configuration information from the request to update the user pool.
     * </p>
     * 
     * @param lambdaConfig
     *        The AWS Lambda configuration information from the request to update the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withLambdaConfig(LambdaConfigType lambdaConfig) {
        setLambdaConfig(lambdaConfig);
        return this;
    }

    /**
     * <p>
     * The attributes that are automatically verified when the Amazon Cognito service makes a request to update user
     * pools.
     * </p>
     * 
     * @return The attributes that are automatically verified when the Amazon Cognito service makes a request to update
     *         user pools.
     * @see VerifiedAttributeType
     */

    public java.util.List<String> getAutoVerifiedAttributes() {
        return autoVerifiedAttributes;
    }

    /**
     * <p>
     * The attributes that are automatically verified when the Amazon Cognito service makes a request to update user
     * pools.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        The attributes that are automatically verified when the Amazon Cognito service makes a request to update
     *        user pools.
     * @see VerifiedAttributeType
     */

    public void setAutoVerifiedAttributes(java.util.Collection<String> autoVerifiedAttributes) {
        if (autoVerifiedAttributes == null) {
            this.autoVerifiedAttributes = null;
            return;
        }

        this.autoVerifiedAttributes = new java.util.ArrayList<String>(autoVerifiedAttributes);
    }

    /**
     * <p>
     * The attributes that are automatically verified when the Amazon Cognito service makes a request to update user
     * pools.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoVerifiedAttributes(java.util.Collection)} or
     * {@link #withAutoVerifiedAttributes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        The attributes that are automatically verified when the Amazon Cognito service makes a request to update
     *        user pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public UpdateUserPoolRequest withAutoVerifiedAttributes(String... autoVerifiedAttributes) {
        if (this.autoVerifiedAttributes == null) {
            setAutoVerifiedAttributes(new java.util.ArrayList<String>(autoVerifiedAttributes.length));
        }
        for (String ele : autoVerifiedAttributes) {
            this.autoVerifiedAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes that are automatically verified when the Amazon Cognito service makes a request to update user
     * pools.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        The attributes that are automatically verified when the Amazon Cognito service makes a request to update
     *        user pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public UpdateUserPoolRequest withAutoVerifiedAttributes(java.util.Collection<String> autoVerifiedAttributes) {
        setAutoVerifiedAttributes(autoVerifiedAttributes);
        return this;
    }

    /**
     * <p>
     * The attributes that are automatically verified when the Amazon Cognito service makes a request to update user
     * pools.
     * </p>
     * 
     * @param autoVerifiedAttributes
     *        The attributes that are automatically verified when the Amazon Cognito service makes a request to update
     *        user pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public UpdateUserPoolRequest withAutoVerifiedAttributes(VerifiedAttributeType... autoVerifiedAttributes) {
        java.util.ArrayList<String> autoVerifiedAttributesCopy = new java.util.ArrayList<String>(autoVerifiedAttributes.length);
        for (VerifiedAttributeType value : autoVerifiedAttributes) {
            autoVerifiedAttributesCopy.add(value.toString());
        }
        if (getAutoVerifiedAttributes() == null) {
            setAutoVerifiedAttributes(autoVerifiedAttributesCopy);
        } else {
            getAutoVerifiedAttributes().addAll(autoVerifiedAttributesCopy);
        }
        return this;
    }

    /**
     * <p>
     * A container with information about the SMS verification message.
     * </p>
     * 
     * @param smsVerificationMessage
     *        A container with information about the SMS verification message.
     */

    public void setSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
    }

    /**
     * <p>
     * A container with information about the SMS verification message.
     * </p>
     * 
     * @return A container with information about the SMS verification message.
     */

    public String getSmsVerificationMessage() {
        return this.smsVerificationMessage;
    }

    /**
     * <p>
     * A container with information about the SMS verification message.
     * </p>
     * 
     * @param smsVerificationMessage
     *        A container with information about the SMS verification message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withSmsVerificationMessage(String smsVerificationMessage) {
        setSmsVerificationMessage(smsVerificationMessage);
        return this;
    }

    /**
     * <p>
     * The contents of the email verification message.
     * </p>
     * 
     * @param emailVerificationMessage
     *        The contents of the email verification message.
     */

    public void setEmailVerificationMessage(String emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
    }

    /**
     * <p>
     * The contents of the email verification message.
     * </p>
     * 
     * @return The contents of the email verification message.
     */

    public String getEmailVerificationMessage() {
        return this.emailVerificationMessage;
    }

    /**
     * <p>
     * The contents of the email verification message.
     * </p>
     * 
     * @param emailVerificationMessage
     *        The contents of the email verification message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withEmailVerificationMessage(String emailVerificationMessage) {
        setEmailVerificationMessage(emailVerificationMessage);
        return this;
    }

    /**
     * <p>
     * The subject of the email verfication message.
     * </p>
     * 
     * @param emailVerificationSubject
     *        The subject of the email verfication message.
     */

    public void setEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
    }

    /**
     * <p>
     * The subject of the email verfication message.
     * </p>
     * 
     * @return The subject of the email verfication message.
     */

    public String getEmailVerificationSubject() {
        return this.emailVerificationSubject;
    }

    /**
     * <p>
     * The subject of the email verfication message.
     * </p>
     * 
     * @param emailVerificationSubject
     *        The subject of the email verfication message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withEmailVerificationSubject(String emailVerificationSubject) {
        setEmailVerificationSubject(emailVerificationSubject);
        return this;
    }

    /**
     * <p>
     * The contents of the SMS authentication message.
     * </p>
     * 
     * @param smsAuthenticationMessage
     *        The contents of the SMS authentication message.
     */

    public void setSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
    }

    /**
     * <p>
     * The contents of the SMS authentication message.
     * </p>
     * 
     * @return The contents of the SMS authentication message.
     */

    public String getSmsAuthenticationMessage() {
        return this.smsAuthenticationMessage;
    }

    /**
     * <p>
     * The contents of the SMS authentication message.
     * </p>
     * 
     * @param smsAuthenticationMessage
     *        The contents of the SMS authentication message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withSmsAuthenticationMessage(String smsAuthenticationMessage) {
        setSmsAuthenticationMessage(smsAuthenticationMessage);
        return this;
    }

    /**
     * <p>
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when you are
     * initially creating a user pool.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mfaConfiguration
     *        Can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when
     *        you are initially creating a user pool.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     *        </p>
     *        </li>
     * @see UserPoolMfaType
     */

    public void setMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
    }

    /**
     * <p>
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when you are
     * initially creating a user pool.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when
     *         you are initially creating a user pool.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     *         </p>
     *         </li>
     * @see UserPoolMfaType
     */

    public String getMfaConfiguration() {
        return this.mfaConfiguration;
    }

    /**
     * <p>
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when you are
     * initially creating a user pool.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mfaConfiguration
     *        Can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when
     *        you are initially creating a user pool.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserPoolMfaType
     */

    public UpdateUserPoolRequest withMfaConfiguration(String mfaConfiguration) {
        setMfaConfiguration(mfaConfiguration);
        return this;
    }

    /**
     * <p>
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when you are
     * initially creating a user pool.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mfaConfiguration
     *        Can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when
     *        you are initially creating a user pool.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     *        </p>
     *        </li>
     * @see UserPoolMfaType
     */

    public void setMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
    }

    /**
     * <p>
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when you are
     * initially creating a user pool.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mfaConfiguration
     *        Can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OFF</code> - MFA tokens are not required and cannot be specified during user registration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ON</code> - MFA tokens are required for all user registrations. You can only specify required when
     *        you are initially creating a user pool.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPTIONAL</code> - Users have the option when registering to create an MFA token.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserPoolMfaType
     */

    public UpdateUserPoolRequest withMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        setMfaConfiguration(mfaConfiguration);
        return this;
    }

    /**
     * <p>
     * Device configuration.
     * </p>
     * 
     * @param deviceConfiguration
     *        Device configuration.
     */

    public void setDeviceConfiguration(DeviceConfigurationType deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
    }

    /**
     * <p>
     * Device configuration.
     * </p>
     * 
     * @return Device configuration.
     */

    public DeviceConfigurationType getDeviceConfiguration() {
        return this.deviceConfiguration;
    }

    /**
     * <p>
     * Device configuration.
     * </p>
     * 
     * @param deviceConfiguration
     *        Device configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withDeviceConfiguration(DeviceConfigurationType deviceConfiguration) {
        setDeviceConfiguration(deviceConfiguration);
        return this;
    }

    /**
     * <p>
     * Email configuration.
     * </p>
     * 
     * @param emailConfiguration
     *        Email configuration.
     */

    public void setEmailConfiguration(EmailConfigurationType emailConfiguration) {
        this.emailConfiguration = emailConfiguration;
    }

    /**
     * <p>
     * Email configuration.
     * </p>
     * 
     * @return Email configuration.
     */

    public EmailConfigurationType getEmailConfiguration() {
        return this.emailConfiguration;
    }

    /**
     * <p>
     * Email configuration.
     * </p>
     * 
     * @param emailConfiguration
     *        Email configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withEmailConfiguration(EmailConfigurationType emailConfiguration) {
        setEmailConfiguration(emailConfiguration);
        return this;
    }

    /**
     * <p>
     * SMS configuration.
     * </p>
     * 
     * @param smsConfiguration
     *        SMS configuration.
     */

    public void setSmsConfiguration(SmsConfigurationType smsConfiguration) {
        this.smsConfiguration = smsConfiguration;
    }

    /**
     * <p>
     * SMS configuration.
     * </p>
     * 
     * @return SMS configuration.
     */

    public SmsConfigurationType getSmsConfiguration() {
        return this.smsConfiguration;
    }

    /**
     * <p>
     * SMS configuration.
     * </p>
     * 
     * @param smsConfiguration
     *        SMS configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withSmsConfiguration(SmsConfigurationType smsConfiguration) {
        setSmsConfiguration(smsConfiguration);
        return this;
    }

    /**
     * <p>
     * The cost allocation tags for the user pool. For more information, see <a
     * href="http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-cost-allocation-tagging.html"
     * >Adding Cost Allocation Tags to Your User Pool</a>
     * </p>
     * 
     * @return The cost allocation tags for the user pool. For more information, see <a
     *         href="http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-cost-allocation-tagging.html"
     *         >Adding Cost Allocation Tags to Your User Pool</a>
     */

    public java.util.Map<String, String> getUserPoolTags() {
        return userPoolTags;
    }

    /**
     * <p>
     * The cost allocation tags for the user pool. For more information, see <a
     * href="http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-cost-allocation-tagging.html"
     * >Adding Cost Allocation Tags to Your User Pool</a>
     * </p>
     * 
     * @param userPoolTags
     *        The cost allocation tags for the user pool. For more information, see <a href=
     *        "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-cost-allocation-tagging.html"
     *        >Adding Cost Allocation Tags to Your User Pool</a>
     */

    public void setUserPoolTags(java.util.Map<String, String> userPoolTags) {
        this.userPoolTags = userPoolTags;
    }

    /**
     * <p>
     * The cost allocation tags for the user pool. For more information, see <a
     * href="http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-cost-allocation-tagging.html"
     * >Adding Cost Allocation Tags to Your User Pool</a>
     * </p>
     * 
     * @param userPoolTags
     *        The cost allocation tags for the user pool. For more information, see <a href=
     *        "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-cost-allocation-tagging.html"
     *        >Adding Cost Allocation Tags to Your User Pool</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withUserPoolTags(java.util.Map<String, String> userPoolTags) {
        setUserPoolTags(userPoolTags);
        return this;
    }

    public UpdateUserPoolRequest addUserPoolTagsEntry(String key, String value) {
        if (null == this.userPoolTags) {
            this.userPoolTags = new java.util.HashMap<String, String>();
        }
        if (this.userPoolTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.userPoolTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserPoolTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest clearUserPoolTagsEntries() {
        this.userPoolTags = null;
        return this;
    }

    /**
     * <p>
     * The configuration for AdminCreateUser requests.
     * </p>
     * 
     * @param adminCreateUserConfig
     *        The configuration for AdminCreateUser requests.
     */

    public void setAdminCreateUserConfig(AdminCreateUserConfigType adminCreateUserConfig) {
        this.adminCreateUserConfig = adminCreateUserConfig;
    }

    /**
     * <p>
     * The configuration for AdminCreateUser requests.
     * </p>
     * 
     * @return The configuration for AdminCreateUser requests.
     */

    public AdminCreateUserConfigType getAdminCreateUserConfig() {
        return this.adminCreateUserConfig;
    }

    /**
     * <p>
     * The configuration for AdminCreateUser requests.
     * </p>
     * 
     * @param adminCreateUserConfig
     *        The configuration for AdminCreateUser requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolRequest withAdminCreateUserConfig(AdminCreateUserConfigType adminCreateUserConfig) {
        setAdminCreateUserConfig(adminCreateUserConfig);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getPolicies() != null)
            sb.append("Policies: ").append(getPolicies()).append(",");
        if (getLambdaConfig() != null)
            sb.append("LambdaConfig: ").append(getLambdaConfig()).append(",");
        if (getAutoVerifiedAttributes() != null)
            sb.append("AutoVerifiedAttributes: ").append(getAutoVerifiedAttributes()).append(",");
        if (getSmsVerificationMessage() != null)
            sb.append("SmsVerificationMessage: ").append(getSmsVerificationMessage()).append(",");
        if (getEmailVerificationMessage() != null)
            sb.append("EmailVerificationMessage: ").append(getEmailVerificationMessage()).append(",");
        if (getEmailVerificationSubject() != null)
            sb.append("EmailVerificationSubject: ").append(getEmailVerificationSubject()).append(",");
        if (getSmsAuthenticationMessage() != null)
            sb.append("SmsAuthenticationMessage: ").append(getSmsAuthenticationMessage()).append(",");
        if (getMfaConfiguration() != null)
            sb.append("MfaConfiguration: ").append(getMfaConfiguration()).append(",");
        if (getDeviceConfiguration() != null)
            sb.append("DeviceConfiguration: ").append(getDeviceConfiguration()).append(",");
        if (getEmailConfiguration() != null)
            sb.append("EmailConfiguration: ").append(getEmailConfiguration()).append(",");
        if (getSmsConfiguration() != null)
            sb.append("SmsConfiguration: ").append(getSmsConfiguration()).append(",");
        if (getUserPoolTags() != null)
            sb.append("UserPoolTags: ").append(getUserPoolTags()).append(",");
        if (getAdminCreateUserConfig() != null)
            sb.append("AdminCreateUserConfig: ").append(getAdminCreateUserConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserPoolRequest == false)
            return false;
        UpdateUserPoolRequest other = (UpdateUserPoolRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        if (other.getLambdaConfig() == null ^ this.getLambdaConfig() == null)
            return false;
        if (other.getLambdaConfig() != null && other.getLambdaConfig().equals(this.getLambdaConfig()) == false)
            return false;
        if (other.getAutoVerifiedAttributes() == null ^ this.getAutoVerifiedAttributes() == null)
            return false;
        if (other.getAutoVerifiedAttributes() != null && other.getAutoVerifiedAttributes().equals(this.getAutoVerifiedAttributes()) == false)
            return false;
        if (other.getSmsVerificationMessage() == null ^ this.getSmsVerificationMessage() == null)
            return false;
        if (other.getSmsVerificationMessage() != null && other.getSmsVerificationMessage().equals(this.getSmsVerificationMessage()) == false)
            return false;
        if (other.getEmailVerificationMessage() == null ^ this.getEmailVerificationMessage() == null)
            return false;
        if (other.getEmailVerificationMessage() != null && other.getEmailVerificationMessage().equals(this.getEmailVerificationMessage()) == false)
            return false;
        if (other.getEmailVerificationSubject() == null ^ this.getEmailVerificationSubject() == null)
            return false;
        if (other.getEmailVerificationSubject() != null && other.getEmailVerificationSubject().equals(this.getEmailVerificationSubject()) == false)
            return false;
        if (other.getSmsAuthenticationMessage() == null ^ this.getSmsAuthenticationMessage() == null)
            return false;
        if (other.getSmsAuthenticationMessage() != null && other.getSmsAuthenticationMessage().equals(this.getSmsAuthenticationMessage()) == false)
            return false;
        if (other.getMfaConfiguration() == null ^ this.getMfaConfiguration() == null)
            return false;
        if (other.getMfaConfiguration() != null && other.getMfaConfiguration().equals(this.getMfaConfiguration()) == false)
            return false;
        if (other.getDeviceConfiguration() == null ^ this.getDeviceConfiguration() == null)
            return false;
        if (other.getDeviceConfiguration() != null && other.getDeviceConfiguration().equals(this.getDeviceConfiguration()) == false)
            return false;
        if (other.getEmailConfiguration() == null ^ this.getEmailConfiguration() == null)
            return false;
        if (other.getEmailConfiguration() != null && other.getEmailConfiguration().equals(this.getEmailConfiguration()) == false)
            return false;
        if (other.getSmsConfiguration() == null ^ this.getSmsConfiguration() == null)
            return false;
        if (other.getSmsConfiguration() != null && other.getSmsConfiguration().equals(this.getSmsConfiguration()) == false)
            return false;
        if (other.getUserPoolTags() == null ^ this.getUserPoolTags() == null)
            return false;
        if (other.getUserPoolTags() != null && other.getUserPoolTags().equals(this.getUserPoolTags()) == false)
            return false;
        if (other.getAdminCreateUserConfig() == null ^ this.getAdminCreateUserConfig() == null)
            return false;
        if (other.getAdminCreateUserConfig() != null && other.getAdminCreateUserConfig().equals(this.getAdminCreateUserConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        hashCode = prime * hashCode + ((getLambdaConfig() == null) ? 0 : getLambdaConfig().hashCode());
        hashCode = prime * hashCode + ((getAutoVerifiedAttributes() == null) ? 0 : getAutoVerifiedAttributes().hashCode());
        hashCode = prime * hashCode + ((getSmsVerificationMessage() == null) ? 0 : getSmsVerificationMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailVerificationMessage() == null) ? 0 : getEmailVerificationMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailVerificationSubject() == null) ? 0 : getEmailVerificationSubject().hashCode());
        hashCode = prime * hashCode + ((getSmsAuthenticationMessage() == null) ? 0 : getSmsAuthenticationMessage().hashCode());
        hashCode = prime * hashCode + ((getMfaConfiguration() == null) ? 0 : getMfaConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeviceConfiguration() == null) ? 0 : getDeviceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEmailConfiguration() == null) ? 0 : getEmailConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSmsConfiguration() == null) ? 0 : getSmsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUserPoolTags() == null) ? 0 : getUserPoolTags().hashCode());
        hashCode = prime * hashCode + ((getAdminCreateUserConfig() == null) ? 0 : getAdminCreateUserConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserPoolRequest clone() {
        return (UpdateUserPoolRequest) super.clone();
    }

}
