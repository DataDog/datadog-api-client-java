/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Members of the previewed segment. */
@JsonPropertyOrder({
  SegmentPreviewResponseAttributes.JSON_PROPERTY_HITS,
  SegmentPreviewResponseAttributes.JSON_PROPERTY_TOTAL_ROWS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SegmentPreviewResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HITS = "hits";
  private List<Map<String, Object>> hits = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_ROWS = "total_rows";
  private Long totalRows;

  public SegmentPreviewResponseAttributes() {}

  @JsonCreator
  public SegmentPreviewResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_HITS) List<Map<String, Object>> hits,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_ROWS) Long totalRows) {
    this.hits = hits;
    this.totalRows = totalRows;
  }

  public SegmentPreviewResponseAttributes hits(List<Map<String, Object>> hits) {
    this.hits = hits;
    return this;
  }

  public SegmentPreviewResponseAttributes addHitsItem(Map<String, Object> hitsItem) {
    this.hits.add(hitsItem);
    return this;
  }

  /**
   * Rows of the preview, each as a map of column names to values.
   *
   * @return hits
   */
  @JsonProperty(JSON_PROPERTY_HITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Map<String, Object>> getHits() {
    return hits;
  }

  public void setHits(List<Map<String, Object>> hits) {
    this.hits = hits;
  }

  public SegmentPreviewResponseAttributes totalRows(Long totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  /**
   * Total number of entities in the segment.
   *
   * @return totalRows
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_ROWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalRows() {
    return totalRows;
  }

  public void setTotalRows(Long totalRows) {
    this.totalRows = totalRows;
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
   * @return SegmentPreviewResponseAttributes
   */
  @JsonAnySetter
  public SegmentPreviewResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SegmentPreviewResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentPreviewResponseAttributes segmentPreviewResponseAttributes =
        (SegmentPreviewResponseAttributes) o;
    return Objects.equals(this.hits, segmentPreviewResponseAttributes.hits)
        && Objects.equals(this.totalRows, segmentPreviewResponseAttributes.totalRows)
        && Objects.equals(
            this.additionalProperties, segmentPreviewResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hits, totalRows, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentPreviewResponseAttributes {\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
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
