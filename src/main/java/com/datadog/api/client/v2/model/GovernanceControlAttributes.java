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

/** The attributes of a governance control. */
@JsonPropertyOrder({
  GovernanceControlAttributes.JSON_PROPERTY_ACTIVE_DETECTIONS_COUNT,
  GovernanceControlAttributes.JSON_PROPERTY_CATEGORY,
  GovernanceControlAttributes.JSON_PROPERTY_CREATED_AT,
  GovernanceControlAttributes.JSON_PROPERTY_CREATED_BY,
  GovernanceControlAttributes.JSON_PROPERTY_DESCRIPTION,
  GovernanceControlAttributes.JSON_PROPERTY_DETECTION_PARAMETERS,
  GovernanceControlAttributes.JSON_PROPERTY_INSIGHTS,
  GovernanceControlAttributes.JSON_PROPERTY_LAST_DETECTION_AT,
  GovernanceControlAttributes.JSON_PROPERTY_MITIGATED_DETECTIONS_COUNT,
  GovernanceControlAttributes.JSON_PROPERTY_MITIGATION_PARAMETERS,
  GovernanceControlAttributes.JSON_PROPERTY_MITIGATION_TYPE,
  GovernanceControlAttributes.JSON_PROPERTY_MITIGATIONS,
  GovernanceControlAttributes.JSON_PROPERTY_NAME,
  GovernanceControlAttributes.JSON_PROPERTY_PRIORITY,
  GovernanceControlAttributes.JSON_PROPERTY_PRODUCT,
  GovernanceControlAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  GovernanceControlAttributes.JSON_PROPERTY_RESOURCE_TYPE_DISPLAY_NAME,
  GovernanceControlAttributes.JSON_PROPERTY_SUPPORTED_DETECTION_PARAMETERS,
  GovernanceControlAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceControlAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIVE_DETECTIONS_COUNT = "active_detections_count";
  private Long activeDetectionsCount;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DETECTION_PARAMETERS = "detection_parameters";
  private Map<String, Object> detectionParameters = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_INSIGHTS = "insights";
  private List<String> insights = new ArrayList<>();

  public static final String JSON_PROPERTY_LAST_DETECTION_AT = "last_detection_at";
  private OffsetDateTime lastDetectionAt;

  public static final String JSON_PROPERTY_MITIGATED_DETECTIONS_COUNT =
      "mitigated_detections_count";
  private Long mitigatedDetectionsCount;

  public static final String JSON_PROPERTY_MITIGATION_PARAMETERS = "mitigation_parameters";
  private Map<String, Object> mitigationParameters = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_MITIGATION_TYPE = "mitigation_type";
  private String mitigationType;

  public static final String JSON_PROPERTY_MITIGATIONS = "mitigations";
  private List<GovernanceControlMitigationDefinition> mitigations = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private String priority;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private String product;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private String resourceType;

  public static final String JSON_PROPERTY_RESOURCE_TYPE_DISPLAY_NAME =
      "resource_type_display_name";
  private String resourceTypeDisplayName;

  public static final String JSON_PROPERTY_SUPPORTED_DETECTION_PARAMETERS =
      "supported_detection_parameters";
  private List<GovernanceControlParameterDefinition> supportedDetectionParameters =
      new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public GovernanceControlAttributes() {}

  @JsonCreator
  public GovernanceControlAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTIVE_DETECTIONS_COUNT)
          Long activeDetectionsCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY) String category,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_DETECTION_PARAMETERS)
          Map<String, Object> detectionParameters,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSIGHTS) List<String> insights,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_DETECTION_AT)
          OffsetDateTime lastDetectionAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MITIGATED_DETECTIONS_COUNT)
          Long mitigatedDetectionsCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_MITIGATION_PARAMETERS)
          Map<String, Object> mitigationParameters,
      @JsonProperty(required = true, value = JSON_PROPERTY_MITIGATION_TYPE) String mitigationType,
      @JsonProperty(required = true, value = JSON_PROPERTY_MITIGATIONS)
          List<GovernanceControlMitigationDefinition> mitigations,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIORITY) String priority,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRODUCT) String product,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE) String resourceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE_DISPLAY_NAME)
          String resourceTypeDisplayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUPPORTED_DETECTION_PARAMETERS)
          List<GovernanceControlParameterDefinition> supportedDetectionParameters,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.activeDetectionsCount = activeDetectionsCount;
    this.category = category;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.description = description;
    this.detectionParameters = detectionParameters;
    this.insights = insights;
    this.lastDetectionAt = lastDetectionAt;
    if (lastDetectionAt != null) {}
    this.mitigatedDetectionsCount = mitigatedDetectionsCount;
    this.mitigationParameters = mitigationParameters;
    this.mitigationType = mitigationType;
    this.mitigations = mitigations;
    for (GovernanceControlMitigationDefinition item : mitigations) {
      this.unparsed |= item.unparsed;
    }
    this.name = name;
    this.priority = priority;
    this.product = product;
    this.resourceType = resourceType;
    this.resourceTypeDisplayName = resourceTypeDisplayName;
    this.supportedDetectionParameters = supportedDetectionParameters;
    for (GovernanceControlParameterDefinition item : supportedDetectionParameters) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
  }

  public GovernanceControlAttributes activeDetectionsCount(Long activeDetectionsCount) {
    this.activeDetectionsCount = activeDetectionsCount;
    return this;
  }

  /**
   * The number of active detections for the control.
   *
   * @return activeDetectionsCount
   */
  @JsonProperty(JSON_PROPERTY_ACTIVE_DETECTIONS_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getActiveDetectionsCount() {
    return activeDetectionsCount;
  }

  public void setActiveDetectionsCount(Long activeDetectionsCount) {
    this.activeDetectionsCount = activeDetectionsCount;
  }

  public GovernanceControlAttributes category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The value driver the control is grouped under, such as <code>security</code> or <code>cost
   * </code>.
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public GovernanceControlAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time the control configuration was created.
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

  public GovernanceControlAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The UUID of the user who created the control configuration.
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

  public GovernanceControlAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-readable description of what the control detects.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GovernanceControlAttributes detectionParameters(Map<String, Object> detectionParameters) {
    this.detectionParameters = detectionParameters;
    return this;
  }

  public GovernanceControlAttributes putDetectionParametersItem(
      String key, Object detectionParametersItem) {
    this.detectionParameters.put(key, detectionParametersItem);
    return this;
  }

  /**
   * A free-form map of parameter names to their configured values.
   *
   * @return detectionParameters
   */
  @JsonProperty(JSON_PROPERTY_DETECTION_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getDetectionParameters() {
    return detectionParameters;
  }

  public void setDetectionParameters(Map<String, Object> detectionParameters) {
    this.detectionParameters = detectionParameters;
  }

  public GovernanceControlAttributes insights(List<String> insights) {
    this.insights = insights;
    return this;
  }

  public GovernanceControlAttributes addInsightsItem(String insightsItem) {
    this.insights.add(insightsItem);
    return this;
  }

  /**
   * The insight slugs associated with the control.
   *
   * @return insights
   */
  @JsonProperty(JSON_PROPERTY_INSIGHTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getInsights() {
    return insights;
  }

  public void setInsights(List<String> insights) {
    this.insights = insights;
  }

  public GovernanceControlAttributes lastDetectionAt(OffsetDateTime lastDetectionAt) {
    this.lastDetectionAt = lastDetectionAt;
    if (lastDetectionAt != null) {}
    return this;
  }

  /**
   * The time of the most recent detection for the control. <code>null</code> when there are no
   * detections.
   *
   * @return lastDetectionAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_DETECTION_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastDetectionAt() {
    return lastDetectionAt;
  }

  public void setLastDetectionAt(OffsetDateTime lastDetectionAt) {
    this.lastDetectionAt = lastDetectionAt;
  }

  public GovernanceControlAttributes mitigatedDetectionsCount(Long mitigatedDetectionsCount) {
    this.mitigatedDetectionsCount = mitigatedDetectionsCount;
    return this;
  }

  /**
   * The number of mitigated detections for the control.
   *
   * @return mitigatedDetectionsCount
   */
  @JsonProperty(JSON_PROPERTY_MITIGATED_DETECTIONS_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMitigatedDetectionsCount() {
    return mitigatedDetectionsCount;
  }

  public void setMitigatedDetectionsCount(Long mitigatedDetectionsCount) {
    this.mitigatedDetectionsCount = mitigatedDetectionsCount;
  }

  public GovernanceControlAttributes mitigationParameters(
      Map<String, Object> mitigationParameters) {
    this.mitigationParameters = mitigationParameters;
    return this;
  }

  public GovernanceControlAttributes putMitigationParametersItem(
      String key, Object mitigationParametersItem) {
    this.mitigationParameters.put(key, mitigationParametersItem);
    return this;
  }

  /**
   * A free-form map of parameter names to their configured values.
   *
   * @return mitigationParameters
   */
  @JsonProperty(JSON_PROPERTY_MITIGATION_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getMitigationParameters() {
    return mitigationParameters;
  }

  public void setMitigationParameters(Map<String, Object> mitigationParameters) {
    this.mitigationParameters = mitigationParameters;
  }

  public GovernanceControlAttributes mitigationType(String mitigationType) {
    this.mitigationType = mitigationType;
    return this;
  }

  /**
   * The configured mitigation type for the control. Empty when not configured.
   *
   * @return mitigationType
   */
  @JsonProperty(JSON_PROPERTY_MITIGATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMitigationType() {
    return mitigationType;
  }

  public void setMitigationType(String mitigationType) {
    this.mitigationType = mitigationType;
  }

  public GovernanceControlAttributes mitigations(
      List<GovernanceControlMitigationDefinition> mitigations) {
    this.mitigations = mitigations;
    for (GovernanceControlMitigationDefinition item : mitigations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GovernanceControlAttributes addMitigationsItem(
      GovernanceControlMitigationDefinition mitigationsItem) {
    this.mitigations.add(mitigationsItem);
    this.unparsed |= mitigationsItem.unparsed;
    return this;
  }

  /**
   * The mitigations available for a control.
   *
   * @return mitigations
   */
  @JsonProperty(JSON_PROPERTY_MITIGATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GovernanceControlMitigationDefinition> getMitigations() {
    return mitigations;
  }

  public void setMitigations(List<GovernanceControlMitigationDefinition> mitigations) {
    this.mitigations = mitigations;
    if (mitigations != null) {
      for (GovernanceControlMitigationDefinition item : mitigations) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public GovernanceControlAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name of the control.
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

  public GovernanceControlAttributes priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The priority of the control, such as <code>High</code>.
   *
   * @return priority
   */
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public GovernanceControlAttributes product(String product) {
    this.product = product;
    return this;
  }

  /**
   * The product the control belongs to.
   *
   * @return product
   */
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public GovernanceControlAttributes resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The type of resource the control evaluates.
   *
   * @return resourceType
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public GovernanceControlAttributes resourceTypeDisplayName(String resourceTypeDisplayName) {
    this.resourceTypeDisplayName = resourceTypeDisplayName;
    return this;
  }

  /**
   * The human-readable name of the resource type.
   *
   * @return resourceTypeDisplayName
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceTypeDisplayName() {
    return resourceTypeDisplayName;
  }

  public void setResourceTypeDisplayName(String resourceTypeDisplayName) {
    this.resourceTypeDisplayName = resourceTypeDisplayName;
  }

  public GovernanceControlAttributes supportedDetectionParameters(
      List<GovernanceControlParameterDefinition> supportedDetectionParameters) {
    this.supportedDetectionParameters = supportedDetectionParameters;
    for (GovernanceControlParameterDefinition item : supportedDetectionParameters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GovernanceControlAttributes addSupportedDetectionParametersItem(
      GovernanceControlParameterDefinition supportedDetectionParametersItem) {
    this.supportedDetectionParameters.add(supportedDetectionParametersItem);
    this.unparsed |= supportedDetectionParametersItem.unparsed;
    return this;
  }

  /**
   * An array of parameter definitions.
   *
   * @return supportedDetectionParameters
   */
  @JsonProperty(JSON_PROPERTY_SUPPORTED_DETECTION_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GovernanceControlParameterDefinition> getSupportedDetectionParameters() {
    return supportedDetectionParameters;
  }

  public void setSupportedDetectionParameters(
      List<GovernanceControlParameterDefinition> supportedDetectionParameters) {
    this.supportedDetectionParameters = supportedDetectionParameters;
    if (supportedDetectionParameters != null) {
      for (GovernanceControlParameterDefinition item : supportedDetectionParameters) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public GovernanceControlAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The control type, such as <code>Proactive</code> or <code>Detection</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return GovernanceControlAttributes
   */
  @JsonAnySetter
  public GovernanceControlAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GovernanceControlAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernanceControlAttributes governanceControlAttributes = (GovernanceControlAttributes) o;
    return Objects.equals(
            this.activeDetectionsCount, governanceControlAttributes.activeDetectionsCount)
        && Objects.equals(this.category, governanceControlAttributes.category)
        && Objects.equals(this.createdAt, governanceControlAttributes.createdAt)
        && Objects.equals(this.createdBy, governanceControlAttributes.createdBy)
        && Objects.equals(this.description, governanceControlAttributes.description)
        && Objects.equals(this.detectionParameters, governanceControlAttributes.detectionParameters)
        && Objects.equals(this.insights, governanceControlAttributes.insights)
        && Objects.equals(this.lastDetectionAt, governanceControlAttributes.lastDetectionAt)
        && Objects.equals(
            this.mitigatedDetectionsCount, governanceControlAttributes.mitigatedDetectionsCount)
        && Objects.equals(
            this.mitigationParameters, governanceControlAttributes.mitigationParameters)
        && Objects.equals(this.mitigationType, governanceControlAttributes.mitigationType)
        && Objects.equals(this.mitigations, governanceControlAttributes.mitigations)
        && Objects.equals(this.name, governanceControlAttributes.name)
        && Objects.equals(this.priority, governanceControlAttributes.priority)
        && Objects.equals(this.product, governanceControlAttributes.product)
        && Objects.equals(this.resourceType, governanceControlAttributes.resourceType)
        && Objects.equals(
            this.resourceTypeDisplayName, governanceControlAttributes.resourceTypeDisplayName)
        && Objects.equals(
            this.supportedDetectionParameters,
            governanceControlAttributes.supportedDetectionParameters)
        && Objects.equals(this.type, governanceControlAttributes.type)
        && Objects.equals(
            this.additionalProperties, governanceControlAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        activeDetectionsCount,
        category,
        createdAt,
        createdBy,
        description,
        detectionParameters,
        insights,
        lastDetectionAt,
        mitigatedDetectionsCount,
        mitigationParameters,
        mitigationType,
        mitigations,
        name,
        priority,
        product,
        resourceType,
        resourceTypeDisplayName,
        supportedDetectionParameters,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernanceControlAttributes {\n");
    sb.append("    activeDetectionsCount: ")
        .append(toIndentedString(activeDetectionsCount))
        .append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    detectionParameters: ")
        .append(toIndentedString(detectionParameters))
        .append("\n");
    sb.append("    insights: ").append(toIndentedString(insights)).append("\n");
    sb.append("    lastDetectionAt: ").append(toIndentedString(lastDetectionAt)).append("\n");
    sb.append("    mitigatedDetectionsCount: ")
        .append(toIndentedString(mitigatedDetectionsCount))
        .append("\n");
    sb.append("    mitigationParameters: ")
        .append(toIndentedString(mitigationParameters))
        .append("\n");
    sb.append("    mitigationType: ").append(toIndentedString(mitigationType)).append("\n");
    sb.append("    mitigations: ").append(toIndentedString(mitigations)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceTypeDisplayName: ")
        .append(toIndentedString(resourceTypeDisplayName))
        .append("\n");
    sb.append("    supportedDetectionParameters: ")
        .append(toIndentedString(supportedDetectionParameters))
        .append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
