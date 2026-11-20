/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({GeomapView20270101OneOf4457650336.JSON_PROPERTY_CUSTOM_EXTENT})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapView20270101OneOf4457650336 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_EXTENT = "custom_extent";
  private List<Object> customExtent = new ArrayList<>();

  public GeomapView20270101OneOf4457650336() {}

  @JsonCreator
  public GeomapView20270101OneOf4457650336(
      @JsonProperty(required = true, value = JSON_PROPERTY_CUSTOM_EXTENT)
          List<Object> customExtent) {
    this.customExtent = customExtent;
  }

  public GeomapView20270101OneOf4457650336 customExtent(List<Object> customExtent) {
    this.customExtent = customExtent;
    return this;
  }

  public GeomapView20270101OneOf4457650336 addCustomExtentItem(Object customExtentItem) {
    this.customExtent.add(customExtentItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return customExtent
   */
  @JsonProperty(JSON_PROPERTY_CUSTOM_EXTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Object> getCustomExtent() {
    return customExtent;
  }

  public void setCustomExtent(List<Object> customExtent) {
    this.customExtent = customExtent;
  }

  /** Return true if this GeomapView20270101OneOf4457650336 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapView20270101OneOf4457650336 geomapView20270101OneOf4457650336 =
        (GeomapView20270101OneOf4457650336) o;
    return Objects.equals(this.customExtent, geomapView20270101OneOf4457650336.customExtent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customExtent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapView20270101OneOf4457650336 {\n");
    sb.append("    customExtent: ").append(toIndentedString(customExtent)).append("\n");
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
