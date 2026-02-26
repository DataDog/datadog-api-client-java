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
import java.util.UUID;
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
   * <p>Updated distribution widget.</p>
 */
@JsonPropertyOrder({
  DistributionWidgetRequest.JSON_PROPERTY_APM_QUERY,
  DistributionWidgetRequest.JSON_PROPERTY_APM_STATS_QUERY,
  DistributionWidgetRequest.JSON_PROPERTY_EVENT_QUERY,
  DistributionWidgetRequest.JSON_PROPERTY_FORMULAS,
  DistributionWidgetRequest.JSON_PROPERTY_LOG_QUERY,
  DistributionWidgetRequest.JSON_PROPERTY_NETWORK_QUERY,
  DistributionWidgetRequest.JSON_PROPERTY_PROCESS_QUERY,
  DistributionWidgetRequest.JSON_PROPERTY_PROFILE_METRICS_QUERY,
  DistributionWidgetRequest.JSON_PROPERTY_Q,
  DistributionWidgetRequest.JSON_PROPERTY_QUERIES,
  DistributionWidgetRequest.JSON_PROPERTY_QUERY,
  DistributionWidgetRequest.JSON_PROPERTY_REQUEST_TYPE,
  DistributionWidgetRequest.JSON_PROPERTY_RESPONSE_FORMAT,
  DistributionWidgetRequest.JSON_PROPERTY_RUM_QUERY,
  DistributionWidgetRequest.JSON_PROPERTY_SECURITY_QUERY,
  DistributionWidgetRequest.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionWidgetRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_APM_QUERY = "apm_query";
  private LogQueryDefinition apmQuery;

  public static final String JSON_PROPERTY_APM_STATS_QUERY = "apm_stats_query";
  private ApmStatsQueryDefinition apmStatsQuery;

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

  public static final String JSON_PROPERTY_QUERY = "query";
  private DistributionWidgetHistogramRequestQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private WidgetHistogramRequestType requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private FormulaAndFunctionResponseFormat responseFormat;

  public static final String JSON_PROPERTY_RUM_QUERY = "rum_query";
  private LogQueryDefinition rumQuery;

  public static final String JSON_PROPERTY_SECURITY_QUERY = "security_query";
  private LogQueryDefinition securityQuery;

  public static final String JSON_PROPERTY_STYLE = "style";
  private WidgetStyle style;

  public DistributionWidgetRequest apmQuery(LogQueryDefinition apmQuery) {
    this.apmQuery = apmQuery;
    this.unparsed |= apmQuery.unparsed;
    return this;
  }

  /**
   * <p>The log query.</p>
   * @return apmQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APM_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogQueryDefinition getApmQuery() {
        return apmQuery;
      }
  public void setApmQuery(LogQueryDefinition apmQuery) {
    this.apmQuery = apmQuery;
  }
  public DistributionWidgetRequest apmStatsQuery(ApmStatsQueryDefinition apmStatsQuery) {
    this.apmStatsQuery = apmStatsQuery;
    this.unparsed |= apmStatsQuery.unparsed;
    return this;
  }

  /**
   * <p>The APM stats query for table and distributions widgets.</p>
   * @return apmStatsQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APM_STATS_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ApmStatsQueryDefinition getApmStatsQuery() {
        return apmStatsQuery;
      }
  public void setApmStatsQuery(ApmStatsQueryDefinition apmStatsQuery) {
    this.apmStatsQuery = apmStatsQuery;
  }
  public DistributionWidgetRequest eventQuery(LogQueryDefinition eventQuery) {
    this.eventQuery = eventQuery;
    this.unparsed |= eventQuery.unparsed;
    return this;
  }

  /**
   * <p>The log query.</p>
   * @return eventQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EVENT_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogQueryDefinition getEventQuery() {
        return eventQuery;
      }
  public void setEventQuery(LogQueryDefinition eventQuery) {
    this.eventQuery = eventQuery;
  }
  public DistributionWidgetRequest formulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
    for (WidgetFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public DistributionWidgetRequest addFormulasItem(WidgetFormula formulasItem) {
    if (this.formulas == null) {
      this.formulas = new ArrayList<>();
    }
    this.formulas.add(formulasItem);
    this.unparsed |= formulasItem.unparsed;
    return this;
  }

  /**
   * <p>List of formulas that operate on queries.</p>
   * @return formulas
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FORMULAS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<WidgetFormula> getFormulas() {
        return formulas;
      }
  public void setFormulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
  }
  public DistributionWidgetRequest logQuery(LogQueryDefinition logQuery) {
    this.logQuery = logQuery;
    this.unparsed |= logQuery.unparsed;
    return this;
  }

  /**
   * <p>The log query.</p>
   * @return logQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOG_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogQueryDefinition getLogQuery() {
        return logQuery;
      }
  public void setLogQuery(LogQueryDefinition logQuery) {
    this.logQuery = logQuery;
  }
  public DistributionWidgetRequest networkQuery(LogQueryDefinition networkQuery) {
    this.networkQuery = networkQuery;
    this.unparsed |= networkQuery.unparsed;
    return this;
  }

  /**
   * <p>The log query.</p>
   * @return networkQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NETWORK_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogQueryDefinition getNetworkQuery() {
        return networkQuery;
      }
  public void setNetworkQuery(LogQueryDefinition networkQuery) {
    this.networkQuery = networkQuery;
  }
  public DistributionWidgetRequest processQuery(ProcessQueryDefinition processQuery) {
    this.processQuery = processQuery;
    this.unparsed |= processQuery.unparsed;
    return this;
  }

  /**
   * <p>The process query to use in the widget.</p>
   * @return processQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROCESS_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ProcessQueryDefinition getProcessQuery() {
        return processQuery;
      }
  public void setProcessQuery(ProcessQueryDefinition processQuery) {
    this.processQuery = processQuery;
  }
  public DistributionWidgetRequest profileMetricsQuery(LogQueryDefinition profileMetricsQuery) {
    this.profileMetricsQuery = profileMetricsQuery;
    this.unparsed |= profileMetricsQuery.unparsed;
    return this;
  }

  /**
   * <p>The log query.</p>
   * @return profileMetricsQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROFILE_METRICS_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogQueryDefinition getProfileMetricsQuery() {
        return profileMetricsQuery;
      }
  public void setProfileMetricsQuery(LogQueryDefinition profileMetricsQuery) {
    this.profileMetricsQuery = profileMetricsQuery;
  }
  public DistributionWidgetRequest q(String q) {
    this.q = q;
    return this;
  }

  /**
   * <p>Widget query.</p>
   * @return q
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_Q)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQ() {
        return q;
      }
  public void setQ(String q) {
    this.q = q;
  }
  public DistributionWidgetRequest queries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public DistributionWidgetRequest addQueriesItem(FormulaAndFunctionQueryDefinition queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * <p>List of queries that can be returned directly or used in formulas.</p>
   * @return queries
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<FormulaAndFunctionQueryDefinition> getQueries() {
        return queries;
      }
  public void setQueries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
  }
  public DistributionWidgetRequest query(DistributionWidgetHistogramRequestQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * <p>Query definition for Distribution Widget Histogram Request</p>
   * @return query
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public DistributionWidgetHistogramRequestQuery getQuery() {
        return query;
      }
  public void setQuery(DistributionWidgetHistogramRequestQuery query) {
    this.query = query;
  }
  public DistributionWidgetRequest requestType(WidgetHistogramRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * <p>Request type for the histogram request.</p>
   * @return requestType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetHistogramRequestType getRequestType() {
        return requestType;
      }
  public void setRequestType(WidgetHistogramRequestType requestType) {
    if (!requestType.isValid()) {
        this.unparsed = true;
    }
    this.requestType = requestType;
  }
  public DistributionWidgetRequest responseFormat(FormulaAndFunctionResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
    return this;
  }

  /**
   * <p>Timeseries, scalar, or event list response. Event list response formats are supported by Geomap widgets.</p>
   * @return responseFormat
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FormulaAndFunctionResponseFormat getResponseFormat() {
        return responseFormat;
      }
  public void setResponseFormat(FormulaAndFunctionResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
        this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }
  public DistributionWidgetRequest rumQuery(LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
    this.unparsed |= rumQuery.unparsed;
    return this;
  }

  /**
   * <p>The log query.</p>
   * @return rumQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RUM_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogQueryDefinition getRumQuery() {
        return rumQuery;
      }
  public void setRumQuery(LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
  }
  public DistributionWidgetRequest securityQuery(LogQueryDefinition securityQuery) {
    this.securityQuery = securityQuery;
    this.unparsed |= securityQuery.unparsed;
    return this;
  }

  /**
   * <p>The log query.</p>
   * @return securityQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SECURITY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogQueryDefinition getSecurityQuery() {
        return securityQuery;
      }
  public void setSecurityQuery(LogQueryDefinition securityQuery) {
    this.securityQuery = securityQuery;
  }
  public DistributionWidgetRequest style(WidgetStyle style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * <p>Widget style definition.</p>
   * @return style
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STYLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetStyle getStyle() {
        return style;
      }
  public void setStyle(WidgetStyle style) {
    this.style = style;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return DistributionWidgetRequest
   */
  @JsonAnySetter
  public DistributionWidgetRequest putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this DistributionWidgetRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionWidgetRequest distributionWidgetRequest = (DistributionWidgetRequest) o;
    return Objects.equals(this.apmQuery, distributionWidgetRequest.apmQuery) && Objects.equals(this.apmStatsQuery, distributionWidgetRequest.apmStatsQuery) && Objects.equals(this.eventQuery, distributionWidgetRequest.eventQuery) && Objects.equals(this.formulas, distributionWidgetRequest.formulas) && Objects.equals(this.logQuery, distributionWidgetRequest.logQuery) && Objects.equals(this.networkQuery, distributionWidgetRequest.networkQuery) && Objects.equals(this.processQuery, distributionWidgetRequest.processQuery) && Objects.equals(this.profileMetricsQuery, distributionWidgetRequest.profileMetricsQuery) && Objects.equals(this.q, distributionWidgetRequest.q) && Objects.equals(this.queries, distributionWidgetRequest.queries) && Objects.equals(this.query, distributionWidgetRequest.query) && Objects.equals(this.requestType, distributionWidgetRequest.requestType) && Objects.equals(this.responseFormat, distributionWidgetRequest.responseFormat) && Objects.equals(this.rumQuery, distributionWidgetRequest.rumQuery) && Objects.equals(this.securityQuery, distributionWidgetRequest.securityQuery) && Objects.equals(this.style, distributionWidgetRequest.style) && Objects.equals(this.additionalProperties, distributionWidgetRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(apmQuery,apmStatsQuery,eventQuery,formulas,logQuery,networkQuery,processQuery,profileMetricsQuery,q,queries,query,requestType,responseFormat,rumQuery,securityQuery,style, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionWidgetRequest {\n");
    sb.append("    apmQuery: ").append(toIndentedString(apmQuery)).append("\n");
    sb.append("    apmStatsQuery: ").append(toIndentedString(apmStatsQuery)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    logQuery: ").append(toIndentedString(logQuery)).append("\n");
    sb.append("    networkQuery: ").append(toIndentedString(networkQuery)).append("\n");
    sb.append("    processQuery: ").append(toIndentedString(processQuery)).append("\n");
    sb.append("    profileMetricsQuery: ").append(toIndentedString(profileMetricsQuery)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
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
