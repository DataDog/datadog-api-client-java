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

/**
 * Batch encoding configuration for the ClickHouse destination. Required when <code>format</code> is
 * <code>arrow_stream</code>. The <code>codec</code> field must be set to <code>arrow_stream</code>.
 */
@JsonPropertyOrder({
  ObservabilityPipelineClickhouseDestinationBatchEncoding.JSON_PROPERTY_ALLOW_NULLABLE_FIELDS,
  ObservabilityPipelineClickhouseDestinationBatchEncoding.JSON_PROPERTY_CODEC
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineClickhouseDestinationBatchEncoding {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_NULLABLE_FIELDS = "allow_nullable_fields";
  private Boolean allowNullableFields;

  public static final String JSON_PROPERTY_CODEC = "codec";
  private ObservabilityPipelineClickhouseDestinationBatchEncodingCodec codec;

  public ObservabilityPipelineClickhouseDestinationBatchEncoding() {}

  @JsonCreator
  public ObservabilityPipelineClickhouseDestinationBatchEncoding(
      @JsonProperty(required = true, value = JSON_PROPERTY_CODEC)
          ObservabilityPipelineClickhouseDestinationBatchEncodingCodec codec) {
    this.codec = codec;
    this.unparsed |= !codec.isValid();
  }

  public ObservabilityPipelineClickhouseDestinationBatchEncoding allowNullableFields(
      Boolean allowNullableFields) {
    this.allowNullableFields = allowNullableFields;
    return this;
  }

  /**
   * When <code>true</code>, null values are allowed for non-nullable fields in the ClickHouse
   * schema. When <code>false</code> (default), missing values for non-nullable columns cause
   * encoding errors.
   *
   * @return allowNullableFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_NULLABLE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowNullableFields() {
    return allowNullableFields;
  }

  public void setAllowNullableFields(Boolean allowNullableFields) {
    this.allowNullableFields = allowNullableFields;
  }

  public ObservabilityPipelineClickhouseDestinationBatchEncoding codec(
      ObservabilityPipelineClickhouseDestinationBatchEncodingCodec codec) {
    this.codec = codec;
    this.unparsed |= !codec.isValid();
    return this;
  }

  /**
   * The codec used for batch encoding. Only <code>arrow_stream</code> is supported.
   *
   * @return codec
   */
  @JsonProperty(JSON_PROPERTY_CODEC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineClickhouseDestinationBatchEncodingCodec getCodec() {
    return codec;
  }

  public void setCodec(ObservabilityPipelineClickhouseDestinationBatchEncodingCodec codec) {
    if (!codec.isValid()) {
      this.unparsed = true;
    }
    this.codec = codec;
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
   * @return ObservabilityPipelineClickhouseDestinationBatchEncoding
   */
  @JsonAnySetter
  public ObservabilityPipelineClickhouseDestinationBatchEncoding putAdditionalProperty(
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

  /**
   * Return true if this ObservabilityPipelineClickhouseDestinationBatchEncoding object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineClickhouseDestinationBatchEncoding
        observabilityPipelineClickhouseDestinationBatchEncoding =
            (ObservabilityPipelineClickhouseDestinationBatchEncoding) o;
    return Objects.equals(
            this.allowNullableFields,
            observabilityPipelineClickhouseDestinationBatchEncoding.allowNullableFields)
        && Objects.equals(this.codec, observabilityPipelineClickhouseDestinationBatchEncoding.codec)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineClickhouseDestinationBatchEncoding.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowNullableFields, codec, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineClickhouseDestinationBatchEncoding {\n");
    sb.append("    allowNullableFields: ")
        .append(toIndentedString(allowNullableFields))
        .append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
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
