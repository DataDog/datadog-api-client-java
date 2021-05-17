/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** This visualization displays a series of values by country on a world map. */
@ApiModel(description = "This visualization displays a series of values by country on a world map.")
@JsonPropertyOrder({
  GeomapWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  GeomapWidgetDefinition.JSON_PROPERTY_REQUESTS,
  GeomapWidgetDefinition.JSON_PROPERTY_STYLE,
  GeomapWidgetDefinition.JSON_PROPERTY_TIME,
  GeomapWidgetDefinition.JSON_PROPERTY_TITLE,
  GeomapWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  GeomapWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  GeomapWidgetDefinition.JSON_PROPERTY_TYPE,
  GeomapWidgetDefinition.JSON_PROPERTY_VIEW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GeomapWidgetDefinition {
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<GeomapWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_STYLE = "style";
  private GeomapWidgetDefinitionStyle style;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GeomapWidgetDefinitionType type = GeomapWidgetDefinitionType.GEOMAP;

  public static final String JSON_PROPERTY_VIEW = "view";
  private GeomapWidgetDefinitionView view;

  public GeomapWidgetDefinition() {}

  @JsonCreator
  public GeomapWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<GeomapWidgetRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_STYLE) GeomapWidgetDefinitionStyle style,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) GeomapWidgetDefinitionType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW) GeomapWidgetDefinitionView view) {
    this.requests = requests;
    this.style = style;
    this.type = type;
    this.view = view;
  }

  public GeomapWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    return this;
  }

  public GeomapWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    return this;
  }

  /**
   * A list of custom links.
   *
   * @return customLinks
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of custom links.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetCustomLink> getCustomLinks() {
    return customLinks;
  }

  public void setCustomLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
  }

  public GeomapWidgetDefinition requests(List<GeomapWidgetRequest> requests) {
    this.requests = requests;
    return this;
  }

  public GeomapWidgetDefinition addRequestsItem(GeomapWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    return this;
  }

  /**
   * Array of one request object to display in the widget. The request must contain a
   * &#x60;group-by&#x60; tag whose value is a country ISO code. See the [Request JSON schema
   * documentation](https://docs.datadoghq.com/dashboards/graphing_json/request_json) for
   * information about building the &#x60;REQUEST_SCHEMA&#x60;.
   *
   * @return requests
   */
  @ApiModelProperty(
      example = "[{\"rum_query\":\"<METRIC_1>{<SCOPE_1>}\"}]",
      required = true,
      value =
          "Array of one request object to display in the widget. The request must contain a"
              + " `group-by` tag whose value is a country ISO code.  See the [Request JSON schema"
              + " documentation](https://docs.datadoghq.com/dashboards/graphing_json/request_json)"
              + " for information about building the `REQUEST_SCHEMA`.")
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GeomapWidgetRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<GeomapWidgetRequest> requests) {
    this.requests = requests;
  }

  public GeomapWidgetDefinition style(GeomapWidgetDefinitionStyle style) {
    this.style = style;
    return this;
  }

  /**
   * Get style
   *
   * @return style
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GeomapWidgetDefinitionStyle getStyle() {
    return style;
  }

  public void setStyle(GeomapWidgetDefinitionStyle style) {
    this.style = style;
  }

  public GeomapWidgetDefinition time(WidgetTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   *
   * @return time
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTime getTime() {
    return time;
  }

  public void setTime(WidgetTime time) {
    this.time = time;
  }

  public GeomapWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of your widget.
   *
   * @return title
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of your widget.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GeomapWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    return this;
  }

  /**
   * Get titleAlign
   *
   * @return titleAlign
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }

  public void setTitleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
  }

  public GeomapWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * The size of the title.
   *
   * @return titleSize
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the title.")
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleSize() {
    return titleSize;
  }

  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }

  public GeomapWidgetDefinition type(GeomapWidgetDefinitionType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GeomapWidgetDefinitionType getType() {
    return type;
  }

  public void setType(GeomapWidgetDefinitionType type) {
    this.type = type;
  }

  public GeomapWidgetDefinition view(GeomapWidgetDefinitionView view) {
    this.view = view;
    return this;
  }

  /**
   * Get view
   *
   * @return view
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VIEW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GeomapWidgetDefinitionView getView() {
    return view;
  }

  public void setView(GeomapWidgetDefinitionView view) {
    this.view = view;
  }

  /** Return true if this GeomapWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapWidgetDefinition geomapWidgetDefinition = (GeomapWidgetDefinition) o;
    return Objects.equals(this.customLinks, geomapWidgetDefinition.customLinks)
        && Objects.equals(this.requests, geomapWidgetDefinition.requests)
        && Objects.equals(this.style, geomapWidgetDefinition.style)
        && Objects.equals(this.time, geomapWidgetDefinition.time)
        && Objects.equals(this.title, geomapWidgetDefinition.title)
        && Objects.equals(this.titleAlign, geomapWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, geomapWidgetDefinition.titleSize)
        && Objects.equals(this.type, geomapWidgetDefinition.type)
        && Objects.equals(this.view, geomapWidgetDefinition.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customLinks, requests, style, time, title, titleAlign, titleSize, type, view);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapWidgetDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("}");
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
