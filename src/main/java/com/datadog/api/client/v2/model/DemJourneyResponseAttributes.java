/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes returned in a DEM journey response. */
@JsonPropertyOrder({
  DemJourneyResponseAttributes.JSON_PROPERTY_CREATED_AT,
  DemJourneyResponseAttributes.JSON_PROPERTY_CREATED_BY,
  DemJourneyResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  DemJourneyResponseAttributes.JSON_PROPERTY_JOURNEY_RUM,
  DemJourneyResponseAttributes.JSON_PROPERTY_NAME,
  DemJourneyResponseAttributes.JSON_PROPERTY_ORG_ID,
  DemJourneyResponseAttributes.JSON_PROPERTY_TAGS,
  DemJourneyResponseAttributes.JSON_PROPERTY_TEST_SUITE,
  DemJourneyResponseAttributes.JSON_PROPERTY_UPDATED_AT,
  DemJourneyResponseAttributes.JSON_PROPERTY_UPDATED_BY,
  DemJourneyResponseAttributes.JSON_PROPERTY_VARIANTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DemJourneyResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private DemUser createdBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_JOURNEY_RUM = "journey_rum";
  private DemJourneyRum journeyRum;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TEST_SUITE = "test_suite";
  private DemTestSuiteNested testSuite;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private DemUser updatedBy;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<DemVariant> variants = new ArrayList<>();

  public DemJourneyResponseAttributes() {}

  @JsonCreator
  public DemJourneyResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) DemUser createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_JOURNEY_RUM) DemJourneyRum journeyRum,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Long orgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEST_SUITE) DemTestSuiteNested testSuite,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_BY) DemUser updatedBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANTS) List<DemVariant> variants) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    this.description = description;
    if (description != null) {}
    this.journeyRum = journeyRum;
    this.unparsed |= journeyRum.unparsed;
    this.name = name;
    this.orgId = orgId;
    this.tags = tags;
    this.testSuite = testSuite;
    this.unparsed |= testSuite.unparsed;
    this.updatedAt = updatedAt;
    if (updatedAt != null) {}
    this.updatedBy = updatedBy;
    this.unparsed |= updatedBy.unparsed;
    this.variants = variants;
    for (DemVariant item : variants) {
      this.unparsed |= item.unparsed;
    }
  }

  /**
   * The timestamp when the journey was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public DemJourneyResponseAttributes createdBy(DemUser createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * A Datadog user associated with a DEM operation.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DemUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(DemUser createdBy) {
    this.createdBy = createdBy;
    if (createdBy != null) {
      this.unparsed |= createdBy.unparsed;
    }
  }

  public DemJourneyResponseAttributes description(String description) {
    this.description = description;
    if (description != null) {}
    return this;
  }

  /**
   * An optional human-readable description of the journey.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DemJourneyResponseAttributes journeyRum(DemJourneyRum journeyRum) {
    this.journeyRum = journeyRum;
    this.unparsed |= journeyRum.unparsed;
    return this;
  }

  /**
   * The RUM definition for a DEM journey.
   *
   * @return journeyRum
   */
  @JsonProperty(JSON_PROPERTY_JOURNEY_RUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DemJourneyRum getJourneyRum() {
    return journeyRum;
  }

  public void setJourneyRum(DemJourneyRum journeyRum) {
    this.journeyRum = journeyRum;
    if (journeyRum != null) {
      this.unparsed |= journeyRum.unparsed;
    }
  }

  public DemJourneyResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the DEM journey.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The organization ID that owns this journey.
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrgId() {
    return orgId;
  }

  public DemJourneyResponseAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DemJourneyResponseAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tags associated with a DEM resource.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public DemJourneyResponseAttributes testSuite(DemTestSuiteNested testSuite) {
    this.testSuite = testSuite;
    this.unparsed |= testSuite.unparsed;
    return this;
  }

  /**
   * A test suite associated with a DEM resource.
   *
   * @return testSuite
   */
  @JsonProperty(JSON_PROPERTY_TEST_SUITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DemTestSuiteNested getTestSuite() {
    return testSuite;
  }

  public void setTestSuite(DemTestSuiteNested testSuite) {
    this.testSuite = testSuite;
    if (testSuite != null) {
      this.unparsed |= testSuite.unparsed;
    }
  }

  /**
   * The timestamp when the journey was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public DemJourneyResponseAttributes updatedBy(DemUser updatedBy) {
    this.updatedBy = updatedBy;
    this.unparsed |= updatedBy.unparsed;
    return this;
  }

  /**
   * A Datadog user associated with a DEM operation.
   *
   * @return updatedBy
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DemUser getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(DemUser updatedBy) {
    this.updatedBy = updatedBy;
    if (updatedBy != null) {
      this.unparsed |= updatedBy.unparsed;
    }
  }

  public DemJourneyResponseAttributes variants(List<DemVariant> variants) {
    this.variants = variants;
    for (DemVariant item : variants) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DemJourneyResponseAttributes addVariantsItem(DemVariant variantsItem) {
    this.variants.add(variantsItem);
    this.unparsed |= variantsItem.unparsed;
    return this;
  }

  /**
   * List of variants associated with a DEM journey.
   *
   * @return variants
   */
  @JsonProperty(JSON_PROPERTY_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DemVariant> getVariants() {
    return variants;
  }

  public void setVariants(List<DemVariant> variants) {
    this.variants = variants;
    if (variants != null) {
      for (DemVariant item : variants) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return DemJourneyResponseAttributes
   */
  @JsonAnySetter
  public DemJourneyResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DemJourneyResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemJourneyResponseAttributes demJourneyResponseAttributes = (DemJourneyResponseAttributes) o;
    return Objects.equals(this.createdAt, demJourneyResponseAttributes.createdAt)
        && Objects.equals(this.createdBy, demJourneyResponseAttributes.createdBy)
        && Objects.equals(this.description, demJourneyResponseAttributes.description)
        && Objects.equals(this.journeyRum, demJourneyResponseAttributes.journeyRum)
        && Objects.equals(this.name, demJourneyResponseAttributes.name)
        && Objects.equals(this.orgId, demJourneyResponseAttributes.orgId)
        && Objects.equals(this.tags, demJourneyResponseAttributes.tags)
        && Objects.equals(this.testSuite, demJourneyResponseAttributes.testSuite)
        && Objects.equals(this.updatedAt, demJourneyResponseAttributes.updatedAt)
        && Objects.equals(this.updatedBy, demJourneyResponseAttributes.updatedBy)
        && Objects.equals(this.variants, demJourneyResponseAttributes.variants)
        && Objects.equals(
            this.additionalProperties, demJourneyResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        description,
        journeyRum,
        name,
        orgId,
        tags,
        testSuite,
        updatedAt,
        updatedBy,
        variants,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemJourneyResponseAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    journeyRum: ").append(toIndentedString(journeyRum)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    testSuite: ").append(toIndentedString(testSuite)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
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
