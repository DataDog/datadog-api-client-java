/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes for creating a new v2 configuration deployment. */
@JsonPropertyOrder({
  FleetDeploymentConfigureV2Attributes.JSON_PROPERTY_CONFIG_OPERATIONS,
  FleetDeploymentConfigureV2Attributes.JSON_PROPERTY_DRY_RUN,
  FleetDeploymentConfigureV2Attributes.JSON_PROPERTY_FILTER_QUERY,
  FleetDeploymentConfigureV2Attributes.JSON_PROPERTY_TARGET_PACKAGES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentConfigureV2Attributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG_OPERATIONS = "config_operations";
  private List<FleetDeploymentOperation> configOperations = new ArrayList<>();

  public static final String JSON_PROPERTY_DRY_RUN = "dry_run";
  private Boolean dryRun;

  public static final String JSON_PROPERTY_FILTER_QUERY = "filter_query";
  private String filterQuery;

  public static final String JSON_PROPERTY_TARGET_PACKAGES = "target_packages";
  private List<FleetDeploymentConfigureV2Package> targetPackages = null;

  public FleetDeploymentConfigureV2Attributes() {}

  @JsonCreator
  public FleetDeploymentConfigureV2Attributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG_OPERATIONS)
          List<FleetDeploymentOperation> configOperations,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTER_QUERY) String filterQuery) {
    this.configOperations = configOperations;
    for (FleetDeploymentOperation item : configOperations) {
      this.unparsed |= item.unparsed;
    }
    this.filterQuery = filterQuery;
  }

  public FleetDeploymentConfigureV2Attributes configOperations(
      List<FleetDeploymentOperation> configOperations) {
    this.configOperations = configOperations;
    for (FleetDeploymentOperation item : configOperations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetDeploymentConfigureV2Attributes addConfigOperationsItem(
      FleetDeploymentOperation configOperationsItem) {
    this.configOperations.add(configOperationsItem);
    this.unparsed |= configOperationsItem.unparsed;
    return this;
  }

  /**
   * Ordered list of configuration file operations to perform on the target hosts.
   *
   * @return configOperations
   */
  @JsonProperty(JSON_PROPERTY_CONFIG_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<FleetDeploymentOperation> getConfigOperations() {
    return configOperations;
  }

  public void setConfigOperations(List<FleetDeploymentOperation> configOperations) {
    this.configOperations = configOperations;
    if (configOperations != null) {
      for (FleetDeploymentOperation item : configOperations) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FleetDeploymentConfigureV2Attributes dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Set to <code>true</code> to validate the configuration and resolve target hosts and packages
   * without deploying anything. Returns a 200 with the validation result instead of creating and
   * starting a real deployment.
   *
   * @return dryRun
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRY_RUN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public FleetDeploymentConfigureV2Attributes filterQuery(String filterQuery) {
    this.filterQuery = filterQuery;
    return this;
  }

  /**
   * Query used to filter and select target hosts for the deployment. Uses the Datadog query syntax.
   *
   * @return filterQuery
   */
  @JsonProperty(JSON_PROPERTY_FILTER_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFilterQuery() {
    return filterQuery;
  }

  public void setFilterQuery(String filterQuery) {
    this.filterQuery = filterQuery;
  }

  public FleetDeploymentConfigureV2Attributes targetPackages(
      List<FleetDeploymentConfigureV2Package> targetPackages) {
    this.targetPackages = targetPackages;
    if (targetPackages != null) {
      for (FleetDeploymentConfigureV2Package item : targetPackages) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FleetDeploymentConfigureV2Attributes addTargetPackagesItem(
      FleetDeploymentConfigureV2Package targetPackagesItem) {
    if (this.targetPackages == null) {
      this.targetPackages = new ArrayList<>();
    }
    this.targetPackages.add(targetPackagesItem);
    this.unparsed |= targetPackagesItem.unparsed;
    return this;
  }

  /**
   * List of packages and their target versions to additionally deploy alongside the configuration
   * change.
   *
   * @return targetPackages
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetDeploymentConfigureV2Package> getTargetPackages() {
    return targetPackages;
  }

  public void setTargetPackages(List<FleetDeploymentConfigureV2Package> targetPackages) {
    this.targetPackages = targetPackages;
    if (targetPackages != null) {
      for (FleetDeploymentConfigureV2Package item : targetPackages) {
        this.unparsed |= item.unparsed;
      }
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
   * @return FleetDeploymentConfigureV2Attributes
   */
  @JsonAnySetter
  public FleetDeploymentConfigureV2Attributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetDeploymentConfigureV2Attributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentConfigureV2Attributes fleetDeploymentConfigureV2Attributes =
        (FleetDeploymentConfigureV2Attributes) o;
    return Objects.equals(
            this.configOperations, fleetDeploymentConfigureV2Attributes.configOperations)
        && Objects.equals(this.dryRun, fleetDeploymentConfigureV2Attributes.dryRun)
        && Objects.equals(this.filterQuery, fleetDeploymentConfigureV2Attributes.filterQuery)
        && Objects.equals(this.targetPackages, fleetDeploymentConfigureV2Attributes.targetPackages)
        && Objects.equals(
            this.additionalProperties, fleetDeploymentConfigureV2Attributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        configOperations, dryRun, filterQuery, targetPackages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentConfigureV2Attributes {\n");
    sb.append("    configOperations: ").append(toIndentedString(configOperations)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    filterQuery: ").append(toIndentedString(filterQuery)).append("\n");
    sb.append("    targetPackages: ").append(toIndentedString(targetPackages)).append("\n");
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
