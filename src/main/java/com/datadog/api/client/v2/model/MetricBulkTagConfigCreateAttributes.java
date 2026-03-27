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
   * <p>Optional parameters for bulk creating metric tag configurations.</p>
 */
@JsonPropertyOrder({
  MetricBulkTagConfigCreateAttributes.JSON_PROPERTY_EMAILS,
  MetricBulkTagConfigCreateAttributes.JSON_PROPERTY_EXCLUDE_TAGS_MODE,
  MetricBulkTagConfigCreateAttributes.JSON_PROPERTY_INCLUDE_ACTIVELY_QUERIED_TAGS_WINDOW,
  MetricBulkTagConfigCreateAttributes.JSON_PROPERTY_OVERRIDE_EXISTING_CONFIGURATIONS,
  MetricBulkTagConfigCreateAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricBulkTagConfigCreateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMAILS = "emails";
  private List<String> emails = null;

  public static final String JSON_PROPERTY_EXCLUDE_TAGS_MODE = "exclude_tags_mode";
  private Boolean excludeTagsMode;

  public static final String JSON_PROPERTY_INCLUDE_ACTIVELY_QUERIED_TAGS_WINDOW = "include_actively_queried_tags_window";
  private Double includeActivelyQueriedTagsWindow;

  public static final String JSON_PROPERTY_OVERRIDE_EXISTING_CONFIGURATIONS = "override_existing_configurations";
  private Boolean overrideExistingConfigurations;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public MetricBulkTagConfigCreateAttributes emails(List<String> emails) {
    this.emails = emails;
    return this;
  }
  public MetricBulkTagConfigCreateAttributes addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

  /**
   * <p>A list of account emails to notify when the configuration is applied.</p>
   * @return emails
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EMAILS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getEmails() {
        return emails;
      }
  public void setEmails(List<String> emails) {
    this.emails = emails;
  }
  public MetricBulkTagConfigCreateAttributes excludeTagsMode(Boolean excludeTagsMode) {
    this.excludeTagsMode = excludeTagsMode;
    return this;
  }

  /**
   * <p>When set to true, the configuration will exclude the configured tags and include any other submitted tags.
   * When set to false, the configuration will include the configured tags and exclude any other submitted tags.
   * Defaults to false.</p>
   * @return excludeTagsMode
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXCLUDE_TAGS_MODE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getExcludeTagsMode() {
        return excludeTagsMode;
      }
  public void setExcludeTagsMode(Boolean excludeTagsMode) {
    this.excludeTagsMode = excludeTagsMode;
  }
  public MetricBulkTagConfigCreateAttributes includeActivelyQueriedTagsWindow(Double includeActivelyQueriedTagsWindow) {
    this.includeActivelyQueriedTagsWindow = includeActivelyQueriedTagsWindow;
    return this;
  }

  /**
   * <p>When provided, all tags that have been actively queried are
   * configured (and, therefore, remain queryable) for each metric that
   * matches the given prefix.  Minimum value is 1 second, and maximum
   * value is 7,776,000 seconds (90 days).</p>
   * minimum: 1
   * maximum: 7776000
   * @return includeActivelyQueriedTagsWindow
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCLUDE_ACTIVELY_QUERIED_TAGS_WINDOW)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getIncludeActivelyQueriedTagsWindow() {
        return includeActivelyQueriedTagsWindow;
      }
  public void setIncludeActivelyQueriedTagsWindow(Double includeActivelyQueriedTagsWindow) {
    this.includeActivelyQueriedTagsWindow = includeActivelyQueriedTagsWindow;
  }
  public MetricBulkTagConfigCreateAttributes overrideExistingConfigurations(Boolean overrideExistingConfigurations) {
    this.overrideExistingConfigurations = overrideExistingConfigurations;
    return this;
  }

  /**
   * <p>When set to true, the configuration overrides any existing
   * configurations for the given metric with the new set of tags in this
   * configuration request. If false, old configurations are kept and
   * are merged with the set of tags in this configuration request.
   * Defaults to true.</p>
   * @return overrideExistingConfigurations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OVERRIDE_EXISTING_CONFIGURATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getOverrideExistingConfigurations() {
        return overrideExistingConfigurations;
      }
  public void setOverrideExistingConfigurations(Boolean overrideExistingConfigurations) {
    this.overrideExistingConfigurations = overrideExistingConfigurations;
  }
  public MetricBulkTagConfigCreateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public MetricBulkTagConfigCreateAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>A list of tag names to apply to the configuration.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return MetricBulkTagConfigCreateAttributes
   */
  @JsonAnySetter
  public MetricBulkTagConfigCreateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this MetricBulkTagConfigCreateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricBulkTagConfigCreateAttributes metricBulkTagConfigCreateAttributes = (MetricBulkTagConfigCreateAttributes) o;
    return Objects.equals(this.emails, metricBulkTagConfigCreateAttributes.emails) && Objects.equals(this.excludeTagsMode, metricBulkTagConfigCreateAttributes.excludeTagsMode) && Objects.equals(this.includeActivelyQueriedTagsWindow, metricBulkTagConfigCreateAttributes.includeActivelyQueriedTagsWindow) && Objects.equals(this.overrideExistingConfigurations, metricBulkTagConfigCreateAttributes.overrideExistingConfigurations) && Objects.equals(this.tags, metricBulkTagConfigCreateAttributes.tags) && Objects.equals(this.additionalProperties, metricBulkTagConfigCreateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(emails,excludeTagsMode,includeActivelyQueriedTagsWindow,overrideExistingConfigurations,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricBulkTagConfigCreateAttributes {\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    excludeTagsMode: ").append(toIndentedString(excludeTagsMode)).append("\n");
    sb.append("    includeActivelyQueriedTagsWindow: ").append(toIndentedString(includeActivelyQueriedTagsWindow)).append("\n");
    sb.append("    overrideExistingConfigurations: ").append(toIndentedString(overrideExistingConfigurations)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
