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

 */
@JsonPropertyOrder({
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_EXCLUSIONS,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_GROUP,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_IS_DEV,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_IS_DIRECT,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_LANGUAGE,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_LOCATIONS,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_NAME,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_PACKAGE_MANAGER,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_PURL,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_REACHABLE_SYMBOL_PROPERTIES,
  ScaRequestDataAttributesDependenciesItems.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScaRequestDataAttributesDependenciesItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXCLUSIONS = "exclusions";
  private List<String> exclusions = null;

  public static final String JSON_PROPERTY_GROUP = "group";
  private String group;

  public static final String JSON_PROPERTY_IS_DEV = "is_dev";
  private Boolean isDev;

  public static final String JSON_PROPERTY_IS_DIRECT = "is_direct";
  private Boolean isDirect;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<ScaRequestDataAttributesDependenciesItemsLocationsItems> locations = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PACKAGE_MANAGER = "package_manager";
  private String packageManager;

  public static final String JSON_PROPERTY_PURL = "purl";
  private String purl;

  public static final String JSON_PROPERTY_REACHABLE_SYMBOL_PROPERTIES = "reachable_symbol_properties";
  private List<ScaRequestDataAttributesDependenciesItemsReachableSymbolPropertiesItems> reachableSymbolProperties = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

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
   * <p>Getexclusions</p>
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
    this.group = group;
    return this;
  }

  /**
   * <p>Getgroup</p>
   * @return group
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getGroup() {
        return group;
      }
  public void setGroup(String group) {
    this.group = group;
  }
  public ScaRequestDataAttributesDependenciesItems isDev(Boolean isDev) {
    this.isDev = isDev;
    return this;
  }

  /**
   * <p>GetisDev</p>
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
    this.isDirect = isDirect;
    return this;
  }

  /**
   * <p>GetisDirect</p>
   * @return isDirect
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_DIRECT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsDirect() {
        return isDirect;
      }
  public void setIsDirect(Boolean isDirect) {
    this.isDirect = isDirect;
  }
  public ScaRequestDataAttributesDependenciesItems language(String language) {
    this.language = language;
    return this;
  }

  /**
   * <p>Getlanguage</p>
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
    this.locations = locations;
    for (ScaRequestDataAttributesDependenciesItemsLocationsItems item : locations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ScaRequestDataAttributesDependenciesItems addLocationsItem(ScaRequestDataAttributesDependenciesItemsLocationsItems locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    this.unparsed |= locationsItem.unparsed;
    return this;
  }

  /**
   * <p>Getlocations</p>
   * @return locations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOCATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ScaRequestDataAttributesDependenciesItemsLocationsItems> getLocations() {
        return locations;
      }
  public void setLocations(List<ScaRequestDataAttributesDependenciesItemsLocationsItems> locations) {
    this.locations = locations;
  }
  public ScaRequestDataAttributesDependenciesItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getname</p>
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
  public ScaRequestDataAttributesDependenciesItems packageManager(String packageManager) {
    this.packageManager = packageManager;
    return this;
  }

  /**
   * <p>GetpackageManager</p>
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
   * <p>Getpurl</p>
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
    for (ScaRequestDataAttributesDependenciesItemsReachableSymbolPropertiesItems item : reachableSymbolProperties) {
      this.unparsed |= item.unparsed;
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
   * <p>GetreachableSymbolProperties</p>
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
  }
  public ScaRequestDataAttributesDependenciesItems version(String version) {
    this.version = version;
    return this;
  }

  /**
   * <p>Getversion</p>
   * @return version
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getVersion() {
        return version;
      }
  public void setVersion(String version) {
    this.version = version;
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
    return Objects.equals(this.exclusions, scaRequestDataAttributesDependenciesItems.exclusions) && Objects.equals(this.group, scaRequestDataAttributesDependenciesItems.group) && Objects.equals(this.isDev, scaRequestDataAttributesDependenciesItems.isDev) && Objects.equals(this.isDirect, scaRequestDataAttributesDependenciesItems.isDirect) && Objects.equals(this.language, scaRequestDataAttributesDependenciesItems.language) && Objects.equals(this.locations, scaRequestDataAttributesDependenciesItems.locations) && Objects.equals(this.name, scaRequestDataAttributesDependenciesItems.name) && Objects.equals(this.packageManager, scaRequestDataAttributesDependenciesItems.packageManager) && Objects.equals(this.purl, scaRequestDataAttributesDependenciesItems.purl) && Objects.equals(this.reachableSymbolProperties, scaRequestDataAttributesDependenciesItems.reachableSymbolProperties) && Objects.equals(this.version, scaRequestDataAttributesDependenciesItems.version) && Objects.equals(this.additionalProperties, scaRequestDataAttributesDependenciesItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(exclusions,group,isDev,isDirect,language,locations,name,packageManager,purl,reachableSymbolProperties,version, additionalProperties);
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
    sb.append("    packageManager: ").append(toIndentedString(packageManager)).append("\n");
    sb.append("    purl: ").append(toIndentedString(purl)).append("\n");
    sb.append("    reachableSymbolProperties: ").append(toIndentedString(reachableSymbolProperties)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
