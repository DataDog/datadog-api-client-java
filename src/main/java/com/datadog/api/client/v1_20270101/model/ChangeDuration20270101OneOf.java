/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ChangeDuration20270101OneOf.JSON_PROPERTY_CUSTOM_TIMEFRAME,
  ChangeDuration20270101OneOf.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeDuration20270101OneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_TIMEFRAME = "custom_timeframe";
  private FixedSpan2 customTimeframe;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ChangeDurationAnyOfAnyOfItemType type;

  public ChangeDuration20270101OneOf() {}

  @JsonCreator
  public ChangeDuration20270101OneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_CUSTOM_TIMEFRAME)
          FixedSpan2 customTimeframe,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ChangeDurationAnyOfAnyOfItemType type) {
    this.customTimeframe = customTimeframe;
    this.unparsed |= customTimeframe.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ChangeDuration20270101OneOf customTimeframe(FixedSpan2 customTimeframe) {
    this.customTimeframe = customTimeframe;
    this.unparsed |= customTimeframe.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return customTimeframe
   */
  @JsonProperty(JSON_PROPERTY_CUSTOM_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FixedSpan2 getCustomTimeframe() {
    return customTimeframe;
  }

  public void setCustomTimeframe(FixedSpan2 customTimeframe) {
    this.customTimeframe = customTimeframe;
    if (customTimeframe != null) {
      this.unparsed |= customTimeframe.unparsed;
    }
  }

  public ChangeDuration20270101OneOf type(ChangeDurationAnyOfAnyOfItemType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ChangeDurationAnyOfAnyOfItemType getType() {
    return type;
  }

  public void setType(ChangeDurationAnyOfAnyOfItemType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ChangeDuration20270101OneOf object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeDuration20270101OneOf changeDuration20270101OneOf = (ChangeDuration20270101OneOf) o;
    return Objects.equals(this.customTimeframe, changeDuration20270101OneOf.customTimeframe)
        && Objects.equals(this.type, changeDuration20270101OneOf.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTimeframe, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeDuration20270101OneOf {\n");
    sb.append("    customTimeframe: ").append(toIndentedString(customTimeframe)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
