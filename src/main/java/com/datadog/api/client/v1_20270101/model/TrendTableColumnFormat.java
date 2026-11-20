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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  TrendTableColumnFormat.JSON_PROPERTY_CONDITIONAL_FORMATS,
  TrendTableColumnFormat.JSON_PROPERTY_MODE,
  TrendTableColumnFormat.JSON_PROPERTY_NUMBER_FORMAT,
  TrendTableColumnFormat.JSON_PROPERTY_TREND_OPTIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TrendTableColumnFormat {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private ConditionalFormats conditionalFormats;

  public static final String JSON_PROPERTY_MODE = "mode";
  private TrendTableColumnFormatMode mode;

  public static final String JSON_PROPERTY_NUMBER_FORMAT = "number_format";
  private WidgetNumberFormat numberFormat;

  public static final String JSON_PROPERTY_TREND_OPTIONS = "trend_options";
  private TableTrendCellDisplayModeOptions trendOptions;

  public TrendTableColumnFormat() {}

  @JsonCreator
  public TrendTableColumnFormat(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE) TrendTableColumnFormatMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_TREND_OPTIONS)
          TableTrendCellDisplayModeOptions trendOptions) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.trendOptions = trendOptions;
    this.unparsed |= trendOptions.unparsed;
  }

  public TrendTableColumnFormat conditionalFormats(ConditionalFormats conditionalFormats) {
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

  public TrendTableColumnFormat mode(TrendTableColumnFormatMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TrendTableColumnFormatMode getMode() {
    return mode;
  }

  public void setMode(TrendTableColumnFormatMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public TrendTableColumnFormat numberFormat(WidgetNumberFormat numberFormat) {
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

  public TrendTableColumnFormat trendOptions(TableTrendCellDisplayModeOptions trendOptions) {
    this.trendOptions = trendOptions;
    this.unparsed |= trendOptions.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return trendOptions
   */
  @JsonProperty(JSON_PROPERTY_TREND_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TableTrendCellDisplayModeOptions getTrendOptions() {
    return trendOptions;
  }

  public void setTrendOptions(TableTrendCellDisplayModeOptions trendOptions) {
    this.trendOptions = trendOptions;
    if (trendOptions != null) {
      this.unparsed |= trendOptions.unparsed;
    }
  }

  /** Return true if this TrendTableColumnFormat object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendTableColumnFormat trendTableColumnFormat = (TrendTableColumnFormat) o;
    return Objects.equals(this.conditionalFormats, trendTableColumnFormat.conditionalFormats)
        && Objects.equals(this.mode, trendTableColumnFormat.mode)
        && Objects.equals(this.numberFormat, trendTableColumnFormat.numberFormat)
        && Objects.equals(this.trendOptions, trendTableColumnFormat.trendOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalFormats, mode, numberFormat, trendOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendTableColumnFormat {\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    numberFormat: ").append(toIndentedString(numberFormat)).append("\n");
    sb.append("    trendOptions: ").append(toIndentedString(trendOptions)).append("\n");
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
