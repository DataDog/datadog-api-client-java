/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The user journey funnel visualization displays conversion funnels based on user journey data from
 * Product Analytics.
 */
@JsonPropertyOrder({
  ProductAnalyticsFunnelWidgetDefinition.JSON_PROPERTY_DESCRIPTION,
  ProductAnalyticsFunnelWidgetDefinition.JSON_PROPERTY_GROUPED_DISPLAY,
  ProductAnalyticsFunnelWidgetDefinition.JSON_PROPERTY_REQUESTS,
  ProductAnalyticsFunnelWidgetDefinition.JSON_PROPERTY_TIME,
  ProductAnalyticsFunnelWidgetDefinition.JSON_PROPERTY_TITLE,
  ProductAnalyticsFunnelWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  ProductAnalyticsFunnelWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  ProductAnalyticsFunnelWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsFunnelWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_GROUPED_DISPLAY = "grouped_display";
  private FunnelGroupedDisplay groupedDisplay;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<ProductAnalyticsFunnelRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private FunnelWidgetDefinitionType type = FunnelWidgetDefinitionType.FUNNEL;

  public ProductAnalyticsFunnelWidgetDefinition() {}

  @JsonCreator
  public ProductAnalyticsFunnelWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<ProductAnalyticsFunnelRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) FunnelWidgetDefinitionType type) {
    this.requests = requests;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ProductAnalyticsFunnelWidgetDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the widget.
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

  public ProductAnalyticsFunnelWidgetDefinition groupedDisplay(
      FunnelGroupedDisplay groupedDisplay) {
    this.groupedDisplay = groupedDisplay;
    this.unparsed |= !groupedDisplay.isValid();
    return this;
  }

  /**
   * Display mode for grouped funnel results.
   *
   * @return groupedDisplay
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPED_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FunnelGroupedDisplay getGroupedDisplay() {
    return groupedDisplay;
  }

  public void setGroupedDisplay(FunnelGroupedDisplay groupedDisplay) {
    if (!groupedDisplay.isValid()) {
      this.unparsed = true;
    }
    this.groupedDisplay = groupedDisplay;
  }

  public ProductAnalyticsFunnelWidgetDefinition requests(
      List<ProductAnalyticsFunnelRequest> requests) {
    this.requests = requests;
    for (ProductAnalyticsFunnelRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ProductAnalyticsFunnelWidgetDefinition addRequestsItem(
      ProductAnalyticsFunnelRequest requestsItem) {
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
  public List<ProductAnalyticsFunnelRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<ProductAnalyticsFunnelRequest> requests) {
    this.requests = requests;
  }

  public ProductAnalyticsFunnelWidgetDefinition time(WidgetTime time) {
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

  public ProductAnalyticsFunnelWidgetDefinition title(String title) {
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

  public ProductAnalyticsFunnelWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public ProductAnalyticsFunnelWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * The size of the title.
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

  public ProductAnalyticsFunnelWidgetDefinition type(FunnelWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of funnel widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FunnelWidgetDefinitionType getType() {
    return type;
  }

  public void setType(FunnelWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ProductAnalyticsFunnelWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsFunnelWidgetDefinition productAnalyticsFunnelWidgetDefinition =
        (ProductAnalyticsFunnelWidgetDefinition) o;
    return Objects.equals(this.description, productAnalyticsFunnelWidgetDefinition.description)
        && Objects.equals(
            this.groupedDisplay, productAnalyticsFunnelWidgetDefinition.groupedDisplay)
        && Objects.equals(this.requests, productAnalyticsFunnelWidgetDefinition.requests)
        && Objects.equals(this.time, productAnalyticsFunnelWidgetDefinition.time)
        && Objects.equals(this.title, productAnalyticsFunnelWidgetDefinition.title)
        && Objects.equals(this.titleAlign, productAnalyticsFunnelWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, productAnalyticsFunnelWidgetDefinition.titleSize)
        && Objects.equals(this.type, productAnalyticsFunnelWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description, groupedDisplay, requests, time, title, titleAlign, titleSize, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsFunnelWidgetDefinition {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupedDisplay: ").append(toIndentedString(groupedDisplay)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
