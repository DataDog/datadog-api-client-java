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

/** Settings of the Cloud Cost Management dataflow. Only the fields provided are changed. */
@JsonPropertyOrder({
  NebiusCloudCostCollectionIntegrationDataflowSettingsRequest.JSON_PROPERTY_ACCESS_KEY_ID,
  NebiusCloudCostCollectionIntegrationDataflowSettingsRequest.JSON_PROPERTY_ACCESS_KEY_SECRET,
  NebiusCloudCostCollectionIntegrationDataflowSettingsRequest.JSON_PROPERTY_BUCKET_NAME,
  NebiusCloudCostCollectionIntegrationDataflowSettingsRequest.JSON_PROPERTY_BUCKET_PREFIX_PATH,
  NebiusCloudCostCollectionIntegrationDataflowSettingsRequest.JSON_PROPERTY_BUCKET_REGION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NebiusCloudCostCollectionIntegrationDataflowSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_KEY_ID = "access_key_id";
  private String accessKeyId;

  public static final String JSON_PROPERTY_ACCESS_KEY_SECRET = "access_key_secret";
  private String accessKeySecret;

  public static final String JSON_PROPERTY_BUCKET_NAME = "bucket_name";
  private String bucketName;

  public static final String JSON_PROPERTY_BUCKET_PREFIX_PATH = "bucket_prefix_path";
  private String bucketPrefixPath;

  public static final String JSON_PROPERTY_BUCKET_REGION = "bucket_region";
  private String bucketRegion;

  public NebiusCloudCostCollectionIntegrationDataflowSettingsRequest accessKeyId(
      String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * ID of the Nebius Object Storage (S3-compatible) access key used to read the cost export bucket.
   * Required when this dataflow is enabled.
   *
   * @return accessKeyId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  public NebiusCloudCostCollectionIntegrationDataflowSettingsRequest accessKeySecret(
      String accessKeySecret) {
    this.accessKeySecret = accessKeySecret;
    return this;
  }

  /**
   * Secret access key for the access key ID. Required when this dataflow is enabled. Omit it on
   * update to keep the stored one; an empty string is rejected with a <code>422</code> response.
   *
   * @return accessKeySecret
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccessKeySecret() {
    return accessKeySecret;
  }

  public void setAccessKeySecret(String accessKeySecret) {
    this.accessKeySecret = accessKeySecret;
  }

  public NebiusCloudCostCollectionIntegrationDataflowSettingsRequest bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * Name of the Nebius Object Storage bucket holding your cost export. Required when this dataflow
   * is enabled; a request that enables it without the bucket fields and access keys is rejected
   * with a <code>422</code> response.
   *
   * @return bucketName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public NebiusCloudCostCollectionIntegrationDataflowSettingsRequest bucketPrefixPath(
      String bucketPrefixPath) {
    this.bucketPrefixPath = bucketPrefixPath;
    return this;
  }

  /**
   * Prefix path within the bucket that locates the cost export, combining the export name and path
   * prefix.
   *
   * @return bucketPrefixPath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUCKET_PREFIX_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBucketPrefixPath() {
    return bucketPrefixPath;
  }

  public void setBucketPrefixPath(String bucketPrefixPath) {
    this.bucketPrefixPath = bucketPrefixPath;
  }

  public NebiusCloudCostCollectionIntegrationDataflowSettingsRequest bucketRegion(
      String bucketRegion) {
    this.bucketRegion = bucketRegion;
    return this;
  }

  /**
   * Region of the Nebius Object Storage bucket, such as <code>eu-north1</code>. Required when this
   * dataflow is enabled.
   *
   * @return bucketRegion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUCKET_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBucketRegion() {
    return bucketRegion;
  }

  public void setBucketRegion(String bucketRegion) {
    this.bucketRegion = bucketRegion;
  }

  /**
   * Return true if this NebiusCloudCostCollectionIntegrationDataflowSettingsRequest object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NebiusCloudCostCollectionIntegrationDataflowSettingsRequest
        nebiusCloudCostCollectionIntegrationDataflowSettingsRequest =
            (NebiusCloudCostCollectionIntegrationDataflowSettingsRequest) o;
    return Objects.equals(
            this.accessKeyId,
            nebiusCloudCostCollectionIntegrationDataflowSettingsRequest.accessKeyId)
        && Objects.equals(
            this.accessKeySecret,
            nebiusCloudCostCollectionIntegrationDataflowSettingsRequest.accessKeySecret)
        && Objects.equals(
            this.bucketName, nebiusCloudCostCollectionIntegrationDataflowSettingsRequest.bucketName)
        && Objects.equals(
            this.bucketPrefixPath,
            nebiusCloudCostCollectionIntegrationDataflowSettingsRequest.bucketPrefixPath)
        && Objects.equals(
            this.bucketRegion,
            nebiusCloudCostCollectionIntegrationDataflowSettingsRequest.bucketRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, accessKeySecret, bucketName, bucketPrefixPath, bucketRegion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NebiusCloudCostCollectionIntegrationDataflowSettingsRequest {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    accessKeySecret: ").append(toIndentedString(accessKeySecret)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    bucketPrefixPath: ").append(toIndentedString(bucketPrefixPath)).append("\n");
    sb.append("    bucketRegion: ").append(toIndentedString(bucketRegion)).append("\n");
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
