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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The funnel visualization displays a funnel of user sessions that maps a sequence of view
 * navigation and user interaction in your application.
 */
@ApiModel(
    description =
        "The funnel visualization displays a funnel of user sessions that maps a sequence of view"
            + " navigation and user interaction in your application. ")
@JsonPropertyOrder({
  FunnelWidgetDefinition.JSON_PROPERTY_REQUESTS,
  FunnelWidgetDefinition.JSON_PROPERTY_TIME,
  FunnelWidgetDefinition.JSON_PROPERTY_TITLE,
  FunnelWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  FunnelWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  FunnelWidgetDefinition.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FunnelWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<FunnelWidgetRequest> requests = new ArrayList<>();

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

  public FunnelWidgetDefinition() {}

  @JsonCreator
  public FunnelWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<FunnelWidgetRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) FunnelWidgetDefinitionType type) {
    this.requests = requests;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public FunnelWidgetDefinition requests(List<FunnelWidgetRequest> requests) {
    this.requests = requests;
    for (FunnelWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FunnelWidgetDefinition addRequestsItem(FunnelWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * Request payload used to query items.
   *
   * @return requests
   */
  @ApiModelProperty(
      example =
          "[{\"query\":{\"data_source\":\"rum\",\"query_string\":\"@browser.name:Chrome\",\"steps\":[{\"facet\":\"@view.name\",\"value\":\"/logs\"},{\"facet\":\"@view.name\",\"value\":\"/apm/home\"}]},\"request_type\":\"funnel\"}]",
      required = true,
      value = "Request payload used to query items.")
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<FunnelWidgetRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<FunnelWidgetRequest> requests) {
    this.requests = requests;
  }

  public FunnelWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
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

  public FunnelWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the widget.
   *
   * @return title
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the widget.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public FunnelWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
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
    if (!titleAlign.isValid()) {
      this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }

  public FunnelWidgetDefinition titleSize(String titleSize) {
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

  public FunnelWidgetDefinition type(FunnelWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
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
  public FunnelWidgetDefinitionType getType() {
    return type;
  }

  public void setType(FunnelWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this FunnelWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunnelWidgetDefinition funnelWidgetDefinition = (FunnelWidgetDefinition) o;
    return Objects.equals(this.requests, funnelWidgetDefinition.requests)
        && Objects.equals(this.time, funnelWidgetDefinition.time)
        && Objects.equals(this.title, funnelWidgetDefinition.title)
        && Objects.equals(this.titleAlign, funnelWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, funnelWidgetDefinition.titleSize)
        && Objects.equals(this.type, funnelWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests, time, title, titleAlign, titleSize, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunnelWidgetDefinition {\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
