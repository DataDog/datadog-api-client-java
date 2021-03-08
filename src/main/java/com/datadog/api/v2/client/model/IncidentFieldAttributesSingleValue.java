/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v2.client.model.IncidentFieldAttributesSingleValueType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * A field with a single value selected.
 */
@ApiModel(description = "A field with a single value selected.")
@JsonPropertyOrder({
  IncidentFieldAttributesSingleValue.JSON_PROPERTY_TYPE,
  IncidentFieldAttributesSingleValue.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentFieldAttributesSingleValue {
  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentFieldAttributesSingleValueType type = IncidentFieldAttributesSingleValueType.DROPDOWN;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;


  public IncidentFieldAttributesSingleValue type(IncidentFieldAttributesSingleValueType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IncidentFieldAttributesSingleValueType getType() {
    return type;
  }


  public void setType(IncidentFieldAttributesSingleValueType type) {
    this.type = type;
  }


  public IncidentFieldAttributesSingleValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The single value selected for this field.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SEV-1", value = "The single value selected for this field.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this IncidentFieldAttributesSingleValue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentFieldAttributesSingleValue incidentFieldAttributesSingleValue = (IncidentFieldAttributesSingleValue) o;
    return Objects.equals(this.type, incidentFieldAttributesSingleValue.type) &&
        Objects.equals(this.value, incidentFieldAttributesSingleValue.value);
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

