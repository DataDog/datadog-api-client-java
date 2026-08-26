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

/**
 * A STIX 2.1 object. Indicator objects are processed and ingested; other STIX object types are
 * accepted and counted in the <code>unsupported</code> response counter.
 */
@JsonPropertyOrder({
  STIXObject.JSON_PROPERTY_CONFIDENCE,
  STIXObject.JSON_PROPERTY_CREATED,
  STIXObject.JSON_PROPERTY_EXTERNAL_REFERENCES,
  STIXObject.JSON_PROPERTY_ID,
  STIXObject.JSON_PROPERTY_INDICATOR_TYPES,
  STIXObject.JSON_PROPERTY_KILL_CHAIN_PHASES,
  STIXObject.JSON_PROPERTY_LABELS,
  STIXObject.JSON_PROPERTY_MODIFIED,
  STIXObject.JSON_PROPERTY_OBJECT_MARKING_REFS,
  STIXObject.JSON_PROPERTY_PATTERN,
  STIXObject.JSON_PROPERTY_PATTERN_TYPE,
  STIXObject.JSON_PROPERTY_REVOKED,
  STIXObject.JSON_PROPERTY_SPEC_VERSION,
  STIXObject.JSON_PROPERTY_TYPE,
  STIXObject.JSON_PROPERTY_VALID_FROM,
  STIXObject.JSON_PROPERTY_VALID_UNTIL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class STIXObject {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIDENCE = "confidence";
  private Integer confidence;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_EXTERNAL_REFERENCES = "external_references";
  private List<Map<String, Object>> externalReferences = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INDICATOR_TYPES = "indicator_types";
  private List<String> indicatorTypes = null;

  public static final String JSON_PROPERTY_KILL_CHAIN_PHASES = "kill_chain_phases";
  private List<Map<String, Object>> killChainPhases = null;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<String> labels = null;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_OBJECT_MARKING_REFS = "object_marking_refs";
  private List<String> objectMarkingRefs = null;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public static final String JSON_PROPERTY_PATTERN_TYPE = "pattern_type";
  private STIXPatternType patternType;

  public static final String JSON_PROPERTY_REVOKED = "revoked";
  private Boolean revoked;

  public static final String JSON_PROPERTY_SPEC_VERSION = "spec_version";
  private STIXSpecVersion specVersion;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VALID_FROM = "valid_from";
  private OffsetDateTime validFrom;

  public static final String JSON_PROPERTY_VALID_UNTIL = "valid_until";
  private OffsetDateTime validUntil;

  public STIXObject() {}

  @JsonCreator
  public STIXObject(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.id = id;
    this.type = type;
  }

  public STIXObject confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * The confidence in the correctness of the indicator, from 0 through 100. minimum: 0 maximum: 100
   *
   * @return confidence
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  public STIXObject created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The time when the object was created.
   *
   * @return created
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public STIXObject externalReferences(List<Map<String, Object>> externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  public STIXObject addExternalReferencesItem(Map<String, Object> externalReferencesItem) {
    if (this.externalReferences == null) {
      this.externalReferences = new ArrayList<>();
    }
    this.externalReferences.add(externalReferencesItem);
    return this;
  }

  /**
   * Optional external reference metadata preserved with the indicator but not interpreted during
   * ingestion.
   *
   * @return externalReferences
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Map<String, Object>> getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(List<Map<String, Object>> externalReferences) {
    this.externalReferences = externalReferences;
  }

  public STIXObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The STIX object identifier.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public STIXObject indicatorTypes(List<String> indicatorTypes) {
    this.indicatorTypes = indicatorTypes;
    return this;
  }

  public STIXObject addIndicatorTypesItem(String indicatorTypesItem) {
    if (this.indicatorTypes == null) {
      this.indicatorTypes = new ArrayList<>();
    }
    this.indicatorTypes.add(indicatorTypesItem);
    return this;
  }

  /**
   * The open vocabulary terms that categorize the indicator.
   *
   * @return indicatorTypes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDICATOR_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIndicatorTypes() {
    return indicatorTypes;
  }

  public void setIndicatorTypes(List<String> indicatorTypes) {
    this.indicatorTypes = indicatorTypes;
  }

  public STIXObject killChainPhases(List<Map<String, Object>> killChainPhases) {
    this.killChainPhases = killChainPhases;
    return this;
  }

  public STIXObject addKillChainPhasesItem(Map<String, Object> killChainPhasesItem) {
    if (this.killChainPhases == null) {
      this.killChainPhases = new ArrayList<>();
    }
    this.killChainPhases.add(killChainPhasesItem);
    return this;
  }

  /**
   * Optional kill chain metadata preserved with the indicator but not interpreted during ingestion.
   *
   * @return killChainPhases
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KILL_CHAIN_PHASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Map<String, Object>> getKillChainPhases() {
    return killChainPhases;
  }

  public void setKillChainPhases(List<Map<String, Object>> killChainPhases) {
    this.killChainPhases = killChainPhases;
  }

  public STIXObject labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public STIXObject addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Labels associated with the indicator.
   *
   * @return labels
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public STIXObject modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * The time when the object was last modified.
   *
   * @return modified
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public STIXObject objectMarkingRefs(List<String> objectMarkingRefs) {
    this.objectMarkingRefs = objectMarkingRefs;
    return this;
  }

  public STIXObject addObjectMarkingRefsItem(String objectMarkingRefsItem) {
    if (this.objectMarkingRefs == null) {
      this.objectMarkingRefs = new ArrayList<>();
    }
    this.objectMarkingRefs.add(objectMarkingRefsItem);
    return this;
  }

  /**
   * References to marking definition objects that apply to the indicator.
   *
   * @return objectMarkingRefs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT_MARKING_REFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getObjectMarkingRefs() {
    return objectMarkingRefs;
  }

  public void setObjectMarkingRefs(List<String> objectMarkingRefs) {
    this.objectMarkingRefs = objectMarkingRefs;
  }

  public STIXObject pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * The STIX pattern that identifies the observable. Present on indicator objects.
   *
   * @return pattern
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public STIXObject patternType(STIXPatternType patternType) {
    this.patternType = patternType;
    this.unparsed |= !patternType.isValid();
    return this;
  }

  /**
   * The supported STIX pattern language.
   *
   * @return patternType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATTERN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public STIXPatternType getPatternType() {
    return patternType;
  }

  public void setPatternType(STIXPatternType patternType) {
    if (!patternType.isValid()) {
      this.unparsed = true;
    }
    this.patternType = patternType;
  }

  public STIXObject revoked(Boolean revoked) {
    this.revoked = revoked;
    return this;
  }

  /**
   * Whether the indicator has been revoked.
   *
   * @return revoked
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVOKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRevoked() {
    return revoked;
  }

  public void setRevoked(Boolean revoked) {
    this.revoked = revoked;
  }

  public STIXObject specVersion(STIXSpecVersion specVersion) {
    this.specVersion = specVersion;
    this.unparsed |= !specVersion.isValid();
    return this;
  }

  /**
   * The supported STIX specification version.
   *
   * @return specVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPEC_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public STIXSpecVersion getSpecVersion() {
    return specVersion;
  }

  public void setSpecVersion(STIXSpecVersion specVersion) {
    if (!specVersion.isValid()) {
      this.unparsed = true;
    }
    this.specVersion = specVersion;
  }

  public STIXObject type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The STIX object type.
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

  public STIXObject validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * The time from which the indicator is considered valid. Present on indicator objects.
   *
   * @return validFrom
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public STIXObject validUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  /**
   * The time until which the indicator is considered valid.
   *
   * @return validUntil
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
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
   * @return STIXObject
   */
  @JsonAnySetter
  public STIXObject putAdditionalProperty(String key, Object value) {
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

  /** Return true if this STIXObject object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    STIXObject stixObject = (STIXObject) o;
    return Objects.equals(this.confidence, stixObject.confidence)
        && Objects.equals(this.created, stixObject.created)
        && Objects.equals(this.externalReferences, stixObject.externalReferences)
        && Objects.equals(this.id, stixObject.id)
        && Objects.equals(this.indicatorTypes, stixObject.indicatorTypes)
        && Objects.equals(this.killChainPhases, stixObject.killChainPhases)
        && Objects.equals(this.labels, stixObject.labels)
        && Objects.equals(this.modified, stixObject.modified)
        && Objects.equals(this.objectMarkingRefs, stixObject.objectMarkingRefs)
        && Objects.equals(this.pattern, stixObject.pattern)
        && Objects.equals(this.patternType, stixObject.patternType)
        && Objects.equals(this.revoked, stixObject.revoked)
        && Objects.equals(this.specVersion, stixObject.specVersion)
        && Objects.equals(this.type, stixObject.type)
        && Objects.equals(this.validFrom, stixObject.validFrom)
        && Objects.equals(this.validUntil, stixObject.validUntil)
        && Objects.equals(this.additionalProperties, stixObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        confidence,
        created,
        externalReferences,
        id,
        indicatorTypes,
        killChainPhases,
        labels,
        modified,
        objectMarkingRefs,
        pattern,
        patternType,
        revoked,
        specVersion,
        type,
        validFrom,
        validUntil,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class STIXObject {\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indicatorTypes: ").append(toIndentedString(indicatorTypes)).append("\n");
    sb.append("    killChainPhases: ").append(toIndentedString(killChainPhases)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    objectMarkingRefs: ").append(toIndentedString(objectMarkingRefs)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    patternType: ").append(toIndentedString(patternType)).append("\n");
    sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
    sb.append("    specVersion: ").append(toIndentedString(specVersion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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
