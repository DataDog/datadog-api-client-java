/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** A column definition for reference table queries. */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionReferenceTableColumn.JSON_PROPERTY_ALIAS,
  MonitorFormulaAndFunctionReferenceTableColumn.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionReferenceTableColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public MonitorFormulaAndFunctionReferenceTableColumn() {}

  @JsonCreator
  public MonitorFormulaAndFunctionReferenceTableColumn(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public MonitorFormulaAndFunctionReferenceTableColumn alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Optional alias for the column.
   *
   * @return alias
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public MonitorFormulaAndFunctionReferenceTableColumn name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the column.
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

  /** Return true if this MonitorFormulaAndFunctionReferenceTableColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionReferenceTableColumn monitorFormulaAndFunctionReferenceTableColumn =
        (MonitorFormulaAndFunctionReferenceTableColumn) o;
    return Objects.equals(this.alias, monitorFormulaAndFunctionReferenceTableColumn.alias)
        && Objects.equals(this.name, monitorFormulaAndFunctionReferenceTableColumn.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionReferenceTableColumn {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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
