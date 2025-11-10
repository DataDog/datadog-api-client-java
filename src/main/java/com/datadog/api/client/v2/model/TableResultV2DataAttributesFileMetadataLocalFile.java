/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * File metadata for reference tables created by upload. Note that upload_id is only returned in the
 * immediate create/replace response and is not available in subsequent GET requests.
 */
@JsonPropertyOrder({
  TableResultV2DataAttributesFileMetadataLocalFile.JSON_PROPERTY_ERROR_MESSAGE,
  TableResultV2DataAttributesFileMetadataLocalFile.JSON_PROPERTY_ERROR_ROW_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableResultV2DataAttributesFileMetadataLocalFile {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_ERROR_ROW_COUNT = "error_row_count";
  private Long errorRowCount;

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
            this.errorRowCount, tableResultV2DataAttributesFileMetadataLocalFile.errorRowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, errorRowCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableResultV2DataAttributesFileMetadataLocalFile {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorRowCount: ").append(toIndentedString(errorRowCount)).append("\n");
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
