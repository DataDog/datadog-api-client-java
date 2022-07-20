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
import org.openapitools.jackson.nullable.JsonNullable;

/** Usage amount for a given usage type. */
@JsonPropertyOrder({
  HourlyUsageMeasurement.JSON_PROPERTY_USAGE_TYPE,
  HourlyUsageMeasurement.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HourlyUsageMeasurement {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_USAGE_TYPE = "usage_type";
  private String usageType;

  public static final String JSON_PROPERTY_VALUE = "value";
  private JsonNullable<Long> value = JsonNullable.<Long>undefined();

  public HourlyUsageMeasurement usageType(String usageType) {
    this.usageType = usageType;
    return this;
  }

  /**
   * Type of usage.
   *
   * @return usageType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUsageType() {
    return usageType;
  }

  public void setUsageType(String usageType) {
    this.usageType = usageType;
  }

  public HourlyUsageMeasurement value(Long value) {
    this.value = JsonNullable.<Long>of(value);
    return this;
  }

  /**
   * Contains the number measured for the given usage_type during the hour.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getValue() {
    return value.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getValue_JsonNullable() {
    return value;
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  public void setValue_JsonNullable(JsonNullable<Long> value) {
    this.value = value;
  }

  public void setValue(Long value) {
    this.value = JsonNullable.<Long>of(value);
  }

  /** Return true if this HourlyUsageMeasurement object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourlyUsageMeasurement hourlyUsageMeasurement = (HourlyUsageMeasurement) o;
    return Objects.equals(this.usageType, hourlyUsageMeasurement.usageType)
        && Objects.equals(this.value, hourlyUsageMeasurement.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HourlyUsageMeasurement {\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
