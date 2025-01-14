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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateLoginProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the user whose password you want to update.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: =,.@-
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The new password for the specified IAM user.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of any printable ASCII character ranging from the space character ( ) through end of the
     * ASCII character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage
     * return ( ). However, the format can be further restricted by the account administrator by setting a password
     * policy on the AWS account. For more information, see <a>UpdateAccountPasswordPolicy</a>.
     * </p>
     */
    private String password;
    /**
     * <p>
     * Allows this new password to be used only once by requiring the specified IAM user to set a new password on next
     * sign-in.
     * </p>
     */
    private Boolean passwordResetRequired;

    /**
     * Default constructor for UpdateLoginProfileRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public UpdateLoginProfileRequest() {
    }

    /**
     * Constructs a new UpdateLoginProfileRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param userName
     *        The name of the user whose password you want to update.</p>
     *        <p>
     *        This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     */
    public UpdateLoginProfileRequest(String userName) {
        setUserName(userName);
    }

    /**
     * <p>
     * The name of the user whose password you want to update.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: =,.@-
     * </p>
     * 
     * @param userName
     *        The name of the user whose password you want to update.</p>
     *        <p>
     *        This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user whose password you want to update.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: =,.@-
     * </p>
     * 
     * @return The name of the user whose password you want to update.</p>
     *         <p>
     *         This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *         characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *         any of the following characters: =,.@-
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user whose password you want to update.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: =,.@-
     * </p>
     * 
     * @param userName
     *        The name of the user whose password you want to update.</p>
     *        <p>
     *        This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLoginProfileRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The new password for the specified IAM user.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of any printable ASCII character ranging from the space character ( ) through end of the
     * ASCII character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage
     * return ( ). However, the format can be further restricted by the account administrator by setting a password
     * policy on the AWS account. For more information, see <a>UpdateAccountPasswordPolicy</a>.
     * </p>
     * 
     * @param password
     *        The new password for the specified IAM user.</p>
     *        <p>
     *        This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of any printable ASCII character ranging from the space character ( ) through end of
     *        the ASCII character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and
     *        carriage return ( ). However, the format can be further restricted by the account administrator by setting
     *        a password policy on the AWS account. For more information, see <a>UpdateAccountPasswordPolicy</a>.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The new password for the specified IAM user.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of any printable ASCII character ranging from the space character ( ) through end of the
     * ASCII character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage
     * return ( ). However, the format can be further restricted by the account administrator by setting a password
     * policy on the AWS account. For more information, see <a>UpdateAccountPasswordPolicy</a>.
     * </p>
     * 
     * @return The new password for the specified IAM user.</p>
     *         <p>
     *         This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *         characters consisting of any printable ASCII character ranging from the space character ( ) through end
     *         of the ASCII character range (\u00FF). It also includes the special characters tab ( ), line feed ( ),
     *         and carriage return ( ). However, the format can be further restricted by the account administrator by
     *         setting a password policy on the AWS account. For more information, see
     *         <a>UpdateAccountPasswordPolicy</a>.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The new password for the specified IAM user.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of any printable ASCII character ranging from the space character ( ) through end of the
     * ASCII character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage
     * return ( ). However, the format can be further restricted by the account administrator by setting a password
     * policy on the AWS account. For more information, see <a>UpdateAccountPasswordPolicy</a>.
     * </p>
     * 
     * @param password
     *        The new password for the specified IAM user.</p>
     *        <p>
     *        This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of any printable ASCII character ranging from the space character ( ) through end of
     *        the ASCII character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and
     *        carriage return ( ). However, the format can be further restricted by the account administrator by setting
     *        a password policy on the AWS account. For more information, see <a>UpdateAccountPasswordPolicy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLoginProfileRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * Allows this new password to be used only once by requiring the specified IAM user to set a new password on next
     * sign-in.
     * </p>
     * 
     * @param passwordResetRequired
     *        Allows this new password to be used only once by requiring the specified IAM user to set a new password on
     *        next sign-in.
     */

    public void setPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
    }

    /**
     * <p>
     * Allows this new password to be used only once by requiring the specified IAM user to set a new password on next
     * sign-in.
     * </p>
     * 
     * @return Allows this new password to be used only once by requiring the specified IAM user to set a new password
     *         on next sign-in.
     */

    public Boolean getPasswordResetRequired() {
        return this.passwordResetRequired;
    }

    /**
     * <p>
     * Allows this new password to be used only once by requiring the specified IAM user to set a new password on next
     * sign-in.
     * </p>
     * 
     * @param passwordResetRequired
     *        Allows this new password to be used only once by requiring the specified IAM user to set a new password on
     *        next sign-in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLoginProfileRequest withPasswordResetRequired(Boolean passwordResetRequired) {
        setPasswordResetRequired(passwordResetRequired);
        return this;
    }

    /**
     * <p>
     * Allows this new password to be used only once by requiring the specified IAM user to set a new password on next
     * sign-in.
     * </p>
     * 
     * @return Allows this new password to be used only once by requiring the specified IAM user to set a new password
     *         on next sign-in.
     */

    public Boolean isPasswordResetRequired() {
        return this.passwordResetRequired;
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword()).append(",");
        if (getPasswordResetRequired() != null)
            sb.append("PasswordResetRequired: ").append(getPasswordResetRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLoginProfileRequest == false)
            return false;
        UpdateLoginProfileRequest other = (UpdateLoginProfileRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getPasswordResetRequired() == null ^ this.getPasswordResetRequired() == null)
            return false;
        if (other.getPasswordResetRequired() != null && other.getPasswordResetRequired().equals(this.getPasswordResetRequired()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getPasswordResetRequired() == null) ? 0 : getPasswordResetRequired().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLoginProfileRequest clone() {
        return (UpdateLoginProfileRequest) super.clone();
    }

}
