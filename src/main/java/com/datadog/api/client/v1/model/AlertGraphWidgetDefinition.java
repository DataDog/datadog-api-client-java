/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Alert graphs are timeseries graphs showing the current status of any monitor defined on your system.</p>
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
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AlertGraphWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
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
            @JsonProperty(required=true, value=JSON_PROPERTY_ALERT_ID)String alertId,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)AlertGraphWidgetDefinitionType type,
            @JsonProperty(required=true, value=JSON_PROPERTY_VIZ_TYPE)WidgetVizType vizType) {
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
   * <p>ID of the alert to use in the widget.</p>
   * @return alertId
  **/
      @JsonProperty(JSON_PROPERTY_ALERT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>Time setting for the widget.</p>
   * @return time
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The title of the widget.</p>
   * @return title
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>How to align the text on the widget.</p>
   * @return titleAlign
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Size of the title.</p>
   * @return titleSize
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Type of the alert graph widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>Whether to display the Alert Graph as a timeseries or a top list.</p>
   * @return vizType
  **/
      @JsonProperty(JSON_PROPERTY_VIZ_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * Return true if this AlertGraphWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertGraphWidgetDefinition alertGraphWidgetDefinition = (AlertGraphWidgetDefinition) o;
    return Objects.equals(this.alertId, alertGraphWidgetDefinition.alertId) && Objects.equals(this.time, alertGraphWidgetDefinition.time) && Objects.equals(this.title, alertGraphWidgetDefinition.title) && Objects.equals(this.titleAlign, alertGraphWidgetDefinition.titleAlign) && Objects.equals(this.titleSize, alertGraphWidgetDefinition.titleSize) && Objects.equals(this.type, alertGraphWidgetDefinition.type) && Objects.equals(this.vizType, alertGraphWidgetDefinition.vizType);
  }


  @Override
  public int hashCode() {
    return Objects.hash(alertId,time,title,titleAlign,titleSize,type,vizType);
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
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
