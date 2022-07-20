/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The search and filter query settings. */
@JsonPropertyOrder({
  RUMQueryFilter.JSON_PROPERTY_FROM,
  RUMQueryFilter.JSON_PROPERTY_QUERY,
  RUMQueryFilter.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMQueryFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private String from = "now-15m";

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query = "*";

  public static final String JSON_PROPERTY_TO = "to";
  private String to = "now";

  public RUMQueryFilter from(String from) {
    this.from = from;
    return this;
  }

  /**
   * The minimum time for the requested events; supports date, math, and regular timestamps (in
   * milliseconds).
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

  public RUMQueryFilter query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The search query following the RUM search syntax.
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

  public RUMQueryFilter to(String to) {
    this.to = to;
    return this;
  }

  /**
   * The maximum time for the requested events; supports date, math, and regular timestamps (in
   * milliseconds).
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

  /** Return true if this RUMQueryFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMQueryFilter rumQueryFilter = (RUMQueryFilter) o;
    return Objects.equals(this.from, rumQueryFilter.from)
        && Objects.equals(this.query, rumQueryFilter.query)
        && Objects.equals(this.to, rumQueryFilter.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, query, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMQueryFilter {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("}");
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
