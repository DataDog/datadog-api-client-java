/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Facet */
@JsonPropertyOrder({
  SearchSLOResponseDataAttributesFacetsObjectInt.JSON_PROPERTY_COUNT,
  SearchSLOResponseDataAttributesFacetsObjectInt.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SearchSLOResponseDataAttributesFacetsObjectInt {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_NAME = "name";
  private Double name;

  public SearchSLOResponseDataAttributesFacetsObjectInt count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Count
   *
   * @return count
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public SearchSLOResponseDataAttributesFacetsObjectInt name(Double name) {
    this.name = name;
    return this;
  }

  /**
   * Facet
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getName() {
    return name;
  }

  public void setName(Double name) {
    this.name = name;
  }

  /** Return true if this SearchSLOResponseDataAttributesFacetsObjectInt object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSLOResponseDataAttributesFacetsObjectInt searchSloResponseDataAttributesFacetsObjectInt =
        (SearchSLOResponseDataAttributesFacetsObjectInt) o;
    return Objects.equals(this.count, searchSloResponseDataAttributesFacetsObjectInt.count)
        && Objects.equals(this.name, searchSloResponseDataAttributesFacetsObjectInt.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSLOResponseDataAttributesFacetsObjectInt {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
