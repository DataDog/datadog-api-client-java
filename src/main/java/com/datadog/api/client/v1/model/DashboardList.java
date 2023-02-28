/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
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
   * <p>Your Datadog Dashboards.</p>
 */
@JsonPropertyOrder({
  DashboardList.JSON_PROPERTY_AUTHOR,
  DashboardList.JSON_PROPERTY_CREATED,
  DashboardList.JSON_PROPERTY_DASHBOARD_COUNT,
  DashboardList.JSON_PROPERTY_ID,
  DashboardList.JSON_PROPERTY_IS_FAVORITE,
  DashboardList.JSON_PROPERTY_MODIFIED,
  DashboardList.JSON_PROPERTY_NAME,
  DashboardList.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardList {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private Creator author;

  public static final String JSON_PROPERTY_CREATED = "created";
  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_DASHBOARD_COUNT = "dashboard_count";
  private Long dashboardCount;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_IS_FAVORITE = "is_favorite";
  private Boolean isFavorite;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public DashboardList() {}

  @JsonCreator
  public DashboardList(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.name = name;
  }

  /**
   * <p>Object describing the creator of the shared element.</p>
   * @return author
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTHOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Creator getAuthor() {
        return author;
      }

  /**
   * <p>Date of creation of the dashboard list.</p>
   * @return created
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreated() {
        return created;
      }

  /**
   * <p>The number of dashboards in the list.</p>
   * @return dashboardCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DASHBOARD_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getDashboardCount() {
        return dashboardCount;
      }

  /**
   * <p>The ID of the dashboard list.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getId() {
        return id;
      }

  /**
   * <p>Whether or not the list is in the favorites.</p>
   * @return isFavorite
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_FAVORITE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsFavorite() {
        return isFavorite;
      }

  /**
   * <p>Date of last edition of the dashboard list.</p>
   * @return modified
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModified() {
        return modified;
      }
  public DashboardList name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the dashboard list.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * <p>The type of dashboard list.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
      }

  /**
   * Return true if this DashboardList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardList dashboardList = (DashboardList) o;
    return Objects.equals(this.author, dashboardList.author) && Objects.equals(this.created, dashboardList.created) && Objects.equals(this.dashboardCount, dashboardList.dashboardCount) && Objects.equals(this.id, dashboardList.id) && Objects.equals(this.isFavorite, dashboardList.isFavorite) && Objects.equals(this.modified, dashboardList.modified) && Objects.equals(this.name, dashboardList.name) && Objects.equals(this.type, dashboardList.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(author,created,dashboardCount,id,isFavorite,modified,name,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardList {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    dashboardCount: ").append(toIndentedString(dashboardCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
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
