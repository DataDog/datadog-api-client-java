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
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.ChangeWidgetDefinitionType;
import com.datadog.api.v1.client.model.ChangeWidgetRequest;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import com.datadog.api.v1.client.model.WidgetTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * The Change graph shows you the change in a value over the time period chosen.
 */
@ApiModel(description = "The Change graph shows you the change in a value over the time period chosen.")
@JsonPropertyOrder({
  ChangeWidgetDefinition.JSON_PROPERTY_REQUESTS,
  ChangeWidgetDefinition.JSON_PROPERTY_TIME,
  ChangeWidgetDefinition.JSON_PROPERTY_TITLE,
  ChangeWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  ChangeWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  ChangeWidgetDefinition.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChangeWidgetDefinition {
  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<ChangeWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ChangeWidgetDefinitionType type = ChangeWidgetDefinitionType.CHANGE;


  public ChangeWidgetDefinition requests(List<ChangeWidgetRequest> requests) {
    this.requests = requests;
    return this;
  }

  public ChangeWidgetDefinition addRequestsItem(ChangeWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * Array of one request object to display in the widget.  See the dedicated [Request JSON schema documentation](https://docs.datadoghq.com/dashboards/graphing_json/request_json)  to learn how to build the &#x60;REQUEST_SCHEMA&#x60;.
   * @return requests
  **/
  @ApiModelProperty(example = "[{\"q/apm_query/log_query\":\"<METRIC_1>{<SCOPE_1>}\"}]", required = true, value = "Array of one request object to display in the widget.  See the dedicated [Request JSON schema documentation](https://docs.datadoghq.com/dashboards/graphing_json/request_json)  to learn how to build the `REQUEST_SCHEMA`.")
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ChangeWidgetRequest> getRequests() {
    return requests;
  }


  public void setRequests(List<ChangeWidgetRequest> requests) {
    this.requests = requests;
  }


  public ChangeWidgetDefinition time(WidgetTime time) {
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


  public ChangeWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the widget.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the widget.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ChangeWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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


  public ChangeWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

   /**
   * Size of the title.
   * @return titleSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the title.")
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitleSize() {
    return titleSize;
  }


  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }


  public ChangeWidgetDefinition type(ChangeWidgetDefinitionType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ChangeWidgetDefinitionType getType() {
    return type;
  }


  public void setType(ChangeWidgetDefinitionType type) {
    this.type = type;
  }


  /**
   * Return true if this ChangeWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeWidgetDefinition changeWidgetDefinition = (ChangeWidgetDefinition) o;
    return Objects.equals(this.requests, changeWidgetDefinition.requests) &&
        Objects.equals(this.time, changeWidgetDefinition.time) &&
        Objects.equals(this.title, changeWidgetDefinition.title) &&
        Objects.equals(this.titleAlign, changeWidgetDefinition.titleAlign) &&
        Objects.equals(this.titleSize, changeWidgetDefinition.titleSize) &&
        Objects.equals(this.type, changeWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests, time, title, titleAlign, titleSize, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeWidgetDefinition {\n");
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

