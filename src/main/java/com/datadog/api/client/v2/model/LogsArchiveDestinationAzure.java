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

/** The Azure archive destination. */
@JsonPropertyOrder({
  LogsArchiveDestinationAzure.JSON_PROPERTY_CONTAINER,
  LogsArchiveDestinationAzure.JSON_PROPERTY_INTEGRATION,
  LogsArchiveDestinationAzure.JSON_PROPERTY_PATH,
  LogsArchiveDestinationAzure.JSON_PROPERTY_REGION,
  LogsArchiveDestinationAzure.JSON_PROPERTY_STORAGE_ACCOUNT,
  LogsArchiveDestinationAzure.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArchiveDestinationAzure {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTAINER = "container";
  private String container;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private LogsArchiveIntegrationAzure integration;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_STORAGE_ACCOUNT = "storage_account";
  private String storageAccount;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsArchiveDestinationAzureType type = LogsArchiveDestinationAzureType.AZURE;

  public LogsArchiveDestinationAzure() {}

  @JsonCreator
  public LogsArchiveDestinationAzure(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTAINER) String container,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION)
          LogsArchiveIntegrationAzure integration,
      @JsonProperty(required = true, value = JSON_PROPERTY_STORAGE_ACCOUNT) String storageAccount,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          LogsArchiveDestinationAzureType type) {
    this.container = container;
    this.integration = integration;
    this.unparsed |= integration.unparsed;
    this.storageAccount = storageAccount;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogsArchiveDestinationAzure container(String container) {
    this.container = container;
    return this;
  }

  /**
   * The container where the archive will be stored.
   *
   * @return container
   */
  @JsonProperty(JSON_PROPERTY_CONTAINER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public LogsArchiveDestinationAzure integration(LogsArchiveIntegrationAzure integration) {
    this.integration = integration;
    this.unparsed |= integration.unparsed;
    return this;
  }

  /**
   * The Azure archive's integration destination.
   *
   * @return integration
   */
  @JsonProperty(JSON_PROPERTY_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsArchiveIntegrationAzure getIntegration() {
    return integration;
  }

  public void setIntegration(LogsArchiveIntegrationAzure integration) {
    this.integration = integration;
  }

  public LogsArchiveDestinationAzure path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The archive path.
   *
   * @return path
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public LogsArchiveDestinationAzure region(String region) {
    this.region = region;
    return this;
  }

  /**
   * The region where the archive will be stored.
   *
   * @return region
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public LogsArchiveDestinationAzure storageAccount(String storageAccount) {
    this.storageAccount = storageAccount;
    return this;
  }

  /**
   * The associated storage account.
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

  public LogsArchiveDestinationAzure type(LogsArchiveDestinationAzureType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the Azure archive destination.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsArchiveDestinationAzureType getType() {
    return type;
  }

  public void setType(LogsArchiveDestinationAzureType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return LogsArchiveDestinationAzure
   */
  @JsonAnySetter
  public LogsArchiveDestinationAzure putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsArchiveDestinationAzure object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveDestinationAzure logsArchiveDestinationAzure = (LogsArchiveDestinationAzure) o;
    return Objects.equals(this.container, logsArchiveDestinationAzure.container)
        && Objects.equals(this.integration, logsArchiveDestinationAzure.integration)
        && Objects.equals(this.path, logsArchiveDestinationAzure.path)
        && Objects.equals(this.region, logsArchiveDestinationAzure.region)
        && Objects.equals(this.storageAccount, logsArchiveDestinationAzure.storageAccount)
        && Objects.equals(this.type, logsArchiveDestinationAzure.type)
        && Objects.equals(
            this.additionalProperties, logsArchiveDestinationAzure.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        container, integration, path, region, storageAccount, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveDestinationAzure {\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    storageAccount: ").append(toIndentedString(storageAccount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
