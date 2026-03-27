/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Defines how to map log fields to enrichment table columns during lookups.</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineEnrichmentTableFileKeyItems.JSON_PROPERTY_COLUMN,
  ObservabilityPipelineEnrichmentTableFileKeyItems.JSON_PROPERTY_COMPARISON,
  ObservabilityPipelineEnrichmentTableFileKeyItems.JSON_PROPERTY_FIELD
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineEnrichmentTableFileKeyItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_COMPARISON = "comparison";
  private ObservabilityPipelineEnrichmentTableFileKeyItemsComparison comparison;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public ObservabilityPipelineEnrichmentTableFileKeyItems() {}

  @JsonCreator
  public ObservabilityPipelineEnrichmentTableFileKeyItems(
            @JsonProperty(required=true, value=JSON_PROPERTY_COLUMN)String column,
            @JsonProperty(required=true, value=JSON_PROPERTY_COMPARISON)ObservabilityPipelineEnrichmentTableFileKeyItemsComparison comparison,
            @JsonProperty(required=true, value=JSON_PROPERTY_FIELD)String field) {
        this.column = column;
        this.comparison = comparison;
        this.unparsed |= !comparison.isValid();
        this.field = field;
  }
  public ObservabilityPipelineEnrichmentTableFileKeyItems column(String column) {
    this.column = column;
    return this;
  }

  /**
   * <p>The <code>items</code> <code>column</code>.</p>
   * @return column
  **/
      @JsonProperty(JSON_PROPERTY_COLUMN)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getColumn() {
        return column;
      }
  public void setColumn(String column) {
    this.column = column;
  }
  public ObservabilityPipelineEnrichmentTableFileKeyItems comparison(ObservabilityPipelineEnrichmentTableFileKeyItemsComparison comparison) {
    this.comparison = comparison;
    this.unparsed |= !comparison.isValid();
    return this;
  }

  /**
   * <p>Defines how to compare key fields for enrichment table lookups.</p>
   * @return comparison
  **/
      @JsonProperty(JSON_PROPERTY_COMPARISON)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineEnrichmentTableFileKeyItemsComparison getComparison() {
        return comparison;
      }
  public void setComparison(ObservabilityPipelineEnrichmentTableFileKeyItemsComparison comparison) {
    if (!comparison.isValid()) {
        this.unparsed = true;
    }
    this.comparison = comparison;
  }
  public ObservabilityPipelineEnrichmentTableFileKeyItems field(String field) {
    this.field = field;
    return this;
  }

  /**
   * <p>The <code>items</code> <code>field</code>.</p>
   * @return field
  **/
      @JsonProperty(JSON_PROPERTY_FIELD)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getField() {
        return field;
      }
  public void setField(String field) {
    this.field = field;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ObservabilityPipelineEnrichmentTableFileKeyItems
   */
  @JsonAnySetter
  public ObservabilityPipelineEnrichmentTableFileKeyItems putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this ObservabilityPipelineEnrichmentTableFileKeyItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineEnrichmentTableFileKeyItems observabilityPipelineEnrichmentTableFileKeyItems = (ObservabilityPipelineEnrichmentTableFileKeyItems) o;
    return Objects.equals(this.column, observabilityPipelineEnrichmentTableFileKeyItems.column) && Objects.equals(this.comparison, observabilityPipelineEnrichmentTableFileKeyItems.comparison) && Objects.equals(this.field, observabilityPipelineEnrichmentTableFileKeyItems.field) && Objects.equals(this.additionalProperties, observabilityPipelineEnrichmentTableFileKeyItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(column,comparison,field, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineEnrichmentTableFileKeyItems {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
