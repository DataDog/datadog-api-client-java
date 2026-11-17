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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** Attributes for creating a comment on an On-Call Page. */
@JsonPropertyOrder({
  CreateOnCallPageCommentRequestAttributes.JSON_PROPERTY_BODY,
  CreateOnCallPageCommentRequestAttributes.JSON_PROPERTY_MENTIONED_USER_IDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateOnCallPageCommentRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_MENTIONED_USER_IDS = "mentioned_user_ids";
  private List<UUID> mentionedUserIds = null;

  public CreateOnCallPageCommentRequestAttributes() {}

  @JsonCreator
  public CreateOnCallPageCommentRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_BODY) String body) {
    this.body = body;
  }

  public CreateOnCallPageCommentRequestAttributes body(String body) {
    this.body = body;
    return this;
  }

  /**
   * The content of the comment.
   *
   * @return body
   */
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public CreateOnCallPageCommentRequestAttributes mentionedUserIds(List<UUID> mentionedUserIds) {
    this.mentionedUserIds = mentionedUserIds;
    return this;
  }

  public CreateOnCallPageCommentRequestAttributes addMentionedUserIdsItem(
      UUID mentionedUserIdsItem) {
    if (this.mentionedUserIds == null) {
      this.mentionedUserIds = new ArrayList<>();
    }
    this.mentionedUserIds.add(mentionedUserIdsItem);
    return this;
  }

  /**
   * The IDs of the users mentioned in the comment.
   *
   * @return mentionedUserIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MENTIONED_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UUID> getMentionedUserIds() {
    return mentionedUserIds;
  }

  public void setMentionedUserIds(List<UUID> mentionedUserIds) {
    this.mentionedUserIds = mentionedUserIds;
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
   * @return CreateOnCallPageCommentRequestAttributes
   */
  @JsonAnySetter
  public CreateOnCallPageCommentRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateOnCallPageCommentRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOnCallPageCommentRequestAttributes createOnCallPageCommentRequestAttributes =
        (CreateOnCallPageCommentRequestAttributes) o;
    return Objects.equals(this.body, createOnCallPageCommentRequestAttributes.body)
        && Objects.equals(
            this.mentionedUserIds, createOnCallPageCommentRequestAttributes.mentionedUserIds)
        && Objects.equals(
            this.additionalProperties,
            createOnCallPageCommentRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, mentionedUserIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOnCallPageCommentRequestAttributes {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    mentionedUserIds: ").append(toIndentedString(mentionedUserIds)).append("\n");
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
