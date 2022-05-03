/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import static org.junit.Assert.*;

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.CancelDowntimesByScopeRequest;
import com.datadog.api.v1.client.model.Downtime;
import com.datadog.api.v1.client.model.DowntimeRecurrence;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/** API tests for DowntimesApi */
public class DowntimesApiTest extends V1ApiTest {

  private static DowntimesApi api;
  private static DowntimesApi fakeAuthApi;

  // ObjectMapper instance configure to not fail when encountering unknown properties
  private static ObjectMapper objectMapper =
      new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  private ArrayList<Long> deleteDowntimes = null;
  private Long testingDowntimeStart;

  private final List<String> testingDowntimeScope = Arrays.asList("env:prod");
  private final String testingDowntimeRecurrenceType = "weeks";
  private final Integer testingDowntimeRecurrencePeriod = 1;
  private final List<String> testingDowntimeRecurrenceWeekDays = Arrays.asList("Mon", "Tue");
  private final Integer testingUntilDowntimeRecurrenceOccurrences = 10;

  @Override
  public String getTracingEndpoint() {
    return "downtimes";
  }

  @Before
  public void resetTest() {
    deleteDowntimes = new ArrayList<>();
    testingDowntimeStart = now.toInstant().toEpochMilli() / 1000L + 200000;
  }

  @BeforeClass
  public static void initApi() {
    api = new DowntimesApi(generalApiClient);
    fakeAuthApi = new DowntimesApi(generalFakeAuthApiClient);
  }

  @After
  public void deleteDowntimes() throws ApiException {
    if (deleteDowntimes != null) {
      for (Long id : deleteDowntimes) {
        try {
          api.getDowntime(id);
        } catch (ApiException e) {
          // doesn't exist => continue
          continue;
        }
        api.cancelDowntime(id);
      }
    }
  }

  /** Create, modify and cancel downtime object, also test getting it */
  @Test
  public void createModifyCancelDowntimeTest() throws ApiException {
    String testingDowntimeMessage = getUniqueEntityName();
    DowntimeRecurrence recurrence =
        new DowntimeRecurrence()
            .type(testingDowntimeRecurrenceType)
            .period(testingDowntimeRecurrencePeriod)
            .weekDays(testingDowntimeRecurrenceWeekDays)
            .untilOccurrences(testingUntilDowntimeRecurrenceOccurrences);

    Downtime downtime =
        new Downtime()
            .scope(testingDowntimeScope)
            .message(testingDowntimeMessage)
            .start(testingDowntimeStart)
            .recurrence(recurrence);

    // test creating downtime
    Downtime obtained = api.createDowntime(downtime);
    Long downtimeId = obtained.getId();
    deleteDowntimes.add(downtimeId);

    // test getting downtime
    obtained = api.getDowntime(downtimeId);
    assertEquals(testingDowntimeScope, obtained.getScope());
    assertEquals(testingDowntimeMessage, obtained.getMessage());
    assertEquals(testingDowntimeStart, obtained.getStart());
    assertNull(obtained.getCanceled());
    assertEquals(testingDowntimeRecurrenceType, obtained.getRecurrence().getType());
    assertEquals(testingDowntimeRecurrencePeriod, obtained.getRecurrence().getPeriod());
    assertEquals(testingDowntimeRecurrenceWeekDays, obtained.getRecurrence().getWeekDays());
    assertEquals(
        testingUntilDowntimeRecurrenceOccurrences, obtained.getRecurrence().getUntilOccurrences());
    assertNull(obtained.getUpdaterId());
    assertTrue(obtained.getUpdaterId_JsonNullable().isPresent());

    // test updating downtime
    downtime.setMessage(testingDowntimeMessage + "-updated");
    obtained = api.updateDowntime(downtimeId, downtime);

    assertEquals(testingDowntimeScope, obtained.getScope());
    assertEquals(testingDowntimeMessage + "-updated", obtained.getMessage());
    assertEquals(testingDowntimeStart, obtained.getStart());
    assertNull(obtained.getCanceled());
    assertEquals(testingDowntimeRecurrenceType, obtained.getRecurrence().getType());
    assertEquals(testingDowntimeRecurrencePeriod, obtained.getRecurrence().getPeriod());
    assertEquals(testingDowntimeRecurrenceWeekDays, obtained.getRecurrence().getWeekDays());
    assertEquals(
        testingUntilDowntimeRecurrenceOccurrences, obtained.getRecurrence().getUntilOccurrences());
    assertNotNull(obtained.getUpdaterId());
    assertTrue(obtained.getUpdaterId_JsonNullable().isPresent());

    // test canceling downtime
    api.cancelDowntime(downtimeId);
    obtained = api.getDowntime(downtimeId);
    assertNotNull(obtained.getCanceled());
  }

