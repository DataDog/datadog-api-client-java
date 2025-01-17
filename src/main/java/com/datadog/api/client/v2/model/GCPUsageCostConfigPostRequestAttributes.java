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

/** Attributes for GCP Usage Cost config post request. */
@JsonPropertyOrder({
  GCPUsageCostConfigPostRequestAttributes.JSON_PROPERTY_ACCOUNT_ID,
  GCPUsageCostConfigPostRequestAttributes.JSON_PROPERTY_BUCKET_NAME,
  GCPUsageCostConfigPostRequestAttributes.JSON_PROPERTY_DATASET,
  GCPUsageCostConfigPostRequestAttributes.JSON_PROPERTY_EXPORT_PREFIX,
  GCPUsageCostConfigPostRequestAttributes.JSON_PROPERTY_EXPORT_PROJECT_NAME,
  GCPUsageCostConfigPostRequestAttributes.JSON_PROPERTY_IS_ENABLED,
  GCPUsageCostConfigPostRequestAttributes.JSON_PROPERTY_MONTHS,
  GCPUsageCostConfigPostRequestAttributes.JSON_PROPERTY_SERVICE_ACCOUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GCPUsageCostConfigPostRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_BUCKET_NAME = "bucket_name";
  private String bucketName;

  public static final String JSON_PROPERTY_DATASET = "dataset";
  private String dataset;

  public static final String JSON_PROPERTY_EXPORT_PREFIX = "export_prefix";
  private String exportPrefix;

  public static final String JSON_PROPERTY_EXPORT_PROJECT_NAME = "export_project_name";
  private String exportProjectName;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_MONTHS = "months";
  private Integer months;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT = "service_account";
  private String serviceAccount;

  public GCPUsageCostConfigPostRequestAttributes() {}

  @JsonCreator
  public GCPUsageCostConfigPostRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_BUCKET_NAME) String bucketName,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET) String dataset,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPORT_PREFIX) String exportPrefix,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPORT_PROJECT_NAME)
          String exportProjectName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_ACCOUNT) String serviceAccount) {
    this.accountId = accountId;
    this.bucketName = bucketName;
    this.dataset = dataset;
    this.exportPrefix = exportPrefix;
    this.exportProjectName = exportProjectName;
    this.serviceAccount = serviceAccount;
  }

  public GCPUsageCostConfigPostRequestAttributes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The GCP account ID.
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

  public GCPUsageCostConfigPostRequestAttributes bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * The GCP bucket name used to store the Usage Cost export.
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

  public GCPUsageCostConfigPostRequestAttributes dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * The export dataset name used for the GCP Usage Cost report.
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

  public GCPUsageCostConfigPostRequestAttributes exportPrefix(String exportPrefix) {
    this.exportPrefix = exportPrefix;
    return this;
  }

  /**
   * The export prefix used for the GCP Usage Cost report.
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

  public GCPUsageCostConfigPostRequestAttributes exportProjectName(String exportProjectName) {
    this.exportProjectName = exportProjectName;
    return this;
  }

  /**
   * The name of the GCP Usage Cost report.
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

  public GCPUsageCostConfigPostRequestAttributes isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether or not the Cloud Cost Management account is enabled.
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public GCPUsageCostConfigPostRequestAttributes months(Integer months) {
    this.months = months;
    return this;
  }

  /**
   * The month of the report. maximum: 36
   *
   * @return months
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMonths() {
    return months;
  }

  public void setMonths(Integer months) {
    this.months = months;
  }

  public GCPUsageCostConfigPostRequestAttributes serviceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * The unique GCP service account email.
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
   * @return GCPUsageCostConfigPostRequestAttributes
   */
  @JsonAnySetter
  public GCPUsageCostConfigPostRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GCPUsageCostConfigPostRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPUsageCostConfigPostRequestAttributes gcpUsageCostConfigPostRequestAttributes =
        (GCPUsageCostConfigPostRequestAttributes) o;
    return Objects.equals(this.accountId, gcpUsageCostConfigPostRequestAttributes.accountId)
        && Objects.equals(this.bucketName, gcpUsageCostConfigPostRequestAttributes.bucketName)
        && Objects.equals(this.dataset, gcpUsageCostConfigPostRequestAttributes.dataset)
        && Objects.equals(this.exportPrefix, gcpUsageCostConfigPostRequestAttributes.exportPrefix)
        && Objects.equals(
            this.exportProjectName, gcpUsageCostConfigPostRequestAttributes.exportProjectName)
        && Objects.equals(this.isEnabled, gcpUsageCostConfigPostRequestAttributes.isEnabled)
        && Objects.equals(this.months, gcpUsageCostConfigPostRequestAttributes.months)
        && Objects.equals(
            this.serviceAccount, gcpUsageCostConfigPostRequestAttributes.serviceAccount)
        && Objects.equals(
            this.additionalProperties,
            gcpUsageCostConfigPostRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        bucketName,
        dataset,
        exportPrefix,
        exportProjectName,
        isEnabled,
        months,
        serviceAccount,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPUsageCostConfigPostRequestAttributes {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    exportPrefix: ").append(toIndentedString(exportPrefix)).append("\n");
    sb.append("    exportProjectName: ").append(toIndentedString(exportProjectName)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
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
