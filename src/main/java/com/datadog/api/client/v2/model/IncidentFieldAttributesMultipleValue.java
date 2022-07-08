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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** A field with potentially multiple values selected. */
@JsonPropertyOrder({
  IncidentFieldAttributesMultipleValue.JSON_PROPERTY_TYPE,
  IncidentFieldAttributesMultipleValue.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentFieldAttributesMultipleValue {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentFieldAttributesValueType type = IncidentFieldAttributesValueType.MULTISELECT;

  public static final String JSON_PROPERTY_VALUE = "value";
  private JsonNullable<List<String>> value = JsonNullable.<List<String>>undefined();

  public IncidentFieldAttributesMultipleValue type(IncidentFieldAttributesValueType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the multiple value field definitions.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentFieldAttributesValueType getType() {
    return type;
  }

  public void setType(IncidentFieldAttributesValueType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public IncidentFieldAttributesMultipleValue value(List<String> value) {
    this.value = JsonNullable.<List<String>>of(value);
    return this;
  }

  public IncidentFieldAttributesMultipleValue addValueItem(String valueItem) {
    if (this.value == null || !this.value.isPresent()) {
      this.value = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.value.get().add(valueItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The multiple values selected for this field.
   *
   * @return value
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public List<String> getValue() {
    return value.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getValue_JsonNullable() {
    return value;
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  public void setValue_JsonNullable(JsonNullable<List<String>> value) {
    this.value = value;
  }

  public void setValue(List<String> value) {
    this.value = JsonNullable.<List<String>>of(value);
  }

  /** Return true if this IncidentFieldAttributesMultipleValue object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentFieldAttributesMultipleValue incidentFieldAttributesMultipleValue =
        (IncidentFieldAttributesMultipleValue) o;
    return Objects.equals(this.type, incidentFieldAttributesMultipleValue.type)
        && Objects.equals(this.value, incidentFieldAttributesMultipleValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentFieldAttributesMultipleValue {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
