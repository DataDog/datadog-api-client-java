/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import com.datadog.api.RecordingMode;
import com.datadog.api.TestUtils;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.model.SecurityMonitoringFilter;
import com.datadog.api.v2.client.model.SecurityMonitoringFilterAction;
import com.datadog.api.v2.client.model.SecurityMonitoringListRulesResponse;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleCaseCreate;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleOptions;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleQueryCreate;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleResponse;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleUpdatePayload;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalListRequest;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalListRequestFilter;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalListRequestPage;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalsListResponse;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalsSort;
import java.net.URLEncoder;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import javax.ws.rs.core.GenericType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for SecurityMonitoringApi */
public class SecurityMonitoringApiTest extends V2APITest {

  private SecurityMonitoringApi api;
  private List<SecurityMonitoringRuleResponse> ruleCreateResponses;

  @Override
  public String getTracingEndpoint() {
    return "security-monitoring";
  }

  @BeforeClass
  public static void enableUnstableOperations() {
    generalApiClient.setUnstableOperationEnabled("searchSecurityMonitoringSignals", true);
    generalApiClient.setUnstableOperationEnabled("listSecurityMonitoringSignals", true);
  }

  @AfterClass
  public static void disableUnstableOperations() {
    generalApiClient.setUnstableOperationEnabled("searchSecurityMonitoringSignals", false);
    generalApiClient.setUnstableOperationEnabled("listSecurityMonitoringSignals", false);
  }

  @Before
  public void setUp() throws Exception {
    api = new SecurityMonitoringApi(generalApiClient);
    ruleCreateResponses = new ArrayList<>();
  }

