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
   * <p>Configuration and metadata to create a new datastore.</p>
 */
@JsonPropertyOrder({
  CreateAppsDatastoreRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateAppsDatastoreRequestDataAttributes.JSON_PROPERTY_NAME,
  CreateAppsDatastoreRequestDataAttributes.JSON_PROPERTY_ORG_ACCESS,
  CreateAppsDatastoreRequestDataAttributes.JSON_PROPERTY_PRIMARY_COLUMN_NAME,
  CreateAppsDatastoreRequestDataAttributes.JSON_PROPERTY_PRIMARY_KEY_GENERATION_STRATEGY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateAppsDatastoreRequestDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ACCESS = "org_access";
  private CreateAppsDatastoreRequestDataAttributesOrgAccess orgAccess;

  public static final String JSON_PROPERTY_PRIMARY_COLUMN_NAME = "primary_column_name";
  private String primaryColumnName;

  public static final String JSON_PROPERTY_PRIMARY_KEY_GENERATION_STRATEGY = "primary_key_generation_strategy";
  private DatastorePrimaryKeyGenerationStrategy primaryKeyGenerationStrategy;

  public CreateAppsDatastoreRequestDataAttributes() {}

  @JsonCreator
  public CreateAppsDatastoreRequestDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_PRIMARY_COLUMN_NAME)String primaryColumnName) {
        this.name = name;
        this.primaryColumnName = primaryColumnName;
  }
  public CreateAppsDatastoreRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>A human-readable description about the datastore.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public CreateAppsDatastoreRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The display name for the new datastore.</p>
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
  public CreateAppsDatastoreRequestDataAttributes orgAccess(CreateAppsDatastoreRequestDataAttributesOrgAccess orgAccess) {
    this.orgAccess = orgAccess;
    this.unparsed |= !orgAccess.isValid();
    return this;
  }

  /**
   * <p>The organization access level for the datastore. For example, 'contributor'.</p>
   * @return orgAccess
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORG_ACCESS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CreateAppsDatastoreRequestDataAttributesOrgAccess getOrgAccess() {
        return orgAccess;
      }
  public void setOrgAccess(CreateAppsDatastoreRequestDataAttributesOrgAccess orgAccess) {
    if (!orgAccess.isValid()) {
        this.unparsed = true;
    }
    this.orgAccess = orgAccess;
  }
  public CreateAppsDatastoreRequestDataAttributes primaryColumnName(String primaryColumnName) {
    this.primaryColumnName = primaryColumnName;
    return this;
  }

  /**
   * <p>The name of the primary key column for this datastore. Primary column names:
   *   - Must abide by both <a href="https://www.postgresql.org/docs/7.0/syntax525.htm">PostgreSQL naming conventions</a>
   *   - Cannot exceed 63 characters</p>
   * @return primaryColumnName
  **/
      @JsonProperty(JSON_PROPERTY_PRIMARY_COLUMN_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getPrimaryColumnName() {
        return primaryColumnName;
      }
  public void setPrimaryColumnName(String primaryColumnName) {
    this.primaryColumnName = primaryColumnName;
  }
  public CreateAppsDatastoreRequestDataAttributes primaryKeyGenerationStrategy(DatastorePrimaryKeyGenerationStrategy primaryKeyGenerationStrategy) {
    this.primaryKeyGenerationStrategy = primaryKeyGenerationStrategy;
    this.unparsed |= !primaryKeyGenerationStrategy.isValid();
    return this;
  }

  /**
   * <p>Can be set to <code>uuid</code> to automatically generate primary keys when new items are added. Default value is <code>none</code>, which requires you to supply a primary key for each new item.</p>
   * @return primaryKeyGenerationStrategy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRIMARY_KEY_GENERATION_STRATEGY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public DatastorePrimaryKeyGenerationStrategy getPrimaryKeyGenerationStrategy() {
        return primaryKeyGenerationStrategy;
      }
  public void setPrimaryKeyGenerationStrategy(DatastorePrimaryKeyGenerationStrategy primaryKeyGenerationStrategy) {
    if (!primaryKeyGenerationStrategy.isValid()) {
        this.unparsed = true;
    }
    this.primaryKeyGenerationStrategy = primaryKeyGenerationStrategy;
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
   * @return CreateAppsDatastoreRequestDataAttributes
   */
  @JsonAnySetter
  public CreateAppsDatastoreRequestDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CreateAppsDatastoreRequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAppsDatastoreRequestDataAttributes createAppsDatastoreRequestDataAttributes = (CreateAppsDatastoreRequestDataAttributes) o;
    return Objects.equals(this.description, createAppsDatastoreRequestDataAttributes.description) && Objects.equals(this.name, createAppsDatastoreRequestDataAttributes.name) && Objects.equals(this.orgAccess, createAppsDatastoreRequestDataAttributes.orgAccess) && Objects.equals(this.primaryColumnName, createAppsDatastoreRequestDataAttributes.primaryColumnName) && Objects.equals(this.primaryKeyGenerationStrategy, createAppsDatastoreRequestDataAttributes.primaryKeyGenerationStrategy) && Objects.equals(this.additionalProperties, createAppsDatastoreRequestDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,name,orgAccess,primaryColumnName,primaryKeyGenerationStrategy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAppsDatastoreRequestDataAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgAccess: ").append(toIndentedString(orgAccess)).append("\n");
    sb.append("    primaryColumnName: ").append(toIndentedString(primaryColumnName)).append("\n");
    sb.append("    primaryKeyGenerationStrategy: ").append(toIndentedString(primaryKeyGenerationStrategy)).append("\n");
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
