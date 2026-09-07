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
   * <p>Attributes to update on a usage quota. Omitting a property leaves its current value unchanged.</p>
 */
@JsonPropertyOrder({
  UsageQuotaUpdateAttributes.JSON_PROPERTY_ENFORCED,
  UsageQuotaUpdateAttributes.JSON_PROPERTY_USAGE_LIMIT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageQuotaUpdateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENFORCED = "enforced";
  private JsonNullable<Boolean> enforced = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_USAGE_LIMIT = "usage_limit";
  private JsonNullable<Long> usageLimit = JsonNullable.<Long>undefined();

  public UsageQuotaUpdateAttributes enforced(Boolean enforced) {
    this.enforced = JsonNullable.<Boolean>of(enforced);
    return this;
  }

  /**
   * <p>Whether to actively block usage above the limit. Omit this field to leave the current enforcement setting unchanged.</p>
   * @return enforced
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Boolean getEnforced() {
        return enforced.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ENFORCED)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getEnforced_JsonNullable() {
    return enforced;
  }
  @JsonProperty(JSON_PROPERTY_ENFORCED)public void setEnforced_JsonNullable(JsonNullable<Boolean> enforced) {
    this.enforced = enforced;
  }
  public void setEnforced(Boolean enforced) {
    this.enforced = JsonNullable.<Boolean>of(enforced);
  }
  public UsageQuotaUpdateAttributes usageLimit(Long usageLimit) {
    this.usageLimit = JsonNullable.<Long>of(usageLimit);
    return this;
  }

  /**
   * <p>The new quota limit in the usage units defined by the quota namespace. For an organization-wide quota (empty scope), the limit must be greater than the usage already recorded in the current period. Omit this field to leave the current limit unchanged.</p>
   * minimum: 0
   * @return usageLimit
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getUsageLimit() {
        return usageLimit.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_USAGE_LIMIT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getUsageLimit_JsonNullable() {
    return usageLimit;
  }
  @JsonProperty(JSON_PROPERTY_USAGE_LIMIT)public void setUsageLimit_JsonNullable(JsonNullable<Long> usageLimit) {
    this.usageLimit = usageLimit;
  }
  public void setUsageLimit(Long usageLimit) {
    this.usageLimit = JsonNullable.<Long>of(usageLimit);
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
   * @return UsageQuotaUpdateAttributes
   */
  @JsonAnySetter
  public UsageQuotaUpdateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this UsageQuotaUpdateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageQuotaUpdateAttributes usageQuotaUpdateAttributes = (UsageQuotaUpdateAttributes) o;
    return Objects.equals(this.enforced, usageQuotaUpdateAttributes.enforced) && Objects.equals(this.usageLimit, usageQuotaUpdateAttributes.usageLimit) && Objects.equals(this.additionalProperties, usageQuotaUpdateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(enforced,usageLimit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageQuotaUpdateAttributes {\n");
    sb.append("    enforced: ").append(toIndentedString(enforced)).append("\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
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