  /** Get all downtimes */
  @Test
  public void listDowntimesTest() throws ApiException {
    String testingDowntimeMessage = getUniqueEntityName();
    ArrayList<String> messages =
        new ArrayList<String>(
            Arrays.asList(
                getUniqueEntityName("1"), getUniqueEntityName("2"), getUniqueEntityName("3")));
    for (String message : messages) {
      Downtime downtime = new Downtime().scope(testingDowntimeScope).message(message);
      Downtime created = api.createDowntime(downtime);
      deleteDowntimes.add(created.getId());
    }
    List<Downtime> allDowntimes =
        api.listDowntimes(new DowntimesApi.ListDowntimesOptionalParameters().currentOnly(false));
    for (String message : messages) {
      boolean found = false;
      for (Downtime downtime : allDowntimes) {
        if (downtime.getMessage() != null && downtime.getMessage().equals(message)) {
          found = true;
        }
      }
      assertTrue(String.format("Downtime %s not found", name, testingDowntimeMessage), found);
    }
  }

  /** Cancel downtimes by scope */
  @Test
  public void cancelDowntimesByScopeTest() throws ApiException {
    String testingDowntimeMessage = getUniqueEntityName();
    ArrayList<String> messages =
        new ArrayList<String>(
            Arrays.asList(
                getUniqueEntityName("1"), getUniqueEntityName("2"), getUniqueEntityName("3")));
    List<String> differentScope = Arrays.asList("env:stage");
    for (String message : messages) {
      // number 3 is going to have a different scope
      Downtime downtime =
          new Downtime()
              .scope(message.equals(messages.get(2)) ? differentScope : testingDowntimeScope)
              .message(message);
      Downtime created = api.createDowntime(downtime);
      deleteDowntimes.add(created.getId());
    }

    // cancel downtimes 1 and 2
    api.cancelDowntimesByScope(
        new CancelDowntimesByScopeRequest().scope(testingDowntimeScope.get(0)));

    // verify that downtimes 1 and 2 are canceled
    List<Downtime> allDowntimes =
        api.listDowntimes(new DowntimesApi.ListDowntimesOptionalParameters().currentOnly(true));
    for (String message : messages) {
      boolean found = false;
      for (Downtime downtime : allDowntimes) {
        if (downtime.getMessage() != null && downtime.getMessage().equals(message)) {
          found = true;
          if (message.equals(messages.get(2))) {
            assertNull(downtime.getCanceled());
          } else {
            assertNotNull(downtime.getCanceled());
          }
        }
      }
      if (message.equals(messages.get(2))) {
        assertTrue(String.format("Downtime %s not found", message), found);
      } else {
        assertFalse(
            String.format("Downtime %s found, but it should have been canceled", message), found);
      }
    }
  }

  @Test
  public void downtimeListErrorsTest() throws IOException {
    try {
      fakeAuthApi.listDowntimes();
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void downtimeCreateErrorsTest() throws IOException {
    try {
      api.createDowntime(new Downtime());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.createDowntime(new Downtime());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void downtimeCancelByScopeErrorsTest() throws IOException {
    try {
      api.cancelDowntimesByScope(new CancelDowntimesByScopeRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.cancelDowntimesByScope(new CancelDowntimesByScopeRequest());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.cancelDowntimesByScope(new CancelDowntimesByScopeRequest().scope("nonexistent"));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void downtimeCancelErrorsTest() throws IOException {
    try {
      fakeAuthApi.cancelDowntime(Long.valueOf(1234));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.cancelDowntime(Long.valueOf(1234));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void downtimeGetErrorsTest() throws IOException {
    try {
      fakeAuthApi.getDowntime(Long.valueOf(1234));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.getDowntime(Long.valueOf(1234));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }

  @Test
  public void downtimeUpdateErrorsTest() throws IOException {
    try {
      api.updateDowntime(Long.valueOf(1234), new Downtime().start(Long.valueOf(1234)));
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(400, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      fakeAuthApi.updateDowntime(Long.valueOf(1234), new Downtime());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(403, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }

    try {
      api.updateDowntime(Long.valueOf(1234), new Downtime());
      fail("Expected ApiException not thrown");
    } catch (ApiException e) {
      assertEquals(404, e.getCode());
      APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
      assertNotNull(error.getErrors());
    }
  }
}
