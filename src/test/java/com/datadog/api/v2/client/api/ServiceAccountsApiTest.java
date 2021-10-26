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

import com.datadog.api.v2.client.*;
import com.datadog.api.v2.client.auth.*;
import org.junit.Test;

/** API tests for ServiceAccountsApi */
public class ServiceAccountsApiTest {

    private final ServiceAccountsApi api = new ServiceAccountsApi();

    /**
     * Create an application key for this service account
     *
     * <p>Create an application key for this service account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createServiceAccountApplicationKeyTest() throws ApiException {
        // String serviceAccountId = null;
        // ApplicationKeyCreateRequest body = null;
        // ApplicationKeyResponse response = api.createServiceAccountApplicationKey(serviceAccountId)
        //        .body(body)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Delete an application key for this service account
     *
     * <p>Delete an application key owned by this service account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteServiceAccountApplicationKeyTest() throws ApiException {
        // String serviceAccountId = null;
        // String appKeyId = null;
        // api.deleteServiceAccountApplicationKey(serviceAccountId, appKeyId)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Get one application key for this service account
     *
     * <p>Get an application key owned by this service account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServiceAccountApplicationKeyTest() throws ApiException {
        // String serviceAccountId = null;
        // String appKeyId = null;
        // PartialApplicationKeyResponse response =
        // api.getServiceAccountApplicationKey(serviceAccountId, appKeyId)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List application keys for this service account
     *
     * <p>List all application keys available for this service account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listServiceAccountApplicationKeysTest() throws ApiException {
        // String serviceAccountId = null;
        // Long pageSize = null;
        // Long pageNumber = null;
        // ApplicationKeysSort sort = null;
        // String filter = null;
        // String filterCreatedAtStart = null;
        // String filterCreatedAtEnd = null;
        // ListApplicationKeysResponse response =
        // api.listServiceAccountApplicationKeys(serviceAccountId)
        //        .pageSize(pageSize)
        //        .pageNumber(pageNumber)
        //        .sort(sort)
        //        .filter(filter)
        //        .filterCreatedAtStart(filterCreatedAtStart)
        //        .filterCreatedAtEnd(filterCreatedAtEnd)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Edit an application key for this service account
     *
     * <p>Edit an application key owned by this service account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateServiceAccountApplicationKeyTest() throws ApiException {
        // String serviceAccountId = null;
        // String appKeyId = null;
        // ApplicationKeyUpdateRequest body = null;
        // PartialApplicationKeyResponse response =
        // api.updateServiceAccountApplicationKey(serviceAccountId, appKeyId)
        //        .body(body)
        //        .execute();
        // TODO: test validations
    }
}
