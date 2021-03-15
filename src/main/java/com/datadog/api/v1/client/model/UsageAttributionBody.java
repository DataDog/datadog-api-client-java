/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Usage Summary by tag for a given organization. */
@ApiModel(description = "Usage Summary by tag for a given organization.")
@JsonPropertyOrder({
  UsageAttributionBody.JSON_PROPERTY_MONTH,
  UsageAttributionBody.JSON_PROPERTY_ORG_NAME,
  UsageAttributionBody.JSON_PROPERTY_PUBLIC_ID,
  UsageAttributionBody.JSON_PROPERTY_TAGS,
  UsageAttributionBody.JSON_PROPERTY_UPDATED_AT,
  UsageAttributionBody.JSON_PROPERTY_VALUES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageAttributionBody {
  public static final String JSON_PROPERTY_MONTH = "month";
  private OffsetDateTime month;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, List<String>> tags = null;

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM].")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the organization.")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization public ID.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public UsageAttributionBody tags(Map<String, List<String>> tags) {
    this.tags = tags;
    return this;
  }

  public UsageAttributionBody putTagsItem(String key, List<String> tagsItem) {
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
  @ApiModelProperty(value = "Usage Summary by tag name.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, List<String>> getTags() {
    return tags;
  }

  public void setTags(Map<String, List<String>> tags) {
    this.tags = tags;
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
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Shows the the most recent hour in the current months for all organizations for which"
              + " all usages were calculated.")
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
    return this;
  }

  /**
   * Get values
   *
   * @return values
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
        && Objects.equals(this.tags, usageAttributionBody.tags)
        && Objects.equals(this.updatedAt, usageAttributionBody.updatedAt)
        && Objects.equals(this.values, usageAttributionBody.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, orgName, publicId, tags, updatedAt, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAttributionBody {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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
