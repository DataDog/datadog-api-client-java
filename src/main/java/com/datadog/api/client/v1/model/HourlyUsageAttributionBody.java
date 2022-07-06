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

/** The usage for one set of tags for one hour. */
@JsonPropertyOrder({
  HourlyUsageAttributionBody.JSON_PROPERTY_HOUR,
  HourlyUsageAttributionBody.JSON_PROPERTY_ORG_NAME,
  HourlyUsageAttributionBody.JSON_PROPERTY_PUBLIC_ID,
  HourlyUsageAttributionBody.JSON_PROPERTY_TAG_CONFIG_SOURCE,
  HourlyUsageAttributionBody.JSON_PROPERTY_TAGS,
  HourlyUsageAttributionBody.JSON_PROPERTY_TOTAL_USAGE_SUM,
  HourlyUsageAttributionBody.JSON_PROPERTY_UPDATED_AT,
  HourlyUsageAttributionBody.JSON_PROPERTY_USAGE_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HourlyUsageAttributionBody {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOUR = "hour";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_TAG_CONFIG_SOURCE = "tag_config_source";
  private String tagConfigSource;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, List<String>> tags = null;

  public static final String JSON_PROPERTY_TOTAL_USAGE_SUM = "total_usage_sum";
  private Double totalUsageSum;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_USAGE_TYPE = "usage_type";
  private HourlyUsageAttributionUsageType usageType;

  public HourlyUsageAttributionBody hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

  /**
   * The hour for the usage.
   *
   * @return hour
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getHour() {
    return hour;
  }

  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }

  public HourlyUsageAttributionBody orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The name of the organization.
   *
   * @return orgName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public HourlyUsageAttributionBody publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public HourlyUsageAttributionBody tagConfigSource(String tagConfigSource) {
    this.tagConfigSource = tagConfigSource;
    return this;
  }

  /**
   * The source of the usage attribution tag configuration and the selected tags in the format of
   * <code>
   * &lt;source_org_name&gt;:::&lt;selected tag 1&gt;///&lt;selected tag 2&gt;///&lt;selected tag 3&gt;
   * </code>.
   *
   * @return tagConfigSource
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_CONFIG_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTagConfigSource() {
    return tagConfigSource;
  }

  public void setTagConfigSource(String tagConfigSource) {
    this.tagConfigSource = tagConfigSource;
  }

  public HourlyUsageAttributionBody tags(Map<String, List<String>> tags) {
    this.tags = tags;
    return this;
  }

  public HourlyUsageAttributionBody putTagsItem(String key, List<String> tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Usage Summary by tag name.
   *
   * @return tags
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, List<String>> getTags() {
    return tags;
  }

  public void setTags(Map<String, List<String>> tags) {
    this.tags = tags;
  }

  public HourlyUsageAttributionBody totalUsageSum(Double totalUsageSum) {
    this.totalUsageSum = totalUsageSum;
    return this;
  }

  /**
   * Total product usage for the given tags within the hour.
   *
   * @return totalUsageSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_USAGE_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotalUsageSum() {
    return totalUsageSum;
  }

  public void setTotalUsageSum(Double totalUsageSum) {
    this.totalUsageSum = totalUsageSum;
  }

  public HourlyUsageAttributionBody updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Shows the most recent hour in the current month for all organizations where usages are
   * calculated.
   *
   * @return updatedAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public HourlyUsageAttributionBody usageType(HourlyUsageAttributionUsageType usageType) {
    this.usageType = usageType;
    this.unparsed |= !usageType.isValid();
    return this;
  }

  /**
   * Supported products for hourly usage attribution requests.
   *
   * @return usageType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HourlyUsageAttributionUsageType getUsageType() {
    return usageType;
  }

  public void setUsageType(HourlyUsageAttributionUsageType usageType) {
    if (!usageType.isValid()) {
      this.unparsed = true;
    }
    this.usageType = usageType;
  }

  /** Return true if this HourlyUsageAttributionBody object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourlyUsageAttributionBody hourlyUsageAttributionBody = (HourlyUsageAttributionBody) o;
    return Objects.equals(this.hour, hourlyUsageAttributionBody.hour)
        && Objects.equals(this.orgName, hourlyUsageAttributionBody.orgName)
        && Objects.equals(this.publicId, hourlyUsageAttributionBody.publicId)
        && Objects.equals(this.tagConfigSource, hourlyUsageAttributionBody.tagConfigSource)
        && Objects.equals(this.tags, hourlyUsageAttributionBody.tags)
        && Objects.equals(this.totalUsageSum, hourlyUsageAttributionBody.totalUsageSum)
        && Objects.equals(this.updatedAt, hourlyUsageAttributionBody.updatedAt)
        && Objects.equals(this.usageType, hourlyUsageAttributionBody.usageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        hour, orgName, publicId, tagConfigSource, tags, totalUsageSum, updatedAt, usageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HourlyUsageAttributionBody {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    tagConfigSource: ").append(toIndentedString(tagConfigSource)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    totalUsageSum: ").append(toIndentedString(totalUsageSum)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
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
