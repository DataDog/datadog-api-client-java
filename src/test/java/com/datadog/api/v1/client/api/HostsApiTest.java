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
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.ws.rs.core.GenericType;
import java.io.IOException;

/**
 * API tests for HostsApi
 */
public class HostsApiTest extends V1ApiTest {

    private static HostsApi api;
    private static HostsApi fakeAuthApi;
    private static HostsApi unitAPI;
    private static MetricsApi metricsAPI;
    private static TagsApi tagsAPI;

    // ObjectMapper instance configure to not fail when encountering unknown properties
    private static ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    @BeforeClass
    public static void initAPI() {
        api = new HostsApi(generalApiClient);
        fakeAuthApi = new HostsApi(generalFakeAuthApiClient);
        unitAPI = new HostsApi(generalApiUnitTestClient);
        metricsAPI = new MetricsApi(generalApiClient);
        tagsAPI = new TagsApi(generalApiClient);
    }

    /**
     * Get all hosts for your organization
     *
     * ## Search Hosts This endpoint allows searching for hosts by name, alias, or tag. Hosts live within the past 3 hours are included. Results are paginated with a max of 1000 results at a time. ### Arguments: * **&#x60;filter&#x60;** [*optional*, *default* &#x3D; **None**]: Query string to filter search results. * **&#x60;sort_field&#x60;** [*optional*, *default* &#x3D; **cpu**]: Sort hosts by the given field. Options: **status, apps, cpu, iowait, load** * **&#x60;sort_dir&#x60;** [*optional*, *default* &#x3D; **desc**]: Direction of sort. Options: **asc, desc** * **&#x60;start&#x60;** [*optional*, *default* &#x3D; **0**]: Host result to start search from. * **&#x60;count&#x60;** [*optional*, *default* &#x3D; **100**]: Number of host results to return. Max 1000. * **&#x60;from&#x60;** [*optional*, *default* &#x3D; **now - 2 hours**]: Number of seconds since UNIX epoch from which you want to search your hosts.
     *
     * @throws ApiException
     *          if the Api call fails
     *
     * @throws TestUtils.RetryException
     *          if the specified resource couldn't be retrieved in a set timeframe
     */
    @Test
    public void hostsTest() throws ApiException, TestUtils.RetryException {
        long nowMillis = now.toInstant().toEpochMilli()/1000;
        String hostname = getUniqueEntityName();

        ApiResponse<String> response = sendRequest(
                "POST",
                "/api/v1/series",
                String.format(
                        "{\"series\":[{\"host\":\"%s\",\"metric\":\"java.client.test.metric\",\"points\":[[%f,0.0]],\"type\":\"gauge\"}]}",
                        hostname, (double)nowMillis
                ),
                new GenericType<String>(String.class)
        );
        assertEquals("{\"status\": \"ok\"}", response.getData());

        // wait for host to appear
        TestUtils.retry(10, 10, () -> {
            MetricsListResponse metrics;
            try {
                HostTags hostTagsResp = tagsAPI.getHostTags(hostname).execute();
            } catch(ApiException e) {
                System.out.println(String.format("Error getting list of host tags: %s", e));
                return false;
            }
            return true;
        });

        // test methods
        HostMuteSettings muteSettings = new HostMuteSettings()
                .message("muting for java tests")
                .end(nowMillis + 60);
        HostMuteResponse hostMuteResp = api.muteHost(hostname).body(muteSettings).execute();
        assertEquals("muting for java tests", hostMuteResp.getMessage());
        assertEquals(hostname, hostMuteResp.getHostname());
        assertEquals(nowMillis+60, hostMuteResp.getEnd().longValue());
        assertEquals("Muted", hostMuteResp.getAction());

        // Update the mute settings for this host
        muteSettings = new HostMuteSettings()
                .message("muting for test - updating")
                .end(nowMillis + 120);

        // This should fail since the override flag isn't set to true
        boolean failedAsExpected = false;
        try {
            api.muteHost(hostname).body(muteSettings).execute();
        } catch (ApiException e) {
            failedAsExpected = true;
        } finally {
            assertEquals(true, failedAsExpected);
        }

        // Set the override bit and confirm we can update the mute settings for this host
        muteSettings.override(true);
        hostMuteResp = api.muteHost(hostname).body(muteSettings).execute();
        assertEquals("muting for test - updating", hostMuteResp.getMessage());
        assertEquals(hostname, hostMuteResp.getHostname());
        assertEquals( nowMillis + 120, hostMuteResp.getEnd().longValue());
        assertEquals("Muted", hostMuteResp.getAction());

        // Unmute the host
        hostMuteResp = api.unmuteHost(hostname).execute();
        assertEquals("Unmuted", hostMuteResp.getAction());
        assertEquals(hostname, hostMuteResp.getHostname());
    }