  @After
  public void tearDown() throws Exception {
    for (SecurityMonitoringRuleResponse rule : ruleCreateResponses) {
      try {
        api.deleteSecurityMonitoringRule(rule.getId());
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
      SecurityMonitoringRuleResponse response = createRule(ruleName);
      ruleCreateResponses.add(response);

      assertEquals(ruleName, response.getName());
    }

    // get single rule
    SecurityMonitoringRuleResponse createdRule = ruleCreateResponses.get(0);
    SecurityMonitoringRuleResponse fetchedRule =
        api.getSecurityMonitoringRule(createdRule.getId());
    assertEquals(createdRule, fetchedRule);

    //// get all rules
    // get total count
    long pageSize = 1L;
    SecurityMonitoringListRulesResponse getCountResponse =
        api.listSecurityMonitoringRules(api.new ListSecurityMonitoringRulesParameters().pageSize(pageSize).pageNumber(0L));
    long ruleCount = getCountResponse.getMeta().getPage().getTotalCount();
    assertTrue(ruleCount > 5);
    assertEquals(
        pageSize,
        ((long)
            getCountResponse.getMeta().getPage().getTotalFilteredCount())); // everything is matched

    // created rules are in all rules
    SecurityMonitoringListRulesResponse getAllRules =
        api.listSecurityMonitoringRules(api.new ListSecurityMonitoringRulesParameters().pageSize(ruleCount));
    // this could be flaky if another test is run at the same time
    // assertEquals(ruleCount, getAllRules.getData().size());
    Set<String> ids =
        ruleCreateResponses.stream()
            .map(SecurityMonitoringRuleResponse::getId)
            .collect(Collectors.toSet());
    List<SecurityMonitoringRuleResponse> knownRules =
        getAllRules.getData().stream()
            .filter(rule -> ids.contains(rule.getId()))
            .collect(Collectors.toList());
    assertEquals(ruleCreateResponses.size(), knownRules.size());

    // paging
    SecurityMonitoringListRulesResponse firstPage =
        api.listSecurityMonitoringRules(api.new ListSecurityMonitoringRulesParameters().pageSize(2L).pageNumber(0L));
    assertEquals(2, firstPage.getData().size());
    SecurityMonitoringListRulesResponse secondPage =
        api.listSecurityMonitoringRules(api.new ListSecurityMonitoringRulesParameters().pageSize(2L).pageNumber(1L));
    assertEquals(2, secondPage.getData().size());

    Set<String> firstPageIds =
        firstPage.getData().stream()
            .map(SecurityMonitoringRuleResponse::getId)
            .collect(Collectors.toSet());
    Set<String> secondPageIds =
        secondPage.getData().stream()
            .map(SecurityMonitoringRuleResponse::getId)
            .collect(Collectors.toSet());

    Set<String> idsIntersection = new HashSet<>(firstPageIds);
    idsIntersection.retainAll(secondPageIds);
    assertEquals(0, idsIntersection.size());

    //// update rule
    SecurityMonitoringRuleResponse updatedRule =
        api.updateSecurityMonitoringRule(createdRule.getId(),
                new SecurityMonitoringRuleUpdatePayload()
                    .name(createdRule.getName())
                    .isEnabled(false)
                    .queries(createdRule.getQueries())
                    .options(createdRule.getOptions())
                    .cases(createdRule.getCases())
                    .message(createdRule.getMessage())
                    .tags(createdRule.getTags()));
    assertEquals(createdRule.getName(), updatedRule.getName());
    assertEquals(false, updatedRule.getIsEnabled());

    SecurityMonitoringRuleResponse getUpdatedRule =
        api.getSecurityMonitoringRule(createdRule.getId());
    assertEquals(false, getUpdatedRule.getIsEnabled());

    //// delete rule
    api.deleteSecurityMonitoringRule(createdRule.getId());
    try {
      api.getSecurityMonitoringRule(createdRule.getId());
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
    }
  }

  @Test
  @Ignore
  public void searchSignals() throws Exception {
    String uniqueName = getUniqueEntityName();
    createRule(uniqueName);
    // Wait for the backend to start processing the rule
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      Thread.sleep(5000);
    }

    sendLogs(uniqueName);

    SecurityMonitoringSignalListRequestFilter allSignalsFilter =
        new SecurityMonitoringSignalListRequestFilter()
            .query(uniqueName)
            .from(now.minus(Duration.ofHours(1)))
            .to(now.plus(Duration.ofHours(1)));

    // Make sure both logs are indexed
    SecurityMonitoringSignalListRequest bothSignalsRequest =
        new SecurityMonitoringSignalListRequest().filter(allSignalsFilter);
    TestUtils.retry(
        5,
        10,
        () -> {
          try {
            SecurityMonitoringSignalsListResponse response =
                api.searchSecurityMonitoringSignals(api.new SearchSecurityMonitoringSignalsParameters().body(bothSignalsRequest));
            return response.getData() != null && response.getData().size() == 2;
          } catch (ApiException ignored) {
            return false;
          }
        });

    // Sort ascending works correctly
    AtomicReference<SecurityMonitoringSignalsListResponse> responseAscending =
        new AtomicReference<>();
    TestUtils.retry(
        5,
        10,
        () -> {
          try {
            responseAscending.set(
                api.searchSecurityMonitoringSignals(
                    api.new SearchSecurityMonitoringSignalsParameters().body(
                        new SecurityMonitoringSignalListRequest()
                            .filter(allSignalsFilter)
                            .sort(SecurityMonitoringSignalsSort.TIMESTAMP_ASCENDING))));

            return responseAscending.get().getData() != null
                && responseAscending.get().getData().size() >= 2;
          } catch (ApiException ignored) {
            return false;
          }
        });
    OffsetDateTime firstTimestamp =
        responseAscending.get().getData().get(0).getAttributes().getTimestamp();
    OffsetDateTime secondTimestamp =
        responseAscending.get().getData().get(1).getAttributes().getTimestamp();
    assertTrue(firstTimestamp.isBefore(secondTimestamp));

    // Sort descending works correctly
    AtomicReference<SecurityMonitoringSignalsListResponse> responseDescending =
        new AtomicReference<>();
    TestUtils.retry(
        5,
        10,
        () -> {
          try {
            responseDescending.set(
                api.searchSecurityMonitoringSignals(
                    api.new SearchSecurityMonitoringSignalsParameters().body(
                        new SecurityMonitoringSignalListRequest()
                            .filter(allSignalsFilter)
                            .sort(SecurityMonitoringSignalsSort.TIMESTAMP_DESCENDING))));

            return responseDescending.get().getData() != null
                && responseDescending.get().getData().size() >= 2;
          } catch (ApiException ignored) {
            return false;
          }
        });
    firstTimestamp = responseDescending.get().getData().get(0).getAttributes().getTimestamp();
    secondTimestamp = responseDescending.get().getData().get(1).getAttributes().getTimestamp();
    assertTrue(firstTimestamp.isAfter(secondTimestamp));

    // Paging
    AtomicReference<SecurityMonitoringSignalsListResponse> pageOneResponse =
        new AtomicReference<>();
    AtomicReference<SecurityMonitoringSignalsListResponse> pageTwoResponse =
        new AtomicReference<>();
    TestUtils.retry(
        5,
        10,
        () -> {
          try {
            pageOneResponse.set(
                api.searchSecurityMonitoringSignals(
                    api.new SearchSecurityMonitoringSignalsParameters().body(
                        new SecurityMonitoringSignalListRequest()
                            .filter(allSignalsFilter)
                            .page(new SecurityMonitoringSignalListRequestPage().limit(1)))));

            if (pageOneResponse.get().getData() == null
                || pageOneResponse.get().getData().size() < 1) {
              return false;
            }

            pageTwoResponse.set(
                api.searchSecurityMonitoringSignals(
                    api.new SearchSecurityMonitoringSignalsParameters().body(
                        new SecurityMonitoringSignalListRequest()
                            .filter(allSignalsFilter)
                            .page(
                                new SecurityMonitoringSignalListRequestPage()
                                    .cursor(pageOneResponse.get().getMeta().getPage().getAfter())
                                    .limit(1)))));
            return pageTwoResponse.get().getData() != null
                && pageTwoResponse.get().getData().size() >= 1;
          } catch (ApiException ignored) {
            return false;
          }
        });
    String cursor = pageOneResponse.get().getMeta().getPage().getAfter();
    assertTrue(pageOneResponse.get().getLinks().getNext().contains(URLEncoder.encode(cursor)));
    assertNotEquals(
        pageOneResponse.get().getData().get(0).getId(),
        pageTwoResponse.get().getData().get(0).getId());
  }

