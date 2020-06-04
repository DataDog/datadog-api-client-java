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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The Azure archive&#39;s integration destination.
 */
@ApiModel(description = "The Azure archive's integration destination.")
@JsonPropertyOrder({
  LogsArchiveIntegrationAzure.JSON_PROPERTY_CLIENT_ID,
  LogsArchiveIntegrationAzure.JSON_PROPERTY_TENANT_ID
})

public class LogsArchiveIntegrationAzure {
  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private String tenantId;


  public LogsArchiveIntegrationAzure clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * A client ID.
   * @return clientId
  **/
  @ApiModelProperty(example = "aaaaaaaa-1a1a-1a1a-1a1a-aaaaaaaaaaaa", required = true, value = "A client ID.")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public LogsArchiveIntegrationAzure tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * A tenant ID.
   * @return tenantId
  **/
  @ApiModelProperty(example = "aaaaaaaa-1a1a-1a1a-1a1a-aaaaaaaaaaaa", required = true, value = "A tenant ID.")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveIntegrationAzure logsArchiveIntegrationAzure = (LogsArchiveIntegrationAzure) o;
    return Objects.equals(this.clientId, logsArchiveIntegrationAzure.clientId) &&
        Objects.equals(this.tenantId, logsArchiveIntegrationAzure.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, tenantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveIntegrationAzure {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

