/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Data Datadog collects from ChatGPT Enterprise, keyed by dataflow id. Each dataflow turns on a
 * distinct kind of collection: set <code>enabled</code> to start or stop it. Defaults listed on
 * each dataflow apply when the account is created; on update, omitted fields keep their current
 * values. Every dataflow requires a ChatGPT Enterprise workspace with access to the OpenAI Costs
 * API; a dataflow enabled without it is stored but collects no data.
 */
@JsonPropertyOrder({
  ChatGPTEnterpriseIntegrationDataflowsRequest.JSON_PROPERTY_CHATGPT_ENTERPRISE_AGENT_CONSOLE,
  ChatGPTEnterpriseIntegrationDataflowsRequest.JSON_PROPERTY_CHATGPT_ENTERPRISE_CLOUD_COST_DATA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChatGPTEnterpriseIntegrationDataflowsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHATGPT_ENTERPRISE_AGENT_CONSOLE =
      "chatgpt-enterprise-agent-console";
  private ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest chatgptEnterpriseAgentConsole;

  public static final String JSON_PROPERTY_CHATGPT_ENTERPRISE_CLOUD_COST_DATA =
      "chatgpt-enterprise-cloud-cost-data";
  private ChatGPTEnterpriseCloudCostDataIntegrationDataflowRequest chatgptEnterpriseCloudCostData;

  public ChatGPTEnterpriseIntegrationDataflowsRequest chatgptEnterpriseAgentConsole(
      ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest chatgptEnterpriseAgentConsole) {
    this.chatgptEnterpriseAgentConsole = chatgptEnterpriseAgentConsole;
    this.unparsed |= chatgptEnterpriseAgentConsole.unparsed;
    return this;
  }

  /**
   * Activity, token consumption, credits, and estimated usage costs across ChatGPT Chat, ChatGPT
   * Work, and Codex, shown in Agent Console with breakdowns by product, model, and user where
   * OpenAI provides them. Data already available from OpenAI appears within 1 hour of enabling this
   * dataflow.
   *
   * @return chatgptEnterpriseAgentConsole
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHATGPT_ENTERPRISE_AGENT_CONSOLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest
      getChatgptEnterpriseAgentConsole() {
    return chatgptEnterpriseAgentConsole;
  }

  public void setChatgptEnterpriseAgentConsole(
      ChatGPTEnterpriseAgentConsoleIntegrationDataflowRequest chatgptEnterpriseAgentConsole) {
    this.chatgptEnterpriseAgentConsole = chatgptEnterpriseAgentConsole;
    if (chatgptEnterpriseAgentConsole != null) {
      this.unparsed |= chatgptEnterpriseAgentConsole.unparsed;
    }
  }

  public ChatGPTEnterpriseIntegrationDataflowsRequest chatgptEnterpriseCloudCostData(
      ChatGPTEnterpriseCloudCostDataIntegrationDataflowRequest chatgptEnterpriseCloudCostData) {
    this.chatgptEnterpriseCloudCostData = chatgptEnterpriseCloudCostData;
    this.unparsed |= chatgptEnterpriseCloudCostData.unparsed;
    return this;
  }

  /**
   * ChatGPT Enterprise costs from the OpenAI Costs API, so that ChatGPT Enterprise spend can be
   * analyzed in <a href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost
   * Management</a>. These costs are excluded from Cloud Cost Management spend-monitored billing.
   * Reported costs are estimates, not final invoice amounts.
   *
   * @return chatgptEnterpriseCloudCostData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHATGPT_ENTERPRISE_CLOUD_COST_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChatGPTEnterpriseCloudCostDataIntegrationDataflowRequest
      getChatgptEnterpriseCloudCostData() {
    return chatgptEnterpriseCloudCostData;
  }

  public void setChatgptEnterpriseCloudCostData(
      ChatGPTEnterpriseCloudCostDataIntegrationDataflowRequest chatgptEnterpriseCloudCostData) {
    this.chatgptEnterpriseCloudCostData = chatgptEnterpriseCloudCostData;
    if (chatgptEnterpriseCloudCostData != null) {
      this.unparsed |= chatgptEnterpriseCloudCostData.unparsed;
    }
  }

  /** Return true if this ChatGPTEnterpriseIntegrationDataflowsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatGPTEnterpriseIntegrationDataflowsRequest chatGptEnterpriseIntegrationDataflowsRequest =
        (ChatGPTEnterpriseIntegrationDataflowsRequest) o;
    return Objects.equals(
            this.chatgptEnterpriseAgentConsole,
            chatGptEnterpriseIntegrationDataflowsRequest.chatgptEnterpriseAgentConsole)
        && Objects.equals(
            this.chatgptEnterpriseCloudCostData,
            chatGptEnterpriseIntegrationDataflowsRequest.chatgptEnterpriseCloudCostData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatgptEnterpriseAgentConsole, chatgptEnterpriseCloudCostData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatGPTEnterpriseIntegrationDataflowsRequest {\n");
    sb.append("    chatgptEnterpriseAgentConsole: ")
        .append(toIndentedString(chatgptEnterpriseAgentConsole))
        .append("\n");
    sb.append("    chatgptEnterpriseCloudCostData: ")
        .append(toIndentedString(chatgptEnterpriseCloudCostData))
        .append("\n");
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
