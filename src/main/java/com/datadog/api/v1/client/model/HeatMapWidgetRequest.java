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
import com.datadog.api.v1.client.model.EventQueryDefinition;
import com.datadog.api.v1.client.model.LogQueryDefinition;
import com.datadog.api.v1.client.model.ProcessQueryDefinition;
import com.datadog.api.v1.client.model.WidgetStyle;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  HeatMapWidgetRequest.JSON_PROPERTY_APM_QUERY,
  HeatMapWidgetRequest.JSON_PROPERTY_EVENT_QUERY,
  HeatMapWidgetRequest.JSON_PROPERTY_LOG_QUERY,
  HeatMapWidgetRequest.JSON_PROPERTY_NETWORK_QUERY,
  HeatMapWidgetRequest.JSON_PROPERTY_PROCESS_QUERY,
  HeatMapWidgetRequest.JSON_PROPERTY_Q,
  HeatMapWidgetRequest.JSON_PROPERTY_RUM_QUERY,
  HeatMapWidgetRequest.JSON_PROPERTY_STYLE
})

public class HeatMapWidgetRequest {
  public static final String JSON_PROPERTY_APM_QUERY = "apm_query";
  private LogQueryDefinition apmQuery;

  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private EventQueryDefinition eventQuery;

  public static final String JSON_PROPERTY_LOG_QUERY = "log_query";
  private LogQueryDefinition logQuery;

  public static final String JSON_PROPERTY_NETWORK_QUERY = "network_query";
  private LogQueryDefinition networkQuery;

  public static final String JSON_PROPERTY_PROCESS_QUERY = "process_query";
  private ProcessQueryDefinition processQuery;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public static final String JSON_PROPERTY_RUM_QUERY = "rum_query";
  private LogQueryDefinition rumQuery;

  public static final String JSON_PROPERTY_STYLE = "style";
  private WidgetStyle style;


  public HeatMapWidgetRequest apmQuery(LogQueryDefinition apmQuery) {
    
    this.apmQuery = apmQuery;
    return this;
  }

   /**
   * Get apmQuery
   * @return apmQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APM_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getApmQuery() {
    return apmQuery;
  }


  public void setApmQuery(LogQueryDefinition apmQuery) {
    this.apmQuery = apmQuery;
  }


  public HeatMapWidgetRequest eventQuery(EventQueryDefinition eventQuery) {
    
    this.eventQuery = eventQuery;
    return this;
  }

   /**
   * Get eventQuery
   * @return eventQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventQueryDefinition getEventQuery() {
    return eventQuery;
  }


  public void setEventQuery(EventQueryDefinition eventQuery) {
    this.eventQuery = eventQuery;
  }


  public HeatMapWidgetRequest logQuery(LogQueryDefinition logQuery) {
    
    this.logQuery = logQuery;
    return this;
  }

   /**
   * Get logQuery
   * @return logQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOG_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getLogQuery() {
    return logQuery;
  }


  public void setLogQuery(LogQueryDefinition logQuery) {
    this.logQuery = logQuery;
  }


  public HeatMapWidgetRequest networkQuery(LogQueryDefinition networkQuery) {
    
    this.networkQuery = networkQuery;
    return this;
  }

   /**
   * Get networkQuery
   * @return networkQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NETWORK_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getNetworkQuery() {
    return networkQuery;
  }


  public void setNetworkQuery(LogQueryDefinition networkQuery) {
    this.networkQuery = networkQuery;
  }


  public HeatMapWidgetRequest processQuery(ProcessQueryDefinition processQuery) {
    
    this.processQuery = processQuery;
    return this;
  }

   /**
   * Get processQuery
   * @return processQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROCESS_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProcessQueryDefinition getProcessQuery() {
    return processQuery;
  }


  public void setProcessQuery(ProcessQueryDefinition processQuery) {
    this.processQuery = processQuery;
  }


  public HeatMapWidgetRequest q(String q) {
    
    this.q = q;
    return this;
  }

   /**
   * TODO.
   * @return q
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQ() {
    return q;
  }


  public void setQ(String q) {
    this.q = q;
  }


  public HeatMapWidgetRequest rumQuery(LogQueryDefinition rumQuery) {
    
    this.rumQuery = rumQuery;
    return this;
  }

   /**
   * Get rumQuery
   * @return rumQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RUM_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getRumQuery() {
    return rumQuery;
  }


  public void setRumQuery(LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
  }


  public HeatMapWidgetRequest style(WidgetStyle style) {
    
    this.style = style;
    return this;
  }

   /**
   * Get style
   * @return style
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetStyle getStyle() {
    return style;
  }


  public void setStyle(WidgetStyle style) {
    this.style = style;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatMapWidgetRequest heatMapWidgetRequest = (HeatMapWidgetRequest) o;
    return Objects.equals(this.apmQuery, heatMapWidgetRequest.apmQuery) &&
        Objects.equals(this.eventQuery, heatMapWidgetRequest.eventQuery) &&
        Objects.equals(this.logQuery, heatMapWidgetRequest.logQuery) &&
        Objects.equals(this.networkQuery, heatMapWidgetRequest.networkQuery) &&
        Objects.equals(this.processQuery, heatMapWidgetRequest.processQuery) &&
        Objects.equals(this.q, heatMapWidgetRequest.q) &&
        Objects.equals(this.rumQuery, heatMapWidgetRequest.rumQuery) &&
        Objects.equals(this.style, heatMapWidgetRequest.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apmQuery, eventQuery, logQuery, networkQuery, processQuery, q, rumQuery, style);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatMapWidgetRequest {\n");
    sb.append("    apmQuery: ").append(toIndentedString(apmQuery)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    logQuery: ").append(toIndentedString(logQuery)).append("\n");
    sb.append("    networkQuery: ").append(toIndentedString(networkQuery)).append("\n");
    sb.append("    processQuery: ").append(toIndentedString(processQuery)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    rumQuery: ").append(toIndentedString(rumQuery)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

