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

/** Metadata field key and values to set on the experiment. */
@JsonPropertyOrder({
  ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems
      .JSON_PROPERTY_ENUM_VALUES,
  ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems.JSON_PROPERTY_FIELD_KEY,
  ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems
      .JSON_PROPERTY_FREETEXT_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENUM_VALUES = "enum_values";
  private List<String> enumValues = null;

  public static final String JSON_PROPERTY_FIELD_KEY = "field_key";
  private String fieldKey;

  public static final String JSON_PROPERTY_FREETEXT_VALUE = "freetext_value";
  private String freetextValue;

  public ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems() {}

  @JsonCreator
  public ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELD_KEY) String fieldKey) {
    this.fieldKey = fieldKey;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems enumValues(
      List<String> enumValues) {
    this.enumValues = enumValues;
    return this;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems
      addEnumValuesItem(String enumValuesItem) {
    if (this.enumValues == null) {
      this.enumValues = new ArrayList<>();
    }
    this.enumValues.add(enumValuesItem);
    return this;
  }

  /**
   * Selected values for an enumerated metadata field.
   *
   * @return enumValues
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENUM_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEnumValues() {
    return enumValues;
  }

  public void setEnumValues(List<String> enumValues) {
    this.enumValues = enumValues;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems fieldKey(
      String fieldKey) {
    this.fieldKey = fieldKey;
    return this;
  }

  /**
   * Key that identifies the metadata field.
   *
   * @return fieldKey
   */
  @JsonProperty(JSON_PROPERTY_FIELD_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFieldKey() {
    return fieldKey;
  }

  public void setFieldKey(String fieldKey) {
    this.fieldKey = fieldKey;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems freetextValue(
      String freetextValue) {
    this.freetextValue = freetextValue;
    return this;
  }

  /**
   * Text value for a free-text metadata field.
   *
   * @return freetextValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREETEXT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFreetextValue() {
    return freetextValue;
  }

  public void setFreetextValue(String freetextValue) {
    this.freetextValue = freetextValue;
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
   * @return ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems
   */
  @JsonAnySetter
  public ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems
        experimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems =
            (ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems) o;
    return Objects.equals(
            this.enumValues,
            experimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems.enumValues)
        && Objects.equals(
            this.fieldKey,
            experimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems.fieldKey)
        && Objects.equals(
            this.freetextValue,
            experimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems.freetextValue)
        && Objects.equals(
            this.additionalProperties,
            experimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumValues, fieldKey, freetextValue, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems {\n");
    sb.append("    enumValues: ").append(toIndentedString(enumValues)).append("\n");
    sb.append("    fieldKey: ").append(toIndentedString(fieldKey)).append("\n");
    sb.append("    freetextValue: ").append(toIndentedString(freetextValue)).append("\n");
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
