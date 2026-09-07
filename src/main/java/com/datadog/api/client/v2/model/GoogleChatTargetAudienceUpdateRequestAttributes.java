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

/** Attributes for updating a Google Chat target audience. */
@JsonPropertyOrder({
  GoogleChatTargetAudienceUpdateRequestAttributes.JSON_PROPERTY_AUDIENCE_ID,
  GoogleChatTargetAudienceUpdateRequestAttributes.JSON_PROPERTY_AUDIENCE_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GoogleChatTargetAudienceUpdateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUDIENCE_ID = "audience_id";
  private String audienceId;

  public static final String JSON_PROPERTY_AUDIENCE_NAME = "audience_name";
  private String audienceName;

  public GoogleChatTargetAudienceUpdateRequestAttributes audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  /**
   * The audience ID.
   *
   * @return audienceId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  public GoogleChatTargetAudienceUpdateRequestAttributes audienceName(String audienceName) {
    this.audienceName = audienceName;
    return this;
  }

  /**
   * The audience name.
   *
   * @return audienceName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAudienceName() {
    return audienceName;
  }

  public void setAudienceName(String audienceName) {
    this.audienceName = audienceName;
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
   * @return GoogleChatTargetAudienceUpdateRequestAttributes
   */
  @JsonAnySetter
  public GoogleChatTargetAudienceUpdateRequestAttributes putAdditionalProperty(
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

  /** Return true if this GoogleChatTargetAudienceUpdateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChatTargetAudienceUpdateRequestAttributes
        googleChatTargetAudienceUpdateRequestAttributes =
            (GoogleChatTargetAudienceUpdateRequestAttributes) o;
    return Objects.equals(
            this.audienceId, googleChatTargetAudienceUpdateRequestAttributes.audienceId)
        && Objects.equals(
            this.audienceName, googleChatTargetAudienceUpdateRequestAttributes.audienceName)
        && Objects.equals(
            this.additionalProperties,
            googleChatTargetAudienceUpdateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, audienceName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChatTargetAudienceUpdateRequestAttributes {\n");
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
    sb.append("    audienceName: ").append(toIndentedString(audienceName)).append("\n");
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
