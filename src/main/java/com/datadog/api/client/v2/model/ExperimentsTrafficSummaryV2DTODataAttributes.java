/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Details of the experiment traffic summary. */
@JsonPropertyOrder({
  ExperimentsTrafficSummaryV2DTODataAttributes.JSON_PROPERTY_IS_TRAFFIC_IMBALANCED,
  ExperimentsTrafficSummaryV2DTODataAttributes.JSON_PROPERTY_TOTAL_SUBJECTS,
  ExperimentsTrafficSummaryV2DTODataAttributes.JSON_PROPERTY_VARIANTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsTrafficSummaryV2DTODataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_TRAFFIC_IMBALANCED = "is_traffic_imbalanced";
  private Boolean isTrafficImbalanced;

  public static final String JSON_PROPERTY_TOTAL_SUBJECTS = "total_subjects";
  private Long totalSubjects;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems> variants = null;

  public ExperimentsTrafficSummaryV2DTODataAttributes isTrafficImbalanced(
      Boolean isTrafficImbalanced) {
    this.isTrafficImbalanced = isTrafficImbalanced;
    return this;
  }

  /**
   * Whether the observed variant traffic is imbalanced.
   *
   * @return isTrafficImbalanced
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_TRAFFIC_IMBALANCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsTrafficImbalanced() {
    return isTrafficImbalanced;
  }

  public void setIsTrafficImbalanced(Boolean isTrafficImbalanced) {
    this.isTrafficImbalanced = isTrafficImbalanced;
  }

  public ExperimentsTrafficSummaryV2DTODataAttributes totalSubjects(Long totalSubjects) {
    this.totalSubjects = totalSubjects;
    return this;
  }

  /**
   * Total number of subjects included in the traffic summary.
   *
   * @return totalSubjects
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SUBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalSubjects() {
    return totalSubjects;
  }

  public void setTotalSubjects(Long totalSubjects) {
    this.totalSubjects = totalSubjects;
  }

  public ExperimentsTrafficSummaryV2DTODataAttributes variants(
      List<ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems> variants) {
    this.variants = variants;
    if (variants != null) {
      for (ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems item : variants) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsTrafficSummaryV2DTODataAttributes addVariantsItem(
      ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems variantsItem) {
    if (this.variants == null) {
      this.variants = new ArrayList<>();
    }
    this.variants.add(variantsItem);
    this.unparsed |= variantsItem.unparsed;
    return this;
  }

  /**
   * Exposure counts for each experiment variant.
   *
   * @return variants
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems> getVariants() {
    return variants;
  }

  public void setVariants(
      List<ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems> variants) {
    this.variants = variants;
    if (variants != null) {
      for (ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems item : variants) {
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
   * @return ExperimentsTrafficSummaryV2DTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsTrafficSummaryV2DTODataAttributes putAdditionalProperty(
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

  /** Return true if this ExperimentsTrafficSummaryV2DTODataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsTrafficSummaryV2DTODataAttributes experimentsTrafficSummaryV2DtoDataAttributes =
        (ExperimentsTrafficSummaryV2DTODataAttributes) o;
    return Objects.equals(
            this.isTrafficImbalanced,
            experimentsTrafficSummaryV2DtoDataAttributes.isTrafficImbalanced)
        && Objects.equals(
            this.totalSubjects, experimentsTrafficSummaryV2DtoDataAttributes.totalSubjects)
        && Objects.equals(this.variants, experimentsTrafficSummaryV2DtoDataAttributes.variants)
        && Objects.equals(
            this.additionalProperties,
            experimentsTrafficSummaryV2DtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTrafficImbalanced, totalSubjects, variants, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsTrafficSummaryV2DTODataAttributes {\n");
    sb.append("    isTrafficImbalanced: ")
        .append(toIndentedString(isTrafficImbalanced))
        .append("\n");
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
