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

/** The JSON:API attributes of the asset. */
@JsonPropertyOrder({
  AssetAttributes.JSON_PROPERTY_ARCH,
  AssetAttributes.JSON_PROPERTY_ENVIRONMENTS,
  AssetAttributes.JSON_PROPERTY_NAME,
  AssetAttributes.JSON_PROPERTY_OPERATING_SYSTEM,
  AssetAttributes.JSON_PROPERTY_RISKS,
  AssetAttributes.JSON_PROPERTY_TEAMS,
  AssetAttributes.JSON_PROPERTY_TYPE,
  AssetAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AssetAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCH = "arch";
  private String arch;

  public static final String JSON_PROPERTY_ENVIRONMENTS = "environments";
  private List<String> environments = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPERATING_SYSTEM = "operating_system";
  private AssetOperatingSystem operatingSystem;

  public static final String JSON_PROPERTY_RISKS = "risks";
  private AssetRisks risks;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<String> teams = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AssetType type;

  public static final String JSON_PROPERTY_VERSION = "version";
  private AssetVersion version;

  public AssetAttributes() {}

  @JsonCreator
  public AssetAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENVIRONMENTS) List<String> environments,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_RISKS) AssetRisks risks,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) AssetType type) {
    this.environments = environments;
    this.name = name;
    this.risks = risks;
    this.unparsed |= risks.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AssetAttributes arch(String arch) {
    this.arch = arch;
    return this;
  }

  /**
   * Asset architecture.
   *
   * @return arch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArch() {
    return arch;
  }

  public void setArch(String arch) {
    this.arch = arch;
  }

  public AssetAttributes environments(List<String> environments) {
    this.environments = environments;
    return this;
  }

  public AssetAttributes addEnvironmentsItem(String environmentsItem) {
    this.environments.add(environmentsItem);
    return this;
  }

  /**
   * List of environments where the asset is deployed.
   *
   * @return environments
   */
  @JsonProperty(JSON_PROPERTY_ENVIRONMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<String> environments) {
    this.environments = environments;
  }

  public AssetAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Asset name.
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

  public AssetAttributes operatingSystem(AssetOperatingSystem operatingSystem) {
    this.operatingSystem = operatingSystem;
    this.unparsed |= operatingSystem.unparsed;
    return this;
  }

  /**
   * Asset operating system.
   *
   * @return operatingSystem
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATING_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AssetOperatingSystem getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(AssetOperatingSystem operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public AssetAttributes risks(AssetRisks risks) {
    this.risks = risks;
    this.unparsed |= risks.unparsed;
    return this;
  }

  /**
   * Asset risks.
   *
   * @return risks
   */
  @JsonProperty(JSON_PROPERTY_RISKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AssetRisks getRisks() {
    return risks;
  }

  public void setRisks(AssetRisks risks) {
    this.risks = risks;
  }

  public AssetAttributes teams(List<String> teams) {
    this.teams = teams;
    return this;
  }

  public AssetAttributes addTeamsItem(String teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * List of teams that own the asset.
   *
   * @return teams
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTeams() {
    return teams;
  }

  public void setTeams(List<String> teams) {
    this.teams = teams;
  }

  public AssetAttributes type(AssetType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The asset type
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AssetType getType() {
    return type;
  }

  public void setType(AssetType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public AssetAttributes version(AssetVersion version) {
    this.version = version;
    this.unparsed |= version.unparsed;
    return this;
  }

  /**
   * Asset version.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AssetVersion getVersion() {
    return version;
  }

  public void setVersion(AssetVersion version) {
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
   * @return AssetAttributes
   */
  @JsonAnySetter
  public AssetAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AssetAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetAttributes assetAttributes = (AssetAttributes) o;
    return Objects.equals(this.arch, assetAttributes.arch)
        && Objects.equals(this.environments, assetAttributes.environments)
        && Objects.equals(this.name, assetAttributes.name)
        && Objects.equals(this.operatingSystem, assetAttributes.operatingSystem)
        && Objects.equals(this.risks, assetAttributes.risks)
        && Objects.equals(this.teams, assetAttributes.teams)
        && Objects.equals(this.type, assetAttributes.type)
        && Objects.equals(this.version, assetAttributes.version)
        && Objects.equals(this.additionalProperties, assetAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        arch,
        environments,
        name,
        operatingSystem,
        risks,
        teams,
        type,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetAttributes {\n");
    sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    risks: ").append(toIndentedString(risks)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
