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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ScatterplotRequests20270101OneOf.JSON_PROPERTY_X,
  ScatterplotRequests20270101OneOf.JSON_PROPERTY_Y
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotRequests20270101OneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_X = "x";
  private ScatterplotBackendAxisRequest_20270101 x;

  public static final String JSON_PROPERTY_Y = "y";
  private ScatterplotBackendAxisRequest_20270101 y;

  public ScatterplotRequests20270101OneOf() {}

  @JsonCreator
  public ScatterplotRequests20270101OneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_X)
          ScatterplotBackendAxisRequest_20270101 x,
      @JsonProperty(required = true, value = JSON_PROPERTY_Y)
          ScatterplotBackendAxisRequest_20270101 y) {
    this.x = x;
    this.unparsed |= x.unparsed;
    this.y = y;
    this.unparsed |= y.unparsed;
  }

  public ScatterplotRequests20270101OneOf x(ScatterplotBackendAxisRequest_20270101 x) {
    this.x = x;
    this.unparsed |= x.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return x
   */
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ScatterplotBackendAxisRequest_20270101 getX() {
    return x;
  }

  public void setX(ScatterplotBackendAxisRequest_20270101 x) {
    this.x = x;
    if (x != null) {
      this.unparsed |= x.unparsed;
    }
  }

  public ScatterplotRequests20270101OneOf y(ScatterplotBackendAxisRequest_20270101 y) {
    this.y = y;
    this.unparsed |= y.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return y
   */
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ScatterplotBackendAxisRequest_20270101 getY() {
    return y;
  }

  public void setY(ScatterplotBackendAxisRequest_20270101 y) {
    this.y = y;
    if (y != null) {
      this.unparsed |= y.unparsed;
    }
  }

  /** Return true if this ScatterplotRequests20270101OneOf object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotRequests20270101OneOf scatterplotRequests20270101OneOf =
        (ScatterplotRequests20270101OneOf) o;
    return Objects.equals(this.x, scatterplotRequests20270101OneOf.x)
        && Objects.equals(this.y, scatterplotRequests20270101OneOf.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotRequests20270101OneOf {\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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
