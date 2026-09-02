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
   * <p>Attributes of a usage quota.</p>
 */
@JsonPropertyOrder({
  UsageQuotaResponseAttributes.JSON_PROPERTY_ENFORCED,
  UsageQuotaResponseAttributes.JSON_PROPERTY_ORG_PUBLIC_ID,
  UsageQuotaResponseAttributes.JSON_PROPERTY_SCOPE,
  UsageQuotaResponseAttributes.JSON_PROPERTY_USAGE_LIMIT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageQuotaResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENFORCED = "enforced";
  private Boolean enforced;

  public static final String JSON_PROPERTY_ORG_PUBLIC_ID = "org_public_id";
  private String orgPublicId;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private Map<String, String> scope = null;

  public static final String JSON_PROPERTY_USAGE_LIMIT = "usage_limit";
  private Double usageLimit;

  public UsageQuotaResponseAttributes() {}

  @JsonCreator
  public UsageQuotaResponseAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_ENFORCED)Boolean enforced,
            @JsonProperty(required=true, value=JSON_PROPERTY_ORG_PUBLIC_ID)String orgPublicId,
            @JsonProperty(required=true, value=JSON_PROPERTY_USAGE_LIMIT)Double usageLimit) {
        this.enforced = enforced;
        this.orgPublicId = orgPublicId;
        this.usageLimit = usageLimit;
  }
  public UsageQuotaResponseAttributes enforced(Boolean enforced) {
    this.enforced = enforced;
    return this;
  }

  /**
   * <p>Whether usage above the limit is actively blocked instead of only tracked or alerted on.</p>
   * @return enforced
  **/
      @JsonProperty(JSON_PROPERTY_ENFORCED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getEnforced() {
        return enforced;
      }
  public void setEnforced(Boolean enforced) {
    this.enforced = enforced;
  }
  public UsageQuotaResponseAttributes orgPublicId(String orgPublicId) {
    this.orgPublicId = orgPublicId;
    return this;
  }

  /**
   * <p>The public ID of the organization that owns the quota.</p>
   * @return orgPublicId
  **/
      @JsonProperty(JSON_PROPERTY_ORG_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getOrgPublicId() {
        return orgPublicId;
      }
  public void setOrgPublicId(String orgPublicId) {
    this.orgPublicId = orgPublicId;
  }
  public UsageQuotaResponseAttributes scope(Map<String, String> scope) {
    this.scope = scope;
    return this;
  }
  public UsageQuotaResponseAttributes putScopeItem(String key, String scopeItem) {
    if (this.scope == null) {
      this.scope = new HashMap<>();
    }
    this.scope.put(key, scopeItem);
    return this;
  }

  /**
   * <p>A namespace-specific key and value identifying what the quota applies to within an organization. The object contains exactly one entry. A value of <code>"*"</code> identifies the default quota applied to entities without a specific quota. This field is omitted for an organization-wide quota.</p>
   * @return scope
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCOPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, String> getScope() {
        return scope;
      }
  public void setScope(Map<String, String> scope) {
    this.scope = scope;
  }
  public UsageQuotaResponseAttributes usageLimit(Double usageLimit) {
    this.usageLimit = usageLimit;
    return this;
  }

  /**
   * <p>The quota limit in the usage units defined by the quota namespace. May be fractional for quotas configured before public writes required whole units.</p>
   * @return usageLimit
  **/
      @JsonProperty(JSON_PROPERTY_USAGE_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Double getUsageLimit() {
        return usageLimit;
      }
  public void setUsageLimit(Double usageLimit) {
    this.usageLimit = usageLimit;
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
   * @return UsageQuotaResponseAttributes
   */
  @JsonAnySetter
  public UsageQuotaResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this UsageQuotaResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageQuotaResponseAttributes usageQuotaResponseAttributes = (UsageQuotaResponseAttributes) o;
    return Objects.equals(this.enforced, usageQuotaResponseAttributes.enforced) && Objects.equals(this.orgPublicId, usageQuotaResponseAttributes.orgPublicId) && Objects.equals(this.scope, usageQuotaResponseAttributes.scope) && Objects.equals(this.usageLimit, usageQuotaResponseAttributes.usageLimit) && Objects.equals(this.additionalProperties, usageQuotaResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(enforced,orgPublicId,scope,usageLimit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageQuotaResponseAttributes {\n");
    sb.append("    enforced: ").append(toIndentedString(enforced)).append("\n");
    sb.append("    orgPublicId: ").append(toIndentedString(orgPublicId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
