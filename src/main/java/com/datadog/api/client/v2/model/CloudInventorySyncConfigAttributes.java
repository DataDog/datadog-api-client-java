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

/**
 * Attributes for a cloud inventory sync configuration. Values beyond <code>id</code> may be omitted
 * immediately after upsert.
 */
@JsonPropertyOrder({
  CloudInventorySyncConfigAttributes.JSON_PROPERTY_AWS_ACCOUNT_ID,
  CloudInventorySyncConfigAttributes.JSON_PROPERTY_AWS_BUCKET_NAME,
  CloudInventorySyncConfigAttributes.JSON_PROPERTY_AWS_REGION,
  CloudInventorySyncConfigAttributes.JSON_PROPERTY_AZURE_CLIENT_ID,
  CloudInventorySyncConfigAttributes.JSON_PROPERTY_AZURE_CONTAINER_NAME,
  CloudInventorySyncConfigAttributes.JSON_PROPERTY_AZURE_STORAGE_ACCOUNT_NAME,
  CloudInventorySyncConfigAttributes.JSON_PROPERTY_AZURE_TENANT_ID,
  CloudInventorySyncConfigAttributes.JSON_PROPERTY_CLOUD_PROVIDER,
  CloudInventorySyncConfigAttributes.JSON_PROPERTY_ERROR,
  CloudInventorySyncConfigAttributes.JSON_PROPERTY_ERROR_CODE,
  CloudInventorySyncConfigAttributes.JSON_PROPERTY_GCP_BUCKET_NAME,
  CloudInventorySyncConfigAttributes.JSON_PROPERTY_GCP_PROJECT_ID,
  CloudInventorySyncConfigAttributes.JSON_PROPERTY_GCP_SERVICE_ACCOUNT_EMAIL,
  CloudInventorySyncConfigAttributes.JSON_PROPERTY_PREFIX
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudInventorySyncConfigAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AWS_ACCOUNT_ID = "aws_account_id";
  private String awsAccountId;

  public static final String JSON_PROPERTY_AWS_BUCKET_NAME = "aws_bucket_name";
  private String awsBucketName;

  public static final String JSON_PROPERTY_AWS_REGION = "aws_region";
  private String awsRegion;

  public static final String JSON_PROPERTY_AZURE_CLIENT_ID = "azure_client_id";
  private String azureClientId;

  public static final String JSON_PROPERTY_AZURE_CONTAINER_NAME = "azure_container_name";
  private String azureContainerName;

  public static final String JSON_PROPERTY_AZURE_STORAGE_ACCOUNT_NAME =
      "azure_storage_account_name";
  private String azureStorageAccountName;

  public static final String JSON_PROPERTY_AZURE_TENANT_ID = "azure_tenant_id";
  private String azureTenantId;

  public static final String JSON_PROPERTY_CLOUD_PROVIDER = "cloud_provider";
  private CloudInventoryCloudProviderId cloudProvider;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_ERROR_CODE = "error_code";
  private String errorCode;

  public static final String JSON_PROPERTY_GCP_BUCKET_NAME = "gcp_bucket_name";
  private String gcpBucketName;

  public static final String JSON_PROPERTY_GCP_PROJECT_ID = "gcp_project_id";
  private String gcpProjectId;

  public static final String JSON_PROPERTY_GCP_SERVICE_ACCOUNT_EMAIL = "gcp_service_account_email";
  private String gcpServiceAccountEmail;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public CloudInventorySyncConfigAttributes() {}

  @JsonCreator
  public CloudInventorySyncConfigAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AWS_ACCOUNT_ID) String awsAccountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_AWS_BUCKET_NAME) String awsBucketName,
      @JsonProperty(required = true, value = JSON_PROPERTY_AWS_REGION) String awsRegion,
      @JsonProperty(required = true, value = JSON_PROPERTY_AZURE_CLIENT_ID) String azureClientId,
      @JsonProperty(required = true, value = JSON_PROPERTY_AZURE_CONTAINER_NAME)
          String azureContainerName,
      @JsonProperty(required = true, value = JSON_PROPERTY_AZURE_STORAGE_ACCOUNT_NAME)
          String azureStorageAccountName,
      @JsonProperty(required = true, value = JSON_PROPERTY_AZURE_TENANT_ID) String azureTenantId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CLOUD_PROVIDER)
          CloudInventoryCloudProviderId cloudProvider,
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR) String error,
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR_CODE) String errorCode,
      @JsonProperty(required = true, value = JSON_PROPERTY_GCP_BUCKET_NAME) String gcpBucketName,
      @JsonProperty(required = true, value = JSON_PROPERTY_GCP_PROJECT_ID) String gcpProjectId,
      @JsonProperty(required = true, value = JSON_PROPERTY_GCP_SERVICE_ACCOUNT_EMAIL)
          String gcpServiceAccountEmail,
      @JsonProperty(required = true, value = JSON_PROPERTY_PREFIX) String prefix) {
    this.awsAccountId = awsAccountId;
    this.awsBucketName = awsBucketName;
    this.awsRegion = awsRegion;
    this.azureClientId = azureClientId;
    this.azureContainerName = azureContainerName;
    this.azureStorageAccountName = azureStorageAccountName;
    this.azureTenantId = azureTenantId;
    this.cloudProvider = cloudProvider;
    this.unparsed |= !cloudProvider.isValid();
    this.error = error;
    this.errorCode = errorCode;
    this.gcpBucketName = gcpBucketName;
    this.gcpProjectId = gcpProjectId;
    this.gcpServiceAccountEmail = gcpServiceAccountEmail;
    this.prefix = prefix;
  }

  public CloudInventorySyncConfigAttributes awsAccountId(String awsAccountId) {
    this.awsAccountId = awsAccountId;
    return this;
  }

  /**
   * AWS account ID for the inventory bucket.
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

  public CloudInventorySyncConfigAttributes awsBucketName(String awsBucketName) {
    this.awsBucketName = awsBucketName;
    return this;
  }

  /**
   * AWS S3 bucket name for inventory files.
   *
   * @return awsBucketName
   */
  @JsonProperty(JSON_PROPERTY_AWS_BUCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAwsBucketName() {
    return awsBucketName;
  }

  public void setAwsBucketName(String awsBucketName) {
    this.awsBucketName = awsBucketName;
  }

  public CloudInventorySyncConfigAttributes awsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
    return this;
  }

  /**
   * AWS Region for the inventory bucket.
   *
   * @return awsRegion
   */
  @JsonProperty(JSON_PROPERTY_AWS_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAwsRegion() {
    return awsRegion;
  }

  public void setAwsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
  }

  public CloudInventorySyncConfigAttributes azureClientId(String azureClientId) {
    this.azureClientId = azureClientId;
    return this;
  }

  /**
   * Azure AD application (client) ID.
   *
   * @return azureClientId
   */
  @JsonProperty(JSON_PROPERTY_AZURE_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAzureClientId() {
    return azureClientId;
  }

  public void setAzureClientId(String azureClientId) {
    this.azureClientId = azureClientId;
  }

  public CloudInventorySyncConfigAttributes azureContainerName(String azureContainerName) {
    this.azureContainerName = azureContainerName;
    return this;
  }

  /**
   * Azure blob container name.
   *
   * @return azureContainerName
   */
  @JsonProperty(JSON_PROPERTY_AZURE_CONTAINER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAzureContainerName() {
    return azureContainerName;
  }

  public void setAzureContainerName(String azureContainerName) {
    this.azureContainerName = azureContainerName;
  }

  public CloudInventorySyncConfigAttributes azureStorageAccountName(
      String azureStorageAccountName) {
    this.azureStorageAccountName = azureStorageAccountName;
    return this;
  }

  /**
   * Azure storage account name.
   *
   * @return azureStorageAccountName
   */
  @JsonProperty(JSON_PROPERTY_AZURE_STORAGE_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAzureStorageAccountName() {
    return azureStorageAccountName;
  }

  public void setAzureStorageAccountName(String azureStorageAccountName) {
    this.azureStorageAccountName = azureStorageAccountName;
  }

  public CloudInventorySyncConfigAttributes azureTenantId(String azureTenantId) {
    this.azureTenantId = azureTenantId;
    return this;
  }

  /**
   * Azure AD tenant ID.
   *
   * @return azureTenantId
   */
  @JsonProperty(JSON_PROPERTY_AZURE_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAzureTenantId() {
    return azureTenantId;
  }

  public void setAzureTenantId(String azureTenantId) {
    this.azureTenantId = azureTenantId;
  }

  public CloudInventorySyncConfigAttributes cloudProvider(
      CloudInventoryCloudProviderId cloudProvider) {
    this.cloudProvider = cloudProvider;
    this.unparsed |= !cloudProvider.isValid();
    return this;
  }

  /**
   * Cloud provider for this sync configuration (<code>aws</code>, <code>gcp</code>, or <code>azure
   * </code>). For requests, must match the provider block supplied under <code>attributes</code>.
   *
   * @return cloudProvider
   */
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CloudInventoryCloudProviderId getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(CloudInventoryCloudProviderId cloudProvider) {
    if (!cloudProvider.isValid()) {
      this.unparsed = true;
    }
    this.cloudProvider = cloudProvider;
  }

  /**
   * Human-readable error detail when sync is unhealthy.
   *
   * @return error
   */
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getError() {
    return error;
  }

  /**
   * Machine-readable error code when sync is unhealthy.
   *
   * @return errorCode
   */
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getErrorCode() {
    return errorCode;
  }

  public CloudInventorySyncConfigAttributes gcpBucketName(String gcpBucketName) {
    this.gcpBucketName = gcpBucketName;
    return this;
  }

  /**
   * GCS bucket name for inventory files Datadog reads.
   *
   * @return gcpBucketName
   */
  @JsonProperty(JSON_PROPERTY_GCP_BUCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGcpBucketName() {
    return gcpBucketName;
  }

  public void setGcpBucketName(String gcpBucketName) {
    this.gcpBucketName = gcpBucketName;
  }

  public CloudInventorySyncConfigAttributes gcpProjectId(String gcpProjectId) {
    this.gcpProjectId = gcpProjectId;
    return this;
  }

  /**
   * GCP project ID.
   *
   * @return gcpProjectId
   */
  @JsonProperty(JSON_PROPERTY_GCP_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGcpProjectId() {
    return gcpProjectId;
  }

  public void setGcpProjectId(String gcpProjectId) {
    this.gcpProjectId = gcpProjectId;
  }

  public CloudInventorySyncConfigAttributes gcpServiceAccountEmail(String gcpServiceAccountEmail) {
    this.gcpServiceAccountEmail = gcpServiceAccountEmail;
    return this;
  }

  /**
   * Service account email for bucket access.
   *
   * @return gcpServiceAccountEmail
   */
  @JsonProperty(JSON_PROPERTY_GCP_SERVICE_ACCOUNT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGcpServiceAccountEmail() {
    return gcpServiceAccountEmail;
  }

  public void setGcpServiceAccountEmail(String gcpServiceAccountEmail) {
    this.gcpServiceAccountEmail = gcpServiceAccountEmail;
  }

  /**
   * Object key prefix or <code>/</code> when the entire bucket is synced.
   *
   * @return prefix
   */
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrefix() {
    return prefix;
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
   * @return CloudInventorySyncConfigAttributes
   */
  @JsonAnySetter
  public CloudInventorySyncConfigAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CloudInventorySyncConfigAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudInventorySyncConfigAttributes cloudInventorySyncConfigAttributes =
        (CloudInventorySyncConfigAttributes) o;
    return Objects.equals(this.awsAccountId, cloudInventorySyncConfigAttributes.awsAccountId)
        && Objects.equals(this.awsBucketName, cloudInventorySyncConfigAttributes.awsBucketName)
        && Objects.equals(this.awsRegion, cloudInventorySyncConfigAttributes.awsRegion)
        && Objects.equals(this.azureClientId, cloudInventorySyncConfigAttributes.azureClientId)
        && Objects.equals(
            this.azureContainerName, cloudInventorySyncConfigAttributes.azureContainerName)
        && Objects.equals(
            this.azureStorageAccountName,
            cloudInventorySyncConfigAttributes.azureStorageAccountName)
        && Objects.equals(this.azureTenantId, cloudInventorySyncConfigAttributes.azureTenantId)
        && Objects.equals(this.cloudProvider, cloudInventorySyncConfigAttributes.cloudProvider)
        && Objects.equals(this.error, cloudInventorySyncConfigAttributes.error)
        && Objects.equals(this.errorCode, cloudInventorySyncConfigAttributes.errorCode)
        && Objects.equals(this.gcpBucketName, cloudInventorySyncConfigAttributes.gcpBucketName)
        && Objects.equals(this.gcpProjectId, cloudInventorySyncConfigAttributes.gcpProjectId)
        && Objects.equals(
            this.gcpServiceAccountEmail, cloudInventorySyncConfigAttributes.gcpServiceAccountEmail)
        && Objects.equals(this.prefix, cloudInventorySyncConfigAttributes.prefix)
        && Objects.equals(
            this.additionalProperties, cloudInventorySyncConfigAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsAccountId,
        awsBucketName,
        awsRegion,
        azureClientId,
        azureContainerName,
        azureStorageAccountName,
        azureTenantId,
        cloudProvider,
        error,
        errorCode,
        gcpBucketName,
        gcpProjectId,
        gcpServiceAccountEmail,
        prefix,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudInventorySyncConfigAttributes {\n");
    sb.append("    awsAccountId: ").append(toIndentedString(awsAccountId)).append("\n");
    sb.append("    awsBucketName: ").append(toIndentedString(awsBucketName)).append("\n");
    sb.append("    awsRegion: ").append(toIndentedString(awsRegion)).append("\n");
    sb.append("    azureClientId: ").append(toIndentedString(azureClientId)).append("\n");
    sb.append("    azureContainerName: ").append(toIndentedString(azureContainerName)).append("\n");
    sb.append("    azureStorageAccountName: ")
        .append(toIndentedString(azureStorageAccountName))
        .append("\n");
    sb.append("    azureTenantId: ").append(toIndentedString(azureTenantId)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    gcpBucketName: ").append(toIndentedString(gcpBucketName)).append("\n");
    sb.append("    gcpProjectId: ").append(toIndentedString(gcpProjectId)).append("\n");
    sb.append("    gcpServiceAccountEmail: ")
        .append(toIndentedString(gcpServiceAccountEmail))
        .append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
