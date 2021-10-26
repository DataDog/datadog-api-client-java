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
import org.junit.Test;

/** API tests for ServiceLevelObjectiveCorrectionsApi */
public class ServiceLevelObjectiveCorrectionsApiTest {

    private final ServiceLevelObjectiveCorrectionsApi api = new ServiceLevelObjectiveCorrectionsApi();

    /**
     * Create an SLO correction
     *
     * <p>Create an SLO Correction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSLOCorrectionTest() throws ApiException {
        // SLOCorrectionCreateRequest body = null;
        // SLOCorrectionResponse response = api.createSLOCorrection()
        //        .body(body)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Delete an SLO Correction
     *
     * <p>Permanently delete the specified SLO Correction object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSLOCorrectionTest() throws ApiException {
        // String sloCorrectionId = null;
        // api.deleteSLOCorrection(sloCorrectionId)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Get an SLO correction for an SLO
     *
     * <p>Get an SLO Correction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSLOCorrectionTest() throws ApiException {
        // String sloCorrectionId = null;
        // SLOCorrectionResponse response = api.getSLOCorrection(sloCorrectionId)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Get all SLO corrections
     *
     * <p>Get all Service Level Objective Corrections
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSLOCorrectionTest() throws ApiException {
        // SLOCorrectionListResponse response = api.listSLOCorrection()
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update an SLO Correction
     *
     * <p>Update the specified SLO correction object object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSLOCorrectionTest() throws ApiException {
        // String sloCorrectionId = null;
        // SLOCorrectionUpdateRequest body = null;
        // SLOCorrectionResponse response = api.updateSLOCorrection(sloCorrectionId)
        //        .body(body)
        //        .execute();
        // TODO: test validations
    }
}
