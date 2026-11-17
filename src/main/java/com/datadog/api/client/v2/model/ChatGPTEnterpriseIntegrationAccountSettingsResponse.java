/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Settings configured on the ChatGPT Enterprise integration account. */
@JsonPropertyOrder({
  ChatGPTEnterpriseIntegrationAccountSettingsResponse.JSON_PROPERTY_OPENAI_ORG_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChatGPTEnterpriseIntegrationAccountSettingsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPENAI_ORG_ID = "openai_org_id";
  private String openaiOrgId;

  public ChatGPTEnterpriseIntegrationAccountSettingsResponse() {}

  @JsonCreator
  public ChatGPTEnterpriseIntegrationAccountSettingsResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_OPENAI_ORG_ID) String openaiOrgId) {
    this.openaiOrgId = openaiOrgId;
  }

  public ChatGPTEnterpriseIntegrationAccountSettingsResponse openaiOrgId(String openaiOrgId) {
    this.openaiOrgId = openaiOrgId;
    return this;
  }

  /**
   * OpenAI API Platform organization ID (<code>org-...</code>) that the Costs API uses for your
   * Enterprise usage. This is not the ChatGPT workspace UUID or your Datadog organization ID. A
   * value that does not match <code>^org-[A-Za-z0-9]+$</code> is rejected with a <code>422</code>
   * response.
   *
   * @return openaiOrgId
   */
  @JsonProperty(JSON_PROPERTY_OPENAI_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOpenaiOrgId() {
    return openaiOrgId;
  }

  public void setOpenaiOrgId(String openaiOrgId) {
    this.openaiOrgId = openaiOrgId;
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
   * @return ChatGPTEnterpriseIntegrationAccountSettingsResponse
   */
  @JsonAnySetter
  public ChatGPTEnterpriseIntegrationAccountSettingsResponse putAdditionalProperty(
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

  /**
   * Return true if this ChatGPTEnterpriseIntegrationAccountSettingsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatGPTEnterpriseIntegrationAccountSettingsResponse
        chatGptEnterpriseIntegrationAccountSettingsResponse =
            (ChatGPTEnterpriseIntegrationAccountSettingsResponse) o;
    return Objects.equals(
            this.openaiOrgId, chatGptEnterpriseIntegrationAccountSettingsResponse.openaiOrgId)
        && Objects.equals(
            this.additionalProperties,
            chatGptEnterpriseIntegrationAccountSettingsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openaiOrgId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatGPTEnterpriseIntegrationAccountSettingsResponse {\n");
    sb.append("    openaiOrgId: ").append(toIndentedString(openaiOrgId)).append("\n");
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
