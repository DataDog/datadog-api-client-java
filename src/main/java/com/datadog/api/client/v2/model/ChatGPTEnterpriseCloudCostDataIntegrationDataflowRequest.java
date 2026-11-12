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
 * ChatGPT Enterprise costs from the OpenAI Costs API, so that ChatGPT Enterprise spend can be
 * analyzed in <a href="https://docs.datadoghq.com/cloud_cost_management/">Cloud Cost
 * Management</a>. These costs are excluded from Cloud Cost Management spend-monitored billing.
 * Reported costs are estimates, not final invoice amounts.
 */
@JsonPropertyOrder({ChatGPTEnterpriseCloudCostDataIntegrationDataflowRequest.JSON_PROPERTY_ENABLED})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChatGPTEnterpriseCloudCostDataIntegrationDataflowRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public ChatGPTEnterpriseCloudCostDataIntegrationDataflowRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether Datadog collects this data. Defaults to <code>false</code>; set to <code>true</code> to
   * start collection.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Return true if this ChatGPTEnterpriseCloudCostDataIntegrationDataflowRequest object is equal to
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
    ChatGPTEnterpriseCloudCostDataIntegrationDataflowRequest
        chatGptEnterpriseCloudCostDataIntegrationDataflowRequest =
            (ChatGPTEnterpriseCloudCostDataIntegrationDataflowRequest) o;
    return Objects.equals(
        this.enabled, chatGptEnterpriseCloudCostDataIntegrationDataflowRequest.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatGPTEnterpriseCloudCostDataIntegrationDataflowRequest {\n");
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
