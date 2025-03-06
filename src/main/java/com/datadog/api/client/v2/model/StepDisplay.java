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

/** The definition of <code>StepDisplay</code> object. */
@JsonPropertyOrder({StepDisplay.JSON_PROPERTY_BOUNDS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StepDisplay {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BOUNDS = "bounds";
  private StepDisplayBounds bounds;

  public StepDisplay bounds(StepDisplayBounds bounds) {
    this.bounds = bounds;
    this.unparsed |= bounds.unparsed;
    return this;
  }

  /**
   * The definition of <code>StepDisplayBounds</code> object.
   *
   * @return bounds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StepDisplayBounds getBounds() {
    return bounds;
  }

  public void setBounds(StepDisplayBounds bounds) {
    this.bounds = bounds;
  }

  /** Return true if this StepDisplay object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StepDisplay stepDisplay = (StepDisplay) o;
    return Objects.equals(this.bounds, stepDisplay.bounds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bounds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepDisplay {\n");
    sb.append("    bounds: ").append(toIndentedString(bounds)).append("\n");
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
