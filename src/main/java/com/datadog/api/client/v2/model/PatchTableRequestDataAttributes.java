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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes that define the updates to the reference table's configuration and properties. */
@JsonPropertyOrder({
  PatchTableRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  PatchTableRequestDataAttributes.JSON_PROPERTY_FILE_METADATA,
  PatchTableRequestDataAttributes.JSON_PROPERTY_SCHEMA,
  PatchTableRequestDataAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PatchTableRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FILE_METADATA = "file_metadata";
  private PatchTableRequestDataAttributesFileMetadata fileMetadata;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private PatchTableRequestDataAttributesSchema schema;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public PatchTableRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional text describing the purpose or contents of this reference table.
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

  public PatchTableRequestDataAttributes fileMetadata(
      PatchTableRequestDataAttributesFileMetadata fileMetadata) {
    this.fileMetadata = fileMetadata;
    this.unparsed |= fileMetadata.unparsed;
    return this;
  }

  /**
   * Metadata specifying where and how to access the reference table's data file.
   *
   * @return fileMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PatchTableRequestDataAttributesFileMetadata getFileMetadata() {
    return fileMetadata;
  }

  public void setFileMetadata(PatchTableRequestDataAttributesFileMetadata fileMetadata) {
    this.fileMetadata = fileMetadata;
  }

  public PatchTableRequestDataAttributes schema(PatchTableRequestDataAttributesSchema schema) {
    this.schema = schema;
    this.unparsed |= schema.unparsed;
    return this;
  }

  /**
   * Schema defining the updates to the structure and columns of the reference table. Schema fields
   * cannot be deleted or renamed.
   *
   * @return schema
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PatchTableRequestDataAttributesSchema getSchema() {
    return schema;
  }

  public void setSchema(PatchTableRequestDataAttributesSchema schema) {
    this.schema = schema;
  }

  public PatchTableRequestDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PatchTableRequestDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags for organizing and filtering reference tables.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return PatchTableRequestDataAttributes
   */
  @JsonAnySetter
  public PatchTableRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PatchTableRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchTableRequestDataAttributes patchTableRequestDataAttributes =
        (PatchTableRequestDataAttributes) o;
    return Objects.equals(this.description, patchTableRequestDataAttributes.description)
        && Objects.equals(this.fileMetadata, patchTableRequestDataAttributes.fileMetadata)
        && Objects.equals(this.schema, patchTableRequestDataAttributes.schema)
        && Objects.equals(this.tags, patchTableRequestDataAttributes.tags)
        && Objects.equals(
            this.additionalProperties, patchTableRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, fileMetadata, schema, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchTableRequestDataAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileMetadata: ").append(toIndentedString(fileMetadata)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
