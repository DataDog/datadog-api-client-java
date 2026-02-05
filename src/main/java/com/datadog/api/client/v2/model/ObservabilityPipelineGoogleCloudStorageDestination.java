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
 * The <code>google_cloud_storage</code> destination stores logs in a Google Cloud Storage (GCS)
 * bucket. It requires a bucket name, GCP authentication, and metadata fields.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineGoogleCloudStorageDestination.JSON_PROPERTY_ACL,
  ObservabilityPipelineGoogleCloudStorageDestination.JSON_PROPERTY_AUTH,
  ObservabilityPipelineGoogleCloudStorageDestination.JSON_PROPERTY_BUCKET,
  ObservabilityPipelineGoogleCloudStorageDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineGoogleCloudStorageDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineGoogleCloudStorageDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineGoogleCloudStorageDestination.JSON_PROPERTY_KEY_PREFIX,
  ObservabilityPipelineGoogleCloudStorageDestination.JSON_PROPERTY_METADATA,
  ObservabilityPipelineGoogleCloudStorageDestination.JSON_PROPERTY_STORAGE_CLASS,
  ObservabilityPipelineGoogleCloudStorageDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineGoogleCloudStorageDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACL = "acl";
  private ObservabilityPipelineGoogleCloudStorageDestinationAcl acl;

  public static final String JSON_PROPERTY_AUTH = "auth";
  private ObservabilityPipelineGcpAuth auth;

  public static final String JSON_PROPERTY_BUCKET = "bucket";
  private String bucket;

  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_KEY_PREFIX = "key_prefix";
  private String keyPrefix;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private List<ObservabilityPipelineMetadataEntry> metadata = null;

  public static final String JSON_PROPERTY_STORAGE_CLASS = "storage_class";
  private ObservabilityPipelineGoogleCloudStorageDestinationStorageClass storageClass;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineGoogleCloudStorageDestinationType type =
      ObservabilityPipelineGoogleCloudStorageDestinationType.GOOGLE_CLOUD_STORAGE;

  public ObservabilityPipelineGoogleCloudStorageDestination() {}

  @JsonCreator
  public ObservabilityPipelineGoogleCloudStorageDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_BUCKET) String bucket,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_STORAGE_CLASS)
          ObservabilityPipelineGoogleCloudStorageDestinationStorageClass storageClass,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineGoogleCloudStorageDestinationType type) {
    this.bucket = bucket;
    this.id = id;
    this.inputs = inputs;
    this.storageClass = storageClass;
    this.unparsed |= !storageClass.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineGoogleCloudStorageDestination acl(
      ObservabilityPipelineGoogleCloudStorageDestinationAcl acl) {
    this.acl = acl;
    this.unparsed |= !acl.isValid();
    return this;
  }

  /**
   * Access control list setting for objects written to the bucket.
   *
   * @return acl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineGoogleCloudStorageDestinationAcl getAcl() {
    return acl;
  }

  public void setAcl(ObservabilityPipelineGoogleCloudStorageDestinationAcl acl) {
    if (!acl.isValid()) {
      this.unparsed = true;
    }
    this.acl = acl;
  }

  public ObservabilityPipelineGoogleCloudStorageDestination auth(
      ObservabilityPipelineGcpAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * GCP credentials used to authenticate with Google Cloud Storage.
   *
   * @return auth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineGcpAuth getAuth() {
    return auth;
  }

  public void setAuth(ObservabilityPipelineGcpAuth auth) {
    this.auth = auth;
  }

  public ObservabilityPipelineGoogleCloudStorageDestination bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * Name of the GCS bucket.
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

  public ObservabilityPipelineGoogleCloudStorageDestination buffer(
      ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
    this.unparsed |= buffer.unparsed;
    return this;
  }

  /**
   * Configuration for buffer settings on destination components.
   *
   * @return buffer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUFFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineBufferOptions getBuffer() {
    return buffer;
  }

  public void setBuffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
  }

  public ObservabilityPipelineGoogleCloudStorageDestination id(String id) {
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

  public ObservabilityPipelineGoogleCloudStorageDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineGoogleCloudStorageDestination addInputsItem(String inputsItem) {
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

  public ObservabilityPipelineGoogleCloudStorageDestination keyPrefix(String keyPrefix) {
    this.keyPrefix = keyPrefix;
    return this;
  }

  /**
   * Optional prefix for object keys within the GCS bucket.
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

  public ObservabilityPipelineGoogleCloudStorageDestination metadata(
      List<ObservabilityPipelineMetadataEntry> metadata) {
    this.metadata = metadata;
    for (ObservabilityPipelineMetadataEntry item : metadata) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineGoogleCloudStorageDestination addMetadataItem(
      ObservabilityPipelineMetadataEntry metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    this.unparsed |= metadataItem.unparsed;
    return this;
  }

  /**
   * Custom metadata to attach to each object uploaded to the GCS bucket.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ObservabilityPipelineMetadataEntry> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<ObservabilityPipelineMetadataEntry> metadata) {
    this.metadata = metadata;
  }

  public ObservabilityPipelineGoogleCloudStorageDestination storageClass(
      ObservabilityPipelineGoogleCloudStorageDestinationStorageClass storageClass) {
    this.storageClass = storageClass;
    this.unparsed |= !storageClass.isValid();
    return this;
  }

  /**
   * Storage class used for objects stored in GCS.
   *
   * @return storageClass
   */
  @JsonProperty(JSON_PROPERTY_STORAGE_CLASS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineGoogleCloudStorageDestinationStorageClass getStorageClass() {
    return storageClass;
  }

  public void setStorageClass(
      ObservabilityPipelineGoogleCloudStorageDestinationStorageClass storageClass) {
    if (!storageClass.isValid()) {
      this.unparsed = true;
    }
    this.storageClass = storageClass;
  }

  public ObservabilityPipelineGoogleCloudStorageDestination type(
      ObservabilityPipelineGoogleCloudStorageDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. Always <code>google_cloud_storage</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineGoogleCloudStorageDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineGoogleCloudStorageDestinationType type) {
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
   * @return ObservabilityPipelineGoogleCloudStorageDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineGoogleCloudStorageDestination putAdditionalProperty(
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

  /**
   * Return true if this ObservabilityPipelineGoogleCloudStorageDestination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineGoogleCloudStorageDestination
        observabilityPipelineGoogleCloudStorageDestination =
            (ObservabilityPipelineGoogleCloudStorageDestination) o;
    return Objects.equals(this.acl, observabilityPipelineGoogleCloudStorageDestination.acl)
        && Objects.equals(this.auth, observabilityPipelineGoogleCloudStorageDestination.auth)
        && Objects.equals(this.bucket, observabilityPipelineGoogleCloudStorageDestination.bucket)
        && Objects.equals(this.buffer, observabilityPipelineGoogleCloudStorageDestination.buffer)
        && Objects.equals(this.id, observabilityPipelineGoogleCloudStorageDestination.id)
        && Objects.equals(this.inputs, observabilityPipelineGoogleCloudStorageDestination.inputs)
        && Objects.equals(
            this.keyPrefix, observabilityPipelineGoogleCloudStorageDestination.keyPrefix)
        && Objects.equals(
            this.metadata, observabilityPipelineGoogleCloudStorageDestination.metadata)
        && Objects.equals(
            this.storageClass, observabilityPipelineGoogleCloudStorageDestination.storageClass)
        && Objects.equals(this.type, observabilityPipelineGoogleCloudStorageDestination.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineGoogleCloudStorageDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        acl,
        auth,
        bucket,
        buffer,
        id,
        inputs,
        keyPrefix,
        metadata,
        storageClass,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineGoogleCloudStorageDestination {\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    keyPrefix: ").append(toIndentedString(keyPrefix)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
