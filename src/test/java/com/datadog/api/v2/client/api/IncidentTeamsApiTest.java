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

/** API tests for IncidentTeamsApi */
public class IncidentTeamsApiTest {

  private final IncidentTeamsApi api = new IncidentTeamsApi();

  /**
   * Create a new incident team
   *
   * <p>Creates a new incident team.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createIncidentTeamTest() throws ApiException {
    // IncidentTeamCreateRequest body = null;
    // IncidentTeamResponse response = api.createIncidentTeam()
    //        .body(body)
    //        .execute();
    // TODO: test validations
  }

  /**
   * Delete an existing incident team
   *
   * <p>Deletes an existing incident team.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteIncidentTeamTest() throws ApiException {
    // String teamId = null;
    // api.deleteIncidentTeam(teamId)
    //        .execute();
    // TODO: test validations
  }

  /**
   * Get details of an incident team
   *
   * <p>Get details of an incident team. If the &#x60;include[users]&#x60; query parameter is
   * provided, the included attribute will contain the users related to these incident teams.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getIncidentTeamTest() throws ApiException {
    // String teamId = null;
    // String include = null;
    // IncidentTeamResponse response = api.getIncidentTeam(teamId)
    //        .include(include)
    //        .execute();
    // TODO: test validations
  }

  /**
   * Get a list of all incident teams
   *
   * <p>Get all incident teams for the requesting user&#39;s organization. If the
   * &#x60;include[users]&#x60; query parameter is provided, the included attribute will contain the
   * users related to these incident teams.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void getIncidentTeamsTest() throws ApiException {
    // String include = null;
    // Long pageSize = null;
    // Long pageOffset = null;
    // IncidentTeamsResponse response = api.getIncidentTeams()
    //        .include(include)
    //        .pageSize(pageSize)
    //        .pageOffset(pageOffset)
    //        .execute();
    // TODO: test validations
  }

  /**
   * Update an existing incident team
   *
   * <p>Updates an existing incident team. Only provide the attributes which should be updated as
   * this request is a partial update.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateIncidentTeamTest() throws ApiException {
    // String teamId = null;
    // IncidentTeamUpdateRequest body = null;
    // IncidentTeamResponse response = api.updateIncidentTeam(teamId)
    //        .body(body)
    //        .execute();
    // TODO: test validations
  }
}
