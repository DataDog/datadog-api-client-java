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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The list stream visualization displays a table of recent events in your application that match a
 * search criteria using user-defined columns.
 */
@JsonPropertyOrder({
  ListStreamWidgetDefinition.JSON_PROPERTY_LEGEND_SIZE,
  ListStreamWidgetDefinition.JSON_PROPERTY_REQUESTS,
  ListStreamWidgetDefinition.JSON_PROPERTY_SHOW_LEGEND,
  ListStreamWidgetDefinition.JSON_PROPERTY_TIME,
  ListStreamWidgetDefinition.JSON_PROPERTY_TITLE,
  ListStreamWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  ListStreamWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  ListStreamWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListStreamWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LEGEND_SIZE = "legend_size";
  private String legendSize;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<ListStreamWidgetRequest> requests = new ArrayList<>();

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
  private ListStreamWidgetDefinitionType type = ListStreamWidgetDefinitionType.LIST_STREAM;

  public ListStreamWidgetDefinition() {}

  @JsonCreator
  public ListStreamWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<ListStreamWidgetRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ListStreamWidgetDefinitionType type) {
    this.requests = requests;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ListStreamWidgetDefinition legendSize(String legendSize) {
    this.legendSize = legendSize;
    return this;
  }

  /**
   * Available legend sizes for a widget. Should be one of "0", "2", "4", "8", "16", or "auto".
   *
   * @return legendSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGEND_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLegendSize() {
    return legendSize;
  }

  public void setLegendSize(String legendSize) {
    this.legendSize = legendSize;
  }

  public ListStreamWidgetDefinition requests(List<ListStreamWidgetRequest> requests) {
    this.requests = requests;
    for (ListStreamWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListStreamWidgetDefinition addRequestsItem(ListStreamWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * Request payload used to query items.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ListStreamWidgetRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<ListStreamWidgetRequest> requests) {
    this.requests = requests;
  }

  public ListStreamWidgetDefinition showLegend(Boolean showLegend) {
    this.showLegend = showLegend;
    return this;
  }

  /**
   * Whether or not to display the legend on this widget.
   *
   * @return showLegend
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_LEGEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowLegend() {
    return showLegend;
  }

  public void setShowLegend(Boolean showLegend) {
    this.showLegend = showLegend;
  }

  public ListStreamWidgetDefinition time(WidgetTime time) {
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

  public ListStreamWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the widget.
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

  public ListStreamWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public ListStreamWidgetDefinition titleSize(String titleSize) {
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

  public ListStreamWidgetDefinition type(ListStreamWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the list stream widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ListStreamWidgetDefinitionType getType() {
    return type;
  }

  public void setType(ListStreamWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ListStreamWidgetDefinition
   */
  @JsonAnySetter
  public ListStreamWidgetDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ListStreamWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListStreamWidgetDefinition listStreamWidgetDefinition = (ListStreamWidgetDefinition) o;
    return Objects.equals(this.legendSize, listStreamWidgetDefinition.legendSize)
        && Objects.equals(this.requests, listStreamWidgetDefinition.requests)
        && Objects.equals(this.showLegend, listStreamWidgetDefinition.showLegend)
        && Objects.equals(this.time, listStreamWidgetDefinition.time)
        && Objects.equals(this.title, listStreamWidgetDefinition.title)
        && Objects.equals(this.titleAlign, listStreamWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, listStreamWidgetDefinition.titleSize)
        && Objects.equals(this.type, listStreamWidgetDefinition.type)
        && Objects.equals(
            this.additionalProperties, listStreamWidgetDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        legendSize,
        requests,
        showLegend,
        time,
        title,
        titleAlign,
        titleSize,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListStreamWidgetDefinition {\n");
    sb.append("    legendSize: ").append(toIndentedString(legendSize)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    showLegend: ").append(toIndentedString(showLegend)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
