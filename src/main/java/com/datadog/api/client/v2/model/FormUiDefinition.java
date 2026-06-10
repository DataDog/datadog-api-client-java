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

/**
 * UI configuration for rendering form fields, including widget overrides, field ordering, and
 * themes.
 */
@JsonPropertyOrder({
  FormUiDefinition.JSON_PROPERTY_UI_ORDER,
  FormUiDefinition.JSON_PROPERTY_UI_THEME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormUiDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_UI_ORDER = "ui:order";
  private List<String> uiOrder = null;

  public static final String JSON_PROPERTY_UI_THEME = "ui:theme";
  private FormUiDefinitionUiTheme uiTheme;

  public FormUiDefinition uiOrder(List<String> uiOrder) {
    this.uiOrder = uiOrder;
    return this;
  }

  public FormUiDefinition addUiOrderItem(String uiOrderItem) {
    if (this.uiOrder == null) {
      this.uiOrder = new ArrayList<>();
    }
    this.uiOrder.add(uiOrderItem);
    return this;
  }

  /**
   * The order in which form fields are displayed.
   *
   * @return uiOrder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UI_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getUiOrder() {
    return uiOrder;
  }

  public void setUiOrder(List<String> uiOrder) {
    this.uiOrder = uiOrder;
  }

  public FormUiDefinition uiTheme(FormUiDefinitionUiTheme uiTheme) {
    this.uiTheme = uiTheme;
    this.unparsed |= uiTheme.unparsed;
    return this;
  }

  /**
   * The visual theme applied to the form.
   *
   * @return uiTheme
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UI_THEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormUiDefinitionUiTheme getUiTheme() {
    return uiTheme;
  }

  public void setUiTheme(FormUiDefinitionUiTheme uiTheme) {
    this.uiTheme = uiTheme;
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
   * @return FormUiDefinition
   */
  @JsonAnySetter
  public FormUiDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FormUiDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormUiDefinition formUiDefinition = (FormUiDefinition) o;
    return Objects.equals(this.uiOrder, formUiDefinition.uiOrder)
        && Objects.equals(this.uiTheme, formUiDefinition.uiTheme)
        && Objects.equals(this.additionalProperties, formUiDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uiOrder, uiTheme, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormUiDefinition {\n");
    sb.append("    uiOrder: ").append(toIndentedString(uiOrder)).append("\n");
    sb.append("    uiTheme: ").append(toIndentedString(uiTheme)).append("\n");
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
