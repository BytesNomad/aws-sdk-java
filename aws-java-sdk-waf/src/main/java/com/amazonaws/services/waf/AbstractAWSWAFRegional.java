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
package com.amazonaws.services.waf;

import com.amazonaws.services.waf.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSWAFRegional}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSWAFRegional implements AWSWAFRegional {

    protected AbstractAWSWAFRegional() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AssociateWebACLResult associateWebACL(AssociateWebACLRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateByteMatchSetResult createByteMatchSet(CreateByteMatchSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateIPSetResult createIPSet(CreateIPSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateRuleResult createRule(CreateRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSizeConstraintSetResult createSizeConstraintSet(CreateSizeConstraintSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSqlInjectionMatchSetResult createSqlInjectionMatchSet(CreateSqlInjectionMatchSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateWebACLResult createWebACL(CreateWebACLRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateXssMatchSetResult createXssMatchSet(CreateXssMatchSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteByteMatchSetResult deleteByteMatchSet(DeleteByteMatchSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteIPSetResult deleteIPSet(DeleteIPSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRuleResult deleteRule(DeleteRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSizeConstraintSetResult deleteSizeConstraintSet(DeleteSizeConstraintSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSqlInjectionMatchSetResult deleteSqlInjectionMatchSet(DeleteSqlInjectionMatchSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteWebACLResult deleteWebACL(DeleteWebACLRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteXssMatchSetResult deleteXssMatchSet(DeleteXssMatchSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateWebACLResult disassociateWebACL(DisassociateWebACLRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetByteMatchSetResult getByteMatchSet(GetByteMatchSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetChangeTokenResult getChangeToken(GetChangeTokenRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetChangeTokenStatusResult getChangeTokenStatus(GetChangeTokenStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetIPSetResult getIPSet(GetIPSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRuleResult getRule(GetRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSampledRequestsResult getSampledRequests(GetSampledRequestsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSizeConstraintSetResult getSizeConstraintSet(GetSizeConstraintSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSqlInjectionMatchSetResult getSqlInjectionMatchSet(GetSqlInjectionMatchSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetWebACLResult getWebACL(GetWebACLRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetWebACLForResourceResult getWebACLForResource(GetWebACLForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetXssMatchSetResult getXssMatchSet(GetXssMatchSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListByteMatchSetsResult listByteMatchSets(ListByteMatchSetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListIPSetsResult listIPSets(ListIPSetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListResourcesForWebACLResult listResourcesForWebACL(ListResourcesForWebACLRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRulesResult listRules(ListRulesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSizeConstraintSetsResult listSizeConstraintSets(ListSizeConstraintSetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSqlInjectionMatchSetsResult listSqlInjectionMatchSets(ListSqlInjectionMatchSetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListWebACLsResult listWebACLs(ListWebACLsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListXssMatchSetsResult listXssMatchSets(ListXssMatchSetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateByteMatchSetResult updateByteMatchSet(UpdateByteMatchSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateIPSetResult updateIPSet(UpdateIPSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateRuleResult updateRule(UpdateRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateSizeConstraintSetResult updateSizeConstraintSet(UpdateSizeConstraintSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateSqlInjectionMatchSetResult updateSqlInjectionMatchSet(UpdateSqlInjectionMatchSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateWebACLResult updateWebACL(UpdateWebACLRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateXssMatchSetResult updateXssMatchSet(UpdateXssMatchSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
