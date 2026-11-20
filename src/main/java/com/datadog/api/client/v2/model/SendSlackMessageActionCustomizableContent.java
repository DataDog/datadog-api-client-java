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

/** Options that customize the content of the Slack message sent for a Page. */
@JsonPropertyOrder({
  SendSlackMessageActionCustomizableContent.JSON_PROPERTY_INCLUDE_DESCRIPTION,
  SendSlackMessageActionCustomizableContent.JSON_PROPERTY_INCLUDE_SOURCE,
  SendSlackMessageActionCustomizableContent.JSON_PROPERTY_MIRROR_REPLIES,
  SendSlackMessageActionCustomizableContent.JSON_PROPERTY_THREAD_TIMELINE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SendSlackMessageActionCustomizableContent {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_DESCRIPTION = "include_description";
  private Boolean includeDescription;

  public static final String JSON_PROPERTY_INCLUDE_SOURCE = "include_source";
  private Boolean includeSource;

  public static final String JSON_PROPERTY_MIRROR_REPLIES = "mirror_replies";
  private Boolean mirrorReplies;

  public static final String JSON_PROPERTY_THREAD_TIMELINE = "thread_timeline";
  private Boolean threadTimeline;

  public SendSlackMessageActionCustomizableContent includeDescription(Boolean includeDescription) {
    this.includeDescription = includeDescription;
    return this;
  }

  /**
   * Whether to include the Page description in the Slack message.
   *
   * @return includeDescription
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeDescription() {
    return includeDescription;
  }

  public void setIncludeDescription(Boolean includeDescription) {
    this.includeDescription = includeDescription;
  }

  public SendSlackMessageActionCustomizableContent includeSource(Boolean includeSource) {
    this.includeSource = includeSource;
    return this;
  }

  /**
   * Whether to include the source that triggered the Page in the Slack message.
   *
   * @return includeSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeSource() {
    return includeSource;
  }

  public void setIncludeSource(Boolean includeSource) {
    this.includeSource = includeSource;
  }

  public SendSlackMessageActionCustomizableContent mirrorReplies(Boolean mirrorReplies) {
    this.mirrorReplies = mirrorReplies;
    return this;
  }

  /**
   * Whether to mirror replies posted in the Slack message thread to the Page timeline.
   *
   * @return mirrorReplies
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIRROR_REPLIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMirrorReplies() {
    return mirrorReplies;
  }

  public void setMirrorReplies(Boolean mirrorReplies) {
    this.mirrorReplies = mirrorReplies;
  }

  public SendSlackMessageActionCustomizableContent threadTimeline(Boolean threadTimeline) {
    this.threadTimeline = threadTimeline;
    return this;
  }

  /**
   * Whether to post Page timeline updates as replies in the Slack message thread.
   *
   * @return threadTimeline
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THREAD_TIMELINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getThreadTimeline() {
    return threadTimeline;
  }

  public void setThreadTimeline(Boolean threadTimeline) {
    this.threadTimeline = threadTimeline;
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
   * @return SendSlackMessageActionCustomizableContent
   */
  @JsonAnySetter
  public SendSlackMessageActionCustomizableContent putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SendSlackMessageActionCustomizableContent object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendSlackMessageActionCustomizableContent sendSlackMessageActionCustomizableContent =
        (SendSlackMessageActionCustomizableContent) o;
    return Objects.equals(
            this.includeDescription, sendSlackMessageActionCustomizableContent.includeDescription)
        && Objects.equals(
            this.includeSource, sendSlackMessageActionCustomizableContent.includeSource)
        && Objects.equals(
            this.mirrorReplies, sendSlackMessageActionCustomizableContent.mirrorReplies)
        && Objects.equals(
            this.threadTimeline, sendSlackMessageActionCustomizableContent.threadTimeline)
        && Objects.equals(
            this.additionalProperties,
            sendSlackMessageActionCustomizableContent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        includeDescription, includeSource, mirrorReplies, threadTimeline, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSlackMessageActionCustomizableContent {\n");
    sb.append("    includeDescription: ").append(toIndentedString(includeDescription)).append("\n");
    sb.append("    includeSource: ").append(toIndentedString(includeSource)).append("\n");
    sb.append("    mirrorReplies: ").append(toIndentedString(mirrorReplies)).append("\n");
    sb.append("    threadTimeline: ").append(toIndentedString(threadTimeline)).append("\n");
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
