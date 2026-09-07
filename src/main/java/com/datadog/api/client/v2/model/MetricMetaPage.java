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

/** Paging attributes. Only present if pagination query parameters were provided. */
@JsonPropertyOrder({
  MetricMetaPage.JSON_PROPERTY_CURSOR,
  MetricMetaPage.JSON_PROPERTY_LIMIT,
  MetricMetaPage.JSON_PROPERTY_NEXT_CURSOR,
  MetricMetaPage.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricMetaPage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURSOR = "cursor";
  private JsonNullable<String> cursor = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_NEXT_CURSOR = "next_cursor";
  private JsonNullable<String> nextCursor = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private MetricMetaPageType type = MetricMetaPageType.CURSOR_LIMIT;

  public MetricMetaPage cursor(String cursor) {
    this.cursor = JsonNullable.<String>of(cursor);
    return this;
  }

  /**
   * The cursor used to get the current results, if any.
   *
   * @return cursor
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCursor() {
    return cursor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCursor_JsonNullable() {
    return cursor;
  }

  @JsonProperty(JSON_PROPERTY_CURSOR)
  public void setCursor_JsonNullable(JsonNullable<String> cursor) {
    this.cursor = cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = JsonNullable.<String>of(cursor);
  }

  public MetricMetaPage limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Number of results returned minimum: 0 maximum: 20000
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public MetricMetaPage nextCursor(String nextCursor) {
    this.nextCursor = JsonNullable.<String>of(nextCursor);
    return this;
  }

  /**
   * The cursor used to get the next results, if any.
   *
   * @return nextCursor
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getNextCursor() {
    return nextCursor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getNextCursor_JsonNullable() {
    return nextCursor;
  }

  @JsonProperty(JSON_PROPERTY_NEXT_CURSOR)
  public void setNextCursor_JsonNullable(JsonNullable<String> nextCursor) {
    this.nextCursor = nextCursor;
  }

  public void setNextCursor(String nextCursor) {
    this.nextCursor = JsonNullable.<String>of(nextCursor);
  }

  public MetricMetaPage type(MetricMetaPageType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of metric pagination.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MetricMetaPageType getType() {
    return type;
  }

  public void setType(MetricMetaPageType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return MetricMetaPage
   */
  @JsonAnySetter
  public MetricMetaPage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MetricMetaPage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricMetaPage metricMetaPage = (MetricMetaPage) o;
    return Objects.equals(this.cursor, metricMetaPage.cursor)
        && Objects.equals(this.limit, metricMetaPage.limit)
        && Objects.equals(this.nextCursor, metricMetaPage.nextCursor)
        && Objects.equals(this.type, metricMetaPage.type)
        && Objects.equals(this.additionalProperties, metricMetaPage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, limit, nextCursor, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricMetaPage {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
