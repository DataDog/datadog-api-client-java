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

/** Settings of the Cloud Cost Management dataflow. */
@JsonPropertyOrder({
  NebiusCloudCostCollectionIntegrationDataflowSettingsResponse.JSON_PROPERTY_ACCESS_KEY_ID,
  NebiusCloudCostCollectionIntegrationDataflowSettingsResponse.JSON_PROPERTY_BUCKET_NAME,
  NebiusCloudCostCollectionIntegrationDataflowSettingsResponse.JSON_PROPERTY_BUCKET_PREFIX_PATH,
  NebiusCloudCostCollectionIntegrationDataflowSettingsResponse.JSON_PROPERTY_BUCKET_REGION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NebiusCloudCostCollectionIntegrationDataflowSettingsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_KEY_ID = "access_key_id";
  private String accessKeyId;

  public static final String JSON_PROPERTY_BUCKET_NAME = "bucket_name";
  private String bucketName;

  public static final String JSON_PROPERTY_BUCKET_PREFIX_PATH = "bucket_prefix_path";
  private String bucketPrefixPath;

  public static final String JSON_PROPERTY_BUCKET_REGION = "bucket_region";
  private String bucketRegion;

  public NebiusCloudCostCollectionIntegrationDataflowSettingsResponse accessKeyId(
      String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * ID of the Nebius Object Storage access key used to read the cost export bucket.
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

  public NebiusCloudCostCollectionIntegrationDataflowSettingsResponse bucketName(
      String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * Name of the Nebius Object Storage bucket holding the cost export.
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

  public NebiusCloudCostCollectionIntegrationDataflowSettingsResponse bucketPrefixPath(
      String bucketPrefixPath) {
    this.bucketPrefixPath = bucketPrefixPath;
    return this;
  }

  /**
   * Prefix path within the bucket that locates the cost export.
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

  public NebiusCloudCostCollectionIntegrationDataflowSettingsResponse bucketRegion(
      String bucketRegion) {
    this.bucketRegion = bucketRegion;
    return this;
  }

  /**
   * Region of the Nebius Object Storage bucket, such as <code>eu-north1</code>.
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
   * @return NebiusCloudCostCollectionIntegrationDataflowSettingsResponse
   */
  @JsonAnySetter
  public NebiusCloudCostCollectionIntegrationDataflowSettingsResponse putAdditionalProperty(
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
   * Return true if this NebiusCloudCostCollectionIntegrationDataflowSettingsResponse object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NebiusCloudCostCollectionIntegrationDataflowSettingsResponse
        nebiusCloudCostCollectionIntegrationDataflowSettingsResponse =
            (NebiusCloudCostCollectionIntegrationDataflowSettingsResponse) o;
    return Objects.equals(
            this.accessKeyId,
            nebiusCloudCostCollectionIntegrationDataflowSettingsResponse.accessKeyId)
        && Objects.equals(
            this.bucketName,
            nebiusCloudCostCollectionIntegrationDataflowSettingsResponse.bucketName)
        && Objects.equals(
            this.bucketPrefixPath,
            nebiusCloudCostCollectionIntegrationDataflowSettingsResponse.bucketPrefixPath)
        && Objects.equals(
            this.bucketRegion,
            nebiusCloudCostCollectionIntegrationDataflowSettingsResponse.bucketRegion)
        && Objects.equals(
            this.additionalProperties,
            nebiusCloudCostCollectionIntegrationDataflowSettingsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessKeyId, bucketName, bucketPrefixPath, bucketRegion, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NebiusCloudCostCollectionIntegrationDataflowSettingsResponse {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    bucketPrefixPath: ").append(toIndentedString(bucketPrefixPath)).append("\n");
    sb.append("    bucketRegion: ").append(toIndentedString(bucketRegion)).append("\n");
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
