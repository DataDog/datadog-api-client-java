/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Metadata for the metric. */
@JsonPropertyOrder({MetricMetadata.JSON_PROPERTY_ORIGIN})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ORIGIN = "origin";
  private MetricOrigin origin;

  public MetricMetadata origin(MetricOrigin origin) {
    this.origin = origin;
    this.unparsed |= origin.unparsed;
    return this;
  }

  /**
   * Metric origin information.
   *
   * @return origin
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MetricOrigin getOrigin() {
    return origin;
  }

  public void setOrigin(MetricOrigin origin) {
    this.origin = origin;
  }

  /** Return true if this MetricMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricMetadata metricMetadata = (MetricMetadata) o;
    return Objects.equals(this.origin, metricMetadata.origin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricMetadata {\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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
