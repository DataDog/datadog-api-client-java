/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({HostmapGroupBy.JSON_PROPERTY_COLUMN, HostmapGroupBy.JSON_PROPERTY_KEY})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostmapGroupBy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public HostmapGroupBy() {}

  @JsonCreator
  public HostmapGroupBy(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN) String column) {
    this.column = column;
  }

  public HostmapGroupBy column(String column) {
    this.column = column;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return column
   */
  @JsonProperty(JSON_PROPERTY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  public HostmapGroupBy key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return key
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /** Return true if this HostmapGroupBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostmapGroupBy hostmapGroupBy = (HostmapGroupBy) o;
    return Objects.equals(this.column, hostmapGroupBy.column)
        && Objects.equals(this.key, hostmapGroupBy.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostmapGroupBy {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
