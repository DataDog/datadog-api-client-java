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
@JsonPropertyOrder({ChangeDuration20270101OneOf4454627136.JSON_PROPERTY_TYPE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeDuration20270101OneOf4454627136 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private ChangeDurationAnyOfAnyOfItemType4444207072 type;

  public ChangeDuration20270101OneOf4454627136() {}

  @JsonCreator
  public ChangeDuration20270101OneOf4454627136(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ChangeDurationAnyOfAnyOfItemType4444207072 type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ChangeDuration20270101OneOf4454627136 type(
      ChangeDurationAnyOfAnyOfItemType4444207072 type) {
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
  public ChangeDurationAnyOfAnyOfItemType4444207072 getType() {
    return type;
  }

  public void setType(ChangeDurationAnyOfAnyOfItemType4444207072 type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ChangeDuration20270101OneOf4454627136 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeDuration20270101OneOf4454627136 changeDuration20270101OneOf4454627136 =
        (ChangeDuration20270101OneOf4454627136) o;
    return Objects.equals(this.type, changeDuration20270101OneOf4454627136.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeDuration20270101OneOf4454627136 {\n");
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
