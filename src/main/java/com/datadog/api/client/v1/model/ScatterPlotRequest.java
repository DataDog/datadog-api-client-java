/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Updated scatter plot. */
@JsonPropertyOrder({
  ScatterPlotRequest.JSON_PROPERTY_AGGREGATOR,
  ScatterPlotRequest.JSON_PROPERTY_APM_QUERY,
  ScatterPlotRequest.JSON_PROPERTY_EVENT_QUERY,
  ScatterPlotRequest.JSON_PROPERTY_LOG_QUERY,
  ScatterPlotRequest.JSON_PROPERTY_NETWORK_QUERY,
  ScatterPlotRequest.JSON_PROPERTY_PROCESS_QUERY,
  ScatterPlotRequest.JSON_PROPERTY_PROFILE_METRICS_QUERY,
  ScatterPlotRequest.JSON_PROPERTY_Q,
  ScatterPlotRequest.JSON_PROPERTY_RUM_QUERY,
  ScatterPlotRequest.JSON_PROPERTY_SECURITY_QUERY
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterPlotRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private ScatterplotWidgetAggregator aggregator;

  public static final String JSON_PROPERTY_APM_QUERY = "apm_query";
  private LogQueryDefinition apmQuery;

  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private LogQueryDefinition eventQuery;

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

  public static final String JSON_PROPERTY_RUM_QUERY = "rum_query";
  private LogQueryDefinition rumQuery;

  public static final String JSON_PROPERTY_SECURITY_QUERY = "security_query";
  private LogQueryDefinition securityQuery;

  public ScatterPlotRequest aggregator(ScatterplotWidgetAggregator aggregator) {
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
  public ScatterplotWidgetAggregator getAggregator() {
    return aggregator;
  }

  public void setAggregator(ScatterplotWidgetAggregator aggregator) {
    if (!aggregator.isValid()) {
      this.unparsed = true;
    }
    this.aggregator = aggregator;
  }

  public ScatterPlotRequest apmQuery(LogQueryDefinition apmQuery) {
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

  public ScatterPlotRequest eventQuery(LogQueryDefinition eventQuery) {
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

  public ScatterPlotRequest logQuery(LogQueryDefinition logQuery) {
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

  public ScatterPlotRequest networkQuery(LogQueryDefinition networkQuery) {
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

  public ScatterPlotRequest processQuery(ProcessQueryDefinition processQuery) {
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

  public ScatterPlotRequest profileMetricsQuery(LogQueryDefinition profileMetricsQuery) {
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

  public ScatterPlotRequest q(String q) {
    this.q = q;
    return this;
  }

  /**
   * Query definition.
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

  public ScatterPlotRequest rumQuery(LogQueryDefinition rumQuery) {
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

  public ScatterPlotRequest securityQuery(LogQueryDefinition securityQuery) {
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

  /** Return true if this ScatterPlotRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterPlotRequest scatterPlotRequest = (ScatterPlotRequest) o;
    return Objects.equals(this.aggregator, scatterPlotRequest.aggregator)
        && Objects.equals(this.apmQuery, scatterPlotRequest.apmQuery)
        && Objects.equals(this.eventQuery, scatterPlotRequest.eventQuery)
        && Objects.equals(this.logQuery, scatterPlotRequest.logQuery)
        && Objects.equals(this.networkQuery, scatterPlotRequest.networkQuery)
        && Objects.equals(this.processQuery, scatterPlotRequest.processQuery)
        && Objects.equals(this.profileMetricsQuery, scatterPlotRequest.profileMetricsQuery)
        && Objects.equals(this.q, scatterPlotRequest.q)
        && Objects.equals(this.rumQuery, scatterPlotRequest.rumQuery)
        && Objects.equals(this.securityQuery, scatterPlotRequest.securityQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregator,
        apmQuery,
        eventQuery,
        logQuery,
        networkQuery,
        processQuery,
        profileMetricsQuery,
        q,
        rumQuery,
        securityQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterPlotRequest {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    apmQuery: ").append(toIndentedString(apmQuery)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    logQuery: ").append(toIndentedString(logQuery)).append("\n");
    sb.append("    networkQuery: ").append(toIndentedString(networkQuery)).append("\n");
    sb.append("    processQuery: ").append(toIndentedString(processQuery)).append("\n");
    sb.append("    profileMetricsQuery: ")
        .append(toIndentedString(profileMetricsQuery))
        .append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
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
