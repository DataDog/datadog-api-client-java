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
   * <p>Attributes for a container.</p>
 */
@JsonPropertyOrder({
  ContainerAttributes.JSON_PROPERTY_CONTAINER_ID,
  ContainerAttributes.JSON_PROPERTY_CREATED_AT,
  ContainerAttributes.JSON_PROPERTY_HOST,
  ContainerAttributes.JSON_PROPERTY_IMAGE_DIGEST,
  ContainerAttributes.JSON_PROPERTY_IMAGE_NAME,
  ContainerAttributes.JSON_PROPERTY_IMAGE_TAGS,
  ContainerAttributes.JSON_PROPERTY_NAME,
  ContainerAttributes.JSON_PROPERTY_STARTED_AT,
  ContainerAttributes.JSON_PROPERTY_STATE,
  ContainerAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ContainerAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTAINER_ID = "container_id";
  private String containerId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_IMAGE_DIGEST = "image_digest";
  private JsonNullable<String> imageDigest = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IMAGE_NAME = "image_name";
  private String imageName;

  public static final String JSON_PROPERTY_IMAGE_TAGS = "image_tags";
  private JsonNullable<List<String>> imageTags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private String startedAt;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public ContainerAttributes containerId(String containerId) {
    this.containerId = containerId;
    return this;
  }

  /**
   * <p>The ID of the container.</p>
   * @return containerId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONTAINER_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getContainerId() {
        return containerId;
      }
  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }
  public ContainerAttributes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Time the container was created.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  public ContainerAttributes host(String host) {
    this.host = host;
    return this;
  }

  /**
   * <p>Hostname of the host running the container.</p>
   * @return host
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHost() {
        return host;
      }
  public void setHost(String host) {
    this.host = host;
  }
  public ContainerAttributes imageDigest(String imageDigest) {
    this.imageDigest = JsonNullable.<String>of(imageDigest);
    return this;
  }

  /**
   * <p>Digest of the compressed image manifest.</p>
   * @return imageDigest
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getImageDigest() {
        return imageDigest.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_IMAGE_DIGEST)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getImageDigest_JsonNullable() {
    return imageDigest;
  }
  @JsonProperty(JSON_PROPERTY_IMAGE_DIGEST)public void setImageDigest_JsonNullable(JsonNullable<String> imageDigest) {
    this.imageDigest = imageDigest;
  }
  public void setImageDigest(String imageDigest) {
    this.imageDigest = JsonNullable.<String>of(imageDigest);
  }
  public ContainerAttributes imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

  /**
   * <p>Name of the associated container image.</p>
   * @return imageName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IMAGE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getImageName() {
        return imageName;
      }
  public void setImageName(String imageName) {
    this.imageName = imageName;
  }
  public ContainerAttributes imageTags(List<String> imageTags) {
    this.imageTags = JsonNullable.<List<String>>of(imageTags);
    return this;
  }
  public ContainerAttributes addImageTagsItem(String imageTagsItem) {
    if (this.imageTags == null || !this.imageTags.isPresent()) {
      this.imageTags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.imageTags.get().add(imageTagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>List of image tags associated with the container image.</p>
   * @return imageTags
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getImageTags() {
        return imageTags.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_IMAGE_TAGS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getImageTags_JsonNullable() {
    return imageTags;
  }
  @JsonProperty(JSON_PROPERTY_IMAGE_TAGS)public void setImageTags_JsonNullable(JsonNullable<List<String>> imageTags) {
    this.imageTags = imageTags;
  }
  public void setImageTags(List<String> imageTags) {
    this.imageTags = JsonNullable.<List<String>>of(imageTags);
  }
  public ContainerAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the container.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public ContainerAttributes startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * <p>Time the container was started.</p>
   * @return startedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STARTED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStartedAt() {
        return startedAt;
      }
  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }
  public ContainerAttributes state(String state) {
    this.state = state;
    return this;
  }

  /**
   * <p>State of the container. This depends on the container runtime.</p>
   * @return state
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getState() {
        return state;
      }
  public void setState(String state) {
    this.state = state;
  }
  public ContainerAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public ContainerAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>List of tags associated with the container.</p>
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
   * @return ContainerAttributes
   */
  @JsonAnySetter
  public ContainerAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ContainerAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerAttributes containerAttributes = (ContainerAttributes) o;
    return Objects.equals(this.containerId, containerAttributes.containerId) && Objects.equals(this.createdAt, containerAttributes.createdAt) && Objects.equals(this.host, containerAttributes.host) && Objects.equals(this.imageDigest, containerAttributes.imageDigest) && Objects.equals(this.imageName, containerAttributes.imageName) && Objects.equals(this.imageTags, containerAttributes.imageTags) && Objects.equals(this.name, containerAttributes.name) && Objects.equals(this.startedAt, containerAttributes.startedAt) && Objects.equals(this.state, containerAttributes.state) && Objects.equals(this.tags, containerAttributes.tags) && Objects.equals(this.additionalProperties, containerAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(containerId,createdAt,host,imageDigest,imageName,imageTags,name,startedAt,state,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerAttributes {\n");
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    imageDigest: ").append(toIndentedString(imageDigest)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    imageTags: ").append(toIndentedString(imageTags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
