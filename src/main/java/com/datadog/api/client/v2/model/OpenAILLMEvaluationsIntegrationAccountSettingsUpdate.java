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
 * Settings for updating the OpenAI LLM Evaluations integration account. Only the fields provided
 * are changed.
 */
@JsonPropertyOrder({OpenAILLMEvaluationsIntegrationAccountSettingsUpdate.JSON_PROPERTY_CUSTOM_TAGS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpenAILLMEvaluationsIntegrationAccountSettingsUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_TAGS = "custom_tags";
  private String customTags;

  public OpenAILLMEvaluationsIntegrationAccountSettingsUpdate customTags(String customTags) {
    this.customTags = customTags;
    return this;
  }

  /**
   * Comma-separated list of custom tags applied to the data collected for this account, for example
   * <code>team:ai,env:prod</code>.
   *
   * @return customTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomTags() {
    return customTags;
  }

  public void setCustomTags(String customTags) {
    this.customTags = customTags;
  }

  /**
   * Return true if this OpenAILLMEvaluationsIntegrationAccountSettingsUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAILLMEvaluationsIntegrationAccountSettingsUpdate
        openAillmEvaluationsIntegrationAccountSettingsUpdate =
            (OpenAILLMEvaluationsIntegrationAccountSettingsUpdate) o;
    return Objects.equals(
        this.customTags, openAillmEvaluationsIntegrationAccountSettingsUpdate.customTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAILLMEvaluationsIntegrationAccountSettingsUpdate {\n");
    sb.append("    customTags: ").append(toIndentedString(customTags)).append("\n");
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
