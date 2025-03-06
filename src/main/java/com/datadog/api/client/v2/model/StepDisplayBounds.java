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

/** The definition of <code>StepDisplayBounds</code> object. */
@JsonPropertyOrder({StepDisplayBounds.JSON_PROPERTY_X, StepDisplayBounds.JSON_PROPERTY_Y})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StepDisplayBounds {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_X = "x";
  private Double x;

  public static final String JSON_PROPERTY_Y = "y";
  private Double y;

  public StepDisplayBounds x(Double x) {
    this.x = x;
    return this;
  }

  /**
   * The <code>bounds</code> <code>x</code>.
   *
   * @return x
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public StepDisplayBounds y(Double y) {
    this.y = y;
    return this;
  }

  /**
   * The <code>bounds</code> <code>y</code>.
   *
   * @return y
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  /** Return true if this StepDisplayBounds object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StepDisplayBounds stepDisplayBounds = (StepDisplayBounds) o;
    return Objects.equals(this.x, stepDisplayBounds.x)
        && Objects.equals(this.y, stepDisplayBounds.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepDisplayBounds {\n");
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
