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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * 
 */
public class SegmentResponse implements Serializable, Cloneable {

    /** The ID of the application to which the segment applies. */
    private String applicationId;
    /** The date the segment was created in ISO 8601 format. */
    private String creationDate;
    /** The segment dimensions attributes. */
    private SegmentDimensions dimensions;
    /** The unique segment ID. */
    private String id;
    /** The import job settings. */
    private SegmentImportResource importDefinition;
    /** The date the segment was last updated in ISO 8601 format. */
    private String lastModifiedDate;
    /** The name of segment */
    private String name;
    /**
     * The segment type: DIMENSIONAL – A dynamic segment built from selection criteria based on endpoint data reported
     * by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by
     * making a POST request to the segments resource. IMPORT – A static segment built from an imported set of endpoint
     * definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a
     * POST request to the jobs/import resource.
     */
    private String segmentType;
    /** The segment version number. */
    private Integer version;

    /**
     * The ID of the application to which the segment applies.
     * 
     * @param applicationId
     *        The ID of the application to which the segment applies.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The ID of the application to which the segment applies.
     * 
     * @return The ID of the application to which the segment applies.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The ID of the application to which the segment applies.
     * 
     * @param applicationId
     *        The ID of the application to which the segment applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * The date the segment was created in ISO 8601 format.
     * 
     * @param creationDate
     *        The date the segment was created in ISO 8601 format.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * The date the segment was created in ISO 8601 format.
     * 
     * @return The date the segment was created in ISO 8601 format.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * The date the segment was created in ISO 8601 format.
     * 
     * @param creationDate
     *        The date the segment was created in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * The segment dimensions attributes.
     * 
     * @param dimensions
     *        The segment dimensions attributes.
     */

    public void setDimensions(SegmentDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * The segment dimensions attributes.
     * 
     * @return The segment dimensions attributes.
     */

    public SegmentDimensions getDimensions() {
        return this.dimensions;
    }

    /**
     * The segment dimensions attributes.
     * 
     * @param dimensions
     *        The segment dimensions attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withDimensions(SegmentDimensions dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * The unique segment ID.
     * 
     * @param id
     *        The unique segment ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique segment ID.
     * 
     * @return The unique segment ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The unique segment ID.
     * 
     * @param id
     *        The unique segment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The import job settings.
     * 
     * @param importDefinition
     *        The import job settings.
     */

    public void setImportDefinition(SegmentImportResource importDefinition) {
        this.importDefinition = importDefinition;
    }

    /**
     * The import job settings.
     * 
     * @return The import job settings.
     */

    public SegmentImportResource getImportDefinition() {
        return this.importDefinition;
    }

    /**
     * The import job settings.
     * 
     * @param importDefinition
     *        The import job settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withImportDefinition(SegmentImportResource importDefinition) {
        setImportDefinition(importDefinition);
        return this;
    }

    /**
     * The date the segment was last updated in ISO 8601 format.
     * 
     * @param lastModifiedDate
     *        The date the segment was last updated in ISO 8601 format.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * The date the segment was last updated in ISO 8601 format.
     * 
     * @return The date the segment was last updated in ISO 8601 format.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * The date the segment was last updated in ISO 8601 format.
     * 
     * @param lastModifiedDate
     *        The date the segment was last updated in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * The name of segment
     * 
     * @param name
     *        The name of segment
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of segment
     * 
     * @return The name of segment
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of segment
     * 
     * @param name
     *        The name of segment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The segment type: DIMENSIONAL – A dynamic segment built from selection criteria based on endpoint data reported
     * by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by
     * making a POST request to the segments resource. IMPORT – A static segment built from an imported set of endpoint
     * definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a
     * POST request to the jobs/import resource.
     * 
     * @param segmentType
     *        The segment type: DIMENSIONAL – A dynamic segment built from selection criteria based on endpoint data
     *        reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint
     *        console or by making a POST request to the segments resource. IMPORT – A static segment built from an
     *        imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon
     *        Pinpoint console or by making a POST request to the jobs/import resource.
     * @see SegmentType
     */

    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }

