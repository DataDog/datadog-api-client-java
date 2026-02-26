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
   * <p>Updated scatter plot.</p>
 */
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
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterPlotRequest {
  @JsonIgnore
  public boolean unparsed = false;
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
   * <p>Aggregator used for the request.</p>
   * @return aggregator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGGREGATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
  public ScatterPlotRequest eventQuery(LogQueryDefinition eventQuery) {
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
  public ScatterPlotRequest logQuery(LogQueryDefinition logQuery) {
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
  public ScatterPlotRequest networkQuery(LogQueryDefinition networkQuery) {
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
  public ScatterPlotRequest processQuery(ProcessQueryDefinition processQuery) {
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
  public ScatterPlotRequest profileMetricsQuery(LogQueryDefinition profileMetricsQuery) {
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
  public ScatterPlotRequest q(String q) {
    this.q = q;
    return this;
  }

  /**
   * <p>Query definition.</p>
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
  public ScatterPlotRequest rumQuery(LogQueryDefinition rumQuery) {
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
  public ScatterPlotRequest securityQuery(LogQueryDefinition securityQuery) {
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
   * @return ScatterPlotRequest
   */
  @JsonAnySetter
  public ScatterPlotRequest putAdditionalProperty(String key, Object value) {
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
   * Return true if this ScatterPlotRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterPlotRequest scatterPlotRequest = (ScatterPlotRequest) o;
    return Objects.equals(this.aggregator, scatterPlotRequest.aggregator) && Objects.equals(this.apmQuery, scatterPlotRequest.apmQuery) && Objects.equals(this.eventQuery, scatterPlotRequest.eventQuery) && Objects.equals(this.logQuery, scatterPlotRequest.logQuery) && Objects.equals(this.networkQuery, scatterPlotRequest.networkQuery) && Objects.equals(this.processQuery, scatterPlotRequest.processQuery) && Objects.equals(this.profileMetricsQuery, scatterPlotRequest.profileMetricsQuery) && Objects.equals(this.q, scatterPlotRequest.q) && Objects.equals(this.rumQuery, scatterPlotRequest.rumQuery) && Objects.equals(this.securityQuery, scatterPlotRequest.securityQuery) && Objects.equals(this.additionalProperties, scatterPlotRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregator,apmQuery,eventQuery,logQuery,networkQuery,processQuery,profileMetricsQuery,q,rumQuery,securityQuery, additionalProperties);
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
    sb.append("    profileMetricsQuery: ").append(toIndentedString(profileMetricsQuery)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    rumQuery: ").append(toIndentedString(rumQuery)).append("\n");
    sb.append("    securityQuery: ").append(toIndentedString(securityQuery)).append("\n");
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
