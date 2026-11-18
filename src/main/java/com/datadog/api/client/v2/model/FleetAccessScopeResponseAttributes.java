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

/** Fleet access scope attributes and audit information. */
@JsonPropertyOrder({
  FleetAccessScopeResponseAttributes.JSON_PROPERTY_CREATED_AT,
  FleetAccessScopeResponseAttributes.JSON_PROPERTY_CREATOR,
  FleetAccessScopeResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  FleetAccessScopeResponseAttributes.JSON_PROPERTY_FEATURES,
  FleetAccessScopeResponseAttributes.JSON_PROPERTY_QUERY,
  FleetAccessScopeResponseAttributes.JSON_PROPERTY_UPDATED_AT,
  FleetAccessScopeResponseAttributes.JSON_PROPERTY_UPDATER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetAccessScopeResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private String creator;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description = "";

  public static final String JSON_PROPERTY_FEATURES = "features";
  private FleetAccessScopeFeatures features;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query = "";

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_UPDATER = "updater";
  private String updater;

  /**
   * RFC3339 timestamp when the scope was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Handle of the user who created the scope.
   *
   * @return creator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreator() {
    return creator;
  }

  public FleetAccessScopeResponseAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-readable description of the access scope. Omission clears the description on update.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FleetAccessScopeResponseAttributes features(FleetAccessScopeFeatures features) {
    this.features = features;
    this.unparsed |= features.unparsed;
    return this;
  }

  /**
   * Fleet actions authorized on agents matching the access scope query.
   *
   * @return features
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FleetAccessScopeFeatures getFeatures() {
    return features;
  }

  public void setFeatures(FleetAccessScopeFeatures features) {
    this.features = features;
    if (features != null) {
      this.unparsed |= features.unparsed;
    }
  }

  public FleetAccessScopeResponseAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Agent query selecting hosts covered by the scope. An empty query matches all hosts. Omission
   * clears the query on update.
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

  /**
   * RFC3339 timestamp when the scope was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Handle of the user who last updated the scope.
   *
   * @return updater
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpdater() {
    return updater;
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
   * @return FleetAccessScopeResponseAttributes
   */
  @JsonAnySetter
  public FleetAccessScopeResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetAccessScopeResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetAccessScopeResponseAttributes fleetAccessScopeResponseAttributes =
        (FleetAccessScopeResponseAttributes) o;
    return Objects.equals(this.createdAt, fleetAccessScopeResponseAttributes.createdAt)
        && Objects.equals(this.creator, fleetAccessScopeResponseAttributes.creator)
        && Objects.equals(this.description, fleetAccessScopeResponseAttributes.description)
        && Objects.equals(this.features, fleetAccessScopeResponseAttributes.features)
        && Objects.equals(this.query, fleetAccessScopeResponseAttributes.query)
        && Objects.equals(this.updatedAt, fleetAccessScopeResponseAttributes.updatedAt)
        && Objects.equals(this.updater, fleetAccessScopeResponseAttributes.updater)
        && Objects.equals(
            this.additionalProperties, fleetAccessScopeResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, creator, description, features, query, updatedAt, updater, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetAccessScopeResponseAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
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
