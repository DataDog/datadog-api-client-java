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

/** Azure config. */
@JsonPropertyOrder({
  AzureUCConfig.JSON_PROPERTY_ACCOUNT_ID,
  AzureUCConfig.JSON_PROPERTY_CLIENT_ID,
  AzureUCConfig.JSON_PROPERTY_CREATED_AT,
  AzureUCConfig.JSON_PROPERTY_DATASET_TYPE,
  AzureUCConfig.JSON_PROPERTY_ERROR_MESSAGES,
  AzureUCConfig.JSON_PROPERTY_EXPORT_NAME,
  AzureUCConfig.JSON_PROPERTY_EXPORT_PATH,
  AzureUCConfig.JSON_PROPERTY_ID,
  AzureUCConfig.JSON_PROPERTY_MONTHS,
  AzureUCConfig.JSON_PROPERTY_SCOPE,
  AzureUCConfig.JSON_PROPERTY_STATUS,
  AzureUCConfig.JSON_PROPERTY_STATUS_UPDATED_AT,
  AzureUCConfig.JSON_PROPERTY_STORAGE_ACCOUNT,
  AzureUCConfig.JSON_PROPERTY_STORAGE_CONTAINER,
  AzureUCConfig.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AzureUCConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_DATASET_TYPE = "dataset_type";
  private String datasetType;

  public static final String JSON_PROPERTY_ERROR_MESSAGES = "error_messages";
  private JsonNullable<List<String>> errorMessages = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_EXPORT_NAME = "export_name";
  private String exportName;

  public static final String JSON_PROPERTY_EXPORT_PATH = "export_path";
  private String exportPath;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MONTHS = "months";
  private Integer months;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STATUS_UPDATED_AT = "status_updated_at";
  private String statusUpdatedAt;

  public static final String JSON_PROPERTY_STORAGE_ACCOUNT = "storage_account";
  private String storageAccount;

  public static final String JSON_PROPERTY_STORAGE_CONTAINER = "storage_container";
  private String storageContainer;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public AzureUCConfig() {}

  @JsonCreator
  public AzureUCConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_ID) String clientId,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_TYPE) String datasetType,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPORT_NAME) String exportName,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPORT_PATH) String exportPath,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE) String scope,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status,
      @JsonProperty(required = true, value = JSON_PROPERTY_STORAGE_ACCOUNT) String storageAccount,
      @JsonProperty(required = true, value = JSON_PROPERTY_STORAGE_CONTAINER)
          String storageContainer) {
    this.accountId = accountId;
    this.clientId = clientId;
    this.datasetType = datasetType;
    this.exportName = exportName;
    this.exportPath = exportPath;
    this.scope = scope;
    this.status = status;
    this.storageAccount = storageAccount;
    this.storageContainer = storageContainer;
  }

  public AzureUCConfig accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The tenant ID of the Azure account.
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

  public AzureUCConfig clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The client ID of the Azure account.
   *
   * @return clientId
   */
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public AzureUCConfig createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the Azure config was created.
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

  public AzureUCConfig datasetType(String datasetType) {
    this.datasetType = datasetType;
    return this;
  }

  /**
   * The dataset type of the Azure config.
   *
   * @return datasetType
   */
  @JsonProperty(JSON_PROPERTY_DATASET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDatasetType() {
    return datasetType;
  }

  public void setDatasetType(String datasetType) {
    this.datasetType = datasetType;
  }

  public AzureUCConfig errorMessages(List<String> errorMessages) {
    this.errorMessages = JsonNullable.<List<String>>of(errorMessages);
    return this;
  }

  public AzureUCConfig addErrorMessagesItem(String errorMessagesItem) {
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
   * The error messages for the Azure config.
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

  public AzureUCConfig exportName(String exportName) {
    this.exportName = exportName;
    return this;
  }

  /**
   * The name of the configured Azure Export.
   *
   * @return exportName
   */
  @JsonProperty(JSON_PROPERTY_EXPORT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExportName() {
    return exportName;
  }

  public void setExportName(String exportName) {
    this.exportName = exportName;
  }

  public AzureUCConfig exportPath(String exportPath) {
    this.exportPath = exportPath;
    return this;
  }

  /**
   * The path where the Azure Export is saved.
   *
   * @return exportPath
   */
  @JsonProperty(JSON_PROPERTY_EXPORT_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExportPath() {
    return exportPath;
  }

  public void setExportPath(String exportPath) {
    this.exportPath = exportPath;
  }

  public AzureUCConfig id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the Azure config.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AzureUCConfig months(Integer months) {
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

  public AzureUCConfig scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The scope of your observed subscription.
   *
   * @return scope
   */
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public AzureUCConfig status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the Azure config.
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

  public AzureUCConfig statusUpdatedAt(String statusUpdatedAt) {
    this.statusUpdatedAt = statusUpdatedAt;
    return this;
  }

  /**
   * The timestamp when the Azure config status was last updated.
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

  public AzureUCConfig storageAccount(String storageAccount) {
    this.storageAccount = storageAccount;
    return this;
  }

  /**
   * The name of the storage account where the Azure Export is saved.
   *
   * @return storageAccount
   */
  @JsonProperty(JSON_PROPERTY_STORAGE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStorageAccount() {
    return storageAccount;
  }

  public void setStorageAccount(String storageAccount) {
    this.storageAccount = storageAccount;
  }

  public AzureUCConfig storageContainer(String storageContainer) {
    this.storageContainer = storageContainer;
    return this;
  }

  /**
   * The name of the storage container where the Azure Export is saved.
   *
   * @return storageContainer
   */
  @JsonProperty(JSON_PROPERTY_STORAGE_CONTAINER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStorageContainer() {
    return storageContainer;
  }

  public void setStorageContainer(String storageContainer) {
    this.storageContainer = storageContainer;
  }

  public AzureUCConfig updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the Azure config was last updated.
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
   * @return AzureUCConfig
   */
  @JsonAnySetter
  public AzureUCConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AzureUCConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureUCConfig azureUcConfig = (AzureUCConfig) o;
    return Objects.equals(this.accountId, azureUcConfig.accountId)
        && Objects.equals(this.clientId, azureUcConfig.clientId)
        && Objects.equals(this.createdAt, azureUcConfig.createdAt)
        && Objects.equals(this.datasetType, azureUcConfig.datasetType)
        && Objects.equals(this.errorMessages, azureUcConfig.errorMessages)
        && Objects.equals(this.exportName, azureUcConfig.exportName)
        && Objects.equals(this.exportPath, azureUcConfig.exportPath)
        && Objects.equals(this.id, azureUcConfig.id)
        && Objects.equals(this.months, azureUcConfig.months)
        && Objects.equals(this.scope, azureUcConfig.scope)
        && Objects.equals(this.status, azureUcConfig.status)
        && Objects.equals(this.statusUpdatedAt, azureUcConfig.statusUpdatedAt)
        && Objects.equals(this.storageAccount, azureUcConfig.storageAccount)
        && Objects.equals(this.storageContainer, azureUcConfig.storageContainer)
        && Objects.equals(this.updatedAt, azureUcConfig.updatedAt)
        && Objects.equals(this.additionalProperties, azureUcConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        clientId,
        createdAt,
        datasetType,
        errorMessages,
        exportName,
        exportPath,
        id,
        months,
        scope,
        status,
        statusUpdatedAt,
        storageAccount,
        storageContainer,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureUCConfig {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datasetType: ").append(toIndentedString(datasetType)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    exportName: ").append(toIndentedString(exportName)).append("\n");
    sb.append("    exportPath: ").append(toIndentedString(exportPath)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdatedAt: ").append(toIndentedString(statusUpdatedAt)).append("\n");
    sb.append("    storageAccount: ").append(toIndentedString(storageAccount)).append("\n");
    sb.append("    storageContainer: ").append(toIndentedString(storageContainer)).append("\n");
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
