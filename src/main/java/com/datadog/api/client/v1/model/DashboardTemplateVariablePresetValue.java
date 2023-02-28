/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Template variables saved views.</p>
 */
@JsonPropertyOrder({
  DashboardTemplateVariablePresetValue.JSON_PROPERTY_NAME,
  DashboardTemplateVariablePresetValue.JSON_PROPERTY_VALUE,
  DashboardTemplateVariablePresetValue.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardTemplateVariablePresetValue {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = null;

  public DashboardTemplateVariablePresetValue name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the variable.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public DashboardTemplateVariablePresetValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * <p>(deprecated) The value of the template variable within the saved view. Cannot be used in conjunction with <code>values</code>.</p>
   * @return value
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getValue() {
        return value;
      }
  @Deprecated
  public void setValue(String value) {
    this.value = value;
  }
  public DashboardTemplateVariablePresetValue values(List<String> values) {
    this.values = values;
    return this;
  }
  public DashboardTemplateVariablePresetValue addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * <p>One or many template variable values within the saved view, which will be unioned together using <code>OR</code> if more than one is specified. Cannot be used in conjunction with <code>value</code>.</p>
   * @return values
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALUES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getValues() {
        return values;
      }
  public void setValues(List<String> values) {
    this.values = values;
  }

  /**
   * Return true if this DashboardTemplateVariablePresetValue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardTemplateVariablePresetValue dashboardTemplateVariablePresetValue = (DashboardTemplateVariablePresetValue) o;
    return Objects.equals(this.name, dashboardTemplateVariablePresetValue.name) && Objects.equals(this.value, dashboardTemplateVariablePresetValue.value) && Objects.equals(this.values, dashboardTemplateVariablePresetValue.values);
  }


  @Override
  public int hashCode() {
    return Objects.hash(name,value,values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardTemplateVariablePresetValue {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
