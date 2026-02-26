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

/** An updated geomap widget. */
@JsonPropertyOrder({
  GeomapWidgetRequest.JSON_PROPERTY_COLUMNS,
  GeomapWidgetRequest.JSON_PROPERTY_CONDITIONAL_FORMATS,
  GeomapWidgetRequest.JSON_PROPERTY_FORMULAS,
  GeomapWidgetRequest.JSON_PROPERTY_LOG_QUERY,
  GeomapWidgetRequest.JSON_PROPERTY_Q,
  GeomapWidgetRequest.JSON_PROPERTY_QUERIES,
  GeomapWidgetRequest.JSON_PROPERTY_QUERY,
  GeomapWidgetRequest.JSON_PROPERTY_RESPONSE_FORMAT,
  GeomapWidgetRequest.JSON_PROPERTY_RUM_QUERY,
  GeomapWidgetRequest.JSON_PROPERTY_SECURITY_QUERY,
  GeomapWidgetRequest.JSON_PROPERTY_SORT,
  GeomapWidgetRequest.JSON_PROPERTY_STYLE,
  GeomapWidgetRequest.JSON_PROPERTY_TEXT_FORMATS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapWidgetRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<ListStreamColumn> columns = null;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<WidgetConditionalFormat> conditionalFormats = null;

  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private List<WidgetFormula> formulas = null;

  public static final String JSON_PROPERTY_LOG_QUERY = "log_query";
  private LogQueryDefinition logQuery;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<FormulaAndFunctionQueryDefinition> queries = null;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ListStreamQuery query;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private FormulaAndFunctionResponseFormat responseFormat;

  public static final String JSON_PROPERTY_RUM_QUERY = "rum_query";
  private LogQueryDefinition rumQuery;

  public static final String JSON_PROPERTY_SECURITY_QUERY = "security_query";
  private LogQueryDefinition securityQuery;

  public static final String JSON_PROPERTY_SORT = "sort";
  private WidgetSortBy sort;

  public static final String JSON_PROPERTY_STYLE = "style";
  private GeomapWidgetRequestStyle style;

  public static final String JSON_PROPERTY_TEXT_FORMATS = "text_formats";
  private List<TableWidgetTextFormatRule> textFormats = null;

  public GeomapWidgetRequest columns(List<ListStreamColumn> columns) {
    this.columns = columns;
    for (ListStreamColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GeomapWidgetRequest addColumnsItem(ListStreamColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Widget columns.
   *
   * @return columns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ListStreamColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ListStreamColumn> columns) {
    this.columns = columns;
  }

  public GeomapWidgetRequest conditionalFormats(List<WidgetConditionalFormat> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    for (WidgetConditionalFormat item : conditionalFormats) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GeomapWidgetRequest addConditionalFormatsItem(
      WidgetConditionalFormat conditionalFormatsItem) {
    if (this.conditionalFormats == null) {
      this.conditionalFormats = new ArrayList<>();
    }
    this.conditionalFormats.add(conditionalFormatsItem);
    this.unparsed |= conditionalFormatsItem.unparsed;
    return this;
  }

  /**
   * Threshold (numeric) conditional formatting rules may be used by a regions layer.
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

  public GeomapWidgetRequest formulas(List<WidgetFormula> formulas) {
    this.formulas = formulas;
    for (WidgetFormula item : formulas) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GeomapWidgetRequest addFormulasItem(WidgetFormula formulasItem) {
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

  public GeomapWidgetRequest logQuery(LogQueryDefinition logQuery) {
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

  public GeomapWidgetRequest q(String q) {
    this.q = q;
    return this;
  }

  /**
   * The widget metrics query.
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

  public GeomapWidgetRequest queries(List<FormulaAndFunctionQueryDefinition> queries) {
    this.queries = queries;
    for (FormulaAndFunctionQueryDefinition item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GeomapWidgetRequest addQueriesItem(FormulaAndFunctionQueryDefinition queriesItem) {
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

  public GeomapWidgetRequest query(ListStreamQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Updated list stream widget.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ListStreamQuery getQuery() {
    return query;
  }

  public void setQuery(ListStreamQuery query) {
    this.query = query;
  }

  public GeomapWidgetRequest responseFormat(FormulaAndFunctionResponseFormat responseFormat) {
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

  public GeomapWidgetRequest rumQuery(LogQueryDefinition rumQuery) {
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

  public GeomapWidgetRequest securityQuery(LogQueryDefinition securityQuery) {
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

  public GeomapWidgetRequest sort(WidgetSortBy sort) {
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

  public GeomapWidgetRequest style(GeomapWidgetRequestStyle style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * The style to apply to the request for points layer.
   *
   * @return style
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GeomapWidgetRequestStyle getStyle() {
    return style;
  }

  public void setStyle(GeomapWidgetRequestStyle style) {
    this.style = style;
  }

  public GeomapWidgetRequest textFormats(List<TableWidgetTextFormatRule> textFormats) {
    this.textFormats = textFormats;
    for (TableWidgetTextFormatRule item : textFormats) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GeomapWidgetRequest addTextFormatsItem(TableWidgetTextFormatRule textFormatsItem) {
    if (this.textFormats == null) {
      this.textFormats = new ArrayList<>();
    }
    this.textFormats.add(textFormatsItem);
    this.unparsed |= textFormatsItem.unparsed;
    return this;
  }

  /**
   * Text formatting rules may be used by a points layer.
   *
   * @return textFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TableWidgetTextFormatRule> getTextFormats() {
    return textFormats;
  }

  public void setTextFormats(List<TableWidgetTextFormatRule> textFormats) {
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
   * @return GeomapWidgetRequest
   */
  @JsonAnySetter
  public GeomapWidgetRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GeomapWidgetRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapWidgetRequest geomapWidgetRequest = (GeomapWidgetRequest) o;
    return Objects.equals(this.columns, geomapWidgetRequest.columns)
        && Objects.equals(this.conditionalFormats, geomapWidgetRequest.conditionalFormats)
        && Objects.equals(this.formulas, geomapWidgetRequest.formulas)
        && Objects.equals(this.logQuery, geomapWidgetRequest.logQuery)
        && Objects.equals(this.q, geomapWidgetRequest.q)
        && Objects.equals(this.queries, geomapWidgetRequest.queries)
        && Objects.equals(this.query, geomapWidgetRequest.query)
        && Objects.equals(this.responseFormat, geomapWidgetRequest.responseFormat)
        && Objects.equals(this.rumQuery, geomapWidgetRequest.rumQuery)
        && Objects.equals(this.securityQuery, geomapWidgetRequest.securityQuery)
        && Objects.equals(this.sort, geomapWidgetRequest.sort)
        && Objects.equals(this.style, geomapWidgetRequest.style)
        && Objects.equals(this.textFormats, geomapWidgetRequest.textFormats)
        && Objects.equals(this.additionalProperties, geomapWidgetRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columns,
        conditionalFormats,
        formulas,
        logQuery,
        q,
        queries,
        query,
        responseFormat,
        rumQuery,
        securityQuery,
        sort,
        style,
        textFormats,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapWidgetRequest {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    logQuery: ").append(toIndentedString(logQuery)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    rumQuery: ").append(toIndentedString(rumQuery)).append("\n");
    sb.append("    securityQuery: ").append(toIndentedString(securityQuery)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
