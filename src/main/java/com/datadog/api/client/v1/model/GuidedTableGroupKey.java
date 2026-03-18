/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Maps a specific base query to the field name used for grouping. */
@JsonPropertyOrder({
  GuidedTableGroupKey.JSON_PROPERTY_GROUP_KEY,
  GuidedTableGroupKey.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuidedTableGroupKey {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP_KEY = "group_key";
  private String groupKey;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public GuidedTableGroupKey() {}

  @JsonCreator
  public GuidedTableGroupKey(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_KEY) String groupKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.groupKey = groupKey;
    this.query = query;
  }

  public GuidedTableGroupKey groupKey(String groupKey) {
    this.groupKey = groupKey;
    return this;
  }

  /**
   * Field name in the query result used as the grouping key.
   *
   * @return groupKey
   */
  @JsonProperty(JSON_PROPERTY_GROUP_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGroupKey() {
    return groupKey;
  }

  public void setGroupKey(String groupKey) {
    this.groupKey = groupKey;
  }

  public GuidedTableGroupKey query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Name of the source query.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
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
   * @return GuidedTableGroupKey
   */
  @JsonAnySetter
  public GuidedTableGroupKey putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuidedTableGroupKey object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTableGroupKey guidedTableGroupKey = (GuidedTableGroupKey) o;
    return Objects.equals(this.groupKey, guidedTableGroupKey.groupKey)
        && Objects.equals(this.query, guidedTableGroupKey.query)
        && Objects.equals(this.additionalProperties, guidedTableGroupKey.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupKey, query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTableGroupKey {\n");
    sb.append("    groupKey: ").append(toIndentedString(groupKey)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
