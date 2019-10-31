/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.client.v1.api;

import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.model.ApiKey;
import com.datadog.api.client.v1.model.ApiKeyListResponse;
import com.datadog.api.client.v1.model.ApiKeyResponse;
import com.datadog.api.client.v1.model.ApplicationKey;
import com.datadog.api.client.v1.model.ApplicationKeyListResponse;
import com.datadog.api.client.v1.model.ApplicationKeyResponse;
import com.datadog.api.client.v1.model.Error400;
import com.datadog.api.client.v1.model.Error403;
import com.datadog.api.client.v1.model.Error404;
import com.datadog.api.client.v1.model.Error409;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KeysApi
 */
@Ignore
public class KeysApiTest {

    private final KeysApi api = new KeysApi();

    
    /**
     * Create an API key with a given name.
     *
     * ## Overview Creates an API key ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your API key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAPIKeyTest() throws ApiException {
        ApiKey apiKey = null;
        ApiKeyResponse response = api.createAPIKey(apiKey);

        // TODO: test validations
    }
    
    /**
     * Create an application key with a given name.
     *
     * ## Overview Create an application key with a given name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your application key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createApplicationKeyTest() throws ApiException {
        ApplicationKey applicationKey = null;
        ApplicationKeyResponse response = api.createApplicationKey(applicationKey);

        // TODO: test validations
    }
    
    /**
     * Delete a given API key.
     *
     * ## Overview Delete a given API key. ### ARGUMENTS This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAPIKeyTest() throws ApiException {
        String key = null;
        ApiKeyResponse response = api.deleteAPIKey(key);

        // TODO: test validations
    }
    
    /**
     * Delete a given application key.
     *
     * ## Overview Delete a given application key. ### ARGUMENTS This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteApplicationKeyTest() throws ApiException {
        String key = null;
        ApplicationKeyResponse response = api.deleteApplicationKey(key);

        // TODO: test validations
    }
    
    /**
     * Edit an API key name.
     *
     * ## Overview Edit an API key name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your API key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editAPIKeyTest() throws ApiException {
        String key = null;
        ApiKey apiKey = null;
        ApiKeyResponse response = api.editAPIKey(key, apiKey);

        // TODO: test validations
    }
    
    /**
     * Edit an application key name.
     *
     * ## Overview Edit an application key name. ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: Name of your application key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editApplicationKeyTest() throws ApiException {
        String key = null;
        ApplicationKey applicationKey = null;
        ApplicationKeyResponse response = api.editApplicationKey(key, applicationKey);

        // TODO: test validations
    }
    
    /**
     * Get a given API key.
     *
     * ## Overview Get a given API key. ### ARGUMENTS This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIKeyTest() throws ApiException {
        String key = null;
        ApiKeyResponse response = api.getAPIKey(key);

        // TODO: test validations
    }
    
    /**
     * Get all API keys available for your account.
     *
     * ## Overview Get all API keys available for your account. ### ARGUMENTS This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAPIKeysTest() throws ApiException {
        ApiKeyListResponse response = api.getAllAPIKeys();

        // TODO: test validations
    }
    
    /**
     * Get all application keys available for your account.
     *
     * ## Overview Get all application keys available for your account. ### ARGUMENTS This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllApplicationKeysTest() throws ApiException {
        ApplicationKeyListResponse response = api.getAllApplicationKeys();

        // TODO: test validations
    }
    
    /**
     * Get a given application key.
     *
     * ## Overview Get a given application key. ### ARGUMENTS This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApplicationKeyTest() throws ApiException {
        String key = null;
        ApplicationKeyResponse response = api.getApplicationKey(key);

        // TODO: test validations
    }
    
}
