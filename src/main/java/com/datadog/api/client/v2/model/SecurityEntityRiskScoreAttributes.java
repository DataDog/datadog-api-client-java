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

/** Attributes of an entity risk score */
@JsonPropertyOrder({
  SecurityEntityRiskScoreAttributes.JSON_PROPERTY_CONFIG_RISKS,
  SecurityEntityRiskScoreAttributes.JSON_PROPERTY_ENTITY_ID,
  SecurityEntityRiskScoreAttributes.JSON_PROPERTY_ENTITY_METADATA,
  SecurityEntityRiskScoreAttributes.JSON_PROPERTY_ENTITY_NAME,
  SecurityEntityRiskScoreAttributes.JSON_PROPERTY_ENTITY_PROVIDERS,
  SecurityEntityRiskScoreAttributes.JSON_PROPERTY_ENTITY_ROLES,
  SecurityEntityRiskScoreAttributes.JSON_PROPERTY_ENTITY_TYPE,
  SecurityEntityRiskScoreAttributes.JSON_PROPERTY_FIRST_DETECTED,
  SecurityEntityRiskScoreAttributes.JSON_PROPERTY_LAST_ACTIVITY_TITLE,
  SecurityEntityRiskScoreAttributes.JSON_PROPERTY_LAST_DETECTED,
  SecurityEntityRiskScoreAttributes.JSON_PROPERTY_RISK_SCORE,
  SecurityEntityRiskScoreAttributes.JSON_PROPERTY_RISK_SCORE_EVOLUTION,
  SecurityEntityRiskScoreAttributes.JSON_PROPERTY_SEVERITY,
  SecurityEntityRiskScoreAttributes.JSON_PROPERTY_SIGNALS_DETECTED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityEntityRiskScoreAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG_RISKS = "configRisks";
  private SecurityEntityConfigRisks configRisks;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityID";
  private String entityId;

  public static final String JSON_PROPERTY_ENTITY_METADATA = "entityMetadata";
  private SecurityEntityMetadata entityMetadata;

  public static final String JSON_PROPERTY_ENTITY_NAME = "entityName";
  private String entityName;

  public static final String JSON_PROPERTY_ENTITY_PROVIDERS = "entityProviders";
  private List<String> entityProviders = new ArrayList<>();

  public static final String JSON_PROPERTY_ENTITY_ROLES = "entityRoles";
  private List<String> entityRoles = null;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private String entityType;

  public static final String JSON_PROPERTY_FIRST_DETECTED = "firstDetected";
  private Long firstDetected;

  public static final String JSON_PROPERTY_LAST_ACTIVITY_TITLE = "lastActivityTitle";
  private String lastActivityTitle;

  public static final String JSON_PROPERTY_LAST_DETECTED = "lastDetected";
  private Long lastDetected;

  public static final String JSON_PROPERTY_RISK_SCORE = "riskScore";
  private Double riskScore;

  public static final String JSON_PROPERTY_RISK_SCORE_EVOLUTION = "riskScoreEvolution";
  private Double riskScoreEvolution;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private SecurityEntityRiskScoreAttributesSeverity severity;

  public static final String JSON_PROPERTY_SIGNALS_DETECTED = "signalsDetected";
  private Long signalsDetected;

  public SecurityEntityRiskScoreAttributes() {}

  @JsonCreator
  public SecurityEntityRiskScoreAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG_RISKS)
          SecurityEntityConfigRisks configRisks,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTITY_ID) String entityId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTITY_METADATA)
          SecurityEntityMetadata entityMetadata,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTITY_PROVIDERS)
          List<String> entityProviders,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTITY_TYPE) String entityType,
      @JsonProperty(required = true, value = JSON_PROPERTY_FIRST_DETECTED) Long firstDetected,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_ACTIVITY_TITLE)
          String lastActivityTitle,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_DETECTED) Long lastDetected,
      @JsonProperty(required = true, value = JSON_PROPERTY_RISK_SCORE) Double riskScore,
      @JsonProperty(required = true, value = JSON_PROPERTY_RISK_SCORE_EVOLUTION)
          Double riskScoreEvolution,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY)
          SecurityEntityRiskScoreAttributesSeverity severity,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNALS_DETECTED) Long signalsDetected) {
    this.configRisks = configRisks;
    this.unparsed |= configRisks.unparsed;
    this.entityId = entityId;
    this.entityMetadata = entityMetadata;
    this.unparsed |= entityMetadata.unparsed;
    this.entityProviders = entityProviders;
    this.entityType = entityType;
    this.firstDetected = firstDetected;
    this.lastActivityTitle = lastActivityTitle;
    this.lastDetected = lastDetected;
    this.riskScore = riskScore;
    this.riskScoreEvolution = riskScoreEvolution;
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    this.signalsDetected = signalsDetected;
  }

  public SecurityEntityRiskScoreAttributes configRisks(SecurityEntityConfigRisks configRisks) {
    this.configRisks = configRisks;
    this.unparsed |= configRisks.unparsed;
    return this;
  }

  /**
   * Configuration risks associated with the entity
   *
   * @return configRisks
   */
  @JsonProperty(JSON_PROPERTY_CONFIG_RISKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityEntityConfigRisks getConfigRisks() {
    return configRisks;
  }

  public void setConfigRisks(SecurityEntityConfigRisks configRisks) {
    this.configRisks = configRisks;
  }

  public SecurityEntityRiskScoreAttributes entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Unique identifier for the entity
   *
   * @return entityId
   */
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public SecurityEntityRiskScoreAttributes entityMetadata(SecurityEntityMetadata entityMetadata) {
    this.entityMetadata = entityMetadata;
    this.unparsed |= entityMetadata.unparsed;
    return this;
  }

  /**
   * Metadata about the entity from cloud providers
   *
   * @return entityMetadata
   */
  @JsonProperty(JSON_PROPERTY_ENTITY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityEntityMetadata getEntityMetadata() {
    return entityMetadata;
  }

  public void setEntityMetadata(SecurityEntityMetadata entityMetadata) {
    this.entityMetadata = entityMetadata;
  }

  public SecurityEntityRiskScoreAttributes entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Human-readable name of the entity
   *
   * @return entityName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public SecurityEntityRiskScoreAttributes entityProviders(List<String> entityProviders) {
    this.entityProviders = entityProviders;
    return this;
  }

  public SecurityEntityRiskScoreAttributes addEntityProvidersItem(String entityProvidersItem) {
    this.entityProviders.add(entityProvidersItem);
    return this;
  }

  /**
   * Cloud providers associated with the entity
   *
   * @return entityProviders
   */
  @JsonProperty(JSON_PROPERTY_ENTITY_PROVIDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getEntityProviders() {
    return entityProviders;
  }

  public void setEntityProviders(List<String> entityProviders) {
    this.entityProviders = entityProviders;
  }

  public SecurityEntityRiskScoreAttributes entityRoles(List<String> entityRoles) {
    this.entityRoles = entityRoles;
    return this;
  }

  public SecurityEntityRiskScoreAttributes addEntityRolesItem(String entityRolesItem) {
    if (this.entityRoles == null) {
      this.entityRoles = new ArrayList<>();
    }
    this.entityRoles.add(entityRolesItem);
    return this;
  }

  /**
   * Roles associated with the entity
   *
   * @return entityRoles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEntityRoles() {
    return entityRoles;
  }

  public void setEntityRoles(List<String> entityRoles) {
    this.entityRoles = entityRoles;
  }

  public SecurityEntityRiskScoreAttributes entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Type of the entity (e.g., aws_iam_user, aws_ec2_instance)
   *
   * @return entityType
   */
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public SecurityEntityRiskScoreAttributes firstDetected(Long firstDetected) {
    this.firstDetected = firstDetected;
    return this;
  }

  /**
   * Timestamp when the entity was first detected (Unix milliseconds)
   *
   * @return firstDetected
   */
  @JsonProperty(JSON_PROPERTY_FIRST_DETECTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFirstDetected() {
    return firstDetected;
  }

  public void setFirstDetected(Long firstDetected) {
    this.firstDetected = firstDetected;
  }

  public SecurityEntityRiskScoreAttributes lastActivityTitle(String lastActivityTitle) {
    this.lastActivityTitle = lastActivityTitle;
    return this;
  }

  /**
   * Title of the most recent signal detected for this entity
   *
   * @return lastActivityTitle
   */
  @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLastActivityTitle() {
    return lastActivityTitle;
  }

  public void setLastActivityTitle(String lastActivityTitle) {
    this.lastActivityTitle = lastActivityTitle;
  }

  public SecurityEntityRiskScoreAttributes lastDetected(Long lastDetected) {
    this.lastDetected = lastDetected;
    return this;
  }

  /**
   * Timestamp when the entity was last detected (Unix milliseconds)
   *
   * @return lastDetected
   */
  @JsonProperty(JSON_PROPERTY_LAST_DETECTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLastDetected() {
    return lastDetected;
  }

  public void setLastDetected(Long lastDetected) {
    this.lastDetected = lastDetected;
  }

  public SecurityEntityRiskScoreAttributes riskScore(Double riskScore) {
    this.riskScore = riskScore;
    return this;
  }

  /**
   * Current risk score for the entity
   *
   * @return riskScore
   */
  @JsonProperty(JSON_PROPERTY_RISK_SCORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getRiskScore() {
    return riskScore;
  }

  public void setRiskScore(Double riskScore) {
    this.riskScore = riskScore;
  }

  public SecurityEntityRiskScoreAttributes riskScoreEvolution(Double riskScoreEvolution) {
    this.riskScoreEvolution = riskScoreEvolution;
    return this;
  }

  /**
   * Change in risk score compared to previous period
   *
   * @return riskScoreEvolution
   */
  @JsonProperty(JSON_PROPERTY_RISK_SCORE_EVOLUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getRiskScoreEvolution() {
    return riskScoreEvolution;
  }

  public void setRiskScoreEvolution(Double riskScoreEvolution) {
    this.riskScoreEvolution = riskScoreEvolution;
  }

  public SecurityEntityRiskScoreAttributes severity(
      SecurityEntityRiskScoreAttributesSeverity severity) {
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    return this;
  }

  /**
   * Severity level based on risk score
   *
   * @return severity
   */
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityEntityRiskScoreAttributesSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(SecurityEntityRiskScoreAttributesSeverity severity) {
    if (!severity.isValid()) {
      this.unparsed = true;
    }
    this.severity = severity;
  }

  public SecurityEntityRiskScoreAttributes signalsDetected(Long signalsDetected) {
    this.signalsDetected = signalsDetected;
    return this;
  }

  /**
   * Number of security signals detected for this entity
   *
   * @return signalsDetected
   */
  @JsonProperty(JSON_PROPERTY_SIGNALS_DETECTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSignalsDetected() {
    return signalsDetected;
  }

  public void setSignalsDetected(Long signalsDetected) {
    this.signalsDetected = signalsDetected;
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
   * @return SecurityEntityRiskScoreAttributes
   */
  @JsonAnySetter
  public SecurityEntityRiskScoreAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityEntityRiskScoreAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityEntityRiskScoreAttributes securityEntityRiskScoreAttributes =
        (SecurityEntityRiskScoreAttributes) o;
    return Objects.equals(this.configRisks, securityEntityRiskScoreAttributes.configRisks)
        && Objects.equals(this.entityId, securityEntityRiskScoreAttributes.entityId)
        && Objects.equals(this.entityMetadata, securityEntityRiskScoreAttributes.entityMetadata)
        && Objects.equals(this.entityName, securityEntityRiskScoreAttributes.entityName)
        && Objects.equals(this.entityProviders, securityEntityRiskScoreAttributes.entityProviders)
        && Objects.equals(this.entityRoles, securityEntityRiskScoreAttributes.entityRoles)
        && Objects.equals(this.entityType, securityEntityRiskScoreAttributes.entityType)
        && Objects.equals(this.firstDetected, securityEntityRiskScoreAttributes.firstDetected)
        && Objects.equals(
            this.lastActivityTitle, securityEntityRiskScoreAttributes.lastActivityTitle)
        && Objects.equals(this.lastDetected, securityEntityRiskScoreAttributes.lastDetected)
        && Objects.equals(this.riskScore, securityEntityRiskScoreAttributes.riskScore)
        && Objects.equals(
            this.riskScoreEvolution, securityEntityRiskScoreAttributes.riskScoreEvolution)
        && Objects.equals(this.severity, securityEntityRiskScoreAttributes.severity)
        && Objects.equals(this.signalsDetected, securityEntityRiskScoreAttributes.signalsDetected)
        && Objects.equals(
            this.additionalProperties, securityEntityRiskScoreAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        configRisks,
        entityId,
        entityMetadata,
        entityName,
        entityProviders,
        entityRoles,
        entityType,
        firstDetected,
        lastActivityTitle,
        lastDetected,
        riskScore,
        riskScoreEvolution,
        severity,
        signalsDetected,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityEntityRiskScoreAttributes {\n");
    sb.append("    configRisks: ").append(toIndentedString(configRisks)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityMetadata: ").append(toIndentedString(entityMetadata)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    entityProviders: ").append(toIndentedString(entityProviders)).append("\n");
    sb.append("    entityRoles: ").append(toIndentedString(entityRoles)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    firstDetected: ").append(toIndentedString(firstDetected)).append("\n");
    sb.append("    lastActivityTitle: ").append(toIndentedString(lastActivityTitle)).append("\n");
    sb.append("    lastDetected: ").append(toIndentedString(lastDetected)).append("\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
    sb.append("    riskScoreEvolution: ").append(toIndentedString(riskScoreEvolution)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    signalsDetected: ").append(toIndentedString(signalsDetected)).append("\n");
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
