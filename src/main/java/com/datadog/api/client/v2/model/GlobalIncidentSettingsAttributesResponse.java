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
   * <p>Global incident settings attributes</p>
 */
@JsonPropertyOrder({
  GlobalIncidentSettingsAttributesResponse.JSON_PROPERTY_ANALYTICS_DASHBOARD_ID,
  GlobalIncidentSettingsAttributesResponse.JSON_PROPERTY_CREATED,
  GlobalIncidentSettingsAttributesResponse.JSON_PROPERTY_MODIFIED
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GlobalIncidentSettingsAttributesResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANALYTICS_DASHBOARD_ID = "analytics_dashboard_id";
  private String analyticsDashboardId;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public GlobalIncidentSettingsAttributesResponse() {}

  @JsonCreator
  public GlobalIncidentSettingsAttributesResponse(
            @JsonProperty(required=true, value=JSON_PROPERTY_ANALYTICS_DASHBOARD_ID)String analyticsDashboardId,
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED)OffsetDateTime created,
            @JsonProperty(required=true, value=JSON_PROPERTY_MODIFIED)OffsetDateTime modified) {
        this.analyticsDashboardId = analyticsDashboardId;
        this.created = created;
        this.modified = modified;
  }
  public GlobalIncidentSettingsAttributesResponse analyticsDashboardId(String analyticsDashboardId) {
    this.analyticsDashboardId = analyticsDashboardId;
    return this;
  }

  /**
   * <p>The analytics dashboard ID</p>
   * @return analyticsDashboardId
  **/
      @JsonProperty(JSON_PROPERTY_ANALYTICS_DASHBOARD_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getAnalyticsDashboardId() {
        return analyticsDashboardId;
      }
  public void setAnalyticsDashboardId(String analyticsDashboardId) {
    this.analyticsDashboardId = analyticsDashboardId;
  }
  public GlobalIncidentSettingsAttributesResponse created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * <p>Timestamp when the settings were created</p>
   * @return created
  **/
      @JsonProperty(JSON_PROPERTY_CREATED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getCreated() {
        return created;
      }
  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }
  public GlobalIncidentSettingsAttributesResponse modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * <p>Timestamp when the settings were last modified</p>
   * @return modified
  **/
      @JsonProperty(JSON_PROPERTY_MODIFIED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getModified() {
        return modified;
      }
  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
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
   * @return GlobalIncidentSettingsAttributesResponse
   */
  @JsonAnySetter
  public GlobalIncidentSettingsAttributesResponse putAdditionalProperty(String key, Object value) {
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
   * Return true if this GlobalIncidentSettingsAttributesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalIncidentSettingsAttributesResponse globalIncidentSettingsAttributesResponse = (GlobalIncidentSettingsAttributesResponse) o;
    return Objects.equals(this.analyticsDashboardId, globalIncidentSettingsAttributesResponse.analyticsDashboardId) && Objects.equals(this.created, globalIncidentSettingsAttributesResponse.created) && Objects.equals(this.modified, globalIncidentSettingsAttributesResponse.modified) && Objects.equals(this.additionalProperties, globalIncidentSettingsAttributesResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(analyticsDashboardId,created,modified, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalIncidentSettingsAttributesResponse {\n");
    sb.append("    analyticsDashboardId: ").append(toIndentedString(analyticsDashboardId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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
