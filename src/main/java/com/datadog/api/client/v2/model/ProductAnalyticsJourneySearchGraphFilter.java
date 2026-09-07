/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A filter applied to a step, or a range of steps, of the journey graph. */
@JsonPropertyOrder({
  ProductAnalyticsJourneySearchGraphFilter.JSON_PROPERTY_NAME,
  ProductAnalyticsJourneySearchGraphFilter.JSON_PROPERTY_OPERATOR,
  ProductAnalyticsJourneySearchGraphFilter.JSON_PROPERTY_TARGET,
  ProductAnalyticsJourneySearchGraphFilter.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsJourneySearchGraphFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private ProductAnalyticsJourneySearchGraphFilterName name;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private ProductAnalyticsJourneySearchGraphFilterOperator operator;

  public static final String JSON_PROPERTY_TARGET = "target";
  private ProductAnalyticsJourneyTarget target;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Long value;

  public ProductAnalyticsJourneySearchGraphFilter() {}

  @JsonCreator
  public ProductAnalyticsJourneySearchGraphFilter(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME)
          ProductAnalyticsJourneySearchGraphFilterName name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATOR)
          ProductAnalyticsJourneySearchGraphFilterOperator operator,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) Long value) {
    this.name = name;
    this.unparsed |= !name.isValid();
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    this.value = value;
  }

  public ProductAnalyticsJourneySearchGraphFilter name(
      ProductAnalyticsJourneySearchGraphFilterName name) {
    this.name = name;
    this.unparsed |= !name.isValid();
    return this;
  }

  /**
   * The journey-level metric the graph filter applies to.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsJourneySearchGraphFilterName getName() {
    return name;
  }

  public void setName(ProductAnalyticsJourneySearchGraphFilterName name) {
    if (!name.isValid()) {
      this.unparsed = true;
    }
    this.name = name;
  }

  public ProductAnalyticsJourneySearchGraphFilter operator(
      ProductAnalyticsJourneySearchGraphFilterOperator operator) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    return this;
  }

  /**
   * Comparison operator applied to the graph filter value.
   *
   * @return operator
   */
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsJourneySearchGraphFilterOperator getOperator() {
    return operator;
  }

  public void setOperator(ProductAnalyticsJourneySearchGraphFilterOperator operator) {
    if (!operator.isValid()) {
      this.unparsed = true;
    }
    this.operator = operator;
  }

  public ProductAnalyticsJourneySearchGraphFilter target(ProductAnalyticsJourneyTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * A reference to a step, or a range of steps, in the journey. Use a <code>node</code> target to
   * name a single step, or a <code>path</code> target to name the range between two steps.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsJourneyTarget getTarget() {
    return target;
  }

  public void setTarget(ProductAnalyticsJourneyTarget target) {
    this.target = target;
    if (target != null) {
      this.unparsed |= target.unparsed;
    }
  }

  public ProductAnalyticsJourneySearchGraphFilter value(Long value) {
    this.value = value;
    return this;
  }

  /**
   * Value compared against the metric. Durations are expressed in milliseconds.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ProductAnalyticsJourneySearchGraphFilter
   */
  @JsonAnySetter
  public ProductAnalyticsJourneySearchGraphFilter putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this ProductAnalyticsJourneySearchGraphFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsJourneySearchGraphFilter productAnalyticsJourneySearchGraphFilter =
        (ProductAnalyticsJourneySearchGraphFilter) o;
    return Objects.equals(this.name, productAnalyticsJourneySearchGraphFilter.name)
        && Objects.equals(this.operator, productAnalyticsJourneySearchGraphFilter.operator)
        && Objects.equals(this.target, productAnalyticsJourneySearchGraphFilter.target)
        && Objects.equals(this.value, productAnalyticsJourneySearchGraphFilter.value)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsJourneySearchGraphFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, operator, target, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsJourneySearchGraphFilter {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
