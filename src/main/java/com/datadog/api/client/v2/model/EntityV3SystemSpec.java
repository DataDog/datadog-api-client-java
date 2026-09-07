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
   * <p>The definition of Entity V3 System Spec object.</p>
 */
@JsonPropertyOrder({
  EntityV3SystemSpec.JSON_PROPERTY_COMPONENTS,
  EntityV3SystemSpec.JSON_PROPERTY_LIFECYCLE,
  EntityV3SystemSpec.JSON_PROPERTY_TIER
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3SystemSpec {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENTS = "components";
  private List<String> components = null;

  public static final String JSON_PROPERTY_LIFECYCLE = "lifecycle";
  private String lifecycle;

  public static final String JSON_PROPERTY_TIER = "tier";
  private String tier;

  public EntityV3SystemSpec components(List<String> components) {
    this.components = components;
    return this;
  }
  public EntityV3SystemSpec addComponentsItem(String componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

  /**
   * <p>A list of components belongs to the system.</p>
   * @return components
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPONENTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getComponents() {
        return components;
      }
  public void setComponents(List<String> components) {
    this.components = components;
  }
  public EntityV3SystemSpec lifecycle(String lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

  /**
   * <p>The lifecycle state of the component.</p>
   * @return lifecycle
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LIFECYCLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLifecycle() {
        return lifecycle;
      }
  public void setLifecycle(String lifecycle) {
    this.lifecycle = lifecycle;
  }
  public EntityV3SystemSpec tier(String tier) {
    this.tier = tier;
    return this;
  }

  /**
   * <p>An entity reference to the owner of the component.</p>
   * @return tier
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTier() {
        return tier;
      }
  public void setTier(String tier) {
    this.tier = tier;
  }

  /**
   * Return true if this EntityV3SystemSpec object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3SystemSpec entityV3SystemSpec = (EntityV3SystemSpec) o;
    return Objects.equals(this.components, entityV3SystemSpec.components) && Objects.equals(this.lifecycle, entityV3SystemSpec.lifecycle) && Objects.equals(this.tier, entityV3SystemSpec.tier);
  }


  @Override
  public int hashCode() {
    return Objects.hash(components,lifecycle,tier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3SystemSpec {\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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
