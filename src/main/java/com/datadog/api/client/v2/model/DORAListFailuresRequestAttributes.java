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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes to get a list of incidents. */
@JsonPropertyOrder({
  DORAListFailuresRequestAttributes.JSON_PROPERTY_FROM,
  DORAListFailuresRequestAttributes.JSON_PROPERTY_LIMIT,
  DORAListFailuresRequestAttributes.JSON_PROPERTY_QUERY,
  DORAListFailuresRequestAttributes.JSON_PROPERTY_SORT,
  DORAListFailuresRequestAttributes.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DORAListFailuresRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private OffsetDateTime from;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit = 10;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SORT = "sort";
  private String sort;

  public static final String JSON_PROPERTY_TO = "to";
  private OffsetDateTime to;

  public DORAListFailuresRequestAttributes from(OffsetDateTime from) {
    this.from = from;
    return this;
  }

  /**
   * Minimum timestamp for requested events.
   *
   * @return from
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getFrom() {
    return from;
  }

  public void setFrom(OffsetDateTime from) {
    this.from = from;
  }

  public DORAListFailuresRequestAttributes limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of events in the response. maximum: 1000
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

  public DORAListFailuresRequestAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Search query with event platform syntax.
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

  public DORAListFailuresRequestAttributes sort(String sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Sort order (prefixed with <code>-</code> for descending).
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public DORAListFailuresRequestAttributes to(OffsetDateTime to) {
    this.to = to;
    return this;
  }

  /**
   * Maximum timestamp for requested events.
   *
   * @return to
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getTo() {
    return to;
  }

  public void setTo(OffsetDateTime to) {
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
   * @return DORAListFailuresRequestAttributes
   */
  @JsonAnySetter
  public DORAListFailuresRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DORAListFailuresRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DORAListFailuresRequestAttributes doraListFailuresRequestAttributes =
        (DORAListFailuresRequestAttributes) o;
    return Objects.equals(this.from, doraListFailuresRequestAttributes.from)
        && Objects.equals(this.limit, doraListFailuresRequestAttributes.limit)
        && Objects.equals(this.query, doraListFailuresRequestAttributes.query)
        && Objects.equals(this.sort, doraListFailuresRequestAttributes.sort)
        && Objects.equals(this.to, doraListFailuresRequestAttributes.to)
        && Objects.equals(
            this.additionalProperties, doraListFailuresRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, limit, query, sort, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DORAListFailuresRequestAttributes {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
