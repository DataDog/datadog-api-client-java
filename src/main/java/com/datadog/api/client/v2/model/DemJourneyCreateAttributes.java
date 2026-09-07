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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes for creating or updating a DEM journey. */
@JsonPropertyOrder({
  DemJourneyCreateAttributes.JSON_PROPERTY_DESCRIPTION,
  DemJourneyCreateAttributes.JSON_PROPERTY_JOURNEY_RUM,
  DemJourneyCreateAttributes.JSON_PROPERTY_NAME,
  DemJourneyCreateAttributes.JSON_PROPERTY_TAGS,
  DemJourneyCreateAttributes.JSON_PROPERTY_VARIANTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DemJourneyCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_JOURNEY_RUM = "journey_rum";
  private DemJourneyRum journeyRum;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<DemVariant> variants = null;

  public DemJourneyCreateAttributes() {}

  @JsonCreator
  public DemJourneyCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_JOURNEY_RUM) DemJourneyRum journeyRum,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags) {
    this.journeyRum = journeyRum;
    this.unparsed |= journeyRum.unparsed;
    this.name = name;
    this.tags = tags;
  }

  public DemJourneyCreateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An optional human-readable description of the journey.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DemJourneyCreateAttributes journeyRum(DemJourneyRum journeyRum) {
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

  public DemJourneyCreateAttributes name(String name) {
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

  public DemJourneyCreateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DemJourneyCreateAttributes addTagsItem(String tagsItem) {
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

  public DemJourneyCreateAttributes variants(List<DemVariant> variants) {
    this.variants = variants;
    if (variants != null) {
      for (DemVariant item : variants) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public DemJourneyCreateAttributes addVariantsItem(DemVariant variantsItem) {
    if (this.variants == null) {
      this.variants = new ArrayList<>();
    }
    this.variants.add(variantsItem);
    this.unparsed |= variantsItem.unparsed;
    return this;
  }

  /**
   * List of variants associated with a DEM journey.
   *
   * @return variants
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return DemJourneyCreateAttributes
   */
  @JsonAnySetter
  public DemJourneyCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DemJourneyCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemJourneyCreateAttributes demJourneyCreateAttributes = (DemJourneyCreateAttributes) o;
    return Objects.equals(this.description, demJourneyCreateAttributes.description)
        && Objects.equals(this.journeyRum, demJourneyCreateAttributes.journeyRum)
        && Objects.equals(this.name, demJourneyCreateAttributes.name)
        && Objects.equals(this.tags, demJourneyCreateAttributes.tags)
        && Objects.equals(this.variants, demJourneyCreateAttributes.variants)
        && Objects.equals(
            this.additionalProperties, demJourneyCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, journeyRum, name, tags, variants, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemJourneyCreateAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    journeyRum: ").append(toIndentedString(journeyRum)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
