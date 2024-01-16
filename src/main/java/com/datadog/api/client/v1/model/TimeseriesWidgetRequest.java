/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Updated timeseries widget. */
@JsonPropertyOrder({
  TimeseriesWidgetRequest.JSON_PROPERTY_APM_QUERY,
  TimeseriesWidgetRequest.JSON_PROPERTY_AUDIT_QUERY,
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
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesWidgetRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APM_QUERY = "apm_query";
  private LogQueryDefinition apmQuery;

  public static final String JSON_PROPERTY_AUDIT_QUERY = "audit_query";
  private LogQueryDefinition auditQuery;

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
    this.unparsed |= apmQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return apmQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogQueryDefinition getApmQuery() {
    return apmQuery;
  }

  public void setApmQuery(LogQueryDefinition apmQuery) {
    this.apmQuery = apmQuery;
  }

  public TimeseriesWidgetRequest auditQuery(LogQueryDefinition auditQuery) {
    this.auditQuery = auditQuery;
    this.unparsed |= auditQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return auditQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIT_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogQueryDefinition getAuditQuery() {
    return auditQuery;
  }

  public void setAuditQuery(LogQueryDefinition auditQuery) {
    this.auditQuery = auditQuery;
  }

  public TimeseriesWidgetRequest displayType(WidgetDisplayType displayType) {
    this.displayType = displayType;
    this.unparsed |= !displayType.isValid();
    return this;
  }

  /**
   * Type of display to use for the request.
   *
   * @return displayType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetDisplayType getDisplayType() {
    return displayType;
  }

  public void setDisplayType(WidgetDisplayType displayType) {
    if (!displayType.isValid()) {
      this.unparsed = true;
    }
    this.displayType = displayType;
  }

  public TimeseriesWidgetRequest eventQuery(LogQueryDefinition eventQuery) {
    this.eventQuery = eventQuery;
    this.unparsed |= eventQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return eventQuery
   */
  @jakarta.annotation.Nullable
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
    for (WidgetFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesWidgetRequest addFormulasItem(WidgetFormula formulasItem) {
    if (this.formulas == null) {
      this.formulas = new ArrayList<>();
    }
    this.formulas.add(formulasItem);
    this.unparsed |= formulasItem.unparsed;
    return this;
  }

  /**
   * List of formulas that operate on queries.
   *
   * @return formulas
   */
  @jakarta.annotation.Nullable
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
    this.unparsed |= logQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return logQuery
   */
  @jakarta.annotation.Nullable
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
    for (TimeseriesWidgetExpressionAlias item : metadata) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesWidgetRequest addMetadataItem(TimeseriesWidgetExpressionAlias metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    this.unparsed |= metadataItem.unparsed;
    return this;
  }

  /**
   * Used to define expression aliases.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
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
    this.unparsed |= networkQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return networkQuery
   */
  @jakarta.annotation.Nullable
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
   *
   * @return onRightYaxis
   */
  @jakarta.annotation.Nullable
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
    this.unparsed |= processQuery.unparsed;
    return this;
  }

  /**
   * The process query to use in the widget.
   *
   * @return processQuery
   */
  @jakarta.annotation.Nullable
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
    this.unparsed |= profileMetricsQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return profileMetricsQuery
   */
  @jakarta.annotation.Nullable
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
   *
   * @return q
   */
  @jakarta.annotation.Nullable
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
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesWidgetRequest addQueriesItem(FormulaAndFunctionQueryDefinition queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * List of queries that can be returned directly or used in formulas.
   *
   * @return queries
   */
  @jakarta.annotation.Nullable
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
    this.unparsed |= !responseFormat.isValid();
    return this;
  }

  /**
   * Timeseries, scalar, or event list response. Event list response formats are supported by Geomap
   * widgets.
   *
   * @return responseFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaAndFunctionResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(FormulaAndFunctionResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public TimeseriesWidgetRequest rumQuery(LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
    this.unparsed |= rumQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return rumQuery
   */
  @jakarta.annotation.Nullable
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
    this.unparsed |= securityQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return securityQuery
   */
  @jakarta.annotation.Nullable
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
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * Define request widget style.
   *
   * @return style
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetRequestStyle getStyle() {
    return style;
  }

  public void setStyle(WidgetRequestStyle style) {
    this.style = style;
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
   * @return TimeseriesWidgetRequest
   */
  @JsonAnySetter
  public TimeseriesWidgetRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TimeseriesWidgetRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesWidgetRequest timeseriesWidgetRequest = (TimeseriesWidgetRequest) o;
    return Objects.equals(this.apmQuery, timeseriesWidgetRequest.apmQuery)
        && Objects.equals(this.auditQuery, timeseriesWidgetRequest.auditQuery)
        && Objects.equals(this.displayType, timeseriesWidgetRequest.displayType)
        && Objects.equals(this.eventQuery, timeseriesWidgetRequest.eventQuery)
        && Objects.equals(this.formulas, timeseriesWidgetRequest.formulas)
        && Objects.equals(this.logQuery, timeseriesWidgetRequest.logQuery)
        && Objects.equals(this.metadata, timeseriesWidgetRequest.metadata)
        && Objects.equals(this.networkQuery, timeseriesWidgetRequest.networkQuery)
        && Objects.equals(this.onRightYaxis, timeseriesWidgetRequest.onRightYaxis)
        && Objects.equals(this.processQuery, timeseriesWidgetRequest.processQuery)
        && Objects.equals(this.profileMetricsQuery, timeseriesWidgetRequest.profileMetricsQuery)
        && Objects.equals(this.q, timeseriesWidgetRequest.q)
        && Objects.equals(this.queries, timeseriesWidgetRequest.queries)
        && Objects.equals(this.responseFormat, timeseriesWidgetRequest.responseFormat)
        && Objects.equals(this.rumQuery, timeseriesWidgetRequest.rumQuery)
        && Objects.equals(this.securityQuery, timeseriesWidgetRequest.securityQuery)
        && Objects.equals(this.style, timeseriesWidgetRequest.style)
        && Objects.equals(this.additionalProperties, timeseriesWidgetRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apmQuery,
        auditQuery,
        displayType,
        eventQuery,
        formulas,
        logQuery,
        metadata,
        networkQuery,
        onRightYaxis,
        processQuery,
        profileMetricsQuery,
        q,
        queries,
        responseFormat,
        rumQuery,
        securityQuery,
        style,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesWidgetRequest {\n");
    sb.append("    apmQuery: ").append(toIndentedString(apmQuery)).append("\n");
    sb.append("    auditQuery: ").append(toIndentedString(auditQuery)).append("\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    logQuery: ").append(toIndentedString(logQuery)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    networkQuery: ").append(toIndentedString(networkQuery)).append("\n");
    sb.append("    onRightYaxis: ").append(toIndentedString(onRightYaxis)).append("\n");
    sb.append("    processQuery: ").append(toIndentedString(processQuery)).append("\n");
    sb.append("    profileMetricsQuery: ")
        .append(toIndentedString(profileMetricsQuery))
        .append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    rumQuery: ").append(toIndentedString(rumQuery)).append("\n");
    sb.append("    securityQuery: ").append(toIndentedString(securityQuery)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
