/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Usage Summary by tag for a given organization. */
@JsonPropertyOrder({
  UsageAttributionBody.JSON_PROPERTY_MONTH,
  UsageAttributionBody.JSON_PROPERTY_ORG_NAME,
  UsageAttributionBody.JSON_PROPERTY_PUBLIC_ID,
  UsageAttributionBody.JSON_PROPERTY_TAG_CONFIG_SOURCE,
  UsageAttributionBody.JSON_PROPERTY_TAGS,
  UsageAttributionBody.JSON_PROPERTY_UPDATED_AT,
  UsageAttributionBody.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageAttributionBody {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MONTH = "month";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime month;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_TAG_CONFIG_SOURCE = "tag_config_source";
  private String tagConfigSource;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<Map<String, List<String>>> tags =
      JsonNullable.<Map<String, List<String>>>undefined();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_VALUES = "values";
  private UsageAttributionValues values;

  public UsageAttributionBody month(OffsetDateTime month) {
    this.month = month;
    return this;
  }

  /**
   * Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM].
   *
   * @return month
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getMonth() {
    return month;
  }

  public void setMonth(OffsetDateTime month) {
    this.month = month;
  }

  public UsageAttributionBody orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The name of the organization.
   *
   * @return orgName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public UsageAttributionBody publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public UsageAttributionBody tagConfigSource(String tagConfigSource) {
    this.tagConfigSource = tagConfigSource;
    return this;
  }

  /**
   * The source of the usage attribution tag configuration and the selected tags in the format
   * <code>
   * &lt;source_org_name&gt;:::&lt;selected tag 1&gt;///&lt;selected tag 2&gt;///&lt;selected tag 3&gt;
   * </code>.
   *
   * @return tagConfigSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_CONFIG_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTagConfigSource() {
    return tagConfigSource;
  }

  public void setTagConfigSource(String tagConfigSource) {
    this.tagConfigSource = tagConfigSource;
  }

  public UsageAttributionBody tags(Map<String, List<String>> tags) {
    this.tags = JsonNullable.<Map<String, List<String>>>of(tags);
    return this;
  }

  public UsageAttributionBody putTagsItem(String key, List<String> tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<Map<String, List<String>>>of(new HashMap<>());
    }
    try {
      this.tags.get().put(key, tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Tag keys and values.
   *
   * <p>A <code>null</code> value here means that the requested tag breakdown cannot be applied
   * because it does not match the <a
   * href="https://docs.datadoghq.com/account_management/billing/usage_attribution/#getting-started">tags
   * configured for usage attribution</a>. In this scenario the API returns the total usage, not
   * broken down by tags.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, List<String>> getTags() {
    return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, List<String>>> getTags_JsonNullable() {
    return tags;
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<Map<String, List<String>>> tags) {
    this.tags = tags;
  }

  public void setTags(Map<String, List<String>> tags) {
    this.tags = JsonNullable.<Map<String, List<String>>>of(tags);
  }

  public UsageAttributionBody updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Shows the the most recent hour in the current months for all organizations for which all usages
   * were calculated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public UsageAttributionBody values(UsageAttributionValues values) {
    this.values = values;
    this.unparsed |= values.unparsed;
    return this;
  }

  /**
   * Fields in Usage Summary by tag(s).
   *
   * @return values
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageAttributionValues getValues() {
    return values;
  }

  public void setValues(UsageAttributionValues values) {
    this.values = values;
  }

  /** Return true if this UsageAttributionBody object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAttributionBody usageAttributionBody = (UsageAttributionBody) o;
    return Objects.equals(this.month, usageAttributionBody.month)
        && Objects.equals(this.orgName, usageAttributionBody.orgName)
        && Objects.equals(this.publicId, usageAttributionBody.publicId)
        && Objects.equals(this.tagConfigSource, usageAttributionBody.tagConfigSource)
        && Objects.equals(this.tags, usageAttributionBody.tags)
        && Objects.equals(this.updatedAt, usageAttributionBody.updatedAt)
        && Objects.equals(this.values, usageAttributionBody.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, orgName, publicId, tagConfigSource, tags, updatedAt, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAttributionBody {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    tagConfigSource: ").append(toIndentedString(tagConfigSource)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("}");
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
