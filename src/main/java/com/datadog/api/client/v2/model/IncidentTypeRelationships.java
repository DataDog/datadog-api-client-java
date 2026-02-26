/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The incident type's resource relationships.</p>
 */
@JsonPropertyOrder({
  IncidentTypeRelationships.JSON_PROPERTY_CREATED_BY_USER,
  IncidentTypeRelationships.JSON_PROPERTY_GOOGLE_MEET_CONFIGURATION,
  IncidentTypeRelationships.JSON_PROPERTY_LAST_MODIFIED_BY_USER,
  IncidentTypeRelationships.JSON_PROPERTY_MICROSOFT_TEAMS_CONFIGURATION,
  IncidentTypeRelationships.JSON_PROPERTY_ZOOM_CONFIGURATION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTypeRelationships {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private RelationshipToUser createdByUser;

  public static final String JSON_PROPERTY_GOOGLE_MEET_CONFIGURATION = "google_meet_configuration";
  private JsonNullable<GoogleMeetConfigurationReference> googleMeetConfiguration = JsonNullable.<GoogleMeetConfigurationReference>undefined();

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_USER = "last_modified_by_user";
  private RelationshipToUser lastModifiedByUser;

  public static final String JSON_PROPERTY_MICROSOFT_TEAMS_CONFIGURATION = "microsoft_teams_configuration";
  private JsonNullable<MicrosoftTeamsConfigurationReference> microsoftTeamsConfiguration = JsonNullable.<MicrosoftTeamsConfigurationReference>undefined();

  public static final String JSON_PROPERTY_ZOOM_CONFIGURATION = "zoom_configuration";
  private JsonNullable<ZoomConfigurationReference> zoomConfiguration = JsonNullable.<ZoomConfigurationReference>undefined();

  public IncidentTypeRelationships createdByUser(RelationshipToUser createdByUser) {
    this.createdByUser = createdByUser;
    this.unparsed |= createdByUser.unparsed;
    return this;
  }

  /**
   * <p>Relationship to user.</p>
   * @return createdByUser
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationshipToUser getCreatedByUser() {
        return createdByUser;
      }
  public void setCreatedByUser(RelationshipToUser createdByUser) {
    this.createdByUser = createdByUser;
  }
  public IncidentTypeRelationships googleMeetConfiguration(GoogleMeetConfigurationReference googleMeetConfiguration) {
    this.googleMeetConfiguration = JsonNullable.<GoogleMeetConfigurationReference>of(googleMeetConfiguration);
    return this;
  }

  /**
   * <p>A reference to a Google Meet Configuration resource.</p>
   * @return googleMeetConfiguration
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public GoogleMeetConfigurationReference getGoogleMeetConfiguration() {
        return googleMeetConfiguration.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_GOOGLE_MEET_CONFIGURATION)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<GoogleMeetConfigurationReference> getGoogleMeetConfiguration_JsonNullable() {
    return googleMeetConfiguration;
  }
  @JsonProperty(JSON_PROPERTY_GOOGLE_MEET_CONFIGURATION)public void setGoogleMeetConfiguration_JsonNullable(JsonNullable<GoogleMeetConfigurationReference> googleMeetConfiguration) {
    this.googleMeetConfiguration = googleMeetConfiguration;
  }
  public void setGoogleMeetConfiguration(GoogleMeetConfigurationReference googleMeetConfiguration) {
    this.googleMeetConfiguration = JsonNullable.<GoogleMeetConfigurationReference>of(googleMeetConfiguration);
  }
  public IncidentTypeRelationships lastModifiedByUser(RelationshipToUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
    this.unparsed |= lastModifiedByUser.unparsed;
    return this;
  }

  /**
   * <p>Relationship to user.</p>
   * @return lastModifiedByUser
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY_USER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RelationshipToUser getLastModifiedByUser() {
        return lastModifiedByUser;
      }
  public void setLastModifiedByUser(RelationshipToUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
  }
  public IncidentTypeRelationships microsoftTeamsConfiguration(MicrosoftTeamsConfigurationReference microsoftTeamsConfiguration) {
    this.microsoftTeamsConfiguration = JsonNullable.<MicrosoftTeamsConfigurationReference>of(microsoftTeamsConfiguration);
    return this;
  }

  /**
   * <p>A reference to a Microsoft Teams Configuration resource.</p>
   * @return microsoftTeamsConfiguration
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public MicrosoftTeamsConfigurationReference getMicrosoftTeamsConfiguration() {
        return microsoftTeamsConfiguration.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_MICROSOFT_TEAMS_CONFIGURATION)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<MicrosoftTeamsConfigurationReference> getMicrosoftTeamsConfiguration_JsonNullable() {
    return microsoftTeamsConfiguration;
  }
  @JsonProperty(JSON_PROPERTY_MICROSOFT_TEAMS_CONFIGURATION)public void setMicrosoftTeamsConfiguration_JsonNullable(JsonNullable<MicrosoftTeamsConfigurationReference> microsoftTeamsConfiguration) {
    this.microsoftTeamsConfiguration = microsoftTeamsConfiguration;
  }
  public void setMicrosoftTeamsConfiguration(MicrosoftTeamsConfigurationReference microsoftTeamsConfiguration) {
    this.microsoftTeamsConfiguration = JsonNullable.<MicrosoftTeamsConfigurationReference>of(microsoftTeamsConfiguration);
  }
  public IncidentTypeRelationships zoomConfiguration(ZoomConfigurationReference zoomConfiguration) {
    this.zoomConfiguration = JsonNullable.<ZoomConfigurationReference>of(zoomConfiguration);
    return this;
  }

  /**
   * <p>A reference to a Zoom configuration resource.</p>
   * @return zoomConfiguration
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public ZoomConfigurationReference getZoomConfiguration() {
        return zoomConfiguration.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ZOOM_CONFIGURATION)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ZoomConfigurationReference> getZoomConfiguration_JsonNullable() {
    return zoomConfiguration;
  }
  @JsonProperty(JSON_PROPERTY_ZOOM_CONFIGURATION)public void setZoomConfiguration_JsonNullable(JsonNullable<ZoomConfigurationReference> zoomConfiguration) {
    this.zoomConfiguration = zoomConfiguration;
  }
  public void setZoomConfiguration(ZoomConfigurationReference zoomConfiguration) {
    this.zoomConfiguration = JsonNullable.<ZoomConfigurationReference>of(zoomConfiguration);
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return IncidentTypeRelationships
   */
  @JsonAnySetter
  public IncidentTypeRelationships putAdditionalProperty(String key, Object value) {
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
   * Return true if this IncidentTypeRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTypeRelationships incidentTypeRelationships = (IncidentTypeRelationships) o;
    return Objects.equals(this.createdByUser, incidentTypeRelationships.createdByUser) && Objects.equals(this.googleMeetConfiguration, incidentTypeRelationships.googleMeetConfiguration) && Objects.equals(this.lastModifiedByUser, incidentTypeRelationships.lastModifiedByUser) && Objects.equals(this.microsoftTeamsConfiguration, incidentTypeRelationships.microsoftTeamsConfiguration) && Objects.equals(this.zoomConfiguration, incidentTypeRelationships.zoomConfiguration) && Objects.equals(this.additionalProperties, incidentTypeRelationships.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdByUser,googleMeetConfiguration,lastModifiedByUser,microsoftTeamsConfiguration,zoomConfiguration, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTypeRelationships {\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    googleMeetConfiguration: ").append(toIndentedString(googleMeetConfiguration)).append("\n");
    sb.append("    lastModifiedByUser: ").append(toIndentedString(lastModifiedByUser)).append("\n");
    sb.append("    microsoftTeamsConfiguration: ").append(toIndentedString(microsoftTeamsConfiguration)).append("\n");
    sb.append("    zoomConfiguration: ").append(toIndentedString(zoomConfiguration)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
