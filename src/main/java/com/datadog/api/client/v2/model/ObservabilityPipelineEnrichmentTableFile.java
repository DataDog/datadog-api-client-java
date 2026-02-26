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

/** Defines a static enrichment table loaded from a CSV file. */
@JsonPropertyOrder({
  ObservabilityPipelineEnrichmentTableFile.JSON_PROPERTY_ENCODING,
  ObservabilityPipelineEnrichmentTableFile.JSON_PROPERTY_KEY,
  ObservabilityPipelineEnrichmentTableFile.JSON_PROPERTY_PATH,
  ObservabilityPipelineEnrichmentTableFile.JSON_PROPERTY_SCHEMA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineEnrichmentTableFile {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private ObservabilityPipelineEnrichmentTableFileEncoding encoding;

  public static final String JSON_PROPERTY_KEY = "key";
  private List<ObservabilityPipelineEnrichmentTableFileKeyItems> key = new ArrayList<>();

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private List<ObservabilityPipelineEnrichmentTableFileSchemaItems> schema = new ArrayList<>();

  public ObservabilityPipelineEnrichmentTableFile() {}

  @JsonCreator
  public ObservabilityPipelineEnrichmentTableFile(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENCODING)
          ObservabilityPipelineEnrichmentTableFileEncoding encoding,
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY)
          List<ObservabilityPipelineEnrichmentTableFileKeyItems> key,
      @JsonProperty(required = true, value = JSON_PROPERTY_PATH) String path,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCHEMA)
          List<ObservabilityPipelineEnrichmentTableFileSchemaItems> schema) {
    this.encoding = encoding;
    this.unparsed |= encoding.unparsed;
    this.key = key;
    this.path = path;
    this.schema = schema;
  }

  public ObservabilityPipelineEnrichmentTableFile encoding(
      ObservabilityPipelineEnrichmentTableFileEncoding encoding) {
    this.encoding = encoding;
    this.unparsed |= encoding.unparsed;
    return this;
  }

  /**
   * File encoding format.
   *
   * @return encoding
   */
  @JsonProperty(JSON_PROPERTY_ENCODING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineEnrichmentTableFileEncoding getEncoding() {
    return encoding;
  }

  public void setEncoding(ObservabilityPipelineEnrichmentTableFileEncoding encoding) {
    this.encoding = encoding;
  }

  public ObservabilityPipelineEnrichmentTableFile key(
      List<ObservabilityPipelineEnrichmentTableFileKeyItems> key) {
    this.key = key;
    for (ObservabilityPipelineEnrichmentTableFileKeyItems item : key) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineEnrichmentTableFile addKeyItem(
      ObservabilityPipelineEnrichmentTableFileKeyItems keyItem) {
    this.key.add(keyItem);
    this.unparsed |= keyItem.unparsed;
    return this;
  }

  /**
   * Key fields used to look up enrichment values.
   *
   * @return key
   */
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ObservabilityPipelineEnrichmentTableFileKeyItems> getKey() {
    return key;
  }

  public void setKey(List<ObservabilityPipelineEnrichmentTableFileKeyItems> key) {
    this.key = key;
  }

  public ObservabilityPipelineEnrichmentTableFile path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path to the CSV file.
   *
   * @return path
   */
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ObservabilityPipelineEnrichmentTableFile schema(
      List<ObservabilityPipelineEnrichmentTableFileSchemaItems> schema) {
    this.schema = schema;
    for (ObservabilityPipelineEnrichmentTableFileSchemaItems item : schema) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineEnrichmentTableFile addSchemaItem(
      ObservabilityPipelineEnrichmentTableFileSchemaItems schemaItem) {
    this.schema.add(schemaItem);
    this.unparsed |= schemaItem.unparsed;
    return this;
  }

  /**
   * Schema defining column names and their types.
   *
   * @return schema
   */
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ObservabilityPipelineEnrichmentTableFileSchemaItems> getSchema() {
    return schema;
  }

  public void setSchema(List<ObservabilityPipelineEnrichmentTableFileSchemaItems> schema) {
    this.schema = schema;
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
   * @return ObservabilityPipelineEnrichmentTableFile
   */
  @JsonAnySetter
  public ObservabilityPipelineEnrichmentTableFile putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineEnrichmentTableFile object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineEnrichmentTableFile observabilityPipelineEnrichmentTableFile =
        (ObservabilityPipelineEnrichmentTableFile) o;
    return Objects.equals(this.encoding, observabilityPipelineEnrichmentTableFile.encoding)
        && Objects.equals(this.key, observabilityPipelineEnrichmentTableFile.key)
        && Objects.equals(this.path, observabilityPipelineEnrichmentTableFile.path)
        && Objects.equals(this.schema, observabilityPipelineEnrichmentTableFile.schema)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineEnrichmentTableFile.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, key, path, schema, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineEnrichmentTableFile {\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
