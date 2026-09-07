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

/** Attributes for an AWS CCM config validation request. */
@JsonPropertyOrder({
  AWSCcmConfigValidationRequestAttributes.JSON_PROPERTY_ACCOUNT_ID,
  AWSCcmConfigValidationRequestAttributes.JSON_PROPERTY_BUCKET_NAME,
  AWSCcmConfigValidationRequestAttributes.JSON_PROPERTY_BUCKET_REGION,
  AWSCcmConfigValidationRequestAttributes.JSON_PROPERTY_REPORT_NAME,
  AWSCcmConfigValidationRequestAttributes.JSON_PROPERTY_REPORT_PREFIX
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSCcmConfigValidationRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_BUCKET_NAME = "bucket_name";
  private String bucketName;

  public static final String JSON_PROPERTY_BUCKET_REGION = "bucket_region";
  private String bucketRegion;

  public static final String JSON_PROPERTY_REPORT_NAME = "report_name";
  private String reportName;

  public static final String JSON_PROPERTY_REPORT_PREFIX = "report_prefix";
  private String reportPrefix;

  public AWSCcmConfigValidationRequestAttributes() {}

  @JsonCreator
  public AWSCcmConfigValidationRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_BUCKET_NAME) String bucketName,
      @JsonProperty(required = true, value = JSON_PROPERTY_BUCKET_REGION) String bucketRegion,
      @JsonProperty(required = true, value = JSON_PROPERTY_REPORT_NAME) String reportName) {
    this.accountId = accountId;
    this.bucketName = bucketName;
    this.bucketRegion = bucketRegion;
    this.reportName = reportName;
  }

  public AWSCcmConfigValidationRequestAttributes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Your AWS Account ID without dashes.
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

  public AWSCcmConfigValidationRequestAttributes bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * Name of the S3 bucket where the Cost and Usage Report is stored.
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

  public AWSCcmConfigValidationRequestAttributes bucketRegion(String bucketRegion) {
    this.bucketRegion = bucketRegion;
    return this;
  }

  /**
   * AWS region of the S3 bucket.
   *
   * @return bucketRegion
   */
  @JsonProperty(JSON_PROPERTY_BUCKET_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBucketRegion() {
    return bucketRegion;
  }

  public void setBucketRegion(String bucketRegion) {
    this.bucketRegion = bucketRegion;
  }

  public AWSCcmConfigValidationRequestAttributes reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  /**
   * Name of the Cost and Usage Report.
   *
   * @return reportName
   */
  @JsonProperty(JSON_PROPERTY_REPORT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public AWSCcmConfigValidationRequestAttributes reportPrefix(String reportPrefix) {
    this.reportPrefix = reportPrefix;
    return this;
  }

  /**
   * S3 prefix where the Cost and Usage Report is stored.
   *
   * @return reportPrefix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORT_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReportPrefix() {
    return reportPrefix;
  }

  public void setReportPrefix(String reportPrefix) {
    this.reportPrefix = reportPrefix;
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
   * @return AWSCcmConfigValidationRequestAttributes
   */
  @JsonAnySetter
  public AWSCcmConfigValidationRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSCcmConfigValidationRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSCcmConfigValidationRequestAttributes awsCcmConfigValidationRequestAttributes =
        (AWSCcmConfigValidationRequestAttributes) o;
    return Objects.equals(this.accountId, awsCcmConfigValidationRequestAttributes.accountId)
        && Objects.equals(this.bucketName, awsCcmConfigValidationRequestAttributes.bucketName)
        && Objects.equals(this.bucketRegion, awsCcmConfigValidationRequestAttributes.bucketRegion)
        && Objects.equals(this.reportName, awsCcmConfigValidationRequestAttributes.reportName)
        && Objects.equals(this.reportPrefix, awsCcmConfigValidationRequestAttributes.reportPrefix)
        && Objects.equals(
            this.additionalProperties,
            awsCcmConfigValidationRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, bucketName, bucketRegion, reportName, reportPrefix, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSCcmConfigValidationRequestAttributes {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    bucketRegion: ").append(toIndentedString(bucketRegion)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportPrefix: ").append(toIndentedString(reportPrefix)).append("\n");
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
