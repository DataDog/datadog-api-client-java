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

/** A single exclusion filter. */
@JsonPropertyOrder({
  SecurityFilterExclusionFilterResponse.JSON_PROPERTY_NAME,
  SecurityFilterExclusionFilterResponse.JSON_PROPERTY_QUERY
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityFilterExclusionFilterResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public SecurityFilterExclusionFilterResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The exclusion filter name.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityFilterExclusionFilterResponse query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The exclusion filter query.
   *
   * @return query
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  /** Return true if this SecurityFilterExclusionFilterResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityFilterExclusionFilterResponse securityFilterExclusionFilterResponse =
        (SecurityFilterExclusionFilterResponse) o;
    return Objects.equals(this.name, securityFilterExclusionFilterResponse.name)
        && Objects.equals(this.query, securityFilterExclusionFilterResponse.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityFilterExclusionFilterResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
