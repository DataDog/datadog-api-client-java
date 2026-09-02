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
import org.openapitools.jackson.nullable.JsonNullable;

/** Filter criteria for an experimentation search request. */
@JsonPropertyOrder({
  LLMObsExperimentationFilter.JSON_PROPERTY_INCLUDE_DELETED,
  LLMObsExperimentationFilter.JSON_PROPERTY_IS_DELETED,
  LLMObsExperimentationFilter.JSON_PROPERTY_QUERY,
  LLMObsExperimentationFilter.JSON_PROPERTY_SCOPE,
  LLMObsExperimentationFilter.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentationFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_DELETED = "include_deleted";
  private Boolean includeDeleted = false;

  public static final String JSON_PROPERTY_IS_DELETED = "is_deleted";
  private Boolean isDeleted = false;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private List<String> scope = new ArrayList<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  private JsonNullable<Long> version = JsonNullable.<Long>undefined();

  public LLMObsExperimentationFilter() {}

  @JsonCreator
  public LLMObsExperimentationFilter(
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE) List<String> scope) {
    this.scope = scope;
  }

  public LLMObsExperimentationFilter includeDeleted(Boolean includeDeleted) {
    this.includeDeleted = includeDeleted;
    return this;
  }

  /**
   * When <code>true</code>, include soft-deleted entities alongside active ones.
   *
   * @return includeDeleted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeDeleted() {
    return includeDeleted;
  }

  public void setIncludeDeleted(Boolean includeDeleted) {
    this.includeDeleted = includeDeleted;
  }

  public LLMObsExperimentationFilter isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * When <code>true</code>, return only soft-deleted entities.
   *
   * @return isDeleted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public LLMObsExperimentationFilter query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Free-text search query.
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

  public LLMObsExperimentationFilter scope(List<String> scope) {
    this.scope = scope;
    return this;
  }

  public LLMObsExperimentationFilter addScopeItem(String scopeItem) {
    this.scope.add(scopeItem);
    return this;
  }

  /**
   * Entity types to search. Valid values are <code>projects</code>, <code>datasets</code>, <code>
   * dataset_records</code>, <code>experiments</code>, and <code>experiment_runs</code>.
   *
   * @return scope
   */
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getScope() {
    return scope;
  }

  public void setScope(List<String> scope) {
    this.scope = scope;
  }

  public LLMObsExperimentationFilter version(Long version) {
    this.version = JsonNullable.<Long>of(version);
    return this;
  }

  /**
   * Filter dataset records by a specific dataset version.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getVersion() {
    return version.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getVersion_JsonNullable() {
    return version;
  }

  @JsonProperty(JSON_PROPERTY_VERSION)
  public void setVersion_JsonNullable(JsonNullable<Long> version) {
    this.version = version;
  }

  public void setVersion(Long version) {
    this.version = JsonNullable.<Long>of(version);
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
   * @return LLMObsExperimentationFilter
   */
  @JsonAnySetter
  public LLMObsExperimentationFilter putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsExperimentationFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentationFilter llmObsExperimentationFilter = (LLMObsExperimentationFilter) o;
    return Objects.equals(this.includeDeleted, llmObsExperimentationFilter.includeDeleted)
        && Objects.equals(this.isDeleted, llmObsExperimentationFilter.isDeleted)
        && Objects.equals(this.query, llmObsExperimentationFilter.query)
        && Objects.equals(this.scope, llmObsExperimentationFilter.scope)
        && Objects.equals(this.version, llmObsExperimentationFilter.version)
        && Objects.equals(
            this.additionalProperties, llmObsExperimentationFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeDeleted, isDeleted, query, scope, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentationFilter {\n");
    sb.append("    includeDeleted: ").append(toIndentedString(includeDeleted)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
