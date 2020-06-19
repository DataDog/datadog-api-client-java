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

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.ArrayList;

/**
 * API tests for TagsApi
 */
public class TagsApiTest extends V1ApiTest {

    private static TagsApi api;
    private static TagsApi fakeAuthApi;
    private static MetricsApi metricsAPI;

    // ObjectMapper instance configure to not fail when encountering unknown properties
    private static ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    @Override
    public String getTracingEndpoint() {
        return "tags";
    }

    @BeforeClass
    public static void initAPI() {
        api = new TagsApi(generalApiClient);
        fakeAuthApi = new TagsApi(generalFakeAuthApiClient);
        metricsAPI = new MetricsApi(generalApiClient);
    }

    @Test
    public void tagsTest() throws ApiException, TestUtils.RetryException {
        String commonHostTag = "test:client_java";
        long nowSeconds = now.toEpochSecond();
        String hostname = getUniqueEntityName();

        // create host by sending a metric
        ApiResponse<String> response = sendRequest(
                "POST",
                "/api/v1/series",
                String.format(
                        "{\"series\":[{\"host\":\"%s\",\"metric\":\"java.client.test.metric\",\"points\":[[%f,0.0]],\"type\":\"gauge\"}]}",
                        hostname, (double)nowSeconds
                ),
                new GenericType<String>(String.class)
        );
        assertEquals("{\"status\": \"ok\"}", response.getData());

        // wait for host to appear
        TestUtils.retry(10, 10, () -> {
            MetricsListResponse metrics;
            try {
                HostTags hostTagsResp = api.getHostTags(hostname).execute();
            } catch(ApiException e) {
                System.out.println(String.format("Error getting list of host tags: %s", e));
                return false;
            }
            return true;
        });

        // test methods
        HostTags hostTags = new HostTags().tags(new ArrayList<String>());
        hostTags.addTagsItem(commonHostTag);
        HostTags addTagsResp = api.createHostTags(hostname).body(hostTags).source("datadog").execute();

        // Confirm we can add host tags
        assertEquals(hostname, addTagsResp.getHost());
        assertEquals(hostTags.getTags(), addTagsResp.getTags());

        // Confirm we can get host tags
        HostTags getTagsResp = api.getHostTags(hostname).source("datadog").execute();
        assertEquals(hostTags.getTags(), getTagsResp.getTags());

        // Test getting tags for an unknown source
        getTagsResp = api.getHostTags(hostname).source("users").execute();
        assertEquals(0, getTagsResp.getTags().size());

        // wait for host to appear
        TestUtils.retry(10, 10, () -> {
            MetricsListResponse metrics;
            try {
                TagToHosts hostTagsResp = api.listHostTags().source("datadog").execute();
                return hostTagsResp.getTags().containsKey(commonHostTag);
            } catch(ApiException e) {
                System.out.println(String.format("Error getting list of host tags: %s", e));
                return false;
            }
        });

        // Confirm we don't receive tags under an unknown source
        TagToHosts hostTagsResp = api.listHostTags().source("users").execute();
        assertThat(hostTagsResp.getTags().keySet(), not(hasItem(commonHostTag)));

        // Update host tags
        HostTags updatedHostTags = new HostTags().tags(new ArrayList<String>());
        updatedHostTags.addTagsItem("foo:bar");
        updatedHostTags.addTagsItem("toto:tata");
        HostTags updateTagsResp = api.updateHostTags(hostname).body(updatedHostTags).source("datadog").execute();
        assertEquals(updatedHostTags.getTags(), updateTagsResp.getTags());
        assertEquals(hostname, updateTagsResp.getHost());

        // Remove tags
        api.deleteHostTags(hostname).source("datadog").execute();
    }

    @Test
    public void listTagsErrorsTest() throws IOException {
        try {
            fakeAuthApi.listHostTags().source("nosource").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.listHostTags().source("nosource").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void getTagsErrorsTest() throws IOException {
        try {
            fakeAuthApi.getHostTags("notahostname1234").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.getHostTags("notahostname1234").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void createTagsErrorsTest() throws IOException {
        try {
            fakeAuthApi.createHostTags("notahostname1234").body(new HostTags()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.createHostTags("notahostname1234").body(new HostTags()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void updateTagsErrorsTest() throws IOException {
        try {
            fakeAuthApi.updateHostTags("notahostname1234").body(new HostTags()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.updateHostTags("notahostname1234").body(new HostTags()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void deleteTagsErrorsTest() throws IOException {
        try {
            fakeAuthApi.deleteHostTags("notahostname1234").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            api.deleteHostTags("notahostname1234").execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }
}
