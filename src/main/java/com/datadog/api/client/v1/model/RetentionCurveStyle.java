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

/** Style configuration for retention curve. */
@JsonPropertyOrder({RetentionCurveStyle.JSON_PROPERTY_PALETTE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionCurveStyle {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public RetentionCurveStyle palette(String palette) {
    this.palette = palette;
    return this;
  }

  /**
   * Color palette for the retention curve.
   *
   * @return palette
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPalette() {
    return palette;
  }

  public void setPalette(String palette) {
    this.palette = palette;
  }

  /** Return true if this RetentionCurveStyle object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionCurveStyle retentionCurveStyle = (RetentionCurveStyle) o;
    return Objects.equals(this.palette, retentionCurveStyle.palette);
  }

  @Override
  public int hashCode() {
    return Objects.hash(palette);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionCurveStyle {\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
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
