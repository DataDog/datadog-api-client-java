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

/** Attributes for creating a new package upgrade deployment. */
@JsonPropertyOrder({
  FleetDeploymentPackageUpgradeAttributes.JSON_PROPERTY_FILTER_QUERY,
  FleetDeploymentPackageUpgradeAttributes.JSON_PROPERTY_TARGET_PACKAGES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentPackageUpgradeAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER_QUERY = "filter_query";
  private String filterQuery;

  public static final String JSON_PROPERTY_TARGET_PACKAGES = "target_packages";
  private List<FleetDeploymentPackage> targetPackages = new ArrayList<>();

  public FleetDeploymentPackageUpgradeAttributes() {}

  @JsonCreator
  public FleetDeploymentPackageUpgradeAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET_PACKAGES)
          List<FleetDeploymentPackage> targetPackages) {
    this.targetPackages = targetPackages;
  }

  public FleetDeploymentPackageUpgradeAttributes filterQuery(String filterQuery) {
    this.filterQuery = filterQuery;
    return this;
  }

  /**
   * Query used to filter and select target hosts for the deployment. Uses the Datadog query syntax.
   *
   * @return filterQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilterQuery() {
    return filterQuery;
  }

  public void setFilterQuery(String filterQuery) {
    this.filterQuery = filterQuery;
  }

  public FleetDeploymentPackageUpgradeAttributes targetPackages(
      List<FleetDeploymentPackage> targetPackages) {
    this.targetPackages = targetPackages;
    for (FleetDeploymentPackage item : targetPackages) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetDeploymentPackageUpgradeAttributes addTargetPackagesItem(
      FleetDeploymentPackage targetPackagesItem) {
    this.targetPackages.add(targetPackagesItem);
    this.unparsed |= targetPackagesItem.unparsed;
    return this;
  }

  /**
   * List of packages and their target versions to deploy to the selected hosts.
   *
   * @return targetPackages
   */
  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<FleetDeploymentPackage> getTargetPackages() {
    return targetPackages;
  }

  public void setTargetPackages(List<FleetDeploymentPackage> targetPackages) {
    this.targetPackages = targetPackages;
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
   * @return FleetDeploymentPackageUpgradeAttributes
   */
  @JsonAnySetter
  public FleetDeploymentPackageUpgradeAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetDeploymentPackageUpgradeAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentPackageUpgradeAttributes fleetDeploymentPackageUpgradeAttributes =
        (FleetDeploymentPackageUpgradeAttributes) o;
    return Objects.equals(this.filterQuery, fleetDeploymentPackageUpgradeAttributes.filterQuery)
        && Objects.equals(
            this.targetPackages, fleetDeploymentPackageUpgradeAttributes.targetPackages)
        && Objects.equals(
            this.additionalProperties,
            fleetDeploymentPackageUpgradeAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterQuery, targetPackages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentPackageUpgradeAttributes {\n");
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
