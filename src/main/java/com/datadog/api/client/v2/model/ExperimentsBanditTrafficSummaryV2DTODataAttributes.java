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
import java.util.UUID;

/** What the bandit has observed, as of its latest saved refresh. */
@JsonPropertyOrder({
  ExperimentsBanditTrafficSummaryV2DTODataAttributes.JSON_PROPERTY_DAILY,
  ExperimentsBanditTrafficSummaryV2DTODataAttributes.JSON_PROPERTY_DATA_AS_OF,
  ExperimentsBanditTrafficSummaryV2DTODataAttributes.JSON_PROPERTY_OBSERVATION_COUNTS,
  ExperimentsBanditTrafficSummaryV2DTODataAttributes.JSON_PROPERTY_REFRESH_ID,
  ExperimentsBanditTrafficSummaryV2DTODataAttributes.JSON_PROPERTY_TOTAL_SUBJECTS,
  ExperimentsBanditTrafficSummaryV2DTODataAttributes.JSON_PROPERTY_VARIANTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditTrafficSummaryV2DTODataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DAILY = "daily";
  private List<ExperimentsBanditDailyTrafficV2> daily = new ArrayList<>();

  public static final String JSON_PROPERTY_DATA_AS_OF = "data_as_of";
  private OffsetDateTime dataAsOf;

  public static final String JSON_PROPERTY_OBSERVATION_COUNTS = "observation_counts";
  private ExperimentsBanditObservationCountsV2 observationCounts;

  public static final String JSON_PROPERTY_REFRESH_ID = "refresh_id";
  private UUID refreshId;

  public static final String JSON_PROPERTY_TOTAL_SUBJECTS = "total_subjects";
  private Long totalSubjects;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<ExperimentsBanditTrafficVariantV2> variants = new ArrayList<>();

  public ExperimentsBanditTrafficSummaryV2DTODataAttributes() {}

  @JsonCreator
  public ExperimentsBanditTrafficSummaryV2DTODataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DAILY)
          List<ExperimentsBanditDailyTrafficV2> daily,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_AS_OF) OffsetDateTime dataAsOf,
      @JsonProperty(required = true, value = JSON_PROPERTY_OBSERVATION_COUNTS)
          ExperimentsBanditObservationCountsV2 observationCounts,
      @JsonProperty(required = true, value = JSON_PROPERTY_REFRESH_ID) UUID refreshId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_SUBJECTS) Long totalSubjects,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANTS)
          List<ExperimentsBanditTrafficVariantV2> variants) {
    this.daily = daily;
    for (ExperimentsBanditDailyTrafficV2 item : daily) {
      this.unparsed |= item.unparsed;
    }
    this.dataAsOf = dataAsOf;
    if (dataAsOf != null) {}
    this.observationCounts = observationCounts;
    if (observationCounts != null) {
      this.unparsed |= observationCounts.unparsed;
    }
    this.refreshId = refreshId;
    if (refreshId != null) {}
    this.totalSubjects = totalSubjects;
    this.variants = variants;
    for (ExperimentsBanditTrafficVariantV2 item : variants) {
      this.unparsed |= item.unparsed;
    }
  }

  public ExperimentsBanditTrafficSummaryV2DTODataAttributes daily(
      List<ExperimentsBanditDailyTrafficV2> daily) {
    this.daily = daily;
    for (ExperimentsBanditDailyTrafficV2 item : daily) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsBanditTrafficSummaryV2DTODataAttributes addDailyItem(
      ExperimentsBanditDailyTrafficV2 dailyItem) {
    this.daily.add(dailyItem);
    this.unparsed |= dailyItem.unparsed;
    return this;
  }

  /**
   * Valid observations per arm on the UTC day of their anchor time, for each day from the bandit's
   * start to the data cutoff that overlaps the requested range. Days without any have zero counts.
   * Empty before the first saved refresh.
   *
   * @return daily
   */
  @JsonProperty(JSON_PROPERTY_DAILY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ExperimentsBanditDailyTrafficV2> getDaily() {
    return daily;
  }

  public void setDaily(List<ExperimentsBanditDailyTrafficV2> daily) {
    this.daily = daily;
    if (daily != null) {
      for (ExperimentsBanditDailyTrafficV2 item : daily) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsBanditTrafficSummaryV2DTODataAttributes dataAsOf(OffsetDateTime dataAsOf) {
    this.dataAsOf = dataAsOf;
    if (dataAsOf != null) {}
    return this;
  }

  /**
   * The latest warehouse data the latest saved refresh read.
   *
   * @return dataAsOf
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_AS_OF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getDataAsOf() {
    return dataAsOf;
  }

  public void setDataAsOf(OffsetDateTime dataAsOf) {
    this.dataAsOf = dataAsOf;
  }

  public ExperimentsBanditTrafficSummaryV2DTODataAttributes observationCounts(
      ExperimentsBanditObservationCountsV2 observationCounts) {
    this.observationCounts = observationCounts;
    if (observationCounts != null) {
      this.unparsed |= observationCounts.unparsed;
    }
    return this;
  }

  /**
   * How many observations the latest saved refresh saw, whatever the range. Null when its counts
   * can't be read.
   *
   * @return observationCounts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBSERVATION_COUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsBanditObservationCountsV2 getObservationCounts() {
    return observationCounts;
  }

  public void setObservationCounts(ExperimentsBanditObservationCountsV2 observationCounts) {
    this.observationCounts = observationCounts;
    if (observationCounts != null) {
      this.unparsed |= observationCounts.unparsed;
    }
  }

  public ExperimentsBanditTrafficSummaryV2DTODataAttributes refreshId(UUID refreshId) {
    this.refreshId = refreshId;
    if (refreshId != null) {}
    return this;
  }

  /**
   * The latest refresh that saved results. The counts come from it.
   *
   * @return refreshId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFRESH_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getRefreshId() {
    return refreshId;
  }

  public void setRefreshId(UUID refreshId) {
    this.refreshId = refreshId;
  }

  public ExperimentsBanditTrafficSummaryV2DTODataAttributes totalSubjects(Long totalSubjects) {
    this.totalSubjects = totalSubjects;
    return this;
  }

  /**
   * Distinct subjects with a valid observation, whatever the range.
   *
   * @return totalSubjects
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_SUBJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalSubjects() {
    return totalSubjects;
  }

  public void setTotalSubjects(Long totalSubjects) {
    this.totalSubjects = totalSubjects;
  }

  public ExperimentsBanditTrafficSummaryV2DTODataAttributes variants(
      List<ExperimentsBanditTrafficVariantV2> variants) {
    this.variants = variants;
    for (ExperimentsBanditTrafficVariantV2 item : variants) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsBanditTrafficSummaryV2DTODataAttributes addVariantsItem(
      ExperimentsBanditTrafficVariantV2 variantsItem) {
    this.variants.add(variantsItem);
    this.unparsed |= variantsItem.unparsed;
    return this;
  }

  /**
   * One row per arm, whatever the range.
   *
   * @return variants
   */
  @JsonProperty(JSON_PROPERTY_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ExperimentsBanditTrafficVariantV2> getVariants() {
    return variants;
  }

  public void setVariants(List<ExperimentsBanditTrafficVariantV2> variants) {
    this.variants = variants;
    if (variants != null) {
      for (ExperimentsBanditTrafficVariantV2 item : variants) {
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
   * @return ExperimentsBanditTrafficSummaryV2DTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsBanditTrafficSummaryV2DTODataAttributes putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this ExperimentsBanditTrafficSummaryV2DTODataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditTrafficSummaryV2DTODataAttributes
        experimentsBanditTrafficSummaryV2DtoDataAttributes =
            (ExperimentsBanditTrafficSummaryV2DTODataAttributes) o;
    return Objects.equals(this.daily, experimentsBanditTrafficSummaryV2DtoDataAttributes.daily)
        && Objects.equals(
            this.dataAsOf, experimentsBanditTrafficSummaryV2DtoDataAttributes.dataAsOf)
        && Objects.equals(
            this.observationCounts,
            experimentsBanditTrafficSummaryV2DtoDataAttributes.observationCounts)
        && Objects.equals(
            this.refreshId, experimentsBanditTrafficSummaryV2DtoDataAttributes.refreshId)
        && Objects.equals(
            this.totalSubjects, experimentsBanditTrafficSummaryV2DtoDataAttributes.totalSubjects)
        && Objects.equals(
            this.variants, experimentsBanditTrafficSummaryV2DtoDataAttributes.variants)
        && Objects.equals(
            this.additionalProperties,
            experimentsBanditTrafficSummaryV2DtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        daily,
        dataAsOf,
        observationCounts,
        refreshId,
        totalSubjects,
        variants,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditTrafficSummaryV2DTODataAttributes {\n");
    sb.append("    daily: ").append(toIndentedString(daily)).append("\n");
    sb.append("    dataAsOf: ").append(toIndentedString(dataAsOf)).append("\n");
    sb.append("    observationCounts: ").append(toIndentedString(observationCounts)).append("\n");
    sb.append("    refreshId: ").append(toIndentedString(refreshId)).append("\n");
    sb.append("    totalSubjects: ").append(toIndentedString(totalSubjects)).append("\n");
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
