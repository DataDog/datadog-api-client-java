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

/** File metadata for reference tables created by upload. */
@JsonPropertyOrder({
  TableResultV2DataAttributesFileMetadataLocalFile.JSON_PROPERTY_ERROR_MESSAGE,
  TableResultV2DataAttributesFileMetadataLocalFile.JSON_PROPERTY_ERROR_ROW_COUNT,
  TableResultV2DataAttributesFileMetadataLocalFile.JSON_PROPERTY_UPLOAD_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableResultV2DataAttributesFileMetadataLocalFile {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_ERROR_ROW_COUNT = "error_row_count";
  private Long errorRowCount;

  public static final String JSON_PROPERTY_UPLOAD_ID = "upload_id";
  private String uploadId;

  public TableResultV2DataAttributesFileMetadataLocalFile errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * The error message returned from the creation/update.
   *
   * @return errorMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public TableResultV2DataAttributesFileMetadataLocalFile errorRowCount(Long errorRowCount) {
    this.errorRowCount = errorRowCount;
    return this;
  }

  /**
   * The number of rows that failed to create/update.
   *
   * @return errorRowCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_ROW_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getErrorRowCount() {
    return errorRowCount;
  }

  public void setErrorRowCount(Long errorRowCount) {
    this.errorRowCount = errorRowCount;
  }

  public TableResultV2DataAttributesFileMetadataLocalFile uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }

  /**
   * The upload ID that was used to create/update the table.
   *
   * @return uploadId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUploadId() {
    return uploadId;
  }

  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
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
   * @return TableResultV2DataAttributesFileMetadataLocalFile
   */
  @JsonAnySetter
  public TableResultV2DataAttributesFileMetadataLocalFile putAdditionalProperty(
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

  /** Return true if this TableResultV2DataAttributesFileMetadataLocalFile object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableResultV2DataAttributesFileMetadataLocalFile
        tableResultV2DataAttributesFileMetadataLocalFile =
            (TableResultV2DataAttributesFileMetadataLocalFile) o;
    return Objects.equals(
            this.errorMessage, tableResultV2DataAttributesFileMetadataLocalFile.errorMessage)
        && Objects.equals(
            this.errorRowCount, tableResultV2DataAttributesFileMetadataLocalFile.errorRowCount)
        && Objects.equals(this.uploadId, tableResultV2DataAttributesFileMetadataLocalFile.uploadId)
        && Objects.equals(
            this.additionalProperties,
            tableResultV2DataAttributesFileMetadataLocalFile.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, errorRowCount, uploadId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableResultV2DataAttributesFileMetadataLocalFile {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorRowCount: ").append(toIndentedString(errorRowCount)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
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
