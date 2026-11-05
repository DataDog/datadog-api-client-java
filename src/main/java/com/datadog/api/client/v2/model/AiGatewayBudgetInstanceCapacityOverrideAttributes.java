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

/** Attributes used to override one budget instance's active-period capacity. */
@JsonPropertyOrder({
  AiGatewayBudgetInstanceCapacityOverrideAttributes.JSON_PROPERTY_CAPACITY_MICROCENTS,
  AiGatewayBudgetInstanceCapacityOverrideAttributes.JSON_PROPERTY_INSTANCE_KEY,
  AiGatewayBudgetInstanceCapacityOverrideAttributes.JSON_PROPERTY_REASON
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayBudgetInstanceCapacityOverrideAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CAPACITY_MICROCENTS = "capacity_microcents";
  private Long capacityMicrocents;

  public static final String JSON_PROPERTY_INSTANCE_KEY = "instance_key";
  private String instanceKey;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public AiGatewayBudgetInstanceCapacityOverrideAttributes() {}

  @JsonCreator
  public AiGatewayBudgetInstanceCapacityOverrideAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CAPACITY_MICROCENTS)
          Long capacityMicrocents,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_KEY) String instanceKey) {
    this.capacityMicrocents = capacityMicrocents;
    this.instanceKey = instanceKey;
  }

  public AiGatewayBudgetInstanceCapacityOverrideAttributes capacityMicrocents(
      Long capacityMicrocents) {
    this.capacityMicrocents = capacityMicrocents;
    return this;
  }

  /**
   * New capacity for this instance in the active accounting period, in microcents. minimum: 1
   *
   * @return capacityMicrocents
   */
  @JsonProperty(JSON_PROPERTY_CAPACITY_MICROCENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCapacityMicrocents() {
    return capacityMicrocents;
  }

  public void setCapacityMicrocents(Long capacityMicrocents) {
    this.capacityMicrocents = capacityMicrocents;
  }

  public AiGatewayBudgetInstanceCapacityOverrideAttributes instanceKey(String instanceKey) {
    this.instanceKey = instanceKey;
    return this;
  }

  /**
   * Counter key of the instance to override, as returned by the list budget instances endpoint.
   *
   * @return instanceKey
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInstanceKey() {
    return instanceKey;
  }

  public void setInstanceKey(String instanceKey) {
    this.instanceKey = instanceKey;
  }

  public AiGatewayBudgetInstanceCapacityOverrideAttributes reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Optional reason recorded with the capacity override.
   *
   * @return reason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
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
   * @return AiGatewayBudgetInstanceCapacityOverrideAttributes
   */
  @JsonAnySetter
  public AiGatewayBudgetInstanceCapacityOverrideAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this AiGatewayBudgetInstanceCapacityOverrideAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayBudgetInstanceCapacityOverrideAttributes
        aiGatewayBudgetInstanceCapacityOverrideAttributes =
            (AiGatewayBudgetInstanceCapacityOverrideAttributes) o;
    return Objects.equals(
            this.capacityMicrocents,
            aiGatewayBudgetInstanceCapacityOverrideAttributes.capacityMicrocents)
        && Objects.equals(
            this.instanceKey, aiGatewayBudgetInstanceCapacityOverrideAttributes.instanceKey)
        && Objects.equals(this.reason, aiGatewayBudgetInstanceCapacityOverrideAttributes.reason)
        && Objects.equals(
            this.additionalProperties,
            aiGatewayBudgetInstanceCapacityOverrideAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityMicrocents, instanceKey, reason, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayBudgetInstanceCapacityOverrideAttributes {\n");
    sb.append("    capacityMicrocents: ").append(toIndentedString(capacityMicrocents)).append("\n");
    sb.append("    instanceKey: ").append(toIndentedString(instanceKey)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
