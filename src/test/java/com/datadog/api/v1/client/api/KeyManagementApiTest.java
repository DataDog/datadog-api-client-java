/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

/**
 * API tests for KeyManagementApi
 */
public class KeyManagementApiTest extends V1ApiTest {

    private final KeyManagementApi api = new KeyManagementApi(generalApiClient);
    private final KeyManagementApi unitApi = new KeyManagementApi(generalApiUnitTestClient);
    private final KeyManagementApi fakeAuthApi = new KeyManagementApi(generalFakeAuthApiClient);

    private ArrayList<ApplicationKeyResponse> deleteAppKeys = null;

    private final String apiUri = "/api/v1/api_key";
    private final String appUri = "/api/v1/application_key";
    private final String fixturePrefix = "v1/client/api/keys_fixtures";

    @Before
    public void resetTest() {
        deleteAppKeys = new ArrayList<>();
    }

    @After
    public void deleteAppAndApiKeys() {
        if (deleteAppKeys != null) {
            for (ApplicationKeyResponse apiKeyResponse : deleteAppKeys) {
                try {
                    api.deleteApplicationKey(apiKeyResponse.getApplicationKey().getHash()).execute();;
                } catch (ApiException e) {
                    // doesn't exist => continue
                    continue;
                }
            }
        }
    }

    /**
     * Create an API key with a given name.
     *
     * ## Overview Creates an API key ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your API key.
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws IOException
     *          if the fixture data cannot be loaded
     */
    @Test
    public void createAPIKeyTest() throws ApiException, IOException {
        String apiKeyName = "TestName";
        MappingBuilder stub = setupStub(apiUri, fixturePrefix + "/create_api_key.json", "post");
        stubFor(stub);

        ApiKey apiKey = new ApiKey().name(apiKeyName);
        ApiKeyResponse response = unitApi.createAPIKey().body(apiKey).execute();

        // Assert values match whats in create_api_key.json
        assertEquals(response.getApiKey().getCreatedBy(), "john@example.com");
        assertEquals(response.getApiKey().getName(), "<API_KEY_NAME>");
        assertEquals(response.getApiKey().getKey(), "3111111111111111aaaaaaaaaaaaaaaa");
        assertEquals(response.getApiKey().getCreated(), "2019-04-05 09:47:00");
    }

    /**
     * Create an application key with a given name.
     *
     * ## Overview Create an application key with a given name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your application key.
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws IOException
     *          if the fixture data cannot be loaded
     */
    @Test
    public void createApplicationKeyTest() throws ApiException, IOException {
        String appKeyName = "TestName";
        MappingBuilder stub = setupStub(appUri, fixturePrefix + "/create_app_key.json", "post");
        stubFor(stub);

        ApplicationKey applicationKey = new ApplicationKey().name(appKeyName);
        ApplicationKeyResponse response = unitApi.createApplicationKey().body(applicationKey).execute();

        // Assert values match whats in create_app_key.json
        assertEquals(response.getApplicationKey().getOwner(), "john@example.com");
        assertEquals(response.getApplicationKey().getHash(), "31111111111111111111aaaaaaaaaaaaaaaaaaaa");
        assertEquals(response.getApplicationKey().getName(), "<APP_KEY_NAME>");
    }

    /**
     * Delete a given API key.
     *
     * ## Overview Delete a given API key. ### ARGUMENTS This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws IOException
     *          if the fixture data cannot be loaded
     */
    @Test
    public void deleteAPIKeyTest() throws ApiException, IOException {
        String apiKeyName = "TestName";
        MappingBuilder stub = setupStub(apiUri + "/" + apiKeyName, fixturePrefix + "/delete_api_key.json", "delete");
        stubFor(stub);
        ApiKeyResponse response = unitApi.deleteAPIKey(apiKeyName).execute();

        // Assert values match whats in delete_api_key.json
        assertEquals(response.getApiKey().getCreatedBy(), "john@example.com");
        assertEquals(response.getApiKey().getName(), "<API_KEY_NAME>");
        assertEquals(response.getApiKey().getKey(), "3111111111111111aaaaaaaaaaaaaaaa");
        assertEquals(response.getApiKey().getCreated(), "2019-04-05 09:47:00");
    }


