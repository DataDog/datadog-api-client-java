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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of a Google Chat configuration. */
@JsonPropertyOrder({
  IncidentGoogleChatConfigurationDataAttributesResponse.JSON_PROPERTY_CREATED_AT,
  IncidentGoogleChatConfigurationDataAttributesResponse.JSON_PROPERTY_DOMAIN_ID,
  IncidentGoogleChatConfigurationDataAttributesResponse.JSON_PROPERTY_MODIFIED_AT,
  IncidentGoogleChatConfigurationDataAttributesResponse.JSON_PROPERTY_SPACE_NAME_TEMPLATE,
  IncidentGoogleChatConfigurationDataAttributesResponse.JSON_PROPERTY_SPACE_TARGET_AUDIENCE_ID,
  IncidentGoogleChatConfigurationDataAttributesResponse.JSON_PROPERTY_SPACE_TIME_ZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentGoogleChatConfigurationDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DOMAIN_ID = "domain_id";
  private String domainId;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_SPACE_NAME_TEMPLATE = "space_name_template";
  private String spaceNameTemplate;

  public static final String JSON_PROPERTY_SPACE_TARGET_AUDIENCE_ID = "space_target_audience_id";
  private String spaceTargetAudienceId;

  public static final String JSON_PROPERTY_SPACE_TIME_ZONE = "space_time_zone";
  private String spaceTimeZone;

  public IncidentGoogleChatConfigurationDataAttributesResponse() {}

  @JsonCreator
  public IncidentGoogleChatConfigurationDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DOMAIN_ID) String domainId,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPACE_NAME_TEMPLATE)
          String spaceNameTemplate,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPACE_TARGET_AUDIENCE_ID)
          String spaceTargetAudienceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPACE_TIME_ZONE) String spaceTimeZone) {
    this.createdAt = createdAt;
    this.domainId = domainId;
    this.modifiedAt = modifiedAt;
    this.spaceNameTemplate = spaceNameTemplate;
    this.spaceTargetAudienceId = spaceTargetAudienceId;
    this.spaceTimeZone = spaceTimeZone;
  }

  public IncidentGoogleChatConfigurationDataAttributesResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the configuration was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public IncidentGoogleChatConfigurationDataAttributesResponse domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * The Google Chat domain ID.
   *
   * @return domainId
   */
  @JsonProperty(JSON_PROPERTY_DOMAIN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }

  public IncidentGoogleChatConfigurationDataAttributesResponse modifiedAt(
      OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp when the configuration was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public IncidentGoogleChatConfigurationDataAttributesResponse spaceNameTemplate(
      String spaceNameTemplate) {
    this.spaceNameTemplate = spaceNameTemplate;
    return this;
  }

  /**
   * The template for the Google Chat space name.
   *
   * @return spaceNameTemplate
   */
  @JsonProperty(JSON_PROPERTY_SPACE_NAME_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSpaceNameTemplate() {
    return spaceNameTemplate;
  }

  public void setSpaceNameTemplate(String spaceNameTemplate) {
    this.spaceNameTemplate = spaceNameTemplate;
  }

  public IncidentGoogleChatConfigurationDataAttributesResponse spaceTargetAudienceId(
      String spaceTargetAudienceId) {
    this.spaceTargetAudienceId = spaceTargetAudienceId;
    return this;
  }

  /**
   * The target audience ID for the Google Chat space.
   *
   * @return spaceTargetAudienceId
   */
  @JsonProperty(JSON_PROPERTY_SPACE_TARGET_AUDIENCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSpaceTargetAudienceId() {
    return spaceTargetAudienceId;
  }

  public void setSpaceTargetAudienceId(String spaceTargetAudienceId) {
    this.spaceTargetAudienceId = spaceTargetAudienceId;
  }

  public IncidentGoogleChatConfigurationDataAttributesResponse spaceTimeZone(String spaceTimeZone) {
    this.spaceTimeZone = spaceTimeZone;
    return this;
  }

  /**
   * The time zone for the Google Chat space.
   *
   * @return spaceTimeZone
   */
  @JsonProperty(JSON_PROPERTY_SPACE_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSpaceTimeZone() {
    return spaceTimeZone;
  }

  public void setSpaceTimeZone(String spaceTimeZone) {
    this.spaceTimeZone = spaceTimeZone;
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
   * @return IncidentGoogleChatConfigurationDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentGoogleChatConfigurationDataAttributesResponse putAdditionalProperty(
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

  /**
   * Return true if this IncidentGoogleChatConfigurationDataAttributesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentGoogleChatConfigurationDataAttributesResponse
        incidentGoogleChatConfigurationDataAttributesResponse =
            (IncidentGoogleChatConfigurationDataAttributesResponse) o;
    return Objects.equals(
            this.createdAt, incidentGoogleChatConfigurationDataAttributesResponse.createdAt)
        && Objects.equals(
            this.domainId, incidentGoogleChatConfigurationDataAttributesResponse.domainId)
        && Objects.equals(
            this.modifiedAt, incidentGoogleChatConfigurationDataAttributesResponse.modifiedAt)
        && Objects.equals(
            this.spaceNameTemplate,
            incidentGoogleChatConfigurationDataAttributesResponse.spaceNameTemplate)
        && Objects.equals(
            this.spaceTargetAudienceId,
            incidentGoogleChatConfigurationDataAttributesResponse.spaceTargetAudienceId)
        && Objects.equals(
            this.spaceTimeZone, incidentGoogleChatConfigurationDataAttributesResponse.spaceTimeZone)
        && Objects.equals(
            this.additionalProperties,
            incidentGoogleChatConfigurationDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        domainId,
        modifiedAt,
        spaceNameTemplate,
        spaceTargetAudienceId,
        spaceTimeZone,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentGoogleChatConfigurationDataAttributesResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    spaceNameTemplate: ").append(toIndentedString(spaceNameTemplate)).append("\n");
    sb.append("    spaceTargetAudienceId: ")
        .append(toIndentedString(spaceTargetAudienceId))
        .append("\n");
    sb.append("    spaceTimeZone: ").append(toIndentedString(spaceTimeZone)).append("\n");
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
