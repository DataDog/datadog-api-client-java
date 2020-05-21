/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;


import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.CancelDowntimesByScopeRequest;
import com.datadog.api.v1.client.model.Downtime;
import com.datadog.api.v1.client.model.DowntimeRecurrence;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * API tests for DowntimesApi
 */
public class DowntimesApiTest extends V1ApiTest {

    private static DowntimesApi api;
    private static DowntimesApi fakeAuthApi;

    // ObjectMapper instance configure to not fail when encountering unknown properties
    private static ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    private ArrayList<Long> deleteDowntimes = null;
    private Long testingDowntimeStart;

    private final List<String> testingDowntimeScope = Arrays.asList("env:prod");
    private final String testingDowntimeRecurrenceType = "weeks";
    private final Integer testingDowntimeRecurrencePeriod = 1;
    private final List<String> testingDowntimeRecurrenceWeekDays = Arrays.asList("Mon", "Tue");
    private final Integer testingUntilDowntimeRecurrenceOccurrences = 10;

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
                    api.getDowntime(id).execute();
                } catch (ApiException e) {
                    // doesn't exist => continue
                    continue;
                }
                api.cancelDowntime(id).execute();
            }
        }
    }

   /**
     * Create, modify and cancel downtime object, also test getting it
     */
    @Test
    public void createModifyCancelDowntimeTest() throws ApiException {
        String testingDowntimeMessage = getUniqueEntityName();
        DowntimeRecurrence recurrence = new DowntimeRecurrence()
            .type(testingDowntimeRecurrenceType)
            .period(testingDowntimeRecurrencePeriod)
            .weekDays(testingDowntimeRecurrenceWeekDays)
            .untilOccurrences(testingUntilDowntimeRecurrenceOccurrences);

        Downtime downtime = new Downtime()
            .scope(testingDowntimeScope)
            .message(testingDowntimeMessage)
            .start(testingDowntimeStart)
            .recurrence(recurrence);

        // test creating downtime
        Downtime obtained = api.createDowntime().body(downtime).execute();
        Long downtimeId = obtained.getId();
        deleteDowntimes.add(downtimeId);

        // test getting downtime
        obtained = api.getDowntime(downtimeId).execute();
        assertEquals(testingDowntimeScope, obtained.getScope());
        assertEquals(testingDowntimeMessage, obtained.getMessage());
        assertEquals(testingDowntimeStart, obtained.getStart());
        assertNull(obtained.getCanceled());
        assertEquals(testingDowntimeRecurrenceType, obtained.getRecurrence().getType());
        assertEquals(testingDowntimeRecurrencePeriod, obtained.getRecurrence().getPeriod());
        assertEquals(testingDowntimeRecurrenceWeekDays, obtained.getRecurrence().getWeekDays());
        assertEquals(testingUntilDowntimeRecurrenceOccurrences, obtained.getRecurrence().getUntilOccurrences());
        assertNull(obtained.getUpdaterId());
        assertTrue(obtained.getUpdaterId_JsonNullable().isPresent());

        // test updating downtime
        downtime.setMessage(testingDowntimeMessage + "-updated");
        obtained = api.updateDowntime(downtimeId).body(downtime).execute();

        assertEquals(testingDowntimeScope, obtained.getScope());
        assertEquals(testingDowntimeMessage + "-updated", obtained.getMessage());
        assertEquals(testingDowntimeStart, obtained.getStart());
        assertNull(obtained.getCanceled());
        assertEquals(testingDowntimeRecurrenceType, obtained.getRecurrence().getType());
        assertEquals(testingDowntimeRecurrencePeriod, obtained.getRecurrence().getPeriod());
        assertEquals(testingDowntimeRecurrenceWeekDays, obtained.getRecurrence().getWeekDays());
        assertEquals(testingUntilDowntimeRecurrenceOccurrences, obtained.getRecurrence().getUntilOccurrences());
        assertNotNull(obtained.getUpdaterId());
        assertTrue(obtained.getUpdaterId_JsonNullable().isPresent());

        // test canceling downtime
        api.cancelDowntime(downtimeId).execute();
        obtained = api.getDowntime(downtimeId).execute();
        assertNotNull(obtained.getCanceled());
    }

    /**
     * Get all downtimes
     */
    @Test
    public void listDowntimesTest() throws ApiException {
        String testingDowntimeMessage = getUniqueEntityName();
        ArrayList<String> suffixes = new ArrayList<String>(Arrays.asList("1", "2", "3"));
        for (String suffix: suffixes) {
            Downtime downtime = new Downtime()
                .scope(testingDowntimeScope)
                .message(String.format("%s-%s", testingDowntimeMessage, suffix));
            Downtime created = api.createDowntime().body(downtime).execute();
            deleteDowntimes.add(created.getId());
        }
        List<Downtime> allDowntimes = api.listDowntimes().currentOnly(false).execute();
        for (String suffix: suffixes) {
            boolean found = false;
            String name = String.format("%s-%s", testingDowntimeMessage, suffix);
            for (Downtime downtime: allDowntimes) {
                if (downtime.getMessage() != null && downtime.getMessage().equals(name)) {
                    found = true;
                }
            }
            assertTrue(String.format("Downtime %s not found", name, testingDowntimeMessage), found);
        }
    }

    /**
     * Cancel downtimes by scope
     */
    @Test
    public void cancelDowntimesByScopeTest() throws ApiException {
        String testingDowntimeMessage = getUniqueEntityName();
        List<String> suffixes = Arrays.asList("1", "2", "3");
        List<String> differentScope = Arrays.asList("env:stage");
        for (String suffix: suffixes) {
            // number 3 is going to have a different scope
            Downtime downtime = new Downtime()
                .scope(suffix == "3" ? differentScope : testingDowntimeScope)
                .message(String.format("%s-%s", testingDowntimeMessage, suffix));
            Downtime created = api.createDowntime().body(downtime).execute();
            deleteDowntimes.add(created.getId());
        }

        // cancel downtimes 1 and 2
        api.cancelDowntimesByScope().body(new CancelDowntimesByScopeRequest().scope(testingDowntimeScope.get(0))).execute();

        // verify that downtimes 1 and 2 are canceled
        List<Downtime> allDowntimes = api.listDowntimes().currentOnly(false).execute();
        for (String suffix: suffixes) {
            boolean found = false;
            String name = String.format("%s-%s", testingDowntimeMessage, suffix);
            for (Downtime downtime: allDowntimes) {
                if (downtime.getMessage() != null && downtime.getMessage().equals(name)) {
                    found = true;
                    if (suffix == "3") {
                        assertNull(downtime.getCanceled());
                    } else {
                        assertNotNull(downtime.getCanceled());
                    }
                }
            }
            if (suffix == "3") {
                assertTrue(String.format("Downtime %s not found", name), found);
            } else {
                assertFalse(String.format("Downtime %s found, but it should have been canceled", name), found);
            }
        }
    }

    @Test
    public void downtimeListErrorsTest() throws IOException {
        try {
            fakeAuthApi.listDowntimes().execute();
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
            api.createDowntime().body(new Downtime()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.createDowntime().body(new Downtime()).execute();
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
            api.cancelDowntimesByScope().body(new CancelDowntimesByScopeRequest()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.cancelDowntimesByScope().body(new CancelDowntimesByScopeRequest()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.cancelDowntimesByScope().body(new CancelDowntimesByScopeRequest().scope("nonexistent")).execute();
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
            fakeAuthApi.cancelDowntime(new Long(1234)).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.cancelDowntime(new Long(1234)).execute();
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
            fakeAuthApi.getDowntime(new Long(1234)).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.getDowntime(new Long(1234)).execute();
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
            api.updateDowntime(new Long(1234)).body(new Downtime().start(new Long(1234))).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.updateDowntime(new Long(1234)).body(new Downtime()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.updateDowntime(new Long(1234)).body(new Downtime()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }
}
