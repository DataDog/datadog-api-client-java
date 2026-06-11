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

/** The attributes for upserting and publishing a form version. */
@JsonPropertyOrder({
  UpsertAndPublishFormVersionDataAttributes.JSON_PROPERTY_DATA_DEFINITION,
  UpsertAndPublishFormVersionDataAttributes.JSON_PROPERTY_UI_DEFINITION,
  UpsertAndPublishFormVersionDataAttributes.JSON_PROPERTY_UPSERT_PARAMS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpsertAndPublishFormVersionDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_DEFINITION = "data_definition";
  private FormDataDefinition dataDefinition;

  public static final String JSON_PROPERTY_UI_DEFINITION = "ui_definition";
  private FormUiDefinition uiDefinition;

  public static final String JSON_PROPERTY_UPSERT_PARAMS = "upsert_params";
  private UpsertAndPublishFormVersionUpsertParams upsertParams;

  public UpsertAndPublishFormVersionDataAttributes() {}

  @JsonCreator
  public UpsertAndPublishFormVersionDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_DEFINITION)
          FormDataDefinition dataDefinition,
      @JsonProperty(required = true, value = JSON_PROPERTY_UI_DEFINITION)
          FormUiDefinition uiDefinition,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPSERT_PARAMS)
          UpsertAndPublishFormVersionUpsertParams upsertParams) {
    this.dataDefinition = dataDefinition;
    this.unparsed |= dataDefinition.unparsed;
    this.uiDefinition = uiDefinition;
    this.unparsed |= uiDefinition.unparsed;
    this.upsertParams = upsertParams;
    this.unparsed |= upsertParams.unparsed;
  }

  public UpsertAndPublishFormVersionDataAttributes dataDefinition(
      FormDataDefinition dataDefinition) {
    this.dataDefinition = dataDefinition;
    this.unparsed |= dataDefinition.unparsed;
    return this;
  }

  /**
   * A JSON Schema definition that describes the form's data fields.
   *
   * @return dataDefinition
   */
  @JsonProperty(JSON_PROPERTY_DATA_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormDataDefinition getDataDefinition() {
    return dataDefinition;
  }

  public void setDataDefinition(FormDataDefinition dataDefinition) {
    this.dataDefinition = dataDefinition;
  }

  public UpsertAndPublishFormVersionDataAttributes uiDefinition(FormUiDefinition uiDefinition) {
    this.uiDefinition = uiDefinition;
    this.unparsed |= uiDefinition.unparsed;
    return this;
  }

  /**
   * UI configuration for rendering form fields, including widget overrides, field ordering, and
   * themes.
   *
   * @return uiDefinition
   */
  @JsonProperty(JSON_PROPERTY_UI_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormUiDefinition getUiDefinition() {
    return uiDefinition;
  }

  public void setUiDefinition(FormUiDefinition uiDefinition) {
    this.uiDefinition = uiDefinition;
  }

  public UpsertAndPublishFormVersionDataAttributes upsertParams(
      UpsertAndPublishFormVersionUpsertParams upsertParams) {
    this.upsertParams = upsertParams;
    this.unparsed |= upsertParams.unparsed;
    return this;
  }

  /**
   * Concurrency control parameters for the upsert and publish operation.
   *
   * @return upsertParams
   */
  @JsonProperty(JSON_PROPERTY_UPSERT_PARAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UpsertAndPublishFormVersionUpsertParams getUpsertParams() {
    return upsertParams;
  }

  public void setUpsertParams(UpsertAndPublishFormVersionUpsertParams upsertParams) {
    this.upsertParams = upsertParams;
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
   * @return UpsertAndPublishFormVersionDataAttributes
   */
  @JsonAnySetter
  public UpsertAndPublishFormVersionDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UpsertAndPublishFormVersionDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertAndPublishFormVersionDataAttributes upsertAndPublishFormVersionDataAttributes =
        (UpsertAndPublishFormVersionDataAttributes) o;
    return Objects.equals(
            this.dataDefinition, upsertAndPublishFormVersionDataAttributes.dataDefinition)
        && Objects.equals(this.uiDefinition, upsertAndPublishFormVersionDataAttributes.uiDefinition)
        && Objects.equals(this.upsertParams, upsertAndPublishFormVersionDataAttributes.upsertParams)
        && Objects.equals(
            this.additionalProperties,
            upsertAndPublishFormVersionDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataDefinition, uiDefinition, upsertParams, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertAndPublishFormVersionDataAttributes {\n");
    sb.append("    dataDefinition: ").append(toIndentedString(dataDefinition)).append("\n");
    sb.append("    uiDefinition: ").append(toIndentedString(uiDefinition)).append("\n");
    sb.append("    upsertParams: ").append(toIndentedString(upsertParams)).append("\n");
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
