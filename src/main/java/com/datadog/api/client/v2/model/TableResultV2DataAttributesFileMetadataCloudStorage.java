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

/** File metadata for reference tables created by cloud storage. */
@JsonPropertyOrder({
  TableResultV2DataAttributesFileMetadataCloudStorage.JSON_PROPERTY_ACCESS_DETAILS,
  TableResultV2DataAttributesFileMetadataCloudStorage.JSON_PROPERTY_ERROR_MESSAGE,
  TableResultV2DataAttributesFileMetadataCloudStorage.JSON_PROPERTY_ERROR_ROW_COUNT,
  TableResultV2DataAttributesFileMetadataCloudStorage.JSON_PROPERTY_ERROR_TYPE,
  TableResultV2DataAttributesFileMetadataCloudStorage.JSON_PROPERTY_SYNC_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableResultV2DataAttributesFileMetadataCloudStorage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_DETAILS = "access_details";
  private TableResultV2DataAttributesFileMetadataOneOfAccessDetails accessDetails;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_ERROR_ROW_COUNT = "error_row_count";
  private Long errorRowCount;

  public static final String JSON_PROPERTY_ERROR_TYPE = "error_type";
  private TableResultV2DataAttributesFileMetadataCloudStorageErrorType errorType;

  public static final String JSON_PROPERTY_SYNC_ENABLED = "sync_enabled";
  private Boolean syncEnabled;

  public TableResultV2DataAttributesFileMetadataCloudStorage accessDetails(
      TableResultV2DataAttributesFileMetadataOneOfAccessDetails accessDetails) {
    this.accessDetails = accessDetails;
    this.unparsed |= accessDetails.unparsed;
    return this;
  }

  /**
   * The definition of <code>TableResultV2DataAttributesFileMetadataOneOfAccessDetails</code>
   * object.
   *
   * @return accessDetails
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TableResultV2DataAttributesFileMetadataOneOfAccessDetails getAccessDetails() {
    return accessDetails;
  }

  public void setAccessDetails(
      TableResultV2DataAttributesFileMetadataOneOfAccessDetails accessDetails) {
    this.accessDetails = accessDetails;
  }

  public TableResultV2DataAttributesFileMetadataCloudStorage errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * The error message returned from the sync.
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

  public TableResultV2DataAttributesFileMetadataCloudStorage errorRowCount(Long errorRowCount) {
    this.errorRowCount = errorRowCount;
    return this;
  }

  /**
   * The number of rows that failed to sync.
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

  public TableResultV2DataAttributesFileMetadataCloudStorage errorType(
      TableResultV2DataAttributesFileMetadataCloudStorageErrorType errorType) {
    this.errorType = errorType;
    this.unparsed |= !errorType.isValid();
    return this;
  }

  /**
   * The type of error that occurred during file processing. This field provides high-level error
   * categories for easier troubleshooting and is only present when there are errors.
   *
   * @return errorType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TableResultV2DataAttributesFileMetadataCloudStorageErrorType getErrorType() {
    return errorType;
  }

  public void setErrorType(TableResultV2DataAttributesFileMetadataCloudStorageErrorType errorType) {
    if (!errorType.isValid()) {
      this.unparsed = true;
    }
    this.errorType = errorType;
  }

  public TableResultV2DataAttributesFileMetadataCloudStorage syncEnabled(Boolean syncEnabled) {
    this.syncEnabled = syncEnabled;
    return this;
  }

  /**
   * Whether this table is synced automatically.
   *
   * @return syncEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSyncEnabled() {
    return syncEnabled;
  }

  public void setSyncEnabled(Boolean syncEnabled) {
    this.syncEnabled = syncEnabled;
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
   * @return TableResultV2DataAttributesFileMetadataCloudStorage
   */
  @JsonAnySetter
  public TableResultV2DataAttributesFileMetadataCloudStorage putAdditionalProperty(
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
   * Return true if this TableResultV2DataAttributesFileMetadataCloudStorage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableResultV2DataAttributesFileMetadataCloudStorage
        tableResultV2DataAttributesFileMetadataCloudStorage =
            (TableResultV2DataAttributesFileMetadataCloudStorage) o;
    return Objects.equals(
            this.accessDetails, tableResultV2DataAttributesFileMetadataCloudStorage.accessDetails)
        && Objects.equals(
            this.errorMessage, tableResultV2DataAttributesFileMetadataCloudStorage.errorMessage)
        && Objects.equals(
            this.errorRowCount, tableResultV2DataAttributesFileMetadataCloudStorage.errorRowCount)
        && Objects.equals(
            this.errorType, tableResultV2DataAttributesFileMetadataCloudStorage.errorType)
        && Objects.equals(
            this.syncEnabled, tableResultV2DataAttributesFileMetadataCloudStorage.syncEnabled)
        && Objects.equals(
            this.additionalProperties,
            tableResultV2DataAttributesFileMetadataCloudStorage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessDetails, errorMessage, errorRowCount, errorType, syncEnabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableResultV2DataAttributesFileMetadataCloudStorage {\n");
    sb.append("    accessDetails: ").append(toIndentedString(accessDetails)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorRowCount: ").append(toIndentedString(errorRowCount)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    syncEnabled: ").append(toIndentedString(syncEnabled)).append("\n");
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
