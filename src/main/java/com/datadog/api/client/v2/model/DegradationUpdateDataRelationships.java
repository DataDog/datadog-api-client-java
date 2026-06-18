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

/** Relationships of a degradation update resource. */
@JsonPropertyOrder({
  DegradationUpdateDataRelationships.JSON_PROPERTY_CREATED_BY_USER,
  DegradationUpdateDataRelationships.JSON_PROPERTY_DEGRADATION,
  DegradationUpdateDataRelationships.JSON_PROPERTY_DELETED_BY_USER,
  DegradationUpdateDataRelationships.JSON_PROPERTY_LAST_MODIFIED_BY_USER,
  DegradationUpdateDataRelationships.JSON_PROPERTY_STATUS_PAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DegradationUpdateDataRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private DegradationUpdateDataRelationshipsUser createdByUser;

  public static final String JSON_PROPERTY_DEGRADATION = "degradation";
  private DegradationUpdateDataRelationshipsDegradation degradation;

  public static final String JSON_PROPERTY_DELETED_BY_USER = "deleted_by_user";
  private DegradationUpdateDataRelationshipsUser deletedByUser;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_USER = "last_modified_by_user";
  private DegradationUpdateDataRelationshipsUser lastModifiedByUser;

  public static final String JSON_PROPERTY_STATUS_PAGE = "status_page";
  private DegradationUpdateDataRelationshipsStatusPage statusPage;

  public DegradationUpdateDataRelationships createdByUser(
      DegradationUpdateDataRelationshipsUser createdByUser) {
    this.createdByUser = createdByUser;
    this.unparsed |= createdByUser.unparsed;
    return this;
  }

  /**
   * A user relationship of a degradation update.
   *
   * @return createdByUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DegradationUpdateDataRelationshipsUser getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(DegradationUpdateDataRelationshipsUser createdByUser) {
    this.createdByUser = createdByUser;
  }

  public DegradationUpdateDataRelationships degradation(
      DegradationUpdateDataRelationshipsDegradation degradation) {
    this.degradation = degradation;
    this.unparsed |= degradation.unparsed;
    return this;
  }

  /**
   * The degradation relationship of a degradation update.
   *
   * @return degradation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEGRADATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DegradationUpdateDataRelationshipsDegradation getDegradation() {
    return degradation;
  }

  public void setDegradation(DegradationUpdateDataRelationshipsDegradation degradation) {
    this.degradation = degradation;
  }

  public DegradationUpdateDataRelationships deletedByUser(
      DegradationUpdateDataRelationshipsUser deletedByUser) {
    this.deletedByUser = deletedByUser;
    this.unparsed |= deletedByUser.unparsed;
    return this;
  }

  /**
   * A user relationship of a degradation update.
   *
   * @return deletedByUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DegradationUpdateDataRelationshipsUser getDeletedByUser() {
    return deletedByUser;
  }

  public void setDeletedByUser(DegradationUpdateDataRelationshipsUser deletedByUser) {
    this.deletedByUser = deletedByUser;
  }

  public DegradationUpdateDataRelationships lastModifiedByUser(
      DegradationUpdateDataRelationshipsUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
    this.unparsed |= lastModifiedByUser.unparsed;
    return this;
  }

  /**
   * A user relationship of a degradation update.
   *
   * @return lastModifiedByUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DegradationUpdateDataRelationshipsUser getLastModifiedByUser() {
    return lastModifiedByUser;
  }

  public void setLastModifiedByUser(DegradationUpdateDataRelationshipsUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
  }

  public DegradationUpdateDataRelationships statusPage(
      DegradationUpdateDataRelationshipsStatusPage statusPage) {
    this.statusPage = statusPage;
    this.unparsed |= statusPage.unparsed;
    return this;
  }

  /**
   * The status page relationship of a degradation update.
   *
   * @return statusPage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DegradationUpdateDataRelationshipsStatusPage getStatusPage() {
    return statusPage;
  }

  public void setStatusPage(DegradationUpdateDataRelationshipsStatusPage statusPage) {
    this.statusPage = statusPage;
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
   * @return DegradationUpdateDataRelationships
   */
  @JsonAnySetter
  public DegradationUpdateDataRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DegradationUpdateDataRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DegradationUpdateDataRelationships degradationUpdateDataRelationships =
        (DegradationUpdateDataRelationships) o;
    return Objects.equals(this.createdByUser, degradationUpdateDataRelationships.createdByUser)
        && Objects.equals(this.degradation, degradationUpdateDataRelationships.degradation)
        && Objects.equals(this.deletedByUser, degradationUpdateDataRelationships.deletedByUser)
        && Objects.equals(
            this.lastModifiedByUser, degradationUpdateDataRelationships.lastModifiedByUser)
        && Objects.equals(this.statusPage, degradationUpdateDataRelationships.statusPage)
        && Objects.equals(
            this.additionalProperties, degradationUpdateDataRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdByUser,
        degradation,
        deletedByUser,
        lastModifiedByUser,
        statusPage,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DegradationUpdateDataRelationships {\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    degradation: ").append(toIndentedString(degradation)).append("\n");
    sb.append("    deletedByUser: ").append(toIndentedString(deletedByUser)).append("\n");
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
