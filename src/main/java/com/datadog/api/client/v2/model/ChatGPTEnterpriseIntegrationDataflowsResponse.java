/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Data Datadog collects from ChatGPT Enterprise, keyed by dataflow id. */
@JsonPropertyOrder({
  ChatGPTEnterpriseIntegrationDataflowsResponse.JSON_PROPERTY_CHATGPT_ENTERPRISE_AGENT_CONSOLE,
  ChatGPTEnterpriseIntegrationDataflowsResponse.JSON_PROPERTY_CHATGPT_ENTERPRISE_CLOUD_COST_DATA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChatGPTEnterpriseIntegrationDataflowsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHATGPT_ENTERPRISE_AGENT_CONSOLE =
      "chatgpt-enterprise-agent-console";
  private ChatGPTEnterpriseAgentConsoleIntegrationDataflowResponse chatgptEnterpriseAgentConsole;

  public static final String JSON_PROPERTY_CHATGPT_ENTERPRISE_CLOUD_COST_DATA =
      "chatgpt-enterprise-cloud-cost-data";
  private ChatGPTEnterpriseCloudCostDataIntegrationDataflowResponse chatgptEnterpriseCloudCostData;

  public ChatGPTEnterpriseIntegrationDataflowsResponse chatgptEnterpriseAgentConsole(
      ChatGPTEnterpriseAgentConsoleIntegrationDataflowResponse chatgptEnterpriseAgentConsole) {
    this.chatgptEnterpriseAgentConsole = chatgptEnterpriseAgentConsole;
    this.unparsed |= chatgptEnterpriseAgentConsole.unparsed;
    return this;
  }

  /**
   * Activity, token consumption, credits, and estimated usage costs across ChatGPT Chat, ChatGPT
   * Work, and Codex, shown in Agent Console with breakdowns by product, model, and user where
   * OpenAI provides them.
   *
   * @return chatgptEnterpriseAgentConsole
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHATGPT_ENTERPRISE_AGENT_CONSOLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChatGPTEnterpriseAgentConsoleIntegrationDataflowResponse
      getChatgptEnterpriseAgentConsole() {
    return chatgptEnterpriseAgentConsole;
  }

  public void setChatgptEnterpriseAgentConsole(
      ChatGPTEnterpriseAgentConsoleIntegrationDataflowResponse chatgptEnterpriseAgentConsole) {
    this.chatgptEnterpriseAgentConsole = chatgptEnterpriseAgentConsole;
    if (chatgptEnterpriseAgentConsole != null) {
      this.unparsed |= chatgptEnterpriseAgentConsole.unparsed;
    }
  }

  public ChatGPTEnterpriseIntegrationDataflowsResponse chatgptEnterpriseCloudCostData(
      ChatGPTEnterpriseCloudCostDataIntegrationDataflowResponse chatgptEnterpriseCloudCostData) {
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
  public ChatGPTEnterpriseCloudCostDataIntegrationDataflowResponse
      getChatgptEnterpriseCloudCostData() {
    return chatgptEnterpriseCloudCostData;
  }

  public void setChatgptEnterpriseCloudCostData(
      ChatGPTEnterpriseCloudCostDataIntegrationDataflowResponse chatgptEnterpriseCloudCostData) {
    this.chatgptEnterpriseCloudCostData = chatgptEnterpriseCloudCostData;
    if (chatgptEnterpriseCloudCostData != null) {
      this.unparsed |= chatgptEnterpriseCloudCostData.unparsed;
    }
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ChatGPTEnterpriseIntegrationDataflowsResponse
   */
  @JsonAnySetter
  public ChatGPTEnterpriseIntegrationDataflowsResponse putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ChatGPTEnterpriseIntegrationDataflowsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatGPTEnterpriseIntegrationDataflowsResponse chatGptEnterpriseIntegrationDataflowsResponse =
        (ChatGPTEnterpriseIntegrationDataflowsResponse) o;
    return Objects.equals(
            this.chatgptEnterpriseAgentConsole,
            chatGptEnterpriseIntegrationDataflowsResponse.chatgptEnterpriseAgentConsole)
        && Objects.equals(
            this.chatgptEnterpriseCloudCostData,
            chatGptEnterpriseIntegrationDataflowsResponse.chatgptEnterpriseCloudCostData)
        && Objects.equals(
            this.additionalProperties,
            chatGptEnterpriseIntegrationDataflowsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        chatgptEnterpriseAgentConsole, chatgptEnterpriseCloudCostData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatGPTEnterpriseIntegrationDataflowsResponse {\n");
    sb.append("    chatgptEnterpriseAgentConsole: ")
        .append(toIndentedString(chatgptEnterpriseAgentConsole))
        .append("\n");
    sb.append("    chatgptEnterpriseCloudCostData: ")
        .append(toIndentedString(chatgptEnterpriseCloudCostData))
        .append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
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
