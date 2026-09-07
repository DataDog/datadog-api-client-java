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
   * <p>Shifts matched findings up or down by one severity rank.</p>
 */
@JsonPropertyOrder({
  SeverityModifierRuleShiftAction.JSON_PROPERTY_DESCRIPTION,
  SeverityModifierRuleShiftAction.JSON_PROPERTY_SEVERITY_DELTA,
  SeverityModifierRuleShiftAction.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SeverityModifierRuleShiftAction {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SEVERITY_DELTA = "severity_delta";
  private SeverityModifierSeverityDelta severityDelta;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SeverityModifierRuleShiftActionType type;

  public SeverityModifierRuleShiftAction() {}

  @JsonCreator
  public SeverityModifierRuleShiftAction(
            @JsonProperty(required=true, value=JSON_PROPERTY_SEVERITY_DELTA)SeverityModifierSeverityDelta severityDelta,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)SeverityModifierRuleShiftActionType type) {
        this.severityDelta = severityDelta;
        this.unparsed |= !severityDelta.isValid();
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public SeverityModifierRuleShiftAction description(String description) {
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
  public SeverityModifierRuleShiftAction severityDelta(SeverityModifierSeverityDelta severityDelta) {
    this.severityDelta = severityDelta;
    this.unparsed |= !severityDelta.isValid();
    return this;
  }

  /**
   * <p>The direction in which to shift the severity of matched findings by one rank.</p>
   * @return severityDelta
  **/
      @JsonProperty(JSON_PROPERTY_SEVERITY_DELTA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SeverityModifierSeverityDelta getSeverityDelta() {
        return severityDelta;
      }
  public void setSeverityDelta(SeverityModifierSeverityDelta severityDelta) {
    if (!severityDelta.isValid()) {
        this.unparsed = true;
    }
    this.severityDelta = severityDelta;
  }
  public SeverityModifierRuleShiftAction type(SeverityModifierRuleShiftActionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of a severity modifier rule action that shifts the severity by one rank.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SeverityModifierRuleShiftActionType getType() {
        return type;
      }
  public void setType(SeverityModifierRuleShiftActionType type) {
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
   * @return SeverityModifierRuleShiftAction
   */
  @JsonAnySetter
  public SeverityModifierRuleShiftAction putAdditionalProperty(String key, Object value) {
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
   * Return true if this SeverityModifierRuleShiftAction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeverityModifierRuleShiftAction severityModifierRuleShiftAction = (SeverityModifierRuleShiftAction) o;
    return Objects.equals(this.description, severityModifierRuleShiftAction.description) && Objects.equals(this.severityDelta, severityModifierRuleShiftAction.severityDelta) && Objects.equals(this.type, severityModifierRuleShiftAction.type) && Objects.equals(this.additionalProperties, severityModifierRuleShiftAction.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,severityDelta,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeverityModifierRuleShiftAction {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    severityDelta: ").append(toIndentedString(severityDelta)).append("\n");
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
