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
  GroupStyleRule.JSON_PROPERTY_MATCH,
  GroupStyleRule.JSON_PROPERTY_PALETTE,
  GroupStyleRule.JSON_PROPERTY_PALETTE_INDEX
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GroupStyleRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MATCH = "match";
  private GroupStyleRuleMatch match;

  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;

  public static final String JSON_PROPERTY_PALETTE_INDEX = "palette_index";
  private Double paletteIndex;

  public GroupStyleRule() {}

  @JsonCreator
  public GroupStyleRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_PALETTE) String palette) {
    this.palette = palette;
  }

  public GroupStyleRule match(GroupStyleRuleMatch match) {
    this.match = match;
    this.unparsed |= match.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return match
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GroupStyleRuleMatch getMatch() {
    return match;
  }

  public void setMatch(GroupStyleRuleMatch match) {
    this.match = match;
    if (match != null) {
      this.unparsed |= match.unparsed;
    }
  }

  public GroupStyleRule palette(String palette) {
    this.palette = palette;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return palette
   */
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPalette() {
    return palette;
  }

  public void setPalette(String palette) {
    this.palette = palette;
  }

  public GroupStyleRule paletteIndex(Double paletteIndex) {
    this.paletteIndex = paletteIndex;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return paletteIndex
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PALETTE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPaletteIndex() {
    return paletteIndex;
  }

  public void setPaletteIndex(Double paletteIndex) {
    this.paletteIndex = paletteIndex;
  }

  /** Return true if this GroupStyleRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupStyleRule groupStyleRule = (GroupStyleRule) o;
    return Objects.equals(this.match, groupStyleRule.match)
        && Objects.equals(this.palette, groupStyleRule.palette)
        && Objects.equals(this.paletteIndex, groupStyleRule.paletteIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(match, palette, paletteIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupStyleRule {\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
    sb.append("    paletteIndex: ").append(toIndentedString(paletteIndex)).append("\n");
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
