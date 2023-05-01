/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The new span-based metric properties. */
@JsonPropertyOrder({
  SpansMetricUpdateData.JSON_PROPERTY_ATTRIBUTES,
  SpansMetricUpdateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SpansMetricUpdateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SpansMetricUpdateAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SpansMetricType type = SpansMetricType.SPANS_METRICS;

  public SpansMetricUpdateData() {}

  @JsonCreator
  public SpansMetricUpdateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          SpansMetricUpdateAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SpansMetricType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SpansMetricUpdateData attributes(SpansMetricUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The span-based metric properties that will be updated.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SpansMetricUpdateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SpansMetricUpdateAttributes attributes) {
    this.attributes = attributes;
  }

  public SpansMetricUpdateData type(SpansMetricType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of resource. The value should always be spans_metrics.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SpansMetricType getType() {
    return type;
  }

  public void setType(SpansMetricType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SpansMetricUpdateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpansMetricUpdateData spansMetricUpdateData = (SpansMetricUpdateData) o;
    return Objects.equals(this.attributes, spansMetricUpdateData.attributes)
        && Objects.equals(this.type, spansMetricUpdateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpansMetricUpdateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
