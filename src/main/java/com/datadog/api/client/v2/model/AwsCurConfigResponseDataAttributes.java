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
   * <p>The definition of <code>AwsCurConfigResponseDataAttributes</code> object.</p>
 */
@JsonPropertyOrder({
  AwsCurConfigResponseDataAttributes.JSON_PROPERTY_ACCOUNT_FILTERS,
  AwsCurConfigResponseDataAttributes.JSON_PROPERTY_ACCOUNT_ID,
  AwsCurConfigResponseDataAttributes.JSON_PROPERTY_BUCKET_NAME,
  AwsCurConfigResponseDataAttributes.JSON_PROPERTY_BUCKET_REGION,
  AwsCurConfigResponseDataAttributes.JSON_PROPERTY_CREATED_AT,
  AwsCurConfigResponseDataAttributes.JSON_PROPERTY_ERROR_MESSAGES,
  AwsCurConfigResponseDataAttributes.JSON_PROPERTY_MONTHS,
  AwsCurConfigResponseDataAttributes.JSON_PROPERTY_REPORT_NAME,
  AwsCurConfigResponseDataAttributes.JSON_PROPERTY_REPORT_PREFIX,
  AwsCurConfigResponseDataAttributes.JSON_PROPERTY_STATUS,
  AwsCurConfigResponseDataAttributes.JSON_PROPERTY_STATUS_UPDATED_AT,
  AwsCurConfigResponseDataAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AwsCurConfigResponseDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_FILTERS = "account_filters";
  private AwsCurConfigResponseDataAttributesAccountFilters accountFilters;

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
  private Long months;

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

  public AwsCurConfigResponseDataAttributes accountFilters(AwsCurConfigResponseDataAttributesAccountFilters accountFilters) {
    this.accountFilters = accountFilters;
    this.unparsed |= accountFilters.unparsed;
    return this;
  }

  /**
   * <p>The definition of <code>AwsCurConfigResponseDataAttributesAccountFilters</code> object.</p>
   * @return accountFilters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNT_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AwsCurConfigResponseDataAttributesAccountFilters getAccountFilters() {
        return accountFilters;
      }
  public void setAccountFilters(AwsCurConfigResponseDataAttributesAccountFilters accountFilters) {
    this.accountFilters = accountFilters;
  }
  public AwsCurConfigResponseDataAttributes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>account_id</code>.</p>
   * @return accountId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAccountId() {
        return accountId;
      }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
  public AwsCurConfigResponseDataAttributes bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>bucket_name</code>.</p>
   * @return bucketName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BUCKET_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBucketName() {
        return bucketName;
      }
  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }
  public AwsCurConfigResponseDataAttributes bucketRegion(String bucketRegion) {
    this.bucketRegion = bucketRegion;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>bucket_region</code>.</p>
   * @return bucketRegion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BUCKET_REGION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBucketRegion() {
        return bucketRegion;
      }
  public void setBucketRegion(String bucketRegion) {
    this.bucketRegion = bucketRegion;
  }
  public AwsCurConfigResponseDataAttributes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>created_at</code>.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  public AwsCurConfigResponseDataAttributes errorMessages(List<String> errorMessages) {
    this.errorMessages = JsonNullable.<List<String>>of(errorMessages);
    return this;
  }
  public AwsCurConfigResponseDataAttributes addErrorMessagesItem(String errorMessagesItem) {
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
   * <p>The <code>attributes</code> <code>error_messages</code>.</p>
   * @return errorMessages
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getErrorMessages() {
        return errorMessages.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGES)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getErrorMessages_JsonNullable() {
    return errorMessages;
  }
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGES)public void setErrorMessages_JsonNullable(JsonNullable<List<String>> errorMessages) {
    this.errorMessages = errorMessages;
  }
  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = JsonNullable.<List<String>>of(errorMessages);
  }
  public AwsCurConfigResponseDataAttributes months(Long months) {
    this.months = months;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>months</code>.</p>
   * @return months
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MONTHS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getMonths() {
        return months;
      }
  public void setMonths(Long months) {
    this.months = months;
  }
  public AwsCurConfigResponseDataAttributes reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>report_name</code>.</p>
   * @return reportName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REPORT_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getReportName() {
        return reportName;
      }
  public void setReportName(String reportName) {
    this.reportName = reportName;
  }
  public AwsCurConfigResponseDataAttributes reportPrefix(String reportPrefix) {
    this.reportPrefix = reportPrefix;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>report_prefix</code>.</p>
   * @return reportPrefix
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REPORT_PREFIX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getReportPrefix() {
        return reportPrefix;
      }
  public void setReportPrefix(String reportPrefix) {
    this.reportPrefix = reportPrefix;
  }
  public AwsCurConfigResponseDataAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>status</code>.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStatus() {
        return status;
      }
  public void setStatus(String status) {
    this.status = status;
  }
  public AwsCurConfigResponseDataAttributes statusUpdatedAt(String statusUpdatedAt) {
    this.statusUpdatedAt = statusUpdatedAt;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>status_updated_at</code>.</p>
   * @return statusUpdatedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStatusUpdatedAt() {
        return statusUpdatedAt;
      }
  public void setStatusUpdatedAt(String statusUpdatedAt) {
    this.statusUpdatedAt = statusUpdatedAt;
  }
  public AwsCurConfigResponseDataAttributes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>updated_at</code>.</p>
   * @return updatedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUpdatedAt() {
        return updatedAt;
      }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return AwsCurConfigResponseDataAttributes
   */
  @JsonAnySetter
  public AwsCurConfigResponseDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this AwsCurConfigResponseDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsCurConfigResponseDataAttributes awsCurConfigResponseDataAttributes = (AwsCurConfigResponseDataAttributes) o;
    return Objects.equals(this.accountFilters, awsCurConfigResponseDataAttributes.accountFilters) && Objects.equals(this.accountId, awsCurConfigResponseDataAttributes.accountId) && Objects.equals(this.bucketName, awsCurConfigResponseDataAttributes.bucketName) && Objects.equals(this.bucketRegion, awsCurConfigResponseDataAttributes.bucketRegion) && Objects.equals(this.createdAt, awsCurConfigResponseDataAttributes.createdAt) && Objects.equals(this.errorMessages, awsCurConfigResponseDataAttributes.errorMessages) && Objects.equals(this.months, awsCurConfigResponseDataAttributes.months) && Objects.equals(this.reportName, awsCurConfigResponseDataAttributes.reportName) && Objects.equals(this.reportPrefix, awsCurConfigResponseDataAttributes.reportPrefix) && Objects.equals(this.status, awsCurConfigResponseDataAttributes.status) && Objects.equals(this.statusUpdatedAt, awsCurConfigResponseDataAttributes.statusUpdatedAt) && Objects.equals(this.updatedAt, awsCurConfigResponseDataAttributes.updatedAt) && Objects.equals(this.additionalProperties, awsCurConfigResponseDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accountFilters,accountId,bucketName,bucketRegion,createdAt,errorMessages,months,reportName,reportPrefix,status,statusUpdatedAt,updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCurConfigResponseDataAttributes {\n");
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
