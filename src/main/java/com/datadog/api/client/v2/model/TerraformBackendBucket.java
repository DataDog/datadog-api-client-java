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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Synchronization status for an S3 bucket. */
@JsonPropertyOrder({
  TerraformBackendBucket.JSON_PROPERTY_BUCKET_NAME,
  TerraformBackendBucket.JSON_PROPERTY_LAST_SYNC_ERROR,
  TerraformBackendBucket.JSON_PROPERTY_LAST_SYNC_STATUS,
  TerraformBackendBucket.JSON_PROPERTY_LAST_SYNC_TIME,
  TerraformBackendBucket.JSON_PROPERTY_RECURRING_BLOB_SYNC_ID,
  TerraformBackendBucket.JSON_PROPERTY_STATEFILE_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TerraformBackendBucket {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUCKET_NAME = "bucket_name";
  private String bucketName;

  public static final String JSON_PROPERTY_LAST_SYNC_ERROR = "last_sync_error";
  private String lastSyncError;

  public static final String JSON_PROPERTY_LAST_SYNC_STATUS = "last_sync_status";
  private TerraformBackendSyncStatus lastSyncStatus;

  public static final String JSON_PROPERTY_LAST_SYNC_TIME = "last_sync_time";
  private OffsetDateTime lastSyncTime;

  public static final String JSON_PROPERTY_RECURRING_BLOB_SYNC_ID = "recurring_blob_sync_id";
  private String recurringBlobSyncId;

  public static final String JSON_PROPERTY_STATEFILE_COUNT = "statefile_count";
  private Long statefileCount;

  public TerraformBackendBucket() {}

  @JsonCreator
  public TerraformBackendBucket(
      @JsonProperty(required = true, value = JSON_PROPERTY_BUCKET_NAME) String bucketName,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_SYNC_ERROR) String lastSyncError,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_SYNC_STATUS)
          TerraformBackendSyncStatus lastSyncStatus,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_SYNC_TIME)
          OffsetDateTime lastSyncTime,
      @JsonProperty(required = true, value = JSON_PROPERTY_RECURRING_BLOB_SYNC_ID)
          String recurringBlobSyncId,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATEFILE_COUNT) Long statefileCount) {
    this.bucketName = bucketName;
    this.lastSyncError = lastSyncError;
    this.lastSyncStatus = lastSyncStatus;
    this.unparsed |= !lastSyncStatus.isValid();
    this.lastSyncTime = lastSyncTime;
    if (lastSyncTime != null) {}
    this.recurringBlobSyncId = recurringBlobSyncId;
    this.statefileCount = statefileCount;
  }

  public TerraformBackendBucket bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * Name of the source S3 bucket.
   *
   * @return bucketName
   */
  @JsonProperty(JSON_PROPERTY_BUCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public TerraformBackendBucket lastSyncError(String lastSyncError) {
    this.lastSyncError = lastSyncError;
    return this;
  }

  /**
   * Error from the most recent failed synchronization, or an empty string otherwise.
   *
   * @return lastSyncError
   */
  @JsonProperty(JSON_PROPERTY_LAST_SYNC_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLastSyncError() {
    return lastSyncError;
  }

  public void setLastSyncError(String lastSyncError) {
    this.lastSyncError = lastSyncError;
  }

  public TerraformBackendBucket lastSyncStatus(TerraformBackendSyncStatus lastSyncStatus) {
    this.lastSyncStatus = lastSyncStatus;
    this.unparsed |= !lastSyncStatus.isValid();
    return this;
  }

  /**
   * Most recent synchronization outcome, or pending if no outcome has been recorded.
   *
   * @return lastSyncStatus
   */
  @JsonProperty(JSON_PROPERTY_LAST_SYNC_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TerraformBackendSyncStatus getLastSyncStatus() {
    return lastSyncStatus;
  }

  public void setLastSyncStatus(TerraformBackendSyncStatus lastSyncStatus) {
    if (!lastSyncStatus.isValid()) {
      this.unparsed = true;
    }
    this.lastSyncStatus = lastSyncStatus;
  }

  public TerraformBackendBucket lastSyncTime(OffsetDateTime lastSyncTime) {
    this.lastSyncTime = lastSyncTime;
    if (lastSyncTime != null) {}
    return this;
  }

  /**
   * Time of the most recent synchronization outcome, or null if none has been recorded.
   *
   * @return lastSyncTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SYNC_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastSyncTime() {
    return lastSyncTime;
  }

  public void setLastSyncTime(OffsetDateTime lastSyncTime) {
    this.lastSyncTime = lastSyncTime;
  }

  public TerraformBackendBucket recurringBlobSyncId(String recurringBlobSyncId) {
    this.recurringBlobSyncId = recurringBlobSyncId;
    return this;
  }

  /**
   * Identifier of the recurring synchronization job.
   *
   * @return recurringBlobSyncId
   */
  @JsonProperty(JSON_PROPERTY_RECURRING_BLOB_SYNC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRecurringBlobSyncId() {
    return recurringBlobSyncId;
  }

  public void setRecurringBlobSyncId(String recurringBlobSyncId) {
    this.recurringBlobSyncId = recurringBlobSyncId;
  }

  public TerraformBackendBucket statefileCount(Long statefileCount) {
    this.statefileCount = statefileCount;
    return this;
  }

  /**
   * Number of synchronized Terraform state files in the bucket.
   *
   * @return statefileCount
   */
  @JsonProperty(JSON_PROPERTY_STATEFILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getStatefileCount() {
    return statefileCount;
  }

  public void setStatefileCount(Long statefileCount) {
    this.statefileCount = statefileCount;
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
   * @return TerraformBackendBucket
   */
  @JsonAnySetter
  public TerraformBackendBucket putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TerraformBackendBucket object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerraformBackendBucket terraformBackendBucket = (TerraformBackendBucket) o;
    return Objects.equals(this.bucketName, terraformBackendBucket.bucketName)
        && Objects.equals(this.lastSyncError, terraformBackendBucket.lastSyncError)
        && Objects.equals(this.lastSyncStatus, terraformBackendBucket.lastSyncStatus)
        && Objects.equals(this.lastSyncTime, terraformBackendBucket.lastSyncTime)
        && Objects.equals(this.recurringBlobSyncId, terraformBackendBucket.recurringBlobSyncId)
        && Objects.equals(this.statefileCount, terraformBackendBucket.statefileCount)
        && Objects.equals(this.additionalProperties, terraformBackendBucket.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bucketName,
        lastSyncError,
        lastSyncStatus,
        lastSyncTime,
        recurringBlobSyncId,
        statefileCount,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerraformBackendBucket {\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    lastSyncError: ").append(toIndentedString(lastSyncError)).append("\n");
    sb.append("    lastSyncStatus: ").append(toIndentedString(lastSyncStatus)).append("\n");
    sb.append("    lastSyncTime: ").append(toIndentedString(lastSyncTime)).append("\n");
    sb.append("    recurringBlobSyncId: ")
        .append(toIndentedString(recurringBlobSyncId))
        .append("\n");
    sb.append("    statefileCount: ").append(toIndentedString(statefileCount)).append("\n");
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
