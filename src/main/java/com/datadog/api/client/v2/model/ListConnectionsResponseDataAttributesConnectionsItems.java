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
  ListConnectionsResponseDataAttributesConnectionsItems.JSON_PROPERTY_CREATED_AT,
  ListConnectionsResponseDataAttributesConnectionsItems.JSON_PROPERTY_CREATED_BY,
  ListConnectionsResponseDataAttributesConnectionsItems.JSON_PROPERTY_FIELDS,
  ListConnectionsResponseDataAttributesConnectionsItems.JSON_PROPERTY_ID,
  ListConnectionsResponseDataAttributesConnectionsItems.JSON_PROPERTY_JOIN,
  ListConnectionsResponseDataAttributesConnectionsItems.JSON_PROPERTY_METADATA,
  ListConnectionsResponseDataAttributesConnectionsItems.JSON_PROPERTY_TYPE,
  ListConnectionsResponseDataAttributesConnectionsItems.JSON_PROPERTY_UPDATED_AT,
  ListConnectionsResponseDataAttributesConnectionsItems.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListConnectionsResponseDataAttributesConnectionsItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<CreateConnectionRequestDataAttributesFieldsItems> fields = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_JOIN = "join";
  private ListConnectionsResponseDataAttributesConnectionsItemsJoin join;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private String updatedBy;

  public ListConnectionsResponseDataAttributesConnectionsItems createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>GetcreatedAt</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public ListConnectionsResponseDataAttributesConnectionsItems createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>GetcreatedBy</p>
   * @return createdBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedBy() {
        return createdBy;
      }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }
  public ListConnectionsResponseDataAttributesConnectionsItems fields(List<CreateConnectionRequestDataAttributesFieldsItems> fields) {
    this.fields = fields;
    for (CreateConnectionRequestDataAttributesFieldsItems item : fields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ListConnectionsResponseDataAttributesConnectionsItems addFieldsItem(CreateConnectionRequestDataAttributesFieldsItems fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    this.unparsed |= fieldsItem.unparsed;
    return this;
  }

  /**
   * <p>Getfields</p>
   * @return fields
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FIELDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<CreateConnectionRequestDataAttributesFieldsItems> getFields() {
        return fields;
      }
  public void setFields(List<CreateConnectionRequestDataAttributesFieldsItems> fields) {
    this.fields = fields;
  }
  public ListConnectionsResponseDataAttributesConnectionsItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getid</p>
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
  public ListConnectionsResponseDataAttributesConnectionsItems join(ListConnectionsResponseDataAttributesConnectionsItemsJoin join) {
    this.join = join;
    this.unparsed |= join.unparsed;
    return this;
  }

  /**
   * <p>Getjoin</p>
   * @return join
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_JOIN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ListConnectionsResponseDataAttributesConnectionsItemsJoin getJoin() {
        return join;
      }
  public void setJoin(ListConnectionsResponseDataAttributesConnectionsItemsJoin join) {
    this.join = join;
  }
  public ListConnectionsResponseDataAttributesConnectionsItems metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }
  public ListConnectionsResponseDataAttributesConnectionsItems putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * <p>Getmetadata</p>
   * @return metadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, String> getMetadata() {
        return metadata;
      }
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }
  public ListConnectionsResponseDataAttributesConnectionsItems type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Gettype</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
  }
  public ListConnectionsResponseDataAttributesConnectionsItems updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>GetupdatedAt</p>
   * @return updatedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getUpdatedAt() {
        return updatedAt;
      }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  public ListConnectionsResponseDataAttributesConnectionsItems updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * <p>GetupdatedBy</p>
   * @return updatedBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUpdatedBy() {
        return updatedBy;
      }
  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
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
   * @return ListConnectionsResponseDataAttributesConnectionsItems
   */
  @JsonAnySetter
  public ListConnectionsResponseDataAttributesConnectionsItems putAdditionalProperty(String key, Object value) {
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
   * Return true if this ListConnectionsResponseDataAttributesConnectionsItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListConnectionsResponseDataAttributesConnectionsItems listConnectionsResponseDataAttributesConnectionsItems = (ListConnectionsResponseDataAttributesConnectionsItems) o;
    return Objects.equals(this.createdAt, listConnectionsResponseDataAttributesConnectionsItems.createdAt) && Objects.equals(this.createdBy, listConnectionsResponseDataAttributesConnectionsItems.createdBy) && Objects.equals(this.fields, listConnectionsResponseDataAttributesConnectionsItems.fields) && Objects.equals(this.id, listConnectionsResponseDataAttributesConnectionsItems.id) && Objects.equals(this.join, listConnectionsResponseDataAttributesConnectionsItems.join) && Objects.equals(this.metadata, listConnectionsResponseDataAttributesConnectionsItems.metadata) && Objects.equals(this.type, listConnectionsResponseDataAttributesConnectionsItems.type) && Objects.equals(this.updatedAt, listConnectionsResponseDataAttributesConnectionsItems.updatedAt) && Objects.equals(this.updatedBy, listConnectionsResponseDataAttributesConnectionsItems.updatedBy) && Objects.equals(this.additionalProperties, listConnectionsResponseDataAttributesConnectionsItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,createdBy,fields,id,join,metadata,type,updatedAt,updatedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListConnectionsResponseDataAttributesConnectionsItems {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    join: ").append(toIndentedString(join)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
