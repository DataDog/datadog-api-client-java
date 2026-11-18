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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Attributes to update on a launch. Fields that are not set are left unchanged, and <code>null
 * </code> clears a nullable field. Setting a non-empty <code>feature_flag_id</code> clears the
 * stored <code>feature_flag_key</code> when <code>feature_flag_key</code> is not set.
 */
@JsonPropertyOrder({
  ProductAnalyticsLaunchPatchAttributes.JSON_PROPERTY_APPLICATION_ID,
  ProductAnalyticsLaunchPatchAttributes.JSON_PROPERTY_CODE_ANALYSIS,
  ProductAnalyticsLaunchPatchAttributes.JSON_PROPERTY_CONTEXT,
  ProductAnalyticsLaunchPatchAttributes.JSON_PROPERTY_DESCRIPTION,
  ProductAnalyticsLaunchPatchAttributes.JSON_PROPERTY_FEATURE_FLAG_ID,
  ProductAnalyticsLaunchPatchAttributes.JSON_PROPERTY_FEATURE_FLAG_KEY,
  ProductAnalyticsLaunchPatchAttributes.JSON_PROPERTY_KPIS,
  ProductAnalyticsLaunchPatchAttributes.JSON_PROPERTY_NAME,
  ProductAnalyticsLaunchPatchAttributes.JSON_PROPERTY_PHASE,
  ProductAnalyticsLaunchPatchAttributes.JSON_PROPERTY_REPOSITORY_ID,
  ProductAnalyticsLaunchPatchAttributes.JSON_PROPERTY_STEPS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsLaunchPatchAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private JsonNullable<String> applicationId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CODE_ANALYSIS = "code_analysis";
  private ProductAnalyticsLaunchCodeAnalysis codeAnalysis;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private String context;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FEATURE_FLAG_ID = "feature_flag_id";
  private JsonNullable<String> featureFlagId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FEATURE_FLAG_KEY = "feature_flag_key";
  private JsonNullable<String> featureFlagKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_KPIS = "kpis";
  private JsonNullable<List<ProductAnalyticsLaunchKPI>> kpis =
      JsonNullable.<List<ProductAnalyticsLaunchKPI>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PHASE = "phase";
  private ProductAnalyticsLaunchPhase phase;

  public static final String JSON_PROPERTY_REPOSITORY_ID = "repository_id";
  private JsonNullable<String> repositoryId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STEPS = "steps";
  private ProductAnalyticsLaunchPatchSteps steps;

  public ProductAnalyticsLaunchPatchAttributes applicationId(String applicationId) {
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

  public ProductAnalyticsLaunchPatchAttributes codeAnalysis(
      ProductAnalyticsLaunchCodeAnalysis codeAnalysis) {
    this.codeAnalysis = codeAnalysis;
    this.unparsed |= codeAnalysis.unparsed;
    return this;
  }

  /**
   * Latest inspection of the repository for the tracking plan instrumentation. A new analysis
   * replaces the stored one. Events and properties that it does not list are not verified.
   *
   * @return codeAnalysis
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_ANALYSIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsLaunchCodeAnalysis getCodeAnalysis() {
    return codeAnalysis;
  }

  public void setCodeAnalysis(ProductAnalyticsLaunchCodeAnalysis codeAnalysis) {
    this.codeAnalysis = codeAnalysis;
    if (codeAnalysis != null) {
      this.unparsed |= codeAnalysis.unparsed;
    }
  }

  public ProductAnalyticsLaunchPatchAttributes context(String context) {
    this.context = context;
    return this;
  }

  /**
   * Context of the feature being launched.
   *
   * @return context
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public ProductAnalyticsLaunchPatchAttributes description(String description) {
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

  public ProductAnalyticsLaunchPatchAttributes featureFlagId(String featureFlagId) {
    this.featureFlagId = JsonNullable.<String>of(featureFlagId);
    return this;
  }

  /**
   * UUID of the Datadog feature flag that gates the launch.
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

  public ProductAnalyticsLaunchPatchAttributes featureFlagKey(String featureFlagKey) {
    this.featureFlagKey = JsonNullable.<String>of(featureFlagKey);
    return this;
  }

  /**
   * Key of a feature flag managed outside Datadog. At most 256 characters, with no leading or
   * trailing spaces.
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

  public ProductAnalyticsLaunchPatchAttributes kpis(List<ProductAnalyticsLaunchKPI> kpis) {
    this.kpis = JsonNullable.<List<ProductAnalyticsLaunchKPI>>of(kpis);
    return this;
  }

  public ProductAnalyticsLaunchPatchAttributes addKpisItem(ProductAnalyticsLaunchKPI kpisItem) {
    if (this.kpis == null || !this.kpis.isPresent()) {
      this.kpis = JsonNullable.<List<ProductAnalyticsLaunchKPI>>of(new ArrayList<>());
    }
    try {
      this.kpis.get().add(kpisItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * KPIs that the launch is meant to move. Replaces the stored list, and <code>null</code> clears
   * it.
   *
   * @return kpis
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<ProductAnalyticsLaunchKPI> getKpis() {
    return kpis.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_KPIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<ProductAnalyticsLaunchKPI>> getKpis_JsonNullable() {
    return kpis;
  }

  @JsonProperty(JSON_PROPERTY_KPIS)
  public void setKpis_JsonNullable(JsonNullable<List<ProductAnalyticsLaunchKPI>> kpis) {
    this.kpis = kpis;
  }

  public void setKpis(List<ProductAnalyticsLaunchKPI> kpis) {
    this.kpis = JsonNullable.<List<ProductAnalyticsLaunchKPI>>of(kpis);
  }

  public ProductAnalyticsLaunchPatchAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the launch.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductAnalyticsLaunchPatchAttributes phase(ProductAnalyticsLaunchPhase phase) {
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

  public ProductAnalyticsLaunchPatchAttributes repositoryId(String repositoryId) {
    this.repositoryId = JsonNullable.<String>of(repositoryId);
    return this;
  }

  /**
   * ID of the code repository that implements the feature.
   *
   * @return repositoryId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getRepositoryId() {
    return repositoryId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPOSITORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRepositoryId_JsonNullable() {
    return repositoryId;
  }

  @JsonProperty(JSON_PROPERTY_REPOSITORY_ID)
  public void setRepositoryId_JsonNullable(JsonNullable<String> repositoryId) {
    this.repositoryId = repositoryId;
  }

  public void setRepositoryId(String repositoryId) {
    this.repositoryId = JsonNullable.<String>of(repositoryId);
  }

  public ProductAnalyticsLaunchPatchAttributes steps(ProductAnalyticsLaunchPatchSteps steps) {
    this.steps = steps;
    this.unparsed |= steps.unparsed;
    return this;
  }

  /**
   * Steps to update. Steps that are not set are left unchanged. A <code>tracking_plan</code>
   * replaces the whole stored tracking plan, so include every event and property to keep.
   *
   * @return steps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsLaunchPatchSteps getSteps() {
    return steps;
  }

  public void setSteps(ProductAnalyticsLaunchPatchSteps steps) {
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
   * @return ProductAnalyticsLaunchPatchAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsLaunchPatchAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsLaunchPatchAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsLaunchPatchAttributes productAnalyticsLaunchPatchAttributes =
        (ProductAnalyticsLaunchPatchAttributes) o;
    return Objects.equals(this.applicationId, productAnalyticsLaunchPatchAttributes.applicationId)
        && Objects.equals(this.codeAnalysis, productAnalyticsLaunchPatchAttributes.codeAnalysis)
        && Objects.equals(this.context, productAnalyticsLaunchPatchAttributes.context)
        && Objects.equals(this.description, productAnalyticsLaunchPatchAttributes.description)
        && Objects.equals(this.featureFlagId, productAnalyticsLaunchPatchAttributes.featureFlagId)
        && Objects.equals(this.featureFlagKey, productAnalyticsLaunchPatchAttributes.featureFlagKey)
        && Objects.equals(this.kpis, productAnalyticsLaunchPatchAttributes.kpis)
        && Objects.equals(this.name, productAnalyticsLaunchPatchAttributes.name)
        && Objects.equals(this.phase, productAnalyticsLaunchPatchAttributes.phase)
        && Objects.equals(this.repositoryId, productAnalyticsLaunchPatchAttributes.repositoryId)
        && Objects.equals(this.steps, productAnalyticsLaunchPatchAttributes.steps)
        && Objects.equals(
            this.additionalProperties, productAnalyticsLaunchPatchAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applicationId,
        codeAnalysis,
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
    sb.append("class ProductAnalyticsLaunchPatchAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    codeAnalysis: ").append(toIndentedString(codeAnalysis)).append("\n");
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
