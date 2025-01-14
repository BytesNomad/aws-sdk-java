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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an SSM document.
 * </p>
 */
public class DocumentDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The SHA1 hash of the document, which you can use for verification purposes.
     * </p>
     */
    private String sha1;
    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     */
    private String hash;
    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     */
    private String hashType;
    /**
     * <p>
     * The name of the SSM document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The AWS user account of the person who created the document.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The date when the SSM document was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The status of the SSM document.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The document version.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * A description of the document.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A description of the parameters for a document.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DocumentParameter> parameters;
    /**
     * <p>
     * The list of OS platforms compatible with this SSM document.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> platformTypes;
    /**
     * <p>
     * The type of document.
     * </p>
     */
    private String documentType;
    /**
     * <p>
     * The schema version.
     * </p>
     */
    private String schemaVersion;
    /**
     * <p>
     * The latest version of the document.
     * </p>
     */
    private String latestVersion;
    /**
     * <p>
     * The default version.
     * </p>
     */
    private String defaultVersion;

    /**
     * <p>
     * The SHA1 hash of the document, which you can use for verification purposes.
     * </p>
     * 
     * @param sha1
     *        The SHA1 hash of the document, which you can use for verification purposes.
     */

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    /**
     * <p>
     * The SHA1 hash of the document, which you can use for verification purposes.
     * </p>
     * 
     * @return The SHA1 hash of the document, which you can use for verification purposes.
     */

    public String getSha1() {
        return this.sha1;
    }

    /**
     * <p>
     * The SHA1 hash of the document, which you can use for verification purposes.
     * </p>
     * 
     * @param sha1
     *        The SHA1 hash of the document, which you can use for verification purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDescription withSha1(String sha1) {
        setSha1(sha1);
        return this;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param hash
     *        The Sha256 or Sha1 hash created by the system when the document was created. </p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     */

    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @return The Sha256 or Sha1 hash created by the system when the document was created. </p> <note>
     *         <p>
     *         Sha1 hashes have been deprecated.
     *         </p>
     */

    public String getHash() {
        return this.hash;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param hash
     *        The Sha256 or Sha1 hash created by the system when the document was created. </p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDescription withHash(String hash) {
        setHash(hash);
        return this;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param hashType
     *        Sha256 or Sha1.</p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @see DocumentHashType
     */

    public void setHashType(String hashType) {
        this.hashType = hashType;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @return Sha256 or Sha1.</p> <note>
     *         <p>
     *         Sha1 hashes have been deprecated.
     *         </p>
     * @see DocumentHashType
     */

    public String getHashType() {
        return this.hashType;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param hashType
     *        Sha256 or Sha1.</p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentHashType
     */

    public DocumentDescription withHashType(String hashType) {
        setHashType(hashType);
        return this;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param hashType
     *        Sha256 or Sha1.</p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @see DocumentHashType
     */

    public void setHashType(DocumentHashType hashType) {
        this.hashType = hashType.toString();
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * 
     * @param hashType
     *        Sha256 or Sha1.</p> <note>
     *        <p>
     *        Sha1 hashes have been deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentHashType
     */

    public DocumentDescription withHashType(DocumentHashType hashType) {
        setHashType(hashType);
        return this;
    }

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @param name
     *        The name of the SSM document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @return The name of the SSM document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @param name
     *        The name of the SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The AWS user account of the person who created the document.
     * </p>
     * 
     * @param owner
     *        The AWS user account of the person who created the document.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The AWS user account of the person who created the document.
     * </p>
     * 
     * @return The AWS user account of the person who created the document.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The AWS user account of the person who created the document.
     * </p>
     * 
     * @param owner
     *        The AWS user account of the person who created the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDescription withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The date when the SSM document was created.
     * </p>
     * 
     * @param createdDate
     *        The date when the SSM document was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date when the SSM document was created.
     * </p>
     * 
     * @return The date when the SSM document was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date when the SSM document was created.
     * </p>
     * 
     * @param createdDate
     *        The date when the SSM document was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDescription withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The status of the SSM document.
     * </p>
     * 
     * @param status
     *        The status of the SSM document.
     * @see DocumentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the SSM document.
     * </p>
     * 
     * @return The status of the SSM document.
     * @see DocumentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the SSM document.
     * </p>
     * 
     * @param status
     *        The status of the SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentStatus
     */

    public DocumentDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the SSM document.
     * </p>
     * 
     * @param status
     *        The status of the SSM document.
     * @see DocumentStatus
     */

    public void setStatus(DocumentStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the SSM document.
     * </p>
     * 
     * @param status
     *        The status of the SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentStatus
     */

    public DocumentDescription withStatus(DocumentStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * 
     * @param documentVersion
     *        The document version.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * 
     * @return The document version.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * 
     * @param documentVersion
     *        The document version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDescription withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * A description of the document.
     * </p>
     * 
     * @param description
     *        A description of the document.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the document.
     * </p>
     * 
     * @return A description of the document.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the document.
     * </p>
     * 
     * @param description
     *        A description of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A description of the parameters for a document.
     * </p>
     * 
     * @return A description of the parameters for a document.
     */

    public java.util.List<DocumentParameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<DocumentParameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * A description of the parameters for a document.
     * </p>
     * 
     * @param parameters
     *        A description of the parameters for a document.
     */

    public void setParameters(java.util.Collection<DocumentParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new com.amazonaws.internal.SdkInternalList<DocumentParameter>(parameters);
    }

    /**
     * <p>
     * A description of the parameters for a document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        A description of the parameters for a document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDescription withParameters(DocumentParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new com.amazonaws.internal.SdkInternalList<DocumentParameter>(parameters.length));
        }
        for (DocumentParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A description of the parameters for a document.
     * </p>
     * 
     * @param parameters
     *        A description of the parameters for a document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDescription withParameters(java.util.Collection<DocumentParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The list of OS platforms compatible with this SSM document.
     * </p>
     * 
     * @return The list of OS platforms compatible with this SSM document.
     * @see PlatformType
     */

    public java.util.List<String> getPlatformTypes() {
        if (platformTypes == null) {
            platformTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return platformTypes;
    }

    /**
     * <p>
     * The list of OS platforms compatible with this SSM document.
     * </p>
     * 
     * @param platformTypes
     *        The list of OS platforms compatible with this SSM document.
     * @see PlatformType
     */

    public void setPlatformTypes(java.util.Collection<String> platformTypes) {
        if (platformTypes == null) {
            this.platformTypes = null;
            return;
        }

        this.platformTypes = new com.amazonaws.internal.SdkInternalList<String>(platformTypes);
    }

    /**
     * <p>
     * The list of OS platforms compatible with this SSM document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatformTypes(java.util.Collection)} or {@link #withPlatformTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param platformTypes
     *        The list of OS platforms compatible with this SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public DocumentDescription withPlatformTypes(String... platformTypes) {
        if (this.platformTypes == null) {
            setPlatformTypes(new com.amazonaws.internal.SdkInternalList<String>(platformTypes.length));
        }
        for (String ele : platformTypes) {
            this.platformTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of OS platforms compatible with this SSM document.
     * </p>
     * 
     * @param platformTypes
     *        The list of OS platforms compatible with this SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public DocumentDescription withPlatformTypes(java.util.Collection<String> platformTypes) {
        setPlatformTypes(platformTypes);
        return this;
    }

    /**
     * <p>
     * The list of OS platforms compatible with this SSM document.
     * </p>
     * 
     * @param platformTypes
     *        The list of OS platforms compatible with this SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public DocumentDescription withPlatformTypes(PlatformType... platformTypes) {
        com.amazonaws.internal.SdkInternalList<String> platformTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(platformTypes.length);
        for (PlatformType value : platformTypes) {
            platformTypesCopy.add(value.toString());
        }
        if (getPlatformTypes() == null) {
            setPlatformTypes(platformTypesCopy);
        } else {
            getPlatformTypes().addAll(platformTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * 
     * @param documentType
     *        The type of document.
     * @see DocumentType
     */

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * 
     * @return The type of document.
     * @see DocumentType
     */

    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * 
     * @param documentType
     *        The type of document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentType
     */

    public DocumentDescription withDocumentType(String documentType) {
        setDocumentType(documentType);
        return this;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * 
     * @param documentType
     *        The type of document.
     * @see DocumentType
     */

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType.toString();
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * 
     * @param documentType
     *        The type of document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentType
     */

    public DocumentDescription withDocumentType(DocumentType documentType) {
        setDocumentType(documentType);
        return this;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version.
     */

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * 
     * @return The schema version.
     */

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDescription withSchemaVersion(String schemaVersion) {
        setSchemaVersion(schemaVersion);
        return this;
    }

    /**
     * <p>
     * The latest version of the document.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the document.
     */

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * <p>
     * The latest version of the document.
     * </p>
     * 
     * @return The latest version of the document.
     */

    public String getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * <p>
     * The latest version of the document.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDescription withLatestVersion(String latestVersion) {
        setLatestVersion(latestVersion);
        return this;
    }

    /**
     * <p>
     * The default version.
     * </p>
     * 
     * @param defaultVersion
     *        The default version.
     */

    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    /**
     * <p>
     * The default version.
     * </p>
     * 
     * @return The default version.
     */

    public String getDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * <p>
     * The default version.
     * </p>
     * 
     * @param defaultVersion
     *        The default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDescription withDefaultVersion(String defaultVersion) {
        setDefaultVersion(defaultVersion);
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
        if (getSha1() != null)
            sb.append("Sha1: ").append(getSha1()).append(",");
        if (getHash() != null)
            sb.append("Hash: ").append(getHash()).append(",");
        if (getHashType() != null)
            sb.append("HashType: ").append(getHashType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getPlatformTypes() != null)
            sb.append("PlatformTypes: ").append(getPlatformTypes()).append(",");
        if (getDocumentType() != null)
            sb.append("DocumentType: ").append(getDocumentType()).append(",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion()).append(",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: ").append(getLatestVersion()).append(",");
        if (getDefaultVersion() != null)
            sb.append("DefaultVersion: ").append(getDefaultVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentDescription == false)
            return false;
        DocumentDescription other = (DocumentDescription) obj;
        if (other.getSha1() == null ^ this.getSha1() == null)
            return false;
        if (other.getSha1() != null && other.getSha1().equals(this.getSha1()) == false)
            return false;
        if (other.getHash() == null ^ this.getHash() == null)
            return false;
        if (other.getHash() != null && other.getHash().equals(this.getHash()) == false)
            return false;
        if (other.getHashType() == null ^ this.getHashType() == null)
            return false;
        if (other.getHashType() != null && other.getHashType().equals(this.getHashType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getPlatformTypes() == null ^ this.getPlatformTypes() == null)
            return false;
        if (other.getPlatformTypes() != null && other.getPlatformTypes().equals(this.getPlatformTypes()) == false)
            return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null)
            return false;
        if (other.getDocumentType() != null && other.getDocumentType().equals(this.getDocumentType()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getDefaultVersion() == null ^ this.getDefaultVersion() == null)
            return false;
        if (other.getDefaultVersion() != null && other.getDefaultVersion().equals(this.getDefaultVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSha1() == null) ? 0 : getSha1().hashCode());
        hashCode = prime * hashCode + ((getHash() == null) ? 0 : getHash().hashCode());
        hashCode = prime * hashCode + ((getHashType() == null) ? 0 : getHashType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getPlatformTypes() == null) ? 0 : getPlatformTypes().hashCode());
        hashCode = prime * hashCode + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersion() == null) ? 0 : getDefaultVersion().hashCode());
        return hashCode;
    }

    @Override
    public DocumentDescription clone() {
        try {
            return (DocumentDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
