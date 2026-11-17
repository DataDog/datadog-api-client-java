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

/** Attributes of a launch. */
@JsonPropertyOrder({
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_APPLICATION_ID,
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_CONTEXT,
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_CREATED_AT,
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_CREATED_BY,
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_DESCRIPTION,
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_FEATURE_FLAG_ID,
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_FEATURE_FLAG_KEY,
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_KPIS,
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_NAME,
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_ORG_ID,
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_PHASE,
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_REPOSITORY_ID,
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_STEPS,
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_UPDATED_AT,
  ProductAnalyticsLaunchAttributes.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsLaunchAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private JsonNullable<String> applicationId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private JsonNullable<String> context = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

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

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_PHASE = "phase";
  private ProductAnalyticsLaunchPhase phase;

  public static final String JSON_PROPERTY_REPOSITORY_ID = "repository_id";
  private String repositoryId;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private ProductAnalyticsLaunchSteps steps;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private JsonNullable<String> updatedBy = JsonNullable.<String>undefined();

  public ProductAnalyticsLaunchAttributes() {}

  @JsonCreator
  public ProductAnalyticsLaunchAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Long orgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PHASE) ProductAnalyticsLaunchPhase phase,
      @JsonProperty(required = true, value = JSON_PROPERTY_STEPS)
          ProductAnalyticsLaunchSteps steps) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.name = name;
    this.orgId = orgId;
    this.phase = phase;
    this.unparsed |= !phase.isValid();
    this.steps = steps;
    this.unparsed |= steps.unparsed;
  }

  public ProductAnalyticsLaunchAttributes applicationId(String applicationId) {
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

  public ProductAnalyticsLaunchAttributes context(String context) {
    this.context = JsonNullable.<String>of(context);
    return this;
  }

  /**
   * Context of the feature being launched.
   *
   * @return context
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getContext() {
    return context.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getContext_JsonNullable() {
    return context;
  }

  @JsonProperty(JSON_PROPERTY_CONTEXT)
  public void setContext_JsonNullable(JsonNullable<String> context) {
    this.context = context;
  }

  public void setContext(String context) {
    this.context = JsonNullable.<String>of(context);
  }

  public ProductAnalyticsLaunchAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time the launch was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ProductAnalyticsLaunchAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * UUID of the user who created the launch.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public ProductAnalyticsLaunchAttributes description(String description) {
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

  public ProductAnalyticsLaunchAttributes featureFlagId(String featureFlagId) {
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

  public ProductAnalyticsLaunchAttributes featureFlagKey(String featureFlagKey) {
    this.featureFlagKey = JsonNullable.<String>of(featureFlagKey);
    return this;
  }

  /**
   * Key of a feature flag managed outside Datadog.
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

  public ProductAnalyticsLaunchAttributes kpis(List<ProductAnalyticsLaunchKPI> kpis) {
    this.kpis = JsonNullable.<List<ProductAnalyticsLaunchKPI>>of(kpis);
    return this;
  }

  public ProductAnalyticsLaunchAttributes addKpisItem(ProductAnalyticsLaunchKPI kpisItem) {
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
   * KPIs that the launch is meant to move.
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

  public ProductAnalyticsLaunchAttributes name(String name) {
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

  public ProductAnalyticsLaunchAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * ID of the organization that owns the launch.
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public ProductAnalyticsLaunchAttributes phase(ProductAnalyticsLaunchPhase phase) {
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
  @JsonProperty(JSON_PROPERTY_PHASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsLaunchPhase getPhase() {
    return phase;
  }

  public void setPhase(ProductAnalyticsLaunchPhase phase) {
    if (!phase.isValid()) {
      this.unparsed = true;
    }
    this.phase = phase;
  }

  public ProductAnalyticsLaunchAttributes repositoryId(String repositoryId) {
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

  public ProductAnalyticsLaunchAttributes steps(ProductAnalyticsLaunchSteps steps) {
    this.steps = steps;
    this.unparsed |= steps.unparsed;
    return this;
  }

  /**
   * Steps of the launch.
   *
   * @return steps
   */
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsLaunchSteps getSteps() {
    return steps;
  }

  public void setSteps(ProductAnalyticsLaunchSteps steps) {
    this.steps = steps;
    if (steps != null) {
      this.unparsed |= steps.unparsed;
    }
  }

  public ProductAnalyticsLaunchAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = JsonNullable.<OffsetDateTime>of(updatedAt);
    return this;
  }

  /**
   * Time the launch was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getUpdatedAt() {
    return updatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getUpdatedAt_JsonNullable() {
    return updatedAt;
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  public void setUpdatedAt_JsonNullable(JsonNullable<OffsetDateTime> updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = JsonNullable.<OffsetDateTime>of(updatedAt);
  }

  public ProductAnalyticsLaunchAttributes updatedBy(String updatedBy) {
    this.updatedBy = JsonNullable.<String>of(updatedBy);
    return this;
  }

  /**
   * UUID of the user who last updated the launch.
   *
   * @return updatedBy
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getUpdatedBy() {
    return updatedBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUpdatedBy_JsonNullable() {
    return updatedBy;
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  public void setUpdatedBy_JsonNullable(JsonNullable<String> updatedBy) {
    this.updatedBy = updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = JsonNullable.<String>of(updatedBy);
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
   * @return ProductAnalyticsLaunchAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsLaunchAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsLaunchAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsLaunchAttributes productAnalyticsLaunchAttributes =
        (ProductAnalyticsLaunchAttributes) o;
    return Objects.equals(this.applicationId, productAnalyticsLaunchAttributes.applicationId)
        && Objects.equals(this.context, productAnalyticsLaunchAttributes.context)
        && Objects.equals(this.createdAt, productAnalyticsLaunchAttributes.createdAt)
        && Objects.equals(this.createdBy, productAnalyticsLaunchAttributes.createdBy)
        && Objects.equals(this.description, productAnalyticsLaunchAttributes.description)
        && Objects.equals(this.featureFlagId, productAnalyticsLaunchAttributes.featureFlagId)
        && Objects.equals(this.featureFlagKey, productAnalyticsLaunchAttributes.featureFlagKey)
        && Objects.equals(this.kpis, productAnalyticsLaunchAttributes.kpis)
        && Objects.equals(this.name, productAnalyticsLaunchAttributes.name)
        && Objects.equals(this.orgId, productAnalyticsLaunchAttributes.orgId)
        && Objects.equals(this.phase, productAnalyticsLaunchAttributes.phase)
        && Objects.equals(this.repositoryId, productAnalyticsLaunchAttributes.repositoryId)
        && Objects.equals(this.steps, productAnalyticsLaunchAttributes.steps)
        && Objects.equals(this.updatedAt, productAnalyticsLaunchAttributes.updatedAt)
        && Objects.equals(this.updatedBy, productAnalyticsLaunchAttributes.updatedBy)
        && Objects.equals(
            this.additionalProperties, productAnalyticsLaunchAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applicationId,
        context,
        createdAt,
        createdBy,
        description,
        featureFlagId,
        featureFlagKey,
        kpis,
        name,
        orgId,
        phase,
        repositoryId,
        steps,
        updatedAt,
        updatedBy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsLaunchAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    featureFlagId: ").append(toIndentedString(featureFlagId)).append("\n");
    sb.append("    featureFlagKey: ").append(toIndentedString(featureFlagKey)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
