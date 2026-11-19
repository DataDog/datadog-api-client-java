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

/** Settings for creating the OpenAI Codex integration account. */
@JsonPropertyOrder({OpenAICodexIntegrationAccountSettingsRequest.JSON_PROPERTY_CODEX_WORKSPACE_ID})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpenAICodexIntegrationAccountSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODEX_WORKSPACE_ID = "codex_workspace_id";
  private String codexWorkspaceId;

  public OpenAICodexIntegrationAccountSettingsRequest() {}

  @JsonCreator
  public OpenAICodexIntegrationAccountSettingsRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_CODEX_WORKSPACE_ID)
          String codexWorkspaceId) {
    this.codexWorkspaceId = codexWorkspaceId;
  }

  public OpenAICodexIntegrationAccountSettingsRequest codexWorkspaceId(String codexWorkspaceId) {
    this.codexWorkspaceId = codexWorkspaceId;
    return this;
  }

  /**
   * ID of the Codex workspace to collect data from.
   *
   * @return codexWorkspaceId
   */
  @JsonProperty(JSON_PROPERTY_CODEX_WORKSPACE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCodexWorkspaceId() {
    return codexWorkspaceId;
  }

  public void setCodexWorkspaceId(String codexWorkspaceId) {
    this.codexWorkspaceId = codexWorkspaceId;
  }

  /** Return true if this OpenAICodexIntegrationAccountSettingsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAICodexIntegrationAccountSettingsRequest openAiCodexIntegrationAccountSettingsRequest =
        (OpenAICodexIntegrationAccountSettingsRequest) o;
    return Objects.equals(
        this.codexWorkspaceId, openAiCodexIntegrationAccountSettingsRequest.codexWorkspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codexWorkspaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAICodexIntegrationAccountSettingsRequest {\n");
    sb.append("    codexWorkspaceId: ").append(toIndentedString(codexWorkspaceId)).append("\n");
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
