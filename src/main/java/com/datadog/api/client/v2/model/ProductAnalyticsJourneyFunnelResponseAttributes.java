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
   * <p>Attributes of a journey funnel response.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsJourneyFunnelResponseAttributes.JSON_PROPERTY_END_TO_END_CONVERSION_RATE,
  ProductAnalyticsJourneyFunnelResponseAttributes.JSON_PROPERTY_END_TO_END_ELAPSED_TIME,
  ProductAnalyticsJourneyFunnelResponseAttributes.JSON_PROPERTY_FUNNEL_STEPS,
  ProductAnalyticsJourneyFunnelResponseAttributes.JSON_PROPERTY_INITIAL_COUNT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsJourneyFunnelResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_END_TO_END_CONVERSION_RATE = "end_to_end_conversion_rate";
  private Double endToEndConversionRate;

  public static final String JSON_PROPERTY_END_TO_END_ELAPSED_TIME = "end_to_end_elapsed_time";
  private ProductAnalyticsElapsedTime endToEndElapsedTime;

  public static final String JSON_PROPERTY_FUNNEL_STEPS = "funnel_steps";
  private List<ProductAnalyticsJourneyFunnelStep> funnelSteps = new ArrayList<>();

  public static final String JSON_PROPERTY_INITIAL_COUNT = "initial_count";
  private Long initialCount;

  public ProductAnalyticsJourneyFunnelResponseAttributes() {}

  @JsonCreator
  public ProductAnalyticsJourneyFunnelResponseAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_END_TO_END_CONVERSION_RATE)Double endToEndConversionRate,
            @JsonProperty(required=true, value=JSON_PROPERTY_END_TO_END_ELAPSED_TIME)ProductAnalyticsElapsedTime endToEndElapsedTime,
            @JsonProperty(required=true, value=JSON_PROPERTY_FUNNEL_STEPS)List<ProductAnalyticsJourneyFunnelStep> funnelSteps,
            @JsonProperty(required=true, value=JSON_PROPERTY_INITIAL_COUNT)Long initialCount) {
        this.endToEndConversionRate = endToEndConversionRate;
        this.endToEndElapsedTime = endToEndElapsedTime;
        this.unparsed |= endToEndElapsedTime.unparsed;
        this.funnelSteps = funnelSteps;
        for (ProductAnalyticsJourneyFunnelStep item : funnelSteps) {
          this.unparsed |= item.unparsed;
        }
        this.initialCount = initialCount;
  }
  public ProductAnalyticsJourneyFunnelResponseAttributes endToEndConversionRate(Double endToEndConversionRate) {
    this.endToEndConversionRate = endToEndConversionRate;
    return this;
  }

  /**
   * <p>Conversion rate from the first step to the last step.</p>
   * @return endToEndConversionRate
  **/
      @JsonProperty(JSON_PROPERTY_END_TO_END_CONVERSION_RATE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Double getEndToEndConversionRate() {
        return endToEndConversionRate;
      }
  public void setEndToEndConversionRate(Double endToEndConversionRate) {
    this.endToEndConversionRate = endToEndConversionRate;
  }
  public ProductAnalyticsJourneyFunnelResponseAttributes endToEndElapsedTime(ProductAnalyticsElapsedTime endToEndElapsedTime) {
    this.endToEndElapsedTime = endToEndElapsedTime;
    this.unparsed |= endToEndElapsedTime.unparsed;
    return this;
  }

  /**
   * <p>Elapsed time statistics (min/max/avg in milliseconds).</p>
   * @return endToEndElapsedTime
  **/
      @JsonProperty(JSON_PROPERTY_END_TO_END_ELAPSED_TIME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ProductAnalyticsElapsedTime getEndToEndElapsedTime() {
        return endToEndElapsedTime;
      }
  public void setEndToEndElapsedTime(ProductAnalyticsElapsedTime endToEndElapsedTime) {
    this.endToEndElapsedTime = endToEndElapsedTime;
    if (endToEndElapsedTime != null) {
      this.unparsed |= endToEndElapsedTime.unparsed;
    }
  }
  public ProductAnalyticsJourneyFunnelResponseAttributes funnelSteps(List<ProductAnalyticsJourneyFunnelStep> funnelSteps) {
    this.funnelSteps = funnelSteps;
    for (ProductAnalyticsJourneyFunnelStep item : funnelSteps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ProductAnalyticsJourneyFunnelResponseAttributes addFunnelStepsItem(ProductAnalyticsJourneyFunnelStep funnelStepsItem) {
    this.funnelSteps.add(funnelStepsItem);
    this.unparsed |= funnelStepsItem.unparsed;
    return this;
  }

  /**
   * <p>The funnel steps, in the order given by the search expression.</p>
   * @return funnelSteps
  **/
      @JsonProperty(JSON_PROPERTY_FUNNEL_STEPS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<ProductAnalyticsJourneyFunnelStep> getFunnelSteps() {
        return funnelSteps;
      }
  public void setFunnelSteps(List<ProductAnalyticsJourneyFunnelStep> funnelSteps) {
    this.funnelSteps = funnelSteps;
    if (funnelSteps != null) {
      for (ProductAnalyticsJourneyFunnelStep item : funnelSteps) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public ProductAnalyticsJourneyFunnelResponseAttributes initialCount(Long initialCount) {
    this.initialCount = initialCount;
    return this;
  }

  /**
   * <p>Number of entities that entered the funnel.</p>
   * @return initialCount
  **/
      @JsonProperty(JSON_PROPERTY_INITIAL_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getInitialCount() {
        return initialCount;
      }
  public void setInitialCount(Long initialCount) {
    this.initialCount = initialCount;
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
   * @return ProductAnalyticsJourneyFunnelResponseAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsJourneyFunnelResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ProductAnalyticsJourneyFunnelResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsJourneyFunnelResponseAttributes productAnalyticsJourneyFunnelResponseAttributes = (ProductAnalyticsJourneyFunnelResponseAttributes) o;
    return Objects.equals(this.endToEndConversionRate, productAnalyticsJourneyFunnelResponseAttributes.endToEndConversionRate) && Objects.equals(this.endToEndElapsedTime, productAnalyticsJourneyFunnelResponseAttributes.endToEndElapsedTime) && Objects.equals(this.funnelSteps, productAnalyticsJourneyFunnelResponseAttributes.funnelSteps) && Objects.equals(this.initialCount, productAnalyticsJourneyFunnelResponseAttributes.initialCount) && Objects.equals(this.additionalProperties, productAnalyticsJourneyFunnelResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(endToEndConversionRate,endToEndElapsedTime,funnelSteps,initialCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsJourneyFunnelResponseAttributes {\n");
    sb.append("    endToEndConversionRate: ").append(toIndentedString(endToEndConversionRate)).append("\n");
    sb.append("    endToEndElapsedTime: ").append(toIndentedString(endToEndElapsedTime)).append("\n");
    sb.append("    funnelSteps: ").append(toIndentedString(funnelSteps)).append("\n");
    sb.append("    initialCount: ").append(toIndentedString(initialCount)).append("\n");
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