  @Test
  @Ignore
  public void listSignals() throws Exception {
    String uniqueName = getUniqueEntityName();
    SecurityMonitoringRuleResponse rule = createRule(uniqueName);
    // Wait for the rules to be created
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      Thread.sleep(5000);
    }

    sendLogs(uniqueName);

    // Signals can be retrieved
    TestUtils.retry(
        5,
        10,
        () -> {
          try {
            SecurityMonitoringSignalsListResponse response =
                api.listSecurityMonitoringSignals(
                    api.new ListSecurityMonitoringSignalsParameters()
		    .filterQuery(uniqueName)
                    .filterFrom(now.minus(Duration.ofHours(1)))
                    .filterTo(now.plus(Duration.ofHours(1)))
                    .sort(SecurityMonitoringSignalsSort.TIMESTAMP_ASCENDING));
            return response.getData() != null && response.getData().size() == 2;
          } catch (ApiException ignored) {
            return false;
          }
        });

    // Ascending sort works correctly
    AtomicReference<SecurityMonitoringSignalsListResponse> responseAscending =
        new AtomicReference<>();
    TestUtils.retry(
        5,
        10,
        () -> {
          try {
            responseAscending.set(
                api.listSecurityMonitoringSignals(
                    api.new ListSecurityMonitoringSignalsParameters()
                    .filterQuery(uniqueName)
                    .filterFrom(now.minus(Duration.ofHours(1)))
                    .filterTo(now.plus(Duration.ofHours(1)))
                    .sort(SecurityMonitoringSignalsSort.TIMESTAMP_ASCENDING)));

            return responseAscending.get().getData() != null
                && responseAscending.get().getData().size() >= 2;
          } catch (ApiException ignored) {
            return false;
          }
        });
    OffsetDateTime firstTimestamp =
        responseAscending.get().getData().get(0).getAttributes().getTimestamp();
    OffsetDateTime secondTimestamp =
        responseAscending.get().getData().get(1).getAttributes().getTimestamp();
    assertTrue(firstTimestamp.isBefore(secondTimestamp));

    // Descending sort works correctly
    AtomicReference<SecurityMonitoringSignalsListResponse> responseDescending =
        new AtomicReference<>();
    TestUtils.retry(
        5,
        10,
        () -> {
          try {
            responseDescending.set(
                api.listSecurityMonitoringSignals(
                    api.new ListSecurityMonitoringSignalsParameters()
                    .filterQuery(uniqueName)
                    .filterFrom(now.minus(Duration.ofHours(1)))
                    .filterTo(now.plus(Duration.ofHours(1)))
                    .sort(SecurityMonitoringSignalsSort.TIMESTAMP_DESCENDING)));

            return responseDescending.get().getData() != null
                && responseDescending.get().getData().size() >= 2;
          } catch (ApiException ignored) {
            return false;
          }
        });
    firstTimestamp = responseDescending.get().getData().get(0).getAttributes().getTimestamp();
    secondTimestamp = responseDescending.get().getData().get(1).getAttributes().getTimestamp();
    assertTrue(firstTimestamp.isAfter(secondTimestamp));

