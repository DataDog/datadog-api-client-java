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

/** A library declaration to include in the dependency scan. */
@JsonPropertyOrder({
  McpScanRequestDataAttributesLibrariesItems.JSON_PROPERTY_EXCLUSIONS,
  McpScanRequestDataAttributesLibrariesItems.JSON_PROPERTY_IS_DEV,
  McpScanRequestDataAttributesLibrariesItems.JSON_PROPERTY_IS_DIRECT,
  McpScanRequestDataAttributesLibrariesItems.JSON_PROPERTY_PACKAGE_MANAGER,
  McpScanRequestDataAttributesLibrariesItems.JSON_PROPERTY_PURL,
  McpScanRequestDataAttributesLibrariesItems.JSON_PROPERTY_TARGET_FRAMEWORKS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class McpScanRequestDataAttributesLibrariesItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXCLUSIONS = "exclusions";
  private List<String> exclusions = null;

  public static final String JSON_PROPERTY_IS_DEV = "is_dev";
  private Boolean isDev;

  public static final String JSON_PROPERTY_IS_DIRECT = "is_direct";
  private Boolean isDirect;

  public static final String JSON_PROPERTY_PACKAGE_MANAGER = "package_manager";
  private String packageManager;

  public static final String JSON_PROPERTY_PURL = "purl";
  private String purl;

  public static final String JSON_PROPERTY_TARGET_FRAMEWORKS = "target_frameworks";
  private List<String> targetFrameworks = null;

  public McpScanRequestDataAttributesLibrariesItems() {}

  @JsonCreator
  public McpScanRequestDataAttributesLibrariesItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_DEV) Boolean isDev,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_DIRECT) Boolean isDirect,
      @JsonProperty(required = true, value = JSON_PROPERTY_PACKAGE_MANAGER) String packageManager,
      @JsonProperty(required = true, value = JSON_PROPERTY_PURL) String purl) {
    this.isDev = isDev;
    this.isDirect = isDirect;
    this.packageManager = packageManager;
    this.purl = purl;
  }

  public McpScanRequestDataAttributesLibrariesItems exclusions(List<String> exclusions) {
    this.exclusions = exclusions;
    return this;
  }

  public McpScanRequestDataAttributesLibrariesItems addExclusionsItem(String exclusionsItem) {
    if (this.exclusions == null) {
      this.exclusions = new ArrayList<>();
    }
    this.exclusions.add(exclusionsItem);
    return this;
  }

  /**
   * The list of dependency PURLs to exclude when resolving transitive dependencies for this
   * library.
   *
   * @return exclusions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExclusions() {
    return exclusions;
  }

  public void setExclusions(List<String> exclusions) {
    this.exclusions = exclusions;
  }

  public McpScanRequestDataAttributesLibrariesItems isDev(Boolean isDev) {
    this.isDev = isDev;
    return this;
  }

  /**
   * Whether this library is a development-only dependency.
   *
   * @return isDev
   */
  @JsonProperty(JSON_PROPERTY_IS_DEV)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsDev() {
    return isDev;
  }

  public void setIsDev(Boolean isDev) {
    this.isDev = isDev;
  }

  public McpScanRequestDataAttributesLibrariesItems isDirect(Boolean isDirect) {
    this.isDirect = isDirect;
    return this;
  }

  /**
   * Whether this library is a direct (rather than transitive) dependency.
   *
   * @return isDirect
   */
  @JsonProperty(JSON_PROPERTY_IS_DIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsDirect() {
    return isDirect;
  }

  public void setIsDirect(Boolean isDirect) {
    this.isDirect = isDirect;
  }

  public McpScanRequestDataAttributesLibrariesItems packageManager(String packageManager) {
    this.packageManager = packageManager;
    return this;
  }

  /**
   * The package manager that produced this library entry (for example, <code>npm</code>, <code>pip
   * </code>, <code>nuget</code>).
   *
   * @return packageManager
   */
  @JsonProperty(JSON_PROPERTY_PACKAGE_MANAGER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPackageManager() {
    return packageManager;
  }

  public void setPackageManager(String packageManager) {
    this.packageManager = packageManager;
  }

  public McpScanRequestDataAttributesLibrariesItems purl(String purl) {
    this.purl = purl;
    return this;
  }

  /**
   * The Package URL (PURL) uniquely identifying the library and its version.
   *
   * @return purl
   */
  @JsonProperty(JSON_PROPERTY_PURL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPurl() {
    return purl;
  }

  public void setPurl(String purl) {
    this.purl = purl;
  }

  public McpScanRequestDataAttributesLibrariesItems targetFrameworks(
      List<String> targetFrameworks) {
    this.targetFrameworks = targetFrameworks;
    return this;
  }

  public McpScanRequestDataAttributesLibrariesItems addTargetFrameworksItem(
      String targetFrameworksItem) {
    if (this.targetFrameworks == null) {
      this.targetFrameworks = new ArrayList<>();
    }
    this.targetFrameworks.add(targetFrameworksItem);
    return this;
  }

  /**
   * The list of target framework identifiers associated with the library.
   *
   * @return targetFrameworks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_FRAMEWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTargetFrameworks() {
    return targetFrameworks;
  }

  public void setTargetFrameworks(List<String> targetFrameworks) {
    this.targetFrameworks = targetFrameworks;
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
   * @return McpScanRequestDataAttributesLibrariesItems
   */
  @JsonAnySetter
  public McpScanRequestDataAttributesLibrariesItems putAdditionalProperty(
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

  /** Return true if this McpScanRequestDataAttributesLibrariesItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    McpScanRequestDataAttributesLibrariesItems mcpScanRequestDataAttributesLibrariesItems =
        (McpScanRequestDataAttributesLibrariesItems) o;
    return Objects.equals(this.exclusions, mcpScanRequestDataAttributesLibrariesItems.exclusions)
        && Objects.equals(this.isDev, mcpScanRequestDataAttributesLibrariesItems.isDev)
        && Objects.equals(this.isDirect, mcpScanRequestDataAttributesLibrariesItems.isDirect)
        && Objects.equals(
            this.packageManager, mcpScanRequestDataAttributesLibrariesItems.packageManager)
        && Objects.equals(this.purl, mcpScanRequestDataAttributesLibrariesItems.purl)
        && Objects.equals(
            this.targetFrameworks, mcpScanRequestDataAttributesLibrariesItems.targetFrameworks)
        && Objects.equals(
            this.additionalProperties,
            mcpScanRequestDataAttributesLibrariesItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        exclusions, isDev, isDirect, packageManager, purl, targetFrameworks, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McpScanRequestDataAttributesLibrariesItems {\n");
    sb.append("    exclusions: ").append(toIndentedString(exclusions)).append("\n");
    sb.append("    isDev: ").append(toIndentedString(isDev)).append("\n");
    sb.append("    isDirect: ").append(toIndentedString(isDirect)).append("\n");
    sb.append("    packageManager: ").append(toIndentedString(packageManager)).append("\n");
    sb.append("    purl: ").append(toIndentedString(purl)).append("\n");
    sb.append("    targetFrameworks: ").append(toIndentedString(targetFrameworks)).append("\n");
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
