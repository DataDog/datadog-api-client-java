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
   * <p>Bill config.</p>
 */
@JsonPropertyOrder({
  BillConfig.JSON_PROPERTY_EXPORT_NAME,
  BillConfig.JSON_PROPERTY_EXPORT_PATH,
  BillConfig.JSON_PROPERTY_STORAGE_ACCOUNT,
  BillConfig.JSON_PROPERTY_STORAGE_CONTAINER
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BillConfig {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPORT_NAME = "export_name";
  private String exportName;

  public static final String JSON_PROPERTY_EXPORT_PATH = "export_path";
  private String exportPath;

  public static final String JSON_PROPERTY_STORAGE_ACCOUNT = "storage_account";
  private String storageAccount;

  public static final String JSON_PROPERTY_STORAGE_CONTAINER = "storage_container";
  private String storageContainer;

  public BillConfig() {}

  @JsonCreator
  public BillConfig(
            @JsonProperty(required=true, value=JSON_PROPERTY_EXPORT_NAME)String exportName,
            @JsonProperty(required=true, value=JSON_PROPERTY_EXPORT_PATH)String exportPath,
            @JsonProperty(required=true, value=JSON_PROPERTY_STORAGE_ACCOUNT)String storageAccount,
            @JsonProperty(required=true, value=JSON_PROPERTY_STORAGE_CONTAINER)String storageContainer) {
        this.exportName = exportName;
        this.exportPath = exportPath;
        this.storageAccount = storageAccount;
        this.storageContainer = storageContainer;
  }
  public BillConfig exportName(String exportName) {
    this.exportName = exportName;
    return this;
  }

  /**
   * <p>The name of the configured Azure Export.</p>
   * @return exportName
  **/
      @JsonProperty(JSON_PROPERTY_EXPORT_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getExportName() {
        return exportName;
      }
  public void setExportName(String exportName) {
    this.exportName = exportName;
  }
  public BillConfig exportPath(String exportPath) {
    this.exportPath = exportPath;
    return this;
  }

  /**
   * <p>The path where the Azure Export is saved.</p>
   * @return exportPath
  **/
      @JsonProperty(JSON_PROPERTY_EXPORT_PATH)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getExportPath() {
        return exportPath;
      }
  public void setExportPath(String exportPath) {
    this.exportPath = exportPath;
  }
  public BillConfig storageAccount(String storageAccount) {
    this.storageAccount = storageAccount;
    return this;
  }

  /**
   * <p>The name of the storage account where the Azure Export is saved.</p>
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
  public BillConfig storageContainer(String storageContainer) {
    this.storageContainer = storageContainer;
    return this;
  }

  /**
   * <p>The name of the storage container where the Azure Export is saved.</p>
   * @return storageContainer
  **/
      @JsonProperty(JSON_PROPERTY_STORAGE_CONTAINER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getStorageContainer() {
        return storageContainer;
      }
  public void setStorageContainer(String storageContainer) {
    this.storageContainer = storageContainer;
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
   * @return BillConfig
   */
  @JsonAnySetter
  public BillConfig putAdditionalProperty(String key, Object value) {
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
   * Return true if this BillConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillConfig billConfig = (BillConfig) o;
    return Objects.equals(this.exportName, billConfig.exportName) && Objects.equals(this.exportPath, billConfig.exportPath) && Objects.equals(this.storageAccount, billConfig.storageAccount) && Objects.equals(this.storageContainer, billConfig.storageContainer) && Objects.equals(this.additionalProperties, billConfig.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(exportName,exportPath,storageAccount,storageContainer, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillConfig {\n");
    sb.append("    exportName: ").append(toIndentedString(exportName)).append("\n");
    sb.append("    exportPath: ").append(toIndentedString(exportPath)).append("\n");
    sb.append("    storageAccount: ").append(toIndentedString(storageAccount)).append("\n");
    sb.append("    storageContainer: ").append(toIndentedString(storageContainer)).append("\n");
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
