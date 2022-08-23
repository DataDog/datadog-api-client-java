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
   * <p>The S3 archive destination.</p>
 */
@JsonPropertyOrder({
  LogsArchiveDestinationS3.JSON_PROPERTY_BUCKET,
  LogsArchiveDestinationS3.JSON_PROPERTY_INTEGRATION,
  LogsArchiveDestinationS3.JSON_PROPERTY_PATH,
  LogsArchiveDestinationS3.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArchiveDestinationS3 {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUCKET = "bucket";
  private String bucket;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private LogsArchiveIntegrationS3 integration;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

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
    return Objects.equals(this.bucket, logsArchiveDestinationS3.bucket) && Objects.equals(this.integration, logsArchiveDestinationS3.integration) && Objects.equals(this.path, logsArchiveDestinationS3.path) && Objects.equals(this.type, logsArchiveDestinationS3.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(bucket,integration,path,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveDestinationS3 {\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
