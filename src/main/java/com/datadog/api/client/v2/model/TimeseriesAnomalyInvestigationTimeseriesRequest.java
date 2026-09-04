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

/** Metrics timeseries request to investigate. */
@JsonPropertyOrder({
  TimeseriesAnomalyInvestigationTimeseriesRequest.JSON_PROPERTY_FORMULAS,
  TimeseriesAnomalyInvestigationTimeseriesRequest.JSON_PROPERTY_FROM,
  TimeseriesAnomalyInvestigationTimeseriesRequest.JSON_PROPERTY_INTERVAL,
  TimeseriesAnomalyInvestigationTimeseriesRequest.JSON_PROPERTY_QUERIES,
  TimeseriesAnomalyInvestigationTimeseriesRequest.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesAnomalyInvestigationTimeseriesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<TimeseriesAnomalyInvestigationFormula> formulas = new ArrayList<>();

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<TimeseriesAnomalyInvestigationMetricQuery> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public TimeseriesAnomalyInvestigationTimeseriesRequest() {}

  @JsonCreator
  public TimeseriesAnomalyInvestigationTimeseriesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMULAS)
          List<TimeseriesAnomalyInvestigationFormula> formulas,
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<TimeseriesAnomalyInvestigationMetricQuery> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to) {
    this.formulas = formulas;
    for (TimeseriesAnomalyInvestigationFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    this.from = from;
    this.queries = queries;
    for (TimeseriesAnomalyInvestigationMetricQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
    this.to = to;
  }

  public TimeseriesAnomalyInvestigationTimeseriesRequest formulas(
      List<TimeseriesAnomalyInvestigationFormula> formulas) {
    this.formulas = formulas;
    for (TimeseriesAnomalyInvestigationFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesAnomalyInvestigationTimeseriesRequest addFormulasItem(
      TimeseriesAnomalyInvestigationFormula formulasItem) {
    this.formulas.add(formulasItem);
    this.unparsed |= formulasItem.unparsed;
    return this;
  }

  /**
   * Formulas to evaluate. Each formula may contain an explicit <code>anomalies()</code> call or a
   * supported metrics expression.
   *
   * @return formulas
   */
  @JsonProperty(JSON_PROPERTY_FORMULAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TimeseriesAnomalyInvestigationFormula> getFormulas() {
    return formulas;
  }

  public void setFormulas(List<TimeseriesAnomalyInvestigationFormula> formulas) {
    this.formulas = formulas;
    if (formulas != null) {
      for (TimeseriesAnomalyInvestigationFormula item : formulas) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TimeseriesAnomalyInvestigationTimeseriesRequest from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the investigation time window in milliseconds since the Unix epoch.
   *
   * @return from
   */
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public TimeseriesAnomalyInvestigationTimeseriesRequest interval(Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Optional requested aggregation interval in milliseconds. minimum: 1
   *
   * @return interval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInterval() {
    return interval;
  }

  public void setInterval(Long interval) {
    this.interval = interval;
  }

  public TimeseriesAnomalyInvestigationTimeseriesRequest queries(
      List<TimeseriesAnomalyInvestigationMetricQuery> queries) {
    this.queries = queries;
    for (TimeseriesAnomalyInvestigationMetricQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesAnomalyInvestigationTimeseriesRequest addQueriesItem(
      TimeseriesAnomalyInvestigationMetricQuery queriesItem) {
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * Metrics queries referenced by the formulas.
   *
   * @return queries
   */
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TimeseriesAnomalyInvestigationMetricQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<TimeseriesAnomalyInvestigationMetricQuery> queries) {
    this.queries = queries;
    if (queries != null) {
      for (TimeseriesAnomalyInvestigationMetricQuery item : queries) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TimeseriesAnomalyInvestigationTimeseriesRequest to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End of the investigation time window in milliseconds since the Unix epoch. Must be later than
   * <code>from</code>.
   *
   * @return to
   */
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
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
   * @return TimeseriesAnomalyInvestigationTimeseriesRequest
   */
  @JsonAnySetter
  public TimeseriesAnomalyInvestigationTimeseriesRequest putAdditionalProperty(
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

  /** Return true if this TimeseriesAnomalyInvestigationTimeseriesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesAnomalyInvestigationTimeseriesRequest
        timeseriesAnomalyInvestigationTimeseriesRequest =
            (TimeseriesAnomalyInvestigationTimeseriesRequest) o;
    return Objects.equals(this.formulas, timeseriesAnomalyInvestigationTimeseriesRequest.formulas)
        && Objects.equals(this.from, timeseriesAnomalyInvestigationTimeseriesRequest.from)
        && Objects.equals(this.interval, timeseriesAnomalyInvestigationTimeseriesRequest.interval)
        && Objects.equals(this.queries, timeseriesAnomalyInvestigationTimeseriesRequest.queries)
        && Objects.equals(this.to, timeseriesAnomalyInvestigationTimeseriesRequest.to)
        && Objects.equals(
            this.additionalProperties,
            timeseriesAnomalyInvestigationTimeseriesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formulas, from, interval, queries, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesAnomalyInvestigationTimeseriesRequest {\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
