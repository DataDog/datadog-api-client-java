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

/** Create a new Cloud Workload Security Agent rule. */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_DESCRIPTION,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_ENABLED,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_EXPRESSION,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public CloudWorkloadSecurityAgentRuleCreateAttributes() {}

  @JsonCreator
  public CloudWorkloadSecurityAgentRuleCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPRESSION) String expression,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.expression = expression;
    this.name = name;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the Agent rule.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the Agent rule is enabled.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * The SECL expression of the Agent rule.
   *
   * @return expression
   */
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public CloudWorkloadSecurityAgentRuleCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Agent rule.
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
   * @return CloudWorkloadSecurityAgentRuleCreateAttributes
   */
  @JsonAnySetter
  public CloudWorkloadSecurityAgentRuleCreateAttributes putAdditionalProperty(
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

  /** Return true if this CloudWorkloadSecurityAgentRuleCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleCreateAttributes cloudWorkloadSecurityAgentRuleCreateAttributes =
        (CloudWorkloadSecurityAgentRuleCreateAttributes) o;
    return Objects.equals(
            this.description, cloudWorkloadSecurityAgentRuleCreateAttributes.description)
        && Objects.equals(this.enabled, cloudWorkloadSecurityAgentRuleCreateAttributes.enabled)
        && Objects.equals(
            this.expression, cloudWorkloadSecurityAgentRuleCreateAttributes.expression)
        && Objects.equals(this.name, cloudWorkloadSecurityAgentRuleCreateAttributes.name)
        && Objects.equals(
            this.additionalProperties,
            cloudWorkloadSecurityAgentRuleCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enabled, expression, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleCreateAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
