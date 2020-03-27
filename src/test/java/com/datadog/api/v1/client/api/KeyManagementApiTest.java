/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import org.junit.Test;

import java.io.IOException;

import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static org.junit.Assert.assertEquals;

/**
 * API tests for KeyManagementApi
 */
public class KeyManagementApiTest extends V1ApiTest {

    private final KeyManagementApi api = new KeyManagementApi(generalApiUnitTestClient);
    private final String apiUri = "/api/v1/api_key";
    private final String appUri = "/api/v1/application_key";
    private final String fixturePrefix = "v1/client/api/keys_fixtures";

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
        ApiKeyResponse response = api.createAPIKey().body(apiKey).execute();

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
        ApplicationKeyResponse response = api.createApplicationKey().body(applicationKey).execute();

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
        ApiKeyResponse response = api.deleteAPIKey(apiKeyName).execute();

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
        ApplicationKeyResponse response = api.deleteApplicationKey(appKeyName).execute();

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
    public void editAPIKeyTest() throws ApiException, IOException {
        String apiKeyName = "TestName";
        MappingBuilder stub = setupStub(apiUri + "/" + apiKeyName, fixturePrefix + "/edit_api_key.json", "put");
        stubFor(stub);

        // We're mocking the response so the query param we select can be anything
        ApiKey apiKey = new ApiKey().name("TestName");
        ApiKeyResponse response = api.editAPIKey(apiKeyName).body(apiKey).execute();

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
    public void editApplicationKeyTest() throws ApiException, IOException {
        // We're mocking the response so the query param we select can be anything
        String appKeyName = "TestName";
        MappingBuilder stub = setupStub(appUri + "/" + appKeyName, fixturePrefix + "/edit_app_key.json", "put");
        stubFor(stub);

        ApplicationKey applicationKey = new ApplicationKey().name("<NEW_APP_KEY_NAME>");
        ApplicationKeyResponse response = api.editApplicationKey(appKeyName).body(applicationKey).execute();

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

        ApiKeyResponse response = api.getAPIKey(key).execute();

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
    public void getAllAPIKeysTest() throws ApiException, IOException {
        MappingBuilder stub = setupStub(apiUri, fixturePrefix + "/get_all_api_keys.json", "get");
        stubFor(stub);

        ApiKeyListResponse response = api.getAllAPIKeys().execute();

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
    public void getAllApplicationKeysTest() throws ApiException, IOException {
        MappingBuilder stub = setupStub(appUri, fixturePrefix + "/get_all_app_keys.json", "get");
        stubFor(stub);

        ApplicationKeyListResponse response = api.getAllApplicationKeys().execute();

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

        ApplicationKeyResponse response = api.getApplicationKey(key).execute();

        // Assert values match whats in get_app_key.json
        assertEquals(response.getApplicationKey().getOwner(), "john@example.com");
        assertEquals(response.getApplicationKey().getHash(), "31111111111111111111aaaaaaaaaaaaaaaaaaaa");
        assertEquals(response.getApplicationKey().getName(), "<APP_KEY_NAME>");
    }

}
