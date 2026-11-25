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
  NumberBarTableColumnFormatBar.JSON_PROPERTY_CONDITIONAL_FORMATS,
  NumberBarTableColumnFormatBar.JSON_PROPERTY_MODE,
  NumberBarTableColumnFormatBar.JSON_PROPERTY_NUMBER_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NumberBarTableColumnFormatBar {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private ConditionalFormats conditionalFormats;

  public static final String JSON_PROPERTY_MODE = "mode";
  private NumberBarTableColumnFormatBarMode mode;

  public static final String JSON_PROPERTY_NUMBER_FORMAT = "number_format";
  private WidgetNumberFormat numberFormat;

  public NumberBarTableColumnFormatBar() {}

  @JsonCreator
  public NumberBarTableColumnFormatBar(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          NumberBarTableColumnFormatBarMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
  }

  public NumberBarTableColumnFormatBar conditionalFormats(ConditionalFormats conditionalFormats) {
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

  public NumberBarTableColumnFormatBar mode(NumberBarTableColumnFormatBarMode mode) {
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
  public NumberBarTableColumnFormatBarMode getMode() {
    return mode;
  }

  public void setMode(NumberBarTableColumnFormatBarMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public NumberBarTableColumnFormatBar numberFormat(WidgetNumberFormat numberFormat) {
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

  /** Return true if this NumberBarTableColumnFormatBar object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberBarTableColumnFormatBar numberBarTableColumnFormatBar = (NumberBarTableColumnFormatBar) o;
    return Objects.equals(this.conditionalFormats, numberBarTableColumnFormatBar.conditionalFormats)
        && Objects.equals(this.mode, numberBarTableColumnFormatBar.mode)
        && Objects.equals(this.numberFormat, numberBarTableColumnFormatBar.numberFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalFormats, mode, numberFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberBarTableColumnFormatBar {\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    numberFormat: ").append(toIndentedString(numberFormat)).append("\n");
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
