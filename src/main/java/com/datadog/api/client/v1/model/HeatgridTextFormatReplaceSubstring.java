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
import java.util.Objects;

/** Replace a substring of the matching group label. */
@JsonPropertyOrder({
  HeatgridTextFormatReplaceSubstring.JSON_PROPERTY_SUBSTRING,
  HeatgridTextFormatReplaceSubstring.JSON_PROPERTY_TYPE,
  HeatgridTextFormatReplaceSubstring.JSON_PROPERTY_WITH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridTextFormatReplaceSubstring {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SUBSTRING = "substring";
  private String substring;

  public static final String JSON_PROPERTY_TYPE = "type";
  private HeatgridTextFormatReplaceSubstringType type;

  public static final String JSON_PROPERTY_WITH = "with";
  private String with;

  public HeatgridTextFormatReplaceSubstring() {}

  @JsonCreator
  public HeatgridTextFormatReplaceSubstring(
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBSTRING) String substring,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          HeatgridTextFormatReplaceSubstringType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_WITH) String with) {
    this.substring = substring;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.with = with;
  }

  public HeatgridTextFormatReplaceSubstring substring(String substring) {
    this.substring = substring;
    return this;
  }

  /**
   * Substring to replace.
   *
   * @return substring
   */
  @JsonProperty(JSON_PROPERTY_SUBSTRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSubstring() {
    return substring;
  }

  public void setSubstring(String substring) {
    this.substring = substring;
  }

  public HeatgridTextFormatReplaceSubstring type(HeatgridTextFormatReplaceSubstringType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Replace a substring of a matching group label.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridTextFormatReplaceSubstringType getType() {
    return type;
  }

  public void setType(HeatgridTextFormatReplaceSubstringType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public HeatgridTextFormatReplaceSubstring with(String with) {
    this.with = with;
    return this;
  }

  /**
   * Replacement string.
   *
   * @return with
   */
  @JsonProperty(JSON_PROPERTY_WITH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWith() {
    return with;
  }

  public void setWith(String with) {
    this.with = with;
  }

  /** Return true if this HeatgridTextFormatReplaceSubstring object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridTextFormatReplaceSubstring heatgridTextFormatReplaceSubstring =
        (HeatgridTextFormatReplaceSubstring) o;
    return Objects.equals(this.substring, heatgridTextFormatReplaceSubstring.substring)
        && Objects.equals(this.type, heatgridTextFormatReplaceSubstring.type)
        && Objects.equals(this.with, heatgridTextFormatReplaceSubstring.with);
  }

  @Override
  public int hashCode() {
    return Objects.hash(substring, type, with);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridTextFormatReplaceSubstring {\n");
    sb.append("    substring: ").append(toIndentedString(substring)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    with: ").append(toIndentedString(with)).append("\n");
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
