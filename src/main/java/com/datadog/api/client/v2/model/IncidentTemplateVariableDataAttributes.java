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

/** Attributes of a template variable. */
@JsonPropertyOrder({
  IncidentTemplateVariableDataAttributes.JSON_PROPERTY_DESCRIPTION,
  IncidentTemplateVariableDataAttributes.JSON_PROPERTY_DISPLAY_NAME,
  IncidentTemplateVariableDataAttributes.JSON_PROPERTY_DOMAIN,
  IncidentTemplateVariableDataAttributes.JSON_PROPERTY_VARIABLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTemplateVariableDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_VARIABLE = "variable";
  private String variable;

  public IncidentTemplateVariableDataAttributes() {}

  @JsonCreator
  public IncidentTemplateVariableDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_NAME) String displayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_DOMAIN) String domain,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIABLE) String variable) {
    this.description = description;
    this.displayName = displayName;
    this.domain = domain;
    this.variable = variable;
  }

  public IncidentTemplateVariableDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the template variable.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IncidentTemplateVariableDataAttributes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the template variable.
   *
   * @return displayName
   */
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public IncidentTemplateVariableDataAttributes domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The domain of the template variable.
   *
   * @return domain
   */
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public IncidentTemplateVariableDataAttributes variable(String variable) {
    this.variable = variable;
    return this;
  }

  /**
   * The variable name used in templates.
   *
   * @return variable
   */
  @JsonProperty(JSON_PROPERTY_VARIABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getVariable() {
    return variable;
  }

  public void setVariable(String variable) {
    this.variable = variable;
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
   * @return IncidentTemplateVariableDataAttributes
   */
  @JsonAnySetter
  public IncidentTemplateVariableDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentTemplateVariableDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTemplateVariableDataAttributes incidentTemplateVariableDataAttributes =
        (IncidentTemplateVariableDataAttributes) o;
    return Objects.equals(this.description, incidentTemplateVariableDataAttributes.description)
        && Objects.equals(this.displayName, incidentTemplateVariableDataAttributes.displayName)
        && Objects.equals(this.domain, incidentTemplateVariableDataAttributes.domain)
        && Objects.equals(this.variable, incidentTemplateVariableDataAttributes.variable)
        && Objects.equals(
            this.additionalProperties, incidentTemplateVariableDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, domain, variable, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTemplateVariableDataAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
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
