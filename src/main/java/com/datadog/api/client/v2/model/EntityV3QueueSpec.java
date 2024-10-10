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
import java.util.Objects;

/** The definition of Entity V3 Queue Spec object. */
@JsonPropertyOrder({
  EntityV3QueueSpec.JSON_PROPERTY_LIFECYCLE,
  EntityV3QueueSpec.JSON_PROPERTY_TIER,
  EntityV3QueueSpec.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3QueueSpec {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LIFECYCLE = "lifecycle";
  private String lifecycle;

  public static final String JSON_PROPERTY_TIER = "tier";
  private String tier;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public EntityV3QueueSpec lifecycle(String lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

  /**
   * The lifecycle state of the queue.
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

  public EntityV3QueueSpec tier(String tier) {
    this.tier = tier;
    return this;
  }

  /**
   * The importance of the queue.
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

  public EntityV3QueueSpec type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of queue.
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

  /** Return true if this EntityV3QueueSpec object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3QueueSpec entityV3QueueSpec = (EntityV3QueueSpec) o;
    return Objects.equals(this.lifecycle, entityV3QueueSpec.lifecycle)
        && Objects.equals(this.tier, entityV3QueueSpec.tier)
        && Objects.equals(this.type, entityV3QueueSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycle, tier, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3QueueSpec {\n");
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
