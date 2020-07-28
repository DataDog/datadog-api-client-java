/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */


package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.model.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * API tests for SecurityMonitoringApi
 */
public class SecurityMonitoringApiTest extends V2APITest {

    private SecurityMonitoringApi api;
    private List<SecurityMonitoringRuleResponseCreate> ruleCreateResponses;

    @Override
    public String getTracingEndpoint() {
        return "security-monitoring";
    }

    @Before
    public void setUp() throws Exception {
        api = new SecurityMonitoringApi(generalApiClient);
        ruleCreateResponses = new ArrayList<>();
    }

    @After
    public void tearDown() throws Exception {
        for (SecurityMonitoringRuleResponseCreate rule : ruleCreateResponses) {
            try {
                api.deleteSecurityMonitoringRule(rule.getId()).execute();
            } catch (ApiException e) {
                // ignore
            }
        }
    }

    @Test
    public void rulesCrudTest() throws ApiException {
        String baseName = getUniqueEntityName();

        // create rules
        for (int i = 0; i < 5; i++) {
            String ruleName = String.format("%s-%d", baseName, i);
            SecurityMonitoringRuleResponseCreate response = createRule(ruleName);
            ruleCreateResponses.add(response);

            assertEquals(ruleName, response.getName());
        }

        // get single rule
        SecurityMonitoringRuleResponseCreate createdRule = ruleCreateResponses.get(0);
        SecurityMonitoringRuleResponse fetchedRule = api.getSecurityMonitoringRule(createdRule.getId()).execute();
        assertEquals(createdRule, fetchedRule);

        //// get all rules
        // get total count
        SecurityMonitoringListRulesResponse getCountResponse = api.listSecurityMonitoringRules().pageSize(1L).pageNumber(0L).execute();
        long ruleCount = getCountResponse.getMeta().getPage().getTotalCount();
        assertTrue(ruleCount > 5);
        assertEquals(ruleCount, ((long) getCountResponse.getMeta().getPage().getTotalFilteredCount())); // everything is matched

        // created rules are in all rules
        SecurityMonitoringListRulesResponse getAllRules = api.listSecurityMonitoringRules().pageSize(ruleCount).execute();
        // this could be flaky if another test is run at the same time
        // assertEquals(ruleCount, getAllRules.getData().size());
        Set<String> ids = ruleCreateResponses.stream().map(SecurityMonitoringRuleResponseCreate::getId).collect(Collectors.toSet());
        List<SecurityMonitoringRuleResponse> knownRules = getAllRules.getData()
                .stream()
                .filter(rule -> ids.contains(rule.getId()))
                .collect(Collectors.toList());
        assertEquals(ruleCreateResponses.size(), knownRules.size());

        // paging
        SecurityMonitoringListRulesResponse firstPage = api.listSecurityMonitoringRules().pageSize(2L).pageNumber(0L).execute();
        assertEquals(2, firstPage.getData().size());
        SecurityMonitoringListRulesResponse secondPage = api.listSecurityMonitoringRules().pageSize(2L).pageNumber(1L).execute();
        assertEquals(2, secondPage.getData().size());

        Set<String> firstPageIds = firstPage.getData().stream()
                .map(SecurityMonitoringRuleResponse::getId).collect(Collectors.toSet());
        Set<String> secondPageIds = secondPage.getData().stream()
                .map(SecurityMonitoringRuleResponse::getId).collect(Collectors.toSet());

        Set<String> idsIntersection = new HashSet<>(firstPageIds);
        idsIntersection.retainAll(secondPageIds);
        assertEquals(0, idsIntersection.size());

        //// update rule
        SecurityMonitoringRuleResponse updatedRule = api.updateSecurityMonitoringRule(fetchedRule.getId())
                .body(new SecurityMonitoringRuleUpdatePayload()
                        .name(fetchedRule.getName())
                        .isEnabled(false)
                        .queries(fetchedRule.getQueries())
                        .options(fetchedRule.getOptions())
                        .cases(fetchedRule.getCases())
                        .message(fetchedRule.getMessage())
                        .tags(fetchedRule.getTags()))
                .execute();
        assertEquals(fetchedRule.getName(), updatedRule.getName());
        assertEquals(false, updatedRule.getIsEnabled());

        SecurityMonitoringRuleResponse getUpdatedRule = api.getSecurityMonitoringRule(fetchedRule.getId()).execute();
        assertEquals(false, getUpdatedRule.getIsEnabled());

        //// delete rule
        api.deleteSecurityMonitoringRule(fetchedRule.getId()).execute();
        try {
            api.getSecurityMonitoringRule(fetchedRule.getId()).execute();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    private SecurityMonitoringRuleResponseCreate createRule(String ruleName) throws ApiException {
        SecurityMonitoringRuleCreatePayload createRulePayload = new SecurityMonitoringRuleCreatePayload();
        createRulePayload
                .name(ruleName)
                .isEnabled(true)
                .addQueriesItem(new SecurityMonitoringRuleQueryCreate()
                        .name("nevermatch")
                        .query("thiswillnevernevermatch")
                        .groupByFields(Collections.emptyList()))
                .options(new SecurityMonitoringRuleOptions()
                        .evaluationWindow(SecurityMonitoringRuleEvaluationWindow.FIVE_MINUTES)
                        .keepAlive(SecurityMonitoringRuleKeepAlive.FIVE_MINUTES)
                        .maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.FIVE_MINUTES))
                .addCasesItem(new SecurityMonitoringRuleCaseCreate()
                        .name("rule-case")
                        .condition("nevermatch > 1000")
                        .status(SecurityMonitoringRuleSeverity.INFO))
                .message("Rule message")
                .tags(Collections.singletonList("datadog-api-client-test-java"));

        return api.createSecurityMonitoringRule()
                .body(createRulePayload)
                .execute();
    }

}
