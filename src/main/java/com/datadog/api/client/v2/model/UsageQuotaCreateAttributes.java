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

/**
 * Attributes for creating or updating a usage quota by scope. Each item must provide <code>
 * usage_limit</code>, <code>pending_usage_limit</code>, or both. Providing only <code>
 * pending_usage_limit</code> updates an existing organization-wide quota, never creates one,
 * requires <code>enforced</code> to be omitted, and fails if the quota does not exist.
 */
@JsonPropertyOrder({
  UsageQuotaCreateAttributes.JSON_PROPERTY_ENFORCED,
  UsageQuotaCreateAttributes.JSON_PROPERTY_PENDING_USAGE_LIMIT,
  UsageQuotaCreateAttributes.JSON_PROPERTY_SCOPE,
  UsageQuotaCreateAttributes.JSON_PROPERTY_USAGE_LIMIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageQuotaCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENFORCED = "enforced";
  private Boolean enforced;

  public static final String JSON_PROPERTY_PENDING_USAGE_LIMIT = "pending_usage_limit";
  private Long pendingUsageLimit;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private Map<String, String> scope = null;

  public static final String JSON_PROPERTY_USAGE_LIMIT = "usage_limit";
  private Long usageLimit;

  public UsageQuotaCreateAttributes enforced(Boolean enforced) {
    this.enforced = enforced;
    return this;
  }

  /**
   * Whether to actively block usage above <code>usage_limit</code> instead of only tracking or
   * alerting on it. Required when <code>usage_limit</code> is provided and must be omitted when
   * only <code>pending_usage_limit</code> is provided.
   *
   * @return enforced
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENFORCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnforced() {
    return enforced;
  }

  public void setEnforced(Boolean enforced) {
    this.enforced = enforced;
  }

  public UsageQuotaCreateAttributes pendingUsageLimit(Long pendingUsageLimit) {
    this.pendingUsageLimit = pendingUsageLimit;
    return this;
  }

  /**
   * The non-negative, whole-number limit to schedule for the organization-wide quota in the usage
   * units defined by the quota namespace. It is not checked against current usage. Each write
   * schedules the value for 00:00 UTC on the first day of the next calendar month and replaces any
   * previously scheduled change; the server computes <code>pending_effective_from</code>. Omit this
   * field to leave any scheduled change unchanged, including when raising <code>usage_limit</code>.
   * Cancel a scheduled change only by deleting the quota's <code>/pending</code> sub-resource.
   * minimum: 0
   *
   * @return pendingUsageLimit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PENDING_USAGE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPendingUsageLimit() {
    return pendingUsageLimit;
  }

  public void setPendingUsageLimit(Long pendingUsageLimit) {
    this.pendingUsageLimit = pendingUsageLimit;
  }

  public UsageQuotaCreateAttributes scope(Map<String, String> scope) {
    this.scope = scope;
    return this;
  }

  public UsageQuotaCreateAttributes putScopeItem(String key, String scopeItem) {
    if (this.scope == null) {
      this.scope = new HashMap<>();
    }
    this.scope.put(key, scopeItem);
    return this;
  }

  /**
   * A namespace-specific key and value identifying what the quota applies to within an
   * organization. The object must contain exactly one entry. Use <code>"*"</code> as the value for
   * the default quota applied to entities without a specific quota, or omit the scope for an
   * organization-wide quota. A specific value must identify an existing user handle in the caller's
   * organization when <code>include_descendants</code> is false. When <code>include_descendants
   * </code> is true, the handle must exist in the caller's organization or in at least one targeted
   * descendant organization; the quota is then applied only to the organizations where that handle
   * exists, and the request fails only if the handle exists in none of them.
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getScope() {
    return scope;
  }

  public void setScope(Map<String, String> scope) {
    this.scope = scope;
  }

  public UsageQuotaCreateAttributes usageLimit(Long usageLimit) {
    this.usageLimit = usageLimit;
    return this;
  }

  /**
   * The non-negative, whole-number quota limit to set in the usage units defined by the quota
   * namespace. For an organization-wide quota (scope omitted), the limit must be greater than usage
   * already recorded in the current period. When this field is provided, <code>enforced</code> is
   * required. minimum: 0
   *
   * @return usageLimit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUsageLimit() {
    return usageLimit;
  }

  public void setUsageLimit(Long usageLimit) {
    this.usageLimit = usageLimit;
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
   * @return UsageQuotaCreateAttributes
   */
  @JsonAnySetter
  public UsageQuotaCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UsageQuotaCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageQuotaCreateAttributes usageQuotaCreateAttributes = (UsageQuotaCreateAttributes) o;
    return Objects.equals(this.enforced, usageQuotaCreateAttributes.enforced)
        && Objects.equals(this.pendingUsageLimit, usageQuotaCreateAttributes.pendingUsageLimit)
        && Objects.equals(this.scope, usageQuotaCreateAttributes.scope)
        && Objects.equals(this.usageLimit, usageQuotaCreateAttributes.usageLimit)
        && Objects.equals(
            this.additionalProperties, usageQuotaCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enforced, pendingUsageLimit, scope, usageLimit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageQuotaCreateAttributes {\n");
    sb.append("    enforced: ").append(toIndentedString(enforced)).append("\n");
    sb.append("    pendingUsageLimit: ").append(toIndentedString(pendingUsageLimit)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
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
