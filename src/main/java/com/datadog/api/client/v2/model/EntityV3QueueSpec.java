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
   * <p>The definition of Entity V3 Queue Spec object.</p>
 */
@JsonPropertyOrder({
  EntityV3QueueSpec.JSON_PROPERTY_COMPONENT_OF,
  EntityV3QueueSpec.JSON_PROPERTY_LIFECYCLE,
  EntityV3QueueSpec.JSON_PROPERTY_TIER,
  EntityV3QueueSpec.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3QueueSpec {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENT_OF = "componentOf";
  private List<String> componentOf = null;

  public static final String JSON_PROPERTY_LIFECYCLE = "lifecycle";
  private String lifecycle;

  public static final String JSON_PROPERTY_TIER = "tier";
  private String tier;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public EntityV3QueueSpec componentOf(List<String> componentOf) {
    this.componentOf = componentOf;
    return this;
  }
  public EntityV3QueueSpec addComponentOfItem(String componentOfItem) {
    if (this.componentOf == null) {
      this.componentOf = new ArrayList<>();
    }
    this.componentOf.add(componentOfItem);
    return this;
  }

  /**
   * <p>A list of components the queue is a part of</p>
   * @return componentOf
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPONENT_OF)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getComponentOf() {
        return componentOf;
      }
  public void setComponentOf(List<String> componentOf) {
    this.componentOf = componentOf;
  }
  public EntityV3QueueSpec lifecycle(String lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

  /**
   * <p>The lifecycle state of the queue.</p>
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
  public EntityV3QueueSpec tier(String tier) {
    this.tier = tier;
    return this;
  }

  /**
   * <p>The importance of the queue.</p>
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
  public EntityV3QueueSpec type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>The type of queue.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Return true if this EntityV3QueueSpec object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3QueueSpec entityV3QueueSpec = (EntityV3QueueSpec) o;
    return Objects.equals(this.componentOf, entityV3QueueSpec.componentOf) && Objects.equals(this.lifecycle, entityV3QueueSpec.lifecycle) && Objects.equals(this.tier, entityV3QueueSpec.tier) && Objects.equals(this.type, entityV3QueueSpec.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(componentOf,lifecycle,tier,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3QueueSpec {\n");
    sb.append("    componentOf: ").append(toIndentedString(componentOf)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
