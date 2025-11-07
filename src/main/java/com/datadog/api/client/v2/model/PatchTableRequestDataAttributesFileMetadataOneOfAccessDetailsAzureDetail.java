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

/** Azure Blob Storage access configuration. */
@JsonPropertyOrder({
  PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail
      .JSON_PROPERTY_AZURE_CLIENT_ID,
  PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail
      .JSON_PROPERTY_AZURE_CONTAINER_NAME,
  PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail
      .JSON_PROPERTY_AZURE_STORAGE_ACCOUNT_NAME,
  PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail
      .JSON_PROPERTY_AZURE_TENANT_ID,
  PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail.JSON_PROPERTY_FILE_PATH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AZURE_CLIENT_ID = "azure_client_id";
  private String azureClientId;

  public static final String JSON_PROPERTY_AZURE_CONTAINER_NAME = "azure_container_name";
  private String azureContainerName;

  public static final String JSON_PROPERTY_AZURE_STORAGE_ACCOUNT_NAME =
      "azure_storage_account_name";
  private String azureStorageAccountName;

  public static final String JSON_PROPERTY_AZURE_TENANT_ID = "azure_tenant_id";
  private String azureTenantId;

  public static final String JSON_PROPERTY_FILE_PATH = "file_path";
  private String filePath;

  public PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail azureClientId(
      String azureClientId) {
    this.azureClientId = azureClientId;
    return this;
  }

  /**
   * Azure service principal (application) client ID with permissions to read from the container.
   *
   * @return azureClientId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AZURE_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAzureClientId() {
    return azureClientId;
  }

  public void setAzureClientId(String azureClientId) {
    this.azureClientId = azureClientId;
  }

  public PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail
      azureContainerName(String azureContainerName) {
    this.azureContainerName = azureContainerName;
    return this;
  }

  /**
   * Azure Blob Storage container containing the CSV file.
   *
   * @return azureContainerName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AZURE_CONTAINER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAzureContainerName() {
    return azureContainerName;
  }

  public void setAzureContainerName(String azureContainerName) {
    this.azureContainerName = azureContainerName;
  }

  public PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail
      azureStorageAccountName(String azureStorageAccountName) {
    this.azureStorageAccountName = azureStorageAccountName;
    return this;
  }

  /**
   * Azure storage account where the container is located.
   *
   * @return azureStorageAccountName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AZURE_STORAGE_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAzureStorageAccountName() {
    return azureStorageAccountName;
  }

  public void setAzureStorageAccountName(String azureStorageAccountName) {
    this.azureStorageAccountName = azureStorageAccountName;
  }

  public PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail azureTenantId(
      String azureTenantId) {
    this.azureTenantId = azureTenantId;
    return this;
  }

  /**
   * Azure Active Directory tenant ID.
   *
   * @return azureTenantId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AZURE_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAzureTenantId() {
    return azureTenantId;
  }

  public void setAzureTenantId(String azureTenantId) {
    this.azureTenantId = azureTenantId;
  }

  public PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail filePath(
      String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * The relative file path from the Azure container root to the CSV file.
   *
   * @return filePath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
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
   * @return PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail
   */
  @JsonAnySetter
  public PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail
        patchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail =
            (PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail) o;
    return Objects.equals(
            this.azureClientId,
            patchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail.azureClientId)
        && Objects.equals(
            this.azureContainerName,
            patchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail
                .azureContainerName)
        && Objects.equals(
            this.azureStorageAccountName,
            patchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail
                .azureStorageAccountName)
        && Objects.equals(
            this.azureTenantId,
            patchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail.azureTenantId)
        && Objects.equals(
            this.filePath,
            patchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail.filePath)
        && Objects.equals(
            this.additionalProperties,
            patchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        azureClientId,
        azureContainerName,
        azureStorageAccountName,
        azureTenantId,
        filePath,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail {\n");
    sb.append("    azureClientId: ").append(toIndentedString(azureClientId)).append("\n");
    sb.append("    azureContainerName: ").append(toIndentedString(azureContainerName)).append("\n");
    sb.append("    azureStorageAccountName: ")
        .append(toIndentedString(azureStorageAccountName))
        .append("\n");
    sb.append("    azureTenantId: ").append(toIndentedString(azureTenantId)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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
