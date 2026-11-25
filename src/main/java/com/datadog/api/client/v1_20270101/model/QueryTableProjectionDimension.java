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
  QueryTableProjectionDimension.JSON_PROPERTY_CELL_DISPLAY_MODE,
  QueryTableProjectionDimension.JSON_PROPERTY_COLUMN,
  QueryTableProjectionDimension.JSON_PROPERTY_CONDITIONAL_FORMATS,
  QueryTableProjectionDimension.JSON_PROPERTY_DATE_FORMAT,
  QueryTableProjectionDimension.JSON_PROPERTY_DIMENSION,
  QueryTableProjectionDimension.JSON_PROPERTY_IS_HIDDEN,
  QueryTableProjectionDimension.JSON_PROPERTY_LINK,
  QueryTableProjectionDimension.JSON_PROPERTY_NUMBER_FORMAT,
  QueryTableProjectionDimension.JSON_PROPERTY_TEXT_ALIGN,
  QueryTableProjectionDimension.JSON_PROPERTY_TEXT_FORMATS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryTableProjectionDimension {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CELL_DISPLAY_MODE = "cell_display_mode";
  private AdvancedQueryTableCellDisplayMode cellDisplayMode;

  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private ConditionalFormats conditionalFormats;

  public static final String JSON_PROPERTY_DATE_FORMAT = "date_format";
  private QueryTableDateFormat dateFormat;

  public static final String JSON_PROPERTY_DIMENSION = "dimension";
  private QueryTableProjectionDimensionDimension dimension;

  public static final String JSON_PROPERTY_IS_HIDDEN = "is_hidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_LINK = "link";
  private QueryTableColumnLink link;

  public static final String JSON_PROPERTY_NUMBER_FORMAT = "number_format";
  private WidgetNumberFormat numberFormat;

  public static final String JSON_PROPERTY_TEXT_ALIGN = "text_align";
  private WidgetTextAlign textAlign;

  public static final String JSON_PROPERTY_TEXT_FORMATS = "text_formats";
  private List<TextFormattingRule> textFormats = null;

  public QueryTableProjectionDimension() {}

  @JsonCreator
  public QueryTableProjectionDimension(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN) String column,
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSION)
          QueryTableProjectionDimensionDimension dimension) {
    this.column = column;
    this.dimension = dimension;
    this.unparsed |= !dimension.isValid();
  }

  public QueryTableProjectionDimension cellDisplayMode(
      AdvancedQueryTableCellDisplayMode cellDisplayMode) {
    this.cellDisplayMode = cellDisplayMode;
    this.unparsed |= !cellDisplayMode.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return cellDisplayMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELL_DISPLAY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AdvancedQueryTableCellDisplayMode getCellDisplayMode() {
    return cellDisplayMode;
  }

  public void setCellDisplayMode(AdvancedQueryTableCellDisplayMode cellDisplayMode) {
    if (!cellDisplayMode.isValid()) {
      this.unparsed = true;
    }
    this.cellDisplayMode = cellDisplayMode;
  }

  public QueryTableProjectionDimension column(String column) {
    this.column = column;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return column
   */
  @JsonProperty(JSON_PROPERTY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  public QueryTableProjectionDimension conditionalFormats(ConditionalFormats conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    this.unparsed |= conditionalFormats.unparsed;
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
  public ConditionalFormats getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(ConditionalFormats conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      this.unparsed |= conditionalFormats.unparsed;
    }
  }

  public QueryTableProjectionDimension dateFormat(QueryTableDateFormat dateFormat) {
    this.dateFormat = dateFormat;
    this.unparsed |= dateFormat.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dateFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QueryTableDateFormat getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(QueryTableDateFormat dateFormat) {
    this.dateFormat = dateFormat;
    if (dateFormat != null) {
      this.unparsed |= dateFormat.unparsed;
    }
  }

  public QueryTableProjectionDimension dimension(QueryTableProjectionDimensionDimension dimension) {
    this.dimension = dimension;
    this.unparsed |= !dimension.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dimension
   */
  @JsonProperty(JSON_PROPERTY_DIMENSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public QueryTableProjectionDimensionDimension getDimension() {
    return dimension;
  }

  public void setDimension(QueryTableProjectionDimensionDimension dimension) {
    if (!dimension.isValid()) {
      this.unparsed = true;
    }
    this.dimension = dimension;
  }

  public QueryTableProjectionDimension isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return isHidden
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public QueryTableProjectionDimension link(QueryTableColumnLink link) {
    this.link = link;
    this.unparsed |= link.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return link
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QueryTableColumnLink getLink() {
    return link;
  }

  public void setLink(QueryTableColumnLink link) {
    this.link = link;
    if (link != null) {
      this.unparsed |= link.unparsed;
    }
  }

  public QueryTableProjectionDimension numberFormat(WidgetNumberFormat numberFormat) {
    this.numberFormat = numberFormat;
    this.unparsed |= numberFormat.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return numberFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetNumberFormat getNumberFormat() {
    return numberFormat;
  }

  public void setNumberFormat(WidgetNumberFormat numberFormat) {
    this.numberFormat = numberFormat;
    if (numberFormat != null) {
      this.unparsed |= numberFormat.unparsed;
    }
  }

  public QueryTableProjectionDimension textAlign(WidgetTextAlign textAlign) {
    this.textAlign = textAlign;
    this.unparsed |= !textAlign.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return textAlign
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTextAlign() {
    return textAlign;
  }

  public void setTextAlign(WidgetTextAlign textAlign) {
    if (!textAlign.isValid()) {
      this.unparsed = true;
    }
    this.textAlign = textAlign;
  }

  public QueryTableProjectionDimension textFormats(List<TextFormattingRule> textFormats) {
    this.textFormats = textFormats;
    if (textFormats != null) {
      for (TextFormattingRule item : textFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public QueryTableProjectionDimension addTextFormatsItem(TextFormattingRule textFormatsItem) {
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
  public List<TextFormattingRule> getTextFormats() {
    return textFormats;
  }

  public void setTextFormats(List<TextFormattingRule> textFormats) {
    this.textFormats = textFormats;
    if (textFormats != null) {
      for (TextFormattingRule item : textFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this QueryTableProjectionDimension object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTableProjectionDimension queryTableProjectionDimension = (QueryTableProjectionDimension) o;
    return Objects.equals(this.cellDisplayMode, queryTableProjectionDimension.cellDisplayMode)
        && Objects.equals(this.column, queryTableProjectionDimension.column)
        && Objects.equals(this.conditionalFormats, queryTableProjectionDimension.conditionalFormats)
        && Objects.equals(this.dateFormat, queryTableProjectionDimension.dateFormat)
        && Objects.equals(this.dimension, queryTableProjectionDimension.dimension)
        && Objects.equals(this.isHidden, queryTableProjectionDimension.isHidden)
        && Objects.equals(this.link, queryTableProjectionDimension.link)
        && Objects.equals(this.numberFormat, queryTableProjectionDimension.numberFormat)
        && Objects.equals(this.textAlign, queryTableProjectionDimension.textAlign)
        && Objects.equals(this.textFormats, queryTableProjectionDimension.textFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cellDisplayMode,
        column,
        conditionalFormats,
        dateFormat,
        dimension,
        isHidden,
        link,
        numberFormat,
        textAlign,
        textFormats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTableProjectionDimension {\n");
    sb.append("    cellDisplayMode: ").append(toIndentedString(cellDisplayMode)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    numberFormat: ").append(toIndentedString(numberFormat)).append("\n");
    sb.append("    textAlign: ").append(toIndentedString(textAlign)).append("\n");
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
