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

/** Updated table widget. */
@JsonPropertyOrder({
  TableWidgetRequest.JSON_PROPERTY_AGGREGATOR,
  TableWidgetRequest.JSON_PROPERTY_ALIAS,
  TableWidgetRequest.JSON_PROPERTY_APM_QUERY,
  TableWidgetRequest.JSON_PROPERTY_APM_STATS_QUERY,
  TableWidgetRequest.JSON_PROPERTY_CELL_DISPLAY_MODE,
  TableWidgetRequest.JSON_PROPERTY_CONDITIONAL_FORMATS,
  TableWidgetRequest.JSON_PROPERTY_EVENT_QUERY,
  TableWidgetRequest.JSON_PROPERTY_FORMULAS,
  TableWidgetRequest.JSON_PROPERTY_LIMIT,
  TableWidgetRequest.JSON_PROPERTY_LOG_QUERY,
  TableWidgetRequest.JSON_PROPERTY_NETWORK_QUERY,
  TableWidgetRequest.JSON_PROPERTY_ORDER,
  TableWidgetRequest.JSON_PROPERTY_PROCESS_QUERY,
  TableWidgetRequest.JSON_PROPERTY_PROFILE_METRICS_QUERY,
  TableWidgetRequest.JSON_PROPERTY_Q,
  TableWidgetRequest.JSON_PROPERTY_QUERIES,
  TableWidgetRequest.JSON_PROPERTY_RESPONSE_FORMAT,
  TableWidgetRequest.JSON_PROPERTY_RUM_QUERY,
  TableWidgetRequest.JSON_PROPERTY_SECURITY_QUERY,
  TableWidgetRequest.JSON_PROPERTY_SORT,
  TableWidgetRequest.JSON_PROPERTY_TEXT_FORMATS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableWidgetRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private WidgetAggregator aggregator;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_APM_QUERY = "apm_query";
  private LogQueryDefinition apmQuery;

  public static final String JSON_PROPERTY_APM_STATS_QUERY = "apm_stats_query";
  private ApmStatsQueryDefinition apmStatsQuery;

  public static final String JSON_PROPERTY_CELL_DISPLAY_MODE = "cell_display_mode";
  private List<TableWidgetCellDisplayMode> cellDisplayMode = null;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<WidgetConditionalFormat> conditionalFormats = null;

  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private LogQueryDefinition eventQuery;

  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<WidgetFormula> formulas = null;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_LOG_QUERY = "log_query";
  private LogQueryDefinition logQuery;

  public static final String JSON_PROPERTY_NETWORK_QUERY = "network_query";
  private LogQueryDefinition networkQuery;

  public static final String JSON_PROPERTY_ORDER = "order";
  private WidgetSort order;

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

  public static final String JSON_PROPERTY_SORT = "sort";
  private WidgetSortBy sort;

  public static final String JSON_PROPERTY_TEXT_FORMATS = "text_formats";
  private List<List<TableWidgetTextFormatRule>> textFormats = null;

  public TableWidgetRequest aggregator(WidgetAggregator aggregator) {
    this.aggregator = aggregator;
    this.unparsed |= !aggregator.isValid();
    return this;
  }

  /**
   * Aggregator used for the request.
   *
   * @return aggregator
   */
  @jakarta.annotation.Nullable
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

  public TableWidgetRequest alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * The column name (defaults to the metric name).
   *
   * @return alias
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public TableWidgetRequest apmQuery(LogQueryDefinition apmQuery) {
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

  public TableWidgetRequest apmStatsQuery(ApmStatsQueryDefinition apmStatsQuery) {
    this.apmStatsQuery = apmStatsQuery;
    this.unparsed |= apmStatsQuery.unparsed;
    return this;
  }

  /**
   * The APM stats query for table and distributions widgets.
   *
   * @return apmStatsQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_STATS_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApmStatsQueryDefinition getApmStatsQuery() {
    return apmStatsQuery;
  }

  public void setApmStatsQuery(ApmStatsQueryDefinition apmStatsQuery) {
    this.apmStatsQuery = apmStatsQuery;
  }

  public TableWidgetRequest cellDisplayMode(List<TableWidgetCellDisplayMode> cellDisplayMode) {
    this.cellDisplayMode = cellDisplayMode;
    return this;
  }

  public TableWidgetRequest addCellDisplayModeItem(TableWidgetCellDisplayMode cellDisplayModeItem) {
    if (this.cellDisplayMode == null) {
      this.cellDisplayMode = new ArrayList<>();
    }
    this.cellDisplayMode.add(cellDisplayModeItem);
    this.unparsed |= !cellDisplayModeItem.isValid();
    return this;
  }

  /**
   * A list of display modes for each table cell.
   *
   * @return cellDisplayMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELL_DISPLAY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TableWidgetCellDisplayMode> getCellDisplayMode() {
    return cellDisplayMode;
  }

  public void setCellDisplayMode(List<TableWidgetCellDisplayMode> cellDisplayMode) {
    this.cellDisplayMode = cellDisplayMode;
  }

  public TableWidgetRequest conditionalFormats(List<WidgetConditionalFormat> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    for (WidgetConditionalFormat item : conditionalFormats) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TableWidgetRequest addConditionalFormatsItem(
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetConditionalFormat> getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(List<WidgetConditionalFormat> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
  }

  public TableWidgetRequest eventQuery(LogQueryDefinition eventQuery) {
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

  public TableWidgetRequest formulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
    for (WidgetFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TableWidgetRequest addFormulasItem(WidgetFormula formulasItem) {
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

  public TableWidgetRequest limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * For metric queries, the number of lines to show in the table. Only one request should have this
   * property.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public TableWidgetRequest logQuery(LogQueryDefinition logQuery) {
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

  public TableWidgetRequest networkQuery(LogQueryDefinition networkQuery) {
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

  public TableWidgetRequest order(WidgetSort order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * Widget sorting methods.
   *
   * @return order
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetSort getOrder() {
    return order;
  }

  public void setOrder(WidgetSort order) {
    if (!order.isValid()) {
      this.unparsed = true;
    }
    this.order = order;
  }

  public TableWidgetRequest processQuery(ProcessQueryDefinition processQuery) {
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

  public TableWidgetRequest profileMetricsQuery(LogQueryDefinition profileMetricsQuery) {
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

  public TableWidgetRequest q(String q) {
    this.q = q;
    return this;
  }

  /**
   * Query definition.
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

  public TableWidgetRequest queries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TableWidgetRequest addQueriesItem(FormulaAndFunctionQueryDefinition queriesItem) {
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

  public TableWidgetRequest responseFormat(FormulaAndFunctionResponseFormat responseFormat) {
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

  public TableWidgetRequest rumQuery(LogQueryDefinition rumQuery) {
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

  public TableWidgetRequest securityQuery(LogQueryDefinition securityQuery) {
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

  public TableWidgetRequest sort(WidgetSortBy sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * The controls for sorting the widget.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetSortBy getSort() {
    return sort;
  }

  public void setSort(WidgetSortBy sort) {
    this.sort = sort;
  }

  public TableWidgetRequest textFormats(List<List<TableWidgetTextFormatRule>> textFormats) {
    this.textFormats = textFormats;
    return this;
  }

  public TableWidgetRequest addTextFormatsItem(List<TableWidgetTextFormatRule> textFormatsItem) {
    if (this.textFormats == null) {
      this.textFormats = new ArrayList<>();
    }
    this.textFormats.add(textFormatsItem);
    return this;
  }

  /**
   * List of text formats for columns produced by tags.
   *
   * @return textFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<List<TableWidgetTextFormatRule>> getTextFormats() {
    return textFormats;
  }

  public void setTextFormats(List<List<TableWidgetTextFormatRule>> textFormats) {
    this.textFormats = textFormats;
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
   * @return TableWidgetRequest
   */
  @JsonAnySetter
  public TableWidgetRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TableWidgetRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableWidgetRequest tableWidgetRequest = (TableWidgetRequest) o;
    return Objects.equals(this.aggregator, tableWidgetRequest.aggregator)
        && Objects.equals(this.alias, tableWidgetRequest.alias)
        && Objects.equals(this.apmQuery, tableWidgetRequest.apmQuery)
        && Objects.equals(this.apmStatsQuery, tableWidgetRequest.apmStatsQuery)
        && Objects.equals(this.cellDisplayMode, tableWidgetRequest.cellDisplayMode)
        && Objects.equals(this.conditionalFormats, tableWidgetRequest.conditionalFormats)
        && Objects.equals(this.eventQuery, tableWidgetRequest.eventQuery)
        && Objects.equals(this.formulas, tableWidgetRequest.formulas)
        && Objects.equals(this.limit, tableWidgetRequest.limit)
        && Objects.equals(this.logQuery, tableWidgetRequest.logQuery)
        && Objects.equals(this.networkQuery, tableWidgetRequest.networkQuery)
        && Objects.equals(this.order, tableWidgetRequest.order)
        && Objects.equals(this.processQuery, tableWidgetRequest.processQuery)
        && Objects.equals(this.profileMetricsQuery, tableWidgetRequest.profileMetricsQuery)
        && Objects.equals(this.q, tableWidgetRequest.q)
        && Objects.equals(this.queries, tableWidgetRequest.queries)
        && Objects.equals(this.responseFormat, tableWidgetRequest.responseFormat)
        && Objects.equals(this.rumQuery, tableWidgetRequest.rumQuery)
        && Objects.equals(this.securityQuery, tableWidgetRequest.securityQuery)
        && Objects.equals(this.sort, tableWidgetRequest.sort)
        && Objects.equals(this.textFormats, tableWidgetRequest.textFormats)
        && Objects.equals(this.additionalProperties, tableWidgetRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregator,
        alias,
        apmQuery,
        apmStatsQuery,
        cellDisplayMode,
        conditionalFormats,
        eventQuery,
        formulas,
        limit,
        logQuery,
        networkQuery,
        order,
        processQuery,
        profileMetricsQuery,
        q,
        queries,
        responseFormat,
        rumQuery,
        securityQuery,
        sort,
        textFormats,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableWidgetRequest {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    apmQuery: ").append(toIndentedString(apmQuery)).append("\n");
    sb.append("    apmStatsQuery: ").append(toIndentedString(apmStatsQuery)).append("\n");
    sb.append("    cellDisplayMode: ").append(toIndentedString(cellDisplayMode)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    logQuery: ").append(toIndentedString(logQuery)).append("\n");
    sb.append("    networkQuery: ").append(toIndentedString(networkQuery)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    processQuery: ").append(toIndentedString(processQuery)).append("\n");
    sb.append("    profileMetricsQuery: ")
        .append(toIndentedString(profileMetricsQuery))
        .append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    rumQuery: ").append(toIndentedString(rumQuery)).append("\n");
    sb.append("    securityQuery: ").append(toIndentedString(securityQuery)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    textFormats: ").append(toIndentedString(textFormats)).append("\n");
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
