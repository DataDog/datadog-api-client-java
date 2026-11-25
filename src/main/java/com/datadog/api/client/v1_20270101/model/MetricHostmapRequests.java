/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  MetricHostmapRequests.JSON_PROPERTY_FILL,
  MetricHostmapRequests.JSON_PROPERTY_SIZE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricHostmapRequests {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILL = "fill";
  private HostmapTileDefFillRequest fill;

  public static final String JSON_PROPERTY_SIZE = "size";
  private HostmapTileDefSizeRequest size;

  public MetricHostmapRequests fill(HostmapTileDefFillRequest fill) {
    this.fill = fill;
    this.unparsed |= fill.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return fill
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostmapTileDefFillRequest getFill() {
    return fill;
  }

  public void setFill(HostmapTileDefFillRequest fill) {
    this.fill = fill;
    if (fill != null) {
      this.unparsed |= fill.unparsed;
    }
  }

  public MetricHostmapRequests size(HostmapTileDefSizeRequest size) {
    this.size = size;
    this.unparsed |= size.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return size
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostmapTileDefSizeRequest getSize() {
    return size;
  }

  public void setSize(HostmapTileDefSizeRequest size) {
    this.size = size;
    if (size != null) {
      this.unparsed |= size.unparsed;
    }
  }

  /** Return true if this MetricHostmapRequests object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricHostmapRequests metricHostmapRequests = (MetricHostmapRequests) o;
    return Objects.equals(this.fill, metricHostmapRequests.fill)
        && Objects.equals(this.size, metricHostmapRequests.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fill, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricHostmapRequests {\n");
    sb.append("    fill: ").append(toIndentedString(fill)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
