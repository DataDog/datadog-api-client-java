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
   * <p>Metadata specifying where and how to access the reference table's data file.</p>
   * <p>For cloud storage tables (S3/GCS/Azure):
   *   - sync_enabled and access_details will always be present
   *   - error fields (error_message, error_row_count, error_type) are present only when errors occur</p>
   * <p>For local file tables:
   *   - error fields (error_message, error_row_count) are present only when errors occur
   *   - sync_enabled, access_details are never present</p>
 */
@JsonPropertyOrder({
  TableResultV2DataAttributesFileMetadata.JSON_PROPERTY_ACCESS_DETAILS,
  TableResultV2DataAttributesFileMetadata.JSON_PROPERTY_ERROR_MESSAGE,
  TableResultV2DataAttributesFileMetadata.JSON_PROPERTY_ERROR_ROW_COUNT,
  TableResultV2DataAttributesFileMetadata.JSON_PROPERTY_ERROR_TYPE,
  TableResultV2DataAttributesFileMetadata.JSON_PROPERTY_SYNC_ENABLED
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableResultV2DataAttributesFileMetadata {
  @JsonIgnore
  public boolean unparsed = false;
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

  public TableResultV2DataAttributesFileMetadata accessDetails(TableResultV2DataAttributesFileMetadataOneOfAccessDetails accessDetails) {
    this.accessDetails = accessDetails;
    this.unparsed |= accessDetails.unparsed;
    return this;
  }

  /**
   * <p>Cloud storage access configuration for the reference table data file.</p>
   * @return accessDetails
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCESS_DETAILS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TableResultV2DataAttributesFileMetadataOneOfAccessDetails getAccessDetails() {
        return accessDetails;
      }
  public void setAccessDetails(TableResultV2DataAttributesFileMetadataOneOfAccessDetails accessDetails) {
    this.accessDetails = accessDetails;
  }
  public TableResultV2DataAttributesFileMetadata errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * <p>The error message returned from the last operation (sync for cloud storage, upload for local file).</p>
   * @return errorMessage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getErrorMessage() {
        return errorMessage;
      }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
  public TableResultV2DataAttributesFileMetadata errorRowCount(Long errorRowCount) {
    this.errorRowCount = errorRowCount;
    return this;
  }

  /**
   * <p>The number of rows that failed to process.</p>
   * @return errorRowCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERROR_ROW_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getErrorRowCount() {
        return errorRowCount;
      }
  public void setErrorRowCount(Long errorRowCount) {
    this.errorRowCount = errorRowCount;
  }
  public TableResultV2DataAttributesFileMetadata errorType(TableResultV2DataAttributesFileMetadataCloudStorageErrorType errorType) {
    this.errorType = errorType;
    this.unparsed |= !errorType.isValid();
    return this;
  }

  /**
   * <p>The type of error that occurred during file processing. This field provides high-level error categories for easier troubleshooting and is only present when there are errors.</p>
   * @return errorType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TableResultV2DataAttributesFileMetadataCloudStorageErrorType getErrorType() {
        return errorType;
      }
  public void setErrorType(TableResultV2DataAttributesFileMetadataCloudStorageErrorType errorType) {
    if (!errorType.isValid()) {
        this.unparsed = true;
    }
    this.errorType = errorType;
  }
  public TableResultV2DataAttributesFileMetadata syncEnabled(Boolean syncEnabled) {
    this.syncEnabled = syncEnabled;
    return this;
  }

  /**
   * <p>Whether this table is synced automatically from cloud storage. Only applicable for cloud storage sources.</p>
   * @return syncEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SYNC_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getSyncEnabled() {
        return syncEnabled;
      }
  public void setSyncEnabled(Boolean syncEnabled) {
    this.syncEnabled = syncEnabled;
  }

  /**
   * Return true if this TableResultV2DataAttributesFileMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableResultV2DataAttributesFileMetadata tableResultV2DataAttributesFileMetadata = (TableResultV2DataAttributesFileMetadata) o;
    return Objects.equals(this.accessDetails, tableResultV2DataAttributesFileMetadata.accessDetails) && Objects.equals(this.errorMessage, tableResultV2DataAttributesFileMetadata.errorMessage) && Objects.equals(this.errorRowCount, tableResultV2DataAttributesFileMetadata.errorRowCount) && Objects.equals(this.errorType, tableResultV2DataAttributesFileMetadata.errorType) && Objects.equals(this.syncEnabled, tableResultV2DataAttributesFileMetadata.syncEnabled);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accessDetails,errorMessage,errorRowCount,errorType,syncEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableResultV2DataAttributesFileMetadata {\n");
    sb.append("    accessDetails: ").append(toIndentedString(accessDetails)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorRowCount: ").append(toIndentedString(errorRowCount)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    syncEnabled: ").append(toIndentedString(syncEnabled)).append("\n");
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
