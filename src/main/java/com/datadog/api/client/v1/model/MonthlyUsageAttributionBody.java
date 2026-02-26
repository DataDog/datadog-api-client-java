/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Usage Summary by tag for a given organization.</p>
 */
@JsonPropertyOrder({
  MonthlyUsageAttributionBody.JSON_PROPERTY_MONTH,
  MonthlyUsageAttributionBody.JSON_PROPERTY_ORG_NAME,
  MonthlyUsageAttributionBody.JSON_PROPERTY_PUBLIC_ID,
  MonthlyUsageAttributionBody.JSON_PROPERTY_REGION,
  MonthlyUsageAttributionBody.JSON_PROPERTY_TAG_CONFIG_SOURCE,
  MonthlyUsageAttributionBody.JSON_PROPERTY_TAGS,
  MonthlyUsageAttributionBody.JSON_PROPERTY_UPDATED_AT,
  MonthlyUsageAttributionBody.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonthlyUsageAttributionBody {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_MONTH = "month";
  private OffsetDateTime month;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_TAG_CONFIG_SOURCE = "tag_config_source";
  private String tagConfigSource;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<Map<String, List<String>>> tags = JsonNullable.<Map<String, List<String>>>undefined();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_VALUES = "values";
  private MonthlyUsageAttributionValues values;

  public MonthlyUsageAttributionBody month(OffsetDateTime month) {
    this.month = month;
    return this;
  }

  /**
   * <p>Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM].</p>
   * @return month
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MONTH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getMonth() {
        return month;
      }
  public void setMonth(OffsetDateTime month) {
    this.month = month;
  }
  public MonthlyUsageAttributionBody orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * <p>The name of the organization.</p>
   * @return orgName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORG_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOrgName() {
        return orgName;
      }
  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }
  public MonthlyUsageAttributionBody publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * <p>The organization public ID.</p>
   * @return publicId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPublicId() {
        return publicId;
      }
  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }
  public MonthlyUsageAttributionBody region(String region) {
    this.region = region;
    return this;
  }

  /**
   * <p>The region of the Datadog instance that the organization belongs to.</p>
   * @return region
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REGION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRegion() {
        return region;
      }
  public void setRegion(String region) {
    this.region = region;
  }
  public MonthlyUsageAttributionBody tagConfigSource(String tagConfigSource) {
    this.tagConfigSource = tagConfigSource;
    return this;
  }

  /**
   * <p>The source of the usage attribution tag configuration and the selected tags in the format <code>&lt;source_org_name&gt;:::&lt;selected tag 1&gt;///&lt;selected tag 2&gt;///&lt;selected tag 3&gt;</code>.</p>
   * @return tagConfigSource
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAG_CONFIG_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTagConfigSource() {
        return tagConfigSource;
      }
  public void setTagConfigSource(String tagConfigSource) {
    this.tagConfigSource = tagConfigSource;
  }
  public MonthlyUsageAttributionBody tags(Map<String, List<String>> tags) {
    this.tags = JsonNullable.<Map<String, List<String>>>of(tags);
    return this;
  }
  public MonthlyUsageAttributionBody putTagsItem(String key, List<String> tagsItem) {
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
   * <p>Tag keys and values.</p>
   * <p>A <code>null</code> value here means that the requested tag breakdown cannot be applied because it does not match the <a href="https://docs.datadoghq.com/account_management/billing/usage_attribution/#getting-started">tags
   * configured for usage attribution</a>.
   * In this scenario the API returns the total usage, not broken down by tags.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Map<String, List<String>> getTags() {
        return tags.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, List<String>>> getTags_JsonNullable() {
    return tags;
  }
  @JsonProperty(JSON_PROPERTY_TAGS)public void setTags_JsonNullable(JsonNullable<Map<String, List<String>>> tags) {
    this.tags = tags;
  }
  public void setTags(Map<String, List<String>> tags) {
    this.tags = JsonNullable.<Map<String, List<String>>>of(tags);
  }
  public MonthlyUsageAttributionBody updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>Datetime of the most recent update to the usage values.</p>
   * @return updatedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getUpdatedAt() {
        return updatedAt;
      }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  public MonthlyUsageAttributionBody values(MonthlyUsageAttributionValues values) {
    this.values = values;
    this.unparsed |= values.unparsed;
    return this;
  }

  /**
   * <p>Fields in Usage Summary by tag(s).
   * The following values have been <strong>deprecated</strong>: <code>estimated_indexed_spans_usage</code>, <code>estimated_indexed_spans_percentage</code>, <code>estimated_ingested_spans_usage</code>, <code>estimated_ingested_spans_percentage</code>.</p>
   * @return values
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALUES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonthlyUsageAttributionValues getValues() {
        return values;
      }
  public void setValues(MonthlyUsageAttributionValues values) {
    this.values = values;
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
   * @return MonthlyUsageAttributionBody
   */
  @JsonAnySetter
  public MonthlyUsageAttributionBody putAdditionalProperty(String key, Object value) {
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
   * Return true if this MonthlyUsageAttributionBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonthlyUsageAttributionBody monthlyUsageAttributionBody = (MonthlyUsageAttributionBody) o;
    return Objects.equals(this.month, monthlyUsageAttributionBody.month) && Objects.equals(this.orgName, monthlyUsageAttributionBody.orgName) && Objects.equals(this.publicId, monthlyUsageAttributionBody.publicId) && Objects.equals(this.region, monthlyUsageAttributionBody.region) && Objects.equals(this.tagConfigSource, monthlyUsageAttributionBody.tagConfigSource) && Objects.equals(this.tags, monthlyUsageAttributionBody.tags) && Objects.equals(this.updatedAt, monthlyUsageAttributionBody.updatedAt) && Objects.equals(this.values, monthlyUsageAttributionBody.values) && Objects.equals(this.additionalProperties, monthlyUsageAttributionBody.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(month,orgName,publicId,region,tagConfigSource,tags,updatedAt,values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonthlyUsageAttributionBody {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    tagConfigSource: ").append(toIndentedString(tagConfigSource)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
