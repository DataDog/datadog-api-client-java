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
 * Cloud storage file metadata for patch requests. Allows partial updates of access_details and
 * sync_enabled.
 */
@JsonPropertyOrder({
  PatchTableRequestDataAttributesFileMetadataCloudStorage.JSON_PROPERTY_ACCESS_DETAILS,
  PatchTableRequestDataAttributesFileMetadataCloudStorage.JSON_PROPERTY_SYNC_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PatchTableRequestDataAttributesFileMetadataCloudStorage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_DETAILS = "access_details";
  private PatchTableRequestDataAttributesFileMetadataOneOfAccessDetails accessDetails;

  public static final String JSON_PROPERTY_SYNC_ENABLED = "sync_enabled";
  private Boolean syncEnabled;

  public PatchTableRequestDataAttributesFileMetadataCloudStorage accessDetails(
      PatchTableRequestDataAttributesFileMetadataOneOfAccessDetails accessDetails) {
    this.accessDetails = accessDetails;
    this.unparsed |= accessDetails.unparsed;
    return this;
  }

  /**
   * The definition of <code>PatchTableRequestDataAttributesFileMetadataOneOfAccessDetails</code>
   * object.
   *
   * @return accessDetails
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PatchTableRequestDataAttributesFileMetadataOneOfAccessDetails getAccessDetails() {
    return accessDetails;
  }

  public void setAccessDetails(
      PatchTableRequestDataAttributesFileMetadataOneOfAccessDetails accessDetails) {
    this.accessDetails = accessDetails;
  }

  public PatchTableRequestDataAttributesFileMetadataCloudStorage syncEnabled(Boolean syncEnabled) {
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
   * Return true if this PatchTableRequestDataAttributesFileMetadataCloudStorage object is equal to
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
    PatchTableRequestDataAttributesFileMetadataCloudStorage
        patchTableRequestDataAttributesFileMetadataCloudStorage =
            (PatchTableRequestDataAttributesFileMetadataCloudStorage) o;
    return Objects.equals(
            this.accessDetails,
            patchTableRequestDataAttributesFileMetadataCloudStorage.accessDetails)
        && Objects.equals(
            this.syncEnabled, patchTableRequestDataAttributesFileMetadataCloudStorage.syncEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessDetails, syncEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchTableRequestDataAttributesFileMetadataCloudStorage {\n");
    sb.append("    accessDetails: ").append(toIndentedString(accessDetails)).append("\n");
    sb.append("    syncEnabled: ").append(toIndentedString(syncEnabled)).append("\n");
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
