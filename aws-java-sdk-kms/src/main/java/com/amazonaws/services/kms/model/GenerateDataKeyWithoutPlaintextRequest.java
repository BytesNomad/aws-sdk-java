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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GenerateDataKeyWithoutPlaintextRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the CMK under which to generate and encrypt the data encryption key.
     * </p>
     * <p>
     * A valid identifier is the unique key ID or the Amazon Resource Name (ARN) of the CMK, or the alias name or ARN of
     * an alias that refers to the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * CMK ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     */
    private String keyId;
    /**
     * <p>
     * A set of key-value pairs that represents additional authenticated data.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> encryptionContext;
    /**
     * <p>
     * The length of the data encryption key. Use <code>AES_128</code> to generate a 128-bit symmetric key, or
     * <code>AES_256</code> to generate a 256-bit symmetric key.
     * </p>
     */
    private String keySpec;
    /**
     * <p>
     * The length of the data encryption key in bytes. For example, use the value 64 to generate a 512-bit data key (64
     * bytes is 512 bits). For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use the
     * <code>KeySpec</code> field instead of this one.
     * </p>
     */
    private Integer numberOfBytes;
    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> grantTokens;

    /**
     * <p>
     * The identifier of the CMK under which to generate and encrypt the data encryption key.
     * </p>
     * <p>
     * A valid identifier is the unique key ID or the Amazon Resource Name (ARN) of the CMK, or the alias name or ARN of
     * an alias that refers to the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * CMK ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyId
     *        The identifier of the CMK under which to generate and encrypt the data encryption key.</p>
     *        <p>
     *        A valid identifier is the unique key ID or the Amazon Resource Name (ARN) of the CMK, or the alias name or
     *        ARN of an alias that refers to the CMK. Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CMK ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name: <code>alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *        </p>
     *        </li>
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of the CMK under which to generate and encrypt the data encryption key.
     * </p>
     * <p>
     * A valid identifier is the unique key ID or the Amazon Resource Name (ARN) of the CMK, or the alias name or ARN of
     * an alias that refers to the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * CMK ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the CMK under which to generate and encrypt the data encryption key.</p>
     *         <p>
     *         A valid identifier is the unique key ID or the Amazon Resource Name (ARN) of the CMK, or the alias name
     *         or ARN of an alias that refers to the CMK. Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CMK ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name: <code>alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *         </p>
     *         </li>
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The identifier of the CMK under which to generate and encrypt the data encryption key.
     * </p>
     * <p>
     * A valid identifier is the unique key ID or the Amazon Resource Name (ARN) of the CMK, or the alias name or ARN of
     * an alias that refers to the CMK. Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * CMK ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyId
     *        The identifier of the CMK under which to generate and encrypt the data encryption key.</p>
     *        <p>
     *        A valid identifier is the unique key ID or the Amazon Resource Name (ARN) of the CMK, or the alias name or
     *        ARN of an alias that refers to the CMK. Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Unique key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CMK ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name: <code>alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataKeyWithoutPlaintextRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * A set of key-value pairs that represents additional authenticated data.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return A set of key-value pairs that represents additional authenticated data.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption
     *         Context</a> in the <i>AWS Key Management Service Developer Guide</i>.
     */

    public java.util.Map<String, String> getEncryptionContext() {
        if (encryptionContext == null) {
            encryptionContext = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return encryptionContext;
    }

    /**
     * <p>
     * A set of key-value pairs that represents additional authenticated data.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param encryptionContext
     *        A set of key-value pairs that represents additional authenticated data.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a>
     *        in the <i>AWS Key Management Service Developer Guide</i>.
     */

    public void setEncryptionContext(java.util.Map<String, String> encryptionContext) {
        this.encryptionContext = encryptionContext == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(encryptionContext);
    }

    /**
     * <p>
     * A set of key-value pairs that represents additional authenticated data.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param encryptionContext
     *        A set of key-value pairs that represents additional authenticated data.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a>
     *        in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataKeyWithoutPlaintextRequest withEncryptionContext(java.util.Map<String, String> encryptionContext) {
        setEncryptionContext(encryptionContext);
        return this;
    }

    public GenerateDataKeyWithoutPlaintextRequest addEncryptionContextEntry(String key, String value) {
        if (null == this.encryptionContext) {
            this.encryptionContext = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.encryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.encryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EncryptionContext.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataKeyWithoutPlaintextRequest clearEncryptionContextEntries() {
        this.encryptionContext = null;
        return this;
    }

    /**
     * <p>
     * The length of the data encryption key. Use <code>AES_128</code> to generate a 128-bit symmetric key, or
     * <code>AES_256</code> to generate a 256-bit symmetric key.
     * </p>
     * 
     * @param keySpec
     *        The length of the data encryption key. Use <code>AES_128</code> to generate a 128-bit symmetric key, or
     *        <code>AES_256</code> to generate a 256-bit symmetric key.
     * @see DataKeySpec
     */

    public void setKeySpec(String keySpec) {
        this.keySpec = keySpec;
    }

    /**
     * <p>
     * The length of the data encryption key. Use <code>AES_128</code> to generate a 128-bit symmetric key, or
     * <code>AES_256</code> to generate a 256-bit symmetric key.
     * </p>
     * 
     * @return The length of the data encryption key. Use <code>AES_128</code> to generate a 128-bit symmetric key, or
     *         <code>AES_256</code> to generate a 256-bit symmetric key.
     * @see DataKeySpec
     */

    public String getKeySpec() {
        return this.keySpec;
    }

    /**
     * <p>
     * The length of the data encryption key. Use <code>AES_128</code> to generate a 128-bit symmetric key, or
     * <code>AES_256</code> to generate a 256-bit symmetric key.
     * </p>
     * 
     * @param keySpec
     *        The length of the data encryption key. Use <code>AES_128</code> to generate a 128-bit symmetric key, or
     *        <code>AES_256</code> to generate a 256-bit symmetric key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataKeySpec
     */

    public GenerateDataKeyWithoutPlaintextRequest withKeySpec(String keySpec) {
        setKeySpec(keySpec);
        return this;
    }

    /**
     * <p>
     * The length of the data encryption key. Use <code>AES_128</code> to generate a 128-bit symmetric key, or
     * <code>AES_256</code> to generate a 256-bit symmetric key.
     * </p>
     * 
     * @param keySpec
     *        The length of the data encryption key. Use <code>AES_128</code> to generate a 128-bit symmetric key, or
     *        <code>AES_256</code> to generate a 256-bit symmetric key.
     * @see DataKeySpec
     */

    public void setKeySpec(DataKeySpec keySpec) {
        this.keySpec = keySpec.toString();
    }

    /**
     * <p>
     * The length of the data encryption key. Use <code>AES_128</code> to generate a 128-bit symmetric key, or
     * <code>AES_256</code> to generate a 256-bit symmetric key.
     * </p>
     * 
     * @param keySpec
     *        The length of the data encryption key. Use <code>AES_128</code> to generate a 128-bit symmetric key, or
     *        <code>AES_256</code> to generate a 256-bit symmetric key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataKeySpec
     */

    public GenerateDataKeyWithoutPlaintextRequest withKeySpec(DataKeySpec keySpec) {
        setKeySpec(keySpec);
        return this;
    }

    /**
     * <p>
     * The length of the data encryption key in bytes. For example, use the value 64 to generate a 512-bit data key (64
     * bytes is 512 bits). For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use the
     * <code>KeySpec</code> field instead of this one.
     * </p>
     * 
     * @param numberOfBytes
     *        The length of the data encryption key in bytes. For example, use the value 64 to generate a 512-bit data
     *        key (64 bytes is 512 bits). For common key lengths (128-bit and 256-bit symmetric keys), we recommend that
     *        you use the <code>KeySpec</code> field instead of this one.
     */

    public void setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }

    /**
     * <p>
     * The length of the data encryption key in bytes. For example, use the value 64 to generate a 512-bit data key (64
     * bytes is 512 bits). For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use the
     * <code>KeySpec</code> field instead of this one.
     * </p>
     * 
     * @return The length of the data encryption key in bytes. For example, use the value 64 to generate a 512-bit data
     *         key (64 bytes is 512 bits). For common key lengths (128-bit and 256-bit symmetric keys), we recommend
     *         that you use the <code>KeySpec</code> field instead of this one.
     */

    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

    /**
     * <p>
     * The length of the data encryption key in bytes. For example, use the value 64 to generate a 512-bit data key (64
     * bytes is 512 bits). For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use the
     * <code>KeySpec</code> field instead of this one.
     * </p>
     * 
     * @param numberOfBytes
     *        The length of the data encryption key in bytes. For example, use the value 64 to generate a 512-bit data
     *        key (64 bytes is 512 bits). For common key lengths (128-bit and 256-bit symmetric keys), we recommend that
     *        you use the <code>KeySpec</code> field instead of this one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataKeyWithoutPlaintextRequest withNumberOfBytes(Integer numberOfBytes) {
        setNumberOfBytes(numberOfBytes);
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return A list of grant tokens.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     */

    public java.util.List<String> getGrantTokens() {
        if (grantTokens == null) {
            grantTokens = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return grantTokens;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in
     *        the <i>AWS Key Management Service Developer Guide</i>.
     */

    public void setGrantTokens(java.util.Collection<String> grantTokens) {
        if (grantTokens == null) {
            this.grantTokens = null;
            return;
        }

        this.grantTokens = new com.amazonaws.internal.SdkInternalList<String>(grantTokens);
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGrantTokens(java.util.Collection)} or {@link #withGrantTokens(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in
     *        the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataKeyWithoutPlaintextRequest withGrantTokens(String... grantTokens) {
        if (this.grantTokens == null) {
            setGrantTokens(new com.amazonaws.internal.SdkInternalList<String>(grantTokens.length));
        }
        for (String ele : grantTokens) {
            this.grantTokens.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in
     *        the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataKeyWithoutPlaintextRequest withGrantTokens(java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
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
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getEncryptionContext() != null)
            sb.append("EncryptionContext: ").append(getEncryptionContext()).append(",");
        if (getKeySpec() != null)
            sb.append("KeySpec: ").append(getKeySpec()).append(",");
        if (getNumberOfBytes() != null)
            sb.append("NumberOfBytes: ").append(getNumberOfBytes()).append(",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: ").append(getGrantTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateDataKeyWithoutPlaintextRequest == false)
            return false;
        GenerateDataKeyWithoutPlaintextRequest other = (GenerateDataKeyWithoutPlaintextRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getEncryptionContext() == null ^ this.getEncryptionContext() == null)
            return false;
        if (other.getEncryptionContext() != null && other.getEncryptionContext().equals(this.getEncryptionContext()) == false)
            return false;
        if (other.getKeySpec() == null ^ this.getKeySpec() == null)
            return false;
        if (other.getKeySpec() != null && other.getKeySpec().equals(this.getKeySpec()) == false)
            return false;
        if (other.getNumberOfBytes() == null ^ this.getNumberOfBytes() == null)
            return false;
        if (other.getNumberOfBytes() != null && other.getNumberOfBytes().equals(this.getNumberOfBytes()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null && other.getGrantTokens().equals(this.getGrantTokens()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getEncryptionContext() == null) ? 0 : getEncryptionContext().hashCode());
        hashCode = prime * hashCode + ((getKeySpec() == null) ? 0 : getKeySpec().hashCode());
        hashCode = prime * hashCode + ((getNumberOfBytes() == null) ? 0 : getNumberOfBytes().hashCode());
        hashCode = prime * hashCode + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        return hashCode;
    }

    @Override
    public GenerateDataKeyWithoutPlaintextRequest clone() {
        return (GenerateDataKeyWithoutPlaintextRequest) super.clone();
    }

}
