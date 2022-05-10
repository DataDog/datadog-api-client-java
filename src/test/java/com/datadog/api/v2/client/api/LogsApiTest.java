/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import com.datadog.api.RecordingMode;
import com.datadog.api.TestUtils;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.PaginationIterable;
import com.datadog.api.v2.client.model.*;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.time.Duration;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.ws.rs.core.GenericType;
import org.junit.AssumptionViolatedException;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("ConstantConditions")
public class LogsApiTest extends V2APITest {

  private static LogsApi api;

  @Override
  public String getTracingEndpoint() {
    return "logs";
  }

  @Before
  public void setup() {
    api = new LogsApi(generalApiClient);
  }

  private void sendLogs(String suffix) throws ApiException, MalformedURLException {
    long nowNano = now.toEpochSecond() * 1000000 + now.getNano();
    String source = String.format("java-client-test-%d", nowNano);
    String message = String.format("test-log-list %s", suffix);
    String secondMessage = String.format("test-log-list-2 %s", suffix);
    String hostname = getUniqueEntityName();

    String intakeURL;
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
      // when running from cassettes, we need to make sure that the default base URL
      // is used for mock server certificates to work properly
      intakeURL = "/v1/input";
    } else {
      intakeURL = String.format("https://http-intake.logs.%s/v1/input", testDomain());
    }
    // use TreeMap, as it's sorted and will always serialize in the same way
    Map<String, Object> payload =
        new TreeMap<String, Object>() {
          {
            put("ddsource", source);
            put("ddtags", "java,test,list");
            put("hostname", hostname);
            put(
                "message",
                new TreeMap<String, Object>() {
                  {
                    put("timestamp", (now.toEpochSecond() - 1000) * 1000);
                    put("message", message);
                  }
                });
          }
        };
    sendRequest("POST", intakeURL, payload, new GenericType<String>(String.class));

