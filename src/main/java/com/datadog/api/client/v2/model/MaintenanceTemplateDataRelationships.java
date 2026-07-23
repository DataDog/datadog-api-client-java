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

/** The relationships of a maintenance template. */
@JsonPropertyOrder({
  MaintenanceTemplateDataRelationships.JSON_PROPERTY_CREATED_BY_USER,
  MaintenanceTemplateDataRelationships.JSON_PROPERTY_LAST_MODIFIED_BY_USER,
  MaintenanceTemplateDataRelationships.JSON_PROPERTY_STATUS_PAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MaintenanceTemplateDataRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private MaintenanceTemplateDataRelationshipsCreatedByUser createdByUser;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_USER = "last_modified_by_user";
  private MaintenanceTemplateDataRelationshipsLastModifiedByUser lastModifiedByUser;

  public static final String JSON_PROPERTY_STATUS_PAGE = "status_page";
  private MaintenanceTemplateDataRelationshipsStatusPage statusPage;

  public MaintenanceTemplateDataRelationships createdByUser(
      MaintenanceTemplateDataRelationshipsCreatedByUser createdByUser) {
    this.createdByUser = createdByUser;
    this.unparsed |= createdByUser.unparsed;
    return this;
  }

  /**
   * The Datadog user who created the maintenance template.
   *
   * @return createdByUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MaintenanceTemplateDataRelationshipsCreatedByUser getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(MaintenanceTemplateDataRelationshipsCreatedByUser createdByUser) {
    this.createdByUser = createdByUser;
    if (createdByUser != null) {
      this.unparsed |= createdByUser.unparsed;
    }
  }

  public MaintenanceTemplateDataRelationships lastModifiedByUser(
      MaintenanceTemplateDataRelationshipsLastModifiedByUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
    this.unparsed |= lastModifiedByUser.unparsed;
    return this;
  }

  /**
   * The Datadog user who last modified the maintenance template.
   *
   * @return lastModifiedByUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MaintenanceTemplateDataRelationshipsLastModifiedByUser getLastModifiedByUser() {
    return lastModifiedByUser;
  }

  public void setLastModifiedByUser(
      MaintenanceTemplateDataRelationshipsLastModifiedByUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
    if (lastModifiedByUser != null) {
      this.unparsed |= lastModifiedByUser.unparsed;
    }
  }

  public MaintenanceTemplateDataRelationships statusPage(
      MaintenanceTemplateDataRelationshipsStatusPage statusPage) {
    this.statusPage = statusPage;
    this.unparsed |= statusPage.unparsed;
    return this;
  }

  /**
   * The status page the maintenance template belongs to.
   *
   * @return statusPage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MaintenanceTemplateDataRelationshipsStatusPage getStatusPage() {
    return statusPage;
  }

  public void setStatusPage(MaintenanceTemplateDataRelationshipsStatusPage statusPage) {
    this.statusPage = statusPage;
    if (statusPage != null) {
      this.unparsed |= statusPage.unparsed;
    }
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
   * @return MaintenanceTemplateDataRelationships
   */
  @JsonAnySetter
  public MaintenanceTemplateDataRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MaintenanceTemplateDataRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceTemplateDataRelationships maintenanceTemplateDataRelationships =
        (MaintenanceTemplateDataRelationships) o;
    return Objects.equals(this.createdByUser, maintenanceTemplateDataRelationships.createdByUser)
        && Objects.equals(
            this.lastModifiedByUser, maintenanceTemplateDataRelationships.lastModifiedByUser)
        && Objects.equals(this.statusPage, maintenanceTemplateDataRelationships.statusPage)
        && Objects.equals(
            this.additionalProperties, maintenanceTemplateDataRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdByUser, lastModifiedByUser, statusPage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceTemplateDataRelationships {\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    lastModifiedByUser: ").append(toIndentedString(lastModifiedByUser)).append("\n");
    sb.append("    statusPage: ").append(toIndentedString(statusPage)).append("\n");
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
