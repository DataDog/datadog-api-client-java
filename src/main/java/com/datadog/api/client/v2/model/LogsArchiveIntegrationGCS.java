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
   * <p>The GCS archive's integration destination.</p>
 */
@JsonPropertyOrder({
  LogsArchiveIntegrationGCS.JSON_PROPERTY_CLIENT_EMAIL,
  LogsArchiveIntegrationGCS.JSON_PROPERTY_PROJECT_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArchiveIntegrationGCS {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLIENT_EMAIL = "client_email";
  private String clientEmail;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public LogsArchiveIntegrationGCS() {}

  @JsonCreator
  public LogsArchiveIntegrationGCS(
            @JsonProperty(required=true, value=JSON_PROPERTY_CLIENT_EMAIL)String clientEmail,
            @JsonProperty(required=true, value=JSON_PROPERTY_PROJECT_ID)String projectId) {
        this.clientEmail = clientEmail;
        this.projectId = projectId;
  }
  public LogsArchiveIntegrationGCS clientEmail(String clientEmail) {
    this.clientEmail = clientEmail;
    return this;
  }

  /**
   * <p>A client email.</p>
   * @return clientEmail
  **/
      @JsonProperty(JSON_PROPERTY_CLIENT_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getClientEmail() {
        return clientEmail;
      }
  public void setClientEmail(String clientEmail) {
    this.clientEmail = clientEmail;
  }
  public LogsArchiveIntegrationGCS projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * <p>A project ID.</p>
   * @return projectId
  **/
      @JsonProperty(JSON_PROPERTY_PROJECT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getProjectId() {
        return projectId;
      }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  /**
   * Return true if this LogsArchiveIntegrationGCS object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveIntegrationGCS logsArchiveIntegrationGcs = (LogsArchiveIntegrationGCS) o;
    return Objects.equals(this.clientEmail, logsArchiveIntegrationGcs.clientEmail) && Objects.equals(this.projectId, logsArchiveIntegrationGcs.projectId);
  }


  @Override
  public int hashCode() {
    return Objects.hash(clientEmail,projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveIntegrationGCS {\n");
    sb.append("    clientEmail: ").append(toIndentedString(clientEmail)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
