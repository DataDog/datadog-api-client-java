/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Object containing information about the private location to create.</p>
 */
@JsonPropertyOrder({
  SyntheticsPrivateLocation.JSON_PROPERTY_DESCRIPTION,
  SyntheticsPrivateLocation.JSON_PROPERTY_ID,
  SyntheticsPrivateLocation.JSON_PROPERTY_METADATA,
  SyntheticsPrivateLocation.JSON_PROPERTY_NAME,
  SyntheticsPrivateLocation.JSON_PROPERTY_SECRETS,
  SyntheticsPrivateLocation.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsPrivateLocation {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private SyntheticsPrivateLocationMetadata metadata;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SECRETS = "secrets";
  private SyntheticsPrivateLocationSecrets secrets;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public SyntheticsPrivateLocation() {}

  @JsonCreator
  public SyntheticsPrivateLocation(
            @JsonProperty(required=true, value=JSON_PROPERTY_DESCRIPTION)String description,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_TAGS)List<String> tags) {
        this.description = description;
        this.name = name;
        this.tags = tags;
  }
  public SyntheticsPrivateLocation description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Description of the private location.</p>
   * @return description
  **/
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * <p>Unique identifier of the private location.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public SyntheticsPrivateLocation metadata(SyntheticsPrivateLocationMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * <p>Object containing metadata about the private location.</p>
   * @return metadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsPrivateLocationMetadata getMetadata() {
        return metadata;
      }
  public void setMetadata(SyntheticsPrivateLocationMetadata metadata) {
    this.metadata = metadata;
  }
  public SyntheticsPrivateLocation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the private location.</p>
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

  /**
   * <p>Secrets for the private location. Only present in the response when creating the private location.</p>
   * @return secrets
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SECRETS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsPrivateLocationSecrets getSecrets() {
        return secrets;
      }
  public SyntheticsPrivateLocation tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public SyntheticsPrivateLocation addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>Array of tags attached to the private location.</p>
   * @return tags
  **/
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * @return SyntheticsPrivateLocation
   */
  @JsonAnySetter
  public SyntheticsPrivateLocation putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsPrivateLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsPrivateLocation syntheticsPrivateLocation = (SyntheticsPrivateLocation) o;
    return Objects.equals(this.description, syntheticsPrivateLocation.description) && Objects.equals(this.id, syntheticsPrivateLocation.id) && Objects.equals(this.metadata, syntheticsPrivateLocation.metadata) && Objects.equals(this.name, syntheticsPrivateLocation.name) && Objects.equals(this.secrets, syntheticsPrivateLocation.secrets) && Objects.equals(this.tags, syntheticsPrivateLocation.tags) && Objects.equals(this.additionalProperties, syntheticsPrivateLocation.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,id,metadata,name,secrets,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsPrivateLocation {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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
