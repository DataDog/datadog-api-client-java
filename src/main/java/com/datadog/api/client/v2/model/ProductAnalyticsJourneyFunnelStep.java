/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>A single step of the funnel with its conversion counts and timings.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsJourneyFunnelStep.JSON_PROPERTY_ELAPSED_TIME_TO_NEXT_STEP,
  ProductAnalyticsJourneyFunnelStep.JSON_PROPERTY_GROUPS,
  ProductAnalyticsJourneyFunnelStep.JSON_PROPERTY_LABEL,
  ProductAnalyticsJourneyFunnelStep.JSON_PROPERTY_UNIT,
  ProductAnalyticsJourneyFunnelStep.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsJourneyFunnelStep {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ELAPSED_TIME_TO_NEXT_STEP = "elapsed_time_to_next_step";
  private ProductAnalyticsElapsedTime elapsedTimeToNextStep;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<ProductAnalyticsJourneyFunnelStepGroup> groups = new ArrayList<>();

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public ProductAnalyticsJourneyFunnelStep() {}

  @JsonCreator
  public ProductAnalyticsJourneyFunnelStep(
            @JsonProperty(required=true, value=JSON_PROPERTY_ELAPSED_TIME_TO_NEXT_STEP)ProductAnalyticsElapsedTime elapsedTimeToNextStep,
            @JsonProperty(required=true, value=JSON_PROPERTY_GROUPS)List<ProductAnalyticsJourneyFunnelStepGroup> groups,
            @JsonProperty(required=true, value=JSON_PROPERTY_LABEL)String label,
            @JsonProperty(required=true, value=JSON_PROPERTY_UNIT)String unit,
            @JsonProperty(required=true, value=JSON_PROPERTY_VALUE)Double value) {
        this.elapsedTimeToNextStep = elapsedTimeToNextStep;
        this.unparsed |= elapsedTimeToNextStep.unparsed;
        this.groups = groups;
        for (ProductAnalyticsJourneyFunnelStepGroup item : groups) {
          this.unparsed |= item.unparsed;
        }
        this.label = label;
        this.unit = unit;
        this.value = value;
  }
  public ProductAnalyticsJourneyFunnelStep elapsedTimeToNextStep(ProductAnalyticsElapsedTime elapsedTimeToNextStep) {
    this.elapsedTimeToNextStep = elapsedTimeToNextStep;
    this.unparsed |= elapsedTimeToNextStep.unparsed;
    return this;
  }

  /**
   * <p>Elapsed time statistics (min/max/avg in milliseconds).</p>
   * @return elapsedTimeToNextStep
  **/
      @JsonProperty(JSON_PROPERTY_ELAPSED_TIME_TO_NEXT_STEP)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ProductAnalyticsElapsedTime getElapsedTimeToNextStep() {
        return elapsedTimeToNextStep;
      }
  public void setElapsedTimeToNextStep(ProductAnalyticsElapsedTime elapsedTimeToNextStep) {
    this.elapsedTimeToNextStep = elapsedTimeToNextStep;
    if (elapsedTimeToNextStep != null) {
      this.unparsed |= elapsedTimeToNextStep.unparsed;
    }
  }
  public ProductAnalyticsJourneyFunnelStep groups(List<ProductAnalyticsJourneyFunnelStepGroup> groups) {
    this.groups = groups;
    for (ProductAnalyticsJourneyFunnelStepGroup item : groups) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ProductAnalyticsJourneyFunnelStep addGroupsItem(ProductAnalyticsJourneyFunnelStepGroup groupsItem) {
    this.groups.add(groupsItem);
    this.unparsed |= groupsItem.unparsed;
    return this;
  }

  /**
   * <p>Breakdown of this step by the requested group-by facets.</p>
   * @return groups
  **/
      @JsonProperty(JSON_PROPERTY_GROUPS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<ProductAnalyticsJourneyFunnelStepGroup> getGroups() {
        return groups;
      }
  public void setGroups(List<ProductAnalyticsJourneyFunnelStepGroup> groups) {
    this.groups = groups;
    if (groups != null) {
      for (ProductAnalyticsJourneyFunnelStepGroup item : groups) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public ProductAnalyticsJourneyFunnelStep label(String label) {
    this.label = label;
    return this;
  }

  /**
   * <p>Label of the step, derived from the node alias.</p>
   * @return label
  **/
      @JsonProperty(JSON_PROPERTY_LABEL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getLabel() {
        return label;
      }
  public void setLabel(String label) {
    this.label = label;
  }
  public ProductAnalyticsJourneyFunnelStep unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * <p>Unit of the elapsed time values.</p>
   * @return unit
  **/
      @JsonProperty(JSON_PROPERTY_UNIT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getUnit() {
        return unit;
      }
  public void setUnit(String unit) {
    this.unit = unit;
  }
  public ProductAnalyticsJourneyFunnelStep value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Value of the computed metric at this step.</p>
   * @return value
  **/
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Double getValue() {
        return value;
      }
  public void setValue(Double value) {
    this.value = value;
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
   * @return ProductAnalyticsJourneyFunnelStep
   */
  @JsonAnySetter
  public ProductAnalyticsJourneyFunnelStep putAdditionalProperty(String key, Object value) {
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
   * Return true if this ProductAnalyticsJourneyFunnelStep object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsJourneyFunnelStep productAnalyticsJourneyFunnelStep = (ProductAnalyticsJourneyFunnelStep) o;
    return Objects.equals(this.elapsedTimeToNextStep, productAnalyticsJourneyFunnelStep.elapsedTimeToNextStep) && Objects.equals(this.groups, productAnalyticsJourneyFunnelStep.groups) && Objects.equals(this.label, productAnalyticsJourneyFunnelStep.label) && Objects.equals(this.unit, productAnalyticsJourneyFunnelStep.unit) && Objects.equals(this.value, productAnalyticsJourneyFunnelStep.value) && Objects.equals(this.additionalProperties, productAnalyticsJourneyFunnelStep.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(elapsedTimeToNextStep,groups,label,unit,value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsJourneyFunnelStep {\n");
    sb.append("    elapsedTimeToNextStep: ").append(toIndentedString(elapsedTimeToNextStep)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
