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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of an inferred journey candidate. */
@JsonPropertyOrder({
  DemInferredJourneyCandidateAttributes.JSON_PROPERTY_CREATED_AT,
  DemInferredJourneyCandidateAttributes.JSON_PROPERTY_DESCRIPTION,
  DemInferredJourneyCandidateAttributes.JSON_PROPERTY_JOURNEY_RUM,
  DemInferredJourneyCandidateAttributes.JSON_PROPERTY_NAME,
  DemInferredJourneyCandidateAttributes.JSON_PROPERTY_ORG_ID,
  DemInferredJourneyCandidateAttributes.JSON_PROPERTY_RANK,
  DemInferredJourneyCandidateAttributes.JSON_PROPERTY_TAGS,
  DemInferredJourneyCandidateAttributes.JSON_PROPERTY_TEST_SUITE,
  DemInferredJourneyCandidateAttributes.JSON_PROPERTY_VARIANTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DemInferredJourneyCandidateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_JOURNEY_RUM = "journey_rum";
  private DemJourneyRum journeyRum;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_RANK = "rank";
  private JsonNullable<Long> rank = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TEST_SUITE = "test_suite";
  private DemTestSuiteNested testSuite;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<DemVariant> variants = new ArrayList<>();

  public DemInferredJourneyCandidateAttributes() {}

  @JsonCreator
  public DemInferredJourneyCandidateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_JOURNEY_RUM) DemJourneyRum journeyRum,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Long orgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANTS) List<DemVariant> variants) {
    this.createdAt = createdAt;
    this.journeyRum = journeyRum;
    this.unparsed |= journeyRum.unparsed;
    this.name = name;
    this.orgId = orgId;
    this.tags = tags;
    this.variants = variants;
    for (DemVariant item : variants) {
      this.unparsed |= item.unparsed;
    }
  }

  /**
   * Timestamp when the inferred journey was first observed.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public DemInferredJourneyCandidateAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * An optional description of the inferred journey.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public DemInferredJourneyCandidateAttributes journeyRum(DemJourneyRum journeyRum) {
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

  public DemInferredJourneyCandidateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the inferred journey.
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
   * The organization ID that owns this inferred journey.
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrgId() {
    return orgId;
  }

  /**
   * Ranking score of the inferred journey candidate.
   *
   * @return rank
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getRank() {

    if (rank == null) {
      rank = JsonNullable.<Long>undefined();
    }
    return rank.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getRank_JsonNullable() {
    return rank;
  }

  @JsonProperty(JSON_PROPERTY_RANK)
  private void setRank_JsonNullable(JsonNullable<Long> rank) {
    this.rank = rank;
  }

  public DemInferredJourneyCandidateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DemInferredJourneyCandidateAttributes addTagsItem(String tagsItem) {
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

  public DemInferredJourneyCandidateAttributes testSuite(DemTestSuiteNested testSuite) {
    this.testSuite = testSuite;
    this.unparsed |= testSuite.unparsed;
    return this;
  }

  /**
   * A test suite associated with a DEM resource.
   *
   * @return testSuite
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_SUITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DemTestSuiteNested getTestSuite() {
    return testSuite;
  }

  public void setTestSuite(DemTestSuiteNested testSuite) {
    this.testSuite = testSuite;
    if (testSuite != null) {
      this.unparsed |= testSuite.unparsed;
    }
  }

  public DemInferredJourneyCandidateAttributes variants(List<DemVariant> variants) {
    this.variants = variants;
    for (DemVariant item : variants) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DemInferredJourneyCandidateAttributes addVariantsItem(DemVariant variantsItem) {
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
   * @return DemInferredJourneyCandidateAttributes
   */
  @JsonAnySetter
  public DemInferredJourneyCandidateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DemInferredJourneyCandidateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemInferredJourneyCandidateAttributes demInferredJourneyCandidateAttributes =
        (DemInferredJourneyCandidateAttributes) o;
    return Objects.equals(this.createdAt, demInferredJourneyCandidateAttributes.createdAt)
        && Objects.equals(this.description, demInferredJourneyCandidateAttributes.description)
        && Objects.equals(this.journeyRum, demInferredJourneyCandidateAttributes.journeyRum)
        && Objects.equals(this.name, demInferredJourneyCandidateAttributes.name)
        && Objects.equals(this.orgId, demInferredJourneyCandidateAttributes.orgId)
        && Objects.equals(this.rank, demInferredJourneyCandidateAttributes.rank)
        && Objects.equals(this.tags, demInferredJourneyCandidateAttributes.tags)
        && Objects.equals(this.testSuite, demInferredJourneyCandidateAttributes.testSuite)
        && Objects.equals(this.variants, demInferredJourneyCandidateAttributes.variants)
        && Objects.equals(
            this.additionalProperties, demInferredJourneyCandidateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        description,
        journeyRum,
        name,
        orgId,
        rank,
        tags,
        testSuite,
        variants,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemInferredJourneyCandidateAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    journeyRum: ").append(toIndentedString(journeyRum)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    testSuite: ").append(toIndentedString(testSuite)).append("\n");
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
