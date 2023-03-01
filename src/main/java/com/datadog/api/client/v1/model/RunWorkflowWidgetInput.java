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
   * <p>Object to map a dashboard template variable to a workflow input.</p>
 */
@JsonPropertyOrder({
  RunWorkflowWidgetInput.JSON_PROPERTY_NAME,
  RunWorkflowWidgetInput.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RunWorkflowWidgetInput {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public RunWorkflowWidgetInput() {}

  @JsonCreator
  public RunWorkflowWidgetInput(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_VALUE)String value) {
        this.name = name;
        this.value = value;
  }
  public RunWorkflowWidgetInput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the workflow input.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public RunWorkflowWidgetInput value(String value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Dashboard template variable. Can be suffixed with '.value' or '.key'.</p>
   * @return value
  **/
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getValue() {
        return value;
      }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Return true if this RunWorkflowWidgetInput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunWorkflowWidgetInput runWorkflowWidgetInput = (RunWorkflowWidgetInput) o;
    return Objects.equals(this.name, runWorkflowWidgetInput.name) && Objects.equals(this.value, runWorkflowWidgetInput.value);
  }


  @Override
  public int hashCode() {
    return Objects.hash(name,value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunWorkflowWidgetInput {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
