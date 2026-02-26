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
   * <p>The relationships of a component.</p>
 */
@JsonPropertyOrder({
  StatusPagesComponentDataRelationships.JSON_PROPERTY_CREATED_BY_USER,
  StatusPagesComponentDataRelationships.JSON_PROPERTY_GROUP,
  StatusPagesComponentDataRelationships.JSON_PROPERTY_LAST_MODIFIED_BY_USER,
  StatusPagesComponentDataRelationships.JSON_PROPERTY_STATUS_PAGE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StatusPagesComponentDataRelationships {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY_USER = "created_by_user";
  private StatusPagesComponentDataRelationshipsCreatedByUser createdByUser;

  public static final String JSON_PROPERTY_GROUP = "group";
  private StatusPagesComponentDataRelationshipsGroup group;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_USER = "last_modified_by_user";
  private StatusPagesComponentDataRelationshipsLastModifiedByUser lastModifiedByUser;

  public static final String JSON_PROPERTY_STATUS_PAGE = "status_page";
  private StatusPagesComponentDataRelationshipsStatusPage statusPage;

  public StatusPagesComponentDataRelationships createdByUser(StatusPagesComponentDataRelationshipsCreatedByUser createdByUser) {
    this.createdByUser = createdByUser;
    this.unparsed |= createdByUser.unparsed;
    return this;
  }

  /**
   * <p>GetcreatedByUser</p>
   * @return createdByUser
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public StatusPagesComponentDataRelationshipsCreatedByUser getCreatedByUser() {
        return createdByUser;
      }
  public void setCreatedByUser(StatusPagesComponentDataRelationshipsCreatedByUser createdByUser) {
    this.createdByUser = createdByUser;
  }
  public StatusPagesComponentDataRelationships group(StatusPagesComponentDataRelationshipsGroup group) {
    this.group = group;
    this.unparsed |= group.unparsed;
    return this;
  }

  /**
   * <p>Getgroup</p>
   * @return group
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public StatusPagesComponentDataRelationshipsGroup getGroup() {
        return group;
      }
  public void setGroup(StatusPagesComponentDataRelationshipsGroup group) {
    this.group = group;
  }
  public StatusPagesComponentDataRelationships lastModifiedByUser(StatusPagesComponentDataRelationshipsLastModifiedByUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
    this.unparsed |= lastModifiedByUser.unparsed;
    return this;
  }

  /**
   * <p>GetlastModifiedByUser</p>
   * @return lastModifiedByUser
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY_USER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public StatusPagesComponentDataRelationshipsLastModifiedByUser getLastModifiedByUser() {
        return lastModifiedByUser;
      }
  public void setLastModifiedByUser(StatusPagesComponentDataRelationshipsLastModifiedByUser lastModifiedByUser) {
    this.lastModifiedByUser = lastModifiedByUser;
  }
  public StatusPagesComponentDataRelationships statusPage(StatusPagesComponentDataRelationshipsStatusPage statusPage) {
    this.statusPage = statusPage;
    this.unparsed |= statusPage.unparsed;
    return this;
  }

  /**
   * <p>GetstatusPage</p>
   * @return statusPage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS_PAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public StatusPagesComponentDataRelationshipsStatusPage getStatusPage() {
        return statusPage;
      }
  public void setStatusPage(StatusPagesComponentDataRelationshipsStatusPage statusPage) {
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
   * @return StatusPagesComponentDataRelationships
   */
  @JsonAnySetter
  public StatusPagesComponentDataRelationships putAdditionalProperty(String key, Object value) {
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
   * Return true if this StatusPagesComponentDataRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusPagesComponentDataRelationships statusPagesComponentDataRelationships = (StatusPagesComponentDataRelationships) o;
    return Objects.equals(this.createdByUser, statusPagesComponentDataRelationships.createdByUser) && Objects.equals(this.group, statusPagesComponentDataRelationships.group) && Objects.equals(this.lastModifiedByUser, statusPagesComponentDataRelationships.lastModifiedByUser) && Objects.equals(this.statusPage, statusPagesComponentDataRelationships.statusPage) && Objects.equals(this.additionalProperties, statusPagesComponentDataRelationships.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdByUser,group,lastModifiedByUser,statusPage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusPagesComponentDataRelationships {\n");
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
