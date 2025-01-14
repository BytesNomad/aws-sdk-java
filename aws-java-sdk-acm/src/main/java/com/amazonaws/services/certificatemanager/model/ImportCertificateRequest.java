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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ImportCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of an imported certificate to replace. To import a new certificate, omit this field.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The certificate to import. It must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be PEM-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain a 1024-bit or 2048-bit RSA public key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be valid at the time of import. You cannot import a certificate before its validity period begins (the
     * certificate's <code>NotBefore</code> date) or after it expires (the certificate's <code>NotAfter</code> date).
     * </p>
     * </li>
     * </ul>
     */
    private java.nio.ByteBuffer certificate;
    /**
     * <p>
     * The private key that matches the public key in the certificate. It must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be PEM-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unencrypted. You cannot import a private key that is protected by a password or passphrase.
     * </p>
     * </li>
     * </ul>
     */
    private java.nio.ByteBuffer privateKey;
    /**
     * <p>
     * The certificate chain. It must be PEM-encoded.
     * </p>
     */
    private java.nio.ByteBuffer certificateChain;

    /**
     * <p>
     * The <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of an imported certificate to replace. To import a new certificate, omit this field.
     * </p>
     * 
     * @param certificateArn
     *        The <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of an imported certificate to replace. To import a new certificate, omit this field.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of an imported certificate to replace. To import a new certificate, omit this field.
     * </p>
     * 
     * @return The <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *         Name (ARN)</a> of an imported certificate to replace. To import a new certificate, omit this field.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of an imported certificate to replace. To import a new certificate, omit this field.
     * </p>
     * 
     * @param certificateArn
     *        The <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of an imported certificate to replace. To import a new certificate, omit this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The certificate to import. It must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be PEM-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain a 1024-bit or 2048-bit RSA public key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be valid at the time of import. You cannot import a certificate before its validity period begins (the
     * certificate's <code>NotBefore</code> date) or after it expires (the certificate's <code>NotAfter</code> date).
     * </p>
     * </li>
     * </ul>
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
     * @param certificate
     *        The certificate to import. It must meet the following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be PEM-encoded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain a 1024-bit or 2048-bit RSA public key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be valid at the time of import. You cannot import a certificate before its validity period begins
     *        (the certificate's <code>NotBefore</code> date) or after it expires (the certificate's
     *        <code>NotAfter</code> date).
     *        </p>
     *        </li>
     */

    public void setCertificate(java.nio.ByteBuffer certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The certificate to import. It must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be PEM-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain a 1024-bit or 2048-bit RSA public key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be valid at the time of import. You cannot import a certificate before its validity period begins (the
     * certificate's <code>NotBefore</code> date) or after it expires (the certificate's <code>NotAfter</code> date).
     * </p>
     * </li>
     * </ul>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The certificate to import. It must meet the following requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be PEM-encoded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain a 1024-bit or 2048-bit RSA public key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be valid at the time of import. You cannot import a certificate before its validity period begins
     *         (the certificate's <code>NotBefore</code> date) or after it expires (the certificate's
     *         <code>NotAfter</code> date).
     *         </p>
     *         </li>
     */

    public java.nio.ByteBuffer getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The certificate to import. It must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be PEM-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain a 1024-bit or 2048-bit RSA public key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be valid at the time of import. You cannot import a certificate before its validity period begins (the
     * certificate's <code>NotBefore</code> date) or after it expires (the certificate's <code>NotAfter</code> date).
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificate
     *        The certificate to import. It must meet the following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be PEM-encoded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain a 1024-bit or 2048-bit RSA public key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be valid at the time of import. You cannot import a certificate before its validity period begins
     *        (the certificate's <code>NotBefore</code> date) or after it expires (the certificate's
     *        <code>NotAfter</code> date).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withCertificate(java.nio.ByteBuffer certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * The private key that matches the public key in the certificate. It must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be PEM-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unencrypted. You cannot import a private key that is protected by a password or passphrase.
     * </p>
     * </li>
     * </ul>
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
     * @param privateKey
     *        The private key that matches the public key in the certificate. It must meet the following
     *        requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be PEM-encoded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be unencrypted. You cannot import a private key that is protected by a password or passphrase.
     *        </p>
     *        </li>
     */

    public void setPrivateKey(java.nio.ByteBuffer privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * The private key that matches the public key in the certificate. It must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be PEM-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unencrypted. You cannot import a private key that is protected by a password or passphrase.
     * </p>
     * </li>
     * </ul>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The private key that matches the public key in the certificate. It must meet the following
     *         requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be PEM-encoded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be unencrypted. You cannot import a private key that is protected by a password or passphrase.
     *         </p>
     *         </li>
     */

    public java.nio.ByteBuffer getPrivateKey() {
        return this.privateKey;
    }

    /**
     * <p>
     * The private key that matches the public key in the certificate. It must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be PEM-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unencrypted. You cannot import a private key that is protected by a password or passphrase.
     * </p>
     * </li>
     * </ul>
     * 
     * @param privateKey
     *        The private key that matches the public key in the certificate. It must meet the following
     *        requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be PEM-encoded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be unencrypted. You cannot import a private key that is protected by a password or passphrase.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withPrivateKey(java.nio.ByteBuffer privateKey) {
        setPrivateKey(privateKey);
        return this;
    }

    /**
     * <p>
     * The certificate chain. It must be PEM-encoded.
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
     * @param certificateChain
     *        The certificate chain. It must be PEM-encoded.
     */

    public void setCertificateChain(java.nio.ByteBuffer certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The certificate chain. It must be PEM-encoded.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The certificate chain. It must be PEM-encoded.
     */

    public java.nio.ByteBuffer getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * The certificate chain. It must be PEM-encoded.
     * </p>
     * 
     * @param certificateChain
     *        The certificate chain. It must be PEM-encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withCertificateChain(java.nio.ByteBuffer certificateChain) {
        setCertificateChain(certificateChain);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: ").append(getPrivateKey()).append(",");
        if (getCertificateChain() != null)
            sb.append("CertificateChain: ").append(getCertificateChain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportCertificateRequest == false)
            return false;
        ImportCertificateRequest other = (ImportCertificateRequest) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        return hashCode;
    }

    @Override
    public ImportCertificateRequest clone() {
        return (ImportCertificateRequest) super.clone();
    }

}
