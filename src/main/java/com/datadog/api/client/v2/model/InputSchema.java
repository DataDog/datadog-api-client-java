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

/**
 * A list of input parameters for the workflow. These can be used as dynamic runtime values in your
 * workflow.
 */
@JsonPropertyOrder({InputSchema.JSON_PROPERTY_PARAMETERS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class InputSchema {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List<InputSchemaParameters> parameters = null;

  public InputSchema parameters(List<InputSchemaParameters> parameters) {
    this.parameters = parameters;
    for (InputSchemaParameters item : parameters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public InputSchema addParametersItem(InputSchemaParameters parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    this.unparsed |= parametersItem.unparsed;
    return this;
  }

  /**
   * The <code>InputSchema</code> <code>parameters</code>.
   *
   * @return parameters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<InputSchemaParameters> getParameters() {
    return parameters;
  }

  public void setParameters(List<InputSchemaParameters> parameters) {
    this.parameters = parameters;
  }

  /** Return true if this InputSchema object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputSchema inputSchema = (InputSchema) o;
    return Objects.equals(this.parameters, inputSchema.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputSchema {\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
