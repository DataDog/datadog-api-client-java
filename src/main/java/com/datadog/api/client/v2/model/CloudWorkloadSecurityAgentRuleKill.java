/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Kill system call applied on the container matching the rule */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleKill.JSON_PROPERTY_DISABLE_CONTAINER_DISARMER,
  CloudWorkloadSecurityAgentRuleKill.JSON_PROPERTY_DISABLE_EXECUTABLE_DISARMER,
  CloudWorkloadSecurityAgentRuleKill.JSON_PROPERTY_SCOPE,
  CloudWorkloadSecurityAgentRuleKill.JSON_PROPERTY_SIGNAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleKill {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISABLE_CONTAINER_DISARMER =
      "disable_container_disarmer";
  private Boolean disableContainerDisarmer;

  public static final String JSON_PROPERTY_DISABLE_EXECUTABLE_DISARMER =
      "disable_executable_disarmer";
  private Boolean disableExecutableDisarmer;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_SIGNAL = "signal";
  private String signal;

  public CloudWorkloadSecurityAgentRuleKill disableContainerDisarmer(
      Boolean disableContainerDisarmer) {
    this.disableContainerDisarmer = disableContainerDisarmer;
    return this;
  }

  /**
   * Whether the automatic container safeguard of the kill action is disabled.
   *
   * @return disableContainerDisarmer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLE_CONTAINER_DISARMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisableContainerDisarmer() {
    return disableContainerDisarmer;
  }

  public void setDisableContainerDisarmer(Boolean disableContainerDisarmer) {
    this.disableContainerDisarmer = disableContainerDisarmer;
  }

  public CloudWorkloadSecurityAgentRuleKill disableExecutableDisarmer(
      Boolean disableExecutableDisarmer) {
    this.disableExecutableDisarmer = disableExecutableDisarmer;
    return this;
  }

  /**
   * Whether the automatic executable safeguard of the kill action is disabled.
   *
   * @return disableExecutableDisarmer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLE_EXECUTABLE_DISARMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisableExecutableDisarmer() {
    return disableExecutableDisarmer;
  }

  public void setDisableExecutableDisarmer(Boolean disableExecutableDisarmer) {
    this.disableExecutableDisarmer = disableExecutableDisarmer;
  }

  public CloudWorkloadSecurityAgentRuleKill scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The scope of the kill action.
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public CloudWorkloadSecurityAgentRuleKill signal(String signal) {
    this.signal = signal;
    return this;
  }

  /**
   * Supported signals for the kill system call
   *
   * @return signal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSignal() {
    return signal;
  }

  public void setSignal(String signal) {
    this.signal = signal;
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
   * @return CloudWorkloadSecurityAgentRuleKill
   */
  @JsonAnySetter
  public CloudWorkloadSecurityAgentRuleKill putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CloudWorkloadSecurityAgentRuleKill object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleKill cloudWorkloadSecurityAgentRuleKill =
        (CloudWorkloadSecurityAgentRuleKill) o;
    return Objects.equals(
            this.disableContainerDisarmer,
            cloudWorkloadSecurityAgentRuleKill.disableContainerDisarmer)
        && Objects.equals(
            this.disableExecutableDisarmer,
            cloudWorkloadSecurityAgentRuleKill.disableExecutableDisarmer)
        && Objects.equals(this.scope, cloudWorkloadSecurityAgentRuleKill.scope)
        && Objects.equals(this.signal, cloudWorkloadSecurityAgentRuleKill.signal)
        && Objects.equals(
            this.additionalProperties, cloudWorkloadSecurityAgentRuleKill.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        disableContainerDisarmer, disableExecutableDisarmer, scope, signal, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleKill {\n");
    sb.append("    disableContainerDisarmer: ")
        .append(toIndentedString(disableContainerDisarmer))
        .append("\n");
    sb.append("    disableExecutableDisarmer: ")
        .append(toIndentedString(disableExecutableDisarmer))
        .append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
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
