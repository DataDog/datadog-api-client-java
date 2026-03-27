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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes for updating an environment. */
@JsonPropertyOrder({
  UpdateEnvironmentAttributes.JSON_PROPERTY_IS_PRODUCTION,
  UpdateEnvironmentAttributes.JSON_PROPERTY_NAME,
  UpdateEnvironmentAttributes.JSON_PROPERTY_QUERIES,
  UpdateEnvironmentAttributes.JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateEnvironmentAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_PRODUCTION = "is_production";
  private Boolean isProduction;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<String> queries = null;

  public static final String JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL =
      "require_feature_flag_approval";
  private Boolean requireFeatureFlagApproval;

  public UpdateEnvironmentAttributes isProduction(Boolean isProduction) {
    this.isProduction = isProduction;
    return this;
  }

  /**
   * Indicates whether this is a production environment.
   *
   * @return isProduction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PRODUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsProduction() {
    return isProduction;
  }

  public void setIsProduction(Boolean isProduction) {
    this.isProduction = isProduction;
  }

  public UpdateEnvironmentAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the environment.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateEnvironmentAttributes queries(List<String> queries) {
    this.queries = queries;
    return this;
  }

  public UpdateEnvironmentAttributes addQueriesItem(String queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    return this;
  }

  /**
   * List of queries to define the environment scope.
   *
   * @return queries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getQueries() {
    return queries;
  }

  public void setQueries(List<String> queries) {
    this.queries = queries;
  }

  public UpdateEnvironmentAttributes requireFeatureFlagApproval(
      Boolean requireFeatureFlagApproval) {
    this.requireFeatureFlagApproval = requireFeatureFlagApproval;
    return this;
  }

  /**
   * Indicates whether feature flag changes require approval in this environment.
   *
   * @return requireFeatureFlagApproval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRequireFeatureFlagApproval() {
    return requireFeatureFlagApproval;
  }

  public void setRequireFeatureFlagApproval(Boolean requireFeatureFlagApproval) {
    this.requireFeatureFlagApproval = requireFeatureFlagApproval;
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
   * @return UpdateEnvironmentAttributes
   */
  @JsonAnySetter
  public UpdateEnvironmentAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UpdateEnvironmentAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEnvironmentAttributes updateEnvironmentAttributes = (UpdateEnvironmentAttributes) o;
    return Objects.equals(this.isProduction, updateEnvironmentAttributes.isProduction)
        && Objects.equals(this.name, updateEnvironmentAttributes.name)
        && Objects.equals(this.queries, updateEnvironmentAttributes.queries)
        && Objects.equals(
            this.requireFeatureFlagApproval, updateEnvironmentAttributes.requireFeatureFlagApproval)
        && Objects.equals(
            this.additionalProperties, updateEnvironmentAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        isProduction, name, queries, requireFeatureFlagApproval, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEnvironmentAttributes {\n");
    sb.append("    isProduction: ").append(toIndentedString(isProduction)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    requireFeatureFlagApproval: ")
        .append(toIndentedString(requireFeatureFlagApproval))
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
