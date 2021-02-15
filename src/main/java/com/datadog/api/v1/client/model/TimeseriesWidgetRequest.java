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
import com.datadog.api.v1.client.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.v1.client.model.LogQueryDefinition;
import com.datadog.api.v1.client.model.ProcessQueryDefinition;
import com.datadog.api.v1.client.model.TimeseriesWidgetExpressionAlias;
import com.datadog.api.v1.client.model.WidgetDisplayType;
import com.datadog.api.v1.client.model.WidgetFormula;
import com.datadog.api.v1.client.model.WidgetRequestStyle;
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
 * Updated timeseries widget.
 */
@ApiModel(description = "Updated timeseries widget.")
@JsonPropertyOrder({
  TimeseriesWidgetRequest.JSON_PROPERTY_APM_QUERY,
  TimeseriesWidgetRequest.JSON_PROPERTY_DISPLAY_TYPE,
  TimeseriesWidgetRequest.JSON_PROPERTY_EVENT_QUERY,
  TimeseriesWidgetRequest.JSON_PROPERTY_FORMULAS,
  TimeseriesWidgetRequest.JSON_PROPERTY_LOG_QUERY,
  TimeseriesWidgetRequest.JSON_PROPERTY_METADATA,
  TimeseriesWidgetRequest.JSON_PROPERTY_NETWORK_QUERY,
  TimeseriesWidgetRequest.JSON_PROPERTY_ON_RIGHT_YAXIS,
  TimeseriesWidgetRequest.JSON_PROPERTY_PROCESS_QUERY,
  TimeseriesWidgetRequest.JSON_PROPERTY_PROFILE_METRICS_QUERY,
  TimeseriesWidgetRequest.JSON_PROPERTY_Q,
  TimeseriesWidgetRequest.JSON_PROPERTY_QUERIES,
  TimeseriesWidgetRequest.JSON_PROPERTY_RESPONSE_FORMAT,
  TimeseriesWidgetRequest.JSON_PROPERTY_RUM_QUERY,
  TimeseriesWidgetRequest.JSON_PROPERTY_SECURITY_QUERY,
  TimeseriesWidgetRequest.JSON_PROPERTY_STYLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TimeseriesWidgetRequest {
  public static final String JSON_PROPERTY_APM_QUERY = "apm_query";
  private LogQueryDefinition apmQuery;

  public static final String JSON_PROPERTY_DISPLAY_TYPE = "display_type";
  private WidgetDisplayType displayType;

  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private LogQueryDefinition eventQuery;

  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<WidgetFormula> formulas = null;

  public static final String JSON_PROPERTY_LOG_QUERY = "log_query";
  private LogQueryDefinition logQuery;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private List<TimeseriesWidgetExpressionAlias> metadata = null;

  public static final String JSON_PROPERTY_NETWORK_QUERY = "network_query";
  private LogQueryDefinition networkQuery;

  public static final String JSON_PROPERTY_ON_RIGHT_YAXIS = "on_right_yaxis";
  private Boolean onRightYaxis;

  public static final String JSON_PROPERTY_PROCESS_QUERY = "process_query";
  private ProcessQueryDefinition processQuery;

  public static final String JSON_PROPERTY_PROFILE_METRICS_QUERY = "profile_metrics_query";
  private LogQueryDefinition profileMetricsQuery;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<FormulaAndFunctionQueryDefinition> queries = null;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private FormulaAndFunctionResponseFormat responseFormat;

  public static final String JSON_PROPERTY_RUM_QUERY = "rum_query";
  private LogQueryDefinition rumQuery;

  public static final String JSON_PROPERTY_SECURITY_QUERY = "security_query";
  private LogQueryDefinition securityQuery;

  public static final String JSON_PROPERTY_STYLE = "style";
  private WidgetRequestStyle style;


  public TimeseriesWidgetRequest apmQuery(LogQueryDefinition apmQuery) {
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


  public TimeseriesWidgetRequest displayType(WidgetDisplayType displayType) {
    this.displayType = displayType;
    return this;
  }

   /**
   * Get displayType
   * @return displayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetDisplayType getDisplayType() {
    return displayType;
  }


  public void setDisplayType(WidgetDisplayType displayType) {
    this.displayType = displayType;
  }


  public TimeseriesWidgetRequest eventQuery(LogQueryDefinition eventQuery) {
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

  public LogQueryDefinition getEventQuery() {
    return eventQuery;
  }


  public void setEventQuery(LogQueryDefinition eventQuery) {
    this.eventQuery = eventQuery;
  }


  public TimeseriesWidgetRequest formulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
    return this;
  }

  public TimeseriesWidgetRequest addFormulasItem(WidgetFormula formulasItem) {
    if (this.formulas == null) {
      this.formulas = new ArrayList<>();
    }
    this.formulas.add(formulasItem);
    return this;
  }

   /**
   * List of formulas that operate on queries. This feature is currently in beta.
   * @return formulas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of formulas that operate on queries. This feature is currently in beta.")
  @JsonProperty(JSON_PROPERTY_FORMULAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WidgetFormula> getFormulas() {
    return formulas;
  }


  public void setFormulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
  }


  public TimeseriesWidgetRequest logQuery(LogQueryDefinition logQuery) {
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


  public TimeseriesWidgetRequest metadata(List<TimeseriesWidgetExpressionAlias> metadata) {
    this.metadata = metadata;
    return this;
  }

  public TimeseriesWidgetRequest addMetadataItem(TimeseriesWidgetExpressionAlias metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Used to define expression aliases.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to define expression aliases.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TimeseriesWidgetExpressionAlias> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<TimeseriesWidgetExpressionAlias> metadata) {
    this.metadata = metadata;
  }


  public TimeseriesWidgetRequest networkQuery(LogQueryDefinition networkQuery) {
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


  public TimeseriesWidgetRequest onRightYaxis(Boolean onRightYaxis) {
    this.onRightYaxis = onRightYaxis;
    return this;
  }

   /**
   * Whether or not to display a second y-axis on the right.
   * @return onRightYaxis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not to display a second y-axis on the right.")
  @JsonProperty(JSON_PROPERTY_ON_RIGHT_YAXIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnRightYaxis() {
    return onRightYaxis;
  }


  public void setOnRightYaxis(Boolean onRightYaxis) {
    this.onRightYaxis = onRightYaxis;
  }


  public TimeseriesWidgetRequest processQuery(ProcessQueryDefinition processQuery) {
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


  public TimeseriesWidgetRequest profileMetricsQuery(LogQueryDefinition profileMetricsQuery) {
    this.profileMetricsQuery = profileMetricsQuery;
    return this;
  }

   /**
   * Get profileMetricsQuery
   * @return profileMetricsQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFILE_METRICS_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getProfileMetricsQuery() {
    return profileMetricsQuery;
  }


  public void setProfileMetricsQuery(LogQueryDefinition profileMetricsQuery) {
    this.profileMetricsQuery = profileMetricsQuery;
  }


  public TimeseriesWidgetRequest q(String q) {
    this.q = q;
    return this;
  }

   /**
   * Widget query.
   * @return q
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Widget query.")
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQ() {
    return q;
  }


  public void setQ(String q) {
    this.q = q;
  }


  public TimeseriesWidgetRequest queries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    return this;
  }

  public TimeseriesWidgetRequest addQueriesItem(FormulaAndFunctionQueryDefinition queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * List of queries that can be returned directly or used in formulas. This feature is currently in beta.
   * @return queries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of queries that can be returned directly or used in formulas. This feature is currently in beta.")
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FormulaAndFunctionQueryDefinition> getQueries() {
    return queries;
  }


  public void setQueries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
  }


  public TimeseriesWidgetRequest responseFormat(FormulaAndFunctionResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * Get responseFormat
   * @return responseFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormulaAndFunctionResponseFormat getResponseFormat() {
    return responseFormat;
  }


  public void setResponseFormat(FormulaAndFunctionResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
  }


  public TimeseriesWidgetRequest rumQuery(LogQueryDefinition rumQuery) {
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


  public TimeseriesWidgetRequest securityQuery(LogQueryDefinition securityQuery) {
    this.securityQuery = securityQuery;
    return this;
  }

   /**
   * Get securityQuery
   * @return securityQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getSecurityQuery() {
    return securityQuery;
  }


  public void setSecurityQuery(LogQueryDefinition securityQuery) {
    this.securityQuery = securityQuery;
  }


  public TimeseriesWidgetRequest style(WidgetRequestStyle style) {
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

  public WidgetRequestStyle getStyle() {
    return style;
  }


  public void setStyle(WidgetRequestStyle style) {
    this.style = style;
  }


  /**
   * Return true if this TimeseriesWidgetRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesWidgetRequest timeseriesWidgetRequest = (TimeseriesWidgetRequest) o;
    return Objects.equals(this.apmQuery, timeseriesWidgetRequest.apmQuery) &&
        Objects.equals(this.displayType, timeseriesWidgetRequest.displayType) &&
        Objects.equals(this.eventQuery, timeseriesWidgetRequest.eventQuery) &&
        Objects.equals(this.formulas, timeseriesWidgetRequest.formulas) &&
        Objects.equals(this.logQuery, timeseriesWidgetRequest.logQuery) &&
        Objects.equals(this.metadata, timeseriesWidgetRequest.metadata) &&
        Objects.equals(this.networkQuery, timeseriesWidgetRequest.networkQuery) &&
        Objects.equals(this.onRightYaxis, timeseriesWidgetRequest.onRightYaxis) &&
        Objects.equals(this.processQuery, timeseriesWidgetRequest.processQuery) &&
        Objects.equals(this.profileMetricsQuery, timeseriesWidgetRequest.profileMetricsQuery) &&
        Objects.equals(this.q, timeseriesWidgetRequest.q) &&
        Objects.equals(this.queries, timeseriesWidgetRequest.queries) &&
        Objects.equals(this.responseFormat, timeseriesWidgetRequest.responseFormat) &&
        Objects.equals(this.rumQuery, timeseriesWidgetRequest.rumQuery) &&
        Objects.equals(this.securityQuery, timeseriesWidgetRequest.securityQuery) &&
        Objects.equals(this.style, timeseriesWidgetRequest.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apmQuery, displayType, eventQuery, formulas, logQuery, metadata, networkQuery, onRightYaxis, processQuery, profileMetricsQuery, q, queries, responseFormat, rumQuery, securityQuery, style);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesWidgetRequest {\n");
    sb.append("    apmQuery: ").append(toIndentedString(apmQuery)).append("\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    logQuery: ").append(toIndentedString(logQuery)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    networkQuery: ").append(toIndentedString(networkQuery)).append("\n");
    sb.append("    onRightYaxis: ").append(toIndentedString(onRightYaxis)).append("\n");
    sb.append("    processQuery: ").append(toIndentedString(processQuery)).append("\n");
    sb.append("    profileMetricsQuery: ").append(toIndentedString(profileMetricsQuery)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    rumQuery: ").append(toIndentedString(rumQuery)).append("\n");
    sb.append("    securityQuery: ").append(toIndentedString(securityQuery)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

