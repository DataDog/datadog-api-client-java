/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Create a draft protocol with the organization default subject type. */
@JsonPropertyOrder({
  ExperimentsCreateExperimentProtocolRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsCreateExperimentProtocolRequestDataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsCreateExperimentProtocolRequestDataAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsCreateExperimentProtocolRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private JsonNullable<Map<String, Object>> migrationMetadata =
      JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ExperimentsCreateExperimentProtocolRequestDataAttributes() {}

  @JsonCreator
  public ExperimentsCreateExperimentProtocolRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public ExperimentsCreateExperimentProtocolRequestDataAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * Optional text that explains the protocol.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public ExperimentsCreateExperimentProtocolRequestDataAttributes migrationMetadata(
      Map<String, Object> migrationMetadata) {
    this.migrationMetadata = JsonNullable.<Map<String, Object>>of(migrationMetadata);
    return this;
  }

  public ExperimentsCreateExperimentProtocolRequestDataAttributes putMigrationMetadataItem(
      String key, Object migrationMetadataItem) {
    if (this.migrationMetadata == null || !this.migrationMetadata.isPresent()) {
      this.migrationMetadata = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.migrationMetadata.get().put(key, migrationMetadataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Metadata for imported resources. Must encode to at most 4096 bytes. Null clears it; omission
   * preserves it on update.
   *
   * @return migrationMetadata
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getMigrationMetadata() {
    return migrationMetadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIGRATION_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getMigrationMetadata_JsonNullable() {
    return migrationMetadata;
  }

  @JsonProperty(JSON_PROPERTY_MIGRATION_METADATA)
  public void setMigrationMetadata_JsonNullable(
      JsonNullable<Map<String, Object>> migrationMetadata) {
    this.migrationMetadata = migrationMetadata;
  }

  public void setMigrationMetadata(Map<String, Object> migrationMetadata) {
    this.migrationMetadata = JsonNullable.<Map<String, Object>>of(migrationMetadata);
  }

  public ExperimentsCreateExperimentProtocolRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Protocol name. Leading and trailing spaces are removed. The trimmed name must contain 1 to 255
   * characters.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * @return ExperimentsCreateExperimentProtocolRequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsCreateExperimentProtocolRequestDataAttributes putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this ExperimentsCreateExperimentProtocolRequestDataAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsCreateExperimentProtocolRequestDataAttributes
        experimentsCreateExperimentProtocolRequestDataAttributes =
            (ExperimentsCreateExperimentProtocolRequestDataAttributes) o;
    return Objects.equals(
            this.description, experimentsCreateExperimentProtocolRequestDataAttributes.description)
        && Objects.equals(
            this.migrationMetadata,
            experimentsCreateExperimentProtocolRequestDataAttributes.migrationMetadata)
        && Objects.equals(this.name, experimentsCreateExperimentProtocolRequestDataAttributes.name)
        && Objects.equals(
            this.additionalProperties,
            experimentsCreateExperimentProtocolRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, migrationMetadata, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsCreateExperimentProtocolRequestDataAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
