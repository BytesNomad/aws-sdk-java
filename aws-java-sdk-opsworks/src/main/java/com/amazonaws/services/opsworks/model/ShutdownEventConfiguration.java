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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * The Shutdown event configuration.
 * </p>
 */
public class ShutdownEventConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The time, in seconds, that AWS OpsWorks will wait after triggering a Shutdown event before shutting down an
     * instance.
     * </p>
     */
    private Integer executionTimeout;
    /**
     * <p>
     * Whether to enable Elastic Load Balancing connection draining. For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"
     * >Connection Draining</a>
     * </p>
     */
    private Boolean delayUntilElbConnectionsDrained;

    /**
     * <p>
     * The time, in seconds, that AWS OpsWorks will wait after triggering a Shutdown event before shutting down an
     * instance.
     * </p>
     * 
     * @param executionTimeout
     *        The time, in seconds, that AWS OpsWorks will wait after triggering a Shutdown event before shutting down
     *        an instance.
     */

    public void setExecutionTimeout(Integer executionTimeout) {
        this.executionTimeout = executionTimeout;
    }

    /**
     * <p>
     * The time, in seconds, that AWS OpsWorks will wait after triggering a Shutdown event before shutting down an
     * instance.
     * </p>
     * 
     * @return The time, in seconds, that AWS OpsWorks will wait after triggering a Shutdown event before shutting down
     *         an instance.
     */

    public Integer getExecutionTimeout() {
        return this.executionTimeout;
    }

    /**
     * <p>
     * The time, in seconds, that AWS OpsWorks will wait after triggering a Shutdown event before shutting down an
     * instance.
     * </p>
     * 
     * @param executionTimeout
     *        The time, in seconds, that AWS OpsWorks will wait after triggering a Shutdown event before shutting down
     *        an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShutdownEventConfiguration withExecutionTimeout(Integer executionTimeout) {
        setExecutionTimeout(executionTimeout);
        return this;
    }

    /**
     * <p>
     * Whether to enable Elastic Load Balancing connection draining. For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"
     * >Connection Draining</a>
     * </p>
     * 
     * @param delayUntilElbConnectionsDrained
     *        Whether to enable Elastic Load Balancing connection draining. For more information, see <a href=
     *        "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"
     *        >Connection Draining</a>
     */

    public void setDelayUntilElbConnectionsDrained(Boolean delayUntilElbConnectionsDrained) {
        this.delayUntilElbConnectionsDrained = delayUntilElbConnectionsDrained;
    }

    /**
     * <p>
     * Whether to enable Elastic Load Balancing connection draining. For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"
     * >Connection Draining</a>
     * </p>
     * 
     * @return Whether to enable Elastic Load Balancing connection draining. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"
     *         >Connection Draining</a>
     */

    public Boolean getDelayUntilElbConnectionsDrained() {
        return this.delayUntilElbConnectionsDrained;
    }

    /**
     * <p>
     * Whether to enable Elastic Load Balancing connection draining. For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"
     * >Connection Draining</a>
     * </p>
     * 
     * @param delayUntilElbConnectionsDrained
     *        Whether to enable Elastic Load Balancing connection draining. For more information, see <a href=
     *        "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"
     *        >Connection Draining</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShutdownEventConfiguration withDelayUntilElbConnectionsDrained(Boolean delayUntilElbConnectionsDrained) {
        setDelayUntilElbConnectionsDrained(delayUntilElbConnectionsDrained);
        return this;
    }

    /**
     * <p>
     * Whether to enable Elastic Load Balancing connection draining. For more information, see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"
     * >Connection Draining</a>
     * </p>
     * 
     * @return Whether to enable Elastic Load Balancing connection draining. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain"
     *         >Connection Draining</a>
     */

    public Boolean isDelayUntilElbConnectionsDrained() {
        return this.delayUntilElbConnectionsDrained;
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
        if (getExecutionTimeout() != null)
            sb.append("ExecutionTimeout: ").append(getExecutionTimeout()).append(",");
        if (getDelayUntilElbConnectionsDrained() != null)
            sb.append("DelayUntilElbConnectionsDrained: ").append(getDelayUntilElbConnectionsDrained());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShutdownEventConfiguration == false)
            return false;
        ShutdownEventConfiguration other = (ShutdownEventConfiguration) obj;
        if (other.getExecutionTimeout() == null ^ this.getExecutionTimeout() == null)
            return false;
        if (other.getExecutionTimeout() != null && other.getExecutionTimeout().equals(this.getExecutionTimeout()) == false)
            return false;
        if (other.getDelayUntilElbConnectionsDrained() == null ^ this.getDelayUntilElbConnectionsDrained() == null)
            return false;
        if (other.getDelayUntilElbConnectionsDrained() != null
                && other.getDelayUntilElbConnectionsDrained().equals(this.getDelayUntilElbConnectionsDrained()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionTimeout() == null) ? 0 : getExecutionTimeout().hashCode());
        hashCode = prime * hashCode + ((getDelayUntilElbConnectionsDrained() == null) ? 0 : getDelayUntilElbConnectionsDrained().hashCode());
        return hashCode;
    }

    @Override
    public ShutdownEventConfiguration clone() {
        try {
            return (ShutdownEventConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
