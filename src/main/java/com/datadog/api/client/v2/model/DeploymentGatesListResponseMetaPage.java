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
   * <p>Pagination information for a list of deployment gates.</p>
 */
@JsonPropertyOrder({
  DeploymentGatesListResponseMetaPage.JSON_PROPERTY_CURSOR,
  DeploymentGatesListResponseMetaPage.JSON_PROPERTY_NEXT_CURSOR,
  DeploymentGatesListResponseMetaPage.JSON_PROPERTY_SIZE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentGatesListResponseMetaPage {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURSOR = "cursor";
  private String cursor;

  public static final String JSON_PROPERTY_NEXT_CURSOR = "next_cursor";
  private String nextCursor;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size = 50l;

  public DeploymentGatesListResponseMetaPage cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * <p>The cursor used for the current page.</p>
   * @return cursor
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CURSOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCursor() {
        return cursor;
      }
  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
  public DeploymentGatesListResponseMetaPage nextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  /**
   * <p>The cursor to use to fetch the next page. This is absent when there are no more pages.</p>
   * @return nextCursor
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NEXT_CURSOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getNextCursor() {
        return nextCursor;
      }
  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }
  public DeploymentGatesListResponseMetaPage size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * <p>The number of results per page.</p>
   * minimum: 1
   * maximum: 1000
   * @return size
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getSize() {
        return size;
      }
  public void setSize(Long size) {
    this.size = size;
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
   * @return DeploymentGatesListResponseMetaPage
   */
  @JsonAnySetter
  public DeploymentGatesListResponseMetaPage putAdditionalProperty(String key, Object value) {
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
   * Return true if this DeploymentGatesListResponseMetaPage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentGatesListResponseMetaPage deploymentGatesListResponseMetaPage = (DeploymentGatesListResponseMetaPage) o;
    return Objects.equals(this.cursor, deploymentGatesListResponseMetaPage.cursor) && Objects.equals(this.nextCursor, deploymentGatesListResponseMetaPage.nextCursor) && Objects.equals(this.size, deploymentGatesListResponseMetaPage.size) && Objects.equals(this.additionalProperties, deploymentGatesListResponseMetaPage.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(cursor,nextCursor,size, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentGatesListResponseMetaPage {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
