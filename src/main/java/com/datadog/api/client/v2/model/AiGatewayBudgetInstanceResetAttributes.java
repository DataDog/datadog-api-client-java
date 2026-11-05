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

/** Attributes used to reset one budget instance's active-period spend. */
@JsonPropertyOrder({
  AiGatewayBudgetInstanceResetAttributes.JSON_PROPERTY_INSTANCE_KEY,
  AiGatewayBudgetInstanceResetAttributes.JSON_PROPERTY_REASON
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayBudgetInstanceResetAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INSTANCE_KEY = "instance_key";
  private String instanceKey;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public AiGatewayBudgetInstanceResetAttributes() {}

  @JsonCreator
  public AiGatewayBudgetInstanceResetAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_KEY) String instanceKey) {
    this.instanceKey = instanceKey;
  }

  public AiGatewayBudgetInstanceResetAttributes instanceKey(String instanceKey) {
    this.instanceKey = instanceKey;
    return this;
  }

  /**
   * Counter key of the instance to reset, as returned by the list budget instances endpoint.
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

  public AiGatewayBudgetInstanceResetAttributes reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Optional reason recorded with the spend reset.
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
   * @return AiGatewayBudgetInstanceResetAttributes
   */
  @JsonAnySetter
  public AiGatewayBudgetInstanceResetAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayBudgetInstanceResetAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayBudgetInstanceResetAttributes aiGatewayBudgetInstanceResetAttributes =
        (AiGatewayBudgetInstanceResetAttributes) o;
    return Objects.equals(this.instanceKey, aiGatewayBudgetInstanceResetAttributes.instanceKey)
        && Objects.equals(this.reason, aiGatewayBudgetInstanceResetAttributes.reason)
        && Objects.equals(
            this.additionalProperties, aiGatewayBudgetInstanceResetAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceKey, reason, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayBudgetInstanceResetAttributes {\n");
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
