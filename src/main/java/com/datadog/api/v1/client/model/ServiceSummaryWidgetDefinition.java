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
import com.datadog.api.v1.client.model.ServiceSummaryWidgetDefinitionType;
import com.datadog.api.v1.client.model.WidgetServiceSummaryDisplayFormat;
import com.datadog.api.v1.client.model.WidgetSizeFormat;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import com.datadog.api.v1.client.model.WidgetTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * The service summary displays the graphs of a chosen service in your screenboard. Only available on FREE layout dashboards.
 */
@ApiModel(description = "The service summary displays the graphs of a chosen service in your screenboard. Only available on FREE layout dashboards.")
@JsonPropertyOrder({
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_DISPLAY_FORMAT,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_ENV,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_SERVICE,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_SHOW_BREAKDOWN,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_SHOW_DISTRIBUTION,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_SHOW_ERRORS,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_SHOW_HITS,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_SHOW_LATENCY,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_SHOW_RESOURCE_LIST,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_SIZE_FORMAT,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_SPAN_NAME,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_TIME,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_TITLE,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  ServiceSummaryWidgetDefinition.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceSummaryWidgetDefinition {
  public static final String JSON_PROPERTY_DISPLAY_FORMAT = "display_format";
  private WidgetServiceSummaryDisplayFormat displayFormat;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SHOW_BREAKDOWN = "show_breakdown";
  private Boolean showBreakdown;

  public static final String JSON_PROPERTY_SHOW_DISTRIBUTION = "show_distribution";
  private Boolean showDistribution;

  public static final String JSON_PROPERTY_SHOW_ERRORS = "show_errors";
  private Boolean showErrors;

  public static final String JSON_PROPERTY_SHOW_HITS = "show_hits";
  private Boolean showHits;

  public static final String JSON_PROPERTY_SHOW_LATENCY = "show_latency";
  private Boolean showLatency;

  public static final String JSON_PROPERTY_SHOW_RESOURCE_LIST = "show_resource_list";
  private Boolean showResourceList;

  public static final String JSON_PROPERTY_SIZE_FORMAT = "size_format";
  private WidgetSizeFormat sizeFormat;

  public static final String JSON_PROPERTY_SPAN_NAME = "span_name";
  private String spanName;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ServiceSummaryWidgetDefinitionType type = ServiceSummaryWidgetDefinitionType.TRACE_SERVICE;


  public ServiceSummaryWidgetDefinition displayFormat(WidgetServiceSummaryDisplayFormat displayFormat) {
    this.displayFormat = displayFormat;
    return this;
  }

   /**
   * Get displayFormat
   * @return displayFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetServiceSummaryDisplayFormat getDisplayFormat() {
    return displayFormat;
  }


  public void setDisplayFormat(WidgetServiceSummaryDisplayFormat displayFormat) {
    this.displayFormat = displayFormat;
  }


  public ServiceSummaryWidgetDefinition env(String env) {
    this.env = env;
    return this;
  }

   /**
   * APM environment.
   * @return env
  **/
  @ApiModelProperty(example = "", required = true, value = "APM environment.")
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEnv() {
    return env;
  }


  public void setEnv(String env) {
    this.env = env;
  }


  public ServiceSummaryWidgetDefinition service(String service) {
    this.service = service;
    return this;
  }

   /**
   * APM service.
   * @return service
  **/
  @ApiModelProperty(example = "", required = true, value = "APM service.")
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getService() {
    return service;
  }


  public void setService(String service) {
    this.service = service;
  }


  public ServiceSummaryWidgetDefinition showBreakdown(Boolean showBreakdown) {
    this.showBreakdown = showBreakdown;
    return this;
  }

   /**
   * Whether to show the latency breakdown or not.
   * @return showBreakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to show the latency breakdown or not.")
  @JsonProperty(JSON_PROPERTY_SHOW_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowBreakdown() {
    return showBreakdown;
  }


  public void setShowBreakdown(Boolean showBreakdown) {
    this.showBreakdown = showBreakdown;
  }


  public ServiceSummaryWidgetDefinition showDistribution(Boolean showDistribution) {
    this.showDistribution = showDistribution;
    return this;
  }

   /**
   * Whether to show the latency distribution or not.
   * @return showDistribution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to show the latency distribution or not.")
  @JsonProperty(JSON_PROPERTY_SHOW_DISTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowDistribution() {
    return showDistribution;
  }


  public void setShowDistribution(Boolean showDistribution) {
    this.showDistribution = showDistribution;
  }


  public ServiceSummaryWidgetDefinition showErrors(Boolean showErrors) {
    this.showErrors = showErrors;
    return this;
  }

   /**
   * Whether to show the error metrics or not.
   * @return showErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to show the error metrics or not.")
  @JsonProperty(JSON_PROPERTY_SHOW_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowErrors() {
    return showErrors;
  }


  public void setShowErrors(Boolean showErrors) {
    this.showErrors = showErrors;
  }


  public ServiceSummaryWidgetDefinition showHits(Boolean showHits) {
    this.showHits = showHits;
    return this;
  }

   /**
   * Whether to show the hits metrics or not.
   * @return showHits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to show the hits metrics or not.")
  @JsonProperty(JSON_PROPERTY_SHOW_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowHits() {
    return showHits;
  }


  public void setShowHits(Boolean showHits) {
    this.showHits = showHits;
  }


  public ServiceSummaryWidgetDefinition showLatency(Boolean showLatency) {
    this.showLatency = showLatency;
    return this;
  }

   /**
   * Whether to show the latency metrics or not.
   * @return showLatency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to show the latency metrics or not.")
  @JsonProperty(JSON_PROPERTY_SHOW_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowLatency() {
    return showLatency;
  }


  public void setShowLatency(Boolean showLatency) {
    this.showLatency = showLatency;
  }


  public ServiceSummaryWidgetDefinition showResourceList(Boolean showResourceList) {
    this.showResourceList = showResourceList;
    return this;
  }

   /**
   * Whether to show the resource list or not.
   * @return showResourceList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to show the resource list or not.")
  @JsonProperty(JSON_PROPERTY_SHOW_RESOURCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowResourceList() {
    return showResourceList;
  }


  public void setShowResourceList(Boolean showResourceList) {
    this.showResourceList = showResourceList;
  }


  public ServiceSummaryWidgetDefinition sizeFormat(WidgetSizeFormat sizeFormat) {
    this.sizeFormat = sizeFormat;
    return this;
  }

   /**
   * Get sizeFormat
   * @return sizeFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIZE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetSizeFormat getSizeFormat() {
    return sizeFormat;
  }


  public void setSizeFormat(WidgetSizeFormat sizeFormat) {
    this.sizeFormat = sizeFormat;
  }


  public ServiceSummaryWidgetDefinition spanName(String spanName) {
    this.spanName = spanName;
    return this;
  }

   /**
   * APM span name.
   * @return spanName
  **/
  @ApiModelProperty(example = "", required = true, value = "APM span name.")
  @JsonProperty(JSON_PROPERTY_SPAN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSpanName() {
    return spanName;
  }


  public void setSpanName(String spanName) {
    this.spanName = spanName;
  }


  public ServiceSummaryWidgetDefinition time(WidgetTime time) {
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


  public ServiceSummaryWidgetDefinition title(String title) {
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


  public ServiceSummaryWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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


  public ServiceSummaryWidgetDefinition titleSize(String titleSize) {
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


  public ServiceSummaryWidgetDefinition type(ServiceSummaryWidgetDefinitionType type) {
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

  public ServiceSummaryWidgetDefinitionType getType() {
    return type;
  }


  public void setType(ServiceSummaryWidgetDefinitionType type) {
    this.type = type;
  }


  /**
   * Return true if this ServiceSummaryWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSummaryWidgetDefinition serviceSummaryWidgetDefinition = (ServiceSummaryWidgetDefinition) o;
    return Objects.equals(this.displayFormat, serviceSummaryWidgetDefinition.displayFormat) &&
        Objects.equals(this.env, serviceSummaryWidgetDefinition.env) &&
        Objects.equals(this.service, serviceSummaryWidgetDefinition.service) &&
        Objects.equals(this.showBreakdown, serviceSummaryWidgetDefinition.showBreakdown) &&
        Objects.equals(this.showDistribution, serviceSummaryWidgetDefinition.showDistribution) &&
        Objects.equals(this.showErrors, serviceSummaryWidgetDefinition.showErrors) &&
        Objects.equals(this.showHits, serviceSummaryWidgetDefinition.showHits) &&
        Objects.equals(this.showLatency, serviceSummaryWidgetDefinition.showLatency) &&
        Objects.equals(this.showResourceList, serviceSummaryWidgetDefinition.showResourceList) &&
        Objects.equals(this.sizeFormat, serviceSummaryWidgetDefinition.sizeFormat) &&
        Objects.equals(this.spanName, serviceSummaryWidgetDefinition.spanName) &&
        Objects.equals(this.time, serviceSummaryWidgetDefinition.time) &&
        Objects.equals(this.title, serviceSummaryWidgetDefinition.title) &&
        Objects.equals(this.titleAlign, serviceSummaryWidgetDefinition.titleAlign) &&
        Objects.equals(this.titleSize, serviceSummaryWidgetDefinition.titleSize) &&
        Objects.equals(this.type, serviceSummaryWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayFormat, env, service, showBreakdown, showDistribution, showErrors, showHits, showLatency, showResourceList, sizeFormat, spanName, time, title, titleAlign, titleSize, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSummaryWidgetDefinition {\n");
    sb.append("    displayFormat: ").append(toIndentedString(displayFormat)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    showBreakdown: ").append(toIndentedString(showBreakdown)).append("\n");
    sb.append("    showDistribution: ").append(toIndentedString(showDistribution)).append("\n");
    sb.append("    showErrors: ").append(toIndentedString(showErrors)).append("\n");
    sb.append("    showHits: ").append(toIndentedString(showHits)).append("\n");
    sb.append("    showLatency: ").append(toIndentedString(showLatency)).append("\n");
    sb.append("    showResourceList: ").append(toIndentedString(showResourceList)).append("\n");
    sb.append("    sizeFormat: ").append(toIndentedString(sizeFormat)).append("\n");
    sb.append("    spanName: ").append(toIndentedString(spanName)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