    // Paging
    AtomicReference<SecurityMonitoringSignalsListResponse> pageOneResponse =
        new AtomicReference<>();
    AtomicReference<SecurityMonitoringSignalsListResponse> pageTwoResponse =
        new AtomicReference<>();
    TestUtils.retry(
        5,
        10,
        () -> {
          try {
            // First page
            pageOneResponse.set(
                api.listSecurityMonitoringSignals(
                    api.new ListSecurityMonitoringSignalsParameters()
                    .filterQuery(uniqueName)
                    .filterFrom(now.minus(Duration.ofHours(1)))
                    .filterTo(now.plus(Duration.ofHours(1)))
                    .pageLimit(1)));

            if (pageOneResponse.get().getData() == null
                || pageOneResponse.get().getData().size() < 1) {
              return false;
            }

            // Second page
            pageTwoResponse.set(
                api.listSecurityMonitoringSignals(
                    api.new ListSecurityMonitoringSignalsParameters()
                    .filterQuery(uniqueName)
                    .filterFrom(now.minus(Duration.ofHours(1)))
                    .filterTo(now.plus(Duration.ofHours(1)))
                    .pageLimit(1)
                    .pageCursor(pageOneResponse.get().getMeta().getPage().getAfter())));

            return pageTwoResponse.get().getData() != null
                && pageTwoResponse.get().getData().size() >= 1;
          } catch (ApiException ignored) {
            return false;
          }
        });
    String cursor = pageOneResponse.get().getMeta().getPage().getAfter();
    assertTrue(pageOneResponse.get().getLinks().getNext().contains(URLEncoder.encode(cursor)));
    assertNotEquals(
        pageOneResponse.get().getData().get(0).getId(),
        pageTwoResponse.get().getData().get(0).getId());

    api.deleteSecurityMonitoringRule(rule.getId());
  }

  private void sendLogs(String message) throws Exception {
    String intakeURL;
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
      // when running from cassettes, we need to make sure that the default base URL
      // is used for mock server certificates to work properly
      intakeURL = "/v1/input";
    } else {
      intakeURL = String.format("https://http-intake.logs.%s/v1/input", testDomain());
    }
    sendRequest(
        "POST",
        intakeURL,
        String.format(
            "{\"ddtags\":\"java,test,list\",\"message\":\"{\\\"timestamp\\\": %d, \\\"message\\\":"
                + " \\\"%s\\\"}\"}",
            (now.toEpochSecond() - 1000) * 1000, message),
        new GenericType<String>(String.class));

    // Let's ensure log arrival order
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      Thread.sleep(5000);
    }

    sendRequest(
        "POST",
        intakeURL,
        String.format(
            "{\"ddtags\":\"java,test,list\",\"message\":\"{\\\"timestamp\\\": %d, \\\"message\\\":"
                + " \\\"%s\\\"}\"}",
            now.toEpochSecond() * 1000, message),
        new GenericType<String>(String.class));
  }

  private SecurityMonitoringRuleResponse createRule(String ruleName) throws ApiException {
    SecurityMonitoringRuleCreatePayload createRulePayload =
        new SecurityMonitoringRuleCreatePayload();
    createRulePayload
        .name(ruleName)
        .isEnabled(true)
        .addQueriesItem(
            new SecurityMonitoringRuleQueryCreate()
                .name("rule")
                .query(ruleName)
                .groupByFields(Collections.emptyList()))
        .options(
            new SecurityMonitoringRuleOptions()
                // Generate a signal every log
                .evaluationWindow(SecurityMonitoringRuleEvaluationWindow.ZERO_MINUTES)
                .keepAlive(SecurityMonitoringRuleKeepAlive.ZERO_MINUTES)
                .maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.ZERO_MINUTES))
        .addCasesItem(
            new SecurityMonitoringRuleCaseCreate()
                .name("rule-case")
                .condition("rule > 0")
                .status(SecurityMonitoringRuleSeverity.INFO))
        .addFiltersItem(
            new SecurityMonitoringFilter()
                .query("query")
                .action(SecurityMonitoringFilterAction.SUPPRESS))
        .message("Rule message")
        .tags(Collections.singletonList("datadog-api-client-test-java"));

    return api.createSecurityMonitoringRule(createRulePayload);
  }
}
