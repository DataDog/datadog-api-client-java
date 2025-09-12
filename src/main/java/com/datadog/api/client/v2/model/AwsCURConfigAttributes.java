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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes for An AWS CUR config. */
@JsonPropertyOrder({
  AwsCURConfigAttributes.JSON_PROPERTY_ACCOUNT_FILTERS,
  AwsCURConfigAttributes.JSON_PROPERTY_ACCOUNT_ID,
  AwsCURConfigAttributes.JSON_PROPERTY_BUCKET_NAME,
  AwsCURConfigAttributes.JSON_PROPERTY_BUCKET_REGION,
  AwsCURConfigAttributes.JSON_PROPERTY_CREATED_AT,
  AwsCURConfigAttributes.JSON_PROPERTY_ERROR_MESSAGES,
  AwsCURConfigAttributes.JSON_PROPERTY_MONTHS,
  AwsCURConfigAttributes.JSON_PROPERTY_REPORT_NAME,
  AwsCURConfigAttributes.JSON_PROPERTY_REPORT_PREFIX,
  AwsCURConfigAttributes.JSON_PROPERTY_STATUS,
  AwsCURConfigAttributes.JSON_PROPERTY_STATUS_UPDATED_AT,
  AwsCURConfigAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AwsCURConfigAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_FILTERS = "account_filters";
  private AccountFilteringConfig accountFilters;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_BUCKET_NAME = "bucket_name";
  private String bucketName;

  public static final String JSON_PROPERTY_BUCKET_REGION = "bucket_region";
  private String bucketRegion;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_ERROR_MESSAGES = "error_messages";
  private JsonNullable<List<String>> errorMessages = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_MONTHS = "months";
  private Integer months;

  public static final String JSON_PROPERTY_REPORT_NAME = "report_name";
  private String reportName;

  public static final String JSON_PROPERTY_REPORT_PREFIX = "report_prefix";
  private String reportPrefix;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STATUS_UPDATED_AT = "status_updated_at";
  private String statusUpdatedAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public AwsCURConfigAttributes() {}

  @JsonCreator
  public AwsCURConfigAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_BUCKET_NAME) String bucketName,
      @JsonProperty(required = true, value = JSON_PROPERTY_BUCKET_REGION) String bucketRegion,
      @JsonProperty(required = true, value = JSON_PROPERTY_REPORT_NAME) String reportName,
      @JsonProperty(required = true, value = JSON_PROPERTY_REPORT_PREFIX) String reportPrefix,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status) {
    this.accountId = accountId;
    this.bucketName = bucketName;
    this.bucketRegion = bucketRegion;
    this.reportName = reportName;
    this.reportPrefix = reportPrefix;
    this.status = status;
  }

  public AwsCURConfigAttributes accountFilters(AccountFilteringConfig accountFilters) {
    this.accountFilters = accountFilters;
    this.unparsed |= accountFilters.unparsed;
    return this;
  }

  /**
   * The account filtering configuration.
   *
   * @return accountFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AccountFilteringConfig getAccountFilters() {
    return accountFilters;
  }

  public void setAccountFilters(AccountFilteringConfig accountFilters) {
    this.accountFilters = accountFilters;
  }

  public AwsCURConfigAttributes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The AWS account ID.
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

  public AwsCURConfigAttributes bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * The AWS bucket name used to store the Cost and Usage Report.
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

  public AwsCURConfigAttributes bucketRegion(String bucketRegion) {
    this.bucketRegion = bucketRegion;
    return this;
  }

  /**
   * The region the bucket is located in.
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

  public AwsCURConfigAttributes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the AWS CUR config was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public AwsCURConfigAttributes errorMessages(List<String> errorMessages) {
    this.errorMessages = JsonNullable.<List<String>>of(errorMessages);
    return this;
  }

  public AwsCURConfigAttributes addErrorMessagesItem(String errorMessagesItem) {
    if (this.errorMessages == null || !this.errorMessages.isPresent()) {
      this.errorMessages = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.errorMessages.get().add(errorMessagesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The error messages for the AWS CUR config.
   *
   * @return errorMessages
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getErrorMessages() {
    return errorMessages.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getErrorMessages_JsonNullable() {
    return errorMessages;
  }

  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGES)
  public void setErrorMessages_JsonNullable(JsonNullable<List<String>> errorMessages) {
    this.errorMessages = errorMessages;
  }

  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = JsonNullable.<List<String>>of(errorMessages);
  }

  public AwsCURConfigAttributes months(Integer months) {
    this.months = months;
    return this;
  }

  /**
   * The number of months the report has been backfilled. maximum: 36
   *
   * @return months
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMonths() {
    return months;
  }

  @Deprecated
  public void setMonths(Integer months) {
    this.months = months;
  }

  public AwsCURConfigAttributes reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  /**
   * The name of the Cost and Usage Report.
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

  public AwsCURConfigAttributes reportPrefix(String reportPrefix) {
    this.reportPrefix = reportPrefix;
    return this;
  }

  /**
   * The report prefix used for the Cost and Usage Report.
   *
   * @return reportPrefix
   */
  @JsonProperty(JSON_PROPERTY_REPORT_PREFIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReportPrefix() {
    return reportPrefix;
  }

  public void setReportPrefix(String reportPrefix) {
    this.reportPrefix = reportPrefix;
  }

  public AwsCURConfigAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the AWS CUR.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AwsCURConfigAttributes statusUpdatedAt(String statusUpdatedAt) {
    this.statusUpdatedAt = statusUpdatedAt;
    return this;
  }

  /**
   * The timestamp when the AWS CUR config status was updated.
   *
   * @return statusUpdatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatusUpdatedAt() {
    return statusUpdatedAt;
  }

  public void setStatusUpdatedAt(String statusUpdatedAt) {
    this.statusUpdatedAt = statusUpdatedAt;
  }

  public AwsCURConfigAttributes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the AWS CUR config status was updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return AwsCURConfigAttributes
   */
  @JsonAnySetter
  public AwsCURConfigAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AwsCURConfigAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsCURConfigAttributes awsCurConfigAttributes = (AwsCURConfigAttributes) o;
    return Objects.equals(this.accountFilters, awsCurConfigAttributes.accountFilters)
        && Objects.equals(this.accountId, awsCurConfigAttributes.accountId)
        && Objects.equals(this.bucketName, awsCurConfigAttributes.bucketName)
        && Objects.equals(this.bucketRegion, awsCurConfigAttributes.bucketRegion)
        && Objects.equals(this.createdAt, awsCurConfigAttributes.createdAt)
        && Objects.equals(this.errorMessages, awsCurConfigAttributes.errorMessages)
        && Objects.equals(this.months, awsCurConfigAttributes.months)
        && Objects.equals(this.reportName, awsCurConfigAttributes.reportName)
        && Objects.equals(this.reportPrefix, awsCurConfigAttributes.reportPrefix)
        && Objects.equals(this.status, awsCurConfigAttributes.status)
        && Objects.equals(this.statusUpdatedAt, awsCurConfigAttributes.statusUpdatedAt)
        && Objects.equals(this.updatedAt, awsCurConfigAttributes.updatedAt)
        && Objects.equals(this.additionalProperties, awsCurConfigAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountFilters,
        accountId,
        bucketName,
        bucketRegion,
        createdAt,
        errorMessages,
        months,
        reportName,
        reportPrefix,
        status,
        statusUpdatedAt,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCURConfigAttributes {\n");
    sb.append("    accountFilters: ").append(toIndentedString(accountFilters)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    bucketRegion: ").append(toIndentedString(bucketRegion)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportPrefix: ").append(toIndentedString(reportPrefix)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdatedAt: ").append(toIndentedString(statusUpdatedAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
