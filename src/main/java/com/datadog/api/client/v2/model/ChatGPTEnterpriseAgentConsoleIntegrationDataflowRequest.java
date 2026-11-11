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

/**
 * Activity, token consumption, credits, and estimated usage costs across ChatGPT Chat, ChatGPT
 * Work, and Codex, shown in Agent Console with breakdowns by product, model, and user where OpenAI
 * provides them. Data already available from OpenAI appears within 1 hour of enabling this
 * dataflow.
 */
@JsonPropertyOrder({ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest.JSON_PROPERTY_ENABLED})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest() {}

  @JsonCreator
  public ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled) {
    this.enabled = enabled;
  }

  public ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether Datadog collects this data. Defaults to <code>true</code>; set to <code>false</code> to
   * stop collection.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Return true if this ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest
        chatGptEnterpriseAgentConsoleIntegrationDataflowRequest =
            (ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest) o;
    return Objects.equals(
        this.enabled, chatGptEnterpriseAgentConsoleIntegrationDataflowRequest.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
