/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The definition of Entity V3 Repository Spec object. */
@JsonPropertyOrder({
  EntityV3RepositorySpec.JSON_PROPERTY_COMPONENT_OF,
  EntityV3RepositorySpec.JSON_PROPERTY_DEPENDENCY_OF,
  EntityV3RepositorySpec.JSON_PROPERTY_DEPENDS_ON,
  EntityV3RepositorySpec.JSON_PROPERTY_LIFECYCLE,
  EntityV3RepositorySpec.JSON_PROPERTY_TIER,
  EntityV3RepositorySpec.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3RepositorySpec {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENT_OF = "componentOf";
  private List<String> componentOf = null;

  public static final String JSON_PROPERTY_DEPENDENCY_OF = "dependencyOf";
  private List<String> dependencyOf = null;

  public static final String JSON_PROPERTY_DEPENDS_ON = "dependsOn";
  private List<String> dependsOn = null;

  public static final String JSON_PROPERTY_LIFECYCLE = "lifecycle";
  private String lifecycle;

  public static final String JSON_PROPERTY_TIER = "tier";
  private String tier;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public EntityV3RepositorySpec componentOf(List<String> componentOf) {
    this.componentOf = componentOf;
    return this;
  }

  public EntityV3RepositorySpec addComponentOfItem(String componentOfItem) {
    if (this.componentOf == null) {
      this.componentOf = new ArrayList<>();
    }
    this.componentOf.add(componentOfItem);
    return this;
  }

  /**
   * A list of components the repository is a part of.
   *
   * @return componentOf
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_OF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getComponentOf() {
    return componentOf;
  }

  public void setComponentOf(List<String> componentOf) {
    this.componentOf = componentOf;
  }

  public EntityV3RepositorySpec dependencyOf(List<String> dependencyOf) {
    this.dependencyOf = dependencyOf;
    return this;
  }

  public EntityV3RepositorySpec addDependencyOfItem(String dependencyOfItem) {
    if (this.dependencyOf == null) {
      this.dependencyOf = new ArrayList<>();
    }
    this.dependencyOf.add(dependencyOfItem);
    return this;
  }

  /**
   * A list of components that the repository is a dependency of.
   *
   * @return dependencyOf
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPENDENCY_OF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDependencyOf() {
    return dependencyOf;
  }

  public void setDependencyOf(List<String> dependencyOf) {
    this.dependencyOf = dependencyOf;
  }

  public EntityV3RepositorySpec dependsOn(List<String> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  public EntityV3RepositorySpec addDependsOnItem(String dependsOnItem) {
    if (this.dependsOn == null) {
      this.dependsOn = new ArrayList<>();
    }
    this.dependsOn.add(dependsOnItem);
    return this;
  }

  /**
   * A list of components that the repository depends on.
   *
   * @return dependsOn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPENDS_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDependsOn() {
    return dependsOn;
  }

  public void setDependsOn(List<String> dependsOn) {
    this.dependsOn = dependsOn;
  }

  public EntityV3RepositorySpec lifecycle(String lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

  /**
   * The lifecycle state of the repository.
   *
   * @return lifecycle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIFECYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(String lifecycle) {
    this.lifecycle = lifecycle;
  }

  public EntityV3RepositorySpec tier(String tier) {
    this.tier = tier;
    return this;
  }

  /**
   * The importance of the repository.
   *
   * @return tier
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTier() {
    return tier;
  }

  public void setTier(String tier) {
    this.tier = tier;
  }

  public EntityV3RepositorySpec type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of repository.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /** Return true if this EntityV3RepositorySpec object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3RepositorySpec entityV3RepositorySpec = (EntityV3RepositorySpec) o;
    return Objects.equals(this.componentOf, entityV3RepositorySpec.componentOf)
        && Objects.equals(this.dependencyOf, entityV3RepositorySpec.dependencyOf)
        && Objects.equals(this.dependsOn, entityV3RepositorySpec.dependsOn)
        && Objects.equals(this.lifecycle, entityV3RepositorySpec.lifecycle)
        && Objects.equals(this.tier, entityV3RepositorySpec.tier)
        && Objects.equals(this.type, entityV3RepositorySpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentOf, dependencyOf, dependsOn, lifecycle, tier, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3RepositorySpec {\n");
    sb.append("    componentOf: ").append(toIndentedString(componentOf)).append("\n");
    sb.append("    dependencyOf: ").append(toIndentedString(dependencyOf)).append("\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
