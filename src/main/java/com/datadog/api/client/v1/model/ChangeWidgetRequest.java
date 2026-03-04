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

/** Updated change widget. */
@JsonPropertyOrder({
  ChangeWidgetRequest.JSON_PROPERTY_APM_QUERY,
  ChangeWidgetRequest.JSON_PROPERTY_CHANGE_TYPE,
  ChangeWidgetRequest.JSON_PROPERTY_COMPARE_TO,
  ChangeWidgetRequest.JSON_PROPERTY_EVENT_QUERY,
  ChangeWidgetRequest.JSON_PROPERTY_FORMULAS,
  ChangeWidgetRequest.JSON_PROPERTY_INCREASE_GOOD,
  ChangeWidgetRequest.JSON_PROPERTY_LOG_QUERY,
  ChangeWidgetRequest.JSON_PROPERTY_NETWORK_QUERY,
  ChangeWidgetRequest.JSON_PROPERTY_ORDER_BY,
  ChangeWidgetRequest.JSON_PROPERTY_ORDER_DIR,
  ChangeWidgetRequest.JSON_PROPERTY_PROCESS_QUERY,
  ChangeWidgetRequest.JSON_PROPERTY_PROFILE_METRICS_QUERY,
  ChangeWidgetRequest.JSON_PROPERTY_Q,
  ChangeWidgetRequest.JSON_PROPERTY_QUERIES,
  ChangeWidgetRequest.JSON_PROPERTY_RESPONSE_FORMAT,
  ChangeWidgetRequest.JSON_PROPERTY_RUM_QUERY,
  ChangeWidgetRequest.JSON_PROPERTY_SECURITY_QUERY,
  ChangeWidgetRequest.JSON_PROPERTY_SHOW_PRESENT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeWidgetRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APM_QUERY = "apm_query";
  private LogQueryDefinition apmQuery;

  public static final String JSON_PROPERTY_CHANGE_TYPE = "change_type";
  private WidgetChangeType changeType;

  public static final String JSON_PROPERTY_COMPARE_TO = "compare_to";
  private WidgetCompareTo compareTo;

  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private LogQueryDefinition eventQuery;

  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<WidgetFormula> formulas = null;

  public static final String JSON_PROPERTY_INCREASE_GOOD = "increase_good";
  private Boolean increaseGood;

  public static final String JSON_PROPERTY_LOG_QUERY = "log_query";
  private LogQueryDefinition logQuery;

  public static final String JSON_PROPERTY_NETWORK_QUERY = "network_query";
  private LogQueryDefinition networkQuery;

  public static final String JSON_PROPERTY_ORDER_BY = "order_by";
  private WidgetOrderBy orderBy;

  public static final String JSON_PROPERTY_ORDER_DIR = "order_dir";
  private WidgetSort orderDir;

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

  public static final String JSON_PROPERTY_SHOW_PRESENT = "show_present";
  private Boolean showPresent;

  public ChangeWidgetRequest apmQuery(LogQueryDefinition apmQuery) {
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

  public ChangeWidgetRequest changeType(WidgetChangeType changeType) {
    this.changeType = changeType;
    this.unparsed |= !changeType.isValid();
    return this;
  }

  /**
   * Show the absolute or the relative change.
   *
   * @return changeType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetChangeType getChangeType() {
    return changeType;
  }

  public void setChangeType(WidgetChangeType changeType) {
    if (!changeType.isValid()) {
      this.unparsed = true;
    }
    this.changeType = changeType;
  }

  public ChangeWidgetRequest compareTo(WidgetCompareTo compareTo) {
    this.compareTo = compareTo;
    this.unparsed |= !compareTo.isValid();
    return this;
  }

  /**
   * Timeframe used for the change comparison.
   *
   * @return compareTo
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetCompareTo getCompareTo() {
    return compareTo;
  }

  public void setCompareTo(WidgetCompareTo compareTo) {
    if (!compareTo.isValid()) {
      this.unparsed = true;
    }
    this.compareTo = compareTo;
  }

  public ChangeWidgetRequest eventQuery(LogQueryDefinition eventQuery) {
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

  public ChangeWidgetRequest formulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
    for (WidgetFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ChangeWidgetRequest addFormulasItem(WidgetFormula formulasItem) {
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

  public ChangeWidgetRequest increaseGood(Boolean increaseGood) {
    this.increaseGood = increaseGood;
    return this;
  }

  /**
   * Whether to show increase as good.
   *
   * @return increaseGood
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCREASE_GOOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncreaseGood() {
    return increaseGood;
  }

  public void setIncreaseGood(Boolean increaseGood) {
    this.increaseGood = increaseGood;
  }

  public ChangeWidgetRequest logQuery(LogQueryDefinition logQuery) {
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

  public ChangeWidgetRequest networkQuery(LogQueryDefinition networkQuery) {
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

  public ChangeWidgetRequest orderBy(WidgetOrderBy orderBy) {
    this.orderBy = orderBy;
    this.unparsed |= !orderBy.isValid();
    return this;
  }

  /**
   * What to order by.
   *
   * @return orderBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetOrderBy getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(WidgetOrderBy orderBy) {
    if (!orderBy.isValid()) {
      this.unparsed = true;
    }
    this.orderBy = orderBy;
  }

  public ChangeWidgetRequest orderDir(WidgetSort orderDir) {
    this.orderDir = orderDir;
    this.unparsed |= !orderDir.isValid();
    return this;
  }

  /**
   * Widget sorting methods.
   *
   * @return orderDir
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_DIR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetSort getOrderDir() {
    return orderDir;
  }

  public void setOrderDir(WidgetSort orderDir) {
    if (!orderDir.isValid()) {
      this.unparsed = true;
    }
    this.orderDir = orderDir;
  }

  public ChangeWidgetRequest processQuery(ProcessQueryDefinition processQuery) {
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

  public ChangeWidgetRequest profileMetricsQuery(LogQueryDefinition profileMetricsQuery) {
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

  public ChangeWidgetRequest q(String q) {
    this.q = q;
    return this;
  }

  /**
   * Query definition. Deprecated - Use <code>queries</code> and <code>formulas</code> instead.
   *
   * @return q
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQ() {
    return q;
  }

  @Deprecated
  public void setQ(String q) {
    this.q = q;
  }

  public ChangeWidgetRequest queries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ChangeWidgetRequest addQueriesItem(FormulaAndFunctionQueryDefinition queriesItem) {
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

  public ChangeWidgetRequest responseFormat(FormulaAndFunctionResponseFormat responseFormat) {
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

  public ChangeWidgetRequest rumQuery(LogQueryDefinition rumQuery) {
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

  public ChangeWidgetRequest securityQuery(LogQueryDefinition securityQuery) {
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

  public ChangeWidgetRequest showPresent(Boolean showPresent) {
    this.showPresent = showPresent;
    return this;
  }

  /**
   * Whether to show the present value.
   *
   * @return showPresent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_PRESENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowPresent() {
    return showPresent;
  }

  public void setShowPresent(Boolean showPresent) {
    this.showPresent = showPresent;
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
   * @return ChangeWidgetRequest
   */
  @JsonAnySetter
  public ChangeWidgetRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ChangeWidgetRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeWidgetRequest changeWidgetRequest = (ChangeWidgetRequest) o;
    return Objects.equals(this.apmQuery, changeWidgetRequest.apmQuery)
        && Objects.equals(this.changeType, changeWidgetRequest.changeType)
        && Objects.equals(this.compareTo, changeWidgetRequest.compareTo)
        && Objects.equals(this.eventQuery, changeWidgetRequest.eventQuery)
        && Objects.equals(this.formulas, changeWidgetRequest.formulas)
        && Objects.equals(this.increaseGood, changeWidgetRequest.increaseGood)
        && Objects.equals(this.logQuery, changeWidgetRequest.logQuery)
        && Objects.equals(this.networkQuery, changeWidgetRequest.networkQuery)
        && Objects.equals(this.orderBy, changeWidgetRequest.orderBy)
        && Objects.equals(this.orderDir, changeWidgetRequest.orderDir)
        && Objects.equals(this.processQuery, changeWidgetRequest.processQuery)
        && Objects.equals(this.profileMetricsQuery, changeWidgetRequest.profileMetricsQuery)
        && Objects.equals(this.q, changeWidgetRequest.q)
        && Objects.equals(this.queries, changeWidgetRequest.queries)
        && Objects.equals(this.responseFormat, changeWidgetRequest.responseFormat)
        && Objects.equals(this.rumQuery, changeWidgetRequest.rumQuery)
        && Objects.equals(this.securityQuery, changeWidgetRequest.securityQuery)
        && Objects.equals(this.showPresent, changeWidgetRequest.showPresent)
        && Objects.equals(this.additionalProperties, changeWidgetRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apmQuery,
        changeType,
        compareTo,
        eventQuery,
        formulas,
        increaseGood,
        logQuery,
        networkQuery,
        orderBy,
        orderDir,
        processQuery,
        profileMetricsQuery,
        q,
        queries,
        responseFormat,
        rumQuery,
        securityQuery,
        showPresent,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeWidgetRequest {\n");
    sb.append("    apmQuery: ").append(toIndentedString(apmQuery)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    compareTo: ").append(toIndentedString(compareTo)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    increaseGood: ").append(toIndentedString(increaseGood)).append("\n");
    sb.append("    logQuery: ").append(toIndentedString(logQuery)).append("\n");
    sb.append("    networkQuery: ").append(toIndentedString(networkQuery)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    orderDir: ").append(toIndentedString(orderDir)).append("\n");
    sb.append("    processQuery: ").append(toIndentedString(processQuery)).append("\n");
    sb.append("    profileMetricsQuery: ")
        .append(toIndentedString(profileMetricsQuery))
        .append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    rumQuery: ").append(toIndentedString(rumQuery)).append("\n");
    sb.append("    securityQuery: ").append(toIndentedString(securityQuery)).append("\n");
    sb.append("    showPresent: ").append(toIndentedString(showPresent)).append("\n");
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
