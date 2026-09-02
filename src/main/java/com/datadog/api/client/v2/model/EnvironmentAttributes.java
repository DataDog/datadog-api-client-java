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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of an environment. */
@JsonPropertyOrder({
  EnvironmentAttributes.JSON_PROPERTY_CREATED_AT,
  EnvironmentAttributes.JSON_PROPERTY_DESCRIPTION,
  EnvironmentAttributes.JSON_PROPERTY_IS_PRODUCTION,
  EnvironmentAttributes.JSON_PROPERTY_KEY,
  EnvironmentAttributes.JSON_PROPERTY_NAME,
  EnvironmentAttributes.JSON_PROPERTY_QUERIES,
  EnvironmentAttributes.JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL,
  EnvironmentAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EnvironmentAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_PRODUCTION = "is_production";
  private Boolean isProduction;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<String> queries = null;

  public static final String JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL =
      "require_feature_flag_approval";
  private Boolean requireFeatureFlagApproval;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public EnvironmentAttributes() {}

  @JsonCreator
  public EnvironmentAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public EnvironmentAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the environment was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public EnvironmentAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * The description of the environment.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public EnvironmentAttributes isProduction(Boolean isProduction) {
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

  public EnvironmentAttributes key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The unique key of the environment.
   *
   * @return key
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public EnvironmentAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the environment.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnvironmentAttributes queries(List<String> queries) {
    this.queries = queries;
    return this;
  }

  public EnvironmentAttributes addQueriesItem(String queriesItem) {
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

  public EnvironmentAttributes requireFeatureFlagApproval(Boolean requireFeatureFlagApproval) {
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

  public EnvironmentAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the environment was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return EnvironmentAttributes
   */
  @JsonAnySetter
  public EnvironmentAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EnvironmentAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentAttributes environmentAttributes = (EnvironmentAttributes) o;
    return Objects.equals(this.createdAt, environmentAttributes.createdAt)
        && Objects.equals(this.description, environmentAttributes.description)
        && Objects.equals(this.isProduction, environmentAttributes.isProduction)
        && Objects.equals(this.key, environmentAttributes.key)
        && Objects.equals(this.name, environmentAttributes.name)
        && Objects.equals(this.queries, environmentAttributes.queries)
        && Objects.equals(
            this.requireFeatureFlagApproval, environmentAttributes.requireFeatureFlagApproval)
        && Objects.equals(this.updatedAt, environmentAttributes.updatedAt)
        && Objects.equals(this.additionalProperties, environmentAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        description,
        isProduction,
        key,
        name,
        queries,
        requireFeatureFlagApproval,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isProduction: ").append(toIndentedString(isProduction)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    requireFeatureFlagApproval: ")
        .append(toIndentedString(requireFeatureFlagApproval))
        .append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
