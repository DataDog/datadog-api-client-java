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

/**
 * Settings for updating the Elastic Cloud integration account. Only the fields provided are
 * changed.
 */
@JsonPropertyOrder({
  ElasticCloudIntegrationAccountSettingsUpdate.JSON_PROPERTY_TAGS,
  ElasticCloudIntegrationAccountSettingsUpdate.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticCloudIntegrationAccountSettingsUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TAGS = "tags";
  private String tags;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public ElasticCloudIntegrationAccountSettingsUpdate tags(String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Comma-separated list of custom tags for this Elastic Cloud deployment.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public ElasticCloudIntegrationAccountSettingsUpdate url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Elastic Cloud deployment URL.
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

  /** Return true if this ElasticCloudIntegrationAccountSettingsUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticCloudIntegrationAccountSettingsUpdate elasticCloudIntegrationAccountSettingsUpdate =
        (ElasticCloudIntegrationAccountSettingsUpdate) o;
    return Objects.equals(this.tags, elasticCloudIntegrationAccountSettingsUpdate.tags)
        && Objects.equals(this.url, elasticCloudIntegrationAccountSettingsUpdate.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticCloudIntegrationAccountSettingsUpdate {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
