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
   * <p>The Azure archive destination.</p>
 */
@JsonPropertyOrder({
  LogsArchiveDestinationAzure.JSON_PROPERTY_CONTAINER,
  LogsArchiveDestinationAzure.JSON_PROPERTY_INTEGRATION,
  LogsArchiveDestinationAzure.JSON_PROPERTY_PATH,
  LogsArchiveDestinationAzure.JSON_PROPERTY_REGION,
  LogsArchiveDestinationAzure.JSON_PROPERTY_STORAGE_ACCOUNT,
  LogsArchiveDestinationAzure.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArchiveDestinationAzure {
  @JsonIgnore
  public boolean unparsed = false;
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
            @JsonProperty(required=true, value=JSON_PROPERTY_CONTAINER)String container,
            @JsonProperty(required=true, value=JSON_PROPERTY_INTEGRATION)LogsArchiveIntegrationAzure integration,
            @JsonProperty(required=true, value=JSON_PROPERTY_STORAGE_ACCOUNT)String storageAccount,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)LogsArchiveDestinationAzureType type) {
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
   * <p>The container where the archive will be stored.</p>
   * @return container
  **/
      @JsonProperty(JSON_PROPERTY_CONTAINER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>The Azure archive's integration destination.</p>
   * @return integration
  **/
      @JsonProperty(JSON_PROPERTY_INTEGRATION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>The archive path.</p>
   * @return path
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PATH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The region where the archive will be stored.</p>
   * @return region
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REGION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The associated storage account.</p>
   * @return storageAccount
  **/
      @JsonProperty(JSON_PROPERTY_STORAGE_ACCOUNT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>Type of the Azure archive destination.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * Return true if this LogsArchiveDestinationAzure object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveDestinationAzure logsArchiveDestinationAzure = (LogsArchiveDestinationAzure) o;
    return Objects.equals(this.container, logsArchiveDestinationAzure.container) && Objects.equals(this.integration, logsArchiveDestinationAzure.integration) && Objects.equals(this.path, logsArchiveDestinationAzure.path) && Objects.equals(this.region, logsArchiveDestinationAzure.region) && Objects.equals(this.storageAccount, logsArchiveDestinationAzure.storageAccount) && Objects.equals(this.type, logsArchiveDestinationAzure.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(container,integration,path,region,storageAccount,type);
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
    sb.append("}");
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
