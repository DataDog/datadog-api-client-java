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
   * <p>The definition of Entity V3 API Spec object.</p>
 */
@JsonPropertyOrder({
  EntityV3APISpec.JSON_PROPERTY_IMPLEMENTED_BY,
  EntityV3APISpec.JSON_PROPERTY_INTERFACE,
  EntityV3APISpec.JSON_PROPERTY_LIFECYCLE,
  EntityV3APISpec.JSON_PROPERTY_TIER,
  EntityV3APISpec.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3APISpec {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_IMPLEMENTED_BY = "implementedBy";
  private List<String> implementedBy = null;

  public static final String JSON_PROPERTY_INTERFACE = "interface";
  private EntityV3APISpecInterface _interface;

  public static final String JSON_PROPERTY_LIFECYCLE = "lifecycle";
  private String lifecycle;

  public static final String JSON_PROPERTY_TIER = "tier";
  private String tier;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public EntityV3APISpec implementedBy(List<String> implementedBy) {
    this.implementedBy = implementedBy;
    return this;
  }
  public EntityV3APISpec addImplementedByItem(String implementedByItem) {
    if (this.implementedBy == null) {
      this.implementedBy = new ArrayList<>();
    }
    this.implementedBy.add(implementedByItem);
    return this;
  }

  /**
   * <p>Services which implemented the API.</p>
   * @return implementedBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IMPLEMENTED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getImplementedBy() {
        return implementedBy;
      }
  public void setImplementedBy(List<String> implementedBy) {
    this.implementedBy = implementedBy;
  }
  public EntityV3APISpec _interface(EntityV3APISpecInterface _interface) {
    this._interface = _interface;
    this.unparsed |= _interface.unparsed;
    return this;
  }

  /**
   * <p>The API definition.</p>
   * @return _interface
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INTERFACE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EntityV3APISpecInterface getInterface() {
        return _interface;
      }
  public void setInterface(EntityV3APISpecInterface _interface) {
    this._interface = _interface;
  }
  public EntityV3APISpec lifecycle(String lifecycle) {
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
  public EntityV3APISpec tier(String tier) {
    this.tier = tier;
    return this;
  }

  /**
   * <p>The importance of the component.</p>
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
  public EntityV3APISpec type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>The type of API.</p>
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
   * Return true if this EntityV3APISpec object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3APISpec entityV3ApiSpec = (EntityV3APISpec) o;
    return Objects.equals(this.implementedBy, entityV3ApiSpec.implementedBy) && Objects.equals(this._interface, entityV3ApiSpec._interface) && Objects.equals(this.lifecycle, entityV3ApiSpec.lifecycle) && Objects.equals(this.tier, entityV3ApiSpec.tier) && Objects.equals(this.type, entityV3ApiSpec.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(implementedBy,_interface,lifecycle,tier,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3APISpec {\n");
    sb.append("    implementedBy: ").append(toIndentedString(implementedBy)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
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
