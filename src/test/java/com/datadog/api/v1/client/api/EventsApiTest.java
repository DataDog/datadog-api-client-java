/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;


import com.datadog.api.v1.client.ApiException;
import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.model.EventPriority;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

/**
 * API tests for EventsApi
 */
public class EventsApiTest extends V1ApiTest {

    private static EventsApi api;
    private static EventsApi fakeAuthApi;

    // ObjectMapper instance configure to not fail when encountering unknown properties
    private static ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    @Override
    public String getTracingEndpoint() {
        return "events";
    }

    @BeforeClass
    public static void initApi() {
        api = new EventsApi(generalApiClient);
        fakeAuthApi = new EventsApi(generalFakeAuthApiClient);
    }

    /**
     * Test event lifecycle.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void eventLifecycleTest() throws ApiException, TestUtils.RetryException {
        String eventTitle = getUniqueEntityName();
        String eventText = "example text";

        ApiResponse<EventResponse> response = sendRequest(
                "POST",
                "/api/v1/events",
                String.format(
                        "{\"priority\":\"normal\",\"source_type_name\":\"datadog-api-client-java\",\"tags\":[\"test\",\"client:java\"],\"text\":\"%s\",\"title\":\"%s\"}",
                        eventText, eventTitle
                ),
                new GenericType<EventResponse>(EventResponse.class)
        );

        final Long eventId = response.getData().getEvent().getId();

        AtomicReference<EventResponse> eventGetResponse = new AtomicReference<>();
        // Confirm the event is retrievable from the API
        // Will fail with a retryException if we can't get the event in this timeframe
        TestUtils.retry(10, 20, () -> {
            try {
                eventGetResponse.set(api.getEvent(eventId).execute());
            } catch (ApiException e) {
                System.out.println(String.format("Error getting event: %s", e));
                return false;
            }
            return true;
        });

        final Event fetchedEvent = eventGetResponse.get().getEvent();
        assertEquals(eventTitle, fetchedEvent.getTitle());
        assertEquals(eventText, fetchedEvent.getText());
        assertNotEquals("", fetchedEvent.getUrl());

        final Long start = fetchedEvent.getDateHappened() - 10;
        final Long end = start + 20;
        final EventPriority priority = fetchedEvent.getPriority();
        final String sources = fetchedEvent.getSourceTypeName();
        final String tags = String.join(",", fetchedEvent.getTags());
        final Boolean unaggregated = true;

        // Confirm the event is in the list of events returned from the API
        // Will fail with a retryException if we can't get the event in this timeframe
        TestUtils.retry(10, 20, () -> {
            List<Event> events;
            try {
                EventListResponse eventListResponse = api.listEvents().start(start).end(end).priority(priority)
                        .sources(sources).tags(tags).unaggregated(unaggregated).execute();
                events = eventListResponse.getEvents();
                if (!events.isEmpty() && events.contains(fetchedEvent)) {
                    return true;
                } else {
                    System.out.printf("Error: Event %s not in event list: %s", fetchedEvent, eventListResponse);
                    return false;
                }
            } catch (ApiException e) {
                System.out.println(String.format("Error getting list of events: %s", e));
                return false;
            }
        });
    }

    @Test
    public void eventListErrorTest() throws IOException {
        try {
            api.listEvents().start(new Long(345)).end(new Long(123)).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.listEvents().start(new Long(345)).end(new Long(123)).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void eventGetErrorTest() throws IOException {
        try {
            fakeAuthApi.getEvent(new Long((new Long(1234)))).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.getEvent(new Long((new Long(1234)))).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }
}
