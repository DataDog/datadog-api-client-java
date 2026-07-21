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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Attributes of a flattened prompt version returned for SDK consumption. Exactly one of <code>
 * template</code> and <code>chat_template</code> is returned.
 */
@JsonPropertyOrder({
  LLMObsPromptSDKDataAttributes.JSON_PROPERTY_CHAT_TEMPLATE,
  LLMObsPromptSDKDataAttributes.JSON_PROPERTY_LABELS,
  LLMObsPromptSDKDataAttributes.JSON_PROPERTY_PROMPT_ID,
  LLMObsPromptSDKDataAttributes.JSON_PROPERTY_PROMPT_VERSION_UUID,
  LLMObsPromptSDKDataAttributes.JSON_PROPERTY_TEMPLATE,
  LLMObsPromptSDKDataAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPromptSDKDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHAT_TEMPLATE = "chat_template";
  private List<LLMObsPromptChatMessage> chatTemplate = null;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<String> labels = null;

  public static final String JSON_PROPERTY_PROMPT_ID = "prompt_id";
  private String promptId;

  public static final String JSON_PROPERTY_PROMPT_VERSION_UUID = "prompt_version_uuid";
  private String promptVersionUuid;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private String template;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public LLMObsPromptSDKDataAttributes chatTemplate(List<LLMObsPromptChatMessage> chatTemplate) {
    this.chatTemplate = chatTemplate;
    if (chatTemplate != null) {
      for (LLMObsPromptChatMessage item : chatTemplate) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LLMObsPromptSDKDataAttributes addChatTemplateItem(
      LLMObsPromptChatMessage chatTemplateItem) {
    if (this.chatTemplate == null) {
      this.chatTemplate = new ArrayList<>();
    }
    this.chatTemplate.add(chatTemplateItem);
    this.unparsed |= chatTemplateItem.unparsed;
    return this;
  }

  /**
   * Chat template for this prompt version, as a list of role and content messages. Omitted for text
   * templates.
   *
   * @return chatTemplate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHAT_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsPromptChatMessage> getChatTemplate() {
    return chatTemplate;
  }

  public void setChatTemplate(List<LLMObsPromptChatMessage> chatTemplate) {
    this.chatTemplate = chatTemplate;
    if (chatTemplate != null) {
      for (LLMObsPromptChatMessage item : chatTemplate) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsPromptSDKDataAttributes labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public LLMObsPromptSDKDataAttributes addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Labels attached to the selected version.
   *
   * @return labels
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getLabels() {
    return labels;
  }

  @Deprecated
  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public LLMObsPromptSDKDataAttributes promptId(String promptId) {
    this.promptId = promptId;
    return this;
  }

  /**
   * Customer-provided identifier of the prompt.
   *
   * @return promptId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPromptId() {
    return promptId;
  }

  public void setPromptId(String promptId) {
    this.promptId = promptId;
  }

  public LLMObsPromptSDKDataAttributes promptVersionUuid(String promptVersionUuid) {
    this.promptVersionUuid = promptVersionUuid;
    return this;
  }

  /**
   * Unique identifier of this prompt version.
   *
   * @return promptVersionUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROMPT_VERSION_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPromptVersionUuid() {
    return promptVersionUuid;
  }

  public void setPromptVersionUuid(String promptVersionUuid) {
    this.promptVersionUuid = promptVersionUuid;
  }

  public LLMObsPromptSDKDataAttributes template(String template) {
    this.template = template;
    return this;
  }

  /**
   * Text template for this prompt version. Omitted for chat templates.
   *
   * @return template
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public LLMObsPromptSDKDataAttributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version identifier for this prompt version. This is the sequential version number unless a
   * user-supplied version identifier was set, in which case that identifier is used instead.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
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
   * @return LLMObsPromptSDKDataAttributes
   */
  @JsonAnySetter
  public LLMObsPromptSDKDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsPromptSDKDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPromptSDKDataAttributes llmObsPromptSdkDataAttributes = (LLMObsPromptSDKDataAttributes) o;
    return Objects.equals(this.chatTemplate, llmObsPromptSdkDataAttributes.chatTemplate)
        && Objects.equals(this.labels, llmObsPromptSdkDataAttributes.labels)
        && Objects.equals(this.promptId, llmObsPromptSdkDataAttributes.promptId)
        && Objects.equals(this.promptVersionUuid, llmObsPromptSdkDataAttributes.promptVersionUuid)
        && Objects.equals(this.template, llmObsPromptSdkDataAttributes.template)
        && Objects.equals(this.version, llmObsPromptSdkDataAttributes.version)
        && Objects.equals(
            this.additionalProperties, llmObsPromptSdkDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        chatTemplate, labels, promptId, promptVersionUuid, template, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPromptSDKDataAttributes {\n");
    sb.append("    chatTemplate: ").append(toIndentedString(chatTemplate)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    promptId: ").append(toIndentedString(promptId)).append("\n");
    sb.append("    promptVersionUuid: ").append(toIndentedString(promptVersionUuid)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
