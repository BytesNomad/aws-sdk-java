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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * <p>
 * The Unix file permissions and ownership information assigned, by default, to native S3 objects when Storage Gateway
 * discovers them in S3 buckets.
 * </p>
 */
public class NFSFileShareInfo implements Serializable, Cloneable {

    private NFSFileShareDefaults nFSFileShareDefaults;

    private String fileShareARN;

    private String fileShareId;

    private String fileShareStatus;

    private String gatewayARN;
    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own KMS key, or false to use a key managed by Amazon S3.
     * Optional.
     * </p>
     */
    private Boolean kMSEncrypted;

    private String kMSKey;

    private String path;

    private String role;

    private String locationARN;
    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     */
    private String defaultStorageClass;

    /**
     * @param nFSFileShareDefaults
     */

    public void setNFSFileShareDefaults(NFSFileShareDefaults nFSFileShareDefaults) {
        this.nFSFileShareDefaults = nFSFileShareDefaults;
    }

    /**
     * @return
     */

    public NFSFileShareDefaults getNFSFileShareDefaults() {
        return this.nFSFileShareDefaults;
    }

    /**
     * @param nFSFileShareDefaults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withNFSFileShareDefaults(NFSFileShareDefaults nFSFileShareDefaults) {
        setNFSFileShareDefaults(nFSFileShareDefaults);
        return this;
    }

    /**
     * @param fileShareARN
     */

    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * @return
     */

    public String getFileShareARN() {
        return this.fileShareARN;
    }

    /**
     * @param fileShareARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withFileShareARN(String fileShareARN) {
        setFileShareARN(fileShareARN);
        return this;
    }

    /**
     * @param fileShareId
     */

    public void setFileShareId(String fileShareId) {
        this.fileShareId = fileShareId;
    }

    /**
     * @return
     */

    public String getFileShareId() {
        return this.fileShareId;
    }

    /**
     * @param fileShareId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withFileShareId(String fileShareId) {
        setFileShareId(fileShareId);
        return this;
    }

    /**
     * @param fileShareStatus
     */

    public void setFileShareStatus(String fileShareStatus) {
        this.fileShareStatus = fileShareStatus;
    }

    /**
     * @return
     */

    public String getFileShareStatus() {
        return this.fileShareStatus;
    }

    /**
     * @param fileShareStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withFileShareStatus(String fileShareStatus) {
        setFileShareStatus(fileShareStatus);
        return this;
    }

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own KMS key, or false to use a key managed by Amazon S3.
     * Optional.
     * </p>
     * 
     * @param kMSEncrypted
     *        True to use Amazon S3 server side encryption with your own KMS key, or false to use a key managed by
     *        Amazon S3. Optional.
     */

