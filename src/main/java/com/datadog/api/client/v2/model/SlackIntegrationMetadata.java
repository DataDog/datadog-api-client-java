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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Incident integration metadata for the Slack integration. */
@JsonPropertyOrder({SlackIntegrationMetadata.JSON_PROPERTY_CHANNELS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SlackIntegrationMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANNELS = "channels";
  private List<SlackIntegrationMetadataChannelItem> channels = new ArrayList<>();

  public SlackIntegrationMetadata() {}

  @JsonCreator
  public SlackIntegrationMetadata(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHANNELS)
          List<SlackIntegrationMetadataChannelItem> channels) {
    this.channels = channels;
  }

  public SlackIntegrationMetadata channels(List<SlackIntegrationMetadataChannelItem> channels) {
    this.channels = channels;
    for (SlackIntegrationMetadataChannelItem item : channels) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SlackIntegrationMetadata addChannelsItem(
      SlackIntegrationMetadataChannelItem channelsItem) {
    this.channels.add(channelsItem);
    this.unparsed |= channelsItem.unparsed;
    return this;
  }

  /**
   * Array of Slack channels in this integration metadata.
   *
   * @return channels
   */
  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SlackIntegrationMetadataChannelItem> getChannels() {
    return channels;
  }

  public void setChannels(List<SlackIntegrationMetadataChannelItem> channels) {
    this.channels = channels;
  }

  /** Return true if this SlackIntegrationMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackIntegrationMetadata slackIntegrationMetadata = (SlackIntegrationMetadata) o;
    return Objects.equals(this.channels, slackIntegrationMetadata.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackIntegrationMetadata {\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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
