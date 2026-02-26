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
   * <p>Attributes that define the reference table's configuration and properties.</p>
 */
@JsonPropertyOrder({
  CreateTableRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateTableRequestDataAttributes.JSON_PROPERTY_FILE_METADATA,
  CreateTableRequestDataAttributes.JSON_PROPERTY_SCHEMA,
  CreateTableRequestDataAttributes.JSON_PROPERTY_SOURCE,
  CreateTableRequestDataAttributes.JSON_PROPERTY_TABLE_NAME,
  CreateTableRequestDataAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateTableRequestDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FILE_METADATA = "file_metadata";
  private CreateTableRequestDataAttributesFileMetadata fileMetadata;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private CreateTableRequestDataAttributesSchema schema;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private ReferenceTableCreateSourceType source;

  public static final String JSON_PROPERTY_TABLE_NAME = "table_name";
  private String tableName;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public CreateTableRequestDataAttributes() {}

  @JsonCreator
  public CreateTableRequestDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_SCHEMA)CreateTableRequestDataAttributesSchema schema,
            @JsonProperty(required=true, value=JSON_PROPERTY_SOURCE)ReferenceTableCreateSourceType source,
            @JsonProperty(required=true, value=JSON_PROPERTY_TABLE_NAME)String tableName) {
        this.schema = schema;
        this.unparsed |= schema.unparsed;
        this.source = source;
        this.unparsed |= !source.isValid();
        this.tableName = tableName;
  }
  public CreateTableRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Optional text describing the purpose or contents of this reference table.</p>
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
  public CreateTableRequestDataAttributes fileMetadata(CreateTableRequestDataAttributesFileMetadata fileMetadata) {
    this.fileMetadata = fileMetadata;
    this.unparsed |= fileMetadata.unparsed;
    return this;
  }

  /**
   * <p>Metadata specifying where and how to access the reference table's data file.</p>
   * @return fileMetadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILE_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CreateTableRequestDataAttributesFileMetadata getFileMetadata() {
        return fileMetadata;
      }
  public void setFileMetadata(CreateTableRequestDataAttributesFileMetadata fileMetadata) {
    this.fileMetadata = fileMetadata;
  }
  public CreateTableRequestDataAttributes schema(CreateTableRequestDataAttributesSchema schema) {
    this.schema = schema;
    this.unparsed |= schema.unparsed;
    return this;
  }

  /**
   * <p>Schema defining the structure and columns of the reference table.</p>
   * @return schema
  **/
      @JsonProperty(JSON_PROPERTY_SCHEMA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public CreateTableRequestDataAttributesSchema getSchema() {
        return schema;
      }
  public void setSchema(CreateTableRequestDataAttributesSchema schema) {
    this.schema = schema;
  }
  public CreateTableRequestDataAttributes source(ReferenceTableCreateSourceType source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * <p>The source type for creating reference table data. Only these source types can be created through this API.</p>
   * @return source
  **/
      @JsonProperty(JSON_PROPERTY_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ReferenceTableCreateSourceType getSource() {
        return source;
      }
  public void setSource(ReferenceTableCreateSourceType source) {
    if (!source.isValid()) {
        this.unparsed = true;
    }
    this.source = source;
  }
  public CreateTableRequestDataAttributes tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * <p>Name to identify this reference table.</p>
   * @return tableName
  **/
      @JsonProperty(JSON_PROPERTY_TABLE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTableName() {
        return tableName;
      }
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }
  public CreateTableRequestDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public CreateTableRequestDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>Tags for organizing and filtering reference tables.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return CreateTableRequestDataAttributes
   */
  @JsonAnySetter
  public CreateTableRequestDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CreateTableRequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTableRequestDataAttributes createTableRequestDataAttributes = (CreateTableRequestDataAttributes) o;
    return Objects.equals(this.description, createTableRequestDataAttributes.description) && Objects.equals(this.fileMetadata, createTableRequestDataAttributes.fileMetadata) && Objects.equals(this.schema, createTableRequestDataAttributes.schema) && Objects.equals(this.source, createTableRequestDataAttributes.source) && Objects.equals(this.tableName, createTableRequestDataAttributes.tableName) && Objects.equals(this.tags, createTableRequestDataAttributes.tags) && Objects.equals(this.additionalProperties, createTableRequestDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,fileMetadata,schema,source,tableName,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTableRequestDataAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileMetadata: ").append(toIndentedString(fileMetadata)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
