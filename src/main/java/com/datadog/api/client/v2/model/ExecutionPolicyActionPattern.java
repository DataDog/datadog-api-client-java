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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The set of actions this policy applies to. */
@JsonPropertyOrder({
  ExecutionPolicyActionPattern.JSON_PROPERTY_ACTION_FQNS,
  ExecutionPolicyActionPattern.JSON_PROPERTY_INTEGRATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExecutionPolicyActionPattern {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION_FQNS = "action_fqns";
  private List<String> actionFqns = new ArrayList<>();

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private ExecutionPolicyIntegration integration;

  public ExecutionPolicyActionPattern() {}

  @JsonCreator
  public ExecutionPolicyActionPattern(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION_FQNS) List<String> actionFqns,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION)
          ExecutionPolicyIntegration integration) {
    this.actionFqns = actionFqns;
    this.integration = integration;
    this.unparsed |= !integration.isValid();
  }

  public ExecutionPolicyActionPattern actionFqns(List<String> actionFqns) {
    this.actionFqns = actionFqns;
    return this;
  }

  public ExecutionPolicyActionPattern addActionFqnsItem(String actionFqnsItem) {
    this.actionFqns.add(actionFqnsItem);
    return this;
  }

  /**
   * The fully qualified action names this policy matches. Use <code>*</code> to match all actions
   * of the integration, or a fully qualified name prefixed with the integration's action namespace
   * (for example <code>com.datadoghq.script.*</code> for the Script integration).
   *
   * @return actionFqns
   */
  @JsonProperty(JSON_PROPERTY_ACTION_FQNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getActionFqns() {
    return actionFqns;
  }

  public void setActionFqns(List<String> actionFqns) {
    this.actionFqns = actionFqns;
  }

  public ExecutionPolicyActionPattern integration(ExecutionPolicyIntegration integration) {
    this.integration = integration;
    this.unparsed |= !integration.isValid();
    return this;
  }

  /**
   * The integration the action pattern applies to.
   *
   * @return integration
   */
  @JsonProperty(JSON_PROPERTY_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExecutionPolicyIntegration getIntegration() {
    return integration;
  }

  public void setIntegration(ExecutionPolicyIntegration integration) {
    if (!integration.isValid()) {
      this.unparsed = true;
    }
    this.integration = integration;
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
   * @return ExecutionPolicyActionPattern
   */
  @JsonAnySetter
  public ExecutionPolicyActionPattern putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExecutionPolicyActionPattern object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionPolicyActionPattern executionPolicyActionPattern = (ExecutionPolicyActionPattern) o;
    return Objects.equals(this.actionFqns, executionPolicyActionPattern.actionFqns)
        && Objects.equals(this.integration, executionPolicyActionPattern.integration)
        && Objects.equals(
            this.additionalProperties, executionPolicyActionPattern.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionFqns, integration, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionPolicyActionPattern {\n");
    sb.append("    actionFqns: ").append(toIndentedString(actionFqns)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
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