    /**
     * The segment type: DIMENSIONAL – A dynamic segment built from selection criteria based on endpoint data reported
     * by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by
     * making a POST request to the segments resource. IMPORT – A static segment built from an imported set of endpoint
     * definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a
     * POST request to the jobs/import resource.
     * 
     * @return The segment type: DIMENSIONAL – A dynamic segment built from selection criteria based on endpoint data
     *         reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint
     *         console or by making a POST request to the segments resource. IMPORT – A static segment built from an
     *         imported set of endpoint definitions. You create this type of segment by importing a segment in the
     *         Amazon Pinpoint console or by making a POST request to the jobs/import resource.
     * @see SegmentType
     */

    public String getSegmentType() {
        return this.segmentType;
    }

    /**
     * The segment type: DIMENSIONAL – A dynamic segment built from selection criteria based on endpoint data reported
     * by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by
     * making a POST request to the segments resource. IMPORT – A static segment built from an imported set of endpoint
     * definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a
     * POST request to the jobs/import resource.
     * 
     * @param segmentType
     *        The segment type: DIMENSIONAL – A dynamic segment built from selection criteria based on endpoint data
     *        reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint
     *        console or by making a POST request to the segments resource. IMPORT – A static segment built from an
     *        imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon
     *        Pinpoint console or by making a POST request to the jobs/import resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentType
     */

    public SegmentResponse withSegmentType(String segmentType) {
        setSegmentType(segmentType);
        return this;
    }

    /**
     * The segment type: DIMENSIONAL – A dynamic segment built from selection criteria based on endpoint data reported
     * by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by
     * making a POST request to the segments resource. IMPORT – A static segment built from an imported set of endpoint
     * definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a
     * POST request to the jobs/import resource.
     * 
     * @param segmentType
     *        The segment type: DIMENSIONAL – A dynamic segment built from selection criteria based on endpoint data
     *        reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint
     *        console or by making a POST request to the segments resource. IMPORT – A static segment built from an
     *        imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon
     *        Pinpoint console or by making a POST request to the jobs/import resource.
     * @see SegmentType
     */

    public void setSegmentType(SegmentType segmentType) {
        this.segmentType = segmentType.toString();
    }

    /**
     * The segment type: DIMENSIONAL – A dynamic segment built from selection criteria based on endpoint data reported
     * by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by
     * making a POST request to the segments resource. IMPORT – A static segment built from an imported set of endpoint
     * definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a
     * POST request to the jobs/import resource.
     * 
     * @param segmentType
     *        The segment type: DIMENSIONAL – A dynamic segment built from selection criteria based on endpoint data
     *        reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint
     *        console or by making a POST request to the segments resource. IMPORT – A static segment built from an
     *        imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon
     *        Pinpoint console or by making a POST request to the jobs/import resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentType
     */

    public SegmentResponse withSegmentType(SegmentType segmentType) {
        setSegmentType(segmentType);
        return this;
    }

    /**
     * The segment version number.
     * 
     * @param version
     *        The segment version number.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * The segment version number.
     * 
     * @return The segment version number.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * The segment version number.
     * 
     * @param version
     *        The segment version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentResponse withVersion(Integer version) {
        setVersion(version);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getImportDefinition() != null)
            sb.append("ImportDefinition: ").append(getImportDefinition()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSegmentType() != null)
            sb.append("SegmentType: ").append(getSegmentType()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentResponse == false)
            return false;
        SegmentResponse other = (SegmentResponse) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getImportDefinition() == null ^ this.getImportDefinition() == null)
            return false;
        if (other.getImportDefinition() != null && other.getImportDefinition().equals(this.getImportDefinition()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSegmentType() == null ^ this.getSegmentType() == null)
            return false;
        if (other.getSegmentType() != null && other.getSegmentType().equals(this.getSegmentType()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getImportDefinition() == null) ? 0 : getImportDefinition().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSegmentType() == null) ? 0 : getSegmentType().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public SegmentResponse clone() {
        try {
            return (SegmentResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
