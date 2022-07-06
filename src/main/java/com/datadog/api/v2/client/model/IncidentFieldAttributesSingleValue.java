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
import org.openapitools.jackson.nullable.JsonNullable;

/** A field with a single value selected. */
@JsonPropertyOrder({
  IncidentFieldAttributesSingleValue.JSON_PROPERTY_TYPE,
  IncidentFieldAttributesSingleValue.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentFieldAttributesSingleValue {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentFieldAttributesSingleValueType type =
      IncidentFieldAttributesSingleValueType.DROPDOWN;

  public static final String JSON_PROPERTY_VALUE = "value";
  private JsonNullable<String> value = JsonNullable.<String>undefined();

  public IncidentFieldAttributesSingleValue type(IncidentFieldAttributesSingleValueType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the single value field definitions.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentFieldAttributesSingleValueType getType() {
    return type;
  }

  public void setType(IncidentFieldAttributesSingleValueType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public IncidentFieldAttributesSingleValue value(String value) {
    this.value = JsonNullable.<String>of(value);
    return this;
  }

  /**
   * The single value selected for this field.
   *
   * @return value
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getValue() {
    return value.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getValue_JsonNullable() {
    return value;
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  public void setValue_JsonNullable(JsonNullable<String> value) {
    this.value = value;
  }

  public void setValue(String value) {
    this.value = JsonNullable.<String>of(value);
  }

  /** Return true if this IncidentFieldAttributesSingleValue object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentFieldAttributesSingleValue incidentFieldAttributesSingleValue =
        (IncidentFieldAttributesSingleValue) o;
    return Objects.equals(this.type, incidentFieldAttributesSingleValue.type)
        && Objects.equals(this.value, incidentFieldAttributesSingleValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentFieldAttributesSingleValue {\n");
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
