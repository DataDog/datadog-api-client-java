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

/** The definition of <code>ApplicationSecurityWafCustomRuleAction</code> object. */
@JsonPropertyOrder({
  ApplicationSecurityWafCustomRuleAction.JSON_PROPERTY_ACTION,
  ApplicationSecurityWafCustomRuleAction.JSON_PROPERTY_PARAMETERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityWafCustomRuleAction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private ApplicationSecurityWafCustomRuleActionAction action =
      ApplicationSecurityWafCustomRuleActionAction.BLOCK_REQUEST;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private ApplicationSecurityWafCustomRuleActionParameters parameters;

  public ApplicationSecurityWafCustomRuleAction action(
      ApplicationSecurityWafCustomRuleActionAction action) {
    this.action = action;
    this.unparsed |= !action.isValid();
    return this;
  }

  /**
   * Override the default action to take when the WAF custom rule would block.
   *
   * @return action
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApplicationSecurityWafCustomRuleActionAction getAction() {
    return action;
  }

  public void setAction(ApplicationSecurityWafCustomRuleActionAction action) {
    if (!action.isValid()) {
      this.unparsed = true;
    }
    this.action = action;
  }

  public ApplicationSecurityWafCustomRuleAction parameters(
      ApplicationSecurityWafCustomRuleActionParameters parameters) {
    this.parameters = parameters;
    this.unparsed |= parameters.unparsed;
    return this;
  }

  /**
   * The definition of <code>ApplicationSecurityWafCustomRuleActionParameters</code> object.
   *
   * @return parameters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApplicationSecurityWafCustomRuleActionParameters getParameters() {
    return parameters;
  }

  public void setParameters(ApplicationSecurityWafCustomRuleActionParameters parameters) {
    this.parameters = parameters;
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
   * @return ApplicationSecurityWafCustomRuleAction
   */
  @JsonAnySetter
  public ApplicationSecurityWafCustomRuleAction putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ApplicationSecurityWafCustomRuleAction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSecurityWafCustomRuleAction applicationSecurityWafCustomRuleAction =
        (ApplicationSecurityWafCustomRuleAction) o;
    return Objects.equals(this.action, applicationSecurityWafCustomRuleAction.action)
        && Objects.equals(this.parameters, applicationSecurityWafCustomRuleAction.parameters)
        && Objects.equals(
            this.additionalProperties, applicationSecurityWafCustomRuleAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, parameters, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSecurityWafCustomRuleAction {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