    /**
     * Get total number of active hosts in your Datadog Account
     *
     * ## Get Host totals This endpoint returns the total number of active and up hosts in your Datadog account. Active means the host has reported in the past hour, and up means it has reported in the past two hours. ### Arguments: * **&#x60;from&#x60;** [*optional*, *default*&#x3D; **now - 2 hours**]:  Number of seconds since UNIX epoch from which you want to get the total number of active and up hosts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hostTotalsMockedTest() throws ApiException, IOException {
        stubFor(get(urlPathEqualTo("/api/v1/hosts/totals"))
                .withQueryParam("from", equalTo("123"))
                .willReturn(okJson(TestUtils.getFixture("v1/client/api/hosts_fixtures/host_totals.json")))
        );

        HostTotals actual = unitAPI.getHostTotals().from(123L).execute();
        assertEquals(20L, actual.getTotalActive().longValue());
        assertEquals(10L, actual.getTotalUp().longValue());
    }


    /**
     * Search hosts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hostsSearchMockedTest() throws ApiException, IOException {
        String fixtureData = TestUtils.getFixture("v1/client/api/hosts_fixtures/host_search.json");
        stubFor(get(urlPathEqualTo("/api/v1/hosts"))
                .withQueryParam("filter", equalTo("filter string"))
                .withQueryParam("count", equalTo("4"))
                .withQueryParam("from", equalTo("123"))
                .withQueryParam("sort_dir", equalTo("asc"))
                .withQueryParam("sort_field", equalTo("status"))
                .withQueryParam("start", equalTo("3"))
                .willReturn(okJson(fixtureData))
        );

        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

        HostListResponse response = unitAPI.listHosts()
                .filter("filter string")
                .count(4L)
                .from(123L)
                .sortDir("asc")
                .sortField("status")
                .start(3L).execute();
        HostListResponse expected = mapper.readValue(fixtureData, HostListResponse.class);

        assertEquals(expected, response);
    }

    @Test
    public void hostsListErrorsTest() throws IOException {
        try {
            api.listHosts().count(-1L).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.listHosts().count(-1L).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void hostsGetTotalsErrorsTest() throws IOException {
        try {
            api.getHostTotals().from(now.toEpochSecond() + 60).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.getHostTotals().from(now.toEpochSecond() + 60).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void hostsMuteErrorsTest() throws ApiException, IOException {
        long nowMillis = now.toInstant().toEpochMilli()/1000;
        String hostname = getUniqueEntityName();

        //Mute host a first time in order to trigger a 400
        HostMuteSettings muteSettings = new HostMuteSettings();
        muteSettings.setOverride(true);
        api.muteHost(hostname).body(muteSettings).execute();

        try {
            api.muteHost(hostname).body(new HostMuteSettings()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
             assertEquals(400, e.getCode());
             APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
             assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.muteHost(hostname).body(new HostMuteSettings()).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }

    @Test
    public void hostsUnmuteErrorsTest() throws IOException {
        long nowMillis = now.toInstant().toEpochMilli()/1000;
        String hostname = getUniqueEntityName();

        try {
            api.unmuteHost(hostname).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }

        try {
            fakeAuthApi.unmuteHost(hostname).execute();
            fail("Expected ApiException not thrown");
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
            APIErrorResponse error = objectMapper.readValue(e.getResponseBody(), APIErrorResponse.class);
            assertNotNull(error.getErrors());
        }
    }
}
