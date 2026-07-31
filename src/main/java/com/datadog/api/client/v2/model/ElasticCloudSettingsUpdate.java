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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Partial Elastic Cloud interface settings for updates. */
@JsonPropertyOrder({
  ElasticCloudSettingsUpdate.JSON_PROPERTY_CAT_ALLOCATION_STATS_ENABLED,
  ElasticCloudSettingsUpdate.JSON_PROPERTY_DETAILED_INDEX_STATS_ENABLED,
  ElasticCloudSettingsUpdate.JSON_PROPERTY_INDEX_STATS_ENABLED,
  ElasticCloudSettingsUpdate.JSON_PROPERTY_PENDING_TASK_STATS_ENABLED,
  ElasticCloudSettingsUpdate.JSON_PROPERTY_PSHARD_GRACEFUL_TO_ENABLED,
  ElasticCloudSettingsUpdate.JSON_PROPERTY_PSHARD_STATS_ENABLED,
  ElasticCloudSettingsUpdate.JSON_PROPERTY_SLM_STATS_ENABLED,
  ElasticCloudSettingsUpdate.JSON_PROPERTY_TAGS,
  ElasticCloudSettingsUpdate.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticCloudSettingsUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CAT_ALLOCATION_STATS_ENABLED =
      "cat_allocation_stats_enabled";
  private Boolean catAllocationStatsEnabled;

  public static final String JSON_PROPERTY_DETAILED_INDEX_STATS_ENABLED =
      "detailed_index_stats_enabled";
  private Boolean detailedIndexStatsEnabled;

  public static final String JSON_PROPERTY_INDEX_STATS_ENABLED = "index_stats_enabled";
  private Boolean indexStatsEnabled;

  public static final String JSON_PROPERTY_PENDING_TASK_STATS_ENABLED =
      "pending_task_stats_enabled";
  private Boolean pendingTaskStatsEnabled;

  public static final String JSON_PROPERTY_PSHARD_GRACEFUL_TO_ENABLED =
      "pshard_graceful_to_enabled";
  private Boolean pshardGracefulToEnabled;

  public static final String JSON_PROPERTY_PSHARD_STATS_ENABLED = "pshard_stats_enabled";
  private Boolean pshardStatsEnabled;

  public static final String JSON_PROPERTY_SLM_STATS_ENABLED = "slm_stats_enabled";
  private Boolean slmStatsEnabled;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public ElasticCloudSettingsUpdate catAllocationStatsEnabled(Boolean catAllocationStatsEnabled) {
    this.catAllocationStatsEnabled = catAllocationStatsEnabled;
    return this;
  }

  /**
   * Enable to collect shard allocation metrics.
   *
   * @return catAllocationStatsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAT_ALLOCATION_STATS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCatAllocationStatsEnabled() {
    return catAllocationStatsEnabled;
  }

  public void setCatAllocationStatsEnabled(Boolean catAllocationStatsEnabled) {
    this.catAllocationStatsEnabled = catAllocationStatsEnabled;
  }

  public ElasticCloudSettingsUpdate detailedIndexStatsEnabled(Boolean detailedIndexStatsEnabled) {
    this.detailedIndexStatsEnabled = detailedIndexStatsEnabled;
    return this;
  }

  /**
   * Enable to collect index-specific stats.
   *
   * @return detailedIndexStatsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAILED_INDEX_STATS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDetailedIndexStatsEnabled() {
    return detailedIndexStatsEnabled;
  }

  public void setDetailedIndexStatsEnabled(Boolean detailedIndexStatsEnabled) {
    this.detailedIndexStatsEnabled = detailedIndexStatsEnabled;
  }

  public ElasticCloudSettingsUpdate indexStatsEnabled(Boolean indexStatsEnabled) {
    this.indexStatsEnabled = indexStatsEnabled;
    return this;
  }

  /**
   * Enable to collect metrics about the indices in your cluster.
   *
   * @return indexStatsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX_STATS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIndexStatsEnabled() {
    return indexStatsEnabled;
  }

  public void setIndexStatsEnabled(Boolean indexStatsEnabled) {
    this.indexStatsEnabled = indexStatsEnabled;
  }

  public ElasticCloudSettingsUpdate pendingTaskStatsEnabled(Boolean pendingTaskStatsEnabled) {
    this.pendingTaskStatsEnabled = pendingTaskStatsEnabled;
    return this;
  }

  /**
   * Enable to collect metrics about pending tasks.
   *
   * @return pendingTaskStatsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PENDING_TASK_STATS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPendingTaskStatsEnabled() {
    return pendingTaskStatsEnabled;
  }

  public void setPendingTaskStatsEnabled(Boolean pendingTaskStatsEnabled) {
    this.pendingTaskStatsEnabled = pendingTaskStatsEnabled;
  }

  public ElasticCloudSettingsUpdate pshardGracefulToEnabled(Boolean pshardGracefulToEnabled) {
    this.pshardGracefulToEnabled = pshardGracefulToEnabled;
    return this;
  }

  /**
   * Enable to collect all metrics even if primary shard metric collection times out.
   *
   * @return pshardGracefulToEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PSHARD_GRACEFUL_TO_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPshardGracefulToEnabled() {
    return pshardGracefulToEnabled;
  }

  public void setPshardGracefulToEnabled(Boolean pshardGracefulToEnabled) {
    this.pshardGracefulToEnabled = pshardGracefulToEnabled;
  }

  public ElasticCloudSettingsUpdate pshardStatsEnabled(Boolean pshardStatsEnabled) {
    this.pshardStatsEnabled = pshardStatsEnabled;
    return this;
  }

  /**
   * Enable to collect metrics over primary shards.
   *
   * @return pshardStatsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PSHARD_STATS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPshardStatsEnabled() {
    return pshardStatsEnabled;
  }

  public void setPshardStatsEnabled(Boolean pshardStatsEnabled) {
    this.pshardStatsEnabled = pshardStatsEnabled;
  }

  public ElasticCloudSettingsUpdate slmStatsEnabled(Boolean slmStatsEnabled) {
    this.slmStatsEnabled = slmStatsEnabled;
    return this;
  }

  /**
   * Enable to collect snapshot lifecycle management metrics.
   *
   * @return slmStatsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLM_STATS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSlmStatsEnabled() {
    return slmStatsEnabled;
  }

  public void setSlmStatsEnabled(Boolean slmStatsEnabled) {
    this.slmStatsEnabled = slmStatsEnabled;
  }

  public ElasticCloudSettingsUpdate tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ElasticCloudSettingsUpdate addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Custom tags for this deployment.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ElasticCloudSettingsUpdate url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Deployment URL.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
   * @return ElasticCloudSettingsUpdate
   */
  @JsonAnySetter
  public ElasticCloudSettingsUpdate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ElasticCloudSettingsUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticCloudSettingsUpdate elasticCloudSettingsUpdate = (ElasticCloudSettingsUpdate) o;
    return Objects.equals(
            this.catAllocationStatsEnabled, elasticCloudSettingsUpdate.catAllocationStatsEnabled)
        && Objects.equals(
            this.detailedIndexStatsEnabled, elasticCloudSettingsUpdate.detailedIndexStatsEnabled)
        && Objects.equals(this.indexStatsEnabled, elasticCloudSettingsUpdate.indexStatsEnabled)
        && Objects.equals(
            this.pendingTaskStatsEnabled, elasticCloudSettingsUpdate.pendingTaskStatsEnabled)
        && Objects.equals(
            this.pshardGracefulToEnabled, elasticCloudSettingsUpdate.pshardGracefulToEnabled)
        && Objects.equals(this.pshardStatsEnabled, elasticCloudSettingsUpdate.pshardStatsEnabled)
        && Objects.equals(this.slmStatsEnabled, elasticCloudSettingsUpdate.slmStatsEnabled)
        && Objects.equals(this.tags, elasticCloudSettingsUpdate.tags)
        && Objects.equals(this.url, elasticCloudSettingsUpdate.url)
        && Objects.equals(
            this.additionalProperties, elasticCloudSettingsUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catAllocationStatsEnabled,
        detailedIndexStatsEnabled,
        indexStatsEnabled,
        pendingTaskStatsEnabled,
        pshardGracefulToEnabled,
        pshardStatsEnabled,
        slmStatsEnabled,
        tags,
        url,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticCloudSettingsUpdate {\n");
    sb.append("    catAllocationStatsEnabled: ")
        .append(toIndentedString(catAllocationStatsEnabled))
        .append("\n");
    sb.append("    detailedIndexStatsEnabled: ")
        .append(toIndentedString(detailedIndexStatsEnabled))
        .append("\n");
    sb.append("    indexStatsEnabled: ").append(toIndentedString(indexStatsEnabled)).append("\n");
    sb.append("    pendingTaskStatsEnabled: ")
        .append(toIndentedString(pendingTaskStatsEnabled))
        .append("\n");
    sb.append("    pshardGracefulToEnabled: ")
        .append(toIndentedString(pshardGracefulToEnabled))
        .append("\n");
    sb.append("    pshardStatsEnabled: ").append(toIndentedString(pshardStatsEnabled)).append("\n");
    sb.append("    slmStatsEnabled: ").append(toIndentedString(slmStatsEnabled)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
