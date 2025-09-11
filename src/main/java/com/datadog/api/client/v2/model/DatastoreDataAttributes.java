/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Detailed information about a datastore. */
@JsonPropertyOrder({
  DatastoreDataAttributes.JSON_PROPERTY_CREATED_AT,
  DatastoreDataAttributes.JSON_PROPERTY_CREATOR_USER_ID,
  DatastoreDataAttributes.JSON_PROPERTY_CREATOR_USER_UUID,
  DatastoreDataAttributes.JSON_PROPERTY_DESCRIPTION,
  DatastoreDataAttributes.JSON_PROPERTY_MODIFIED_AT,
  DatastoreDataAttributes.JSON_PROPERTY_NAME,
  DatastoreDataAttributes.JSON_PROPERTY_ORG_ID,
  DatastoreDataAttributes.JSON_PROPERTY_PRIMARY_COLUMN_NAME,
  DatastoreDataAttributes.JSON_PROPERTY_PRIMARY_KEY_GENERATION_STRATEGY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatastoreDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATOR_USER_ID = "creator_user_id";
  private Long creatorUserId;

  public static final String JSON_PROPERTY_CREATOR_USER_UUID = "creator_user_uuid";
  private String creatorUserUuid;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_PRIMARY_COLUMN_NAME = "primary_column_name";
  private String primaryColumnName;

  public static final String JSON_PROPERTY_PRIMARY_KEY_GENERATION_STRATEGY =
      "primary_key_generation_strategy";
  private DatastorePrimaryKeyGenerationStrategy primaryKeyGenerationStrategy;

  public DatastoreDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the datastore was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DatastoreDataAttributes creatorUserId(Long creatorUserId) {
    this.creatorUserId = creatorUserId;
    return this;
  }

  /**
   * The numeric ID of the user who created the datastore.
   *
   * @return creatorUserId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatorUserId() {
    return creatorUserId;
  }

  public void setCreatorUserId(Long creatorUserId) {
    this.creatorUserId = creatorUserId;
  }

  public DatastoreDataAttributes creatorUserUuid(String creatorUserUuid) {
    this.creatorUserUuid = creatorUserUuid;
    return this;
  }

  /**
   * The UUID of the user who created the datastore.
   *
   * @return creatorUserUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR_USER_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatorUserUuid() {
    return creatorUserUuid;
  }

  public void setCreatorUserUuid(String creatorUserUuid) {
    this.creatorUserUuid = creatorUserUuid;
  }

  public DatastoreDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-readable description about the datastore.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DatastoreDataAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp when the datastore was last modified.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public DatastoreDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of the datastore.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DatastoreDataAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The ID of the organization that owns this datastore.
   *
   * @return orgId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public DatastoreDataAttributes primaryColumnName(String primaryColumnName) {
    this.primaryColumnName = primaryColumnName;
    return this;
  }

  /**
   * The name of the primary key column for this datastore. Primary column names: - Must abide by
   * both <a href="https://www.postgresql.org/docs/7.0/syntax525.htm">PostgreSQL naming
   * conventions</a> - Cannot exceed 63 characters
   *
   * @return primaryColumnName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_COLUMN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrimaryColumnName() {
    return primaryColumnName;
  }

  public void setPrimaryColumnName(String primaryColumnName) {
    this.primaryColumnName = primaryColumnName;
  }

  public DatastoreDataAttributes primaryKeyGenerationStrategy(
      DatastorePrimaryKeyGenerationStrategy primaryKeyGenerationStrategy) {
    this.primaryKeyGenerationStrategy = primaryKeyGenerationStrategy;
    this.unparsed |= !primaryKeyGenerationStrategy.isValid();
    return this;
  }

  /**
   * Can be set to <code>uuid</code> to automatically generate primary keys when new items are
   * added. Default value is <code>none</code>, which requires you to supply a primary key for each
   * new item.
   *
   * @return primaryKeyGenerationStrategy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_KEY_GENERATION_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatastorePrimaryKeyGenerationStrategy getPrimaryKeyGenerationStrategy() {
    return primaryKeyGenerationStrategy;
  }

  public void setPrimaryKeyGenerationStrategy(
      DatastorePrimaryKeyGenerationStrategy primaryKeyGenerationStrategy) {
    if (!primaryKeyGenerationStrategy.isValid()) {
      this.unparsed = true;
    }
    this.primaryKeyGenerationStrategy = primaryKeyGenerationStrategy;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return DatastoreDataAttributes
   */
  @JsonAnySetter
  public DatastoreDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DatastoreDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatastoreDataAttributes datastoreDataAttributes = (DatastoreDataAttributes) o;
    return Objects.equals(this.createdAt, datastoreDataAttributes.createdAt)
        && Objects.equals(this.creatorUserId, datastoreDataAttributes.creatorUserId)
        && Objects.equals(this.creatorUserUuid, datastoreDataAttributes.creatorUserUuid)
        && Objects.equals(this.description, datastoreDataAttributes.description)
        && Objects.equals(this.modifiedAt, datastoreDataAttributes.modifiedAt)
        && Objects.equals(this.name, datastoreDataAttributes.name)
        && Objects.equals(this.orgId, datastoreDataAttributes.orgId)
        && Objects.equals(this.primaryColumnName, datastoreDataAttributes.primaryColumnName)
        && Objects.equals(
            this.primaryKeyGenerationStrategy, datastoreDataAttributes.primaryKeyGenerationStrategy)
        && Objects.equals(this.additionalProperties, datastoreDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        creatorUserId,
        creatorUserUuid,
        description,
        modifiedAt,
        name,
        orgId,
        primaryColumnName,
        primaryKeyGenerationStrategy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatastoreDataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
    sb.append("    creatorUserUuid: ").append(toIndentedString(creatorUserUuid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    primaryColumnName: ").append(toIndentedString(primaryColumnName)).append("\n");
    sb.append("    primaryKeyGenerationStrategy: ")
        .append(toIndentedString(primaryKeyGenerationStrategy))
        .append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
