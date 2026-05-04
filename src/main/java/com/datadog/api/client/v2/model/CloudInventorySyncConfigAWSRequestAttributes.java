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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** AWS settings for the customer bucket that stores inventory reports. */
@JsonPropertyOrder({
  CloudInventorySyncConfigAWSRequestAttributes.JSON_PROPERTY_AWS_ACCOUNT_ID,
  CloudInventorySyncConfigAWSRequestAttributes.JSON_PROPERTY_DESTINATION_BUCKET_NAME,
  CloudInventorySyncConfigAWSRequestAttributes.JSON_PROPERTY_DESTINATION_BUCKET_REGION,
  CloudInventorySyncConfigAWSRequestAttributes.JSON_PROPERTY_DESTINATION_PREFIX
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudInventorySyncConfigAWSRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AWS_ACCOUNT_ID = "aws_account_id";
  private String awsAccountId;

  public static final String JSON_PROPERTY_DESTINATION_BUCKET_NAME = "destination_bucket_name";
  private String destinationBucketName;

  public static final String JSON_PROPERTY_DESTINATION_BUCKET_REGION = "destination_bucket_region";
  private String destinationBucketRegion;

  public static final String JSON_PROPERTY_DESTINATION_PREFIX = "destination_prefix";
  private String destinationPrefix;

  public CloudInventorySyncConfigAWSRequestAttributes() {}

  @JsonCreator
  public CloudInventorySyncConfigAWSRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AWS_ACCOUNT_ID) String awsAccountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESTINATION_BUCKET_NAME)
          String destinationBucketName,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESTINATION_BUCKET_REGION)
          String destinationBucketRegion) {
    this.awsAccountId = awsAccountId;
    this.destinationBucketName = destinationBucketName;
    this.destinationBucketRegion = destinationBucketRegion;
  }

  public CloudInventorySyncConfigAWSRequestAttributes awsAccountId(String awsAccountId) {
    this.awsAccountId = awsAccountId;
    return this;
  }

  /**
   * AWS account ID that owns the inventory bucket.
   *
   * @return awsAccountId
   */
  @JsonProperty(JSON_PROPERTY_AWS_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAwsAccountId() {
    return awsAccountId;
  }

  public void setAwsAccountId(String awsAccountId) {
    this.awsAccountId = awsAccountId;
  }

  public CloudInventorySyncConfigAWSRequestAttributes destinationBucketName(
      String destinationBucketName) {
    this.destinationBucketName = destinationBucketName;
    return this;
  }

  /**
   * Name of the S3 bucket containing inventory files.
   *
   * @return destinationBucketName
   */
  @JsonProperty(JSON_PROPERTY_DESTINATION_BUCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDestinationBucketName() {
    return destinationBucketName;
  }

  public void setDestinationBucketName(String destinationBucketName) {
    this.destinationBucketName = destinationBucketName;
  }

  public CloudInventorySyncConfigAWSRequestAttributes destinationBucketRegion(
      String destinationBucketRegion) {
    this.destinationBucketRegion = destinationBucketRegion;
    return this;
  }

  /**
   * AWS Region of the inventory bucket.
   *
   * @return destinationBucketRegion
   */
  @JsonProperty(JSON_PROPERTY_DESTINATION_BUCKET_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDestinationBucketRegion() {
    return destinationBucketRegion;
  }

  public void setDestinationBucketRegion(String destinationBucketRegion) {
    this.destinationBucketRegion = destinationBucketRegion;
  }

  public CloudInventorySyncConfigAWSRequestAttributes destinationPrefix(String destinationPrefix) {
    this.destinationPrefix = destinationPrefix;
    return this;
  }

  /**
   * Optional object key prefix for inventory files. Use <code>/</code> or omit for the entire
   * bucket.
   *
   * @return destinationPrefix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATION_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDestinationPrefix() {
    return destinationPrefix;
  }

  public void setDestinationPrefix(String destinationPrefix) {
    this.destinationPrefix = destinationPrefix;
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
   * @return CloudInventorySyncConfigAWSRequestAttributes
   */
  @JsonAnySetter
  public CloudInventorySyncConfigAWSRequestAttributes putAdditionalProperty(
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

  /** Return true if this CloudInventorySyncConfigAWSRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudInventorySyncConfigAWSRequestAttributes cloudInventorySyncConfigAwsRequestAttributes =
        (CloudInventorySyncConfigAWSRequestAttributes) o;
    return Objects.equals(
            this.awsAccountId, cloudInventorySyncConfigAwsRequestAttributes.awsAccountId)
        && Objects.equals(
            this.destinationBucketName,
            cloudInventorySyncConfigAwsRequestAttributes.destinationBucketName)
        && Objects.equals(
            this.destinationBucketRegion,
            cloudInventorySyncConfigAwsRequestAttributes.destinationBucketRegion)
        && Objects.equals(
            this.destinationPrefix, cloudInventorySyncConfigAwsRequestAttributes.destinationPrefix)
        && Objects.equals(
            this.additionalProperties,
            cloudInventorySyncConfigAwsRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsAccountId,
        destinationBucketName,
        destinationBucketRegion,
        destinationPrefix,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudInventorySyncConfigAWSRequestAttributes {\n");
    sb.append("    awsAccountId: ").append(toIndentedString(awsAccountId)).append("\n");
    sb.append("    destinationBucketName: ")
        .append(toIndentedString(destinationBucketName))
        .append("\n");
    sb.append("    destinationBucketRegion: ")
        .append(toIndentedString(destinationBucketRegion))
        .append("\n");
    sb.append("    destinationPrefix: ").append(toIndentedString(destinationPrefix)).append("\n");
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
