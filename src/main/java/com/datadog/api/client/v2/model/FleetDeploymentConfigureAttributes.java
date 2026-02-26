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

/** Attributes for creating a new configuration deployment. */
@JsonPropertyOrder({
  FleetDeploymentConfigureAttributes.JSON_PROPERTY_CONFIG_OPERATIONS,
  FleetDeploymentConfigureAttributes.JSON_PROPERTY_FILTER_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentConfigureAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG_OPERATIONS = "config_operations";
  private List<FleetDeploymentOperation> configOperations = new ArrayList<>();

  public static final String JSON_PROPERTY_FILTER_QUERY = "filter_query";
  private String filterQuery;

  public FleetDeploymentConfigureAttributes() {}

  @JsonCreator
  public FleetDeploymentConfigureAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG_OPERATIONS)
          List<FleetDeploymentOperation> configOperations) {
    this.configOperations = configOperations;
  }

  public FleetDeploymentConfigureAttributes configOperations(
      List<FleetDeploymentOperation> configOperations) {
    this.configOperations = configOperations;
    for (FleetDeploymentOperation item : configOperations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetDeploymentConfigureAttributes addConfigOperationsItem(
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
  }

  public FleetDeploymentConfigureAttributes filterQuery(String filterQuery) {
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
   * @return FleetDeploymentConfigureAttributes
   */
  @JsonAnySetter
  public FleetDeploymentConfigureAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetDeploymentConfigureAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentConfigureAttributes fleetDeploymentConfigureAttributes =
        (FleetDeploymentConfigureAttributes) o;
    return Objects.equals(
            this.configOperations, fleetDeploymentConfigureAttributes.configOperations)
        && Objects.equals(this.filterQuery, fleetDeploymentConfigureAttributes.filterQuery)
        && Objects.equals(
            this.additionalProperties, fleetDeploymentConfigureAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configOperations, filterQuery, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentConfigureAttributes {\n");
    sb.append("    configOperations: ").append(toIndentedString(configOperations)).append("\n");
    sb.append("    filterQuery: ").append(toIndentedString(filterQuery)).append("\n");
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
