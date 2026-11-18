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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** How reference table rows are matched to entities. */
@JsonPropertyOrder({
  SegmentReferenceTableJoinCondition.JSON_PROPERTY_COLUMN_NAME,
  SegmentReferenceTableJoinCondition.JSON_PROPERTY_FACET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SegmentReferenceTableJoinCondition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN_NAME = "column_name";
  private String columnName;

  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public SegmentReferenceTableJoinCondition() {}

  @JsonCreator
  public SegmentReferenceTableJoinCondition(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN_NAME) String columnName) {
    this.columnName = columnName;
  }

  public SegmentReferenceTableJoinCondition columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * Reference table column that holds the entity ID.
   *
   * @return columnName
   */
  @JsonProperty(JSON_PROPERTY_COLUMN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public SegmentReferenceTableJoinCondition facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * Facet that identifies the entity, such as <code>@usr.id</code>.
   *
   * @return facet
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FACET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFacet() {
    return facet;
  }

  public void setFacet(String facet) {
    this.facet = facet;
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
   * @return SegmentReferenceTableJoinCondition
   */
  @JsonAnySetter
  public SegmentReferenceTableJoinCondition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SegmentReferenceTableJoinCondition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentReferenceTableJoinCondition segmentReferenceTableJoinCondition =
        (SegmentReferenceTableJoinCondition) o;
    return Objects.equals(this.columnName, segmentReferenceTableJoinCondition.columnName)
        && Objects.equals(this.facet, segmentReferenceTableJoinCondition.facet)
        && Objects.equals(
            this.additionalProperties, segmentReferenceTableJoinCondition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, facet, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentReferenceTableJoinCondition {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
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
