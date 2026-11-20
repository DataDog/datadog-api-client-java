/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
  GeomapBackendPointsRequest20270101OneOf4457227232.JSON_PROPERTY_COLUMNS,
  GeomapBackendPointsRequest20270101OneOf4457227232.JSON_PROPERTY_CONDITIONAL_FORMATS,
  GeomapBackendPointsRequest20270101OneOf4457227232.JSON_PROPERTY_QUERY,
  GeomapBackendPointsRequest20270101OneOf4457227232.JSON_PROPERTY_RESPONSE_FORMAT,
  GeomapBackendPointsRequest20270101OneOf4457227232.JSON_PROPERTY_STYLE,
  GeomapBackendPointsRequest20270101OneOf4457227232.JSON_PROPERTY_TEXT_FORMATS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapBackendPointsRequest20270101OneOf4457227232 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<GeomapBackendPointsRequestAnyOfAnyOfItemColumnsItems4446997856_20270101> columns =
      new ArrayList<>();

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule_20270101> conditionalFormats = null;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ProductAnalyticsStreamQuery_20270101 query;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4446999456_20270101 responseFormat;

  public static final String JSON_PROPERTY_STYLE = "style";
  private GeomapRequestStyle_20270101 style;

  public static final String JSON_PROPERTY_TEXT_FORMATS = "text_formats";
  private List<TextFormattingRule_20270101> textFormats = null;

  public GeomapBackendPointsRequest20270101OneOf4457227232() {}

  @JsonCreator
  public GeomapBackendPointsRequest20270101OneOf4457227232(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS)
          List<GeomapBackendPointsRequestAnyOfAnyOfItemColumnsItems4446997856_20270101> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY)
          ProductAnalyticsStreamQuery_20270101 query,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4446999456_20270101
              responseFormat) {
    this.columns = columns;
    for (GeomapBackendPointsRequestAnyOfAnyOfItemColumnsItems4446997856_20270101 item : columns) {
      this.unparsed |= item.unparsed;
    }
    this.query = query;
    this.unparsed |= query.unparsed;
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public GeomapBackendPointsRequest20270101OneOf4457227232 columns(
      List<GeomapBackendPointsRequestAnyOfAnyOfItemColumnsItems4446997856_20270101> columns) {
    this.columns = columns;
    for (GeomapBackendPointsRequestAnyOfAnyOfItemColumnsItems4446997856_20270101 item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GeomapBackendPointsRequest20270101OneOf4457227232 addColumnsItem(
      GeomapBackendPointsRequestAnyOfAnyOfItemColumnsItems4446997856_20270101 columnsItem) {
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return columns
   */
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GeomapBackendPointsRequestAnyOfAnyOfItemColumnsItems4446997856_20270101>
      getColumns() {
    return columns;
  }

  public void setColumns(
      List<GeomapBackendPointsRequestAnyOfAnyOfItemColumnsItems4446997856_20270101> columns) {
    this.columns = columns;
    if (columns != null) {
      for (GeomapBackendPointsRequestAnyOfAnyOfItemColumnsItems4446997856_20270101 item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public GeomapBackendPointsRequest20270101OneOf4457227232 conditionalFormats(
      List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public GeomapBackendPointsRequest20270101OneOf4457227232 addConditionalFormatsItem(
      ThresholdFormattingRule_20270101 conditionalFormatsItem) {
    if (this.conditionalFormats == null) {
      this.conditionalFormats = new ArrayList<>();
    }
    this.conditionalFormats.add(conditionalFormatsItem);
    this.unparsed |= conditionalFormatsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return conditionalFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ThresholdFormattingRule_20270101> getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public GeomapBackendPointsRequest20270101OneOf4457227232 query(
      ProductAnalyticsStreamQuery_20270101 query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsStreamQuery_20270101 getQuery() {
    return query;
  }

  public void setQuery(ProductAnalyticsStreamQuery_20270101 query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public GeomapBackendPointsRequest20270101OneOf4457227232 responseFormat(
      GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4446999456_20270101 responseFormat) {
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
  public GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4446999456_20270101
      getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      GeomapBackendPointsRequestAnyOfAnyOfItemResponseFormat4446999456_20270101 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public GeomapBackendPointsRequest20270101OneOf4457227232 style(
      GeomapRequestStyle_20270101 style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return style
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GeomapRequestStyle_20270101 getStyle() {
    return style;
  }

  public void setStyle(GeomapRequestStyle_20270101 style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  public GeomapBackendPointsRequest20270101OneOf4457227232 textFormats(
      List<TextFormattingRule_20270101> textFormats) {
    this.textFormats = textFormats;
    if (textFormats != null) {
      for (TextFormattingRule_20270101 item : textFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public GeomapBackendPointsRequest20270101OneOf4457227232 addTextFormatsItem(
      TextFormattingRule_20270101 textFormatsItem) {
    if (this.textFormats == null) {
      this.textFormats = new ArrayList<>();
    }
    this.textFormats.add(textFormatsItem);
    this.unparsed |= textFormatsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return textFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TextFormattingRule_20270101> getTextFormats() {
    return textFormats;
  }

  public void setTextFormats(List<TextFormattingRule_20270101> textFormats) {
    this.textFormats = textFormats;
    if (textFormats != null) {
      for (TextFormattingRule_20270101 item : textFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this GeomapBackendPointsRequest20270101OneOf4457227232 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapBackendPointsRequest20270101OneOf4457227232
        geomapBackendPointsRequest20270101OneOf4457227232 =
            (GeomapBackendPointsRequest20270101OneOf4457227232) o;
    return Objects.equals(this.columns, geomapBackendPointsRequest20270101OneOf4457227232.columns)
        && Objects.equals(
            this.conditionalFormats,
            geomapBackendPointsRequest20270101OneOf4457227232.conditionalFormats)
        && Objects.equals(this.query, geomapBackendPointsRequest20270101OneOf4457227232.query)
        && Objects.equals(
            this.responseFormat, geomapBackendPointsRequest20270101OneOf4457227232.responseFormat)
        && Objects.equals(this.style, geomapBackendPointsRequest20270101OneOf4457227232.style)
        && Objects.equals(
            this.textFormats, geomapBackendPointsRequest20270101OneOf4457227232.textFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, conditionalFormats, query, responseFormat, style, textFormats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapBackendPointsRequest20270101OneOf4457227232 {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    textFormats: ").append(toIndentedString(textFormats)).append("\n");
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
