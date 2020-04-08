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

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.ToplistWidgetRequest;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import com.datadog.api.v1.client.model.WidgetTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The top list visualization enables you to display a list of Tag value like hostname or service with the most or least of any metric value, such as highest consumers of CPU, hosts with the least disk space, etc
 */
@ApiModel(description = "The top list visualization enables you to display a list of Tag value like hostname or service with the most or least of any metric value, such as highest consumers of CPU, hosts with the least disk space, etc")
@JsonPropertyOrder({
  ToplistWidgetDefinition.JSON_PROPERTY_REQUESTS,
  ToplistWidgetDefinition.JSON_PROPERTY_TIME,
  ToplistWidgetDefinition.JSON_PROPERTY_TITLE,
  ToplistWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  ToplistWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  ToplistWidgetDefinition.JSON_PROPERTY_TYPE
})

public class ToplistWidgetDefinition implements WidgetDefinition {
  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<ToplistWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "toplist";


  public ToplistWidgetDefinition requests(List<ToplistWidgetRequest> requests) {
    
    this.requests = requests;
    return this;
  }

  public ToplistWidgetDefinition addRequestsItem(ToplistWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * TODO.
   * @return requests
  **/
  @ApiModelProperty(required = true, value = "TODO.")
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ToplistWidgetRequest> getRequests() {
    return requests;
  }


  public void setRequests(List<ToplistWidgetRequest> requests) {
    this.requests = requests;
  }


  public ToplistWidgetDefinition time(WidgetTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
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


  public ToplistWidgetDefinition title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of your widget.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of your widget.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ToplistWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    
    this.titleAlign = titleAlign;
    return this;
  }

   /**
   * Get titleAlign
   * @return titleAlign
  **/
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


  public ToplistWidgetDefinition titleSize(String titleSize) {
    
    this.titleSize = titleSize;
    return this;
  }

   /**
   * Size of the title
   * @return titleSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the title")
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitleSize() {
    return titleSize;
  }


  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }


   /**
   * Type of the widget
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of the widget")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToplistWidgetDefinition toplistWidgetDefinition = (ToplistWidgetDefinition) o;
    return Objects.equals(this.requests, toplistWidgetDefinition.requests) &&
        Objects.equals(this.time, toplistWidgetDefinition.time) &&
        Objects.equals(this.title, toplistWidgetDefinition.title) &&
        Objects.equals(this.titleAlign, toplistWidgetDefinition.titleAlign) &&
        Objects.equals(this.titleSize, toplistWidgetDefinition.titleSize) &&
        Objects.equals(this.type, toplistWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests, time, title, titleAlign, titleSize, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToplistWidgetDefinition {\n");
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

