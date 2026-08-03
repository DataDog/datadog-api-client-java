/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Validation result of a configuration deployment dry run.</p>
 */
@JsonPropertyOrder({
  FleetDeploymentConfigureV2DryRunResult.JSON_PROPERTY_CONFIG_VALIDATED,
  FleetDeploymentConfigureV2DryRunResult.JSON_PROPERTY_NON_UPGRADABLE_BY_REASON,
  FleetDeploymentConfigureV2DryRunResult.JSON_PROPERTY_NON_UPGRADABLE_HOSTS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentConfigureV2DryRunResult {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG_VALIDATED = "config_validated";
  private Boolean configValidated;

  public static final String JSON_PROPERTY_NON_UPGRADABLE_BY_REASON = "non_upgradable_by_reason";
  private Map<String, Long> nonUpgradableByReason = null;

  public static final String JSON_PROPERTY_NON_UPGRADABLE_HOSTS = "non_upgradable_hosts";
  private Long nonUpgradableHosts;

  public FleetDeploymentConfigureV2DryRunResult configValidated(Boolean configValidated) {
    this.configValidated = configValidated;
    return this;
  }

  /**
   * <p>Whether the configuration passed schema validation.</p>
   * @return configValidated
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONFIG_VALIDATED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getConfigValidated() {
        return configValidated;
      }
  public void setConfigValidated(Boolean configValidated) {
    this.configValidated = configValidated;
  }
  public FleetDeploymentConfigureV2DryRunResult nonUpgradableByReason(Map<String, Long> nonUpgradableByReason) {
    this.nonUpgradableByReason = nonUpgradableByReason;
    return this;
  }
  public FleetDeploymentConfigureV2DryRunResult putNonUpgradableByReasonItem(String key, Long nonUpgradableByReasonItem) {
    if (this.nonUpgradableByReason == null) {
      this.nonUpgradableByReason = new HashMap<>();
    }
    this.nonUpgradableByReason.put(key, nonUpgradableByReasonItem);
    return this;
  }

  /**
   * <p>Breakdown of ineligible host counts by reason. Only includes reasons with a
   * non-zero count. Absent from the response when no targeted host is ineligible.</p>
   * @return nonUpgradableByReason
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NON_UPGRADABLE_BY_REASON)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Long> getNonUpgradableByReason() {
        return nonUpgradableByReason;
      }
  public void setNonUpgradableByReason(Map<String, Long> nonUpgradableByReason) {
    this.nonUpgradableByReason = nonUpgradableByReason;
  }
  public FleetDeploymentConfigureV2DryRunResult nonUpgradableHosts(Long nonUpgradableHosts) {
    this.nonUpgradableHosts = nonUpgradableHosts;
    return this;
  }

  /**
   * <p>Number of targeted hosts that are not eligible to receive this configuration.</p>
   * @return nonUpgradableHosts
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NON_UPGRADABLE_HOSTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getNonUpgradableHosts() {
        return nonUpgradableHosts;
      }
  public void setNonUpgradableHosts(Long nonUpgradableHosts) {
    this.nonUpgradableHosts = nonUpgradableHosts;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return FleetDeploymentConfigureV2DryRunResult
   */
  @JsonAnySetter
  public FleetDeploymentConfigureV2DryRunResult putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this FleetDeploymentConfigureV2DryRunResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentConfigureV2DryRunResult fleetDeploymentConfigureV2DryRunResult = (FleetDeploymentConfigureV2DryRunResult) o;
    return Objects.equals(this.configValidated, fleetDeploymentConfigureV2DryRunResult.configValidated) && Objects.equals(this.nonUpgradableByReason, fleetDeploymentConfigureV2DryRunResult.nonUpgradableByReason) && Objects.equals(this.nonUpgradableHosts, fleetDeploymentConfigureV2DryRunResult.nonUpgradableHosts) && Objects.equals(this.additionalProperties, fleetDeploymentConfigureV2DryRunResult.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(configValidated,nonUpgradableByReason,nonUpgradableHosts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentConfigureV2DryRunResult {\n");
    sb.append("    configValidated: ").append(toIndentedString(configValidated)).append("\n");
    sb.append("    nonUpgradableByReason: ").append(toIndentedString(nonUpgradableByReason)).append("\n");
    sb.append("    nonUpgradableHosts: ").append(toIndentedString(nonUpgradableHosts)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
