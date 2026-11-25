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
  TextMatch20270101OneOf4462867328.JSON_PROPERTY_TYPE,
  TextMatch20270101OneOf4462867328.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TextMatch20270101OneOf4462867328 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private TextMatchAnyOfAnyOfItemType4452735776 type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public TextMatch20270101OneOf4462867328() {}

  @JsonCreator
  public TextMatch20270101OneOf4462867328(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TextMatchAnyOfAnyOfItemType4452735776 type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) String value) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.value = value;
  }

  public TextMatch20270101OneOf4462867328 type(TextMatchAnyOfAnyOfItemType4452735776 type) {
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
  public TextMatchAnyOfAnyOfItemType4452735776 getType() {
    return type;
  }

  public void setType(TextMatchAnyOfAnyOfItemType4452735776 type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public TextMatch20270101OneOf4462867328 value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this TextMatch20270101OneOf4462867328 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextMatch20270101OneOf4462867328 textMatch20270101OneOf4462867328 =
        (TextMatch20270101OneOf4462867328) o;
    return Objects.equals(this.type, textMatch20270101OneOf4462867328.type)
        && Objects.equals(this.value, textMatch20270101OneOf4462867328.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextMatch20270101OneOf4462867328 {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
