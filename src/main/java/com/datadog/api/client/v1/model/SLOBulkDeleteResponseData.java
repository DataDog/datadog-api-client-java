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
   * <p>An array of service level objective objects.</p>
 */
@JsonPropertyOrder({
  SLOBulkDeleteResponseData.JSON_PROPERTY_DELETED,
  SLOBulkDeleteResponseData.JSON_PROPERTY_UPDATED
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOBulkDeleteResponseData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELETED = "deleted";
  private List<String> deleted = null;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  private List<String> updated = null;

  public SLOBulkDeleteResponseData deleted(List<String> deleted) {
    this.deleted = deleted;
    return this;
  }
  public SLOBulkDeleteResponseData addDeletedItem(String deletedItem) {
    if (this.deleted == null) {
      this.deleted = new ArrayList<>();
    }
    this.deleted.add(deletedItem);
    return this;
  }

  /**
   * <p>An array of service level objective object IDs that indicates
   * which objects that were completely deleted.</p>
   * @return deleted
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DELETED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getDeleted() {
        return deleted;
      }
  public void setDeleted(List<String> deleted) {
    this.deleted = deleted;
  }
  public SLOBulkDeleteResponseData updated(List<String> updated) {
    this.updated = updated;
    return this;
  }
  public SLOBulkDeleteResponseData addUpdatedItem(String updatedItem) {
    if (this.updated == null) {
      this.updated = new ArrayList<>();
    }
    this.updated.add(updatedItem);
    return this;
  }

  /**
   * <p>An array of service level objective object IDs that indicates
   * which objects that were modified (objects for which at least one
   * threshold was deleted, but that were not completely deleted).</p>
   * @return updated
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getUpdated() {
        return updated;
      }
  public void setUpdated(List<String> updated) {
    this.updated = updated;
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
   * @return SLOBulkDeleteResponseData
   */
  @JsonAnySetter
  public SLOBulkDeleteResponseData putAdditionalProperty(String key, Object value) {
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
   * Return true if this SLOBulkDeleteResponseData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOBulkDeleteResponseData sloBulkDeleteResponseData = (SLOBulkDeleteResponseData) o;
    return Objects.equals(this.deleted, sloBulkDeleteResponseData.deleted) && Objects.equals(this.updated, sloBulkDeleteResponseData.updated) && Objects.equals(this.additionalProperties, sloBulkDeleteResponseData.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(deleted,updated, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOBulkDeleteResponseData {\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