    /**
     * Delete a given application key.
     *
     * ## Overview Delete a given application key. ### ARGUMENTS This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws IOException
     *          if the fixture data cannot be loaded
     */
    @Test
    public void deleteApplicationKeyTest() throws ApiException, IOException {
        String appKeyName = "TestName";
        MappingBuilder stub = setupStub(appUri + "/" + appKeyName, fixturePrefix + "/delete_app_key.json", "delete");
        stubFor(stub);
        ApplicationKeyResponse response = unitApi.deleteApplicationKey(appKeyName).execute();

        // Assert values match whats in delete_api_key.json
        assertEquals(response.getApplicationKey().getOwner(), "john@example.com");
        assertEquals(response.getApplicationKey().getHash(), "31111111111111111111aaaaaaaaaaaaaaaaaaaa");
        assertEquals(response.getApplicationKey().getName(), "<APP_KEY_NAME>");
    }


    /**
     * Edit an API key name.
     *
     * ## Overview Edit an API key name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your API key.
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws IOException
     *          if the fixture data cannot be loaded
     */
    @Test
    public void updateAPIKeyTest() throws ApiException, IOException {
        String apiKeyName = "TestName";
        MappingBuilder stub = setupStub(apiUri + "/" + apiKeyName, fixturePrefix + "/edit_api_key.json", "put");
        stubFor(stub);

        // We're mocking the response so the query param we select can be anything
        ApiKey apiKey = new ApiKey().name("TestName");
        ApiKeyResponse response = unitApi.updateAPIKey(apiKeyName).body(apiKey).execute();

        // Assert values match whats in edit_api_key.json
        assertEquals(response.getApiKey().getCreatedBy(), "john@example.com");
        assertEquals(response.getApiKey().getName(), "<API_KEY_NAME>");
        assertEquals(response.getApiKey().getKey(), "3111111111111111aaaaaaaaaaaaaaaa");
        assertEquals(response.getApiKey().getCreated(), "2019-04-05 09:47:00");
    }


    /**
     * Edit an application key name.
     *
     * ## Overview Edit an application key name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your application key.
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws IOException
     *          if the fixture data cannot be loaded
     */
    @Test
    public void updateApplicationKeyTest() throws ApiException, IOException {
        // We're mocking the response so the query param we select can be anything
        String appKeyName = "TestName";
        MappingBuilder stub = setupStub(appUri + "/" + appKeyName, fixturePrefix + "/edit_app_key.json", "put");
        stubFor(stub);

        ApplicationKey applicationKey = new ApplicationKey().name("<NEW_APP_KEY_NAME>");
        ApplicationKeyResponse response = unitApi.updateApplicationKey(appKeyName).body(applicationKey).execute();

        // Assert values match whats in edit_api_key.json
        assertEquals(response.getApplicationKey().getOwner(), "john@example.com");
        assertEquals(response.getApplicationKey().getHash(), "31111111111111111111aaaaaaaaaaaaaaaaaaaa");
        assertEquals(response.getApplicationKey().getName(), "<NEW_APP_KEY_NAME>");
    }


    /**
     * Get a given API key.
     *
     * ## Overview Get a given API key. ### ARGUMENTS This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws IOException
     *          if the fixture data cannot be loaded
     */
    @Test
    public void getAPIKeyTest() throws ApiException, IOException {
        // We're mocking the response so the query param we select can be anything
        String key = "TestName";
        MappingBuilder stub = setupStub(apiUri + "/" + key, fixturePrefix + "/get_api_key.json", "get");
        stubFor(stub);

        ApiKeyResponse response = unitApi.getAPIKey(key).execute();

        // Assert values match whats in get_api_key.json
        assertEquals(response.getApiKey().getCreatedBy(), "john@example.com");
        assertEquals(response.getApiKey().getName(), "<API_KEY_NAME>");
        assertEquals(response.getApiKey().getKey(), "3111111111111111aaaaaaaaaaaaaaaa");
        assertEquals(response.getApiKey().getCreated(), "2019-04-05 09:47:00");
    }


