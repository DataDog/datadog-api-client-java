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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes for updating an incident user-defined field. All fields are optional. */
@JsonPropertyOrder({
  IncidentUserDefinedFieldAttributesUpdateRequest.JSON_PROPERTY_CATEGORY,
  IncidentUserDefinedFieldAttributesUpdateRequest.JSON_PROPERTY_COLLECTED,
  IncidentUserDefinedFieldAttributesUpdateRequest.JSON_PROPERTY_DEFAULT_VALUE,
  IncidentUserDefinedFieldAttributesUpdateRequest.JSON_PROPERTY_DISPLAY_NAME,
  IncidentUserDefinedFieldAttributesUpdateRequest.JSON_PROPERTY_ORDINAL,
  IncidentUserDefinedFieldAttributesUpdateRequest.JSON_PROPERTY_REQUIRED,
  IncidentUserDefinedFieldAttributesUpdateRequest.JSON_PROPERTY_VALID_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentUserDefinedFieldAttributesUpdateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private JsonNullable<IncidentUserDefinedFieldCategory> category =
      JsonNullable.<IncidentUserDefinedFieldCategory>undefined();

  public static final String JSON_PROPERTY_COLLECTED = "collected";
  private JsonNullable<IncidentUserDefinedFieldCollected> collected =
      JsonNullable.<IncidentUserDefinedFieldCollected>undefined();

  public static final String JSON_PROPERTY_DEFAULT_VALUE = "default_value";
  private JsonNullable<String> defaultValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ORDINAL = "ordinal";
  private JsonNullable<String> ordinal = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private JsonNullable<Boolean> required = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_VALID_VALUES = "valid_values";
  private JsonNullable<List<IncidentUserDefinedFieldValidValue>> validValues =
      JsonNullable.<List<IncidentUserDefinedFieldValidValue>>undefined();

  public IncidentUserDefinedFieldAttributesUpdateRequest category(
      IncidentUserDefinedFieldCategory category) {
    this.category = JsonNullable.<IncidentUserDefinedFieldCategory>of(category);
    return this;
  }

  /**
   * The section in which the field appears: "what_happened" or "why_it_happened". When null, the
   * field appears in the Attributes section.
   *
   * @return category
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public IncidentUserDefinedFieldCategory getCategory() {
    return category.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<IncidentUserDefinedFieldCategory> getCategory_JsonNullable() {
    return category;
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY)
  public void setCategory_JsonNullable(JsonNullable<IncidentUserDefinedFieldCategory> category) {
    this.category = category;
  }

  public void setCategory(IncidentUserDefinedFieldCategory category) {
    if (!category.isValid()) {
      this.unparsed = true;
    }
    this.category = JsonNullable.<IncidentUserDefinedFieldCategory>of(category);
  }

  public IncidentUserDefinedFieldAttributesUpdateRequest collected(
      IncidentUserDefinedFieldCollected collected) {
    this.collected = JsonNullable.<IncidentUserDefinedFieldCollected>of(collected);
    return this;
  }

  /**
   * The lifecycle stage at which the app prompts users to fill out this field. Cannot be set on
   * required fields.
   *
   * @return collected
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public IncidentUserDefinedFieldCollected getCollected() {
    return collected.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COLLECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<IncidentUserDefinedFieldCollected> getCollected_JsonNullable() {
    return collected;
  }

  @JsonProperty(JSON_PROPERTY_COLLECTED)
  public void setCollected_JsonNullable(JsonNullable<IncidentUserDefinedFieldCollected> collected) {
    this.collected = collected;
  }

  public void setCollected(IncidentUserDefinedFieldCollected collected) {
    if (!collected.isValid()) {
      this.unparsed = true;
    }
    this.collected = JsonNullable.<IncidentUserDefinedFieldCollected>of(collected);
  }

  public IncidentUserDefinedFieldAttributesUpdateRequest defaultValue(String defaultValue) {
    this.defaultValue = JsonNullable.<String>of(defaultValue);
    return this;
  }

  /**
   * The default value for the field. Must be one of the valid values when valid_values is set.
   *
   * @return defaultValue
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDefaultValue() {
    return defaultValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDefaultValue_JsonNullable() {
    return defaultValue;
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  public void setDefaultValue_JsonNullable(JsonNullable<String> defaultValue) {
    this.defaultValue = defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = JsonNullable.<String>of(defaultValue);
  }

  public IncidentUserDefinedFieldAttributesUpdateRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The human-readable name shown in the UI.
   *
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public IncidentUserDefinedFieldAttributesUpdateRequest ordinal(String ordinal) {
    this.ordinal = JsonNullable.<String>of(ordinal);
    return this;
  }

  /**
   * A decimal string representing the field's display order in the UI.
   *
   * @return ordinal
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getOrdinal() {
    return ordinal.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORDINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOrdinal_JsonNullable() {
    return ordinal;
  }

  @JsonProperty(JSON_PROPERTY_ORDINAL)
  public void setOrdinal_JsonNullable(JsonNullable<String> ordinal) {
    this.ordinal = ordinal;
  }

  public void setOrdinal(String ordinal) {
    this.ordinal = JsonNullable.<String>of(ordinal);
  }

  public IncidentUserDefinedFieldAttributesUpdateRequest required(Boolean required) {
    this.required = JsonNullable.<Boolean>of(required);
    return this;
  }

  /**
   * When true, users must fill out this field on incidents.
   *
   * @return required
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getRequired() {
    return required.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getRequired_JsonNullable() {
    return required;
  }

  @JsonProperty(JSON_PROPERTY_REQUIRED)
  public void setRequired_JsonNullable(JsonNullable<Boolean> required) {
    this.required = required;
  }

  public void setRequired(Boolean required) {
    this.required = JsonNullable.<Boolean>of(required);
  }

  public IncidentUserDefinedFieldAttributesUpdateRequest validValues(
      List<IncidentUserDefinedFieldValidValue> validValues) {
    this.validValues = JsonNullable.<List<IncidentUserDefinedFieldValidValue>>of(validValues);
    return this;
  }

  public IncidentUserDefinedFieldAttributesUpdateRequest addValidValuesItem(
      IncidentUserDefinedFieldValidValue validValuesItem) {
    if (this.validValues == null || !this.validValues.isPresent()) {
      this.validValues =
          JsonNullable.<List<IncidentUserDefinedFieldValidValue>>of(new ArrayList<>());
    }
    try {
      this.validValues.get().add(validValuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of allowed values for dropdown and multiselect fields. Limited to 1000 values.
   *
   * @return validValues
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<IncidentUserDefinedFieldValidValue> getValidValues() {
    return validValues.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALID_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<IncidentUserDefinedFieldValidValue>> getValidValues_JsonNullable() {
    return validValues;
  }

  @JsonProperty(JSON_PROPERTY_VALID_VALUES)
  public void setValidValues_JsonNullable(
      JsonNullable<List<IncidentUserDefinedFieldValidValue>> validValues) {
    this.validValues = validValues;
  }

  public void setValidValues(List<IncidentUserDefinedFieldValidValue> validValues) {
    this.validValues = JsonNullable.<List<IncidentUserDefinedFieldValidValue>>of(validValues);
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
   * @return IncidentUserDefinedFieldAttributesUpdateRequest
   */
  @JsonAnySetter
  public IncidentUserDefinedFieldAttributesUpdateRequest putAdditionalProperty(
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

  /** Return true if this IncidentUserDefinedFieldAttributesUpdateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentUserDefinedFieldAttributesUpdateRequest
        incidentUserDefinedFieldAttributesUpdateRequest =
            (IncidentUserDefinedFieldAttributesUpdateRequest) o;
    return Objects.equals(this.category, incidentUserDefinedFieldAttributesUpdateRequest.category)
        && Objects.equals(this.collected, incidentUserDefinedFieldAttributesUpdateRequest.collected)
        && Objects.equals(
            this.defaultValue, incidentUserDefinedFieldAttributesUpdateRequest.defaultValue)
        && Objects.equals(
            this.displayName, incidentUserDefinedFieldAttributesUpdateRequest.displayName)
        && Objects.equals(this.ordinal, incidentUserDefinedFieldAttributesUpdateRequest.ordinal)
        && Objects.equals(this.required, incidentUserDefinedFieldAttributesUpdateRequest.required)
        && Objects.equals(
            this.validValues, incidentUserDefinedFieldAttributesUpdateRequest.validValues)
        && Objects.equals(
            this.additionalProperties,
            incidentUserDefinedFieldAttributesUpdateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        collected,
        defaultValue,
        displayName,
        ordinal,
        required,
        validValues,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentUserDefinedFieldAttributesUpdateRequest {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    collected: ").append(toIndentedString(collected)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    validValues: ").append(toIndentedString(validValues)).append("\n");
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
