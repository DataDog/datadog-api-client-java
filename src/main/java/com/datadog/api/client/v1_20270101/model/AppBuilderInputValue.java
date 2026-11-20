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
  AppBuilderInputValue.JSON_PROPERTY_NAME,
  AppBuilderInputValue.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AppBuilderInputValue {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private com.datadog.api.client.v1.model.AppBuilderInputValue20270101Value value;

  public AppBuilderInputValue() {}

  @JsonCreator
  public AppBuilderInputValue(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE)
          com.datadog.api.client.v1.model.AppBuilderInputValue20270101Value value) {
    this.name = name;
    this.value = value;
    this.unparsed |= value.unparsed;
  }

  public AppBuilderInputValue name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppBuilderInputValue value(
      com.datadog.api.client.v1.model.AppBuilderInputValue20270101Value value) {
    this.value = value;
    this.unparsed |= value.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public com.datadog.api.client.v1.model.AppBuilderInputValue20270101Value getValue() {
    return value;
  }

  public void setValue(com.datadog.api.client.v1.model.AppBuilderInputValue20270101Value value) {
    this.value = value;
    if (value != null) {
      this.unparsed |= value.unparsed;
    }
  }

  /** Return true if this AppBuilderInputValue object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppBuilderInputValue appBuilderInputValue = (AppBuilderInputValue) o;
    return Objects.equals(this.name, appBuilderInputValue.name)
        && Objects.equals(this.value, appBuilderInputValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppBuilderInputValue {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
