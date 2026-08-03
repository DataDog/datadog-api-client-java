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

/** Attributes of a configuration deployment dry-run response. */
@JsonPropertyOrder({
  FleetDeploymentConfigureV2DryRunAttributes.JSON_PROPERTY_DRY_RUN,
  FleetDeploymentConfigureV2DryRunAttributes.JSON_PROPERTY_QUERY,
  FleetDeploymentConfigureV2DryRunAttributes.JSON_PROPERTY_TOTAL_HOSTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentConfigureV2DryRunAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DRY_RUN = "dry_run";
  private FleetDeploymentConfigureV2DryRunResult dryRun;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TOTAL_HOSTS = "total_hosts";
  private Long totalHosts;

  public FleetDeploymentConfigureV2DryRunAttributes dryRun(
      FleetDeploymentConfigureV2DryRunResult dryRun) {
    this.dryRun = dryRun;
    this.unparsed |= dryRun.unparsed;
    return this;
  }

  /**
   * Validation result of a configuration deployment dry run.
   *
   * @return dryRun
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRY_RUN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FleetDeploymentConfigureV2DryRunResult getDryRun() {
    return dryRun;
  }

  public void setDryRun(FleetDeploymentConfigureV2DryRunResult dryRun) {
    this.dryRun = dryRun;
    if (dryRun != null) {
      this.unparsed |= dryRun.unparsed;
    }
  }

  public FleetDeploymentConfigureV2DryRunAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Query used to filter and select target hosts for the deployment.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public FleetDeploymentConfigureV2DryRunAttributes totalHosts(Long totalHosts) {
    this.totalHosts = totalHosts;
    return this;
  }

  /**
   * Total number of hosts targeted by the dry run.
   *
   * @return totalHosts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalHosts() {
    return totalHosts;
  }

  public void setTotalHosts(Long totalHosts) {
    this.totalHosts = totalHosts;
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
   * @return FleetDeploymentConfigureV2DryRunAttributes
   */
  @JsonAnySetter
  public FleetDeploymentConfigureV2DryRunAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this FleetDeploymentConfigureV2DryRunAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentConfigureV2DryRunAttributes fleetDeploymentConfigureV2DryRunAttributes =
        (FleetDeploymentConfigureV2DryRunAttributes) o;
    return Objects.equals(this.dryRun, fleetDeploymentConfigureV2DryRunAttributes.dryRun)
        && Objects.equals(this.query, fleetDeploymentConfigureV2DryRunAttributes.query)
        && Objects.equals(this.totalHosts, fleetDeploymentConfigureV2DryRunAttributes.totalHosts)
        && Objects.equals(
            this.additionalProperties,
            fleetDeploymentConfigureV2DryRunAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, query, totalHosts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentConfigureV2DryRunAttributes {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    totalHosts: ").append(toIndentedString(totalHosts)).append("\n");
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
