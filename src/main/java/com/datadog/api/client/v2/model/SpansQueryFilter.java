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

/** The search and filter query settings. */
@JsonPropertyOrder({
  SpansQueryFilter.JSON_PROPERTY_FROM,
  SpansQueryFilter.JSON_PROPERTY_QUERY,
  SpansQueryFilter.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SpansQueryFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private String from = "now-15m";

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query = "*";

  public static final String JSON_PROPERTY_TO = "to";
  private String to = "now";

  public SpansQueryFilter from(String from) {
    this.from = from;
    return this;
  }

  /**
   * The minimum time for the requested spans, supports date-time ISO8601, date math, and regular
   * timestamps (milliseconds).
   *
   * @return from
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public SpansQueryFilter query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The search query, following the <a
   * href="https://docs.datadoghq.com/tracing/trace_explorer/query_syntax/">span search syntax</a>.
   * Reserved fields (<code>service</code>, <code>env</code>, <code>version</code>, <code>
   * resource_name</code>, <code>operation_name</code>, <code>status</code>, <code>span_id</code>,
   * <code>trace_id</code>, <code>type</code>) take no <code>@</code> prefix, and neither do tags
   * such as <code>host</code> or primary tags such as <code>datacenter</code>. Span attributes need
   * one, for example <code>@span.kind:server</code> or <code>@http.status_code:500</code>. Wrap
   * values that contain special characters such as <code>:</code>, <code>{</code>, <code>}</code>,
   * <code>(</code>, <code>)</code>, or spaces in double quotes, for example <code>
   * @http.route:"/api/v1/users/{id}"</code> or <code>resource_name:"GET /api/v1/users"</code>.
   * Wildcards do not work inside quotes, so to combine a wildcard with special characters, escape
   * each one with <code>\</code> instead, for example <code>resource_name:Clients\:\:*</code>.
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

  public SpansQueryFilter to(String to) {
    this.to = to;
    return this;
  }

  /**
   * The maximum time for the requested spans, supports date-time ISO8601, date math, and regular
   * timestamps (milliseconds).
   *
   * @return to
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
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
   * @return SpansQueryFilter
   */
  @JsonAnySetter
  public SpansQueryFilter putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SpansQueryFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpansQueryFilter spansQueryFilter = (SpansQueryFilter) o;
    return Objects.equals(this.from, spansQueryFilter.from)
        && Objects.equals(this.query, spansQueryFilter.query)
        && Objects.equals(this.to, spansQueryFilter.to)
        && Objects.equals(this.additionalProperties, spansQueryFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, query, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpansQueryFilter {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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