    payload.put(
        "message",
        new TreeMap<String, Object>() {
          {
            put("timestamp", (now.toEpochSecond() - 1) * 1000);
            put("message", secondMessage);
          }
        });
    sendRequest("POST", intakeURL, payload, new GenericType<String>(String.class));
  }

  @Test
  public void listLogsWithPaginationTest() throws ApiException {
    PaginationIterable<Log> iterable = api.listLogsWithPagination();

    //        iterator.forEachRemaining(System.out::println);

    for (Log item : iterable) {
      System.out.println("res::::: " + item);
    }

    //        while (iterator.hasNext()) {
    //            Object res = iterator.next();
    //            System.out.println("res:::::" + res);
    //        }
  }

  @Test
  public void listLogsTest() throws Exception {
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      throw new AssumptionViolatedException("Skipping in non-recording mode");
    }
    String suffix = getUniqueEntityName();
    sendLogs(suffix);

    LogsQueryFilter allLogsFilter = new LogsQueryFilter().query(suffix).from("now-1h").to("now+1h");

    // Make sure both logs are indexed
    LogsListRequest bothMessagesRequest = new LogsListRequest().filter(allLogsFilter);
    TestUtils.retry(
        10,
        10,
        () -> {
          try {
            LogsListResponse response =
                api.listLogs(new LogsApi.ListLogsOptionalParameters().body(bothMessagesRequest));
            return response.getData() != null && response.getData().size() == 2;
          } catch (ApiException ignored) {
            return false;
          }
        });

    AtomicReference<LogsListResponse> responseAscending = new AtomicReference<>();

    TestUtils.retry(
        5,
        10,
        () -> {
          try {
            // Sort works correctly
            responseAscending.set(
                api.listLogs(
                    new LogsApi.ListLogsOptionalParameters()
                        .body(
                            new LogsListRequest()
                                .filter(allLogsFilter)
                                .sort(LogsSort.TIMESTAMP_ASCENDING))));
            return responseAscending.get().getData() != null
                && responseAscending.get().getData().size() == 2;
          } catch (ApiException ignored) {
            return false;
          }
        });

    assertEquals(2, responseAscending.get().getData().size());
    assertEquals(
        "test-log-list " + suffix,
        responseAscending.get().getData().get(0).getAttributes().getMessage());
    assertEquals(
        "test-log-list-2 " + suffix,
        responseAscending.get().getData().get(1).getAttributes().getMessage());

    AtomicReference<LogsListResponse> responseDescending = new AtomicReference<>();
    TestUtils.retry(
        5,
        10,
        () -> {
          try {
            responseDescending.set(
                api.listLogs(
                    new LogsApi.ListLogsOptionalParameters()
                        .body(
                            new LogsListRequest()
                                .filter(allLogsFilter)
                                .sort(LogsSort.TIMESTAMP_DESCENDING))));
            return responseDescending.get().getData() != null
                && responseDescending.get().getData().size() == 2;
          } catch (ApiException ignored) {
            return false;
          }
        });

    assertEquals(2, responseDescending.get().getData().size());
    assertEquals(
        "test-log-list-2 " + suffix,
        responseDescending.get().getData().get(0).getAttributes().getMessage());
    assertEquals(
        "test-log-list " + suffix,
        responseDescending.get().getData().get(1).getAttributes().getMessage());

    // Paging
    LogsListResponse pageOneResponse =
        api.listLogs(
            new LogsApi.ListLogsOptionalParameters()
                .body(
                    new LogsListRequest()
                        .filter(allLogsFilter)
                        .page(new LogsListRequestPage().limit(1))));
    assertEquals(1, pageOneResponse.getData().size());

    String cursor = pageOneResponse.getMeta().getPage().getAfter();
    assertTrue(pageOneResponse.getLinks().getNext().contains(URLEncoder.encode(cursor, "UTF-8")));

    LogsListResponse pageTwoResponse =
        api.listLogs(
            new LogsApi.ListLogsOptionalParameters()
                .body(
                    new LogsListRequest()
                        .filter(allLogsFilter)
                        .page(new LogsListRequestPage().cursor(cursor).limit(1))));
    assertEquals(1, pageTwoResponse.getData().size());

    assertNotEquals(
        pageOneResponse.getData().get(0).getId(), pageTwoResponse.getData().get(0).getId());
  }

  @Test
  public void listLogsGetTest() throws Exception {
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      throw new AssumptionViolatedException("Skipping in non-recording mode");
    }
    String suffix = getUniqueEntityName();
    sendLogs(suffix);

    // Make sure both logs are indexed
    AtomicReference<LogsListResponse> responseAscending = new AtomicReference<>();
    TestUtils.retry(
        5,
        10,
        () -> {
          try {
            // Sort works correctly
            responseAscending.set(
                api.listLogsGet(
                    new LogsApi.ListLogsGetOptionalParameters()
                        .filterQuery(suffix)
                        .filterFrom(now.minus(Duration.ofHours(1)))
                        .filterTo(now.plus(Duration.ofHours(1)))
                        .sort(LogsSort.TIMESTAMP_ASCENDING)));
            return responseAscending.get().getData() != null
                && responseAscending.get().getData().size() == 2;
          } catch (ApiException ignored) {
            return false;
          }
        });

    assertEquals(2, responseAscending.get().getData().size());
    assertEquals(
        "test-log-list " + suffix,
        responseAscending.get().getData().get(0).getAttributes().getMessage());
    assertEquals(
        "test-log-list-2 " + suffix,
        responseAscending.get().getData().get(1).getAttributes().getMessage());

    // Make sure both logs are indexed
    AtomicReference<LogsListResponse> responseDescending = new AtomicReference<>();
    TestUtils.retry(
        5,
        10,
        () -> {
          try {
            // Sort works correctly
            responseDescending.set(
                api.listLogsGet(
                    new LogsApi.ListLogsGetOptionalParameters()
                        .filterQuery(suffix)
                        .filterFrom(now.minus(Duration.ofHours(1)))
                        .filterTo(now.plus(Duration.ofHours(1)))
                        .sort(LogsSort.TIMESTAMP_DESCENDING)));
            return responseDescending.get().getData() != null
                && responseDescending.get().getData().size() == 2;
          } catch (ApiException ignored) {
            return false;
          }
        });

    assertEquals(2, responseDescending.get().getData().size());
    assertEquals(
        "test-log-list-2 " + suffix,
        responseDescending.get().getData().get(0).getAttributes().getMessage());
    assertEquals(
        "test-log-list " + suffix,
        responseDescending.get().getData().get(1).getAttributes().getMessage());

    // Paging
    AtomicReference<LogsListResponse> pageOneResponse = new AtomicReference<>();
    TestUtils.retry(
        5,
        10,
        () -> {
          try {
            pageOneResponse.set(
                api.listLogsGet(
                    new LogsApi.ListLogsGetOptionalParameters()
                        .filterQuery(suffix)
                        .filterFrom(now.minus(Duration.ofHours(1)))
                        .filterTo(now.plus(Duration.ofHours(1)))
                        .pageLimit(1)));
            return pageOneResponse.get().getData() != null
                && pageOneResponse.get().getData().size() == 1;
          } catch (ApiException ignored) {
            return false;
          }
        });

    assertEquals(1, pageOneResponse.get().getData().size());

    String cursor = pageOneResponse.get().getMeta().getPage().getAfter();
    assertTrue(
        pageOneResponse.get().getLinks().getNext().contains(URLEncoder.encode(cursor, "UTF-8")));

    AtomicReference<LogsListResponse> pageTwoResponse = new AtomicReference<>();
    TestUtils.retry(
        5,
        10,
        () -> {
          try {
            pageTwoResponse.set(
                api.listLogsGet(
                    new LogsApi.ListLogsGetOptionalParameters()
                        .filterQuery(suffix)
                        .filterFrom(now.minus(Duration.ofHours(1)))
                        .filterTo(now.plus(Duration.ofHours(1)))
                        .pageLimit(1)
                        .pageCursor(cursor)));
            return pageTwoResponse.get().getData() != null
                && pageTwoResponse.get().getData().size() == 1;
          } catch (ApiException ignored) {
            return false;
          }
        });

    assertEquals(1, pageTwoResponse.get().getData().size());

    assertNotEquals(
        pageOneResponse.get().getData().get(0).getId(),
        pageTwoResponse.get().getData().get(0).getId());
  }
}
