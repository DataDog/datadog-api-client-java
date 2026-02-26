/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Object describing a file to be used as part of the request in the test. */
@JsonPropertyOrder({
  SyntheticsTestRequestBodyFile.JSON_PROPERTY_BUCKET_KEY,
  SyntheticsTestRequestBodyFile.JSON_PROPERTY_CONTENT,
  SyntheticsTestRequestBodyFile.JSON_PROPERTY_NAME,
  SyntheticsTestRequestBodyFile.JSON_PROPERTY_ORIGINAL_FILE_NAME,
  SyntheticsTestRequestBodyFile.JSON_PROPERTY_SIZE,
  SyntheticsTestRequestBodyFile.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestRequestBodyFile {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUCKET_KEY = "bucketKey";
  private String bucketKey;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORIGINAL_FILE_NAME = "originalFileName";
  private String originalFileName;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public SyntheticsTestRequestBodyFile bucketKey(String bucketKey) {
    this.bucketKey = bucketKey;
    return this;
  }

  /**
   * Bucket key of the file.
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

  public SyntheticsTestRequestBodyFile content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Content of the file.
   *
   * @return content
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public SyntheticsTestRequestBodyFile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the file.
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

  public SyntheticsTestRequestBodyFile originalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
    return this;
  }

  /**
   * Original name of the file.
   *
   * @return originalFileName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOriginalFileName() {
    return originalFileName;
  }

  public void setOriginalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
  }

  public SyntheticsTestRequestBodyFile size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Size of the file. minimum: 1 maximum: 3145728
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

  public SyntheticsTestRequestBodyFile type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the file.
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
   * @return SyntheticsTestRequestBodyFile
   */
  @JsonAnySetter
  public SyntheticsTestRequestBodyFile putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestRequestBodyFile object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestRequestBodyFile syntheticsTestRequestBodyFile = (SyntheticsTestRequestBodyFile) o;
    return Objects.equals(this.bucketKey, syntheticsTestRequestBodyFile.bucketKey)
        && Objects.equals(this.content, syntheticsTestRequestBodyFile.content)
        && Objects.equals(this.name, syntheticsTestRequestBodyFile.name)
        && Objects.equals(this.originalFileName, syntheticsTestRequestBodyFile.originalFileName)
        && Objects.equals(this.size, syntheticsTestRequestBodyFile.size)
        && Objects.equals(this.type, syntheticsTestRequestBodyFile.type)
        && Objects.equals(
            this.additionalProperties, syntheticsTestRequestBodyFile.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bucketKey, content, name, originalFileName, size, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestRequestBodyFile {\n");
    sb.append("    bucketKey: ").append(toIndentedString(bucketKey)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalFileName: ").append(toIndentedString(originalFileName)).append("\n");
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
