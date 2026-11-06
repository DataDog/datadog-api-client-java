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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Archived-session query. A window wider than configured archive retention is narrowed before
 * searching.
 */
@JsonPropertyOrder({
  RumArchiveSessionsSearchAttributes.JSON_PROPERTY_CURSOR,
  RumArchiveSessionsSearchAttributes.JSON_PROPERTY_FROM,
  RumArchiveSessionsSearchAttributes.JSON_PROPERTY_HIDE_RETAINED,
  RumArchiveSessionsSearchAttributes.JSON_PROPERTY_LIMIT,
  RumArchiveSessionsSearchAttributes.JSON_PROPERTY_QUERY,
  RumArchiveSessionsSearchAttributes.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumArchiveSessionsSearchAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURSOR = "cursor";
  private String cursor;

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_HIDE_RETAINED = "hide_retained";
  private Boolean hideRetained = false;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit = 50;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public RumArchiveSessionsSearchAttributes() {}

  @JsonCreator
  public RumArchiveSessionsSearchAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to) {
    this.from = from;
    this.query = query;
    this.to = to;
  }

  public RumArchiveSessionsSearchAttributes cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * Opaque next-page cursor. Keep the query, time range, and hide_retained value unchanged.
   *
   * @return cursor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public RumArchiveSessionsSearchAttributes from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the range in Unix milliseconds. Must be positive and earlier than to. minimum: 1
   *
   * @return from
   */
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public RumArchiveSessionsSearchAttributes hideRetained(Boolean hideRetained) {
    this.hideRetained = hideRetained;
    return this;
  }

  /**
   * When true, exclude sessions already present in hot RUM storage. When false, those sessions can
   * appear in the results. Keep this value unchanged when continuing with a cursor.
   *
   * @return hideRetained
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_RETAINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHideRetained() {
    return hideRetained;
  }

  public void setHideRetained(Boolean hideRetained) {
    this.hideRetained = hideRetained;
  }

  public RumArchiveSessionsSearchAttributes limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Page size, at most 1000 (default 50). Values at or below zero use 50. maximum: 1000
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

  public RumArchiveSessionsSearchAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * RUM search query. Must not be empty.
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

  public RumArchiveSessionsSearchAttributes to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End of the range in Unix milliseconds. minimum: 1
   *
   * @return to
   */
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
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
   * @return RumArchiveSessionsSearchAttributes
   */
  @JsonAnySetter
  public RumArchiveSessionsSearchAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumArchiveSessionsSearchAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumArchiveSessionsSearchAttributes rumArchiveSessionsSearchAttributes =
        (RumArchiveSessionsSearchAttributes) o;
    return Objects.equals(this.cursor, rumArchiveSessionsSearchAttributes.cursor)
        && Objects.equals(this.from, rumArchiveSessionsSearchAttributes.from)
        && Objects.equals(this.hideRetained, rumArchiveSessionsSearchAttributes.hideRetained)
        && Objects.equals(this.limit, rumArchiveSessionsSearchAttributes.limit)
        && Objects.equals(this.query, rumArchiveSessionsSearchAttributes.query)
        && Objects.equals(this.to, rumArchiveSessionsSearchAttributes.to)
        && Objects.equals(
            this.additionalProperties, rumArchiveSessionsSearchAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, from, hideRetained, limit, query, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumArchiveSessionsSearchAttributes {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    hideRetained: ").append(toIndentedString(hideRetained)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
