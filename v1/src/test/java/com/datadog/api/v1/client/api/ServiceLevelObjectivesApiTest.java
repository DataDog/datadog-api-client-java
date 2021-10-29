/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.*;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.CheckCanDeleteSLOResponse;
import com.datadog.api.v1.client.model.SLOBulkDeleteResponse;
import com.datadog.api.v1.client.model.SLODeleteResponse;
import com.datadog.api.v1.client.model.SLOHistoryResponse;
import com.datadog.api.v1.client.model.SLOListResponse;
import com.datadog.api.v1.client.model.SLOResponse;
import com.datadog.api.v1.client.model.SLOTimeframe;
import com.datadog.api.v1.client.model.ServiceLevelObjective;
import com.datadog.api.v1.client.model.ServiceLevelObjectiveRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServiceLevelObjectivesApi
 */
public class ServiceLevelObjectivesApiTest {

    private final ServiceLevelObjectivesApi api = new ServiceLevelObjectivesApi();

    /**
     * Check if SLOs can be safely deleted
     *
     * Check if an SLO can be safely deleted. For example, assure an SLO can be deleted without disrupting a dashboard.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkCanDeleteSLOTest() throws ApiException {
        //String ids = null;
        //CheckCanDeleteSLOResponse response = api.checkCanDeleteSLO()
        //        .ids(ids)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Create an SLO object
     *
     * Create a service level objective object.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSLOTest() throws ApiException {
        //ServiceLevelObjectiveRequest body = null;
        //SLOListResponse response = api.createSLO()
        //        .body(body)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Delete an SLO
     *
     * Permanently delete the specified service level objective object.  If an SLO is used in a dashboard, the &#x60;DELETE /v1/slo/&#x60; endpoint returns a 409 conflict error because the SLO is referenced in a dashboard.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSLOTest() throws ApiException {
        //String sloId = null;
        //String force = null;
        //SLODeleteResponse response = api.deleteSLO(sloId)
        //        .force(force)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Bulk Delete SLO Timeframes
     *
     * Delete (or partially delete) multiple service level objective objects.  This endpoint facilitates deletion of one or more thresholds for one or more service level objective objects. If all thresholds are deleted, the service level objective object is deleted as well.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSLOTimeframeInBulkTest() throws ApiException {
        //Map<String, List<SLOTimeframe>> body = null;
        //SLOBulkDeleteResponse response = api.deleteSLOTimeframeInBulk()
        //        .body(body)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Get an SLO&#39;s details
     *
     * Get a service level objective object.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSLOTest() throws ApiException {
        //String sloId = null;
        //Boolean withConfiguredAlertIds = null;
        //SLOResponse response = api.getSLO(sloId)
        //        .withConfiguredAlertIds(withConfiguredAlertIds)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Get an SLO&#39;s history
     *
     * Get a specific SLO’s history, regardless of its SLO type.  The detailed history data is structured according to the source data type. For example, metric data is included for event SLOs that use the metric source, and monitor SLO types include the monitor transition history.  **Note:** There are different response formats for event based and time based SLOs. Examples of both are shown.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSLOHistoryTest() throws ApiException {
        //String sloId = null;
        //Long fromTs = null;
        //Long toTs = null;
        //Double target = null;
        //SLOHistoryResponse response = api.getSLOHistory(sloId)
        //        .fromTs(fromTs)
        //        .toTs(toTs)
        //        .target(target)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Get all SLOs
     *
     * Get a list of service level objective objects for your organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSLOsTest() throws ApiException {
        //String ids = null;
        //String query = null;
        //String tagsQuery = null;
        //String metricsQuery = null;
        //Long limit = null;
        //Long offset = null;
        //SLOListResponse response = api.listSLOs()
        //        .ids(ids)
        //        .query(query)
        //        .tagsQuery(tagsQuery)
        //        .metricsQuery(metricsQuery)
        //        .limit(limit)
        //        .offset(offset)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update an SLO
     *
     * Update the specified service level objective object.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSLOTest() throws ApiException {
        //String sloId = null;
        //ServiceLevelObjective body = null;
        //SLOListResponse response = api.updateSLO(sloId)
        //        .body(body)
        //        .execute();
        // TODO: test validations
    }

}
