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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an instance export task.
 * </p>
 */
public class ExportTask implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the export task.
     * </p>
     */
    private String exportTaskId;
    /**
     * <p>
     * A description of the resource being exported.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The state of the export task.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The status message related to the export task.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Information about the instance to export.
     * </p>
     */
    private InstanceExportDetails instanceExportDetails;
    /**
     * <p>
     * Information about the export task.
     * </p>
     */
    private ExportToS3Task exportToS3Task;

    /**
     * <p>
     * The ID of the export task.
     * </p>
     * 
     * @param exportTaskId
     *        The ID of the export task.
     */

    public void setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
    }

    /**
     * <p>
     * The ID of the export task.
     * </p>
     * 
     * @return The ID of the export task.
     */

    public String getExportTaskId() {
        return this.exportTaskId;
    }

    /**
     * <p>
     * The ID of the export task.
     * </p>
     * 
     * @param exportTaskId
     *        The ID of the export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withExportTaskId(String exportTaskId) {
        setExportTaskId(exportTaskId);
        return this;
    }

    /**
     * <p>
     * A description of the resource being exported.
     * </p>
     * 
     * @param description
     *        A description of the resource being exported.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the resource being exported.
     * </p>
     * 
     * @return A description of the resource being exported.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the resource being exported.
     * </p>
     * 
     * @param description
     *        A description of the resource being exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The state of the export task.
     * </p>
     * 
     * @param state
     *        The state of the export task.
     * @see ExportTaskState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the export task.
     * </p>
     * 
     * @return The state of the export task.
     * @see ExportTaskState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the export task.
     * </p>
     * 
     * @param state
     *        The state of the export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportTaskState
     */

    public ExportTask withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the export task.
     * </p>
     * 
     * @param state
     *        The state of the export task.
     * @see ExportTaskState
     */

    public void setState(ExportTaskState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the export task.
     * </p>
     * 
     * @param state
     *        The state of the export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportTaskState
     */

    public ExportTask withState(ExportTaskState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The status message related to the export task.
     * </p>
     * 
     * @param statusMessage
     *        The status message related to the export task.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message related to the export task.
     * </p>
     * 
     * @return The status message related to the export task.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message related to the export task.
     * </p>
     * 
     * @param statusMessage
     *        The status message related to the export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Information about the instance to export.
     * </p>
     * 
     * @param instanceExportDetails
     *        Information about the instance to export.
     */

    public void setInstanceExportDetails(InstanceExportDetails instanceExportDetails) {
        this.instanceExportDetails = instanceExportDetails;
    }

    /**
     * <p>
     * Information about the instance to export.
     * </p>
     * 
     * @return Information about the instance to export.
     */

    public InstanceExportDetails getInstanceExportDetails() {
        return this.instanceExportDetails;
    }

    /**
     * <p>
     * Information about the instance to export.
     * </p>
     * 
     * @param instanceExportDetails
     *        Information about the instance to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withInstanceExportDetails(InstanceExportDetails instanceExportDetails) {
        setInstanceExportDetails(instanceExportDetails);
        return this;
    }

    /**
     * <p>
     * Information about the export task.
     * </p>
     * 
     * @param exportToS3Task
     *        Information about the export task.
     */

    public void setExportToS3Task(ExportToS3Task exportToS3Task) {
        this.exportToS3Task = exportToS3Task;
    }

    /**
     * <p>
     * Information about the export task.
     * </p>
     * 
     * @return Information about the export task.
     */

    public ExportToS3Task getExportToS3Task() {
        return this.exportToS3Task;
    }

    /**
     * <p>
     * Information about the export task.
     * </p>
     * 
     * @param exportToS3Task
     *        Information about the export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTask withExportToS3Task(ExportToS3Task exportToS3Task) {
        setExportToS3Task(exportToS3Task);
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
        if (getExportTaskId() != null)
            sb.append("ExportTaskId: ").append(getExportTaskId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getInstanceExportDetails() != null)
            sb.append("InstanceExportDetails: ").append(getInstanceExportDetails()).append(",");
        if (getExportToS3Task() != null)
            sb.append("ExportToS3Task: ").append(getExportToS3Task());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTask == false)
            return false;
        ExportTask other = (ExportTask) obj;
        if (other.getExportTaskId() == null ^ this.getExportTaskId() == null)
            return false;
        if (other.getExportTaskId() != null && other.getExportTaskId().equals(this.getExportTaskId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getInstanceExportDetails() == null ^ this.getInstanceExportDetails() == null)
            return false;
        if (other.getInstanceExportDetails() != null && other.getInstanceExportDetails().equals(this.getInstanceExportDetails()) == false)
            return false;
        if (other.getExportToS3Task() == null ^ this.getExportToS3Task() == null)
            return false;
        if (other.getExportToS3Task() != null && other.getExportToS3Task().equals(this.getExportToS3Task()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportTaskId() == null) ? 0 : getExportTaskId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getInstanceExportDetails() == null) ? 0 : getInstanceExportDetails().hashCode());
        hashCode = prime * hashCode + ((getExportToS3Task() == null) ? 0 : getExportToS3Task().hashCode());
        return hashCode;
    }

    @Override
    public ExportTask clone() {
        try {
            return (ExportTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
