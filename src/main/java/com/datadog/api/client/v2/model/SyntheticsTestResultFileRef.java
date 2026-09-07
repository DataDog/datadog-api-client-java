/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Reference to a file attached to a Synthetic test request. */
@JsonPropertyOrder({
  SyntheticsTestResultFileRef.JSON_PROPERTY_BUCKET_KEY,
  SyntheticsTestResultFileRef.JSON_PROPERTY_ENCODING,
  SyntheticsTestResultFileRef.JSON_PROPERTY_NAME,
  SyntheticsTestResultFileRef.JSON_PROPERTY_SIZE,
  SyntheticsTestResultFileRef.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultFileRef {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUCKET_KEY = "bucket_key";
  private String bucketKey;

  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private String encoding;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public SyntheticsTestResultFileRef bucketKey(String bucketKey) {
    this.bucketKey = bucketKey;
    return this;
  }

  /**
   * Storage bucket key where the file is stored.
   *
   * @return bucketKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUCKET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBucketKey() {
    return bucketKey;
  }

  public void setBucketKey(String bucketKey) {
    this.bucketKey = bucketKey;
  }

  public SyntheticsTestResultFileRef encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * Encoding of the file contents.
   *
   * @return encoding
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public SyntheticsTestResultFileRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * File name.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyntheticsTestResultFileRef size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * File size in bytes.
   *
   * @return size
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public SyntheticsTestResultFileRef type(String type) {
    this.type = type;
    return this;
  }

  /**
   * File MIME type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
   * @return SyntheticsTestResultFileRef
   */
  @JsonAnySetter
  public SyntheticsTestResultFileRef putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultFileRef object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultFileRef syntheticsTestResultFileRef = (SyntheticsTestResultFileRef) o;
    return Objects.equals(this.bucketKey, syntheticsTestResultFileRef.bucketKey)
        && Objects.equals(this.encoding, syntheticsTestResultFileRef.encoding)
        && Objects.equals(this.name, syntheticsTestResultFileRef.name)
        && Objects.equals(this.size, syntheticsTestResultFileRef.size)
        && Objects.equals(this.type, syntheticsTestResultFileRef.type)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultFileRef.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketKey, encoding, name, size, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultFileRef {\n");
    sb.append("    bucketKey: ").append(toIndentedString(bucketKey)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
