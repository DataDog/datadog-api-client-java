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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes for creating a Google Chat configuration. */
@JsonPropertyOrder({
  IncidentGoogleChatConfigurationDataAttributesRequest.JSON_PROPERTY_DOMAIN_ID,
  IncidentGoogleChatConfigurationDataAttributesRequest.JSON_PROPERTY_SPACE_NAME_TEMPLATE,
  IncidentGoogleChatConfigurationDataAttributesRequest.JSON_PROPERTY_SPACE_TARGET_AUDIENCE_ID,
  IncidentGoogleChatConfigurationDataAttributesRequest.JSON_PROPERTY_SPACE_TIME_ZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentGoogleChatConfigurationDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DOMAIN_ID = "domain_id";
  private String domainId;

  public static final String JSON_PROPERTY_SPACE_NAME_TEMPLATE = "space_name_template";
  private String spaceNameTemplate;

  public static final String JSON_PROPERTY_SPACE_TARGET_AUDIENCE_ID = "space_target_audience_id";
  private String spaceTargetAudienceId;

  public static final String JSON_PROPERTY_SPACE_TIME_ZONE = "space_time_zone";
  private String spaceTimeZone;

  public IncidentGoogleChatConfigurationDataAttributesRequest() {}

  @JsonCreator
  public IncidentGoogleChatConfigurationDataAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DOMAIN_ID) String domainId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPACE_NAME_TEMPLATE)
          String spaceNameTemplate,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPACE_TARGET_AUDIENCE_ID)
          String spaceTargetAudienceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPACE_TIME_ZONE) String spaceTimeZone) {
    this.domainId = domainId;
    this.spaceNameTemplate = spaceNameTemplate;
    this.spaceTargetAudienceId = spaceTargetAudienceId;
    this.spaceTimeZone = spaceTimeZone;
  }

  public IncidentGoogleChatConfigurationDataAttributesRequest domainId(String domainId) {
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

  public IncidentGoogleChatConfigurationDataAttributesRequest spaceNameTemplate(
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

  public IncidentGoogleChatConfigurationDataAttributesRequest spaceTargetAudienceId(
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

  public IncidentGoogleChatConfigurationDataAttributesRequest spaceTimeZone(String spaceTimeZone) {
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
   * @return IncidentGoogleChatConfigurationDataAttributesRequest
   */
  @JsonAnySetter
  public IncidentGoogleChatConfigurationDataAttributesRequest putAdditionalProperty(
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
   * Return true if this IncidentGoogleChatConfigurationDataAttributesRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentGoogleChatConfigurationDataAttributesRequest
        incidentGoogleChatConfigurationDataAttributesRequest =
            (IncidentGoogleChatConfigurationDataAttributesRequest) o;
    return Objects.equals(
            this.domainId, incidentGoogleChatConfigurationDataAttributesRequest.domainId)
        && Objects.equals(
            this.spaceNameTemplate,
            incidentGoogleChatConfigurationDataAttributesRequest.spaceNameTemplate)
        && Objects.equals(
            this.spaceTargetAudienceId,
            incidentGoogleChatConfigurationDataAttributesRequest.spaceTargetAudienceId)
        && Objects.equals(
            this.spaceTimeZone, incidentGoogleChatConfigurationDataAttributesRequest.spaceTimeZone)
        && Objects.equals(
            this.additionalProperties,
            incidentGoogleChatConfigurationDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        domainId, spaceNameTemplate, spaceTargetAudienceId, spaceTimeZone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentGoogleChatConfigurationDataAttributesRequest {\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