    /**
     * Get all API keys available for your account.
     *
     * ## Overview Get all API keys available for your account. ### ARGUMENTS This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws IOException
     *          if the fixture data cannot be loaded
     */
    @Test
    public void listAPIKeysTest() throws ApiException, IOException {
        MappingBuilder stub = setupStub(apiUri, fixturePrefix + "/get_all_api_keys.json", "get");
        stubFor(stub);

        ApiKeyListResponse response = unitApi.listAPIKeys().execute();

        // Assert values match whats in get_all_api_keys.json
        assertEquals(response.getApiKeys().size(), 2);

        assertEquals(response.getApiKeys().get(0).getCreatedBy(), "john@example.com");
        assertEquals(response.getApiKeys().get(0).getName(), "<API_KEY_NAME>");
        assertEquals(response.getApiKeys().get(0).getKey(), "1111111111111111aaaaaaaaaaaaaaaa");
        assertEquals(response.getApiKeys().get(0).getCreated(), "2019-04-05 09:20:30");

        assertEquals(response.getApiKeys().get(1).getCreatedBy(), "jane@example.com");
        assertEquals(response.getApiKeys().get(1).getName(), "<API_KEY_NAME_2>");
        assertEquals(response.getApiKeys().get(1).getKey(), "2111111111111111aaaaaaaaaaaaaaaa");
        assertEquals(response.getApiKeys().get(1).getCreated(), "2019-04-05 09:19:53");
    }


    /**
     * Get all application keys available for your account.
     *
     * ## Overview Get all application keys available for your account. ### ARGUMENTS This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws IOException
     *          if the fixture data cannot be loaded
     */
    @Test
    public void listApplicationKeysTest() throws ApiException, IOException {
        MappingBuilder stub = setupStub(appUri, fixturePrefix + "/get_all_app_keys.json", "get");
        stubFor(stub);

        ApplicationKeyListResponse response = unitApi.listApplicationKeys().execute();

        // Assert values match whats in get_app_key.json
        assertEquals(response.getApplicationKeys().size(), 2);

        assertEquals(response.getApplicationKeys().get(0).getOwner(), "john@example.com");
        assertEquals(response.getApplicationKeys().get(0).getHash(), "11111111111111111111aaaaaaaaaaaaaaaaaaaa");
        assertEquals(response.getApplicationKeys().get(0).getName(), "<APP_KEY_NAME>");

        assertEquals(response.getApplicationKeys().get(1).getOwner(), "jane@example.com");
        assertEquals(response.getApplicationKeys().get(1).getHash(), "21111111111111111111aaaaaaaaaaaaaaaaaaaa");
        assertEquals(response.getApplicationKeys().get(1).getName(), "<APP_KEY_NAME_2>");
    }


    /**
     * Get a given application key.
     *
     * ## Overview Get a given application key. ### ARGUMENTS This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws IOException
     *          if the fixture data cannot be loaded
     */
    @Test
    public void getApplicationKeyTest() throws ApiException, IOException {
        // We're mocking the response so the query param we select can be anything
        String key = "TestName";
        MappingBuilder stub = setupStub(appUri + "/" + key, fixturePrefix + "/get_app_key.json", "get");
        stubFor(stub);

        ApplicationKeyResponse response = unitApi.getApplicationKey(key).execute();

        // Assert values match whats in get_app_key.json
        assertEquals(response.getApplicationKey().getOwner(), "john@example.com");
        assertEquals(response.getApplicationKey().getHash(), "31111111111111111111aaaaaaaaaaaaaaaaaaaa");
        assertEquals(response.getApplicationKey().getName(), "<APP_KEY_NAME>");
    }

