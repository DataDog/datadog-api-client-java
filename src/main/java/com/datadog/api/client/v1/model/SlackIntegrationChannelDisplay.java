/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Configuration options for what is shown in an alert event message. */
@JsonPropertyOrder({
  SlackIntegrationChannelDisplay.JSON_PROPERTY_MESSAGE,
  SlackIntegrationChannelDisplay.JSON_PROPERTY_NOTIFIED,
  SlackIntegrationChannelDisplay.JSON_PROPERTY_SNAPSHOT,
  SlackIntegrationChannelDisplay.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SlackIntegrationChannelDisplay {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MESSAGE = "message";
  private Boolean message = true;

  public static final String JSON_PROPERTY_NOTIFIED = "notified";
  private Boolean notified = true;

  public static final String JSON_PROPERTY_SNAPSHOT = "snapshot";
  private Boolean snapshot = true;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Boolean tags = true;

  public SlackIntegrationChannelDisplay message(Boolean message) {
    this.message = message;
    return this;
  }

  /**
   * Show the main body of the alert event.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMessage() {
    return message;
  }

  public void setMessage(Boolean message) {
    this.message = message;
  }

  public SlackIntegrationChannelDisplay notified(Boolean notified) {
    this.notified = notified;
    return this;
  }

  /**
   * Show the list of @-handles in the alert event.
   *
   * @return notified
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotified() {
    return notified;
  }

  public void setNotified(Boolean notified) {
    this.notified = notified;
  }

  public SlackIntegrationChannelDisplay snapshot(Boolean snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  /**
   * Show the alert event's snapshot image.
   *
   * @return snapshot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(Boolean snapshot) {
    this.snapshot = snapshot;
  }

  public SlackIntegrationChannelDisplay tags(Boolean tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Show the scopes on which the monitor alerted.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTags() {
    return tags;
  }

  public void setTags(Boolean tags) {
    this.tags = tags;
  }

  /** Return true if this SlackIntegrationChannelDisplay object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackIntegrationChannelDisplay slackIntegrationChannelDisplay =
        (SlackIntegrationChannelDisplay) o;
    return Objects.equals(this.message, slackIntegrationChannelDisplay.message)
        && Objects.equals(this.notified, slackIntegrationChannelDisplay.notified)
        && Objects.equals(this.snapshot, slackIntegrationChannelDisplay.snapshot)
        && Objects.equals(this.tags, slackIntegrationChannelDisplay.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, notified, snapshot, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackIntegrationChannelDisplay {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    notified: ").append(toIndentedString(notified)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
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
