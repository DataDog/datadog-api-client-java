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
   * <p>The S3 archive destination.</p>
 */
@JsonPropertyOrder({
  LogsArchiveDestinationS3.JSON_PROPERTY_BUCKET,
  LogsArchiveDestinationS3.JSON_PROPERTY_ENCRYPTION,
  LogsArchiveDestinationS3.JSON_PROPERTY_INTEGRATION,
  LogsArchiveDestinationS3.JSON_PROPERTY_PATH,
  LogsArchiveDestinationS3.JSON_PROPERTY_STORAGE_CLASS,
  LogsArchiveDestinationS3.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArchiveDestinationS3 {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUCKET = "bucket";
  private String bucket;

  public static final String JSON_PROPERTY_ENCRYPTION = "encryption";
  private LogsArchiveEncryptionS3 encryption;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private LogsArchiveIntegrationS3 integration;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_STORAGE_CLASS = "storage_class";
  private LogsArchiveStorageClassS3Type storageClass = LogsArchiveStorageClassS3Type.STANDARD;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsArchiveDestinationS3Type type = LogsArchiveDestinationS3Type.S3;

  public LogsArchiveDestinationS3() {}

  @JsonCreator
  public LogsArchiveDestinationS3(
            @JsonProperty(required=true, value=JSON_PROPERTY_BUCKET)String bucket,
            @JsonProperty(required=true, value=JSON_PROPERTY_INTEGRATION)LogsArchiveIntegrationS3 integration,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)LogsArchiveDestinationS3Type type) {
        this.bucket = bucket;
        this.integration = integration;
        this.unparsed |= integration.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public LogsArchiveDestinationS3 bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * <p>The bucket where the archive will be stored.</p>
   * @return bucket
  **/
      @JsonProperty(JSON_PROPERTY_BUCKET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getBucket() {
        return bucket;
      }
  public void setBucket(String bucket) {
    this.bucket = bucket;
  }
  public LogsArchiveDestinationS3 encryption(LogsArchiveEncryptionS3 encryption) {
    this.encryption = encryption;
    this.unparsed |= encryption.unparsed;
    return this;
  }

  /**
   * <p>The S3 encryption settings.</p>
   * @return encryption
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENCRYPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsArchiveEncryptionS3 getEncryption() {
        return encryption;
      }
  public void setEncryption(LogsArchiveEncryptionS3 encryption) {
    this.encryption = encryption;
  }
  public LogsArchiveDestinationS3 integration(LogsArchiveIntegrationS3 integration) {
    this.integration = integration;
    this.unparsed |= integration.unparsed;
    return this;
  }

  /**
   * <p>The S3 Archive's integration destination.</p>
   * @return integration
  **/
      @JsonProperty(JSON_PROPERTY_INTEGRATION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsArchiveIntegrationS3 getIntegration() {
        return integration;
      }
  public void setIntegration(LogsArchiveIntegrationS3 integration) {
    this.integration = integration;
  }
  public LogsArchiveDestinationS3 path(String path) {
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
  public LogsArchiveDestinationS3 storageClass(LogsArchiveStorageClassS3Type storageClass) {
    this.storageClass = storageClass;
    this.unparsed |= !storageClass.isValid();
    return this;
  }

  /**
   * <p>The storage class where the archive will be stored.</p>
   * @return storageClass
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STORAGE_CLASS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsArchiveStorageClassS3Type getStorageClass() {
        return storageClass;
      }
  public void setStorageClass(LogsArchiveStorageClassS3Type storageClass) {
    if (!storageClass.isValid()) {
        this.unparsed = true;
    }
    this.storageClass = storageClass;
  }
  public LogsArchiveDestinationS3 type(LogsArchiveDestinationS3Type type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the S3 archive destination.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsArchiveDestinationS3Type getType() {
        return type;
      }
  public void setType(LogsArchiveDestinationS3Type type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return LogsArchiveDestinationS3
   */
  @JsonAnySetter
  public LogsArchiveDestinationS3 putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsArchiveDestinationS3 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveDestinationS3 logsArchiveDestinationS3 = (LogsArchiveDestinationS3) o;
    return Objects.equals(this.bucket, logsArchiveDestinationS3.bucket) && Objects.equals(this.encryption, logsArchiveDestinationS3.encryption) && Objects.equals(this.integration, logsArchiveDestinationS3.integration) && Objects.equals(this.path, logsArchiveDestinationS3.path) && Objects.equals(this.storageClass, logsArchiveDestinationS3.storageClass) && Objects.equals(this.type, logsArchiveDestinationS3.type) && Objects.equals(this.additionalProperties, logsArchiveDestinationS3.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(bucket,encryption,integration,path,storageClass,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveDestinationS3 {\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
