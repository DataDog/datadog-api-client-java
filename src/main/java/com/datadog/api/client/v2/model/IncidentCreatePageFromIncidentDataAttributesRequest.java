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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes for creating a page from an incident. */
@JsonPropertyOrder({
  IncidentCreatePageFromIncidentDataAttributesRequest.JSON_PROPERTY_DESCRIPTION,
  IncidentCreatePageFromIncidentDataAttributesRequest.JSON_PROPERTY_INCIDENT_PUBLIC_ID,
  IncidentCreatePageFromIncidentDataAttributesRequest.JSON_PROPERTY_ROLE,
  IncidentCreatePageFromIncidentDataAttributesRequest.JSON_PROPERTY_SERVICES,
  IncidentCreatePageFromIncidentDataAttributesRequest.JSON_PROPERTY_TAGS,
  IncidentCreatePageFromIncidentDataAttributesRequest.JSON_PROPERTY_TARGET,
  IncidentCreatePageFromIncidentDataAttributesRequest.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentCreatePageFromIncidentDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INCIDENT_PUBLIC_ID = "incident_public_id";
  private String incidentPublicId;

  public static final String JSON_PROPERTY_ROLE = "role";
  private IncidentPageRoleReference role;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<String> services = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TARGET = "target";
  private IncidentPageTarget target;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public IncidentCreatePageFromIncidentDataAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the page.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IncidentCreatePageFromIncidentDataAttributesRequest incidentPublicId(
      String incidentPublicId) {
    this.incidentPublicId = incidentPublicId;
    return this;
  }

  /**
   * The public ID of the incident.
   *
   * @return incidentPublicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIncidentPublicId() {
    return incidentPublicId;
  }

  public void setIncidentPublicId(String incidentPublicId) {
    this.incidentPublicId = incidentPublicId;
  }

  public IncidentCreatePageFromIncidentDataAttributesRequest role(IncidentPageRoleReference role) {
    this.role = role;
    this.unparsed |= role.unparsed;
    return this;
  }

  /**
   * A reference to an incident role for a page.
   *
   * @return role
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentPageRoleReference getRole() {
    return role;
  }

  public void setRole(IncidentPageRoleReference role) {
    this.role = role;
  }

  public IncidentCreatePageFromIncidentDataAttributesRequest services(List<String> services) {
    this.services = services;
    return this;
  }

  public IncidentCreatePageFromIncidentDataAttributesRequest addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * List of affected services.
   *
   * @return services
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }

  public IncidentCreatePageFromIncidentDataAttributesRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public IncidentCreatePageFromIncidentDataAttributesRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tags for the page.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public IncidentCreatePageFromIncidentDataAttributesRequest target(IncidentPageTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * The target recipient for a page.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentPageTarget getTarget() {
    return target;
  }

  public void setTarget(IncidentPageTarget target) {
    this.target = target;
  }

  public IncidentCreatePageFromIncidentDataAttributesRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the page.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return IncidentCreatePageFromIncidentDataAttributesRequest
   */
  @JsonAnySetter
  public IncidentCreatePageFromIncidentDataAttributesRequest putAdditionalProperty(
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
   * Return true if this IncidentCreatePageFromIncidentDataAttributesRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentCreatePageFromIncidentDataAttributesRequest
        incidentCreatePageFromIncidentDataAttributesRequest =
            (IncidentCreatePageFromIncidentDataAttributesRequest) o;
    return Objects.equals(
            this.description, incidentCreatePageFromIncidentDataAttributesRequest.description)
        && Objects.equals(
            this.incidentPublicId,
            incidentCreatePageFromIncidentDataAttributesRequest.incidentPublicId)
        && Objects.equals(this.role, incidentCreatePageFromIncidentDataAttributesRequest.role)
        && Objects.equals(
            this.services, incidentCreatePageFromIncidentDataAttributesRequest.services)
        && Objects.equals(this.tags, incidentCreatePageFromIncidentDataAttributesRequest.tags)
        && Objects.equals(this.target, incidentCreatePageFromIncidentDataAttributesRequest.target)
        && Objects.equals(this.title, incidentCreatePageFromIncidentDataAttributesRequest.title)
        && Objects.equals(
            this.additionalProperties,
            incidentCreatePageFromIncidentDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description, incidentPublicId, role, services, tags, target, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentCreatePageFromIncidentDataAttributesRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    incidentPublicId: ").append(toIndentedString(incidentPublicId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