    @Test
    public void aPIKeysMgmtListErrorsTest() {
        try {
            fakeAuthApi.listAPIKeys().execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void aPIKeysMgmtCreateErrorsTest() {
        try {
            api.createAPIKey().body(new ApiKey()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.createAPIKey().body(new ApiKey()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void aPIKeysMgmtGetErrorsTest() {
        try {
            fakeAuthApi.getAPIKey("whatever").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.getAPIKey("whatever").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void aPIKeysMgmtUpdateErrorsTest() {
        try {
            api.updateAPIKey("whatever").body(new ApiKey()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.updateAPIKey("whatever").body(new ApiKey()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.updateAPIKey("whatever").body(new ApiKey().name("nonexistent key")).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void aPIKeysMgmtDelete400ErrorTest() throws IOException {
        String fixtureData = TestUtils.getFixture(fixturePrefix + "/invalid_number_of_keys_400.json");
        stubFor(delete(urlPathEqualTo(apiUri + "/whatever"))
                .willReturn(okJson(fixtureData).withStatus(400))
        );
        // Mocked because we need 0 API keys to trigger the 400
        try {
            unitApi.deleteAPIKey("whatever").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }
    }

    @Test
    public void aPIKeysMgmtDeleteErrorsTest() {
        try {
            fakeAuthApi.deleteAPIKey("whatever").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.deleteAPIKey("whatever").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void aPPKeysMgmtListErrorsTest() {
        try {
            fakeAuthApi.listApplicationKeys().execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void aPPKeysMgmtCreateErrorsTest() {
        try {
            api.createApplicationKey().body(new ApplicationKey()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.createApplicationKey().body(new ApplicationKey()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }
    }

    @Test
    public void aPPKeysMgmtCreate409ErrorsTest() throws ApiException {
        // This test case does not support reply from recording
        assumeTrue(TestUtils.isRecording());

        long nowMillis = now.toInstant().toEpochMilli()/1000;
        String testAppKeyName = String.format("%s:%d", name.getMethodName(), nowMillis);

        //Create an APP key to trigger 409 conflict
        ApplicationKeyResponse response = api.createApplicationKey().body(new ApplicationKey().name(testAppKeyName)).execute();

        try {
            api.createApplicationKey().body(new ApplicationKey().name(testAppKeyName)).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            api.deleteApplicationKey(response.getApplicationKey().getHash()).execute();
            assertEquals(409, e.getCode());
        }
    }

    @Test
    public void aPPKeysMgmtGetErrorsTest() {
        try {
            fakeAuthApi.getApplicationKey("whatever").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.getApplicationKey("whatever").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void aPPKeysMgmtUpdateErrorsTest() {
        try {
            api.updateApplicationKey("whatever").body(new ApplicationKey()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(400, e.getCode());
        }

        try {
            fakeAuthApi.updateApplicationKey("whatever").body(new ApplicationKey()).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.updateApplicationKey("whatever").body(new ApplicationKey().name("nonexistent key")).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }

    @Test
    public void aPPKeysMgmtUpdate409ErrorsTest() throws ApiException {
        // This test case does not support reply from recording
        assumeTrue(TestUtils.isRecording());

        // Create two app keys to trigger the 409 conflict
        String testAppKeyName1 = String.format("%s:%d", name.getMethodName(), now.toInstant().toEpochMilli()/1000);
        ApplicationKeyResponse testAppKeyresponse1 = api.createApplicationKey().body(new ApplicationKey().name(testAppKeyName1)).execute();
        deleteAppKeys.add(testAppKeyresponse1);

        String testAppKeyName2 = String.format("%s:%d-two", name.getMethodName(), now.toInstant().toEpochMilli()/1000);
        ApplicationKeyResponse testAppKeyresponse2 = api.createApplicationKey().body(new ApplicationKey().name(testAppKeyName2)).execute();
        deleteAppKeys.add(testAppKeyresponse2);

        try {
            api.updateApplicationKey(testAppKeyresponse1.getApplicationKey().getHash()).body(new ApplicationKey().name(testAppKeyName2)).execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(409, e.getCode());
        }
    }

    @Test
    public void aPPKeysMgmtDeleteErrorsTest() throws ApiException {
        // This test case does not support reply from recording
        try {
            fakeAuthApi.deleteApplicationKey("whatever").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(403, e.getCode());
        }

        try {
            api.deleteApplicationKey("whatever").execute();
            throw new AssertionError();
        } catch (ApiException e) {
            assertEquals(404, e.getCode());
        }
    }
}