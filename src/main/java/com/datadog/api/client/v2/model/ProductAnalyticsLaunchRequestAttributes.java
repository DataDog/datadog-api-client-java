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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a launch to create or replace. */
@JsonPropertyOrder({
  ProductAnalyticsLaunchRequestAttributes.JSON_PROPERTY_APPLICATION_ID,
  ProductAnalyticsLaunchRequestAttributes.JSON_PROPERTY_CONTEXT,
  ProductAnalyticsLaunchRequestAttributes.JSON_PROPERTY_DESCRIPTION,
  ProductAnalyticsLaunchRequestAttributes.JSON_PROPERTY_FEATURE_FLAG_ID,
  ProductAnalyticsLaunchRequestAttributes.JSON_PROPERTY_FEATURE_FLAG_KEY,
  ProductAnalyticsLaunchRequestAttributes.JSON_PROPERTY_KPIS,
  ProductAnalyticsLaunchRequestAttributes.JSON_PROPERTY_NAME,
  ProductAnalyticsLaunchRequestAttributes.JSON_PROPERTY_PHASE,
  ProductAnalyticsLaunchRequestAttributes.JSON_PROPERTY_REPOSITORY_ID,
  ProductAnalyticsLaunchRequestAttributes.JSON_PROPERTY_STEPS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsLaunchRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private JsonNullable<String> applicationId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private String context;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FEATURE_FLAG_ID = "feature_flag_id";
  private JsonNullable<String> featureFlagId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FEATURE_FLAG_KEY = "feature_flag_key";
  private JsonNullable<String> featureFlagKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_KPIS = "kpis";
  private List<ProductAnalyticsLaunchKPI> kpis = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PHASE = "phase";
  private ProductAnalyticsLaunchPhase phase;

  public static final String JSON_PROPERTY_REPOSITORY_ID = "repository_id";
  private String repositoryId;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private ProductAnalyticsLaunchStepsRequest steps;

  public ProductAnalyticsLaunchRequestAttributes() {}

  @JsonCreator
  public ProductAnalyticsLaunchRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTEXT) String context,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_STEPS)
          ProductAnalyticsLaunchStepsRequest steps) {
    this.context = context;
    this.name = name;
    this.steps = steps;
    this.unparsed |= steps.unparsed;
  }

  public ProductAnalyticsLaunchRequestAttributes applicationId(String applicationId) {
    this.applicationId = JsonNullable.<String>of(applicationId);
    return this;
  }

  /**
   * UUID of the RUM application that the launch belongs to.
   *
   * @return applicationId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getApplicationId() {
    return applicationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getApplicationId_JsonNullable() {
    return applicationId;
  }

  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  public void setApplicationId_JsonNullable(JsonNullable<String> applicationId) {
    this.applicationId = applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = JsonNullable.<String>of(applicationId);
  }

  public ProductAnalyticsLaunchRequestAttributes context(String context) {
    this.context = context;
    return this;
  }

  /**
   * Context of the feature being launched, used to build the tracking plan.
   *
   * @return context
   */
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public ProductAnalyticsLaunchRequestAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * Description of the feature being launched.
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

  public ProductAnalyticsLaunchRequestAttributes featureFlagId(String featureFlagId) {
    this.featureFlagId = JsonNullable.<String>of(featureFlagId);
    return this;
  }

  /**
   * UUID of the Datadog feature flag that gates the launch. Do not set it together with <code>
   * feature_flag_key</code>.
   *
   * @return featureFlagId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getFeatureFlagId() {
    return featureFlagId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FEATURE_FLAG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFeatureFlagId_JsonNullable() {
    return featureFlagId;
  }

  @JsonProperty(JSON_PROPERTY_FEATURE_FLAG_ID)
  public void setFeatureFlagId_JsonNullable(JsonNullable<String> featureFlagId) {
    this.featureFlagId = featureFlagId;
  }

  public void setFeatureFlagId(String featureFlagId) {
    this.featureFlagId = JsonNullable.<String>of(featureFlagId);
  }

  public ProductAnalyticsLaunchRequestAttributes featureFlagKey(String featureFlagKey) {
    this.featureFlagKey = JsonNullable.<String>of(featureFlagKey);
    return this;
  }

  /**
   * Key of a feature flag managed outside Datadog, as evaluated in code. At most 256 characters,
   * with no leading or trailing spaces. Do not set it together with <code>feature_flag_id</code>.
   * <code>null</code> clears it. On replace, omitting it keeps the stored key unless <code>
   * feature_flag_id</code> is set.
   *
   * @return featureFlagKey
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getFeatureFlagKey() {
    return featureFlagKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FEATURE_FLAG_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFeatureFlagKey_JsonNullable() {
    return featureFlagKey;
  }

  @JsonProperty(JSON_PROPERTY_FEATURE_FLAG_KEY)
  public void setFeatureFlagKey_JsonNullable(JsonNullable<String> featureFlagKey) {
    this.featureFlagKey = featureFlagKey;
  }

  public void setFeatureFlagKey(String featureFlagKey) {
    this.featureFlagKey = JsonNullable.<String>of(featureFlagKey);
  }

  public ProductAnalyticsLaunchRequestAttributes kpis(List<ProductAnalyticsLaunchKPI> kpis) {
    this.kpis = kpis;
    if (kpis != null) {
      for (ProductAnalyticsLaunchKPI item : kpis) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsLaunchRequestAttributes addKpisItem(ProductAnalyticsLaunchKPI kpisItem) {
    if (this.kpis == null) {
      this.kpis = new ArrayList<>();
    }
    this.kpis.add(kpisItem);
    this.unparsed |= kpisItem.unparsed;
    return this;
  }

  /**
   * KPIs that the launch is meant to move.
   *
   * @return kpis
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KPIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsLaunchKPI> getKpis() {
    return kpis;
  }

  public void setKpis(List<ProductAnalyticsLaunchKPI> kpis) {
    this.kpis = kpis;
    if (kpis != null) {
      for (ProductAnalyticsLaunchKPI item : kpis) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductAnalyticsLaunchRequestAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the launch.
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

  public ProductAnalyticsLaunchRequestAttributes phase(ProductAnalyticsLaunchPhase phase) {
    this.phase = phase;
    this.unparsed |= !phase.isValid();
    return this;
  }

  /**
   * Lifecycle phase of a launch. A new launch starts in <code>plan</code> or <code>setup</code>,
   * and defaults to <code>plan</code>. Allowed changes: <code>plan</code> to <code>setup</code>,
   * <code>setup</code> to <code>ready</code>, <code>ready</code> to <code>setup</code> or <code>
   * launched</code>, and <code>launched</code> to <code>ready</code>.
   *
   * @return phase
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsLaunchPhase getPhase() {
    return phase;
  }

  public void setPhase(ProductAnalyticsLaunchPhase phase) {
    if (!phase.isValid()) {
      this.unparsed = true;
    }
    this.phase = phase;
  }

  public ProductAnalyticsLaunchRequestAttributes repositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

  /**
   * ID of the code repository that implements the feature.
   *
   * @return repositoryId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }

  public ProductAnalyticsLaunchRequestAttributes steps(ProductAnalyticsLaunchStepsRequest steps) {
    this.steps = steps;
    this.unparsed |= steps.unparsed;
    return this;
  }

  /**
   * Steps of the launch. The tracking plan is required.
   *
   * @return steps
   */
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsLaunchStepsRequest getSteps() {
    return steps;
  }

  public void setSteps(ProductAnalyticsLaunchStepsRequest steps) {
    this.steps = steps;
    if (steps != null) {
      this.unparsed |= steps.unparsed;
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
   * @return ProductAnalyticsLaunchRequestAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsLaunchRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsLaunchRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsLaunchRequestAttributes productAnalyticsLaunchRequestAttributes =
        (ProductAnalyticsLaunchRequestAttributes) o;
    return Objects.equals(this.applicationId, productAnalyticsLaunchRequestAttributes.applicationId)
        && Objects.equals(this.context, productAnalyticsLaunchRequestAttributes.context)
        && Objects.equals(this.description, productAnalyticsLaunchRequestAttributes.description)
        && Objects.equals(this.featureFlagId, productAnalyticsLaunchRequestAttributes.featureFlagId)
        && Objects.equals(
            this.featureFlagKey, productAnalyticsLaunchRequestAttributes.featureFlagKey)
        && Objects.equals(this.kpis, productAnalyticsLaunchRequestAttributes.kpis)
        && Objects.equals(this.name, productAnalyticsLaunchRequestAttributes.name)
        && Objects.equals(this.phase, productAnalyticsLaunchRequestAttributes.phase)
        && Objects.equals(this.repositoryId, productAnalyticsLaunchRequestAttributes.repositoryId)
        && Objects.equals(this.steps, productAnalyticsLaunchRequestAttributes.steps)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsLaunchRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applicationId,
        context,
        description,
        featureFlagId,
        featureFlagKey,
        kpis,
        name,
        phase,
        repositoryId,
        steps,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsLaunchRequestAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    featureFlagId: ").append(toIndentedString(featureFlagId)).append("\n");
    sb.append("    featureFlagKey: ").append(toIndentedString(featureFlagKey)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
