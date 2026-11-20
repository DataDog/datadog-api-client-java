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
  GraphQuerySearchFilter.JSON_PROPERTY_NAME,
  GraphQuerySearchFilter.JSON_PROPERTY_OPERATOR,
  GraphQuerySearchFilter.JSON_PROPERTY_TARGET,
  GraphQuerySearchFilter.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GraphQuerySearchFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private GraphQuerySearchFilterOperator operator;

  public static final String JSON_PROPERTY_TARGET = "target";
  private GraphTarget target;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public GraphQuerySearchFilter() {}

  @JsonCreator
  public GraphQuerySearchFilter(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATOR)
          GraphQuerySearchFilterOperator operator,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) Double value) {
    this.name = name;
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    this.value = value;
  }

  public GraphQuerySearchFilter name(String name) {
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

  public GraphQuerySearchFilter operator(GraphQuerySearchFilterOperator operator) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return operator
   */
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GraphQuerySearchFilterOperator getOperator() {
    return operator;
  }

  public void setOperator(GraphQuerySearchFilterOperator operator) {
    if (!operator.isValid()) {
      this.unparsed = true;
    }
    this.operator = operator;
  }

  public GraphQuerySearchFilter target(GraphTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GraphTarget getTarget() {
    return target;
  }

  public void setTarget(GraphTarget target) {
    this.target = target;
    if (target != null) {
      this.unparsed |= target.unparsed;
    }
  }

  public GraphQuerySearchFilter value(Double value) {
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
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  /** Return true if this GraphQuerySearchFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphQuerySearchFilter graphQuerySearchFilter = (GraphQuerySearchFilter) o;
    return Objects.equals(this.name, graphQuerySearchFilter.name)
        && Objects.equals(this.operator, graphQuerySearchFilter.operator)
        && Objects.equals(this.target, graphQuerySearchFilter.target)
        && Objects.equals(this.value, graphQuerySearchFilter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, operator, target, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphQuerySearchFilter {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
