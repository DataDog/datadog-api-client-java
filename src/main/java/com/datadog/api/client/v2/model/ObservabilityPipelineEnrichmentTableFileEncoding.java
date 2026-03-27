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

/** File encoding format. */
@JsonPropertyOrder({
  ObservabilityPipelineEnrichmentTableFileEncoding.JSON_PROPERTY_DELIMITER,
  ObservabilityPipelineEnrichmentTableFileEncoding.JSON_PROPERTY_INCLUDES_HEADERS,
  ObservabilityPipelineEnrichmentTableFileEncoding.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineEnrichmentTableFileEncoding {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELIMITER = "delimiter";
  private String delimiter;

  public static final String JSON_PROPERTY_INCLUDES_HEADERS = "includes_headers";
  private Boolean includesHeaders;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineEnrichmentTableFileEncodingType type;

  public ObservabilityPipelineEnrichmentTableFileEncoding() {}

  @JsonCreator
  public ObservabilityPipelineEnrichmentTableFileEncoding(
      @JsonProperty(required = true, value = JSON_PROPERTY_DELIMITER) String delimiter,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDES_HEADERS)
          Boolean includesHeaders,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineEnrichmentTableFileEncodingType type) {
    this.delimiter = delimiter;
    this.includesHeaders = includesHeaders;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineEnrichmentTableFileEncoding delimiter(String delimiter) {
    this.delimiter = delimiter;
    return this;
  }

  /**
   * The <code>encoding</code> <code>delimiter</code>.
   *
   * @return delimiter
   */
  @JsonProperty(JSON_PROPERTY_DELIMITER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDelimiter() {
    return delimiter;
  }

  public void setDelimiter(String delimiter) {
    this.delimiter = delimiter;
  }

  public ObservabilityPipelineEnrichmentTableFileEncoding includesHeaders(Boolean includesHeaders) {
    this.includesHeaders = includesHeaders;
    return this;
  }

  /**
   * The <code>encoding</code> <code>includes_headers</code>.
   *
   * @return includesHeaders
   */
  @JsonProperty(JSON_PROPERTY_INCLUDES_HEADERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIncludesHeaders() {
    return includesHeaders;
  }

  public void setIncludesHeaders(Boolean includesHeaders) {
    this.includesHeaders = includesHeaders;
  }

  public ObservabilityPipelineEnrichmentTableFileEncoding type(
      ObservabilityPipelineEnrichmentTableFileEncodingType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Specifies the encoding format (e.g., CSV) used for enrichment tables.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineEnrichmentTableFileEncodingType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineEnrichmentTableFileEncodingType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ObservabilityPipelineEnrichmentTableFileEncoding
   */
  @JsonAnySetter
  public ObservabilityPipelineEnrichmentTableFileEncoding putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ObservabilityPipelineEnrichmentTableFileEncoding object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineEnrichmentTableFileEncoding
        observabilityPipelineEnrichmentTableFileEncoding =
            (ObservabilityPipelineEnrichmentTableFileEncoding) o;
    return Objects.equals(
            this.delimiter, observabilityPipelineEnrichmentTableFileEncoding.delimiter)
        && Objects.equals(
            this.includesHeaders, observabilityPipelineEnrichmentTableFileEncoding.includesHeaders)
        && Objects.equals(this.type, observabilityPipelineEnrichmentTableFileEncoding.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineEnrichmentTableFileEncoding.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delimiter, includesHeaders, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineEnrichmentTableFileEncoding {\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
    sb.append("    includesHeaders: ").append(toIndentedString(includesHeaders)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
