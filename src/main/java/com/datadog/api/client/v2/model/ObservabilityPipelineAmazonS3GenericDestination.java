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

/**
 * The <code>amazon_s3_generic</code> destination sends your logs to an Amazon S3 bucket.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineAmazonS3GenericDestination.JSON_PROPERTY_AUTH,
  ObservabilityPipelineAmazonS3GenericDestination.JSON_PROPERTY_BATCH_SETTINGS,
  ObservabilityPipelineAmazonS3GenericDestination.JSON_PROPERTY_BUCKET,
  ObservabilityPipelineAmazonS3GenericDestination.JSON_PROPERTY_COMPRESSION,
  ObservabilityPipelineAmazonS3GenericDestination.JSON_PROPERTY_ENCODING,
  ObservabilityPipelineAmazonS3GenericDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineAmazonS3GenericDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineAmazonS3GenericDestination.JSON_PROPERTY_KEY_PREFIX,
  ObservabilityPipelineAmazonS3GenericDestination.JSON_PROPERTY_REGION,
  ObservabilityPipelineAmazonS3GenericDestination.JSON_PROPERTY_STORAGE_CLASS,
  ObservabilityPipelineAmazonS3GenericDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAmazonS3GenericDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private ObservabilityPipelineAwsAuth auth;

  public static final String JSON_PROPERTY_BATCH_SETTINGS = "batch_settings";
  private ObservabilityPipelineAmazonS3GenericBatchSettings batchSettings;

  public static final String JSON_PROPERTY_BUCKET = "bucket";
  private String bucket;

  public static final String JSON_PROPERTY_COMPRESSION = "compression";
  private ObservabilityPipelineAmazonS3GenericCompression compression;

  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private ObservabilityPipelineAmazonS3GenericEncoding encoding;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_KEY_PREFIX = "key_prefix";
  private String keyPrefix;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_STORAGE_CLASS = "storage_class";
  private ObservabilityPipelineAmazonS3DestinationStorageClass storageClass;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineAmazonS3GenericDestinationType type =
      ObservabilityPipelineAmazonS3GenericDestinationType.GENERIC_ARCHIVES_S3;

  public ObservabilityPipelineAmazonS3GenericDestination() {}

  @JsonCreator
  public ObservabilityPipelineAmazonS3GenericDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_BUCKET) String bucket,
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPRESSION)
          ObservabilityPipelineAmazonS3GenericCompression compression,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENCODING)
          ObservabilityPipelineAmazonS3GenericEncoding encoding,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_REGION) String region,
      @JsonProperty(required = true, value = JSON_PROPERTY_STORAGE_CLASS)
          ObservabilityPipelineAmazonS3DestinationStorageClass storageClass,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineAmazonS3GenericDestinationType type) {
    this.bucket = bucket;
    this.compression = compression;
    this.unparsed |= compression.unparsed;
    this.encoding = encoding;
    this.unparsed |= encoding.unparsed;
    this.id = id;
    this.inputs = inputs;
    this.region = region;
    this.storageClass = storageClass;
    this.unparsed |= !storageClass.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineAmazonS3GenericDestination auth(ObservabilityPipelineAwsAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * AWS authentication credentials used for accessing AWS services such as S3. If omitted, the
   * system’s default credentials are used (for example, the IAM role and environment variables).
   *
   * @return auth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineAwsAuth getAuth() {
    return auth;
  }

  public void setAuth(ObservabilityPipelineAwsAuth auth) {
    this.auth = auth;
  }

  public ObservabilityPipelineAmazonS3GenericDestination batchSettings(
      ObservabilityPipelineAmazonS3GenericBatchSettings batchSettings) {
    this.batchSettings = batchSettings;
    this.unparsed |= batchSettings.unparsed;
    return this;
  }

  /**
   * Event batching settings
   *
   * @return batchSettings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCH_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineAmazonS3GenericBatchSettings getBatchSettings() {
    return batchSettings;
  }

  public void setBatchSettings(ObservabilityPipelineAmazonS3GenericBatchSettings batchSettings) {
    this.batchSettings = batchSettings;
  }

  public ObservabilityPipelineAmazonS3GenericDestination bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * S3 bucket name.
   *
   * @return bucket
   */
  @JsonProperty(JSON_PROPERTY_BUCKET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public ObservabilityPipelineAmazonS3GenericDestination compression(
      ObservabilityPipelineAmazonS3GenericCompression compression) {
    this.compression = compression;
    this.unparsed |= compression.unparsed;
    return this;
  }

  /**
   * Compression algorithm applied to encoded logs.
   *
   * @return compression
   */
  @JsonProperty(JSON_PROPERTY_COMPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAmazonS3GenericCompression getCompression() {
    return compression;
  }

  public void setCompression(ObservabilityPipelineAmazonS3GenericCompression compression) {
    this.compression = compression;
  }

  public ObservabilityPipelineAmazonS3GenericDestination encoding(
      ObservabilityPipelineAmazonS3GenericEncoding encoding) {
    this.encoding = encoding;
    this.unparsed |= encoding.unparsed;
    return this;
  }

  /**
   * Encoding format for the destination.
   *
   * @return encoding
   */
  @JsonProperty(JSON_PROPERTY_ENCODING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAmazonS3GenericEncoding getEncoding() {
    return encoding;
  }

  public void setEncoding(ObservabilityPipelineAmazonS3GenericEncoding encoding) {
    this.encoding = encoding;
  }

  public ObservabilityPipelineAmazonS3GenericDestination id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the destination component.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ObservabilityPipelineAmazonS3GenericDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineAmazonS3GenericDestination addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * A list of component IDs whose output is used as the <code>input</code> for this component.
   *
   * @return inputs
   */
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

  public ObservabilityPipelineAmazonS3GenericDestination keyPrefix(String keyPrefix) {
    this.keyPrefix = keyPrefix;
    return this;
  }

  /**
   * Optional prefix for object keys.
   *
   * @return keyPrefix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKeyPrefix() {
    return keyPrefix;
  }

  public void setKeyPrefix(String keyPrefix) {
    this.keyPrefix = keyPrefix;
  }

  public ObservabilityPipelineAmazonS3GenericDestination region(String region) {
    this.region = region;
    return this;
  }

  /**
   * AWS region of the S3 bucket.
   *
   * @return region
   */
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public ObservabilityPipelineAmazonS3GenericDestination storageClass(
      ObservabilityPipelineAmazonS3DestinationStorageClass storageClass) {
    this.storageClass = storageClass;
    this.unparsed |= !storageClass.isValid();
    return this;
  }

  /**
   * S3 storage class.
   *
   * @return storageClass
   */
  @JsonProperty(JSON_PROPERTY_STORAGE_CLASS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAmazonS3DestinationStorageClass getStorageClass() {
    return storageClass;
  }

  public void setStorageClass(ObservabilityPipelineAmazonS3DestinationStorageClass storageClass) {
    if (!storageClass.isValid()) {
      this.unparsed = true;
    }
    this.storageClass = storageClass;
  }

  public ObservabilityPipelineAmazonS3GenericDestination type(
      ObservabilityPipelineAmazonS3GenericDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. Always <code>amazon_s3_generic</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAmazonS3GenericDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineAmazonS3GenericDestinationType type) {
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
   * @return ObservabilityPipelineAmazonS3GenericDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineAmazonS3GenericDestination putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ObservabilityPipelineAmazonS3GenericDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAmazonS3GenericDestination
        observabilityPipelineAmazonS3GenericDestination =
            (ObservabilityPipelineAmazonS3GenericDestination) o;
    return Objects.equals(this.auth, observabilityPipelineAmazonS3GenericDestination.auth)
        && Objects.equals(
            this.batchSettings, observabilityPipelineAmazonS3GenericDestination.batchSettings)
        && Objects.equals(this.bucket, observabilityPipelineAmazonS3GenericDestination.bucket)
        && Objects.equals(
            this.compression, observabilityPipelineAmazonS3GenericDestination.compression)
        && Objects.equals(this.encoding, observabilityPipelineAmazonS3GenericDestination.encoding)
        && Objects.equals(this.id, observabilityPipelineAmazonS3GenericDestination.id)
        && Objects.equals(this.inputs, observabilityPipelineAmazonS3GenericDestination.inputs)
        && Objects.equals(this.keyPrefix, observabilityPipelineAmazonS3GenericDestination.keyPrefix)
        && Objects.equals(this.region, observabilityPipelineAmazonS3GenericDestination.region)
        && Objects.equals(
            this.storageClass, observabilityPipelineAmazonS3GenericDestination.storageClass)
        && Objects.equals(this.type, observabilityPipelineAmazonS3GenericDestination.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineAmazonS3GenericDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        auth,
        batchSettings,
        bucket,
        compression,
        encoding,
        id,
        inputs,
        keyPrefix,
        region,
        storageClass,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAmazonS3GenericDestination {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    batchSettings: ").append(toIndentedString(batchSettings)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    keyPrefix: ").append(toIndentedString(keyPrefix)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
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
