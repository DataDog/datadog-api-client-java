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
  TextReplacementRule.JSON_PROPERTY_MATCH,
  TextReplacementRule.JSON_PROPERTY_REPLACE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TextReplacementRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MATCH = "match";
  private TextMatch match;

  public static final String JSON_PROPERTY_REPLACE = "replace";
  private TextReplacementRule20270101Replace replace;

  public TextReplacementRule() {}

  @JsonCreator
  public TextReplacementRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_MATCH) TextMatch match) {
    this.match = match;
    this.unparsed |= match.unparsed;
  }

  public TextReplacementRule match(TextMatch match) {
    this.match = match;
    this.unparsed |= match.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return match
   */
  @JsonProperty(JSON_PROPERTY_MATCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TextMatch getMatch() {
    return match;
  }

  public void setMatch(TextMatch match) {
    this.match = match;
    if (match != null) {
      this.unparsed |= match.unparsed;
    }
  }

  public TextReplacementRule replace(TextReplacementRule20270101Replace replace) {
    this.replace = replace;
    this.unparsed |= replace.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return replace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TextReplacementRule20270101Replace getReplace() {
    return replace;
  }

  public void setReplace(TextReplacementRule20270101Replace replace) {
    this.replace = replace;
    if (replace != null) {
      this.unparsed |= replace.unparsed;
    }
  }

  /** Return true if this TextReplacementRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextReplacementRule textReplacementRule = (TextReplacementRule) o;
    return Objects.equals(this.match, textReplacementRule.match)
        && Objects.equals(this.replace, textReplacementRule.replace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(match, replace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextReplacementRule {\n");
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
