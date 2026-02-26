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
  UpdateConnectionRequestDataAttributesFieldsToUpdateItems.JSON_PROPERTY_FIELD_ID,
  UpdateConnectionRequestDataAttributesFieldsToUpdateItems.JSON_PROPERTY_UPDATED_DESCRIPTION,
  UpdateConnectionRequestDataAttributesFieldsToUpdateItems.JSON_PROPERTY_UPDATED_DISPLAY_NAME,
  UpdateConnectionRequestDataAttributesFieldsToUpdateItems.JSON_PROPERTY_UPDATED_FIELD_ID,
  UpdateConnectionRequestDataAttributesFieldsToUpdateItems.JSON_PROPERTY_UPDATED_GROUPS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateConnectionRequestDataAttributesFieldsToUpdateItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELD_ID = "field_id";
  private String fieldId;

  public static final String JSON_PROPERTY_UPDATED_DESCRIPTION = "updated_description";
  private String updatedDescription;

  public static final String JSON_PROPERTY_UPDATED_DISPLAY_NAME = "updated_display_name";
  private String updatedDisplayName;

  public static final String JSON_PROPERTY_UPDATED_FIELD_ID = "updated_field_id";
  private String updatedFieldId;

  public static final String JSON_PROPERTY_UPDATED_GROUPS = "updated_groups";
  private List<String> updatedGroups = null;

  public UpdateConnectionRequestDataAttributesFieldsToUpdateItems() {}

  @JsonCreator
  public UpdateConnectionRequestDataAttributesFieldsToUpdateItems(
            @JsonProperty(required=true, value=JSON_PROPERTY_FIELD_ID)String fieldId) {
        this.fieldId = fieldId;
  }
  public UpdateConnectionRequestDataAttributesFieldsToUpdateItems fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  /**
   * <p>GetfieldId</p>
   * @return fieldId
  **/
      @JsonProperty(JSON_PROPERTY_FIELD_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getFieldId() {
        return fieldId;
      }
  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }
  public UpdateConnectionRequestDataAttributesFieldsToUpdateItems updatedDescription(String updatedDescription) {
    this.updatedDescription = updatedDescription;
    return this;
  }

  /**
   * <p>GetupdatedDescription</p>
   * @return updatedDescription
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUpdatedDescription() {
        return updatedDescription;
      }
  public void setUpdatedDescription(String updatedDescription) {
    this.updatedDescription = updatedDescription;
  }
  public UpdateConnectionRequestDataAttributesFieldsToUpdateItems updatedDisplayName(String updatedDisplayName) {
    this.updatedDisplayName = updatedDisplayName;
    return this;
  }

  /**
   * <p>GetupdatedDisplayName</p>
   * @return updatedDisplayName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_DISPLAY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUpdatedDisplayName() {
        return updatedDisplayName;
      }
  public void setUpdatedDisplayName(String updatedDisplayName) {
    this.updatedDisplayName = updatedDisplayName;
  }
  public UpdateConnectionRequestDataAttributesFieldsToUpdateItems updatedFieldId(String updatedFieldId) {
    this.updatedFieldId = updatedFieldId;
    return this;
  }

  /**
   * <p>GetupdatedFieldId</p>
   * @return updatedFieldId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_FIELD_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUpdatedFieldId() {
        return updatedFieldId;
      }
  public void setUpdatedFieldId(String updatedFieldId) {
    this.updatedFieldId = updatedFieldId;
  }
  public UpdateConnectionRequestDataAttributesFieldsToUpdateItems updatedGroups(List<String> updatedGroups) {
    this.updatedGroups = updatedGroups;
    return this;
  }
  public UpdateConnectionRequestDataAttributesFieldsToUpdateItems addUpdatedGroupsItem(String updatedGroupsItem) {
    if (this.updatedGroups == null) {
      this.updatedGroups = new ArrayList<>();
    }
    this.updatedGroups.add(updatedGroupsItem);
    return this;
  }

  /**
   * <p>GetupdatedGroups</p>
   * @return updatedGroups
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_GROUPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getUpdatedGroups() {
        return updatedGroups;
      }
  public void setUpdatedGroups(List<String> updatedGroups) {
    this.updatedGroups = updatedGroups;
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
   * @return UpdateConnectionRequestDataAttributesFieldsToUpdateItems
   */
  @JsonAnySetter
  public UpdateConnectionRequestDataAttributesFieldsToUpdateItems putAdditionalProperty(String key, Object value) {
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
   * Return true if this UpdateConnectionRequestDataAttributesFieldsToUpdateItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateConnectionRequestDataAttributesFieldsToUpdateItems updateConnectionRequestDataAttributesFieldsToUpdateItems = (UpdateConnectionRequestDataAttributesFieldsToUpdateItems) o;
    return Objects.equals(this.fieldId, updateConnectionRequestDataAttributesFieldsToUpdateItems.fieldId) && Objects.equals(this.updatedDescription, updateConnectionRequestDataAttributesFieldsToUpdateItems.updatedDescription) && Objects.equals(this.updatedDisplayName, updateConnectionRequestDataAttributesFieldsToUpdateItems.updatedDisplayName) && Objects.equals(this.updatedFieldId, updateConnectionRequestDataAttributesFieldsToUpdateItems.updatedFieldId) && Objects.equals(this.updatedGroups, updateConnectionRequestDataAttributesFieldsToUpdateItems.updatedGroups) && Objects.equals(this.additionalProperties, updateConnectionRequestDataAttributesFieldsToUpdateItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(fieldId,updatedDescription,updatedDisplayName,updatedFieldId,updatedGroups, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateConnectionRequestDataAttributesFieldsToUpdateItems {\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    updatedDescription: ").append(toIndentedString(updatedDescription)).append("\n");
    sb.append("    updatedDisplayName: ").append(toIndentedString(updatedDisplayName)).append("\n");
    sb.append("    updatedFieldId: ").append(toIndentedString(updatedFieldId)).append("\n");
    sb.append("    updatedGroups: ").append(toIndentedString(updatedGroups)).append("\n");
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
