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
import org.openapitools.jackson.nullable.JsonNullable;

/** A query-based condition for an incident rule. */
@JsonPropertyOrder({
  IncidentRuleQueryCondition.JSON_PROPERTY_NORMALIZED_QUERY,
  IncidentRuleQueryCondition.JSON_PROPERTY_RAW_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentRuleQueryCondition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NORMALIZED_QUERY = "normalized_query";
  private JsonNullable<String> normalizedQuery = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RAW_QUERY = "raw_query";
  private JsonNullable<String> rawQuery = JsonNullable.<String>undefined();

  public IncidentRuleQueryCondition normalizedQuery(String normalizedQuery) {
    this.normalizedQuery = JsonNullable.<String>of(normalizedQuery);
    return this;
  }

  /**
   * The normalized query string.
   *
   * @return normalizedQuery
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getNormalizedQuery() {
    return normalizedQuery.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NORMALIZED_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getNormalizedQuery_JsonNullable() {
    return normalizedQuery;
  }

  @JsonProperty(JSON_PROPERTY_NORMALIZED_QUERY)
  public void setNormalizedQuery_JsonNullable(JsonNullable<String> normalizedQuery) {
    this.normalizedQuery = normalizedQuery;
  }

  public void setNormalizedQuery(String normalizedQuery) {
    this.normalizedQuery = JsonNullable.<String>of(normalizedQuery);
  }

  public IncidentRuleQueryCondition rawQuery(String rawQuery) {
    this.rawQuery = JsonNullable.<String>of(rawQuery);
    return this;
  }

  /**
   * The raw query string.
   *
   * @return rawQuery
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getRawQuery() {
    return rawQuery.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RAW_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRawQuery_JsonNullable() {
    return rawQuery;
  }

  @JsonProperty(JSON_PROPERTY_RAW_QUERY)
  public void setRawQuery_JsonNullable(JsonNullable<String> rawQuery) {
    this.rawQuery = rawQuery;
  }

  public void setRawQuery(String rawQuery) {
    this.rawQuery = JsonNullable.<String>of(rawQuery);
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
   * @return IncidentRuleQueryCondition
   */
  @JsonAnySetter
  public IncidentRuleQueryCondition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentRuleQueryCondition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentRuleQueryCondition incidentRuleQueryCondition = (IncidentRuleQueryCondition) o;
    return Objects.equals(this.normalizedQuery, incidentRuleQueryCondition.normalizedQuery)
        && Objects.equals(this.rawQuery, incidentRuleQueryCondition.rawQuery)
        && Objects.equals(
            this.additionalProperties, incidentRuleQueryCondition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(normalizedQuery, rawQuery, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentRuleQueryCondition {\n");
    sb.append("    normalizedQuery: ").append(toIndentedString(normalizedQuery)).append("\n");
    sb.append("    rawQuery: ").append(toIndentedString(rawQuery)).append("\n");
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
