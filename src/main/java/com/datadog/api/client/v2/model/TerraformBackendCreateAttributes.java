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

/** Settings for a new Terraform backend sync configuration. */
@JsonPropertyOrder({
  TerraformBackendCreateAttributes.JSON_PROPERTY_ACCOUNT_ID,
  TerraformBackendCreateAttributes.JSON_PROPERTY_BACKEND_TYPE,
  TerraformBackendCreateAttributes.JSON_PROPERTY_BUCKET_NAMES,
  TerraformBackendCreateAttributes.JSON_PROPERTY_REGION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TerraformBackendCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_BACKEND_TYPE = "backend_type";
  private TerraformBackendKind backendType;

  public static final String JSON_PROPERTY_BUCKET_NAMES = "bucket_names";
  private List<String> bucketNames = new ArrayList<>();

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public TerraformBackendCreateAttributes() {}

  @JsonCreator
  public TerraformBackendCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_BACKEND_TYPE)
          TerraformBackendKind backendType,
      @JsonProperty(required = true, value = JSON_PROPERTY_BUCKET_NAMES) List<String> bucketNames,
      @JsonProperty(required = true, value = JSON_PROPERTY_REGION) String region) {
    this.accountId = accountId;
    this.backendType = backendType;
    this.unparsed |= !backendType.isValid();
    this.bucketNames = bucketNames;
    this.region = region;
  }

  public TerraformBackendCreateAttributes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * AWS account ID that owns the S3 buckets.
   *
   * @return accountId
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public TerraformBackendCreateAttributes backendType(TerraformBackendKind backendType) {
    this.backendType = backendType;
    this.unparsed |= !backendType.isValid();
    return this;
  }

  /**
   * Backend type to synchronize.
   *
   * @return backendType
   */
  @JsonProperty(JSON_PROPERTY_BACKEND_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TerraformBackendKind getBackendType() {
    return backendType;
  }

  public void setBackendType(TerraformBackendKind backendType) {
    if (!backendType.isValid()) {
      this.unparsed = true;
    }
    this.backendType = backendType;
  }

  public TerraformBackendCreateAttributes bucketNames(List<String> bucketNames) {
    this.bucketNames = bucketNames;
    return this;
  }

  public TerraformBackendCreateAttributes addBucketNamesItem(String bucketNamesItem) {
    this.bucketNames.add(bucketNamesItem);
    return this;
  }

  /**
   * Complete set of S3 bucket names to synchronize. Names must be nonempty and unique.
   *
   * @return bucketNames
   */
  @JsonProperty(JSON_PROPERTY_BUCKET_NAMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getBucketNames() {
    return bucketNames;
  }

  public void setBucketNames(List<String> bucketNames) {
    this.bucketNames = bucketNames;
  }

  public TerraformBackendCreateAttributes region(String region) {
    this.region = region;
    return this;
  }

  /**
   * AWS region containing the S3 buckets.
   *
   * @return region
   */
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
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
   * @return TerraformBackendCreateAttributes
   */
  @JsonAnySetter
  public TerraformBackendCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TerraformBackendCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerraformBackendCreateAttributes terraformBackendCreateAttributes =
        (TerraformBackendCreateAttributes) o;
    return Objects.equals(this.accountId, terraformBackendCreateAttributes.accountId)
        && Objects.equals(this.backendType, terraformBackendCreateAttributes.backendType)
        && Objects.equals(this.bucketNames, terraformBackendCreateAttributes.bucketNames)
        && Objects.equals(this.region, terraformBackendCreateAttributes.region)
        && Objects.equals(
            this.additionalProperties, terraformBackendCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, backendType, bucketNames, region, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerraformBackendCreateAttributes {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    backendType: ").append(toIndentedString(backendType)).append("\n");
    sb.append("    bucketNames: ").append(toIndentedString(bucketNames)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
