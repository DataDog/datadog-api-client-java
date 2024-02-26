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

/** Attributes for a Container Image. */
@JsonPropertyOrder({
  ContainerImageAttributes.JSON_PROPERTY_CONTAINER_COUNT,
  ContainerImageAttributes.JSON_PROPERTY_IMAGE_FLAVORS,
  ContainerImageAttributes.JSON_PROPERTY_IMAGE_TAGS,
  ContainerImageAttributes.JSON_PROPERTY_IMAGES_BUILT_AT,
  ContainerImageAttributes.JSON_PROPERTY_NAME,
  ContainerImageAttributes.JSON_PROPERTY_OS_ARCHITECTURES,
  ContainerImageAttributes.JSON_PROPERTY_OS_NAMES,
  ContainerImageAttributes.JSON_PROPERTY_OS_VERSIONS,
  ContainerImageAttributes.JSON_PROPERTY_PUBLISHED_AT,
  ContainerImageAttributes.JSON_PROPERTY_REGISTRY,
  ContainerImageAttributes.JSON_PROPERTY_REPO_DIGEST,
  ContainerImageAttributes.JSON_PROPERTY_REPOSITORY,
  ContainerImageAttributes.JSON_PROPERTY_SHORT_IMAGE,
  ContainerImageAttributes.JSON_PROPERTY_SIZES,
  ContainerImageAttributes.JSON_PROPERTY_SOURCES,
  ContainerImageAttributes.JSON_PROPERTY_TAGS,
  ContainerImageAttributes.JSON_PROPERTY_VULNERABILITY_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ContainerImageAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTAINER_COUNT = "container_count";
  private Long containerCount;

  public static final String JSON_PROPERTY_IMAGE_FLAVORS = "image_flavors";
  private List<ContainerImageFlavor> imageFlavors = null;

  public static final String JSON_PROPERTY_IMAGE_TAGS = "image_tags";
  private List<String> imageTags = null;

  public static final String JSON_PROPERTY_IMAGES_BUILT_AT = "images_built_at";
  private List<String> imagesBuiltAt = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OS_ARCHITECTURES = "os_architectures";
  private List<String> osArchitectures = null;

  public static final String JSON_PROPERTY_OS_NAMES = "os_names";
  private List<String> osNames = null;

  public static final String JSON_PROPERTY_OS_VERSIONS = "os_versions";
  private List<String> osVersions = null;

  public static final String JSON_PROPERTY_PUBLISHED_AT = "published_at";
  private String publishedAt;

  public static final String JSON_PROPERTY_REGISTRY = "registry";
  private String registry;

  public static final String JSON_PROPERTY_REPO_DIGEST = "repo_digest";
  private String repoDigest;

  public static final String JSON_PROPERTY_REPOSITORY = "repository";
  private String repository;

  public static final String JSON_PROPERTY_SHORT_IMAGE = "short_image";
  private String shortImage;

  public static final String JSON_PROPERTY_SIZES = "sizes";
  private List<Long> sizes = null;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_VULNERABILITY_COUNT = "vulnerability_count";
  private ContainerImageVulnerabilities vulnerabilityCount;

  public ContainerImageAttributes containerCount(Long containerCount) {
    this.containerCount = containerCount;
    return this;
  }

  /**
   * Number of containers running the image.
   *
   * @return containerCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getContainerCount() {
    return containerCount;
  }

  public void setContainerCount(Long containerCount) {
    this.containerCount = containerCount;
  }

  public ContainerImageAttributes imageFlavors(List<ContainerImageFlavor> imageFlavors) {
    this.imageFlavors = imageFlavors;
    for (ContainerImageFlavor item : imageFlavors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ContainerImageAttributes addImageFlavorsItem(ContainerImageFlavor imageFlavorsItem) {
    if (this.imageFlavors == null) {
      this.imageFlavors = new ArrayList<>();
    }
    this.imageFlavors.add(imageFlavorsItem);
    this.unparsed |= imageFlavorsItem.unparsed;
    return this;
  }

  /**
   * List of platform-specific images associated with the image record. The list contains more than
   * 1 entry for multi-architecture images.
   *
   * @return imageFlavors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_FLAVORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ContainerImageFlavor> getImageFlavors() {
    return imageFlavors;
  }

  public void setImageFlavors(List<ContainerImageFlavor> imageFlavors) {
    this.imageFlavors = imageFlavors;
  }

  public ContainerImageAttributes imageTags(List<String> imageTags) {
    this.imageTags = imageTags;
    return this;
  }

  public ContainerImageAttributes addImageTagsItem(String imageTagsItem) {
    if (this.imageTags == null) {
      this.imageTags = new ArrayList<>();
    }
    this.imageTags.add(imageTagsItem);
    return this;
  }

  /**
   * List of image tags associated with the Container Image.
   *
   * @return imageTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getImageTags() {
    return imageTags;
  }

  public void setImageTags(List<String> imageTags) {
    this.imageTags = imageTags;
  }

  public ContainerImageAttributes imagesBuiltAt(List<String> imagesBuiltAt) {
    this.imagesBuiltAt = imagesBuiltAt;
    return this;
  }

  public ContainerImageAttributes addImagesBuiltAtItem(String imagesBuiltAtItem) {
    if (this.imagesBuiltAt == null) {
      this.imagesBuiltAt = new ArrayList<>();
    }
    this.imagesBuiltAt.add(imagesBuiltAtItem);
    return this;
  }

  /**
   * List of build times associated with the Container Image. The list contains more than 1 entry
   * for multi-architecture images.
   *
   * @return imagesBuiltAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGES_BUILT_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getImagesBuiltAt() {
    return imagesBuiltAt;
  }

  public void setImagesBuiltAt(List<String> imagesBuiltAt) {
    this.imagesBuiltAt = imagesBuiltAt;
  }

  public ContainerImageAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Container Image.
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

  public ContainerImageAttributes osArchitectures(List<String> osArchitectures) {
    this.osArchitectures = osArchitectures;
    return this;
  }

  public ContainerImageAttributes addOsArchitecturesItem(String osArchitecturesItem) {
    if (this.osArchitectures == null) {
      this.osArchitectures = new ArrayList<>();
    }
    this.osArchitectures.add(osArchitecturesItem);
    return this;
  }

  /**
   * List of Operating System architectures supported by the Container Image.
   *
   * @return osArchitectures
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_ARCHITECTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getOsArchitectures() {
    return osArchitectures;
  }

  public void setOsArchitectures(List<String> osArchitectures) {
    this.osArchitectures = osArchitectures;
  }

  public ContainerImageAttributes osNames(List<String> osNames) {
    this.osNames = osNames;
    return this;
  }

  public ContainerImageAttributes addOsNamesItem(String osNamesItem) {
    if (this.osNames == null) {
      this.osNames = new ArrayList<>();
    }
    this.osNames.add(osNamesItem);
    return this;
  }

  /**
   * List of Operating System names supported by the Container Image.
   *
   * @return osNames
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getOsNames() {
    return osNames;
  }

  public void setOsNames(List<String> osNames) {
    this.osNames = osNames;
  }

  public ContainerImageAttributes osVersions(List<String> osVersions) {
    this.osVersions = osVersions;
    return this;
  }

  public ContainerImageAttributes addOsVersionsItem(String osVersionsItem) {
    if (this.osVersions == null) {
      this.osVersions = new ArrayList<>();
    }
    this.osVersions.add(osVersionsItem);
    return this;
  }

  /**
   * List of Operating System versions supported by the Container Image.
   *
   * @return osVersions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getOsVersions() {
    return osVersions;
  }

  public void setOsVersions(List<String> osVersions) {
    this.osVersions = osVersions;
  }

  public ContainerImageAttributes publishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * Time the image was pushed to the container registry.
   *
   * @return publishedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }

  public ContainerImageAttributes registry(String registry) {
    this.registry = registry;
    return this;
  }

  /**
   * Registry the Container Image was pushed to.
   *
   * @return registry
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGISTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRegistry() {
    return registry;
  }

  public void setRegistry(String registry) {
    this.registry = registry;
  }

  public ContainerImageAttributes repoDigest(String repoDigest) {
    this.repoDigest = repoDigest;
    return this;
  }

  /**
   * Digest of the compressed image manifest.
   *
   * @return repoDigest
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPO_DIGEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRepoDigest() {
    return repoDigest;
  }

  public void setRepoDigest(String repoDigest) {
    this.repoDigest = repoDigest;
  }

  public ContainerImageAttributes repository(String repository) {
    this.repository = repository;
    return this;
  }

  /**
   * Repository where the Container Image is stored in.
   *
   * @return repository
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }

  public ContainerImageAttributes shortImage(String shortImage) {
    this.shortImage = shortImage;
    return this;
  }

  /**
   * Short version of the Container Image name.
   *
   * @return shortImage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShortImage() {
    return shortImage;
  }

  public void setShortImage(String shortImage) {
    this.shortImage = shortImage;
  }

  public ContainerImageAttributes sizes(List<Long> sizes) {
    this.sizes = sizes;
    return this;
  }

  public ContainerImageAttributes addSizesItem(Long sizesItem) {
    if (this.sizes == null) {
      this.sizes = new ArrayList<>();
    }
    this.sizes.add(sizesItem);
    return this;
  }

  /**
   * List of size for each platform-specific image associated with the image record. The list
   * contains more than 1 entry for multi-architecture images.
   *
   * @return sizes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getSizes() {
    return sizes;
  }

  public void setSizes(List<Long> sizes) {
    this.sizes = sizes;
  }

  public ContainerImageAttributes sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public ContainerImageAttributes addSourcesItem(String sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * List of sources where the Container Image was collected from.
   *
   * @return sources
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getSources() {
    return sources;
  }

  public void setSources(List<String> sources) {
    this.sources = sources;
  }

  public ContainerImageAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ContainerImageAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tags associated with the Container Image.
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

  public ContainerImageAttributes vulnerabilityCount(
      ContainerImageVulnerabilities vulnerabilityCount) {
    this.vulnerabilityCount = vulnerabilityCount;
    this.unparsed |= vulnerabilityCount.unparsed;
    return this;
  }

  /**
   * Vulnerability counts associated with the Container Image.
   *
   * @return vulnerabilityCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VULNERABILITY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ContainerImageVulnerabilities getVulnerabilityCount() {
    return vulnerabilityCount;
  }

  public void setVulnerabilityCount(ContainerImageVulnerabilities vulnerabilityCount) {
    this.vulnerabilityCount = vulnerabilityCount;
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
   * @return ContainerImageAttributes
   */
  @JsonAnySetter
  public ContainerImageAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ContainerImageAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerImageAttributes containerImageAttributes = (ContainerImageAttributes) o;
    return Objects.equals(this.containerCount, containerImageAttributes.containerCount)
        && Objects.equals(this.imageFlavors, containerImageAttributes.imageFlavors)
        && Objects.equals(this.imageTags, containerImageAttributes.imageTags)
        && Objects.equals(this.imagesBuiltAt, containerImageAttributes.imagesBuiltAt)
        && Objects.equals(this.name, containerImageAttributes.name)
        && Objects.equals(this.osArchitectures, containerImageAttributes.osArchitectures)
        && Objects.equals(this.osNames, containerImageAttributes.osNames)
        && Objects.equals(this.osVersions, containerImageAttributes.osVersions)
        && Objects.equals(this.publishedAt, containerImageAttributes.publishedAt)
        && Objects.equals(this.registry, containerImageAttributes.registry)
        && Objects.equals(this.repoDigest, containerImageAttributes.repoDigest)
        && Objects.equals(this.repository, containerImageAttributes.repository)
        && Objects.equals(this.shortImage, containerImageAttributes.shortImage)
        && Objects.equals(this.sizes, containerImageAttributes.sizes)
        && Objects.equals(this.sources, containerImageAttributes.sources)
        && Objects.equals(this.tags, containerImageAttributes.tags)
        && Objects.equals(this.vulnerabilityCount, containerImageAttributes.vulnerabilityCount)
        && Objects.equals(this.additionalProperties, containerImageAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        containerCount,
        imageFlavors,
        imageTags,
        imagesBuiltAt,
        name,
        osArchitectures,
        osNames,
        osVersions,
        publishedAt,
        registry,
        repoDigest,
        repository,
        shortImage,
        sizes,
        sources,
        tags,
        vulnerabilityCount,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerImageAttributes {\n");
    sb.append("    containerCount: ").append(toIndentedString(containerCount)).append("\n");
    sb.append("    imageFlavors: ").append(toIndentedString(imageFlavors)).append("\n");
    sb.append("    imageTags: ").append(toIndentedString(imageTags)).append("\n");
    sb.append("    imagesBuiltAt: ").append(toIndentedString(imagesBuiltAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    osArchitectures: ").append(toIndentedString(osArchitectures)).append("\n");
    sb.append("    osNames: ").append(toIndentedString(osNames)).append("\n");
    sb.append("    osVersions: ").append(toIndentedString(osVersions)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    repoDigest: ").append(toIndentedString(repoDigest)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    shortImage: ").append(toIndentedString(shortImage)).append("\n");
    sb.append("    sizes: ").append(toIndentedString(sizes)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    vulnerabilityCount: ").append(toIndentedString(vulnerabilityCount)).append("\n");
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
