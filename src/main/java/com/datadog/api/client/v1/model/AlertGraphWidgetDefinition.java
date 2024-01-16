/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/**
 * Alert graphs are timeseries graphs showing the current status of any monitor defined on your
 * system.
 */
@JsonPropertyOrder({
  AlertGraphWidgetDefinition.JSON_PROPERTY_ALERT_ID,
  AlertGraphWidgetDefinition.JSON_PROPERTY_TIME,
  AlertGraphWidgetDefinition.JSON_PROPERTY_TITLE,
  AlertGraphWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  AlertGraphWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  AlertGraphWidgetDefinition.JSON_PROPERTY_TYPE,
  AlertGraphWidgetDefinition.JSON_PROPERTY_VIZ_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AlertGraphWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALERT_ID = "alert_id";
  private String alertId;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AlertGraphWidgetDefinitionType type = AlertGraphWidgetDefinitionType.ALERT_GRAPH;

  public static final String JSON_PROPERTY_VIZ_TYPE = "viz_type";
  private WidgetVizType vizType;

  public AlertGraphWidgetDefinition() {}

  @JsonCreator
  public AlertGraphWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALERT_ID) String alertId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          AlertGraphWidgetDefinitionType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIZ_TYPE) WidgetVizType vizType) {
    this.alertId = alertId;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.vizType = vizType;
    this.unparsed |= !vizType.isValid();
  }

  public AlertGraphWidgetDefinition alertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  /**
   * ID of the alert to use in the widget.
   *
   * @return alertId
   */
  @JsonProperty(JSON_PROPERTY_ALERT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAlertId() {
    return alertId;
  }

  public void setAlertId(String alertId) {
    this.alertId = alertId;
  }

  public AlertGraphWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Time setting for the widget.
   *
   * @return time
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTime getTime() {
    return time;
  }

  public void setTime(WidgetTime time) {
    this.time = time;
  }

  public AlertGraphWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the widget.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AlertGraphWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * How to align the text on the widget.
   *
   * @return titleAlign
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }

  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
      this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }

  public AlertGraphWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Size of the title.
   *
   * @return titleSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleSize() {
    return titleSize;
  }

  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }

  public AlertGraphWidgetDefinition type(AlertGraphWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the alert graph widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AlertGraphWidgetDefinitionType getType() {
    return type;
  }

  public void setType(AlertGraphWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public AlertGraphWidgetDefinition vizType(WidgetVizType vizType) {
    this.vizType = vizType;
    this.unparsed |= !vizType.isValid();
    return this;
  }

  /**
   * Whether to display the Alert Graph as a timeseries or a top list.
   *
   * @return vizType
   */
  @JsonProperty(JSON_PROPERTY_VIZ_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WidgetVizType getVizType() {
    return vizType;
  }

  public void setVizType(WidgetVizType vizType) {
    if (!vizType.isValid()) {
      this.unparsed = true;
    }
    this.vizType = vizType;
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
   * @return AlertGraphWidgetDefinition
   */
  @JsonAnySetter
  public AlertGraphWidgetDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AlertGraphWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertGraphWidgetDefinition alertGraphWidgetDefinition = (AlertGraphWidgetDefinition) o;
    return Objects.equals(this.alertId, alertGraphWidgetDefinition.alertId)
        && Objects.equals(this.time, alertGraphWidgetDefinition.time)
        && Objects.equals(this.title, alertGraphWidgetDefinition.title)
        && Objects.equals(this.titleAlign, alertGraphWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, alertGraphWidgetDefinition.titleSize)
        && Objects.equals(this.type, alertGraphWidgetDefinition.type)
        && Objects.equals(this.vizType, alertGraphWidgetDefinition.vizType)
        && Objects.equals(
            this.additionalProperties, alertGraphWidgetDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alertId, time, title, titleAlign, titleSize, type, vizType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertGraphWidgetDefinition {\n");
    sb.append("    alertId: ").append(toIndentedString(alertId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vizType: ").append(toIndentedString(vizType)).append("\n");
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
