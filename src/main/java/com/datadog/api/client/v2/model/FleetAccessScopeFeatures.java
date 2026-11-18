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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Fleet actions authorized on agents matching the access scope query. */
@JsonPropertyOrder({
  FleetAccessScopeFeatures.JSON_PROPERTY_CONFIGURE,
  FleetAccessScopeFeatures.JSON_PROPERTY_INSTALL,
  FleetAccessScopeFeatures.JSON_PROPERTY_UPGRADE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetAccessScopeFeatures {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIGURE = "configure";
  private Boolean configure = false;

  public static final String JSON_PROPERTY_INSTALL = "install";
  private Boolean install = false;

  public static final String JSON_PROPERTY_UPGRADE = "upgrade";
  private Boolean upgrade = false;

  public FleetAccessScopeFeatures configure(Boolean configure) {
    this.configure = configure;
    return this;
  }

  /**
   * Whether the scope permits configuration changes.
   *
   * @return configure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getConfigure() {
    return configure;
  }

  public void setConfigure(Boolean configure) {
    this.configure = configure;
  }

  public FleetAccessScopeFeatures install(Boolean install) {
    this.install = install;
    return this;
  }

  /**
   * Whether the scope permits Agent installation.
   *
   * @return install
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getInstall() {
    return install;
  }

  public void setInstall(Boolean install) {
    this.install = install;
  }

  public FleetAccessScopeFeatures upgrade(Boolean upgrade) {
    this.upgrade = upgrade;
    return this;
  }

  /**
   * Whether the scope permits package upgrades.
   *
   * @return upgrade
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPGRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUpgrade() {
    return upgrade;
  }

  public void setUpgrade(Boolean upgrade) {
    this.upgrade = upgrade;
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
   * @return FleetAccessScopeFeatures
   */
  @JsonAnySetter
  public FleetAccessScopeFeatures putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetAccessScopeFeatures object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetAccessScopeFeatures fleetAccessScopeFeatures = (FleetAccessScopeFeatures) o;
    return Objects.equals(this.configure, fleetAccessScopeFeatures.configure)
        && Objects.equals(this.install, fleetAccessScopeFeatures.install)
        && Objects.equals(this.upgrade, fleetAccessScopeFeatures.upgrade)
        && Objects.equals(this.additionalProperties, fleetAccessScopeFeatures.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configure, install, upgrade, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetAccessScopeFeatures {\n");
    sb.append("    configure: ").append(toIndentedString(configure)).append("\n");
    sb.append("    install: ").append(toIndentedString(install)).append("\n");
    sb.append("    upgrade: ").append(toIndentedString(upgrade)).append("\n");
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
