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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of a JavaScript source map file. */
@JsonPropertyOrder({
  SourcemapFileAttributes.JSON_PROPERTY_FILE,
  SourcemapFileAttributes.JSON_PROPERTY_MAPPINGS,
  SourcemapFileAttributes.JSON_PROPERTY_MINIFIED_LINE_LENGTHS,
  SourcemapFileAttributes.JSON_PROPERTY_NAMES,
  SourcemapFileAttributes.JSON_PROPERTY_SOURCE_ROOT,
  SourcemapFileAttributes.JSON_PROPERTY_SOURCES,
  SourcemapFileAttributes.JSON_PROPERTY_SOURCES_CONTENT,
  SourcemapFileAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SourcemapFileAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILE = "file";
  private String file;

  public static final String JSON_PROPERTY_MAPPINGS = "mappings";
  private String mappings;

  public static final String JSON_PROPERTY_MINIFIED_LINE_LENGTHS = "minifiedLineLengths";
  private List<Integer> minifiedLineLengths = new ArrayList<>();

  public static final String JSON_PROPERTY_NAMES = "names";
  private List<Object> names = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCE_ROOT = "sourceRoot";
  private String sourceRoot;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCES_CONTENT = "sourcesContent";
  private List<String> sourcesContent = new ArrayList<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SourcemapFileAttributes() {}

  @JsonCreator
  public SourcemapFileAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FILE) String file,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAPPINGS) String mappings,
      @JsonProperty(required = true, value = JSON_PROPERTY_MINIFIED_LINE_LENGTHS)
          List<Integer> minifiedLineLengths,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAMES) List<Object> names,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_ROOT) String sourceRoot,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES) List<String> sources,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES_CONTENT)
          List<String> sourcesContent,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.file = file;
    this.mappings = mappings;
    this.minifiedLineLengths = minifiedLineLengths;
    this.names = names;
    this.sourceRoot = sourceRoot;
    this.sources = sources;
    this.sourcesContent = sourcesContent;
    this.version = version;
  }

  public SourcemapFileAttributes file(String file) {
    this.file = file;
    return this;
  }

  /**
   * The name of the minified JavaScript file.
   *
   * @return file
   */
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public SourcemapFileAttributes mappings(String mappings) {
    this.mappings = mappings;
    return this;
  }

  /**
   * The Base64 VLQ encoded string that maps positions in the minified file to positions in the
   * original source files.
   *
   * @return mappings
   */
  @JsonProperty(JSON_PROPERTY_MAPPINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMappings() {
    return mappings;
  }

  public void setMappings(String mappings) {
    this.mappings = mappings;
  }

  public SourcemapFileAttributes minifiedLineLengths(List<Integer> minifiedLineLengths) {
    this.minifiedLineLengths = minifiedLineLengths;
    return this;
  }

  public SourcemapFileAttributes addMinifiedLineLengthsItem(Integer minifiedLineLengthsItem) {
    this.minifiedLineLengths.add(minifiedLineLengthsItem);
    return this;
  }

  /**
   * List of character counts for each line in the minified file.
   *
   * @return minifiedLineLengths
   */
  @JsonProperty(JSON_PROPERTY_MINIFIED_LINE_LENGTHS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Integer> getMinifiedLineLengths() {
    return minifiedLineLengths;
  }

  public void setMinifiedLineLengths(List<Integer> minifiedLineLengths) {
    this.minifiedLineLengths = minifiedLineLengths;
  }

  public SourcemapFileAttributes names(List<Object> names) {
    this.names = names;
    return this;
  }

  public SourcemapFileAttributes addNamesItem(Object namesItem) {
    this.names.add(namesItem);
    return this;
  }

  /**
   * List of symbol names referenced in the mappings.
   *
   * @return names
   */
  @JsonProperty(JSON_PROPERTY_NAMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Object> getNames() {
    return names;
  }

  public void setNames(List<Object> names) {
    this.names = names;
  }

  public SourcemapFileAttributes sourceRoot(String sourceRoot) {
    this.sourceRoot = sourceRoot;
    return this;
  }

  /**
   * The root path prepended to source file paths.
   *
   * @return sourceRoot
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_ROOT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSourceRoot() {
    return sourceRoot;
  }

  public void setSourceRoot(String sourceRoot) {
    this.sourceRoot = sourceRoot;
  }

  public SourcemapFileAttributes sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public SourcemapFileAttributes addSourcesItem(String sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * List of original source file paths.
   *
   * @return sources
   */
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSources() {
    return sources;
  }

  public void setSources(List<String> sources) {
    this.sources = sources;
  }

  public SourcemapFileAttributes sourcesContent(List<String> sourcesContent) {
    this.sourcesContent = sourcesContent;
    return this;
  }

  public SourcemapFileAttributes addSourcesContentItem(String sourcesContentItem) {
    this.sourcesContent.add(sourcesContentItem);
    return this;
  }

  /**
   * List of original source file contents corresponding to the paths in <code>sources</code>.
   *
   * @return sourcesContent
   */
  @JsonProperty(JSON_PROPERTY_SOURCES_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSourcesContent() {
    return sourcesContent;
  }

  public void setSourcesContent(List<String> sourcesContent) {
    this.sourcesContent = sourcesContent;
  }

  public SourcemapFileAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the source map format (typically 3).
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return SourcemapFileAttributes
   */
  @JsonAnySetter
  public SourcemapFileAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SourcemapFileAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourcemapFileAttributes sourcemapFileAttributes = (SourcemapFileAttributes) o;
    return Objects.equals(this.file, sourcemapFileAttributes.file)
        && Objects.equals(this.mappings, sourcemapFileAttributes.mappings)
        && Objects.equals(this.minifiedLineLengths, sourcemapFileAttributes.minifiedLineLengths)
        && Objects.equals(this.names, sourcemapFileAttributes.names)
        && Objects.equals(this.sourceRoot, sourcemapFileAttributes.sourceRoot)
        && Objects.equals(this.sources, sourcemapFileAttributes.sources)
        && Objects.equals(this.sourcesContent, sourcemapFileAttributes.sourcesContent)
        && Objects.equals(this.version, sourcemapFileAttributes.version)
        && Objects.equals(this.additionalProperties, sourcemapFileAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        file,
        mappings,
        minifiedLineLengths,
        names,
        sourceRoot,
        sources,
        sourcesContent,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourcemapFileAttributes {\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
    sb.append("    minifiedLineLengths: ")
        .append(toIndentedString(minifiedLineLengths))
        .append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    sourceRoot: ").append(toIndentedString(sourceRoot)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    sourcesContent: ").append(toIndentedString(sourcesContent)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
