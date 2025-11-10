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

/**
 * Upload configuration specifying how data is uploaded by the user, and properties of the table to
 * associate the upload with.
 */
@JsonPropertyOrder({
  CreateUploadRequestDataAttributes.JSON_PROPERTY_HEADERS,
  CreateUploadRequestDataAttributes.JSON_PROPERTY_PART_COUNT,
  CreateUploadRequestDataAttributes.JSON_PROPERTY_PART_SIZE,
  CreateUploadRequestDataAttributes.JSON_PROPERTY_TABLE_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateUploadRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HEADERS = "headers";
  private List<String> headers = new ArrayList<>();

  public static final String JSON_PROPERTY_PART_COUNT = "part_count";
  private Integer partCount;

  public static final String JSON_PROPERTY_PART_SIZE = "part_size";
  private Long partSize;

  public static final String JSON_PROPERTY_TABLE_NAME = "table_name";
  private String tableName;

  public CreateUploadRequestDataAttributes() {}

  @JsonCreator
  public CreateUploadRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_HEADERS) List<String> headers,
      @JsonProperty(required = true, value = JSON_PROPERTY_PART_COUNT) Integer partCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_PART_SIZE) Long partSize,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE_NAME) String tableName) {
    this.headers = headers;
    this.partCount = partCount;
    this.partSize = partSize;
    this.tableName = tableName;
  }

  public CreateUploadRequestDataAttributes headers(List<String> headers) {
    this.headers = headers;
    return this;
  }

  public CreateUploadRequestDataAttributes addHeadersItem(String headersItem) {
    this.headers.add(headersItem);
    return this;
  }

  /**
   * The CSV file headers that define the schema fields, provided in the same order as the columns
   * in the uploaded file.
   *
   * @return headers
   */
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getHeaders() {
    return headers;
  }

  public void setHeaders(List<String> headers) {
    this.headers = headers;
  }

  public CreateUploadRequestDataAttributes partCount(Integer partCount) {
    this.partCount = partCount;
    return this;
  }

  /**
   * Number of parts to split the file into for multipart upload. maximum: 20
   *
   * @return partCount
   */
  @JsonProperty(JSON_PROPERTY_PART_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getPartCount() {
    return partCount;
  }

  public void setPartCount(Integer partCount) {
    this.partCount = partCount;
  }

  public CreateUploadRequestDataAttributes partSize(Long partSize) {
    this.partSize = partSize;
    return this;
  }

  /**
   * The size of each part in the upload in bytes. All parts except the last one must be at least
   * 5,000,000 bytes.
   *
   * @return partSize
   */
  @JsonProperty(JSON_PROPERTY_PART_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPartSize() {
    return partSize;
  }

  public void setPartSize(Long partSize) {
    this.partSize = partSize;
  }

  public CreateUploadRequestDataAttributes tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * Name of the table to associate with this upload.
   *
   * @return tableName
   */
  @JsonProperty(JSON_PROPERTY_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
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
   * @return CreateUploadRequestDataAttributes
   */
  @JsonAnySetter
  public CreateUploadRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateUploadRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUploadRequestDataAttributes createUploadRequestDataAttributes =
        (CreateUploadRequestDataAttributes) o;
    return Objects.equals(this.headers, createUploadRequestDataAttributes.headers)
        && Objects.equals(this.partCount, createUploadRequestDataAttributes.partCount)
        && Objects.equals(this.partSize, createUploadRequestDataAttributes.partSize)
        && Objects.equals(this.tableName, createUploadRequestDataAttributes.tableName)
        && Objects.equals(
            this.additionalProperties, createUploadRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, partCount, partSize, tableName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUploadRequestDataAttributes {\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    partCount: ").append(toIndentedString(partCount)).append("\n");
    sb.append("    partSize: ").append(toIndentedString(partSize)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
