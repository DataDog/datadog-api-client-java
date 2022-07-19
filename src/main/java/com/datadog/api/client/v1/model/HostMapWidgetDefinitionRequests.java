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

/** List of definitions. */
@JsonPropertyOrder({
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_FILL,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_SIZE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostMapWidgetDefinitionRequests {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILL = "fill";
  private HostMapRequest fill;

  public static final String JSON_PROPERTY_SIZE = "size";
  private HostMapRequest size;

  public HostMapWidgetDefinitionRequests fill(HostMapRequest fill) {
    this.fill = fill;
    this.unparsed |= fill.unparsed;
    return this;
  }

  /**
   * Updated host map.
   *
   * @return fill
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostMapRequest getFill() {
    return fill;
  }

  public void setFill(HostMapRequest fill) {
    this.fill = fill;
  }

  public HostMapWidgetDefinitionRequests size(HostMapRequest size) {
    this.size = size;
    this.unparsed |= size.unparsed;
    return this;
  }

  /**
   * Updated host map.
   *
   * @return size
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostMapRequest getSize() {
    return size;
  }

  public void setSize(HostMapRequest size) {
    this.size = size;
  }

  /** Return true if this HostMapWidgetDefinitionRequests object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMapWidgetDefinitionRequests hostMapWidgetDefinitionRequests =
        (HostMapWidgetDefinitionRequests) o;
    return Objects.equals(this.fill, hostMapWidgetDefinitionRequests.fill)
        && Objects.equals(this.size, hostMapWidgetDefinitionRequests.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fill, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMapWidgetDefinitionRequests {\n");
    sb.append("    fill: ").append(toIndentedString(fill)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
