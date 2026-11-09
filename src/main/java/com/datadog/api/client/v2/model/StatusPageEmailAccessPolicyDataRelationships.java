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

/** Relationships of a status page email access policy. */
@JsonPropertyOrder({
  StatusPageEmailAccessPolicyDataRelationships.JSON_PROPERTY_CREATED_BY_USER,
  StatusPageEmailAccessPolicyDataRelationships.JSON_PROPERTY_STATUS_PAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StatusPageEmailAccessPolicyDataRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private StatusPageEmailAccessPolicyDataRelationshipsCreatedByUser createdByUser;

  public static final String JSON_PROPERTY_STATUS_PAGE = "status_page";
  private StatusPageEmailAccessPolicyDataRelationshipsStatusPage statusPage;

  public StatusPageEmailAccessPolicyDataRelationships() {}

  @JsonCreator
  public StatusPageEmailAccessPolicyDataRelationships(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY_USER)
          StatusPageEmailAccessPolicyDataRelationshipsCreatedByUser createdByUser,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS_PAGE)
          StatusPageEmailAccessPolicyDataRelationshipsStatusPage statusPage) {
    this.createdByUser = createdByUser;
    this.unparsed |= createdByUser.unparsed;
    this.statusPage = statusPage;
    this.unparsed |= statusPage.unparsed;
  }

  public StatusPageEmailAccessPolicyDataRelationships createdByUser(
      StatusPageEmailAccessPolicyDataRelationshipsCreatedByUser createdByUser) {
    this.createdByUser = createdByUser;
    this.unparsed |= createdByUser.unparsed;
    return this;
  }

  /**
   * The Datadog user who created the email access policy.
   *
   * @return createdByUser
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public StatusPageEmailAccessPolicyDataRelationshipsCreatedByUser getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(
      StatusPageEmailAccessPolicyDataRelationshipsCreatedByUser createdByUser) {
    this.createdByUser = createdByUser;
    if (createdByUser != null) {
      this.unparsed |= createdByUser.unparsed;
    }
  }

  public StatusPageEmailAccessPolicyDataRelationships statusPage(
      StatusPageEmailAccessPolicyDataRelationshipsStatusPage statusPage) {
    this.statusPage = statusPage;
    this.unparsed |= statusPage.unparsed;
    return this;
  }

  /**
   * The status page associated with the email access policy.
   *
   * @return statusPage
   */
  @JsonProperty(JSON_PROPERTY_STATUS_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public StatusPageEmailAccessPolicyDataRelationshipsStatusPage getStatusPage() {
    return statusPage;
  }

  public void setStatusPage(StatusPageEmailAccessPolicyDataRelationshipsStatusPage statusPage) {
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
   * @return StatusPageEmailAccessPolicyDataRelationships
   */
  @JsonAnySetter
  public StatusPageEmailAccessPolicyDataRelationships putAdditionalProperty(
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

  /** Return true if this StatusPageEmailAccessPolicyDataRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusPageEmailAccessPolicyDataRelationships statusPageEmailAccessPolicyDataRelationships =
        (StatusPageEmailAccessPolicyDataRelationships) o;
    return Objects.equals(
            this.createdByUser, statusPageEmailAccessPolicyDataRelationships.createdByUser)
        && Objects.equals(this.statusPage, statusPageEmailAccessPolicyDataRelationships.statusPage)
        && Objects.equals(
            this.additionalProperties,
            statusPageEmailAccessPolicyDataRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdByUser, statusPage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusPageEmailAccessPolicyDataRelationships {\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
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
