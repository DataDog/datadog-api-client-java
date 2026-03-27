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

/** Attributes for a Google Cloud Usage Cost config. */
@JsonPropertyOrder({
  GCPUsageCostConfigAttributes.JSON_PROPERTY_ACCOUNT_ID,
  GCPUsageCostConfigAttributes.JSON_PROPERTY_BUCKET_NAME,
  GCPUsageCostConfigAttributes.JSON_PROPERTY_CREATED_AT,
  GCPUsageCostConfigAttributes.JSON_PROPERTY_DATASET,
  GCPUsageCostConfigAttributes.JSON_PROPERTY_ERROR_MESSAGES,
  GCPUsageCostConfigAttributes.JSON_PROPERTY_EXPORT_PREFIX,
  GCPUsageCostConfigAttributes.JSON_PROPERTY_EXPORT_PROJECT_NAME,
  GCPUsageCostConfigAttributes.JSON_PROPERTY_MONTHS,
  GCPUsageCostConfigAttributes.JSON_PROPERTY_PROJECT_ID,
  GCPUsageCostConfigAttributes.JSON_PROPERTY_SERVICE_ACCOUNT,
  GCPUsageCostConfigAttributes.JSON_PROPERTY_STATUS,
  GCPUsageCostConfigAttributes.JSON_PROPERTY_STATUS_UPDATED_AT,
  GCPUsageCostConfigAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GCPUsageCostConfigAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_BUCKET_NAME = "bucket_name";
  private String bucketName;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_DATASET = "dataset";
  private String dataset;

  public static final String JSON_PROPERTY_ERROR_MESSAGES = "error_messages";
  private JsonNullable<List<String>> errorMessages = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXPORT_PREFIX = "export_prefix";
  private String exportPrefix;

  public static final String JSON_PROPERTY_EXPORT_PROJECT_NAME = "export_project_name";
  private String exportProjectName;

  public static final String JSON_PROPERTY_MONTHS = "months";
  private Integer months;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT = "service_account";
  private String serviceAccount;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STATUS_UPDATED_AT = "status_updated_at";
  private String statusUpdatedAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public GCPUsageCostConfigAttributes() {}

  @JsonCreator
  public GCPUsageCostConfigAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_BUCKET_NAME) String bucketName,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET) String dataset,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPORT_PREFIX) String exportPrefix,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPORT_PROJECT_NAME)
          String exportProjectName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_ACCOUNT) String serviceAccount,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status) {
    this.accountId = accountId;
    this.bucketName = bucketName;
    this.dataset = dataset;
    this.exportPrefix = exportPrefix;
    this.exportProjectName = exportProjectName;
    this.serviceAccount = serviceAccount;
    this.status = status;
  }

  public GCPUsageCostConfigAttributes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The Google Cloud account ID.
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

  public GCPUsageCostConfigAttributes bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * The Google Cloud bucket name used to store the Usage Cost export.
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

  public GCPUsageCostConfigAttributes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the Google Cloud Usage Cost config was created.
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

  public GCPUsageCostConfigAttributes dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * The export dataset name used for the Google Cloud Usage Cost Report.
   *
   * @return dataset
   */
  @JsonProperty(JSON_PROPERTY_DATASET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDataset() {
    return dataset;
  }

  public void setDataset(String dataset) {
    this.dataset = dataset;
  }

  public GCPUsageCostConfigAttributes errorMessages(List<String> errorMessages) {
    this.errorMessages = JsonNullable.<List<String>>of(errorMessages);
    return this;
  }

  public GCPUsageCostConfigAttributes addErrorMessagesItem(String errorMessagesItem) {
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
   * The error messages for the Google Cloud Usage Cost config.
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

  public GCPUsageCostConfigAttributes exportPrefix(String exportPrefix) {
    this.exportPrefix = exportPrefix;
    return this;
  }

  /**
   * The export prefix used for the Google Cloud Usage Cost Report.
   *
   * @return exportPrefix
   */
  @JsonProperty(JSON_PROPERTY_EXPORT_PREFIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExportPrefix() {
    return exportPrefix;
  }

  public void setExportPrefix(String exportPrefix) {
    this.exportPrefix = exportPrefix;
  }

  public GCPUsageCostConfigAttributes exportProjectName(String exportProjectName) {
    this.exportProjectName = exportProjectName;
    return this;
  }

  /**
   * The name of the Google Cloud Usage Cost Report.
   *
   * @return exportProjectName
   */
  @JsonProperty(JSON_PROPERTY_EXPORT_PROJECT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExportProjectName() {
    return exportProjectName;
  }

  public void setExportProjectName(String exportProjectName) {
    this.exportProjectName = exportProjectName;
  }

  public GCPUsageCostConfigAttributes months(Integer months) {
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

  public GCPUsageCostConfigAttributes projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The <code>project_id</code> of the Google Cloud Usage Cost report.
   *
   * @return projectId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public GCPUsageCostConfigAttributes serviceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * The unique Google Cloud service account email.
   *
   * @return serviceAccount
   */
  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  public GCPUsageCostConfigAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the Google Cloud Usage Cost config.
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

  public GCPUsageCostConfigAttributes statusUpdatedAt(String statusUpdatedAt) {
    this.statusUpdatedAt = statusUpdatedAt;
    return this;
  }

  /**
   * The timestamp when the Google Cloud Usage Cost config status was updated.
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

  public GCPUsageCostConfigAttributes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the Google Cloud Usage Cost config status was updated.
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
   * @return GCPUsageCostConfigAttributes
   */
  @JsonAnySetter
  public GCPUsageCostConfigAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GCPUsageCostConfigAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPUsageCostConfigAttributes gcpUsageCostConfigAttributes = (GCPUsageCostConfigAttributes) o;
    return Objects.equals(this.accountId, gcpUsageCostConfigAttributes.accountId)
        && Objects.equals(this.bucketName, gcpUsageCostConfigAttributes.bucketName)
        && Objects.equals(this.createdAt, gcpUsageCostConfigAttributes.createdAt)
        && Objects.equals(this.dataset, gcpUsageCostConfigAttributes.dataset)
        && Objects.equals(this.errorMessages, gcpUsageCostConfigAttributes.errorMessages)
        && Objects.equals(this.exportPrefix, gcpUsageCostConfigAttributes.exportPrefix)
        && Objects.equals(this.exportProjectName, gcpUsageCostConfigAttributes.exportProjectName)
        && Objects.equals(this.months, gcpUsageCostConfigAttributes.months)
        && Objects.equals(this.projectId, gcpUsageCostConfigAttributes.projectId)
        && Objects.equals(this.serviceAccount, gcpUsageCostConfigAttributes.serviceAccount)
        && Objects.equals(this.status, gcpUsageCostConfigAttributes.status)
        && Objects.equals(this.statusUpdatedAt, gcpUsageCostConfigAttributes.statusUpdatedAt)
        && Objects.equals(this.updatedAt, gcpUsageCostConfigAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, gcpUsageCostConfigAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        bucketName,
        createdAt,
        dataset,
        errorMessages,
        exportPrefix,
        exportProjectName,
        months,
        projectId,
        serviceAccount,
        status,
        statusUpdatedAt,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPUsageCostConfigAttributes {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    exportPrefix: ").append(toIndentedString(exportPrefix)).append("\n");
    sb.append("    exportProjectName: ").append(toIndentedString(exportProjectName)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
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
