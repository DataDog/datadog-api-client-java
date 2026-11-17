/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Data Datadog collects from GitHub Costs, keyed by dataflow id. */
@JsonPropertyOrder({
  GitHubCostsIntegrationDataflowsResponse.JSON_PROPERTY_GITHUB_CLOUD_COST_METRICS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GitHubCostsIntegrationDataflowsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GITHUB_CLOUD_COST_METRICS = "github-cloud-cost-metrics";
  private GitHubCostsCloudCostMetricsIntegrationDataflowResponse githubCloudCostMetrics;

  public GitHubCostsIntegrationDataflowsResponse githubCloudCostMetrics(
      GitHubCostsCloudCostMetricsIntegrationDataflowResponse githubCloudCostMetrics) {
    this.githubCloudCostMetrics = githubCloudCostMetrics;
    this.unparsed |= githubCloudCostMetrics.unparsed;
    return this;
  }

  /**
   * GitHub costs for Actions, Packages, Copilot, storage, and other billed products, estimated from
   * list prices and usage, including discounts when available. Used by <a
   * href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost Management</a>. Requires an
   * enterprise or organization on GitHub's enhanced billing platform; without it this dataflow
   * collects no data. This dataflow is always on and cannot be turned off, which is why it appears
   * in responses only.
   *
   * @return githubCloudCostMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GITHUB_CLOUD_COST_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GitHubCostsCloudCostMetricsIntegrationDataflowResponse getGithubCloudCostMetrics() {
    return githubCloudCostMetrics;
  }

  public void setGithubCloudCostMetrics(
      GitHubCostsCloudCostMetricsIntegrationDataflowResponse githubCloudCostMetrics) {
    this.githubCloudCostMetrics = githubCloudCostMetrics;
    if (githubCloudCostMetrics != null) {
      this.unparsed |= githubCloudCostMetrics.unparsed;
    }
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return GitHubCostsIntegrationDataflowsResponse
   */
  @JsonAnySetter
  public GitHubCostsIntegrationDataflowsResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this GitHubCostsIntegrationDataflowsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitHubCostsIntegrationDataflowsResponse gitHubCostsIntegrationDataflowsResponse =
        (GitHubCostsIntegrationDataflowsResponse) o;
    return Objects.equals(
            this.githubCloudCostMetrics,
            gitHubCostsIntegrationDataflowsResponse.githubCloudCostMetrics)
        && Objects.equals(
            this.additionalProperties,
            gitHubCostsIntegrationDataflowsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(githubCloudCostMetrics, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitHubCostsIntegrationDataflowsResponse {\n");
    sb.append("    githubCloudCostMetrics: ")
        .append(toIndentedString(githubCloudCostMetrics))
        .append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
