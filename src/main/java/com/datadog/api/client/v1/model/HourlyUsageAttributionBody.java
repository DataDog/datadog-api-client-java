/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The usage for one set of tags for one hour. */
@JsonPropertyOrder({
  HourlyUsageAttributionBody.JSON_PROPERTY_HOUR,
  HourlyUsageAttributionBody.JSON_PROPERTY_ORG_NAME,
  HourlyUsageAttributionBody.JSON_PROPERTY_PUBLIC_ID,
  HourlyUsageAttributionBody.JSON_PROPERTY_REGION,
  HourlyUsageAttributionBody.JSON_PROPERTY_TAG_CONFIG_SOURCE,
  HourlyUsageAttributionBody.JSON_PROPERTY_TAGS,
  HourlyUsageAttributionBody.JSON_PROPERTY_TOTAL_USAGE_SUM,
  HourlyUsageAttributionBody.JSON_PROPERTY_UPDATED_AT,
  HourlyUsageAttributionBody.JSON_PROPERTY_USAGE_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HourlyUsageAttributionBody {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_TAG_CONFIG_SOURCE = "tag_config_source";
  private String tagConfigSource;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<Map<String, List<String>>> tags =
      JsonNullable.<Map<String, List<String>>>undefined();

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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public HourlyUsageAttributionBody region(String region) {
    this.region = region;
    return this;
  }

  /**
   * The region of the Datadog instance that the organization belongs to.
   *
   * @return region
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_CONFIG_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTagConfigSource() {
    return tagConfigSource;
  }

  public void setTagConfigSource(String tagConfigSource) {
    this.tagConfigSource = tagConfigSource;
  }

  public HourlyUsageAttributionBody tags(Map<String, List<String>> tags) {
    this.tags = JsonNullable.<Map<String, List<String>>>of(tags);
    return this;
  }

  public HourlyUsageAttributionBody putTagsItem(String key, List<String> tagsItem) {
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

  public HourlyUsageAttributionBody totalUsageSum(Double totalUsageSum) {
    this.totalUsageSum = totalUsageSum;
    return this;
  }

  /**
   * Total product usage for the given tags within the hour.
   *
   * @return totalUsageSum
   */
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
   * Supported products for hourly usage attribution requests. The following values have been
   * <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>
   * estimated_ingested_spans_usage</code>.
   *
   * @return usageType
   */
  @jakarta.annotation.Nullable
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
   * @return HourlyUsageAttributionBody
   */
  @JsonAnySetter
  public HourlyUsageAttributionBody putAdditionalProperty(String key, Object value) {
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
        && Objects.equals(this.region, hourlyUsageAttributionBody.region)
        && Objects.equals(this.tagConfigSource, hourlyUsageAttributionBody.tagConfigSource)
        && Objects.equals(this.tags, hourlyUsageAttributionBody.tags)
        && Objects.equals(this.totalUsageSum, hourlyUsageAttributionBody.totalUsageSum)
        && Objects.equals(this.updatedAt, hourlyUsageAttributionBody.updatedAt)
        && Objects.equals(this.usageType, hourlyUsageAttributionBody.usageType)
        && Objects.equals(
            this.additionalProperties, hourlyUsageAttributionBody.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        hour,
        orgName,
        publicId,
        region,
        tagConfigSource,
        tags,
        totalUsageSum,
        updatedAt,
        usageType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HourlyUsageAttributionBody {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    tagConfigSource: ").append(toIndentedString(tagConfigSource)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    totalUsageSum: ").append(toIndentedString(totalUsageSum)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
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
