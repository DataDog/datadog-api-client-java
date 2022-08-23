/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object containing an array of Synthetic global variables. */
@JsonPropertyOrder({SyntheticsListGlobalVariablesResponse.JSON_PROPERTY_VARIABLES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsListGlobalVariablesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private List<SyntheticsGlobalVariable> variables = null;

  public SyntheticsListGlobalVariablesResponse variables(List<SyntheticsGlobalVariable> variables) {
    this.variables = variables;
    for (SyntheticsGlobalVariable item : variables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsListGlobalVariablesResponse addVariablesItem(
      SyntheticsGlobalVariable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    this.unparsed |= variablesItem.unparsed;
    return this;
  }

  /**
   * Array of Synthetic global variables.
   *
   * @return variables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsGlobalVariable> getVariables() {
    return variables;
  }

  public void setVariables(List<SyntheticsGlobalVariable> variables) {
    this.variables = variables;
  }

  /** Return true if this SyntheticsListGlobalVariablesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsListGlobalVariablesResponse syntheticsListGlobalVariablesResponse =
        (SyntheticsListGlobalVariablesResponse) o;
    return Objects.equals(this.variables, syntheticsListGlobalVariablesResponse.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsListGlobalVariablesResponse {\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
