/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Updated query value widget. */
@JsonPropertyOrder({
  QueryValueWidgetRequest.JSON_PROPERTY_AGGREGATOR,
  QueryValueWidgetRequest.JSON_PROPERTY_APM_QUERY,
  QueryValueWidgetRequest.JSON_PROPERTY_AUDIT_QUERY,
  QueryValueWidgetRequest.JSON_PROPERTY_CONDITIONAL_FORMATS,
  QueryValueWidgetRequest.JSON_PROPERTY_EVENT_QUERY,
  QueryValueWidgetRequest.JSON_PROPERTY_FORMULAS,
  QueryValueWidgetRequest.JSON_PROPERTY_LOG_QUERY,
  QueryValueWidgetRequest.JSON_PROPERTY_NETWORK_QUERY,
  QueryValueWidgetRequest.JSON_PROPERTY_PROCESS_QUERY,
  QueryValueWidgetRequest.JSON_PROPERTY_PROFILE_METRICS_QUERY,
  QueryValueWidgetRequest.JSON_PROPERTY_Q,
  QueryValueWidgetRequest.JSON_PROPERTY_QUERIES,
  QueryValueWidgetRequest.JSON_PROPERTY_RESPONSE_FORMAT,
  QueryValueWidgetRequest.JSON_PROPERTY_RUM_QUERY,
  QueryValueWidgetRequest.JSON_PROPERTY_SECURITY_QUERY
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryValueWidgetRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private WidgetAggregator aggregator;

  public static final String JSON_PROPERTY_APM_QUERY = "apm_query";
  private LogQueryDefinition apmQuery;

  public static final String JSON_PROPERTY_AUDIT_QUERY = "audit_query";
  private LogQueryDefinition auditQuery;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<WidgetConditionalFormat> conditionalFormats = null;

  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private LogQueryDefinition eventQuery;

  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<WidgetFormula> formulas = null;

  public static final String JSON_PROPERTY_LOG_QUERY = "log_query";
  private LogQueryDefinition logQuery;

  public static final String JSON_PROPERTY_NETWORK_QUERY = "network_query";
  private LogQueryDefinition networkQuery;

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

  public QueryValueWidgetRequest aggregator(WidgetAggregator aggregator) {
    this.aggregator = aggregator;
    this.unparsed |= !aggregator.isValid();
    return this;
  }

  /**
   * Aggregator used for the request.
   *
   * @return aggregator
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetAggregator getAggregator() {
    return aggregator;
  }

  public void setAggregator(WidgetAggregator aggregator) {
    if (!aggregator.isValid()) {
      this.unparsed = true;
    }
    this.aggregator = aggregator;
  }

  public QueryValueWidgetRequest apmQuery(LogQueryDefinition apmQuery) {
    this.apmQuery = apmQuery;
    this.unparsed |= apmQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return apmQuery
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogQueryDefinition getApmQuery() {
    return apmQuery;
  }

  public void setApmQuery(LogQueryDefinition apmQuery) {
    this.apmQuery = apmQuery;
  }

  public QueryValueWidgetRequest auditQuery(LogQueryDefinition auditQuery) {
    this.auditQuery = auditQuery;
    this.unparsed |= auditQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return auditQuery
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIT_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogQueryDefinition getAuditQuery() {
    return auditQuery;
  }

  public void setAuditQuery(LogQueryDefinition auditQuery) {
    this.auditQuery = auditQuery;
  }

  public QueryValueWidgetRequest conditionalFormats(
      List<WidgetConditionalFormat> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    for (WidgetConditionalFormat item : conditionalFormats) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public QueryValueWidgetRequest addConditionalFormatsItem(
      WidgetConditionalFormat conditionalFormatsItem) {
    if (this.conditionalFormats == null) {
      this.conditionalFormats = new ArrayList<>();
    }
    this.conditionalFormats.add(conditionalFormatsItem);
    this.unparsed |= conditionalFormatsItem.unparsed;
    return this;
  }

  /**
   * List of conditional formats.
   *
   * @return conditionalFormats
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetConditionalFormat> getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(List<WidgetConditionalFormat> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
  }

  public QueryValueWidgetRequest eventQuery(LogQueryDefinition eventQuery) {
    this.eventQuery = eventQuery;
    this.unparsed |= eventQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return eventQuery
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogQueryDefinition getEventQuery() {
    return eventQuery;
  }

  public void setEventQuery(LogQueryDefinition eventQuery) {
    this.eventQuery = eventQuery;
  }

  public QueryValueWidgetRequest formulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
    for (WidgetFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public QueryValueWidgetRequest addFormulasItem(WidgetFormula formulasItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMULAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetFormula> getFormulas() {
    return formulas;
  }

  public void setFormulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
  }

  public QueryValueWidgetRequest logQuery(LogQueryDefinition logQuery) {
    this.logQuery = logQuery;
    this.unparsed |= logQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return logQuery
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOG_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogQueryDefinition getLogQuery() {
    return logQuery;
  }

  public void setLogQuery(LogQueryDefinition logQuery) {
    this.logQuery = logQuery;
  }

  public QueryValueWidgetRequest networkQuery(LogQueryDefinition networkQuery) {
    this.networkQuery = networkQuery;
    this.unparsed |= networkQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return networkQuery
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogQueryDefinition getNetworkQuery() {
    return networkQuery;
  }

  public void setNetworkQuery(LogQueryDefinition networkQuery) {
    this.networkQuery = networkQuery;
  }

  public QueryValueWidgetRequest processQuery(ProcessQueryDefinition processQuery) {
    this.processQuery = processQuery;
    this.unparsed |= processQuery.unparsed;
    return this;
  }

  /**
   * The process query to use in the widget.
   *
   * @return processQuery
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESS_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProcessQueryDefinition getProcessQuery() {
    return processQuery;
  }

  public void setProcessQuery(ProcessQueryDefinition processQuery) {
    this.processQuery = processQuery;
  }

  public QueryValueWidgetRequest profileMetricsQuery(LogQueryDefinition profileMetricsQuery) {
    this.profileMetricsQuery = profileMetricsQuery;
    this.unparsed |= profileMetricsQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return profileMetricsQuery
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILE_METRICS_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogQueryDefinition getProfileMetricsQuery() {
    return profileMetricsQuery;
  }

  public void setProfileMetricsQuery(LogQueryDefinition profileMetricsQuery) {
    this.profileMetricsQuery = profileMetricsQuery;
  }

  public QueryValueWidgetRequest q(String q) {
    this.q = q;
    return this;
  }

  /**
   * TODO.
   *
   * @return q
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }

  public QueryValueWidgetRequest queries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public QueryValueWidgetRequest addQueriesItem(FormulaAndFunctionQueryDefinition queriesItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FormulaAndFunctionQueryDefinition> getQueries() {
    return queries;
  }

  public void setQueries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
  }

  public QueryValueWidgetRequest responseFormat(FormulaAndFunctionResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
    return this;
  }

  /**
   * Timeseries or Scalar response.
   *
   * @return responseFormat
   */
  @javax.annotation.Nullable
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

  public QueryValueWidgetRequest rumQuery(LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
    this.unparsed |= rumQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return rumQuery
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogQueryDefinition getRumQuery() {
    return rumQuery;
  }

  public void setRumQuery(LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
  }

  public QueryValueWidgetRequest securityQuery(LogQueryDefinition securityQuery) {
    this.securityQuery = securityQuery;
    this.unparsed |= securityQuery.unparsed;
    return this;
  }

  /**
   * The log query.
   *
   * @return securityQuery
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECURITY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogQueryDefinition getSecurityQuery() {
    return securityQuery;
  }

  public void setSecurityQuery(LogQueryDefinition securityQuery) {
    this.securityQuery = securityQuery;
  }

  /** Return true if this QueryValueWidgetRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryValueWidgetRequest queryValueWidgetRequest = (QueryValueWidgetRequest) o;
    return Objects.equals(this.aggregator, queryValueWidgetRequest.aggregator)
        && Objects.equals(this.apmQuery, queryValueWidgetRequest.apmQuery)
        && Objects.equals(this.auditQuery, queryValueWidgetRequest.auditQuery)
        && Objects.equals(this.conditionalFormats, queryValueWidgetRequest.conditionalFormats)
        && Objects.equals(this.eventQuery, queryValueWidgetRequest.eventQuery)
        && Objects.equals(this.formulas, queryValueWidgetRequest.formulas)
        && Objects.equals(this.logQuery, queryValueWidgetRequest.logQuery)
        && Objects.equals(this.networkQuery, queryValueWidgetRequest.networkQuery)
        && Objects.equals(this.processQuery, queryValueWidgetRequest.processQuery)
        && Objects.equals(this.profileMetricsQuery, queryValueWidgetRequest.profileMetricsQuery)
        && Objects.equals(this.q, queryValueWidgetRequest.q)
        && Objects.equals(this.queries, queryValueWidgetRequest.queries)
        && Objects.equals(this.responseFormat, queryValueWidgetRequest.responseFormat)
        && Objects.equals(this.rumQuery, queryValueWidgetRequest.rumQuery)
        && Objects.equals(this.securityQuery, queryValueWidgetRequest.securityQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregator,
        apmQuery,
        auditQuery,
        conditionalFormats,
        eventQuery,
        formulas,
        logQuery,
        networkQuery,
        processQuery,
        profileMetricsQuery,
        q,
        queries,
        responseFormat,
        rumQuery,
        securityQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryValueWidgetRequest {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    apmQuery: ").append(toIndentedString(apmQuery)).append("\n");
    sb.append("    auditQuery: ").append(toIndentedString(auditQuery)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    logQuery: ").append(toIndentedString(logQuery)).append("\n");
    sb.append("    networkQuery: ").append(toIndentedString(networkQuery)).append("\n");
    sb.append("    processQuery: ").append(toIndentedString(processQuery)).append("\n");
    sb.append("    profileMetricsQuery: ")
        .append(toIndentedString(profileMetricsQuery))
        .append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    rumQuery: ").append(toIndentedString(rumQuery)).append("\n");
    sb.append("    securityQuery: ").append(toIndentedString(securityQuery)).append("\n");
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
