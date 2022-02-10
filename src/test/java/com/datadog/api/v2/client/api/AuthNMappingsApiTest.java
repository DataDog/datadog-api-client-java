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

/** API tests for AuthNMappingsApi */
public class AuthNMappingsApiTest {

  private final AuthNMappingsApi api = new AuthNMappingsApi();

  /**
   * Create an AuthN Mapping
   *
   * <p>Create an AuthN Mapping.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createAuthNMappingTest() throws ApiException {
    // AuthNMappingCreateRequest body = null;
    // AuthNMappingResponse response = api.createAuthNMapping()
    //        .body(body)
    //        .execute();
    // TODO: test validations
  }

  /**
   * Delete an AuthN Mapping
   *
   * <p>Delete an AuthN Mapping specified by AuthN Mapping UUID.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteAuthNMappingTest() throws ApiException {
    // String authnMappingId = null;
    // api.deleteAuthNMapping(authnMappingId)
    //        .execute();
    // TODO: test validations
  }

  /**
   * Get an AuthN Mapping by UUID
   *
   * <p>Get an AuthN Mapping specified by the AuthN Mapping UUID.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getAuthNMappingTest() throws ApiException {
    // String authnMappingId = null;
    // AuthNMappingResponse response = api.getAuthNMapping(authnMappingId)
    //        .execute();
    // TODO: test validations
  }

  /**
   * List all AuthN Mappings
   *
   * <p>List all AuthN Mappings in the org.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void listAuthNMappingsTest() throws ApiException {
    // Long pageSize = null;
    // Long pageNumber = null;
    // AuthNMappingsSort sort = null;
    // List<String> include = null;
    // String filter = null;
    // AuthNMappingsResponse response = api.listAuthNMappings()
    //        .pageSize(pageSize)
    //        .pageNumber(pageNumber)
    //        .sort(sort)
    //        .include(include)
    //        .filter(filter)
    //        .execute();
    // TODO: test validations
  }

  /**
   * Edit an AuthN Mapping
   *
   * <p>Edit an AuthN Mapping.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateAuthNMappingTest() throws ApiException {
    // String authnMappingId = null;
    // AuthNMappingUpdateRequest body = null;
    // AuthNMappingResponse response = api.updateAuthNMapping(authnMappingId)
    //        .body(body)
    //        .execute();
    // TODO: test validations
  }
}