    public void setKMSEncrypted(Boolean kMSEncrypted) {
        this.kMSEncrypted = kMSEncrypted;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own KMS key, or false to use a key managed by Amazon S3.
     * Optional.
     * </p>
     * 
     * @return True to use Amazon S3 server side encryption with your own KMS key, or false to use a key managed by
     *         Amazon S3. Optional.
     */

    public Boolean getKMSEncrypted() {
        return this.kMSEncrypted;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own KMS key, or false to use a key managed by Amazon S3.
     * Optional.
     * </p>
     * 
     * @param kMSEncrypted
     *        True to use Amazon S3 server side encryption with your own KMS key, or false to use a key managed by
     *        Amazon S3. Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withKMSEncrypted(Boolean kMSEncrypted) {
        setKMSEncrypted(kMSEncrypted);
        return this;
    }

    /**
     * <p>
     * True to use Amazon S3 server side encryption with your own KMS key, or false to use a key managed by Amazon S3.
     * Optional.
     * </p>
     * 
     * @return True to use Amazon S3 server side encryption with your own KMS key, or false to use a key managed by
     *         Amazon S3. Optional.
     */

    public Boolean isKMSEncrypted() {
        return this.kMSEncrypted;
    }

    /**
     * @param kMSKey
     */

    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * @return
     */

    public String getKMSKey() {
        return this.kMSKey;
    }

    /**
     * @param kMSKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withKMSKey(String kMSKey) {
        setKMSKey(kMSKey);
        return this;
    }

    /**
     * @param path
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return
     */

    public String getPath() {
        return this.path;
    }

    /**
     * @param path
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * @param role
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return
     */

    public String getRole() {
        return this.role;
    }

    /**
     * @param role
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * @param locationARN
     */

    public void setLocationARN(String locationARN) {
        this.locationARN = locationARN;
    }

    /**
     * @return
     */

    public String getLocationARN() {
        return this.locationARN;
    }

    /**
     * @param locationARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withLocationARN(String locationARN) {
        setLocationARN(locationARN);
        return this;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     * 
     * @param defaultStorageClass
     *        The default storage class for objects put into an Amazon S3 bucket by file gateway. Possible values are
     *        S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used.
     *        Optional.
     */

    public void setDefaultStorageClass(String defaultStorageClass) {
        this.defaultStorageClass = defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     * 
     * @return The default storage class for objects put into an Amazon S3 bucket by file gateway. Possible values are
     *         S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used.
     *         Optional.
     */

    public String getDefaultStorageClass() {
        return this.defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by file gateway. Possible values are
     * S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used. Optional.
     * </p>
     * 
     * @param defaultStorageClass
     *        The default storage class for objects put into an Amazon S3 bucket by file gateway. Possible values are
     *        S3_STANDARD or S3_STANDARD_IA. If this field is not populated, the default value S3_STANDARD is used.
     *        Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NFSFileShareInfo withDefaultStorageClass(String defaultStorageClass) {
        setDefaultStorageClass(defaultStorageClass);
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
        if (getNFSFileShareDefaults() != null)
            sb.append("NFSFileShareDefaults: ").append(getNFSFileShareDefaults()).append(",");
        if (getFileShareARN() != null)
            sb.append("FileShareARN: ").append(getFileShareARN()).append(",");
        if (getFileShareId() != null)
            sb.append("FileShareId: ").append(getFileShareId()).append(",");
        if (getFileShareStatus() != null)
            sb.append("FileShareStatus: ").append(getFileShareStatus()).append(",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: ").append(getKMSEncrypted()).append(",");
        if (getKMSKey() != null)
            sb.append("KMSKey: ").append(getKMSKey()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getLocationARN() != null)
            sb.append("LocationARN: ").append(getLocationARN()).append(",");
        if (getDefaultStorageClass() != null)
            sb.append("DefaultStorageClass: ").append(getDefaultStorageClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NFSFileShareInfo == false)
            return false;
        NFSFileShareInfo other = (NFSFileShareInfo) obj;
        if (other.getNFSFileShareDefaults() == null ^ this.getNFSFileShareDefaults() == null)
            return false;
        if (other.getNFSFileShareDefaults() != null && other.getNFSFileShareDefaults().equals(this.getNFSFileShareDefaults()) == false)
            return false;
        if (other.getFileShareARN() == null ^ this.getFileShareARN() == null)
            return false;
        if (other.getFileShareARN() != null && other.getFileShareARN().equals(this.getFileShareARN()) == false)
            return false;
        if (other.getFileShareId() == null ^ this.getFileShareId() == null)
            return false;
        if (other.getFileShareId() != null && other.getFileShareId().equals(this.getFileShareId()) == false)
            return false;
        if (other.getFileShareStatus() == null ^ this.getFileShareStatus() == null)
            return false;
        if (other.getFileShareStatus() != null && other.getFileShareStatus().equals(this.getFileShareStatus()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getKMSEncrypted() == null ^ this.getKMSEncrypted() == null)
            return false;
        if (other.getKMSEncrypted() != null && other.getKMSEncrypted().equals(this.getKMSEncrypted()) == false)
            return false;
        if (other.getKMSKey() == null ^ this.getKMSKey() == null)
            return false;
        if (other.getKMSKey() != null && other.getKMSKey().equals(this.getKMSKey()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getLocationARN() == null ^ this.getLocationARN() == null)
            return false;
        if (other.getLocationARN() != null && other.getLocationARN().equals(this.getLocationARN()) == false)
            return false;
        if (other.getDefaultStorageClass() == null ^ this.getDefaultStorageClass() == null)
            return false;
        if (other.getDefaultStorageClass() != null && other.getDefaultStorageClass().equals(this.getDefaultStorageClass()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNFSFileShareDefaults() == null) ? 0 : getNFSFileShareDefaults().hashCode());
        hashCode = prime * hashCode + ((getFileShareARN() == null) ? 0 : getFileShareARN().hashCode());
        hashCode = prime * hashCode + ((getFileShareId() == null) ? 0 : getFileShareId().hashCode());
        hashCode = prime * hashCode + ((getFileShareStatus() == null) ? 0 : getFileShareStatus().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getLocationARN() == null) ? 0 : getLocationARN().hashCode());
        hashCode = prime * hashCode + ((getDefaultStorageClass() == null) ? 0 : getDefaultStorageClass().hashCode());
        return hashCode;
    }

    @Override
    public NFSFileShareInfo clone() {
        try {
            return (NFSFileShareInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
