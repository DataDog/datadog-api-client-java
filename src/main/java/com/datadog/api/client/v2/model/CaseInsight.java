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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * A reference to an external Datadog resource that provides investigative context for a case, such
 * as a security signal, monitor alert, error tracking issue, or incident.
 */
@JsonPropertyOrder({
  CaseInsight.JSON_PROPERTY_REF,
  CaseInsight.JSON_PROPERTY_RESOURCE_ID,
  CaseInsight.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseInsight {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REF = "ref";
  private String ref;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
  private String resourceId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CaseInsightType type;

  public CaseInsight() {}

  @JsonCreator
  public CaseInsight(
      @JsonProperty(required = true, value = JSON_PROPERTY_REF) String ref,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_ID) String resourceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CaseInsightType type) {
    this.ref = ref;
    this.resourceId = resourceId;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CaseInsight ref(String ref) {
    this.ref = ref;
    return this;
  }

  /**
   * The URL path or deep link to the insight resource within Datadog (for example, <code>
   * /monitors/12345?q=total</code>).
   *
   * @return ref
   */
  @JsonProperty(JSON_PROPERTY_REF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public CaseInsight resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The unique identifier of the referenced Datadog resource (for example, a monitor ID, incident
   * ID, or signal ID).
   *
   * @return resourceId
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public CaseInsight type(CaseInsightType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of Datadog resource linked to the case as contextual evidence. Each type corresponds
   * to a different Datadog product signal (for example, a security finding, a monitor alert, or an
   * incident).
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CaseInsightType getType() {
    return type;
  }

  public void setType(CaseInsightType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
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
   * @return CaseInsight
   */
  @JsonAnySetter
  public CaseInsight putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseInsight object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseInsight caseInsight = (CaseInsight) o;
    return Objects.equals(this.ref, caseInsight.ref)
        && Objects.equals(this.resourceId, caseInsight.resourceId)
        && Objects.equals(this.type, caseInsight.type)
        && Objects.equals(this.additionalProperties, caseInsight.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, resourceId, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseInsight {\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
