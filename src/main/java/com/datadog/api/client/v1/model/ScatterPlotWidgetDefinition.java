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
import java.util.UUID;
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
   * <p>The scatter plot visualization allows you to graph a chosen scope over two different metrics with their respective aggregation.</p>
 */
@JsonPropertyOrder({
  ScatterPlotWidgetDefinition.JSON_PROPERTY_COLOR_BY_GROUPS,
  ScatterPlotWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  ScatterPlotWidgetDefinition.JSON_PROPERTY_REQUESTS,
  ScatterPlotWidgetDefinition.JSON_PROPERTY_TIME,
  ScatterPlotWidgetDefinition.JSON_PROPERTY_TITLE,
  ScatterPlotWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  ScatterPlotWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  ScatterPlotWidgetDefinition.JSON_PROPERTY_TYPE,
  ScatterPlotWidgetDefinition.JSON_PROPERTY_XAXIS,
  ScatterPlotWidgetDefinition.JSON_PROPERTY_YAXIS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterPlotWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR_BY_GROUPS = "color_by_groups";
  private List<String> colorByGroups = null;

  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private ScatterPlotWidgetDefinitionRequests requests;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ScatterPlotWidgetDefinitionType type = ScatterPlotWidgetDefinitionType.SCATTERPLOT;

  public static final String JSON_PROPERTY_XAXIS = "xaxis";
  private WidgetAxis xaxis;

  public static final String JSON_PROPERTY_YAXIS = "yaxis";
  private WidgetAxis yaxis;

  public ScatterPlotWidgetDefinition() {}

  @JsonCreator
  public ScatterPlotWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_REQUESTS)ScatterPlotWidgetDefinitionRequests requests,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ScatterPlotWidgetDefinitionType type) {
        this.requests = requests;
        this.unparsed |= requests.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ScatterPlotWidgetDefinition colorByGroups(List<String> colorByGroups) {
    this.colorByGroups = colorByGroups;
    return this;
  }
  public ScatterPlotWidgetDefinition addColorByGroupsItem(String colorByGroupsItem) {
    if (this.colorByGroups == null) {
      this.colorByGroups = new ArrayList<>();
    }
    this.colorByGroups.add(colorByGroupsItem);
    return this;
  }

  /**
   * <p>List of groups used for colors.</p>
   * @return colorByGroups
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COLOR_BY_GROUPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getColorByGroups() {
        return colorByGroups;
      }
  public void setColorByGroups(List<String> colorByGroups) {
    this.colorByGroups = colorByGroups;
  }
  public ScatterPlotWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ScatterPlotWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * <p>List of custom links.</p>
   * @return customLinks
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_LINKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<WidgetCustomLink> getCustomLinks() {
        return customLinks;
      }
  public void setCustomLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
  }
  public ScatterPlotWidgetDefinition requests(ScatterPlotWidgetDefinitionRequests requests) {
    this.requests = requests;
    this.unparsed |= requests.unparsed;
    return this;
  }

  /**
   * <p>Widget definition.</p>
   * @return requests
  **/
      @JsonProperty(JSON_PROPERTY_REQUESTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ScatterPlotWidgetDefinitionRequests getRequests() {
        return requests;
      }
  public void setRequests(ScatterPlotWidgetDefinitionRequests requests) {
    this.requests = requests;
  }
  public ScatterPlotWidgetDefinition time(WidgetTime time) {
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
  public ScatterPlotWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Title of your widget.</p>
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
  public ScatterPlotWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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
  public ScatterPlotWidgetDefinition titleSize(String titleSize) {
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
  public ScatterPlotWidgetDefinition type(ScatterPlotWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the scatter plot widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ScatterPlotWidgetDefinitionType getType() {
        return type;
      }
  public void setType(ScatterPlotWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public ScatterPlotWidgetDefinition xaxis(WidgetAxis xaxis) {
    this.xaxis = xaxis;
    this.unparsed |= xaxis.unparsed;
    return this;
  }

  /**
   * <p>Axis controls for the widget.</p>
   * @return xaxis
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_XAXIS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetAxis getXaxis() {
        return xaxis;
      }
  public void setXaxis(WidgetAxis xaxis) {
    this.xaxis = xaxis;
  }
  public ScatterPlotWidgetDefinition yaxis(WidgetAxis yaxis) {
    this.yaxis = yaxis;
    this.unparsed |= yaxis.unparsed;
    return this;
  }

  /**
   * <p>Axis controls for the widget.</p>
   * @return yaxis
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_YAXIS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetAxis getYaxis() {
        return yaxis;
      }
  public void setYaxis(WidgetAxis yaxis) {
    this.yaxis = yaxis;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ScatterPlotWidgetDefinition
   */
  @JsonAnySetter
  public ScatterPlotWidgetDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this ScatterPlotWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterPlotWidgetDefinition scatterPlotWidgetDefinition = (ScatterPlotWidgetDefinition) o;
    return Objects.equals(this.colorByGroups, scatterPlotWidgetDefinition.colorByGroups) && Objects.equals(this.customLinks, scatterPlotWidgetDefinition.customLinks) && Objects.equals(this.requests, scatterPlotWidgetDefinition.requests) && Objects.equals(this.time, scatterPlotWidgetDefinition.time) && Objects.equals(this.title, scatterPlotWidgetDefinition.title) && Objects.equals(this.titleAlign, scatterPlotWidgetDefinition.titleAlign) && Objects.equals(this.titleSize, scatterPlotWidgetDefinition.titleSize) && Objects.equals(this.type, scatterPlotWidgetDefinition.type) && Objects.equals(this.xaxis, scatterPlotWidgetDefinition.xaxis) && Objects.equals(this.yaxis, scatterPlotWidgetDefinition.yaxis) && Objects.equals(this.additionalProperties, scatterPlotWidgetDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(colorByGroups,customLinks,requests,time,title,titleAlign,titleSize,type,xaxis,yaxis, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterPlotWidgetDefinition {\n");
    sb.append("    colorByGroups: ").append(toIndentedString(colorByGroups)).append("\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    xaxis: ").append(toIndentedString(xaxis)).append("\n");
    sb.append("    yaxis: ").append(toIndentedString(yaxis)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
