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
   * <p>The Distribution visualization is another way of showing metrics
   * aggregated across one or several tags, such as hosts.
   * Unlike the heat map, a distribution graph’s x-axis is quantity rather than time.</p>
 */
@JsonPropertyOrder({
  DistributionWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  DistributionWidgetDefinition.JSON_PROPERTY_LEGEND_SIZE,
  DistributionWidgetDefinition.JSON_PROPERTY_MARKERS,
  DistributionWidgetDefinition.JSON_PROPERTY_REQUESTS,
  DistributionWidgetDefinition.JSON_PROPERTY_SHOW_LEGEND,
  DistributionWidgetDefinition.JSON_PROPERTY_TIME,
  DistributionWidgetDefinition.JSON_PROPERTY_TITLE,
  DistributionWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  DistributionWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  DistributionWidgetDefinition.JSON_PROPERTY_TYPE,
  DistributionWidgetDefinition.JSON_PROPERTY_XAXIS,
  DistributionWidgetDefinition.JSON_PROPERTY_YAXIS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_LEGEND_SIZE = "legend_size";
  private String legendSize;

  public static final String JSON_PROPERTY_MARKERS = "markers";
  private List<WidgetMarker> markers = null;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<DistributionWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_SHOW_LEGEND = "show_legend";
  private Boolean showLegend;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DistributionWidgetDefinitionType type = DistributionWidgetDefinitionType.DISTRIBUTION;

  public static final String JSON_PROPERTY_XAXIS = "xaxis";
  private DistributionWidgetXAxis xaxis;

  public static final String JSON_PROPERTY_YAXIS = "yaxis";
  private DistributionWidgetYAxis yaxis;

  public DistributionWidgetDefinition() {}

  @JsonCreator
  public DistributionWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_REQUESTS)List<DistributionWidgetRequest> requests,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)DistributionWidgetDefinitionType type) {
        this.requests = requests;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public DistributionWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public DistributionWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * <p>A list of custom links.</p>
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
  public DistributionWidgetDefinition legendSize(String legendSize) {
    this.legendSize = legendSize;
    return this;
  }

  /**
   * <p>(Deprecated) The widget legend was replaced by a tooltip and sidebar.</p>
   * @return legendSize
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LEGEND_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLegendSize() {
        return legendSize;
      }
  @Deprecated
  public void setLegendSize(String legendSize) {
    this.legendSize = legendSize;
  }
  public DistributionWidgetDefinition markers(List<WidgetMarker> markers) {
    this.markers = markers;
    for (WidgetMarker item : markers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public DistributionWidgetDefinition addMarkersItem(WidgetMarker markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<>();
    }
    this.markers.add(markersItem);
    this.unparsed |= markersItem.unparsed;
    return this;
  }

  /**
   * <p>List of markers.</p>
   * @return markers
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MARKERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<WidgetMarker> getMarkers() {
        return markers;
      }
  public void setMarkers(List<WidgetMarker> markers) {
    this.markers = markers;
  }
  public DistributionWidgetDefinition requests(List<DistributionWidgetRequest> requests) {
    this.requests = requests;
    for (DistributionWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public DistributionWidgetDefinition addRequestsItem(DistributionWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * <p>Array of one request object to display in the widget.</p>
   * <p>See the dedicated <a href="https://docs.datadoghq.com/dashboards/graphing_json/request_json">Request JSON schema documentation</a>
   *  to learn how to build the <code>REQUEST_SCHEMA</code>.</p>
   * @return requests
  **/
      @JsonProperty(JSON_PROPERTY_REQUESTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<DistributionWidgetRequest> getRequests() {
        return requests;
      }
  public void setRequests(List<DistributionWidgetRequest> requests) {
    this.requests = requests;
  }
  public DistributionWidgetDefinition showLegend(Boolean showLegend) {
    this.showLegend = showLegend;
    return this;
  }

  /**
   * <p>(Deprecated) The widget legend was replaced by a tooltip and sidebar.</p>
   * @return showLegend
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOW_LEGEND)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getShowLegend() {
        return showLegend;
      }
  @Deprecated
  public void setShowLegend(Boolean showLegend) {
    this.showLegend = showLegend;
  }
  public DistributionWidgetDefinition time(WidgetTime time) {
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
  public DistributionWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Title of the widget.</p>
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
  public DistributionWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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
  public DistributionWidgetDefinition titleSize(String titleSize) {
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
  public DistributionWidgetDefinition type(DistributionWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the distribution widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public DistributionWidgetDefinitionType getType() {
        return type;
      }
  public void setType(DistributionWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public DistributionWidgetDefinition xaxis(DistributionWidgetXAxis xaxis) {
    this.xaxis = xaxis;
    this.unparsed |= xaxis.unparsed;
    return this;
  }

  /**
   * <p>X Axis controls for the distribution widget.</p>
   * @return xaxis
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_XAXIS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public DistributionWidgetXAxis getXaxis() {
        return xaxis;
      }
  public void setXaxis(DistributionWidgetXAxis xaxis) {
    this.xaxis = xaxis;
  }
  public DistributionWidgetDefinition yaxis(DistributionWidgetYAxis yaxis) {
    this.yaxis = yaxis;
    this.unparsed |= yaxis.unparsed;
    return this;
  }

  /**
   * <p>Y Axis controls for the distribution widget.</p>
   * @return yaxis
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_YAXIS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public DistributionWidgetYAxis getYaxis() {
        return yaxis;
      }
  public void setYaxis(DistributionWidgetYAxis yaxis) {
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
   * @return DistributionWidgetDefinition
   */
  @JsonAnySetter
  public DistributionWidgetDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this DistributionWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionWidgetDefinition distributionWidgetDefinition = (DistributionWidgetDefinition) o;
    return Objects.equals(this.customLinks, distributionWidgetDefinition.customLinks) && Objects.equals(this.legendSize, distributionWidgetDefinition.legendSize) && Objects.equals(this.markers, distributionWidgetDefinition.markers) && Objects.equals(this.requests, distributionWidgetDefinition.requests) && Objects.equals(this.showLegend, distributionWidgetDefinition.showLegend) && Objects.equals(this.time, distributionWidgetDefinition.time) && Objects.equals(this.title, distributionWidgetDefinition.title) && Objects.equals(this.titleAlign, distributionWidgetDefinition.titleAlign) && Objects.equals(this.titleSize, distributionWidgetDefinition.titleSize) && Objects.equals(this.type, distributionWidgetDefinition.type) && Objects.equals(this.xaxis, distributionWidgetDefinition.xaxis) && Objects.equals(this.yaxis, distributionWidgetDefinition.yaxis) && Objects.equals(this.additionalProperties, distributionWidgetDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(customLinks,legendSize,markers,requests,showLegend,time,title,titleAlign,titleSize,type,xaxis,yaxis, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionWidgetDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    legendSize: ").append(toIndentedString(legendSize)).append("\n");
    sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    showLegend: ").append(toIndentedString(showLegend)).append("\n");
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
