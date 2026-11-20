/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  AlertGraphBackendDefinition.JSON_PROPERTY_ALERT_ID,
  AlertGraphBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  AlertGraphBackendDefinition.JSON_PROPERTY_NOTES,
  AlertGraphBackendDefinition.JSON_PROPERTY_TIME,
  AlertGraphBackendDefinition.JSON_PROPERTY_TITLE,
  AlertGraphBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  AlertGraphBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  AlertGraphBackendDefinition.JSON_PROPERTY_TYPE,
  AlertGraphBackendDefinition.JSON_PROPERTY_VIZ_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AlertGraphBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALERT_ID = "alert_id";
  private String alertId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AlertGraphBackendDefinitionType type;

  public static final String JSON_PROPERTY_VIZ_TYPE = "viz_type";
  private AlertGraphVizType vizType;

  public AlertGraphBackendDefinition() {}

  @JsonCreator
  public AlertGraphBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALERT_ID) String alertId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          AlertGraphBackendDefinitionType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIZ_TYPE) AlertGraphVizType vizType) {
    this.alertId = alertId;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.vizType = vizType;
    this.unparsed |= !vizType.isValid();
  }

  public AlertGraphBackendDefinition alertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public AlertGraphBackendDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public AlertGraphBackendDefinition notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return notes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public AlertGraphBackendDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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
    if (time != null) {
      this.unparsed |= time.unparsed;
    }
  }

  public AlertGraphBackendDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public AlertGraphBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public AlertGraphBackendDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public AlertGraphBackendDefinition type(AlertGraphBackendDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AlertGraphBackendDefinitionType getType() {
    return type;
  }

  public void setType(AlertGraphBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public AlertGraphBackendDefinition vizType(AlertGraphVizType vizType) {
    this.vizType = vizType;
    this.unparsed |= !vizType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return vizType
   */
  @JsonProperty(JSON_PROPERTY_VIZ_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AlertGraphVizType getVizType() {
    return vizType;
  }

  public void setVizType(AlertGraphVizType vizType) {
    if (!vizType.isValid()) {
      this.unparsed = true;
    }
    this.vizType = vizType;
  }

  /** Return true if this AlertGraphBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertGraphBackendDefinition alertGraphBackendDefinition = (AlertGraphBackendDefinition) o;
    return Objects.equals(this.alertId, alertGraphBackendDefinition.alertId)
        && Objects.equals(this.description, alertGraphBackendDefinition.description)
        && Objects.equals(this.notes, alertGraphBackendDefinition.notes)
        && Objects.equals(this.time, alertGraphBackendDefinition.time)
        && Objects.equals(this.title, alertGraphBackendDefinition.title)
        && Objects.equals(this.titleAlign, alertGraphBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, alertGraphBackendDefinition.titleSize)
        && Objects.equals(this.type, alertGraphBackendDefinition.type)
        && Objects.equals(this.vizType, alertGraphBackendDefinition.vizType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alertId, description, notes, time, title, titleAlign, titleSize, type, vizType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertGraphBackendDefinition {\n");
    sb.append("    alertId: ").append(toIndentedString(alertId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vizType: ").append(toIndentedString(vizType)).append("\n");
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
