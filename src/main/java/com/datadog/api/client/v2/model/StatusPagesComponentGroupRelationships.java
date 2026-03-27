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
   * <p>The relationships of a component group.</p>
 */
@JsonPropertyOrder({
  StatusPagesComponentGroupRelationships.JSON_PROPERTY_CREATED_BY_USER,
  StatusPagesComponentGroupRelationships.JSON_PROPERTY_GROUP,
  StatusPagesComponentGroupRelationships.JSON_PROPERTY_LAST_MODIFIED_BY_USER,
  StatusPagesComponentGroupRelationships.JSON_PROPERTY_STATUS_PAGE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StatusPagesComponentGroupRelationships {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private StatusPagesComponentGroupRelationshipsCreatedByUser createdByUser;

  public static final String JSON_PROPERTY_GROUP = "group";
  private StatusPagesComponentGroupRelationshipsGroup group;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_USER = "last_modified_by_user";
  private StatusPagesComponentGroupRelationshipsLastModifiedByUser lastModifiedByUser;

  public static final String JSON_PROPERTY_STATUS_PAGE = "status_page";
  private StatusPagesComponentGroupRelationshipsStatusPage statusPage;

  public StatusPagesComponentGroupRelationships createdByUser(StatusPagesComponentGroupRelationshipsCreatedByUser createdByUser) {
    this.createdByUser = createdByUser;
    this.unparsed |= createdByUser.unparsed;
    return this;
  }

  /**
   * <p>The Datadog user who created the component group.</p>
   * @return createdByUser
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public StatusPagesComponentGroupRelationshipsCreatedByUser getCreatedByUser() {
        return createdByUser;
      }
  public void setCreatedByUser(StatusPagesComponentGroupRelationshipsCreatedByUser createdByUser) {
    this.createdByUser = createdByUser;
  }
  public StatusPagesComponentGroupRelationships group(StatusPagesComponentGroupRelationshipsGroup group) {
    this.group = group;
    this.unparsed |= group.unparsed;
    return this;
  }

  /**
   * <p>The group the component group belongs to.</p>
   * @return group
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public StatusPagesComponentGroupRelationshipsGroup getGroup() {
        return group;
      }
  public void setGroup(StatusPagesComponentGroupRelationshipsGroup group) {
    this.group = group;
  }
  public StatusPagesComponentGroupRelationships lastModifiedByUser(StatusPagesComponentGroupRelationshipsLastModifiedByUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
    this.unparsed |= lastModifiedByUser.unparsed;
    return this;
  }

  /**
   * <p>The Datadog user who last modified the component group.</p>
   * @return lastModifiedByUser
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY_USER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public StatusPagesComponentGroupRelationshipsLastModifiedByUser getLastModifiedByUser() {
        return lastModifiedByUser;
      }
  public void setLastModifiedByUser(StatusPagesComponentGroupRelationshipsLastModifiedByUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
  }
  public StatusPagesComponentGroupRelationships statusPage(StatusPagesComponentGroupRelationshipsStatusPage statusPage) {
    this.statusPage = statusPage;
    this.unparsed |= statusPage.unparsed;
    return this;
  }

  /**
   * <p>The status page the component group belongs to.</p>
   * @return statusPage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS_PAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public StatusPagesComponentGroupRelationshipsStatusPage getStatusPage() {
        return statusPage;
      }
  public void setStatusPage(StatusPagesComponentGroupRelationshipsStatusPage statusPage) {
    this.statusPage = statusPage;
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
   * @return StatusPagesComponentGroupRelationships
   */
  @JsonAnySetter
  public StatusPagesComponentGroupRelationships putAdditionalProperty(String key, Object value) {
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
   * Return true if this StatusPagesComponentGroupRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusPagesComponentGroupRelationships statusPagesComponentGroupRelationships = (StatusPagesComponentGroupRelationships) o;
    return Objects.equals(this.createdByUser, statusPagesComponentGroupRelationships.createdByUser) && Objects.equals(this.group, statusPagesComponentGroupRelationships.group) && Objects.equals(this.lastModifiedByUser, statusPagesComponentGroupRelationships.lastModifiedByUser) && Objects.equals(this.statusPage, statusPagesComponentGroupRelationships.statusPage) && Objects.equals(this.additionalProperties, statusPagesComponentGroupRelationships.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdByUser,group,lastModifiedByUser,statusPage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusPagesComponentGroupRelationships {\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    lastModifiedByUser: ").append(toIndentedString(lastModifiedByUser)).append("\n");
    sb.append("    statusPage: ").append(toIndentedString(statusPage)).append("\n");
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
