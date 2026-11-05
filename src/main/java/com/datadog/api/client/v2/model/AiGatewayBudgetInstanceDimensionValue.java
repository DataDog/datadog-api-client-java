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

/** One value of a budget split dimension. */
@JsonPropertyOrder({
  AiGatewayBudgetInstanceDimensionValue.JSON_PROPERTY_INSTANCE_COUNT,
  AiGatewayBudgetInstanceDimensionValue.JSON_PROPERTY_SPEND_MICROCENTS,
  AiGatewayBudgetInstanceDimensionValue.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayBudgetInstanceDimensionValue {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INSTANCE_COUNT = "instance_count";
  private Long instanceCount;

  public static final String JSON_PROPERTY_SPEND_MICROCENTS = "spend_microcents";
  private Long spendMicrocents;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public AiGatewayBudgetInstanceDimensionValue() {}

  @JsonCreator
  public AiGatewayBudgetInstanceDimensionValue(
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_COUNT) Long instanceCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPEND_MICROCENTS) Long spendMicrocents,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) String value) {
    this.instanceCount = instanceCount;
    this.spendMicrocents = spendMicrocents;
    this.value = value;
  }

  public AiGatewayBudgetInstanceDimensionValue instanceCount(Long instanceCount) {
    this.instanceCount = instanceCount;
    return this;
  }

  /**
   * Number of instance counters carrying this value.
   *
   * @return instanceCount
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(Long instanceCount) {
    this.instanceCount = instanceCount;
  }

  public AiGatewayBudgetInstanceDimensionValue spendMicrocents(Long spendMicrocents) {
    this.spendMicrocents = spendMicrocents;
    return this;
  }

  /**
   * Spend summed across those instance counters, in microcents.
   *
   * @return spendMicrocents
   */
  @JsonProperty(JSON_PROPERTY_SPEND_MICROCENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSpendMicrocents() {
    return spendMicrocents;
  }

  public void setSpendMicrocents(Long spendMicrocents) {
    this.spendMicrocents = spendMicrocents;
  }

  public AiGatewayBudgetInstanceDimensionValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Raw dimension value. User and Team values are UUIDs. A counter with no value for the dimension
   * carries the null character (U+0000).
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
   * @return AiGatewayBudgetInstanceDimensionValue
   */
  @JsonAnySetter
  public AiGatewayBudgetInstanceDimensionValue putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayBudgetInstanceDimensionValue object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayBudgetInstanceDimensionValue aiGatewayBudgetInstanceDimensionValue =
        (AiGatewayBudgetInstanceDimensionValue) o;
    return Objects.equals(this.instanceCount, aiGatewayBudgetInstanceDimensionValue.instanceCount)
        && Objects.equals(
            this.spendMicrocents, aiGatewayBudgetInstanceDimensionValue.spendMicrocents)
        && Objects.equals(this.value, aiGatewayBudgetInstanceDimensionValue.value)
        && Objects.equals(
            this.additionalProperties, aiGatewayBudgetInstanceDimensionValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceCount, spendMicrocents, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayBudgetInstanceDimensionValue {\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    spendMicrocents: ").append(toIndentedString(spendMicrocents)).append("\n");
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
