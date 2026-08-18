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

/** Request containing dashboard widgets and their layout context. */
@JsonPropertyOrder({
  DashboardWidgetValidationRequest.JSON_PROPERTY_LAYOUT_TYPE,
  DashboardWidgetValidationRequest.JSON_PROPERTY_REFLOW_TYPE,
  DashboardWidgetValidationRequest.JSON_PROPERTY_WIDGETS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardWidgetValidationRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LAYOUT_TYPE = "layout_type";
  private DashboardWidgetValidationLayoutType layoutType;

  public static final String JSON_PROPERTY_REFLOW_TYPE = "reflow_type";
  private DashboardWidgetValidationReflowType reflowType;

  public static final String JSON_PROPERTY_WIDGETS = "widgets";
  private List<Map<String, Object>> widgets = new ArrayList<>();

  public DashboardWidgetValidationRequest() {}

  @JsonCreator
  public DashboardWidgetValidationRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_LAYOUT_TYPE)
          DashboardWidgetValidationLayoutType layoutType,
      @JsonProperty(required = true, value = JSON_PROPERTY_WIDGETS)
          List<Map<String, Object>> widgets) {
    this.layoutType = layoutType;
    this.unparsed |= !layoutType.isValid();
    this.widgets = widgets;
  }

  public DashboardWidgetValidationRequest layoutType(
      DashboardWidgetValidationLayoutType layoutType) {
    this.layoutType = layoutType;
    this.unparsed |= !layoutType.isValid();
    return this;
  }

  /**
   * Layout type used to apply dashboard-specific widget layout validation.
   *
   * @return layoutType
   */
  @JsonProperty(JSON_PROPERTY_LAYOUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DashboardWidgetValidationLayoutType getLayoutType() {
    return layoutType;
  }

  public void setLayoutType(DashboardWidgetValidationLayoutType layoutType) {
    if (!layoutType.isValid()) {
      this.unparsed = true;
    }
    this.layoutType = layoutType;
  }

  public DashboardWidgetValidationRequest reflowType(
      DashboardWidgetValidationReflowType reflowType) {
    this.reflowType = reflowType;
    this.unparsed |= !reflowType.isValid();
    return this;
  }

  /**
   * Reflow behavior used for an ordered dashboard.
   *
   * @return reflowType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFLOW_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardWidgetValidationReflowType getReflowType() {
    return reflowType;
  }

  public void setReflowType(DashboardWidgetValidationReflowType reflowType) {
    if (!reflowType.isValid()) {
      this.unparsed = true;
    }
    this.reflowType = reflowType;
  }

  public DashboardWidgetValidationRequest widgets(List<Map<String, Object>> widgets) {
    this.widgets = widgets;
    return this;
  }

  public DashboardWidgetValidationRequest addWidgetsItem(Map<String, Object> widgetsItem) {
    this.widgets.add(widgetsItem);
    return this;
  }

  /**
   * Dashboard widgets to validate.
   *
   * @return widgets
   */
  @JsonProperty(JSON_PROPERTY_WIDGETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Map<String, Object>> getWidgets() {
    return widgets;
  }

  public void setWidgets(List<Map<String, Object>> widgets) {
    this.widgets = widgets;
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
   * @return DashboardWidgetValidationRequest
   */
  @JsonAnySetter
  public DashboardWidgetValidationRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DashboardWidgetValidationRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardWidgetValidationRequest dashboardWidgetValidationRequest =
        (DashboardWidgetValidationRequest) o;
    return Objects.equals(this.layoutType, dashboardWidgetValidationRequest.layoutType)
        && Objects.equals(this.reflowType, dashboardWidgetValidationRequest.reflowType)
        && Objects.equals(this.widgets, dashboardWidgetValidationRequest.widgets)
        && Objects.equals(
            this.additionalProperties, dashboardWidgetValidationRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layoutType, reflowType, widgets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardWidgetValidationRequest {\n");
    sb.append("    layoutType: ").append(toIndentedString(layoutType)).append("\n");
    sb.append("    reflowType: ").append(toIndentedString(reflowType)).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
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
