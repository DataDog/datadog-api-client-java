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

/** The set action applied on the scope matching the rule */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleActionSet.JSON_PROPERTY_APPEND,
  CloudWorkloadSecurityAgentRuleActionSet.JSON_PROPERTY_DEFAULT_VALUE,
  CloudWorkloadSecurityAgentRuleActionSet.JSON_PROPERTY_EXPRESSION,
  CloudWorkloadSecurityAgentRuleActionSet.JSON_PROPERTY_FIELD,
  CloudWorkloadSecurityAgentRuleActionSet.JSON_PROPERTY_INHERITED,
  CloudWorkloadSecurityAgentRuleActionSet.JSON_PROPERTY_NAME,
  CloudWorkloadSecurityAgentRuleActionSet.JSON_PROPERTY_SCOPE,
  CloudWorkloadSecurityAgentRuleActionSet.JSON_PROPERTY_SIZE,
  CloudWorkloadSecurityAgentRuleActionSet.JSON_PROPERTY_TTL,
  CloudWorkloadSecurityAgentRuleActionSet.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleActionSet {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPEND = "append";
  private Boolean append;

  public static final String JSON_PROPERTY_DEFAULT_VALUE = "default_value";
  private String defaultValue;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_INHERITED = "inherited";
  private Boolean inherited;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_TTL = "ttl";
  private Long ttl;

  public static final String JSON_PROPERTY_VALUE = "value";
  private CloudWorkloadSecurityAgentRuleActionSetValue value;

  public CloudWorkloadSecurityAgentRuleActionSet append(Boolean append) {
    this.append = append;
    return this;
  }

  /**
   * Whether the value should be appended to the field.
   *
   * @return append
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAppend() {
    return append;
  }

  public void setAppend(Boolean append) {
    this.append = append;
  }

  public CloudWorkloadSecurityAgentRuleActionSet defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * The default value of the set action
   *
   * @return defaultValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public CloudWorkloadSecurityAgentRuleActionSet expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * The expression of the set action.
   *
   * @return expression
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public CloudWorkloadSecurityAgentRuleActionSet field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The field of the set action
   *
   * @return field
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public CloudWorkloadSecurityAgentRuleActionSet inherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

  /**
   * Whether the value should be inherited.
   *
   * @return inherited
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INHERITED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getInherited() {
    return inherited;
  }

  public void setInherited(Boolean inherited) {
    this.inherited = inherited;
  }

  public CloudWorkloadSecurityAgentRuleActionSet name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the set action
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CloudWorkloadSecurityAgentRuleActionSet scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The scope of the set action.
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

  public CloudWorkloadSecurityAgentRuleActionSet size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * The size of the set action.
   *
   * @return size
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public CloudWorkloadSecurityAgentRuleActionSet ttl(Long ttl) {
    this.ttl = ttl;
    return this;
  }

  /**
   * The time to live of the set action.
   *
   * @return ttl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TTL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTtl() {
    return ttl;
  }

  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }

  public CloudWorkloadSecurityAgentRuleActionSet value(
      CloudWorkloadSecurityAgentRuleActionSetValue value) {
    this.value = value;
    this.unparsed |= value.unparsed;
    return this;
  }

  /**
   * The value of the set action
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudWorkloadSecurityAgentRuleActionSetValue getValue() {
    return value;
  }

  public void setValue(CloudWorkloadSecurityAgentRuleActionSetValue value) {
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
   * @return CloudWorkloadSecurityAgentRuleActionSet
   */
  @JsonAnySetter
  public CloudWorkloadSecurityAgentRuleActionSet putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CloudWorkloadSecurityAgentRuleActionSet object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleActionSet cloudWorkloadSecurityAgentRuleActionSet =
        (CloudWorkloadSecurityAgentRuleActionSet) o;
    return Objects.equals(this.append, cloudWorkloadSecurityAgentRuleActionSet.append)
        && Objects.equals(this.defaultValue, cloudWorkloadSecurityAgentRuleActionSet.defaultValue)
        && Objects.equals(this.expression, cloudWorkloadSecurityAgentRuleActionSet.expression)
        && Objects.equals(this.field, cloudWorkloadSecurityAgentRuleActionSet.field)
        && Objects.equals(this.inherited, cloudWorkloadSecurityAgentRuleActionSet.inherited)
        && Objects.equals(this.name, cloudWorkloadSecurityAgentRuleActionSet.name)
        && Objects.equals(this.scope, cloudWorkloadSecurityAgentRuleActionSet.scope)
        && Objects.equals(this.size, cloudWorkloadSecurityAgentRuleActionSet.size)
        && Objects.equals(this.ttl, cloudWorkloadSecurityAgentRuleActionSet.ttl)
        && Objects.equals(this.value, cloudWorkloadSecurityAgentRuleActionSet.value)
        && Objects.equals(
            this.additionalProperties,
            cloudWorkloadSecurityAgentRuleActionSet.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        append,
        defaultValue,
        expression,
        field,
        inherited,
        name,
        scope,
        size,
        ttl,
        value,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleActionSet {\n");
    sb.append("    append: ").append(toIndentedString(append)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    inherited: ").append(toIndentedString(inherited)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
