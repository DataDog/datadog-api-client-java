/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The Azure archive's integration destination. */
@JsonPropertyOrder({
  LogsArchiveIntegrationAzure.JSON_PROPERTY_CLIENT_ID,
  LogsArchiveIntegrationAzure.JSON_PROPERTY_TENANT_ID
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArchiveIntegrationAzure {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private String tenantId;

  public LogsArchiveIntegrationAzure() {}

  @JsonCreator
  public LogsArchiveIntegrationAzure(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_ID) String clientId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TENANT_ID) String tenantId) {
    this.clientId = clientId;
    this.tenantId = tenantId;
  }

  public LogsArchiveIntegrationAzure clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * A client ID.
   *
   * @return clientId
   */
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
   *
   * @return tenantId
   */
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  /** Return true if this LogsArchiveIntegrationAzure object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveIntegrationAzure logsArchiveIntegrationAzure = (LogsArchiveIntegrationAzure) o;
    return Objects.equals(this.clientId, logsArchiveIntegrationAzure.clientId)
        && Objects.equals(this.tenantId, logsArchiveIntegrationAzure.tenantId);
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
