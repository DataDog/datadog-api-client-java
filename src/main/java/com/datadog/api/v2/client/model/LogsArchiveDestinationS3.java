/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v2.client.model.LogsArchiveDestinationS3Type;
import com.datadog.api.v2.client.model.LogsArchiveIntegrationS3;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The S3 archive destination.
 */
@ApiModel(description = "The S3 archive destination.")
@JsonPropertyOrder({
  LogsArchiveDestinationS3.JSON_PROPERTY_BUCKET,
  LogsArchiveDestinationS3.JSON_PROPERTY_INTEGRATION,
  LogsArchiveDestinationS3.JSON_PROPERTY_PATH,
  LogsArchiveDestinationS3.JSON_PROPERTY_TYPE
})

public class LogsArchiveDestinationS3 {
  public static final String JSON_PROPERTY_BUCKET = "bucket";
  private String bucket;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private LogsArchiveIntegrationS3 integration;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsArchiveDestinationS3Type type = LogsArchiveDestinationS3Type.S3;


  public LogsArchiveDestinationS3 bucket(String bucket) {
    
    this.bucket = bucket;
    return this;
  }

   /**
   * The bucket where the archive will be stored.
   * @return bucket
  **/
  @ApiModelProperty(example = "bucket-name", required = true, value = "The bucket where the archive will be stored.")
  @JsonProperty(JSON_PROPERTY_BUCKET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBucket() {
    return bucket;
  }


  public void setBucket(String bucket) {
    this.bucket = bucket;
  }


  public LogsArchiveDestinationS3 integration(LogsArchiveIntegrationS3 integration) {
    
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
   * The archive path.
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The archive path.")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public LogsArchiveDestinationS3 type(LogsArchiveDestinationS3Type type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LogsArchiveDestinationS3Type getType() {
    return type;
  }


  public void setType(LogsArchiveDestinationS3Type type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveDestinationS3 logsArchiveDestinationS3 = (LogsArchiveDestinationS3) o;
    return Objects.equals(this.bucket, logsArchiveDestinationS3.bucket) &&
        Objects.equals(this.integration, logsArchiveDestinationS3.integration) &&
        Objects.equals(this.path, logsArchiveDestinationS3.path) &&
        Objects.equals(this.type, logsArchiveDestinationS3.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, integration, path, type);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

