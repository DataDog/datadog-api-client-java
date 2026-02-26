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
   * <p>Attributes for updating a datastore item, including the item key and changes to apply.</p>
 */
@JsonPropertyOrder({
  UpdateAppsDatastoreItemRequestDataAttributes.JSON_PROPERTY_ID,
  UpdateAppsDatastoreItemRequestDataAttributes.JSON_PROPERTY_ITEM_CHANGES,
  UpdateAppsDatastoreItemRequestDataAttributes.JSON_PROPERTY_ITEM_KEY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateAppsDatastoreItemRequestDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ITEM_CHANGES = "item_changes";
  private UpdateAppsDatastoreItemRequestDataAttributesItemChanges itemChanges;

  public static final String JSON_PROPERTY_ITEM_KEY = "item_key";
  private String itemKey;

  public UpdateAppsDatastoreItemRequestDataAttributes() {}

  @JsonCreator
  public UpdateAppsDatastoreItemRequestDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_ITEM_CHANGES)UpdateAppsDatastoreItemRequestDataAttributesItemChanges itemChanges,
            @JsonProperty(required=true, value=JSON_PROPERTY_ITEM_KEY)String itemKey) {
        this.itemChanges = itemChanges;
        this.unparsed |= itemChanges.unparsed;
        this.itemKey = itemKey;
  }
  public UpdateAppsDatastoreItemRequestDataAttributes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The unique identifier of the item being updated.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public UpdateAppsDatastoreItemRequestDataAttributes itemChanges(UpdateAppsDatastoreItemRequestDataAttributesItemChanges itemChanges) {
    this.itemChanges = itemChanges;
    this.unparsed |= itemChanges.unparsed;
    return this;
  }

  /**
   * <p>Changes to apply to a datastore item using set operations.</p>
   * @return itemChanges
  **/
      @JsonProperty(JSON_PROPERTY_ITEM_CHANGES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public UpdateAppsDatastoreItemRequestDataAttributesItemChanges getItemChanges() {
        return itemChanges;
      }
  public void setItemChanges(UpdateAppsDatastoreItemRequestDataAttributesItemChanges itemChanges) {
    this.itemChanges = itemChanges;
  }
  public UpdateAppsDatastoreItemRequestDataAttributes itemKey(String itemKey) {
    this.itemKey = itemKey;
    return this;
  }

  /**
   * <p>The primary key that identifies the item to update. Cannot exceed 256 characters.</p>
   * @return itemKey
  **/
      @JsonProperty(JSON_PROPERTY_ITEM_KEY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getItemKey() {
        return itemKey;
      }
  public void setItemKey(String itemKey) {
    this.itemKey = itemKey;
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
   * @return UpdateAppsDatastoreItemRequestDataAttributes
   */
  @JsonAnySetter
  public UpdateAppsDatastoreItemRequestDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this UpdateAppsDatastoreItemRequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAppsDatastoreItemRequestDataAttributes updateAppsDatastoreItemRequestDataAttributes = (UpdateAppsDatastoreItemRequestDataAttributes) o;
    return Objects.equals(this.id, updateAppsDatastoreItemRequestDataAttributes.id) && Objects.equals(this.itemChanges, updateAppsDatastoreItemRequestDataAttributes.itemChanges) && Objects.equals(this.itemKey, updateAppsDatastoreItemRequestDataAttributes.itemKey) && Objects.equals(this.additionalProperties, updateAppsDatastoreItemRequestDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(id,itemChanges,itemKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAppsDatastoreItemRequestDataAttributes {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemChanges: ").append(toIndentedString(itemChanges)).append("\n");
    sb.append("    itemKey: ").append(toIndentedString(itemKey)).append("\n");
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
