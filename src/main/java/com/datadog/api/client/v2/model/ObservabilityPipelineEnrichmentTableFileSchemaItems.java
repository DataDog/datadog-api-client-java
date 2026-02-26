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
   * <p>Describes a single column and its type in an enrichment table schema.</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineEnrichmentTableFileSchemaItems.JSON_PROPERTY_COLUMN,
  ObservabilityPipelineEnrichmentTableFileSchemaItems.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineEnrichmentTableFileSchemaItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineEnrichmentTableFileSchemaItemsType type;

  public ObservabilityPipelineEnrichmentTableFileSchemaItems() {}

  @JsonCreator
  public ObservabilityPipelineEnrichmentTableFileSchemaItems(
            @JsonProperty(required=true, value=JSON_PROPERTY_COLUMN)String column,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineEnrichmentTableFileSchemaItemsType type) {
        this.column = column;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineEnrichmentTableFileSchemaItems column(String column) {
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
  public ObservabilityPipelineEnrichmentTableFileSchemaItems type(ObservabilityPipelineEnrichmentTableFileSchemaItemsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Declares allowed data types for enrichment table columns.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineEnrichmentTableFileSchemaItemsType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineEnrichmentTableFileSchemaItemsType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return ObservabilityPipelineEnrichmentTableFileSchemaItems
   */
  @JsonAnySetter
  public ObservabilityPipelineEnrichmentTableFileSchemaItems putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineEnrichmentTableFileSchemaItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineEnrichmentTableFileSchemaItems observabilityPipelineEnrichmentTableFileSchemaItems = (ObservabilityPipelineEnrichmentTableFileSchemaItems) o;
    return Objects.equals(this.column, observabilityPipelineEnrichmentTableFileSchemaItems.column) && Objects.equals(this.type, observabilityPipelineEnrichmentTableFileSchemaItems.type) && Objects.equals(this.additionalProperties, observabilityPipelineEnrichmentTableFileSchemaItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(column,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineEnrichmentTableFileSchemaItems {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
