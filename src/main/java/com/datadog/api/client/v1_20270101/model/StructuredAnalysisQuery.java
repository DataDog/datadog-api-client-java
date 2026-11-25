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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  StructuredAnalysisQuery.JSON_PROPERTY_SOURCE_DATASET,
  StructuredAnalysisQuery.JSON_PROPERTY_TRANSFORMATIONS,
  StructuredAnalysisQuery.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StructuredAnalysisQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SOURCE_DATASET = "source_dataset";
  private String sourceDataset;

  public static final String JSON_PROPERTY_TRANSFORMATIONS = "transformations";
  private List<StructuredAnalysisTransformation> transformations = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private StructuredAnalysisQueryType type;

  public StructuredAnalysisQuery() {}

  @JsonCreator
  public StructuredAnalysisQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_DATASET) String sourceDataset,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRANSFORMATIONS)
          List<StructuredAnalysisTransformation> transformations,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) StructuredAnalysisQueryType type) {
    this.sourceDataset = sourceDataset;
    this.transformations = transformations;
    for (StructuredAnalysisTransformation item : transformations) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public StructuredAnalysisQuery sourceDataset(String sourceDataset) {
    this.sourceDataset = sourceDataset;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sourceDataset
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_DATASET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSourceDataset() {
    return sourceDataset;
  }

  public void setSourceDataset(String sourceDataset) {
    this.sourceDataset = sourceDataset;
  }

  public StructuredAnalysisQuery transformations(
      List<StructuredAnalysisTransformation> transformations) {
    this.transformations = transformations;
    for (StructuredAnalysisTransformation item : transformations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public StructuredAnalysisQuery addTransformationsItem(
      StructuredAnalysisTransformation transformationsItem) {
    this.transformations.add(transformationsItem);
    this.unparsed |= transformationsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return transformations
   */
  @JsonProperty(JSON_PROPERTY_TRANSFORMATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<StructuredAnalysisTransformation> getTransformations() {
    return transformations;
  }

  public void setTransformations(List<StructuredAnalysisTransformation> transformations) {
    this.transformations = transformations;
    if (transformations != null) {
      for (StructuredAnalysisTransformation item : transformations) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public StructuredAnalysisQuery type(StructuredAnalysisQueryType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public StructuredAnalysisQueryType getType() {
    return type;
  }

  public void setType(StructuredAnalysisQueryType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this StructuredAnalysisQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredAnalysisQuery structuredAnalysisQuery = (StructuredAnalysisQuery) o;
    return Objects.equals(this.sourceDataset, structuredAnalysisQuery.sourceDataset)
        && Objects.equals(this.transformations, structuredAnalysisQuery.transformations)
        && Objects.equals(this.type, structuredAnalysisQuery.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceDataset, transformations, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredAnalysisQuery {\n");
    sb.append("    sourceDataset: ").append(toIndentedString(sourceDataset)).append("\n");
    sb.append("    transformations: ").append(toIndentedString(transformations)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
