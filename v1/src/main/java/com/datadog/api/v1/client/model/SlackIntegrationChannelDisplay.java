/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v1.client.JSON;


/**
 * Configuration options for what is shown in an alert event message.
 */
@ApiModel(description = "Configuration options for what is shown in an alert event message.")
@JsonPropertyOrder({
  SlackIntegrationChannelDisplay.JSON_PROPERTY_MESSAGE,
  SlackIntegrationChannelDisplay.JSON_PROPERTY_NOTIFIED,
  SlackIntegrationChannelDisplay.JSON_PROPERTY_SNAPSHOT,
  SlackIntegrationChannelDisplay.JSON_PROPERTY_TAGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SlackIntegrationChannelDisplay {
  @JsonIgnore
  public boolean unparsed = false;
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
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Show the main body of the alert event.")
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
   * @return notified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Show the list of @-handles in the alert event.")
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
   * Show the alert event&#39;s snapshot image.
   * @return snapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Show the alert event's snapshot image.")
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
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Show the scopes on which the monitor alerted.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTags() {
    return tags;
  }


  public void setTags(Boolean tags) {
    this.tags = tags;
  }


  /**
   * Return true if this SlackIntegrationChannel_display object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackIntegrationChannelDisplay slackIntegrationChannelDisplay = (SlackIntegrationChannelDisplay) o;
    return Objects.equals(this.message, slackIntegrationChannelDisplay.message) &&
        Objects.equals(this.notified, slackIntegrationChannelDisplay.notified) &&
        Objects.equals(this.snapshot, slackIntegrationChannelDisplay.snapshot) &&
        Objects.equals(this.tags, slackIntegrationChannelDisplay.tags);
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

