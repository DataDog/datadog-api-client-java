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

/** API tests for MetricsApi */
public class MetricsApiTest {

  private final MetricsApi api = new MetricsApi();

  /**
   * Create a Tag Configuration
   *
   * <p>Create and define a list of queryable tag keys for a count/gauge/rate/distribution metric.
   * Can only be used with application keys of users with the &#x60;Manage Tags for Metrics&#x60;
   * permission.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void createTagConfigurationTest() throws ApiException {
    // String metricName = null;
    // MetricTagConfigurationCreateRequest body = null;
    // MetricTagConfigurationResponse response = api.createTagConfiguration(metricName)
    //        .body(body)
    //        .execute();
    // TODO: test validations
  }

  /**
   * Delete a Tag Configuration
   *
   * <p>Deletes a metric&#39;s tag configuration. Can only be used with application keys from users
   * with the &#x60;Manage Tags for Metrics&#x60; permission.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void deleteTagConfigurationTest() throws ApiException {
    // String metricName = null;
    // api.deleteTagConfiguration(metricName)
    //        .execute();
    // TODO: test validations
  }

  /**
   * List Tag Configuration by Name
   *
   * <p>Returns the tag configuration for the given metric name.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void listTagConfigurationByNameTest() throws ApiException {
    // String metricName = null;
    // MetricTagConfigurationResponse response = api.listTagConfigurationByName(metricName)
    //        .execute();
    // TODO: test validations
  }

  /**
   * List Tag Configurations
   *
   * <p>Returns all configured count/gauge/rate/distribution metric names (with additional filters
   * if specified).
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void listTagConfigurationsTest() throws ApiException {
    // Boolean filterConfigured = null;
    // String filterTagsConfigured = null;
    // MetricTagConfigurationMetricTypes filterMetricType = null;
    // Boolean filterIncludePercentiles = null;
    // MetricsAndMetricTagConfigurationsResponse response = api.listTagConfigurations()
    //        .filterConfigured(filterConfigured)
    //        .filterTagsConfigured(filterTagsConfigured)
    //        .filterMetricType(filterMetricType)
    //        .filterIncludePercentiles(filterIncludePercentiles)
    //        .execute();
    // TODO: test validations
  }

  /**
   * Update a Tag Configuration
   *
   * <p>Update the tag configuration of a metric. Can only be used with application keys from users
   * with the &#x60;Manage Tags for Metrics&#x60; permission.
   *
   * @throws ApiException if the Api call fails
   */
  @Test
  public void updateTagConfigurationTest() throws ApiException {
    // String metricName = null;
    // MetricTagConfigurationUpdateRequest body = null;
    // MetricTagConfigurationResponse response = api.updateTagConfiguration(metricName)
    //        .body(body)
    //        .execute();
    // TODO: test validations
  }
}
