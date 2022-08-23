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

/** Hourly usage for a product family for an org. */
@JsonPropertyOrder({
  HourlyUsage.JSON_PROPERTY_ATTRIBUTES,
  HourlyUsage.JSON_PROPERTY_ID,
  HourlyUsage.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HourlyUsage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private HourlyUsageAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private UsageTimeSeriesType type = UsageTimeSeriesType.USAGE_TIMESERIES;

  public HourlyUsage attributes(HourlyUsageAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of hourly usage for a product family for an org for a time period.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HourlyUsageAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(HourlyUsageAttributes attributes) {
    this.attributes = attributes;
  }

  public HourlyUsage id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID of the response.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HourlyUsage type(UsageTimeSeriesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of usage data.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageTimeSeriesType getType() {
    return type;
  }

  public void setType(UsageTimeSeriesType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this HourlyUsage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourlyUsage hourlyUsage = (HourlyUsage) o;
    return Objects.equals(this.attributes, hourlyUsage.attributes)
        && Objects.equals(this.id, hourlyUsage.id)
        && Objects.equals(this.type, hourlyUsage.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HourlyUsage {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
