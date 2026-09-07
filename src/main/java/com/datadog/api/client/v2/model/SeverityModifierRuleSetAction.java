/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Sets matched findings to a fixed severity.</p>
 */
@JsonPropertyOrder({
  SeverityModifierRuleSetAction.JSON_PROPERTY_DESCRIPTION,
  SeverityModifierRuleSetAction.JSON_PROPERTY_SEVERITY,
  SeverityModifierRuleSetAction.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SeverityModifierRuleSetAction {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private SeverityModifierSeverity severity;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SeverityModifierRuleSetActionType type;

  public SeverityModifierRuleSetAction() {}

  @JsonCreator
  public SeverityModifierRuleSetAction(
            @JsonProperty(required=true, value=JSON_PROPERTY_SEVERITY)SeverityModifierSeverity severity,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)SeverityModifierRuleSetActionType type) {
        this.severity = severity;
        this.unparsed |= !severity.isValid();
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public SeverityModifierRuleSetAction description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>An optional free-form explanation for the severity change.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public SeverityModifierRuleSetAction severity(SeverityModifierSeverity severity) {
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    return this;
  }

  /**
   * <p>The severity to assign to matched findings. <code>info_none</code> is not supported for the <code>iac_misconfiguration</code>, <code>runtime_code_vulnerability</code>, <code>secret</code>, or <code>static_code_vulnerability</code> finding types.</p>
   * @return severity
  **/
      @JsonProperty(JSON_PROPERTY_SEVERITY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SeverityModifierSeverity getSeverity() {
        return severity;
      }
  public void setSeverity(SeverityModifierSeverity severity) {
    if (!severity.isValid()) {
        this.unparsed = true;
    }
    this.severity = severity;
  }
  public SeverityModifierRuleSetAction type(SeverityModifierRuleSetActionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of a severity modifier rule action that sets a fixed severity.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SeverityModifierRuleSetActionType getType() {
        return type;
      }
  public void setType(SeverityModifierRuleSetActionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SeverityModifierRuleSetAction
   */
  @JsonAnySetter
  public SeverityModifierRuleSetAction putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this SeverityModifierRuleSetAction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeverityModifierRuleSetAction severityModifierRuleSetAction = (SeverityModifierRuleSetAction) o;
    return Objects.equals(this.description, severityModifierRuleSetAction.description) && Objects.equals(this.severity, severityModifierRuleSetAction.severity) && Objects.equals(this.type, severityModifierRuleSetAction.type) && Objects.equals(this.additionalProperties, severityModifierRuleSetAction.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,severity,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeverityModifierRuleSetAction {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
