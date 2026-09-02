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

/** Attributes describing the DDSQL query to execute. */
@JsonPropertyOrder({
  DdsqlTabularQueryRequestAttributes.JSON_PROPERTY_QUERY,
  DdsqlTabularQueryRequestAttributes.JSON_PROPERTY_ROW_LIMIT,
  DdsqlTabularQueryRequestAttributes.JSON_PROPERTY_TIME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DdsqlTabularQueryRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_ROW_LIMIT = "row_limit";
  private Long rowLimit;

  public static final String JSON_PROPERTY_TIME = "time";
  private DdsqlTabularQueryTimeWindow time;

  public DdsqlTabularQueryRequestAttributes() {}

  @JsonCreator
  public DdsqlTabularQueryRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME) DdsqlTabularQueryTimeWindow time) {
    this.query = query;
    this.time = time;
    this.unparsed |= time.unparsed;
  }

  public DdsqlTabularQueryRequestAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The DDSQL statement to execute. DDSQL is Datadog's SQL dialect, which is a subset of
   * PostgreSQL, scoped to Datadog data sources.
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

  public DdsqlTabularQueryRequestAttributes rowLimit(Long rowLimit) {
    this.rowLimit = rowLimit;
    return this;
  }

  /**
   * Cap on the number of rows returned. Defaults to 5,000 when omitted. Must be between 1 and
   * 10,000 inclusive; values outside this range are rejected with 400. minimum: 1 maximum: 10000
   *
   * @return rowLimit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROW_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRowLimit() {
    return rowLimit;
  }

  public void setRowLimit(Long rowLimit) {
    this.rowLimit = rowLimit;
  }

  public DdsqlTabularQueryRequestAttributes time(DdsqlTabularQueryTimeWindow time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Time window scoping the underlying data sources, expressed in Unix milliseconds since the
   * epoch. Inclusive on <code>from_timestamp</code>, exclusive on <code>to_timestamp</code>.
   * Results from static tables (for example, <code>dd.hosts</code>) are not affected by the time
   * window, but the field must still be provided.
   *
   * @return time
   */
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DdsqlTabularQueryTimeWindow getTime() {
    return time;
  }

  public void setTime(DdsqlTabularQueryTimeWindow time) {
    this.time = time;
    if (time != null) {
      this.unparsed |= time.unparsed;
    }
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
   * @return DdsqlTabularQueryRequestAttributes
   */
  @JsonAnySetter
  public DdsqlTabularQueryRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DdsqlTabularQueryRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DdsqlTabularQueryRequestAttributes ddsqlTabularQueryRequestAttributes =
        (DdsqlTabularQueryRequestAttributes) o;
    return Objects.equals(this.query, ddsqlTabularQueryRequestAttributes.query)
        && Objects.equals(this.rowLimit, ddsqlTabularQueryRequestAttributes.rowLimit)
        && Objects.equals(this.time, ddsqlTabularQueryRequestAttributes.time)
        && Objects.equals(
            this.additionalProperties, ddsqlTabularQueryRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, rowLimit, time, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DdsqlTabularQueryRequestAttributes {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    rowLimit: ").append(toIndentedString(rowLimit)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
