/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The object describing a timeseries formula request. */
@JsonPropertyOrder({
  TimeseriesFormulaRequestAttributes.JSON_PROPERTY_FORMULAS,
  TimeseriesFormulaRequestAttributes.JSON_PROPERTY_FROM,
  TimeseriesFormulaRequestAttributes.JSON_PROPERTY_INTERVAL,
  TimeseriesFormulaRequestAttributes.JSON_PROPERTY_QUERIES,
  TimeseriesFormulaRequestAttributes.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesFormulaRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<QueryFormula> formulas = null;

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<TimeseriesQuery> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public TimeseriesFormulaRequestAttributes() {}

  @JsonCreator
  public TimeseriesFormulaRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES) List<TimeseriesQuery> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to) {
    this.from = from;
    this.queries = queries;
    this.to = to;
  }

  public TimeseriesFormulaRequestAttributes formulas(List<QueryFormula> formulas) {
    this.formulas = formulas;
    for (QueryFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesFormulaRequestAttributes addFormulasItem(QueryFormula formulasItem) {
    if (this.formulas == null) {
      this.formulas = new ArrayList<>();
    }
    this.formulas.add(formulasItem);
    this.unparsed |= formulasItem.unparsed;
    return this;
  }

  /**
   * List of formulas to be calculated and returned as responses.
   *
   * @return formulas
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMULAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<QueryFormula> getFormulas() {
    return formulas;
  }

  public void setFormulas(List<QueryFormula> formulas) {
    this.formulas = formulas;
  }

  public TimeseriesFormulaRequestAttributes from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start date (inclusive) of the query in milliseconds since the Unix epoch.
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

  public TimeseriesFormulaRequestAttributes interval(Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * A time interval in milliseconds. May be overridden by a larger interval if the query would
   * result in too many points for the specified timeframe. Defaults to a reasonable interval for
   * the given timeframe.
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

  public TimeseriesFormulaRequestAttributes queries(List<TimeseriesQuery> queries) {
    this.queries = queries;
    for (TimeseriesQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesFormulaRequestAttributes addQueriesItem(TimeseriesQuery queriesItem) {
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * List of queries to be run and used as inputs to the formulas.
   *
   * @return queries
   */
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TimeseriesQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<TimeseriesQuery> queries) {
    this.queries = queries;
  }

  public TimeseriesFormulaRequestAttributes to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End date (exclusive) of the query in milliseconds since the Unix epoch.
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

  /** Return true if this TimeseriesFormulaRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesFormulaRequestAttributes timeseriesFormulaRequestAttributes =
        (TimeseriesFormulaRequestAttributes) o;
    return Objects.equals(this.formulas, timeseriesFormulaRequestAttributes.formulas)
        && Objects.equals(this.from, timeseriesFormulaRequestAttributes.from)
        && Objects.equals(this.interval, timeseriesFormulaRequestAttributes.interval)
        && Objects.equals(this.queries, timeseriesFormulaRequestAttributes.queries)
        && Objects.equals(this.to, timeseriesFormulaRequestAttributes.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formulas, from, interval, queries, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesFormulaRequestAttributes {\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
