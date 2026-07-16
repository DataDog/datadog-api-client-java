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
  GovernanceControlAttributes.JSON_PROPERTY_DETECTION_FREQUENCY,
  GovernanceControlAttributes.JSON_PROPERTY_DETECTION_PARAMETERS,
  GovernanceControlAttributes.JSON_PROPERTY_DETECTION_TYPE,
  GovernanceControlAttributes.JSON_PROPERTY_FEATURE_FLAGS,
  GovernanceControlAttributes.JSON_PROPERTY_INSIGHTS,
  GovernanceControlAttributes.JSON_PROPERTY_LAST_DETECTION_AT,
  GovernanceControlAttributes.JSON_PROPERTY_MITIGATED_DETECTIONS_COUNT,
  GovernanceControlAttributes.JSON_PROPERTY_MITIGATION_PARAMETERS,
  GovernanceControlAttributes.JSON_PROPERTY_MITIGATION_TYPE,
  GovernanceControlAttributes.JSON_PROPERTY_MITIGATIONS,
  GovernanceControlAttributes.JSON_PROPERTY_NAME,
  GovernanceControlAttributes.JSON_PROPERTY_NEXT_STEPS,
  GovernanceControlAttributes.JSON_PROPERTY_NOTIFICATION_FREQUENCY,
  GovernanceControlAttributes.JSON_PROPERTY_NOTIFICATION_PARAMETERS,
  GovernanceControlAttributes.JSON_PROPERTY_NOTIFICATION_TYPE,
  GovernanceControlAttributes.JSON_PROPERTY_PRIORITY,
  GovernanceControlAttributes.JSON_PROPERTY_PRODUCT,
  GovernanceControlAttributes.JSON_PROPERTY_RELEASE_STATUS,
  GovernanceControlAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  GovernanceControlAttributes.JSON_PROPERTY_RESOURCE_TYPE_DISPLAY_NAME,
  GovernanceControlAttributes.JSON_PROPERTY_SUPPORTED_DETECTION_PARAMETERS,
  GovernanceControlAttributes.JSON_PROPERTY_SUPPORTED_NOTIFICATION_PARAMETERS,
  GovernanceControlAttributes.JSON_PROPERTY_TASK,
  GovernanceControlAttributes.JSON_PROPERTY_TYPE,
  GovernanceControlAttributes.JSON_PROPERTY_USAGE_CONCERN
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

  public static final String JSON_PROPERTY_DETECTION_FREQUENCY = "detection_frequency";
  private String detectionFrequency;

  public static final String JSON_PROPERTY_DETECTION_PARAMETERS = "detection_parameters";
  private Map<String, Object> detectionParameters = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_DETECTION_TYPE = "detection_type";
  private String detectionType;

  public static final String JSON_PROPERTY_FEATURE_FLAGS = "feature_flags";
  private List<String> featureFlags = new ArrayList<>();

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

  public static final String JSON_PROPERTY_NEXT_STEPS = "next_steps";
  private String nextSteps;

  public static final String JSON_PROPERTY_NOTIFICATION_FREQUENCY = "notification_frequency";
  private String notificationFrequency;

  public static final String JSON_PROPERTY_NOTIFICATION_PARAMETERS = "notification_parameters";
  private Map<String, Object> notificationParameters = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_NOTIFICATION_TYPE = "notification_type";
  private String notificationType;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private String priority;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private String product;

  public static final String JSON_PROPERTY_RELEASE_STATUS = "release_status";
  private String releaseStatus;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private String resourceType;

  public static final String JSON_PROPERTY_RESOURCE_TYPE_DISPLAY_NAME =
      "resource_type_display_name";
  private String resourceTypeDisplayName;

  public static final String JSON_PROPERTY_SUPPORTED_DETECTION_PARAMETERS =
      "supported_detection_parameters";
  private List<GovernanceControlParameterDefinition> supportedDetectionParameters =
      new ArrayList<>();

  public static final String JSON_PROPERTY_SUPPORTED_NOTIFICATION_PARAMETERS =
      "supported_notification_parameters";
  private List<GovernanceControlParameterDefinition> supportedNotificationParameters =
      new ArrayList<>();

  public static final String JSON_PROPERTY_TASK = "task";
  private String task;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_USAGE_CONCERN = "usage_concern";
  private String usageConcern;

  public GovernanceControlAttributes() {}

  @JsonCreator
  public GovernanceControlAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTIVE_DETECTIONS_COUNT)
          Long activeDetectionsCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY) String category,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_DETECTION_FREQUENCY)
          String detectionFrequency,
      @JsonProperty(required = true, value = JSON_PROPERTY_DETECTION_PARAMETERS)
          Map<String, Object> detectionParameters,
      @JsonProperty(required = true, value = JSON_PROPERTY_DETECTION_TYPE) String detectionType,
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_FLAGS) List<String> featureFlags,
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
      @JsonProperty(required = true, value = JSON_PROPERTY_NEXT_STEPS) String nextSteps,
      @JsonProperty(required = true, value = JSON_PROPERTY_NOTIFICATION_FREQUENCY)
          String notificationFrequency,
      @JsonProperty(required = true, value = JSON_PROPERTY_NOTIFICATION_PARAMETERS)
          Map<String, Object> notificationParameters,
      @JsonProperty(required = true, value = JSON_PROPERTY_NOTIFICATION_TYPE)
          String notificationType,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIORITY) String priority,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRODUCT) String product,
      @JsonProperty(required = true, value = JSON_PROPERTY_RELEASE_STATUS) String releaseStatus,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE) String resourceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE_DISPLAY_NAME)
          String resourceTypeDisplayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUPPORTED_DETECTION_PARAMETERS)
          List<GovernanceControlParameterDefinition> supportedDetectionParameters,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUPPORTED_NOTIFICATION_PARAMETERS)
          List<GovernanceControlParameterDefinition> supportedNotificationParameters,
      @JsonProperty(required = true, value = JSON_PROPERTY_TASK) String task,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type,
      @JsonProperty(required = true, value = JSON_PROPERTY_USAGE_CONCERN) String usageConcern) {
    this.activeDetectionsCount = activeDetectionsCount;
    this.category = category;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.description = description;
    this.detectionFrequency = detectionFrequency;
    this.detectionParameters = detectionParameters;
    this.detectionType = detectionType;
    this.featureFlags = featureFlags;
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
    this.nextSteps = nextSteps;
    this.notificationFrequency = notificationFrequency;
    this.notificationParameters = notificationParameters;
    this.notificationType = notificationType;
    this.priority = priority;
    this.product = product;
    this.releaseStatus = releaseStatus;
    this.resourceType = resourceType;
    this.resourceTypeDisplayName = resourceTypeDisplayName;
    this.supportedDetectionParameters = supportedDetectionParameters;
    for (GovernanceControlParameterDefinition item : supportedDetectionParameters) {
      this.unparsed |= item.unparsed;
    }
    this.supportedNotificationParameters = supportedNotificationParameters;
    for (GovernanceControlParameterDefinition item : supportedNotificationParameters) {
      this.unparsed |= item.unparsed;
    }
    this.task = task;
    this.type = type;
    this.usageConcern = usageConcern;
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

  public GovernanceControlAttributes detectionFrequency(String detectionFrequency) {
    this.detectionFrequency = detectionFrequency;
    return this;
  }

  /**
   * How often detections are evaluated for the control.
   *
   * @return detectionFrequency
   */
  @JsonProperty(JSON_PROPERTY_DETECTION_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDetectionFrequency() {
    return detectionFrequency;
  }

  public void setDetectionFrequency(String detectionFrequency) {
    this.detectionFrequency = detectionFrequency;
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

  public GovernanceControlAttributes detectionType(String detectionType) {
    this.detectionType = detectionType;
    return this;
  }

  /**
   * The detection type that uniquely identifies the control.
   *
   * @return detectionType
   */
  @JsonProperty(JSON_PROPERTY_DETECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDetectionType() {
    return detectionType;
  }

  public void setDetectionType(String detectionType) {
    this.detectionType = detectionType;
  }

  public GovernanceControlAttributes featureFlags(List<String> featureFlags) {
    this.featureFlags = featureFlags;
    return this;
  }

  public GovernanceControlAttributes addFeatureFlagsItem(String featureFlagsItem) {
    this.featureFlags.add(featureFlagsItem);
    return this;
  }

  /**
   * The feature flags that gate the control.
   *
   * @return featureFlags
   */
  @JsonProperty(JSON_PROPERTY_FEATURE_FLAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getFeatureFlags() {
    return featureFlags;
  }

  public void setFeatureFlags(List<String> featureFlags) {
    this.featureFlags = featureFlags;
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

  public GovernanceControlAttributes nextSteps(String nextSteps) {
    this.nextSteps = nextSteps;
    return this;
  }

  /**
   * Guidance on the next steps to remediate detections for the control.
   *
   * @return nextSteps
   */
  @JsonProperty(JSON_PROPERTY_NEXT_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNextSteps() {
    return nextSteps;
  }

  public void setNextSteps(String nextSteps) {
    this.nextSteps = nextSteps;
  }

  public GovernanceControlAttributes notificationFrequency(String notificationFrequency) {
    this.notificationFrequency = notificationFrequency;
    return this;
  }

  /**
   * The configured notification frequency for the control. Empty when not configured.
   *
   * @return notificationFrequency
   */
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNotificationFrequency() {
    return notificationFrequency;
  }

  public void setNotificationFrequency(String notificationFrequency) {
    this.notificationFrequency = notificationFrequency;
  }

  public GovernanceControlAttributes notificationParameters(
      Map<String, Object> notificationParameters) {
    this.notificationParameters = notificationParameters;
    return this;
  }

  public GovernanceControlAttributes putNotificationParametersItem(
      String key, Object notificationParametersItem) {
    this.notificationParameters.put(key, notificationParametersItem);
    return this;
  }

  /**
   * A free-form map of parameter names to their configured values.
   *
   * @return notificationParameters
   */
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getNotificationParameters() {
    return notificationParameters;
  }

  public void setNotificationParameters(Map<String, Object> notificationParameters) {
    this.notificationParameters = notificationParameters;
  }

  public GovernanceControlAttributes notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * The configured notification type for the control. Empty when not configured.
   *
   * @return notificationType
   */
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
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

  public GovernanceControlAttributes releaseStatus(String releaseStatus) {
    this.releaseStatus = releaseStatus;
    return this;
  }

  /**
   * The release status of the control, such as <code>prod</code> or <code>beta</code>.
   *
   * @return releaseStatus
   */
  @JsonProperty(JSON_PROPERTY_RELEASE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReleaseStatus() {
    return releaseStatus;
  }

  public void setReleaseStatus(String releaseStatus) {
    this.releaseStatus = releaseStatus;
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

  public GovernanceControlAttributes supportedNotificationParameters(
      List<GovernanceControlParameterDefinition> supportedNotificationParameters) {
    this.supportedNotificationParameters = supportedNotificationParameters;
    for (GovernanceControlParameterDefinition item : supportedNotificationParameters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GovernanceControlAttributes addSupportedNotificationParametersItem(
      GovernanceControlParameterDefinition supportedNotificationParametersItem) {
    this.supportedNotificationParameters.add(supportedNotificationParametersItem);
    this.unparsed |= supportedNotificationParametersItem.unparsed;
    return this;
  }

  /**
   * An array of parameter definitions.
   *
   * @return supportedNotificationParameters
   */
  @JsonProperty(JSON_PROPERTY_SUPPORTED_NOTIFICATION_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GovernanceControlParameterDefinition> getSupportedNotificationParameters() {
    return supportedNotificationParameters;
  }

  public void setSupportedNotificationParameters(
      List<GovernanceControlParameterDefinition> supportedNotificationParameters) {
    this.supportedNotificationParameters = supportedNotificationParameters;
    if (supportedNotificationParameters != null) {
      for (GovernanceControlParameterDefinition item : supportedNotificationParameters) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public GovernanceControlAttributes task(String task) {
    this.task = task;
    return this;
  }

  /**
   * A short description of the remediation task for the control.
   *
   * @return task
   */
  @JsonProperty(JSON_PROPERTY_TASK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
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

  public GovernanceControlAttributes usageConcern(String usageConcern) {
    this.usageConcern = usageConcern;
    return this;
  }

  /**
   * The usage concern the control addresses, such as <code>Security</code> or <code>
   * Cost Optimization</code>.
   *
   * @return usageConcern
   */
  @JsonProperty(JSON_PROPERTY_USAGE_CONCERN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUsageConcern() {
    return usageConcern;
  }

  public void setUsageConcern(String usageConcern) {
    this.usageConcern = usageConcern;
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
        && Objects.equals(this.detectionFrequency, governanceControlAttributes.detectionFrequency)
        && Objects.equals(this.detectionParameters, governanceControlAttributes.detectionParameters)
        && Objects.equals(this.detectionType, governanceControlAttributes.detectionType)
        && Objects.equals(this.featureFlags, governanceControlAttributes.featureFlags)
        && Objects.equals(this.insights, governanceControlAttributes.insights)
        && Objects.equals(this.lastDetectionAt, governanceControlAttributes.lastDetectionAt)
        && Objects.equals(
            this.mitigatedDetectionsCount, governanceControlAttributes.mitigatedDetectionsCount)
        && Objects.equals(
            this.mitigationParameters, governanceControlAttributes.mitigationParameters)
        && Objects.equals(this.mitigationType, governanceControlAttributes.mitigationType)
        && Objects.equals(this.mitigations, governanceControlAttributes.mitigations)
        && Objects.equals(this.name, governanceControlAttributes.name)
        && Objects.equals(this.nextSteps, governanceControlAttributes.nextSteps)
        && Objects.equals(
            this.notificationFrequency, governanceControlAttributes.notificationFrequency)
        && Objects.equals(
            this.notificationParameters, governanceControlAttributes.notificationParameters)
        && Objects.equals(this.notificationType, governanceControlAttributes.notificationType)
        && Objects.equals(this.priority, governanceControlAttributes.priority)
        && Objects.equals(this.product, governanceControlAttributes.product)
        && Objects.equals(this.releaseStatus, governanceControlAttributes.releaseStatus)
        && Objects.equals(this.resourceType, governanceControlAttributes.resourceType)
        && Objects.equals(
            this.resourceTypeDisplayName, governanceControlAttributes.resourceTypeDisplayName)
        && Objects.equals(
            this.supportedDetectionParameters,
            governanceControlAttributes.supportedDetectionParameters)
        && Objects.equals(
            this.supportedNotificationParameters,
            governanceControlAttributes.supportedNotificationParameters)
        && Objects.equals(this.task, governanceControlAttributes.task)
        && Objects.equals(this.type, governanceControlAttributes.type)
        && Objects.equals(this.usageConcern, governanceControlAttributes.usageConcern)
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
        detectionFrequency,
        detectionParameters,
        detectionType,
        featureFlags,
        insights,
        lastDetectionAt,
        mitigatedDetectionsCount,
        mitigationParameters,
        mitigationType,
        mitigations,
        name,
        nextSteps,
        notificationFrequency,
        notificationParameters,
        notificationType,
        priority,
        product,
        releaseStatus,
        resourceType,
        resourceTypeDisplayName,
        supportedDetectionParameters,
        supportedNotificationParameters,
        task,
        type,
        usageConcern,
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
    sb.append("    detectionFrequency: ").append(toIndentedString(detectionFrequency)).append("\n");
    sb.append("    detectionParameters: ")
        .append(toIndentedString(detectionParameters))
        .append("\n");
    sb.append("    detectionType: ").append(toIndentedString(detectionType)).append("\n");
    sb.append("    featureFlags: ").append(toIndentedString(featureFlags)).append("\n");
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
    sb.append("    nextSteps: ").append(toIndentedString(nextSteps)).append("\n");
    sb.append("    notificationFrequency: ")
        .append(toIndentedString(notificationFrequency))
        .append("\n");
    sb.append("    notificationParameters: ")
        .append(toIndentedString(notificationParameters))
        .append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    releaseStatus: ").append(toIndentedString(releaseStatus)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceTypeDisplayName: ")
        .append(toIndentedString(resourceTypeDisplayName))
        .append("\n");
    sb.append("    supportedDetectionParameters: ")
        .append(toIndentedString(supportedDetectionParameters))
        .append("\n");
    sb.append("    supportedNotificationParameters: ")
        .append(toIndentedString(supportedNotificationParameters))
        .append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usageConcern: ").append(toIndentedString(usageConcern)).append("\n");
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
