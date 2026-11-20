/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  FormulaDataset.JSON_PROPERTY_DATA_SOURCE,
  FormulaDataset.JSON_PROPERTY_FORMULAS,
  FormulaDataset.JSON_PROPERTY_NAME,
  FormulaDataset.JSON_PROPERTY_QUERIES,
  FormulaDataset.JSON_PROPERTY_RESPONSE_FORMAT,
  FormulaDataset.JSON_PROPERTY_TIME_WINDOW
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaDataset {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaDatasetDataSource dataSource;

  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<FormulaDatasetFormulasItems> formulas = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<DashboardInlineSchema40> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private FormulaDatasetResponseFormat responseFormat;

  public static final String JSON_PROPERTY_TIME_WINDOW = "time_window";
  private TimeWindow timeWindow;

  public FormulaDataset() {}

  @JsonCreator
  public FormulaDataset(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaDatasetDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_FORMULAS)
          List<FormulaDatasetFormulasItems> formulas,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<DashboardInlineSchema40> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          FormulaDatasetResponseFormat responseFormat) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.formulas = formulas;
    for (FormulaDatasetFormulasItems item : formulas) {
      this.unparsed |= item.unparsed;
    }
    this.name = name;
    this.queries = queries;
    for (DashboardInlineSchema40 item : queries) {
      this.unparsed |= item.unparsed;
    }
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public FormulaDataset dataSource(FormulaDatasetDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaDatasetDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaDatasetDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaDataset formulas(List<FormulaDatasetFormulasItems> formulas) {
    this.formulas = formulas;
    for (FormulaDatasetFormulasItems item : formulas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FormulaDataset addFormulasItem(FormulaDatasetFormulasItems formulasItem) {
    this.formulas.add(formulasItem);
    this.unparsed |= formulasItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return formulas
   */
  @JsonProperty(JSON_PROPERTY_FORMULAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<FormulaDatasetFormulasItems> getFormulas() {
    return formulas;
  }

  public void setFormulas(List<FormulaDatasetFormulasItems> formulas) {
    this.formulas = formulas;
    if (formulas != null) {
      for (FormulaDatasetFormulasItems item : formulas) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FormulaDataset name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FormulaDataset queries(List<DashboardInlineSchema40> queries) {
    this.queries = queries;
    for (DashboardInlineSchema40 item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FormulaDataset addQueriesItem(DashboardInlineSchema40 queriesItem) {
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return queries
   */
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DashboardInlineSchema40> getQueries() {
    return queries;
  }

  public void setQueries(List<DashboardInlineSchema40> queries) {
    this.queries = queries;
    if (queries != null) {
      for (DashboardInlineSchema40 item : queries) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FormulaDataset responseFormat(FormulaDatasetResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return responseFormat
   */
  @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaDatasetResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(FormulaDatasetResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public FormulaDataset timeWindow(TimeWindow timeWindow) {
    this.timeWindow = timeWindow;
    this.unparsed |= timeWindow.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return timeWindow
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeWindow getTimeWindow() {
    return timeWindow;
  }

  public void setTimeWindow(TimeWindow timeWindow) {
    this.timeWindow = timeWindow;
    if (timeWindow != null) {
      this.unparsed |= timeWindow.unparsed;
    }
  }

  /** Return true if this FormulaDataset object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaDataset formulaDataset = (FormulaDataset) o;
    return Objects.equals(this.dataSource, formulaDataset.dataSource)
        && Objects.equals(this.formulas, formulaDataset.formulas)
        && Objects.equals(this.name, formulaDataset.name)
        && Objects.equals(this.queries, formulaDataset.queries)
        && Objects.equals(this.responseFormat, formulaDataset.responseFormat)
        && Objects.equals(this.timeWindow, formulaDataset.timeWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, formulas, name, queries, responseFormat, timeWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaDataset {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    timeWindow: ").append(toIndentedString(timeWindow)).append("\n");
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
