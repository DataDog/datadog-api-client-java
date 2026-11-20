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
 * The <code>crowdstrike_fdr</code> source ingests CrowdStrike Falcon Data Replicator (FDR) data. It
 * reads file notifications from the CrowdStrike-managed SQS queue for your FDR feed and downloads
 * the referenced objects from the CrowdStrike-managed S3 bucket.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineCrowdStrikeFdrSource.JSON_PROPERTY_ACCESS_KEY_ID_KEY,
  ObservabilityPipelineCrowdStrikeFdrSource.JSON_PROPERTY_CLIENT_CONCURRENCY,
  ObservabilityPipelineCrowdStrikeFdrSource.JSON_PROPERTY_ID,
  ObservabilityPipelineCrowdStrikeFdrSource.JSON_PROPERTY_MAX_NUMBER_OF_MESSAGES,
  ObservabilityPipelineCrowdStrikeFdrSource.JSON_PROPERTY_REGION,
  ObservabilityPipelineCrowdStrikeFdrSource.JSON_PROPERTY_SECRET_ACCESS_KEY_KEY,
  ObservabilityPipelineCrowdStrikeFdrSource.JSON_PROPERTY_TLS,
  ObservabilityPipelineCrowdStrikeFdrSource.JSON_PROPERTY_TYPE,
  ObservabilityPipelineCrowdStrikeFdrSource.JSON_PROPERTY_URL_KEY,
  ObservabilityPipelineCrowdStrikeFdrSource.JSON_PROPERTY_VISIBILITY_TIMEOUT_SECS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineCrowdStrikeFdrSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_KEY_ID_KEY = "access_key_id_key";
  private String accessKeyIdKey;

  public static final String JSON_PROPERTY_CLIENT_CONCURRENCY = "client_concurrency";
  private Long clientConcurrency;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MAX_NUMBER_OF_MESSAGES = "max_number_of_messages";
  private Long maxNumberOfMessages;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_SECRET_ACCESS_KEY_KEY = "secret_access_key_key";
  private String secretAccessKeyKey;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineCrowdStrikeFdrSourceType type =
      ObservabilityPipelineCrowdStrikeFdrSourceType.CROWDSTRIKE_FDR;

  public static final String JSON_PROPERTY_URL_KEY = "url_key";
  private String urlKey;

  public static final String JSON_PROPERTY_VISIBILITY_TIMEOUT_SECS = "visibility_timeout_secs";
  private Long visibilityTimeoutSecs;

  public ObservabilityPipelineCrowdStrikeFdrSource() {}

  @JsonCreator
  public ObservabilityPipelineCrowdStrikeFdrSource(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_REGION) String region,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineCrowdStrikeFdrSourceType type) {
    this.id = id;
    this.region = region;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineCrowdStrikeFdrSource accessKeyIdKey(String accessKeyIdKey) {
    this.accessKeyIdKey = accessKeyIdKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the AWS access key ID that CrowdStrike
   * generated for the FDR feed.
   *
   * @return accessKeyIdKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY_ID_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccessKeyIdKey() {
    return accessKeyIdKey;
  }

  public void setAccessKeyIdKey(String accessKeyIdKey) {
    this.accessKeyIdKey = accessKeyIdKey;
  }

  public ObservabilityPipelineCrowdStrikeFdrSource clientConcurrency(Long clientConcurrency) {
    this.clientConcurrency = clientConcurrency;
    return this;
  }

  /**
   * Number of concurrent tasks polling the SQS queue. Defaults to the number of Worker threads.
   * minimum: 1 maximum: 9007199254740991
   *
   * @return clientConcurrency
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_CONCURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getClientConcurrency() {
    return clientConcurrency;
  }

  public void setClientConcurrency(Long clientConcurrency) {
    this.clientConcurrency = clientConcurrency;
  }

  public ObservabilityPipelineCrowdStrikeFdrSource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used in other parts of the pipeline to reference this
   * component (for example, as the <code>input</code> to downstream components).
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

  public ObservabilityPipelineCrowdStrikeFdrSource maxNumberOfMessages(Long maxNumberOfMessages) {
    this.maxNumberOfMessages = maxNumberOfMessages;
    return this;
  }

  /**
   * Maximum number of SQS messages to receive per poll. Each message can reference multiple files.
   * Defaults to 1. minimum: 1 maximum: 10
   *
   * @return maxNumberOfMessages
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OF_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxNumberOfMessages() {
    return maxNumberOfMessages;
  }

  public void setMaxNumberOfMessages(Long maxNumberOfMessages) {
    this.maxNumberOfMessages = maxNumberOfMessages;
  }

  public ObservabilityPipelineCrowdStrikeFdrSource region(String region) {
    this.region = region;
    return this;
  }

  /**
   * AWS region of the FDR feed's SQS queue and S3 bucket.
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

  public ObservabilityPipelineCrowdStrikeFdrSource secretAccessKeyKey(String secretAccessKeyKey) {
    this.secretAccessKeyKey = secretAccessKeyKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the AWS secret access key that
   * CrowdStrike generated for the FDR feed.
   *
   * @return secretAccessKeyKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECRET_ACCESS_KEY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSecretAccessKeyKey() {
    return secretAccessKeyKey;
  }

  public void setSecretAccessKeyKey(String secretAccessKeyKey) {
    this.secretAccessKeyKey = secretAccessKeyKey;
  }

  public ObservabilityPipelineCrowdStrikeFdrSource tls(ObservabilityPipelineTls tls) {
    this.tls = tls;
    this.unparsed |= tls.unparsed;
    return this;
  }

  /**
   * Configuration for enabling TLS encryption between the pipeline component and external services.
   *
   * @return tls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineTls getTls() {
    return tls;
  }

  public void setTls(ObservabilityPipelineTls tls) {
    this.tls = tls;
    if (tls != null) {
      this.unparsed |= tls.unparsed;
    }
  }

  public ObservabilityPipelineCrowdStrikeFdrSource type(
      ObservabilityPipelineCrowdStrikeFdrSourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The source type. Always <code>crowdstrike_fdr</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineCrowdStrikeFdrSourceType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineCrowdStrikeFdrSourceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ObservabilityPipelineCrowdStrikeFdrSource urlKey(String urlKey) {
    this.urlKey = urlKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the URL of the FDR feed's SQS queue.
   *
   * @return urlKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrlKey() {
    return urlKey;
  }

  public void setUrlKey(String urlKey) {
    this.urlKey = urlKey;
  }

  public ObservabilityPipelineCrowdStrikeFdrSource visibilityTimeoutSecs(
      Long visibilityTimeoutSecs) {
    this.visibilityTimeoutSecs = visibilityTimeoutSecs;
    return this;
  }

  /**
   * Number of seconds a received SQS message is hidden from other consumers. Set it higher than the
   * time needed to download and process the largest FDR file. Defaults to 300. minimum: 0 maximum:
   * 43200
   *
   * @return visibilityTimeoutSecs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBILITY_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVisibilityTimeoutSecs() {
    return visibilityTimeoutSecs;
  }

  public void setVisibilityTimeoutSecs(Long visibilityTimeoutSecs) {
    this.visibilityTimeoutSecs = visibilityTimeoutSecs;
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
   * @return ObservabilityPipelineCrowdStrikeFdrSource
   */
  @JsonAnySetter
  public ObservabilityPipelineCrowdStrikeFdrSource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineCrowdStrikeFdrSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineCrowdStrikeFdrSource observabilityPipelineCrowdStrikeFdrSource =
        (ObservabilityPipelineCrowdStrikeFdrSource) o;
    return Objects.equals(
            this.accessKeyIdKey, observabilityPipelineCrowdStrikeFdrSource.accessKeyIdKey)
        && Objects.equals(
            this.clientConcurrency, observabilityPipelineCrowdStrikeFdrSource.clientConcurrency)
        && Objects.equals(this.id, observabilityPipelineCrowdStrikeFdrSource.id)
        && Objects.equals(
            this.maxNumberOfMessages, observabilityPipelineCrowdStrikeFdrSource.maxNumberOfMessages)
        && Objects.equals(this.region, observabilityPipelineCrowdStrikeFdrSource.region)
        && Objects.equals(
            this.secretAccessKeyKey, observabilityPipelineCrowdStrikeFdrSource.secretAccessKeyKey)
        && Objects.equals(this.tls, observabilityPipelineCrowdStrikeFdrSource.tls)
        && Objects.equals(this.type, observabilityPipelineCrowdStrikeFdrSource.type)
        && Objects.equals(this.urlKey, observabilityPipelineCrowdStrikeFdrSource.urlKey)
        && Objects.equals(
            this.visibilityTimeoutSecs,
            observabilityPipelineCrowdStrikeFdrSource.visibilityTimeoutSecs)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineCrowdStrikeFdrSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessKeyIdKey,
        clientConcurrency,
        id,
        maxNumberOfMessages,
        region,
        secretAccessKeyKey,
        tls,
        type,
        urlKey,
        visibilityTimeoutSecs,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineCrowdStrikeFdrSource {\n");
    sb.append("    accessKeyIdKey: ").append(toIndentedString(accessKeyIdKey)).append("\n");
    sb.append("    clientConcurrency: ").append(toIndentedString(clientConcurrency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxNumberOfMessages: ")
        .append(toIndentedString(maxNumberOfMessages))
        .append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secretAccessKeyKey: ").append(toIndentedString(secretAccessKeyKey)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    urlKey: ").append(toIndentedString(urlKey)).append("\n");
    sb.append("    visibilityTimeoutSecs: ")
        .append(toIndentedString(visibilityTimeoutSecs))
        .append("\n");
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
