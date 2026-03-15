/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Formats a guided table column as a number or a bar. */
@JsonPropertyOrder({
  GuidedTableNumberBarColumnFormat.JSON_PROPERTY_CONDITIONAL_FORMATS,
  GuidedTableNumberBarColumnFormat.JSON_PROPERTY_MODE,
  GuidedTableNumberBarColumnFormat.JSON_PROPERTY_NUMBER_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuidedTableNumberBarColumnFormat {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private GuidedTableConditionalFormats conditionalFormats;

  public static final String JSON_PROPERTY_MODE = "mode";
  private GuidedTableNumberBarColumnFormatMode mode;

  public static final String JSON_PROPERTY_NUMBER_FORMAT = "number_format";
  private GuidedTableNumberFormat numberFormat;

  public GuidedTableNumberBarColumnFormat() {}

  @JsonCreator
  public GuidedTableNumberBarColumnFormat(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          GuidedTableNumberBarColumnFormatMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
  }

  public GuidedTableNumberBarColumnFormat conditionalFormats(
      GuidedTableConditionalFormats conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    this.unparsed |= conditionalFormats.unparsed;
    return this;
  }

  /**
   * Conditional formatting rules for a guided table column. Either an array of threshold-based
   * rules or a single range-based rule.
   *
   * @return conditionalFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GuidedTableConditionalFormats getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(GuidedTableConditionalFormats conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
  }

  public GuidedTableNumberBarColumnFormat mode(GuidedTableNumberBarColumnFormatMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Getmode
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GuidedTableNumberBarColumnFormatMode getMode() {
    return mode;
  }

  public void setMode(GuidedTableNumberBarColumnFormatMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public GuidedTableNumberBarColumnFormat numberFormat(GuidedTableNumberFormat numberFormat) {
    this.numberFormat = numberFormat;
    this.unparsed |= numberFormat.unparsed;
    return this;
  }

  /**
   * Number display format for a guided table column value.
   *
   * @return numberFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GuidedTableNumberFormat getNumberFormat() {
    return numberFormat;
  }

  public void setNumberFormat(GuidedTableNumberFormat numberFormat) {
    this.numberFormat = numberFormat;
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
   * @return GuidedTableNumberBarColumnFormat
   */
  @JsonAnySetter
  public GuidedTableNumberBarColumnFormat putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuidedTableNumberBarColumnFormat object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTableNumberBarColumnFormat guidedTableNumberBarColumnFormat =
        (GuidedTableNumberBarColumnFormat) o;
    return Objects.equals(
            this.conditionalFormats, guidedTableNumberBarColumnFormat.conditionalFormats)
        && Objects.equals(this.mode, guidedTableNumberBarColumnFormat.mode)
        && Objects.equals(this.numberFormat, guidedTableNumberBarColumnFormat.numberFormat)
        && Objects.equals(
            this.additionalProperties, guidedTableNumberBarColumnFormat.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalFormats, mode, numberFormat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTableNumberBarColumnFormat {\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    numberFormat: ").append(toIndentedString(numberFormat)).append("\n");
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
