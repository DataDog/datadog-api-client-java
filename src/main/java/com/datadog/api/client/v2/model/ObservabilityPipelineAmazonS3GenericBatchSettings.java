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
   * <p>Event batching settings</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineAmazonS3GenericBatchSettings.JSON_PROPERTY_BATCH_SIZE,
  ObservabilityPipelineAmazonS3GenericBatchSettings.JSON_PROPERTY_TIMEOUT_SECS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAmazonS3GenericBatchSettings {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BATCH_SIZE = "batch_size";
  private Long batchSize;

  public static final String JSON_PROPERTY_TIMEOUT_SECS = "timeout_secs";
  private Long timeoutSecs;

  public ObservabilityPipelineAmazonS3GenericBatchSettings batchSize(Long batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  /**
   * <p>Maximum batch size in bytes.</p>
   * @return batchSize
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BATCH_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getBatchSize() {
        return batchSize;
      }
  public void setBatchSize(Long batchSize) {
    this.batchSize = batchSize;
  }
  public ObservabilityPipelineAmazonS3GenericBatchSettings timeoutSecs(Long timeoutSecs) {
    this.timeoutSecs = timeoutSecs;
    return this;
  }

  /**
   * <p>Maximum number of seconds to wait before flushing the batch.</p>
   * @return timeoutSecs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMEOUT_SECS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTimeoutSecs() {
        return timeoutSecs;
      }
  public void setTimeoutSecs(Long timeoutSecs) {
    this.timeoutSecs = timeoutSecs;
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
   * @return ObservabilityPipelineAmazonS3GenericBatchSettings
   */
  @JsonAnySetter
  public ObservabilityPipelineAmazonS3GenericBatchSettings putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineAmazonS3GenericBatchSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAmazonS3GenericBatchSettings observabilityPipelineAmazonS3GenericBatchSettings = (ObservabilityPipelineAmazonS3GenericBatchSettings) o;
    return Objects.equals(this.batchSize, observabilityPipelineAmazonS3GenericBatchSettings.batchSize) && Objects.equals(this.timeoutSecs, observabilityPipelineAmazonS3GenericBatchSettings.timeoutSecs) && Objects.equals(this.additionalProperties, observabilityPipelineAmazonS3GenericBatchSettings.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(batchSize,timeoutSecs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAmazonS3GenericBatchSettings {\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    timeoutSecs: ").append(toIndentedString(timeoutSecs)).append("\n");
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
