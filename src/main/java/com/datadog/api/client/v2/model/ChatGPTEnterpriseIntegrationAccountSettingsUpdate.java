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
 * Settings for updating the ChatGPT Enterprise integration account. Only the fields provided are
 * changed.
 */
@JsonPropertyOrder({ChatGPTEnterpriseIntegrationAccountSettingsUpdate.JSON_PROPERTY_OPENAI_ORG_ID})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChatGPTEnterpriseIntegrationAccountSettingsUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPENAI_ORG_ID = "openai_org_id";
  private String openaiOrgId;

  public ChatGPTEnterpriseIntegrationAccountSettingsUpdate openaiOrgId(String openaiOrgId) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENAI_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOpenaiOrgId() {
    return openaiOrgId;
  }

  public void setOpenaiOrgId(String openaiOrgId) {
    this.openaiOrgId = openaiOrgId;
  }

  /** Return true if this ChatGPTEnterpriseIntegrationAccountSettingsUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatGPTEnterpriseIntegrationAccountSettingsUpdate
        chatGptEnterpriseIntegrationAccountSettingsUpdate =
            (ChatGPTEnterpriseIntegrationAccountSettingsUpdate) o;
    return Objects.equals(
        this.openaiOrgId, chatGptEnterpriseIntegrationAccountSettingsUpdate.openaiOrgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openaiOrgId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatGPTEnterpriseIntegrationAccountSettingsUpdate {\n");
    sb.append("    openaiOrgId: ").append(toIndentedString(openaiOrgId)).append("\n");
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
