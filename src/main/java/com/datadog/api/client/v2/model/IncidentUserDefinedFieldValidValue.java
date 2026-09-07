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

/** A valid value for an incident user-defined field. */
@JsonPropertyOrder({
  IncidentUserDefinedFieldValidValue.JSON_PROPERTY_DESCRIPTION,
  IncidentUserDefinedFieldValidValue.JSON_PROPERTY_DISPLAY_NAME,
  IncidentUserDefinedFieldValidValue.JSON_PROPERTY_SHORT_DESCRIPTION,
  IncidentUserDefinedFieldValidValue.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentUserDefinedFieldValidValue {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_SHORT_DESCRIPTION = "short_description";
  private String shortDescription;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public IncidentUserDefinedFieldValidValue() {}

  @JsonCreator
  public IncidentUserDefinedFieldValidValue(
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_NAME) String displayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) String value) {
    this.displayName = displayName;
    this.value = value;
  }

  public IncidentUserDefinedFieldValidValue description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A detailed description of the valid value.
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

  public IncidentUserDefinedFieldValidValue displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The human-readable display name for this value.
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

  public IncidentUserDefinedFieldValidValue shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * A short description of the valid value.
   *
   * @return shortDescription
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public IncidentUserDefinedFieldValidValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The identifier that is stored when this option is selected.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
   * @return IncidentUserDefinedFieldValidValue
   */
  @JsonAnySetter
  public IncidentUserDefinedFieldValidValue putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentUserDefinedFieldValidValue object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentUserDefinedFieldValidValue incidentUserDefinedFieldValidValue =
        (IncidentUserDefinedFieldValidValue) o;
    return Objects.equals(this.description, incidentUserDefinedFieldValidValue.description)
        && Objects.equals(this.displayName, incidentUserDefinedFieldValidValue.displayName)
        && Objects.equals(
            this.shortDescription, incidentUserDefinedFieldValidValue.shortDescription)
        && Objects.equals(this.value, incidentUserDefinedFieldValidValue.value)
        && Objects.equals(
            this.additionalProperties, incidentUserDefinedFieldValidValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, shortDescription, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentUserDefinedFieldValidValue {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
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
