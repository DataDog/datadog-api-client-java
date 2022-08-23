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
   * <p>The service summary displays the graphs of a chosen service in your screenboard. Only available on FREE layout dashboards.</p>
 */
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
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceSummaryWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
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

  public ServiceSummaryWidgetDefinition() {}

  @JsonCreator
  public ServiceSummaryWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_ENV)String env,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICE)String service,
            @JsonProperty(required=true, value=JSON_PROPERTY_SPAN_NAME)String spanName,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ServiceSummaryWidgetDefinitionType type) {
        this.env = env;
        this.service = service;
        this.spanName = spanName;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ServiceSummaryWidgetDefinition displayFormat(WidgetServiceSummaryDisplayFormat displayFormat) {
    this.displayFormat = displayFormat;
    this.unparsed |= !displayFormat.isValid();
    return this;
  }

  /**
   * <p>Number of columns to display.</p>
   * @return displayFormat
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DISPLAY_FORMAT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetServiceSummaryDisplayFormat getDisplayFormat() {
        return displayFormat;
      }
  public void setDisplayFormat(WidgetServiceSummaryDisplayFormat displayFormat) {
    if (!displayFormat.isValid()) {
        this.unparsed = true;
    }
    this.displayFormat = displayFormat;
  }
  public ServiceSummaryWidgetDefinition env(String env) {
    this.env = env;
    return this;
  }

  /**
   * <p>APM environment.</p>
   * @return env
  **/
      @JsonProperty(JSON_PROPERTY_ENV)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>APM service.</p>
   * @return service
  **/
      @JsonProperty(JSON_PROPERTY_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>Whether to show the latency breakdown or not.</p>
   * @return showBreakdown
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOW_BREAKDOWN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Whether to show the latency distribution or not.</p>
   * @return showDistribution
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOW_DISTRIBUTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Whether to show the error metrics or not.</p>
   * @return showErrors
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOW_ERRORS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Whether to show the hits metrics or not.</p>
   * @return showHits
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOW_HITS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Whether to show the latency metrics or not.</p>
   * @return showLatency
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOW_LATENCY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Whether to show the resource list or not.</p>
   * @return showResourceList
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOW_RESOURCE_LIST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getShowResourceList() {
        return showResourceList;
      }
  public void setShowResourceList(Boolean showResourceList) {
    this.showResourceList = showResourceList;
  }
  public ServiceSummaryWidgetDefinition sizeFormat(WidgetSizeFormat sizeFormat) {
    this.sizeFormat = sizeFormat;
    this.unparsed |= !sizeFormat.isValid();
    return this;
  }

  /**
   * <p>Size of the widget.</p>
   * @return sizeFormat
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SIZE_FORMAT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetSizeFormat getSizeFormat() {
        return sizeFormat;
      }
  public void setSizeFormat(WidgetSizeFormat sizeFormat) {
    if (!sizeFormat.isValid()) {
        this.unparsed = true;
    }
    this.sizeFormat = sizeFormat;
  }
  public ServiceSummaryWidgetDefinition spanName(String spanName) {
    this.spanName = spanName;
    return this;
  }

  /**
   * <p>APM span name.</p>
   * @return spanName
  **/
      @JsonProperty(JSON_PROPERTY_SPAN_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSpanName() {
        return spanName;
      }
  public void setSpanName(String spanName) {
    this.spanName = spanName;
  }
  public ServiceSummaryWidgetDefinition time(WidgetTime time) {
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
  public ServiceSummaryWidgetDefinition title(String title) {
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
  public ServiceSummaryWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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
  public ServiceSummaryWidgetDefinition titleSize(String titleSize) {
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
  public ServiceSummaryWidgetDefinition type(ServiceSummaryWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the service summary widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ServiceSummaryWidgetDefinitionType getType() {
        return type;
      }
  public void setType(ServiceSummaryWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
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
    return Objects.equals(this.displayFormat, serviceSummaryWidgetDefinition.displayFormat) && Objects.equals(this.env, serviceSummaryWidgetDefinition.env) && Objects.equals(this.service, serviceSummaryWidgetDefinition.service) && Objects.equals(this.showBreakdown, serviceSummaryWidgetDefinition.showBreakdown) && Objects.equals(this.showDistribution, serviceSummaryWidgetDefinition.showDistribution) && Objects.equals(this.showErrors, serviceSummaryWidgetDefinition.showErrors) && Objects.equals(this.showHits, serviceSummaryWidgetDefinition.showHits) && Objects.equals(this.showLatency, serviceSummaryWidgetDefinition.showLatency) && Objects.equals(this.showResourceList, serviceSummaryWidgetDefinition.showResourceList) && Objects.equals(this.sizeFormat, serviceSummaryWidgetDefinition.sizeFormat) && Objects.equals(this.spanName, serviceSummaryWidgetDefinition.spanName) && Objects.equals(this.time, serviceSummaryWidgetDefinition.time) && Objects.equals(this.title, serviceSummaryWidgetDefinition.title) && Objects.equals(this.titleAlign, serviceSummaryWidgetDefinition.titleAlign) && Objects.equals(this.titleSize, serviceSummaryWidgetDefinition.titleSize) && Objects.equals(this.type, serviceSummaryWidgetDefinition.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(displayFormat,env,service,showBreakdown,showDistribution,showErrors,showHits,showLatency,showResourceList,sizeFormat,spanName,time,title,titleAlign,titleSize,type);
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
