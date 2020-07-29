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
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v2.client.model.LogsArchiveDestinationGCSType;
import com.datadog.api.v2.client.model.LogsArchiveIntegrationGCS;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * The GCS archive destination.
 */
@ApiModel(description = "The GCS archive destination.")
@JsonPropertyOrder({
  LogsArchiveDestinationGCS.JSON_PROPERTY_BUCKET,
  LogsArchiveDestinationGCS.JSON_PROPERTY_INTEGRATION,
  LogsArchiveDestinationGCS.JSON_PROPERTY_PATH,
  LogsArchiveDestinationGCS.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsArchiveDestinationGCS {
  public static final String JSON_PROPERTY_BUCKET = "bucket";
  private String bucket;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private LogsArchiveIntegrationGCS integration;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsArchiveDestinationGCSType type = LogsArchiveDestinationGCSType.GCS;


  public LogsArchiveDestinationGCS bucket(String bucket) {
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


  public LogsArchiveDestinationGCS integration(LogsArchiveIntegrationGCS integration) {
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


  public LogsArchiveDestinationGCS type(LogsArchiveDestinationGCSType type) {
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

  public LogsArchiveDestinationGCSType getType() {
    return type;
  }


  public void setType(LogsArchiveDestinationGCSType type) {
    this.type = type;
  }


  /**
   * Return true if this LogsArchiveDestinationGCS object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveDestinationGCS logsArchiveDestinationGCS = (LogsArchiveDestinationGCS) o;
    return Objects.equals(this.bucket, logsArchiveDestinationGCS.bucket) &&
        Objects.equals(this.integration, logsArchiveDestinationGCS.integration) &&
        Objects.equals(this.path, logsArchiveDestinationGCS.path) &&
        Objects.equals(this.type, logsArchiveDestinationGCS.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, integration, path, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveDestinationGCS {\n");
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

