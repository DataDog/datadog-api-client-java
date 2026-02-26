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
   * <p>The GCS archive destination.</p>
 */
@JsonPropertyOrder({
  LogsArchiveDestinationGCS.JSON_PROPERTY_BUCKET,
  LogsArchiveDestinationGCS.JSON_PROPERTY_INTEGRATION,
  LogsArchiveDestinationGCS.JSON_PROPERTY_PATH,
  LogsArchiveDestinationGCS.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArchiveDestinationGCS {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUCKET = "bucket";
  private String bucket;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private LogsArchiveIntegrationGCS integration;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsArchiveDestinationGCSType type = LogsArchiveDestinationGCSType.GCS;

  public LogsArchiveDestinationGCS() {}

  @JsonCreator
  public LogsArchiveDestinationGCS(
            @JsonProperty(required=true, value=JSON_PROPERTY_BUCKET)String bucket,
            @JsonProperty(required=true, value=JSON_PROPERTY_INTEGRATION)LogsArchiveIntegrationGCS integration,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)LogsArchiveDestinationGCSType type) {
        this.bucket = bucket;
        this.integration = integration;
        this.unparsed |= integration.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public LogsArchiveDestinationGCS bucket(String bucket) {
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
  public LogsArchiveDestinationGCS integration(LogsArchiveIntegrationGCS integration) {
    this.integration = integration;
    this.unparsed |= integration.unparsed;
    return this;
  }

  /**
   * <p>The GCS archive's integration destination.</p>
   * @return integration
  **/
      @JsonProperty(JSON_PROPERTY_INTEGRATION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsArchiveIntegrationGCS getIntegration() {
        return integration;
      }
  public void setIntegration(LogsArchiveIntegrationGCS integration) {
    this.integration = integration;
  }
  public LogsArchiveDestinationGCS path(String path) {
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
  public LogsArchiveDestinationGCS type(LogsArchiveDestinationGCSType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the GCS archive destination.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public LogsArchiveDestinationGCSType getType() {
        return type;
      }
  public void setType(LogsArchiveDestinationGCSType type) {
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
   * @return LogsArchiveDestinationGCS
   */
  @JsonAnySetter
  public LogsArchiveDestinationGCS putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsArchiveDestinationGCS object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveDestinationGCS logsArchiveDestinationGcs = (LogsArchiveDestinationGCS) o;
    return Objects.equals(this.bucket, logsArchiveDestinationGcs.bucket) && Objects.equals(this.integration, logsArchiveDestinationGcs.integration) && Objects.equals(this.path, logsArchiveDestinationGcs.path) && Objects.equals(this.type, logsArchiveDestinationGcs.type) && Objects.equals(this.additionalProperties, logsArchiveDestinationGcs.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(bucket,integration,path,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveDestinationGCS {\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
