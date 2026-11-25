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
  TreemapBackendRequest20270101OneOf4463753824.JSON_PROPERTY_Q,
  TreemapBackendRequest20270101OneOf4463753824.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TreemapBackendRequest20270101OneOf4463753824 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public static final String JSON_PROPERTY_STYLE = "style";
  private TreemapRequestStyle style;

  public TreemapBackendRequest20270101OneOf4463753824() {}

  @JsonCreator
  public TreemapBackendRequest20270101OneOf4463753824(
      @JsonProperty(required = true, value = JSON_PROPERTY_Q) String q) {
    this.q = q;
  }

  public TreemapBackendRequest20270101OneOf4463753824 q(String q) {
    this.q = q;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return q
   */
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }

  public TreemapBackendRequest20270101OneOf4463753824 style(TreemapRequestStyle style) {
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
  public TreemapRequestStyle getStyle() {
    return style;
  }

  public void setStyle(TreemapRequestStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this TreemapBackendRequest20270101OneOf4463753824 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreemapBackendRequest20270101OneOf4463753824 treemapBackendRequest20270101OneOf4463753824 =
        (TreemapBackendRequest20270101OneOf4463753824) o;
    return Objects.equals(this.q, treemapBackendRequest20270101OneOf4463753824.q)
        && Objects.equals(this.style, treemapBackendRequest20270101OneOf4463753824.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(q, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreemapBackendRequest20270101OneOf4463753824 {\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
