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
   * <p>The <code>amazon_s3</code> destination sends your logs in Datadog-rehydratable format to an Amazon S3 bucket for archiving.</p>
   * <p><strong>Supported pipeline types:</strong> logs</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineAmazonS3Destination.JSON_PROPERTY_AUTH,
  ObservabilityPipelineAmazonS3Destination.JSON_PROPERTY_BUCKET,
  ObservabilityPipelineAmazonS3Destination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineAmazonS3Destination.JSON_PROPERTY_ID,
  ObservabilityPipelineAmazonS3Destination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineAmazonS3Destination.JSON_PROPERTY_KEY_PREFIX,
  ObservabilityPipelineAmazonS3Destination.JSON_PROPERTY_REGION,
  ObservabilityPipelineAmazonS3Destination.JSON_PROPERTY_STORAGE_CLASS,
  ObservabilityPipelineAmazonS3Destination.JSON_PROPERTY_TLS,
  ObservabilityPipelineAmazonS3Destination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAmazonS3Destination {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private ObservabilityPipelineAwsAuth auth;

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

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_STORAGE_CLASS = "storage_class";
  private ObservabilityPipelineAmazonS3DestinationStorageClass storageClass;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineAmazonS3DestinationType type = ObservabilityPipelineAmazonS3DestinationType.AMAZON_S3;

  public ObservabilityPipelineAmazonS3Destination() {}

  @JsonCreator
  public ObservabilityPipelineAmazonS3Destination(
            @JsonProperty(required=true, value=JSON_PROPERTY_BUCKET)String bucket,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_INPUTS)List<String> inputs,
            @JsonProperty(required=true, value=JSON_PROPERTY_REGION)String region,
            @JsonProperty(required=true, value=JSON_PROPERTY_STORAGE_CLASS)ObservabilityPipelineAmazonS3DestinationStorageClass storageClass,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineAmazonS3DestinationType type) {
        this.bucket = bucket;
        this.id = id;
        this.inputs = inputs;
        this.region = region;
        this.storageClass = storageClass;
        this.unparsed |= !storageClass.isValid();
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineAmazonS3Destination auth(ObservabilityPipelineAwsAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * <p>AWS authentication credentials used for accessing AWS services such as S3.
   * If omitted, the system’s default credentials are used (for example, the IAM role and environment variables).</p>
   * @return auth
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineAwsAuth getAuth() {
        return auth;
      }
  public void setAuth(ObservabilityPipelineAwsAuth auth) {
    this.auth = auth;
  }
  public ObservabilityPipelineAmazonS3Destination bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * <p>S3 bucket name.</p>
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
  public ObservabilityPipelineAmazonS3Destination buffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
    this.unparsed |= buffer.unparsed;
    return this;
  }

  /**
   * <p>Configuration for buffer settings on destination components.</p>
   * @return buffer
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BUFFER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineBufferOptions getBuffer() {
        return buffer;
      }
  public void setBuffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
  }
  public ObservabilityPipelineAmazonS3Destination id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Unique identifier for the destination component.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public ObservabilityPipelineAmazonS3Destination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }
  public ObservabilityPipelineAmazonS3Destination addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * <p>A list of component IDs whose output is used as the <code>input</code> for this component.</p>
   * @return inputs
  **/
      @JsonProperty(JSON_PROPERTY_INPUTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getInputs() {
        return inputs;
      }
  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }
  public ObservabilityPipelineAmazonS3Destination keyPrefix(String keyPrefix) {
    this.keyPrefix = keyPrefix;
    return this;
  }

  /**
   * <p>Optional prefix for object keys.</p>
   * @return keyPrefix
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_KEY_PREFIX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getKeyPrefix() {
        return keyPrefix;
      }
  public void setKeyPrefix(String keyPrefix) {
    this.keyPrefix = keyPrefix;
  }
  public ObservabilityPipelineAmazonS3Destination region(String region) {
    this.region = region;
    return this;
  }

  /**
   * <p>AWS region of the S3 bucket.</p>
   * @return region
  **/
      @JsonProperty(JSON_PROPERTY_REGION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getRegion() {
        return region;
      }
  public void setRegion(String region) {
    this.region = region;
  }
  public ObservabilityPipelineAmazonS3Destination storageClass(ObservabilityPipelineAmazonS3DestinationStorageClass storageClass) {
    this.storageClass = storageClass;
    this.unparsed |= !storageClass.isValid();
    return this;
  }

  /**
   * <p>S3 storage class.</p>
   * @return storageClass
  **/
      @JsonProperty(JSON_PROPERTY_STORAGE_CLASS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineAmazonS3DestinationStorageClass getStorageClass() {
        return storageClass;
      }
  public void setStorageClass(ObservabilityPipelineAmazonS3DestinationStorageClass storageClass) {
    if (!storageClass.isValid()) {
        this.unparsed = true;
    }
    this.storageClass = storageClass;
  }
  public ObservabilityPipelineAmazonS3Destination tls(ObservabilityPipelineTls tls) {
    this.tls = tls;
    this.unparsed |= tls.unparsed;
    return this;
  }

  /**
   * <p>Configuration for enabling TLS encryption between the pipeline component and external services.</p>
   * @return tls
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TLS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineTls getTls() {
        return tls;
      }
  public void setTls(ObservabilityPipelineTls tls) {
    this.tls = tls;
  }
  public ObservabilityPipelineAmazonS3Destination type(ObservabilityPipelineAmazonS3DestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The destination type. Always <code>amazon_s3</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineAmazonS3DestinationType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineAmazonS3DestinationType type) {
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
   * @return ObservabilityPipelineAmazonS3Destination
   */
  @JsonAnySetter
  public ObservabilityPipelineAmazonS3Destination putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineAmazonS3Destination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAmazonS3Destination observabilityPipelineAmazonS3Destination = (ObservabilityPipelineAmazonS3Destination) o;
    return Objects.equals(this.auth, observabilityPipelineAmazonS3Destination.auth) && Objects.equals(this.bucket, observabilityPipelineAmazonS3Destination.bucket) && Objects.equals(this.buffer, observabilityPipelineAmazonS3Destination.buffer) && Objects.equals(this.id, observabilityPipelineAmazonS3Destination.id) && Objects.equals(this.inputs, observabilityPipelineAmazonS3Destination.inputs) && Objects.equals(this.keyPrefix, observabilityPipelineAmazonS3Destination.keyPrefix) && Objects.equals(this.region, observabilityPipelineAmazonS3Destination.region) && Objects.equals(this.storageClass, observabilityPipelineAmazonS3Destination.storageClass) && Objects.equals(this.tls, observabilityPipelineAmazonS3Destination.tls) && Objects.equals(this.type, observabilityPipelineAmazonS3Destination.type) && Objects.equals(this.additionalProperties, observabilityPipelineAmazonS3Destination.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(auth,bucket,buffer,id,inputs,keyPrefix,region,storageClass,tls,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAmazonS3Destination {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    keyPrefix: ").append(toIndentedString(keyPrefix)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
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
