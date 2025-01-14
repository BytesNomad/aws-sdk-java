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
package com.amazonaws.services.redshift.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * RestoreFromClusterSnapshotRequest Marshaller
 */

public class RestoreFromClusterSnapshotRequestMarshaller implements Marshaller<Request<RestoreFromClusterSnapshotRequest>, RestoreFromClusterSnapshotRequest> {

    public Request<RestoreFromClusterSnapshotRequest> marshall(RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest) {

        if (restoreFromClusterSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RestoreFromClusterSnapshotRequest> request = new DefaultRequest<RestoreFromClusterSnapshotRequest>(restoreFromClusterSnapshotRequest,
                "AmazonRedshift");
        request.addParameter("Action", "RestoreFromClusterSnapshot");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (restoreFromClusterSnapshotRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(restoreFromClusterSnapshotRequest.getClusterIdentifier()));
        }

        if (restoreFromClusterSnapshotRequest.getSnapshotIdentifier() != null) {
            request.addParameter("SnapshotIdentifier", StringUtils.fromString(restoreFromClusterSnapshotRequest.getSnapshotIdentifier()));
        }

        if (restoreFromClusterSnapshotRequest.getSnapshotClusterIdentifier() != null) {
            request.addParameter("SnapshotClusterIdentifier", StringUtils.fromString(restoreFromClusterSnapshotRequest.getSnapshotClusterIdentifier()));
        }

        if (restoreFromClusterSnapshotRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(restoreFromClusterSnapshotRequest.getPort()));
        }

        if (restoreFromClusterSnapshotRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(restoreFromClusterSnapshotRequest.getAvailabilityZone()));
        }

        if (restoreFromClusterSnapshotRequest.getAllowVersionUpgrade() != null) {
            request.addParameter("AllowVersionUpgrade", StringUtils.fromBoolean(restoreFromClusterSnapshotRequest.getAllowVersionUpgrade()));
        }

        if (restoreFromClusterSnapshotRequest.getClusterSubnetGroupName() != null) {
            request.addParameter("ClusterSubnetGroupName", StringUtils.fromString(restoreFromClusterSnapshotRequest.getClusterSubnetGroupName()));
        }

        if (restoreFromClusterSnapshotRequest.getPubliclyAccessible() != null) {
            request.addParameter("PubliclyAccessible", StringUtils.fromBoolean(restoreFromClusterSnapshotRequest.getPubliclyAccessible()));
        }

        if (restoreFromClusterSnapshotRequest.getOwnerAccount() != null) {
            request.addParameter("OwnerAccount", StringUtils.fromString(restoreFromClusterSnapshotRequest.getOwnerAccount()));
        }

        if (restoreFromClusterSnapshotRequest.getHsmClientCertificateIdentifier() != null) {
            request.addParameter("HsmClientCertificateIdentifier",
                    StringUtils.fromString(restoreFromClusterSnapshotRequest.getHsmClientCertificateIdentifier()));
        }

        if (restoreFromClusterSnapshotRequest.getHsmConfigurationIdentifier() != null) {
            request.addParameter("HsmConfigurationIdentifier", StringUtils.fromString(restoreFromClusterSnapshotRequest.getHsmConfigurationIdentifier()));
        }

        if (restoreFromClusterSnapshotRequest.getElasticIp() != null) {
            request.addParameter("ElasticIp", StringUtils.fromString(restoreFromClusterSnapshotRequest.getElasticIp()));
        }

        if (restoreFromClusterSnapshotRequest.getClusterParameterGroupName() != null) {
            request.addParameter("ClusterParameterGroupName", StringUtils.fromString(restoreFromClusterSnapshotRequest.getClusterParameterGroupName()));
        }

        com.amazonaws.internal.SdkInternalList<String> clusterSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) restoreFromClusterSnapshotRequest
                .getClusterSecurityGroups();
        if (!clusterSecurityGroupsList.isEmpty() || !clusterSecurityGroupsList.isAutoConstruct()) {
            int clusterSecurityGroupsListIndex = 1;

            for (String clusterSecurityGroupsListValue : clusterSecurityGroupsList) {
                if (clusterSecurityGroupsListValue != null) {
                    request.addParameter("ClusterSecurityGroups.ClusterSecurityGroupName." + clusterSecurityGroupsListIndex,
                            StringUtils.fromString(clusterSecurityGroupsListValue));
                }
                clusterSecurityGroupsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) restoreFromClusterSnapshotRequest
                .getVpcSecurityGroupIds();
        if (!vpcSecurityGroupIdsList.isEmpty() || !vpcSecurityGroupIdsList.isAutoConstruct()) {
            int vpcSecurityGroupIdsListIndex = 1;

            for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
                if (vpcSecurityGroupIdsListValue != null) {
                    request.addParameter("VpcSecurityGroupIds.VpcSecurityGroupId." + vpcSecurityGroupIdsListIndex,
                            StringUtils.fromString(vpcSecurityGroupIdsListValue));
                }
                vpcSecurityGroupIdsListIndex++;
            }
        }

        if (restoreFromClusterSnapshotRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(restoreFromClusterSnapshotRequest.getPreferredMaintenanceWindow()));
        }

        if (restoreFromClusterSnapshotRequest.getAutomatedSnapshotRetentionPeriod() != null) {
            request.addParameter("AutomatedSnapshotRetentionPeriod",
                    StringUtils.fromInteger(restoreFromClusterSnapshotRequest.getAutomatedSnapshotRetentionPeriod()));
        }

        if (restoreFromClusterSnapshotRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(restoreFromClusterSnapshotRequest.getKmsKeyId()));
        }

        if (restoreFromClusterSnapshotRequest.getNodeType() != null) {
            request.addParameter("NodeType", StringUtils.fromString(restoreFromClusterSnapshotRequest.getNodeType()));
        }

        if (restoreFromClusterSnapshotRequest.getEnhancedVpcRouting() != null) {
            request.addParameter("EnhancedVpcRouting", StringUtils.fromBoolean(restoreFromClusterSnapshotRequest.getEnhancedVpcRouting()));
        }

        if (restoreFromClusterSnapshotRequest.getAdditionalInfo() != null) {
            request.addParameter("AdditionalInfo", StringUtils.fromString(restoreFromClusterSnapshotRequest.getAdditionalInfo()));
        }

        com.amazonaws.internal.SdkInternalList<String> iamRolesList = (com.amazonaws.internal.SdkInternalList<String>) restoreFromClusterSnapshotRequest
                .getIamRoles();
        if (!iamRolesList.isEmpty() || !iamRolesList.isAutoConstruct()) {
            int iamRolesListIndex = 1;

            for (String iamRolesListValue : iamRolesList) {
                if (iamRolesListValue != null) {
                    request.addParameter("IamRoles.IamRoleArn." + iamRolesListIndex, StringUtils.fromString(iamRolesListValue));
                }
                iamRolesListIndex++;
            }
        }

        return request;
    }

}
