/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Timeseries execution metadata for the single request accepted by this API version. */
@JsonPropertyOrder({
  TimeseriesAnomalyInvestigationResponseMeta.JSON_PROPERTY_FROM_DATE,
  TimeseriesAnomalyInvestigationResponseMeta.JSON_PROPERTY_INTERVAL,
  TimeseriesAnomalyInvestigationResponseMeta.JSON_PROPERTY_QUERIES,
  TimeseriesAnomalyInvestigationResponseMeta.JSON_PROPERTY_RES_TYPE,
  TimeseriesAnomalyInvestigationResponseMeta.JSON_PROPERTY_RESULTS_WARNINGS,
  TimeseriesAnomalyInvestigationResponseMeta.JSON_PROPERTY_TO_DATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesAnomalyInvestigationResponseMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM_DATE = "from_date";
  private Long fromDate;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<TimeseriesAnomalyInvestigationQueryStatus> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_RES_TYPE = "res_type";
  private TimeseriesAnomalyInvestigationMetaType resType;

  public static final String JSON_PROPERTY_RESULTS_WARNINGS = "results_warnings";
  private List<TimeseriesAnomalyInvestigationResultsWarning> resultsWarnings = new ArrayList<>();

  public static final String JSON_PROPERTY_TO_DATE = "to_date";
  private Long toDate;

  public TimeseriesAnomalyInvestigationResponseMeta() {}

  @JsonCreator
  public TimeseriesAnomalyInvestigationResponseMeta(
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM_DATE) Long fromDate,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTERVAL) Long interval,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<TimeseriesAnomalyInvestigationQueryStatus> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_RES_TYPE)
          TimeseriesAnomalyInvestigationMetaType resType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESULTS_WARNINGS)
          List<TimeseriesAnomalyInvestigationResultsWarning> resultsWarnings,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO_DATE) Long toDate) {
    this.fromDate = fromDate;
    this.interval = interval;
    this.queries = queries;
    for (TimeseriesAnomalyInvestigationQueryStatus item : queries) {
      this.unparsed |= item.unparsed;
    }
    this.resType = resType;
    this.unparsed |= !resType.isValid();
    this.resultsWarnings = resultsWarnings;
    for (TimeseriesAnomalyInvestigationResultsWarning item : resultsWarnings) {
      this.unparsed |= item.unparsed;
    }
    this.toDate = toDate;
  }

  public TimeseriesAnomalyInvestigationResponseMeta fromDate(Long fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  /**
   * Effective start of the timeseries query in milliseconds since the Unix epoch.
   *
   * @return fromDate
   */
  @JsonProperty(JSON_PROPERTY_FROM_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFromDate() {
    return fromDate;
  }

  public void setFromDate(Long fromDate) {
    this.fromDate = fromDate;
  }

  public TimeseriesAnomalyInvestigationResponseMeta interval(Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Effective timeseries interval in milliseconds. minimum: 1
   *
   * @return interval
   */
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getInterval() {
    return interval;
  }

  public void setInterval(Long interval) {
    this.interval = interval;
  }

  public TimeseriesAnomalyInvestigationResponseMeta queries(
      List<TimeseriesAnomalyInvestigationQueryStatus> queries) {
    this.queries = queries;
    for (TimeseriesAnomalyInvestigationQueryStatus item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesAnomalyInvestigationResponseMeta addQueriesItem(
      TimeseriesAnomalyInvestigationQueryStatus queriesItem) {
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * Execution status for the request's queries.
   *
   * @return queries
   */
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TimeseriesAnomalyInvestigationQueryStatus> getQueries() {
    return queries;
  }

  public void setQueries(List<TimeseriesAnomalyInvestigationQueryStatus> queries) {
    this.queries = queries;
    if (queries != null) {
      for (TimeseriesAnomalyInvestigationQueryStatus item : queries) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TimeseriesAnomalyInvestigationResponseMeta resType(
      TimeseriesAnomalyInvestigationMetaType resType) {
    this.resType = resType;
    this.unparsed |= !resType.isValid();
    return this;
  }

  /**
   * Response metadata type for a timeseries anomaly investigation.
   *
   * @return resType
   */
  @JsonProperty(JSON_PROPERTY_RES_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesAnomalyInvestigationMetaType getResType() {
    return resType;
  }

  public void setResType(TimeseriesAnomalyInvestigationMetaType resType) {
    if (!resType.isValid()) {
      this.unparsed = true;
    }
    this.resType = resType;
  }

  public TimeseriesAnomalyInvestigationResponseMeta resultsWarnings(
      List<TimeseriesAnomalyInvestigationResultsWarning> resultsWarnings) {
    this.resultsWarnings = resultsWarnings;
    for (TimeseriesAnomalyInvestigationResultsWarning item : resultsWarnings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesAnomalyInvestigationResponseMeta addResultsWarningsItem(
      TimeseriesAnomalyInvestigationResultsWarning resultsWarningsItem) {
    this.resultsWarnings.add(resultsWarningsItem);
    this.unparsed |= resultsWarningsItem.unparsed;
    return this;
  }

  /**
   * Non-fatal warnings produced while executing the investigation.
   *
   * @return resultsWarnings
   */
  @JsonProperty(JSON_PROPERTY_RESULTS_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TimeseriesAnomalyInvestigationResultsWarning> getResultsWarnings() {
    return resultsWarnings;
  }

  public void setResultsWarnings(
      List<TimeseriesAnomalyInvestigationResultsWarning> resultsWarnings) {
    this.resultsWarnings = resultsWarnings;
    if (resultsWarnings != null) {
      for (TimeseriesAnomalyInvestigationResultsWarning item : resultsWarnings) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TimeseriesAnomalyInvestigationResponseMeta toDate(Long toDate) {
    this.toDate = toDate;
    return this;
  }

  /**
   * Effective end of the timeseries query in milliseconds since the Unix epoch.
   *
   * @return toDate
   */
  @JsonProperty(JSON_PROPERTY_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getToDate() {
    return toDate;
  }

  public void setToDate(Long toDate) {
    this.toDate = toDate;
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
   * @return TimeseriesAnomalyInvestigationResponseMeta
   */
  @JsonAnySetter
  public TimeseriesAnomalyInvestigationResponseMeta putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this TimeseriesAnomalyInvestigationResponseMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesAnomalyInvestigationResponseMeta timeseriesAnomalyInvestigationResponseMeta =
        (TimeseriesAnomalyInvestigationResponseMeta) o;
    return Objects.equals(this.fromDate, timeseriesAnomalyInvestigationResponseMeta.fromDate)
        && Objects.equals(this.interval, timeseriesAnomalyInvestigationResponseMeta.interval)
        && Objects.equals(this.queries, timeseriesAnomalyInvestigationResponseMeta.queries)
        && Objects.equals(this.resType, timeseriesAnomalyInvestigationResponseMeta.resType)
        && Objects.equals(
            this.resultsWarnings, timeseriesAnomalyInvestigationResponseMeta.resultsWarnings)
        && Objects.equals(this.toDate, timeseriesAnomalyInvestigationResponseMeta.toDate)
        && Objects.equals(
            this.additionalProperties,
            timeseriesAnomalyInvestigationResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fromDate, interval, queries, resType, resultsWarnings, toDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesAnomalyInvestigationResponseMeta {\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    resType: ").append(toIndentedString(resType)).append("\n");
    sb.append("    resultsWarnings: ").append(toIndentedString(resultsWarnings)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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
