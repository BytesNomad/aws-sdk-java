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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateMaintenanceWindowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Maintenance Window.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The schedule of the Maintenance Window in the form of a cron or rate expression.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * The duration of the Maintenance Window in hours.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for
     * execution.
     * </p>
     */
    private Integer cutoff;
    /**
     * <p>
     * Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
     * </p>
     */
    private Boolean allowUnassociatedTargets;
    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the Maintenance Window.
     * </p>
     * 
     * @param name
     *        The name of the Maintenance Window.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Maintenance Window.
     * </p>
     * 
     * @return The name of the Maintenance Window.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Maintenance Window.
     * </p>
     * 
     * @param name
     *        The name of the Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMaintenanceWindowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The schedule of the Maintenance Window in the form of a cron or rate expression.
     * </p>
     * 
     * @param schedule
     *        The schedule of the Maintenance Window in the form of a cron or rate expression.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule of the Maintenance Window in the form of a cron or rate expression.
     * </p>
     * 
     * @return The schedule of the Maintenance Window in the form of a cron or rate expression.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule of the Maintenance Window in the form of a cron or rate expression.
     * </p>
     * 
     * @param schedule
     *        The schedule of the Maintenance Window in the form of a cron or rate expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMaintenanceWindowRequest withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The duration of the Maintenance Window in hours.
     * </p>
     * 
     * @param duration
     *        The duration of the Maintenance Window in hours.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the Maintenance Window in hours.
     * </p>
     * 
     * @return The duration of the Maintenance Window in hours.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the Maintenance Window in hours.
     * </p>
     * 
     * @param duration
     *        The duration of the Maintenance Window in hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMaintenanceWindowRequest withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for
     * execution.
     * </p>
     * 
     * @param cutoff
     *        The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new
     *        tasks for execution.
     */

    public void setCutoff(Integer cutoff) {
        this.cutoff = cutoff;
    }

    /**
     * <p>
     * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for
     * execution.
     * </p>
     * 
     * @return The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new
     *         tasks for execution.
     */

    public Integer getCutoff() {
        return this.cutoff;
    }

    /**
     * <p>
     * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for
     * execution.
     * </p>
     * 
     * @param cutoff
     *        The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new
     *        tasks for execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMaintenanceWindowRequest withCutoff(Integer cutoff) {
        setCutoff(cutoff);
        return this;
    }

    /**
     * <p>
     * Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
     * </p>
     * 
     * @param allowUnassociatedTargets
     *        Whether targets must be registered with the Maintenance Window before tasks can be defined for those
     *        targets.
     */

    public void setAllowUnassociatedTargets(Boolean allowUnassociatedTargets) {
        this.allowUnassociatedTargets = allowUnassociatedTargets;
    }

    /**
     * <p>
     * Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
     * </p>
     * 
     * @return Whether targets must be registered with the Maintenance Window before tasks can be defined for those
     *         targets.
     */

    public Boolean getAllowUnassociatedTargets() {
        return this.allowUnassociatedTargets;
    }

    /**
     * <p>
     * Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
     * </p>
     * 
     * @param allowUnassociatedTargets
     *        Whether targets must be registered with the Maintenance Window before tasks can be defined for those
     *        targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMaintenanceWindowRequest withAllowUnassociatedTargets(Boolean allowUnassociatedTargets) {
        setAllowUnassociatedTargets(allowUnassociatedTargets);
        return this;
    }

    /**
     * <p>
     * Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
     * </p>
     * 
     * @return Whether targets must be registered with the Maintenance Window before tasks can be defined for those
     *         targets.
     */

    public Boolean isAllowUnassociatedTargets() {
        return this.allowUnassociatedTargets;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @param clientToken
     *        User-provided idempotency token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @return User-provided idempotency token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @param clientToken
     *        User-provided idempotency token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMaintenanceWindowRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getCutoff() != null)
            sb.append("Cutoff: ").append(getCutoff()).append(",");
        if (getAllowUnassociatedTargets() != null)
            sb.append("AllowUnassociatedTargets: ").append(getAllowUnassociatedTargets()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMaintenanceWindowRequest == false)
            return false;
        CreateMaintenanceWindowRequest other = (CreateMaintenanceWindowRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getCutoff() == null ^ this.getCutoff() == null)
            return false;
        if (other.getCutoff() != null && other.getCutoff().equals(this.getCutoff()) == false)
            return false;
        if (other.getAllowUnassociatedTargets() == null ^ this.getAllowUnassociatedTargets() == null)
            return false;
        if (other.getAllowUnassociatedTargets() != null && other.getAllowUnassociatedTargets().equals(this.getAllowUnassociatedTargets()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getCutoff() == null) ? 0 : getCutoff().hashCode());
        hashCode = prime * hashCode + ((getAllowUnassociatedTargets() == null) ? 0 : getAllowUnassociatedTargets().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateMaintenanceWindowRequest clone() {
        return (CreateMaintenanceWindowRequest) super.clone();
    }

}
