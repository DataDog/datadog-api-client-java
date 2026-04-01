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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes for creating an incident user-defined field. */
@JsonPropertyOrder({
  IncidentUserDefinedFieldAttributesCreateRequest.JSON_PROPERTY_CATEGORY,
  IncidentUserDefinedFieldAttributesCreateRequest.JSON_PROPERTY_COLLECTED,
  IncidentUserDefinedFieldAttributesCreateRequest.JSON_PROPERTY_DEFAULT_VALUE,
  IncidentUserDefinedFieldAttributesCreateRequest.JSON_PROPERTY_DISPLAY_NAME,
  IncidentUserDefinedFieldAttributesCreateRequest.JSON_PROPERTY_NAME,
  IncidentUserDefinedFieldAttributesCreateRequest.JSON_PROPERTY_ORDINAL,
  IncidentUserDefinedFieldAttributesCreateRequest.JSON_PROPERTY_REQUIRED,
  IncidentUserDefinedFieldAttributesCreateRequest.JSON_PROPERTY_TAG_KEY,
  IncidentUserDefinedFieldAttributesCreateRequest.JSON_PROPERTY_TYPE,
  IncidentUserDefinedFieldAttributesCreateRequest.JSON_PROPERTY_VALID_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentUserDefinedFieldAttributesCreateRequest {
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

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORDINAL = "ordinal";
  private JsonNullable<String> ordinal = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private JsonNullable<String> tagKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentUserDefinedFieldFieldType type;

  public static final String JSON_PROPERTY_VALID_VALUES = "valid_values";
  private List<IncidentUserDefinedFieldValidValue> validValues = null;

  public IncidentUserDefinedFieldAttributesCreateRequest() {}

  @JsonCreator
  public IncidentUserDefinedFieldAttributesCreateRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          IncidentUserDefinedFieldFieldType type) {
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public IncidentUserDefinedFieldAttributesCreateRequest category(
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

  public IncidentUserDefinedFieldAttributesCreateRequest collected(
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

  public IncidentUserDefinedFieldAttributesCreateRequest defaultValue(String defaultValue) {
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

  public IncidentUserDefinedFieldAttributesCreateRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The human-readable name shown in the UI. Defaults to a formatted version of the name if not
   * provided.
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

  public IncidentUserDefinedFieldAttributesCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique identifier of the field. Must start with a letter or digit and contain only letters,
   * digits, underscores, or periods.
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

  public IncidentUserDefinedFieldAttributesCreateRequest ordinal(String ordinal) {
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

  public IncidentUserDefinedFieldAttributesCreateRequest required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * When true, users must fill out this field on incidents.
   *
   * @return required
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public IncidentUserDefinedFieldAttributesCreateRequest tagKey(String tagKey) {
    this.tagKey = JsonNullable.<String>of(tagKey);
    return this;
  }

  /**
   * For metric tag-type fields only, the metric tag key that powers the autocomplete options.
   *
   * @return tagKey
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getTagKey() {
    return tagKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTagKey_JsonNullable() {
    return tagKey;
  }

  @JsonProperty(JSON_PROPERTY_TAG_KEY)
  public void setTagKey_JsonNullable(JsonNullable<String> tagKey) {
    this.tagKey = tagKey;
  }

  public void setTagKey(String tagKey) {
    this.tagKey = JsonNullable.<String>of(tagKey);
  }

  public IncidentUserDefinedFieldAttributesCreateRequest type(
      IncidentUserDefinedFieldFieldType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The data type of the field. 1=dropdown, 2=multiselect, 3=textbox, 4=textarray, 5=metrictag,
   * 6=autocomplete, 7=number, 8=datetime.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentUserDefinedFieldFieldType getType() {
    return type;
  }

  public void setType(IncidentUserDefinedFieldFieldType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public IncidentUserDefinedFieldAttributesCreateRequest validValues(
      List<IncidentUserDefinedFieldValidValue> validValues) {
    this.validValues = validValues;
    for (IncidentUserDefinedFieldValidValue item : validValues) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentUserDefinedFieldAttributesCreateRequest addValidValuesItem(
      IncidentUserDefinedFieldValidValue validValuesItem) {
    if (this.validValues == null) {
      this.validValues = new ArrayList<>();
    }
    this.validValues.add(validValuesItem);
    this.unparsed |= validValuesItem.unparsed;
    return this;
  }

  /**
   * The list of allowed values for dropdown and multiselect fields. Limited to 1000 values.
   *
   * @return validValues
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentUserDefinedFieldValidValue> getValidValues() {
    return validValues;
  }

  public void setValidValues(List<IncidentUserDefinedFieldValidValue> validValues) {
    this.validValues = validValues;
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
   * @return IncidentUserDefinedFieldAttributesCreateRequest
   */
  @JsonAnySetter
  public IncidentUserDefinedFieldAttributesCreateRequest putAdditionalProperty(
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

  /** Return true if this IncidentUserDefinedFieldAttributesCreateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentUserDefinedFieldAttributesCreateRequest
        incidentUserDefinedFieldAttributesCreateRequest =
            (IncidentUserDefinedFieldAttributesCreateRequest) o;
    return Objects.equals(this.category, incidentUserDefinedFieldAttributesCreateRequest.category)
        && Objects.equals(this.collected, incidentUserDefinedFieldAttributesCreateRequest.collected)
        && Objects.equals(
            this.defaultValue, incidentUserDefinedFieldAttributesCreateRequest.defaultValue)
        && Objects.equals(
            this.displayName, incidentUserDefinedFieldAttributesCreateRequest.displayName)
        && Objects.equals(this.name, incidentUserDefinedFieldAttributesCreateRequest.name)
        && Objects.equals(this.ordinal, incidentUserDefinedFieldAttributesCreateRequest.ordinal)
        && Objects.equals(this.required, incidentUserDefinedFieldAttributesCreateRequest.required)
        && Objects.equals(this.tagKey, incidentUserDefinedFieldAttributesCreateRequest.tagKey)
        && Objects.equals(this.type, incidentUserDefinedFieldAttributesCreateRequest.type)
        && Objects.equals(
            this.validValues, incidentUserDefinedFieldAttributesCreateRequest.validValues)
        && Objects.equals(
            this.additionalProperties,
            incidentUserDefinedFieldAttributesCreateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        collected,
        defaultValue,
        displayName,
        name,
        ordinal,
        required,
        tagKey,
        type,
        validValues,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentUserDefinedFieldAttributesCreateRequest {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    collected: ").append(toIndentedString(collected)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
