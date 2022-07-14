/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import com.datadog.api.RecordingMode;
import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import org.junit.AssumptionViolatedException;
import org.junit.BeforeClass;
import org.junit.Test;

/** API tests for LogsApi */
public class LogsApiTest extends V1ApiTest {

  private static LogsApi api;
  private static LogsApi fakeAuthApi;

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  @Override
  public String getTracingEndpoint() {
    return "logs";
  }

  @BeforeClass
  public static void initAPI() {
    api = new LogsApi(generalApiClient);
    fakeAuthApi = new LogsApi(generalFakeAuthApiClient);
  }

  @Test
  public void listLogTest() throws ApiException, TestUtils.RetryException, InterruptedException {
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      throw new AssumptionViolatedException("Skipping in non-recording mode");
    }
    long nowNano = now.toEpochSecond() * 1000000 + now.getNano();
    String source = String.format("java-client-test-%d", nowNano);
    String message = String.format("test-log-list-%d", nowNano);
    String secondMessage = "second-" + message;
    String hostname = getUniqueEntityName();

    String intakeURL = "https://http-intake.logs.datadoghq.com/v1/input";
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
      // when running from cassettes, we need to make sure that the default base URL
      // is used for mock server certificates to work properly
      intakeURL = "/v1/input";
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
                    put("timestamp", (now.toEpochSecond() - 1) * 1000);
                    put("message", message);
                  }
                });
          }
        };
    sendRequest("POST", intakeURL, payload, new GenericType<String>(String.class));
    Thread.sleep(500);

    payload.put(
        "message",
        new TreeMap<String, Object>() {
          {
            put("timestamp", (now.toEpochSecond()) * 1000);
            put("message", secondMessage);
          }
        });
    sendRequest("POST", intakeURL, payload, new GenericType<String>(String.class));

    final LogsListRequest request =
        new LogsListRequest()
            .query(String.format("source:%s", source))
            .time(new LogsListRequestTime().from(now.minusHours(1)).to(now.plusHours(1)))
            .limit(2)
            .sort(LogsSort.TIME_ASCENDING);

    // Make sure that both log items are indexed
    TestUtils.retry(
        15,
        10,
        () -> {
          try {
            LogsListResponse response = api.listLogs(request);
            return 2 == response.getLogs().size();
          } catch (ApiException e) {
            return false;
          }
        });

    TestUtils.retry(
        15,
        10,
        () -> {
          try {
            LogsListResponse logsResponse;

            // Find first log item
            LogsListRequest logsRequest = request.limit(1).startAt(null);
            logsResponse = api.listLogs(logsRequest);
            assertEquals(1, logsResponse.getLogs().size());

            Log log = logsResponse.getLogs().get(0);
            assertEquals(hostname, log.getContent().getHost());
            assertEquals(message, log.getContent().getMessage());

            // Find second log item
            assertNotNull(logsResponse.getNextLogId());

            logsRequest = logsRequest.startAt(logsResponse.getNextLogId());
            logsResponse = api.listLogs(logsRequest);
            assertEquals(1, logsResponse.getLogs().size());

            log = logsResponse.getLogs().get(0);
            assertEquals(hostname, log.getContent().getHost());
            assertEquals(secondMessage, log.getContent().getMessage());
            return true;
          } catch (ApiException e) {
            return false;
          }
        });
  }

  @Test
  public void logsListErrorsTest() throws IOException {
    LogsListRequest logsListRequest =
        new LogsListRequest()
            .startAt("notanid")
            .time(new LogsListRequestTime().from(now.minusHours(1)).to(now));

    try {
      api.listLogs(logsListRequest);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      LogsAPIErrorResponse error =
          objectMapper.readValue(e.getResponseBody(), LogsAPIErrorResponse.class);
      assertNotNull(error.getError());
    }

    try {
      fakeAuthApi.listLogs(logsListRequest);
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
