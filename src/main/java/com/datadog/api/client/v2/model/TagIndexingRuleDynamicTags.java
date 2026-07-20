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
 * Options for dynamic tag indexing applied per metric, such as tags filtered by query usage.
 *
 * <p>Before a tag key is dropped by this rule, two grace period conditions must be met:
 *
 * <ol>
 *   <li>The metric must be submitted for at least as long as the selected window.
 *   <li>A tag key must have been submitted for at least 15 days.
 * </ol>
 *
 * <p>Any metric or tag key that does not meet these conditions are excluded from this indexing
 * rule. The <code>exclude_not_*</code> fields require <code>exclude_tags_mode</code> to be set to
 * <code>true</code>.
 */
@JsonPropertyOrder({
  TagIndexingRuleDynamicTags.JSON_PROPERTY_EXCLUDE_NOT_QUERIED_WINDOW_SECONDS,
  TagIndexingRuleDynamicTags.JSON_PROPERTY_EXCLUDE_NOT_USED_IN_ASSETS,
  TagIndexingRuleDynamicTags.JSON_PROPERTY_QUERIED_TAGS_WINDOW_SECONDS,
  TagIndexingRuleDynamicTags.JSON_PROPERTY_RELATED_ASSET_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagIndexingRuleDynamicTags {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXCLUDE_NOT_QUERIED_WINDOW_SECONDS =
      "exclude_not_queried_window_seconds";
  private Long excludeNotQueriedWindowSeconds;

  public static final String JSON_PROPERTY_EXCLUDE_NOT_USED_IN_ASSETS =
      "exclude_not_used_in_assets";
  private Boolean excludeNotUsedInAssets;

  public static final String JSON_PROPERTY_QUERIED_TAGS_WINDOW_SECONDS =
      "queried_tags_window_seconds";
  private Long queriedTagsWindowSeconds;

  public static final String JSON_PROPERTY_RELATED_ASSET_TAGS = "related_asset_tags";
  private Boolean relatedAssetTags;

  public TagIndexingRuleDynamicTags excludeNotQueriedWindowSeconds(
      Long excludeNotQueriedWindowSeconds) {
    this.excludeNotQueriedWindowSeconds = excludeNotQueriedWindowSeconds;
    return this;
  }

  /**
   * Tags that have not been queried within this window are excluded from indexing. Maximum of
   * <code>7776000</code> (90 days). maximum: 7776000
   *
   * @return excludeNotQueriedWindowSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_NOT_QUERIED_WINDOW_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExcludeNotQueriedWindowSeconds() {
    return excludeNotQueriedWindowSeconds;
  }

  public void setExcludeNotQueriedWindowSeconds(Long excludeNotQueriedWindowSeconds) {
    this.excludeNotQueriedWindowSeconds = excludeNotQueriedWindowSeconds;
  }

  public TagIndexingRuleDynamicTags excludeNotUsedInAssets(Boolean excludeNotUsedInAssets) {
    this.excludeNotUsedInAssets = excludeNotUsedInAssets;
    return this;
  }

  /**
   * Tags not used in any dashboards, monitors, notebooks, or SLOs are excluded from indexing.
   *
   * @return excludeNotUsedInAssets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_NOT_USED_IN_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExcludeNotUsedInAssets() {
    return excludeNotUsedInAssets;
  }

  public void setExcludeNotUsedInAssets(Boolean excludeNotUsedInAssets) {
    this.excludeNotUsedInAssets = excludeNotUsedInAssets;
  }

  public TagIndexingRuleDynamicTags queriedTagsWindowSeconds(Long queriedTagsWindowSeconds) {
    this.queriedTagsWindowSeconds = queriedTagsWindowSeconds;
    return this;
  }

  /**
   * Window in seconds for evaluating queried tags.
   *
   * @return queriedTagsWindowSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERIED_TAGS_WINDOW_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getQueriedTagsWindowSeconds() {
    return queriedTagsWindowSeconds;
  }

  public void setQueriedTagsWindowSeconds(Long queriedTagsWindowSeconds) {
    this.queriedTagsWindowSeconds = queriedTagsWindowSeconds;
  }

  public TagIndexingRuleDynamicTags relatedAssetTags(Boolean relatedAssetTags) {
    this.relatedAssetTags = relatedAssetTags;
    return this;
  }

  /**
   * When true, tags from related assets are included.
   *
   * @return relatedAssetTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATED_ASSET_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRelatedAssetTags() {
    return relatedAssetTags;
  }

  public void setRelatedAssetTags(Boolean relatedAssetTags) {
    this.relatedAssetTags = relatedAssetTags;
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
   * @return TagIndexingRuleDynamicTags
   */
  @JsonAnySetter
  public TagIndexingRuleDynamicTags putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TagIndexingRuleDynamicTags object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagIndexingRuleDynamicTags tagIndexingRuleDynamicTags = (TagIndexingRuleDynamicTags) o;
    return Objects.equals(
            this.excludeNotQueriedWindowSeconds,
            tagIndexingRuleDynamicTags.excludeNotQueriedWindowSeconds)
        && Objects.equals(
            this.excludeNotUsedInAssets, tagIndexingRuleDynamicTags.excludeNotUsedInAssets)
        && Objects.equals(
            this.queriedTagsWindowSeconds, tagIndexingRuleDynamicTags.queriedTagsWindowSeconds)
        && Objects.equals(this.relatedAssetTags, tagIndexingRuleDynamicTags.relatedAssetTags)
        && Objects.equals(
            this.additionalProperties, tagIndexingRuleDynamicTags.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        excludeNotQueriedWindowSeconds,
        excludeNotUsedInAssets,
        queriedTagsWindowSeconds,
        relatedAssetTags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagIndexingRuleDynamicTags {\n");
    sb.append("    excludeNotQueriedWindowSeconds: ")
        .append(toIndentedString(excludeNotQueriedWindowSeconds))
        .append("\n");
    sb.append("    excludeNotUsedInAssets: ")
        .append(toIndentedString(excludeNotUsedInAssets))
        .append("\n");
    sb.append("    queriedTagsWindowSeconds: ")
        .append(toIndentedString(queriedTagsWindowSeconds))
        .append("\n");
    sb.append("    relatedAssetTags: ").append(toIndentedString(relatedAssetTags)).append("\n");
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
