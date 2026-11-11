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

/** A rule for matching and optionally replacing a group label. */
@JsonPropertyOrder({
  HeatgridTextFormatRule.JSON_PROPERTY_MATCH,
  HeatgridTextFormatRule.JSON_PROPERTY_REPLACE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridTextFormatRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MATCH = "match";
  private HeatgridTextFormatMatch match;

  public static final String JSON_PROPERTY_REPLACE = "replace";
  private HeatgridTextFormatReplace replace;

  public HeatgridTextFormatRule() {}

  @JsonCreator
  public HeatgridTextFormatRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_MATCH) HeatgridTextFormatMatch match) {
    this.match = match;
    this.unparsed |= match.unparsed;
  }

  public HeatgridTextFormatRule match(HeatgridTextFormatMatch match) {
    this.match = match;
    this.unparsed |= match.unparsed;
    return this;
  }

  /**
   * Match a group label against a string.
   *
   * @return match
   */
  @JsonProperty(JSON_PROPERTY_MATCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridTextFormatMatch getMatch() {
    return match;
  }

  public void setMatch(HeatgridTextFormatMatch match) {
    this.match = match;
    if (match != null) {
      this.unparsed |= match.unparsed;
    }
  }

  public HeatgridTextFormatRule replace(HeatgridTextFormatReplace replace) {
    this.replace = replace;
    this.unparsed |= replace.unparsed;
    return this;
  }

  /**
   * Replace all or part of a matching group label.
   *
   * @return replace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HeatgridTextFormatReplace getReplace() {
    return replace;
  }

  public void setReplace(HeatgridTextFormatReplace replace) {
    this.replace = replace;
    if (replace != null) {
      this.unparsed |= replace.unparsed;
    }
  }

  /** Return true if this HeatgridTextFormatRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridTextFormatRule heatgridTextFormatRule = (HeatgridTextFormatRule) o;
    return Objects.equals(this.match, heatgridTextFormatRule.match)
        && Objects.equals(this.replace, heatgridTextFormatRule.replace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(match, replace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridTextFormatRule {\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    replace: ").append(toIndentedString(replace)).append("\n");
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
