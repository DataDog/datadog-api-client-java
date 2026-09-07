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
   * <p>Metadata and content of a datastore item.</p>
 */
@JsonPropertyOrder({
  ItemApiPayloadDataAttributes.JSON_PROPERTY_CREATED_AT,
  ItemApiPayloadDataAttributes.JSON_PROPERTY_MODIFIED_AT,
  ItemApiPayloadDataAttributes.JSON_PROPERTY_ORG_ID,
  ItemApiPayloadDataAttributes.JSON_PROPERTY_PRIMARY_COLUMN_NAME,
  ItemApiPayloadDataAttributes.JSON_PROPERTY_SIGNATURE,
  ItemApiPayloadDataAttributes.JSON_PROPERTY_STORE_ID,
  ItemApiPayloadDataAttributes.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ItemApiPayloadDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_PRIMARY_COLUMN_NAME = "primary_column_name";
  private String primaryColumnName;

  public static final String JSON_PROPERTY_SIGNATURE = "signature";
  private String signature;

  public static final String JSON_PROPERTY_STORE_ID = "store_id";
  private String storeId;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Map<String, Object> value = null;

  public ItemApiPayloadDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Timestamp when the item was first created.</p>
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
  public ItemApiPayloadDataAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * <p>Timestamp when the item was last modified.</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  public ItemApiPayloadDataAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * <p>The ID of the organization that owns this item.</p>
   * @return orgId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORG_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getOrgId() {
        return orgId;
      }
  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }
  public ItemApiPayloadDataAttributes primaryColumnName(String primaryColumnName) {
    this.primaryColumnName = primaryColumnName;
    return this;
  }

  /**
   * <p>The name of the primary key column for this datastore. Primary column names:
   *   - Must abide by both <a href="https://www.postgresql.org/docs/7.0/syntax525.htm">PostgreSQL naming conventions</a>
   *   - Cannot exceed 63 characters</p>
   * @return primaryColumnName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRIMARY_COLUMN_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPrimaryColumnName() {
        return primaryColumnName;
      }
  public void setPrimaryColumnName(String primaryColumnName) {
    this.primaryColumnName = primaryColumnName;
  }
  public ItemApiPayloadDataAttributes signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * <p>A unique signature identifying this item version.</p>
   * @return signature
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SIGNATURE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSignature() {
        return signature;
      }
  public void setSignature(String signature) {
    this.signature = signature;
  }
  public ItemApiPayloadDataAttributes storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * <p>The unique identifier of the datastore containing this item.</p>
   * @return storeId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STORE_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStoreId() {
        return storeId;
      }
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }
  public ItemApiPayloadDataAttributes value(Map<String, Object> value) {
    this.value = value;
    return this;
  }
  public ItemApiPayloadDataAttributes putValueItem(String key, Object valueItem) {
    if (this.value == null) {
      this.value = new HashMap<>();
    }
    this.value.put(key, valueItem);
    return this;
  }

  /**
   * <p>The data content (as key-value pairs) of a datastore item.</p>
   * @return value
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Object> getValue() {
        return value;
      }
  public void setValue(Map<String, Object> value) {
    this.value = value;
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
   * @return ItemApiPayloadDataAttributes
   */
  @JsonAnySetter
  public ItemApiPayloadDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ItemApiPayloadDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemApiPayloadDataAttributes itemApiPayloadDataAttributes = (ItemApiPayloadDataAttributes) o;
    return Objects.equals(this.createdAt, itemApiPayloadDataAttributes.createdAt) && Objects.equals(this.modifiedAt, itemApiPayloadDataAttributes.modifiedAt) && Objects.equals(this.orgId, itemApiPayloadDataAttributes.orgId) && Objects.equals(this.primaryColumnName, itemApiPayloadDataAttributes.primaryColumnName) && Objects.equals(this.signature, itemApiPayloadDataAttributes.signature) && Objects.equals(this.storeId, itemApiPayloadDataAttributes.storeId) && Objects.equals(this.value, itemApiPayloadDataAttributes.value) && Objects.equals(this.additionalProperties, itemApiPayloadDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,modifiedAt,orgId,primaryColumnName,signature,storeId,value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemApiPayloadDataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    primaryColumnName: ").append(toIndentedString(primaryColumnName)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
