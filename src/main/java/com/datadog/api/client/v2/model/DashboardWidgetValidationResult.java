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

/** Validation result for one dashboard widget. */
@JsonPropertyOrder({
  DashboardWidgetValidationResult.JSON_PROPERTY_ERROR_MESSAGE,
  DashboardWidgetValidationResult.JSON_PROPERTY_ERROR_PATH,
  DashboardWidgetValidationResult.JSON_PROPERTY_IS_VALID,
  DashboardWidgetValidationResult.JSON_PROPERTY_WIDGET_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardWidgetValidationResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_ERROR_PATH = "error_path";
  private String errorPath;

  public static final String JSON_PROPERTY_IS_VALID = "is_valid";
  private Boolean isValid;

  public static final String JSON_PROPERTY_WIDGET_TYPE = "widget_type";
  private String widgetType;

  public DashboardWidgetValidationResult() {}

  @JsonCreator
  public DashboardWidgetValidationResult(
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR_MESSAGE) String errorMessage,
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR_PATH) String errorPath,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_VALID) Boolean isValid,
      @JsonProperty(required = true, value = JSON_PROPERTY_WIDGET_TYPE) String widgetType) {
    this.errorMessage = errorMessage;
    if (errorMessage != null) {}
    this.errorPath = errorPath;
    if (errorPath != null) {}
    this.isValid = isValid;
    this.widgetType = widgetType;
    if (widgetType != null) {}
  }

  public DashboardWidgetValidationResult errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    if (errorMessage != null) {}
    return this;
  }

  /**
   * Validation error message, when the widget is invalid.
   *
   * @return errorMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public DashboardWidgetValidationResult errorPath(String errorPath) {
    this.errorPath = errorPath;
    if (errorPath != null) {}
    return this;
  }

  /**
   * Path to the invalid value, when available.
   *
   * @return errorPath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getErrorPath() {
    return errorPath;
  }

  public void setErrorPath(String errorPath) {
    this.errorPath = errorPath;
  }

  public DashboardWidgetValidationResult isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

  /**
   * Whether the widget passed validation.
   *
   * @return isValid
   */
  @JsonProperty(JSON_PROPERTY_IS_VALID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public DashboardWidgetValidationResult widgetType(String widgetType) {
    this.widgetType = widgetType;
    if (widgetType != null) {}
    return this;
  }

  /**
   * Type of the validated widget, when available.
   *
   * @return widgetType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWidgetType() {
    return widgetType;
  }

  public void setWidgetType(String widgetType) {
    this.widgetType = widgetType;
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
   * @return DashboardWidgetValidationResult
   */
  @JsonAnySetter
  public DashboardWidgetValidationResult putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DashboardWidgetValidationResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardWidgetValidationResult dashboardWidgetValidationResult =
        (DashboardWidgetValidationResult) o;
    return Objects.equals(this.errorMessage, dashboardWidgetValidationResult.errorMessage)
        && Objects.equals(this.errorPath, dashboardWidgetValidationResult.errorPath)
        && Objects.equals(this.isValid, dashboardWidgetValidationResult.isValid)
        && Objects.equals(this.widgetType, dashboardWidgetValidationResult.widgetType)
        && Objects.equals(
            this.additionalProperties, dashboardWidgetValidationResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, errorPath, isValid, widgetType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardWidgetValidationResult {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorPath: ").append(toIndentedString(errorPath)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    widgetType: ").append(toIndentedString(widgetType)).append("\n");
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
