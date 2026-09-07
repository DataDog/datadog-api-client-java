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

/**
 * The attributes of an MCP SCA scan request, describing the libraries to scan and their context.
 */
@JsonPropertyOrder({
  McpScanRequestDataAttributes.JSON_PROPERTY_COMMIT_HASH,
  McpScanRequestDataAttributes.JSON_PROPERTY_LIBRARIES,
  McpScanRequestDataAttributes.JSON_PROPERTY_RESOURCE_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class McpScanRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMIT_HASH = "commit_hash";
  private String commitHash;

  public static final String JSON_PROPERTY_LIBRARIES = "libraries";
  private List<McpScanRequestDataAttributesLibrariesItems> libraries = new ArrayList<>();

  public static final String JSON_PROPERTY_RESOURCE_NAME = "resource_name";
  private String resourceName;

  public McpScanRequestDataAttributes() {}

  @JsonCreator
  public McpScanRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMMIT_HASH) String commitHash,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIBRARIES)
          List<McpScanRequestDataAttributesLibrariesItems> libraries,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_NAME) String resourceName) {
    this.commitHash = commitHash;
    this.libraries = libraries;
    for (McpScanRequestDataAttributesLibrariesItems item : libraries) {
      this.unparsed |= item.unparsed;
    }
    this.resourceName = resourceName;
  }

  public McpScanRequestDataAttributes commitHash(String commitHash) {
    this.commitHash = commitHash;
    return this;
  }

  /**
   * The commit hash of the source code being scanned.
   *
   * @return commitHash
   */
  @JsonProperty(JSON_PROPERTY_COMMIT_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCommitHash() {
    return commitHash;
  }

  public void setCommitHash(String commitHash) {
    this.commitHash = commitHash;
  }

  public McpScanRequestDataAttributes libraries(
      List<McpScanRequestDataAttributesLibrariesItems> libraries) {
    this.libraries = libraries;
    for (McpScanRequestDataAttributesLibrariesItems item : libraries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public McpScanRequestDataAttributes addLibrariesItem(
      McpScanRequestDataAttributesLibrariesItems librariesItem) {
    this.libraries.add(librariesItem);
    this.unparsed |= librariesItem.unparsed;
    return this;
  }

  /**
   * The list of libraries to scan for vulnerabilities.
   *
   * @return libraries
   */
  @JsonProperty(JSON_PROPERTY_LIBRARIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<McpScanRequestDataAttributesLibrariesItems> getLibraries() {
    return libraries;
  }

  public void setLibraries(List<McpScanRequestDataAttributesLibrariesItems> libraries) {
    this.libraries = libraries;
    if (libraries != null) {
      for (McpScanRequestDataAttributesLibrariesItems item : libraries) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public McpScanRequestDataAttributes resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The name of the resource (typically the repository or project name) being scanned.
   *
   * @return resourceName
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
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
   * @return McpScanRequestDataAttributes
   */
  @JsonAnySetter
  public McpScanRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this McpScanRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    McpScanRequestDataAttributes mcpScanRequestDataAttributes = (McpScanRequestDataAttributes) o;
    return Objects.equals(this.commitHash, mcpScanRequestDataAttributes.commitHash)
        && Objects.equals(this.libraries, mcpScanRequestDataAttributes.libraries)
        && Objects.equals(this.resourceName, mcpScanRequestDataAttributes.resourceName)
        && Objects.equals(
            this.additionalProperties, mcpScanRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitHash, libraries, resourceName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McpScanRequestDataAttributes {\n");
    sb.append("    commitHash: ").append(toIndentedString(commitHash)).append("\n");
    sb.append("    libraries: ").append(toIndentedString(libraries)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
