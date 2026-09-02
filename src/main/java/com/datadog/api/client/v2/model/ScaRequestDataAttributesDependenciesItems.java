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
   * <p>A dependency found in the repository, including its identity, location, and reachability metadata.</p>
 */
@JsonPropertyOrder({
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_EXCLUSIONS,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_GROUP,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_IS_DEV,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_IS_DIRECT,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_LANGUAGE,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_LOCATIONS,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_NAME,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_OPAQUE,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_PACKAGE_MANAGER,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_PURL,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_REACHABLE_SYMBOL_PROPERTIES,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_REQUIRES_TRANSITIVE_ENRICHMENT,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_TARGET_FRAMEWORKS,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_VERSION,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_VERSION_CONSTRAINT,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_VERSION_RANGE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScaRequestDataAttributesDependenciesItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXCLUSIONS = "exclusions";
  private List<String> exclusions = null;

  public static final String JSON_PROPERTY_GROUP = "group";
  private JsonNullable<String> group = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_DEV = "is_dev";
  private Boolean isDev;

  public static final String JSON_PROPERTY_IS_DIRECT = "is_direct";
  private JsonNullable<Boolean> isDirect = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private JsonNullable<List<ScaRequestDataAttributesDependenciesItemsLocationsItems>> locations = JsonNullable.<List<ScaRequestDataAttributesDependenciesItemsLocationsItems>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPAQUE = "opaque";
  private Boolean opaque;

  public static final String JSON_PROPERTY_PACKAGE_MANAGER = "package_manager";
  private String packageManager;

  public static final String JSON_PROPERTY_PURL = "purl";
  private String purl;

  public static final String JSON_PROPERTY_REACHABLE_SYMBOL_PROPERTIES = "reachable_symbol_properties";
  private List<ScaRequestDataAttributesDependenciesItemsReachableSymbolPropertiesItems> reachableSymbolProperties = null;

  public static final String JSON_PROPERTY_REQUIRES_TRANSITIVE_ENRICHMENT = "requires_transitive_enrichment";
  private Boolean requiresTransitiveEnrichment;

  public static final String JSON_PROPERTY_TARGET_FRAMEWORKS = "target_frameworks";
  private List<String> targetFrameworks = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  private JsonNullable<String> version = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERSION_CONSTRAINT = "version_constraint";
  private Boolean versionConstraint;

  public static final String JSON_PROPERTY_VERSION_RANGE = "version_range";
  private String versionRange;

  public ScaRequestDataAttributesDependenciesItems exclusions(List<String> exclusions) {
    this.exclusions = exclusions;
    return this;
  }
  public ScaRequestDataAttributesDependenciesItems addExclusionsItem(String exclusionsItem) {
    if (this.exclusions == null) {
      this.exclusions = new ArrayList<>();
    }
    this.exclusions.add(exclusionsItem);
    return this;
  }

  /**
   * <p>A list of patterns or identifiers that should be excluded from analysis for this dependency.</p>
   * @return exclusions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXCLUSIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getExclusions() {
        return exclusions;
      }
  public void setExclusions(List<String> exclusions) {
    this.exclusions = exclusions;
  }
  public ScaRequestDataAttributesDependenciesItems group(String group) {
    this.group = JsonNullable.<String>of(group);
    return this;
  }

  /**
   * <p>The group or organization namespace of the dependency (e.g., Maven group ID).</p>
   * @return group
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getGroup() {
        return group.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getGroup_JsonNullable() {
    return group;
  }
  @JsonProperty(JSON_PROPERTY_GROUP)public void setGroup_JsonNullable(JsonNullable<String> group) {
    this.group = group;
  }
  public void setGroup(String group) {
    this.group = JsonNullable.<String>of(group);
  }
  public ScaRequestDataAttributesDependenciesItems isDev(Boolean isDev) {
    this.isDev = isDev;
    return this;
  }

  /**
   * <p>Indicates whether this is a development-only dependency not used in production.</p>
   * @return isDev
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_DEV)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsDev() {
        return isDev;
      }
  public void setIsDev(Boolean isDev) {
    this.isDev = isDev;
  }
  public ScaRequestDataAttributesDependenciesItems isDirect(Boolean isDirect) {
    this.isDirect = JsonNullable.<Boolean>of(isDirect);
    return this;
  }

  /**
   * <p>Indicates whether this is a direct dependency (as opposed to a transitive one).</p>
   * @return isDirect
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Boolean getIsDirect() {
        return isDirect.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_IS_DIRECT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsDirect_JsonNullable() {
    return isDirect;
  }
  @JsonProperty(JSON_PROPERTY_IS_DIRECT)public void setIsDirect_JsonNullable(JsonNullable<Boolean> isDirect) {
    this.isDirect = isDirect;
  }
  public void setIsDirect(Boolean isDirect) {
    this.isDirect = JsonNullable.<Boolean>of(isDirect);
  }
  public ScaRequestDataAttributesDependenciesItems language(String language) {
    this.language = language;
    return this;
  }

  /**
   * <p>The programming language ecosystem of this dependency (e.g., java, python, javascript).</p>
   * @return language
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LANGUAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLanguage() {
        return language;
      }
  public void setLanguage(String language) {
    this.language = language;
  }
  public ScaRequestDataAttributesDependenciesItems locations(List<ScaRequestDataAttributesDependenciesItemsLocationsItems> locations) {
    this.locations = JsonNullable.<List<ScaRequestDataAttributesDependenciesItemsLocationsItems>>of(locations);
    return this;
  }
  public ScaRequestDataAttributesDependenciesItems addLocationsItem(ScaRequestDataAttributesDependenciesItemsLocationsItems locationsItem) {
    if (this.locations == null || !this.locations.isPresent()) {
      this.locations = JsonNullable.<List<ScaRequestDataAttributesDependenciesItemsLocationsItems>>of(new ArrayList<>());
    }
    try {
      this.locations.get().add(locationsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>The list of source file locations where this dependency is declared.</p>
   * @return locations
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<ScaRequestDataAttributesDependenciesItemsLocationsItems> getLocations() {
        return locations.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<ScaRequestDataAttributesDependenciesItemsLocationsItems>> getLocations_JsonNullable() {
    return locations;
  }
  @JsonProperty(JSON_PROPERTY_LOCATIONS)public void setLocations_JsonNullable(JsonNullable<List<ScaRequestDataAttributesDependenciesItemsLocationsItems>> locations) {
    this.locations = locations;
  }
  public void setLocations(List<ScaRequestDataAttributesDependenciesItemsLocationsItems> locations) {
    this.locations = JsonNullable.<List<ScaRequestDataAttributesDependenciesItemsLocationsItems>>of(locations);
  }
  public ScaRequestDataAttributesDependenciesItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the dependency package.</p>
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
  public ScaRequestDataAttributesDependenciesItems opaque(Boolean opaque) {
    this.opaque = opaque;
    return this;
  }

  /**
   * <p>Indicates whether dependency details are intentionally opaque.</p>
   * @return opaque
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPAQUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getOpaque() {
        return opaque;
      }
  public void setOpaque(Boolean opaque) {
    this.opaque = opaque;
  }
  public ScaRequestDataAttributesDependenciesItems packageManager(String packageManager) {
    this.packageManager = packageManager;
    return this;
  }

  /**
   * <p>The package manager responsible for this dependency (e.g., maven, pip, npm).</p>
   * @return packageManager
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PACKAGE_MANAGER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPackageManager() {
        return packageManager;
      }
  public void setPackageManager(String packageManager) {
    this.packageManager = packageManager;
  }
  public ScaRequestDataAttributesDependenciesItems purl(String purl) {
    this.purl = purl;
    return this;
  }

  /**
   * <p>The Package URL (PURL) uniquely identifying this dependency.</p>
   * @return purl
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PURL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPurl() {
        return purl;
      }
  public void setPurl(String purl) {
    this.purl = purl;
  }
  public ScaRequestDataAttributesDependenciesItems reachableSymbolProperties(List<ScaRequestDataAttributesDependenciesItemsReachableSymbolPropertiesItems> reachableSymbolProperties) {
    this.reachableSymbolProperties = reachableSymbolProperties;
    if (reachableSymbolProperties != null) {
    for (ScaRequestDataAttributesDependenciesItemsReachableSymbolPropertiesItems item : reachableSymbolProperties) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public ScaRequestDataAttributesDependenciesItems addReachableSymbolPropertiesItem(ScaRequestDataAttributesDependenciesItemsReachableSymbolPropertiesItems reachableSymbolPropertiesItem) {
    if (this.reachableSymbolProperties == null) {
      this.reachableSymbolProperties = new ArrayList<>();
    }
    this.reachableSymbolProperties.add(reachableSymbolPropertiesItem);
    this.unparsed |= reachableSymbolPropertiesItem.unparsed;
    return this;
  }

  /**
   * <p>Properties describing symbols from this dependency that are reachable in the application code.</p>
   * @return reachableSymbolProperties
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REACHABLE_SYMBOL_PROPERTIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ScaRequestDataAttributesDependenciesItemsReachableSymbolPropertiesItems> getReachableSymbolProperties() {
        return reachableSymbolProperties;
      }
  public void setReachableSymbolProperties(List<ScaRequestDataAttributesDependenciesItemsReachableSymbolPropertiesItems> reachableSymbolProperties) {
    this.reachableSymbolProperties = reachableSymbolProperties;
    if (reachableSymbolProperties != null) {
      for (ScaRequestDataAttributesDependenciesItemsReachableSymbolPropertiesItems item : reachableSymbolProperties) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public ScaRequestDataAttributesDependenciesItems requiresTransitiveEnrichment(Boolean requiresTransitiveEnrichment) {
    this.requiresTransitiveEnrichment = requiresTransitiveEnrichment;
    return this;
  }

  /**
   * <p>Indicates whether this dependency requires transitive dependency enrichment.</p>
   * @return requiresTransitiveEnrichment
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REQUIRES_TRANSITIVE_ENRICHMENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getRequiresTransitiveEnrichment() {
        return requiresTransitiveEnrichment;
      }
  public void setRequiresTransitiveEnrichment(Boolean requiresTransitiveEnrichment) {
    this.requiresTransitiveEnrichment = requiresTransitiveEnrichment;
  }
  public ScaRequestDataAttributesDependenciesItems targetFrameworks(List<String> targetFrameworks) {
    this.targetFrameworks = targetFrameworks;
    return this;
  }
  public ScaRequestDataAttributesDependenciesItems addTargetFrameworksItem(String targetFrameworksItem) {
    if (this.targetFrameworks == null) {
      this.targetFrameworks = new ArrayList<>();
    }
    this.targetFrameworks.add(targetFrameworksItem);
    return this;
  }

  /**
   * <p>The target framework identifiers associated with this dependency.</p>
   * @return targetFrameworks
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TARGET_FRAMEWORKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTargetFrameworks() {
        return targetFrameworks;
      }
  public void setTargetFrameworks(List<String> targetFrameworks) {
    this.targetFrameworks = targetFrameworks;
  }
  public ScaRequestDataAttributesDependenciesItems version(String version) {
    this.version = JsonNullable.<String>of(version);
    return this;
  }

  /**
   * <p>The version of the dependency.</p>
   * @return version
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getVersion() {
        return version.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getVersion_JsonNullable() {
    return version;
  }
  @JsonProperty(JSON_PROPERTY_VERSION)public void setVersion_JsonNullable(JsonNullable<String> version) {
    this.version = version;
  }
  public void setVersion(String version) {
    this.version = JsonNullable.<String>of(version);
  }
  public ScaRequestDataAttributesDependenciesItems versionConstraint(Boolean versionConstraint) {
    this.versionConstraint = versionConstraint;
    return this;
  }

  /**
   * <p>Indicates whether the version value represents a version constraint.</p>
   * @return versionConstraint
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSION_CONSTRAINT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getVersionConstraint() {
        return versionConstraint;
      }
  public void setVersionConstraint(Boolean versionConstraint) {
    this.versionConstraint = versionConstraint;
  }
  public ScaRequestDataAttributesDependenciesItems versionRange(String versionRange) {
    this.versionRange = versionRange;
    return this;
  }

  /**
   * <p>The version range associated with this dependency when a manifest declares a range.</p>
   * @return versionRange
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSION_RANGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getVersionRange() {
        return versionRange;
      }
  public void setVersionRange(String versionRange) {
    this.versionRange = versionRange;
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
   * @return ScaRequestDataAttributesDependenciesItems
   */
  @JsonAnySetter
  public ScaRequestDataAttributesDependenciesItems putAdditionalProperty(String key, Object value) {
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
   * Return true if this ScaRequestDataAttributesDependenciesItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaRequestDataAttributesDependenciesItems scaRequestDataAttributesDependenciesItems = (ScaRequestDataAttributesDependenciesItems) o;
    return Objects.equals(this.exclusions, scaRequestDataAttributesDependenciesItems.exclusions) && Objects.equals(this.group, scaRequestDataAttributesDependenciesItems.group) && Objects.equals(this.isDev, scaRequestDataAttributesDependenciesItems.isDev) && Objects.equals(this.isDirect, scaRequestDataAttributesDependenciesItems.isDirect) && Objects.equals(this.language, scaRequestDataAttributesDependenciesItems.language) && Objects.equals(this.locations, scaRequestDataAttributesDependenciesItems.locations) && Objects.equals(this.name, scaRequestDataAttributesDependenciesItems.name) && Objects.equals(this.opaque, scaRequestDataAttributesDependenciesItems.opaque) && Objects.equals(this.packageManager, scaRequestDataAttributesDependenciesItems.packageManager) && Objects.equals(this.purl, scaRequestDataAttributesDependenciesItems.purl) && Objects.equals(this.reachableSymbolProperties, scaRequestDataAttributesDependenciesItems.reachableSymbolProperties) && Objects.equals(this.requiresTransitiveEnrichment, scaRequestDataAttributesDependenciesItems.requiresTransitiveEnrichment) && Objects.equals(this.targetFrameworks, scaRequestDataAttributesDependenciesItems.targetFrameworks) && Objects.equals(this.version, scaRequestDataAttributesDependenciesItems.version) && Objects.equals(this.versionConstraint, scaRequestDataAttributesDependenciesItems.versionConstraint) && Objects.equals(this.versionRange, scaRequestDataAttributesDependenciesItems.versionRange) && Objects.equals(this.additionalProperties, scaRequestDataAttributesDependenciesItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(exclusions,group,isDev,isDirect,language,locations,name,opaque,packageManager,purl,reachableSymbolProperties,requiresTransitiveEnrichment,targetFrameworks,version,versionConstraint,versionRange, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaRequestDataAttributesDependenciesItems {\n");
    sb.append("    exclusions: ").append(toIndentedString(exclusions)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    isDev: ").append(toIndentedString(isDev)).append("\n");
    sb.append("    isDirect: ").append(toIndentedString(isDirect)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    opaque: ").append(toIndentedString(opaque)).append("\n");
    sb.append("    packageManager: ").append(toIndentedString(packageManager)).append("\n");
    sb.append("    purl: ").append(toIndentedString(purl)).append("\n");
    sb.append("    reachableSymbolProperties: ").append(toIndentedString(reachableSymbolProperties)).append("\n");
    sb.append("    requiresTransitiveEnrichment: ").append(toIndentedString(requiresTransitiveEnrichment)).append("\n");
    sb.append("    targetFrameworks: ").append(toIndentedString(targetFrameworks)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionConstraint: ").append(toIndentedString(versionConstraint)).append("\n");
    sb.append("    versionRange: ").append(toIndentedString(versionRange)).append("\n");
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
