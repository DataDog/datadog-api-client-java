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

 */
@JsonPropertyOrder({
  UpdateConnectionRequestDataAttributes.JSON_PROPERTY_FIELDS_TO_ADD,
  UpdateConnectionRequestDataAttributes.JSON_PROPERTY_FIELDS_TO_DELETE,
  UpdateConnectionRequestDataAttributes.JSON_PROPERTY_FIELDS_TO_UPDATE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateConnectionRequestDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS_TO_ADD = "fields_to_add";
  private List<CreateConnectionRequestDataAttributesFieldsItems> fieldsToAdd = null;

  public static final String JSON_PROPERTY_FIELDS_TO_DELETE = "fields_to_delete";
  private List<String> fieldsToDelete = null;

  public static final String JSON_PROPERTY_FIELDS_TO_UPDATE = "fields_to_update";
  private List<UpdateConnectionRequestDataAttributesFieldsToUpdateItems> fieldsToUpdate = null;

  public UpdateConnectionRequestDataAttributes fieldsToAdd(List<CreateConnectionRequestDataAttributesFieldsItems> fieldsToAdd) {
    this.fieldsToAdd = fieldsToAdd;
    for (CreateConnectionRequestDataAttributesFieldsItems item : fieldsToAdd) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public UpdateConnectionRequestDataAttributes addFieldsToAddItem(CreateConnectionRequestDataAttributesFieldsItems fieldsToAddItem) {
    if (this.fieldsToAdd == null) {
      this.fieldsToAdd = new ArrayList<>();
    }
    this.fieldsToAdd.add(fieldsToAddItem);
    this.unparsed |= fieldsToAddItem.unparsed;
    return this;
  }

  /**
   * <p>GetfieldsToAdd</p>
   * @return fieldsToAdd
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FIELDS_TO_ADD)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<CreateConnectionRequestDataAttributesFieldsItems> getFieldsToAdd() {
        return fieldsToAdd;
      }
  public void setFieldsToAdd(List<CreateConnectionRequestDataAttributesFieldsItems> fieldsToAdd) {
    this.fieldsToAdd = fieldsToAdd;
  }
  public UpdateConnectionRequestDataAttributes fieldsToDelete(List<String> fieldsToDelete) {
    this.fieldsToDelete = fieldsToDelete;
    return this;
  }
  public UpdateConnectionRequestDataAttributes addFieldsToDeleteItem(String fieldsToDeleteItem) {
    if (this.fieldsToDelete == null) {
      this.fieldsToDelete = new ArrayList<>();
    }
    this.fieldsToDelete.add(fieldsToDeleteItem);
    return this;
  }

  /**
   * <p>GetfieldsToDelete</p>
   * @return fieldsToDelete
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FIELDS_TO_DELETE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getFieldsToDelete() {
        return fieldsToDelete;
      }
  public void setFieldsToDelete(List<String> fieldsToDelete) {
    this.fieldsToDelete = fieldsToDelete;
  }
  public UpdateConnectionRequestDataAttributes fieldsToUpdate(List<UpdateConnectionRequestDataAttributesFieldsToUpdateItems> fieldsToUpdate) {
    this.fieldsToUpdate = fieldsToUpdate;
    for (UpdateConnectionRequestDataAttributesFieldsToUpdateItems item : fieldsToUpdate) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public UpdateConnectionRequestDataAttributes addFieldsToUpdateItem(UpdateConnectionRequestDataAttributesFieldsToUpdateItems fieldsToUpdateItem) {
    if (this.fieldsToUpdate == null) {
      this.fieldsToUpdate = new ArrayList<>();
    }
    this.fieldsToUpdate.add(fieldsToUpdateItem);
    this.unparsed |= fieldsToUpdateItem.unparsed;
    return this;
  }

  /**
   * <p>GetfieldsToUpdate</p>
   * @return fieldsToUpdate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FIELDS_TO_UPDATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<UpdateConnectionRequestDataAttributesFieldsToUpdateItems> getFieldsToUpdate() {
        return fieldsToUpdate;
      }
  public void setFieldsToUpdate(List<UpdateConnectionRequestDataAttributesFieldsToUpdateItems> fieldsToUpdate) {
    this.fieldsToUpdate = fieldsToUpdate;
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
   * @return UpdateConnectionRequestDataAttributes
   */
  @JsonAnySetter
  public UpdateConnectionRequestDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this UpdateConnectionRequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateConnectionRequestDataAttributes updateConnectionRequestDataAttributes = (UpdateConnectionRequestDataAttributes) o;
    return Objects.equals(this.fieldsToAdd, updateConnectionRequestDataAttributes.fieldsToAdd) && Objects.equals(this.fieldsToDelete, updateConnectionRequestDataAttributes.fieldsToDelete) && Objects.equals(this.fieldsToUpdate, updateConnectionRequestDataAttributes.fieldsToUpdate) && Objects.equals(this.additionalProperties, updateConnectionRequestDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(fieldsToAdd,fieldsToDelete,fieldsToUpdate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateConnectionRequestDataAttributes {\n");
    sb.append("    fieldsToAdd: ").append(toIndentedString(fieldsToAdd)).append("\n");
    sb.append("    fieldsToDelete: ").append(toIndentedString(fieldsToDelete)).append("\n");
    sb.append("    fieldsToUpdate: ").append(toIndentedString(fieldsToUpdate)).append("\n");
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
