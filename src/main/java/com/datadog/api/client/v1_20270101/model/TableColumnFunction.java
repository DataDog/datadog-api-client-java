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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({TableColumnFunction.JSON_PROPERTY_ARGS, TableColumnFunction.JSON_PROPERTY_NAME})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableColumnFunction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARGS = "args";
  private List<DashboardInlineSchema47> args = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public TableColumnFunction() {}

  @JsonCreator
  public TableColumnFunction(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public TableColumnFunction args(List<DashboardInlineSchema47> args) {
    this.args = args;
    if (args != null) {
      for (DashboardInlineSchema47 item : args) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TableColumnFunction addArgsItem(DashboardInlineSchema47 argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    this.unparsed |= argsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return args
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardInlineSchema47> getArgs() {
    return args;
  }

  public void setArgs(List<DashboardInlineSchema47> args) {
    this.args = args;
    if (args != null) {
      for (DashboardInlineSchema47 item : args) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TableColumnFunction name(String name) {
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

  /** Return true if this TableColumnFunction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableColumnFunction tableColumnFunction = (TableColumnFunction) o;
    return Objects.equals(this.args, tableColumnFunction.args)
        && Objects.equals(this.name, tableColumnFunction.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableColumnFunction {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
