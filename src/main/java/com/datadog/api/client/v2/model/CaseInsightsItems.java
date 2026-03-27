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
   * <p>An insight of the case.</p>
 */
@JsonPropertyOrder({
  CaseInsightsItems.JSON_PROPERTY_REF,
  CaseInsightsItems.JSON_PROPERTY_RESOURCE_ID,
  CaseInsightsItems.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseInsightsItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_REF = "ref";
  private String ref;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
  private String resourceId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public CaseInsightsItems ref(String ref) {
    this.ref = ref;
    return this;
  }

  /**
   * <p>Reference of the insight.</p>
   * @return ref
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REF)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRef() {
        return ref;
      }
  public void setRef(String ref) {
    this.ref = ref;
  }
  public CaseInsightsItems resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * <p>Unique identifier of the resource. For example, the unique identifier of a security finding.</p>
   * @return resourceId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getResourceId() {
        return resourceId;
      }
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }
  public CaseInsightsItems type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Type of the resource. For example, the type of a security finding is "SECURITY_FINDING".</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
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
   * @return CaseInsightsItems
   */
  @JsonAnySetter
  public CaseInsightsItems putAdditionalProperty(String key, Object value) {
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
   * Return true if this CaseInsightsItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseInsightsItems caseInsightsItems = (CaseInsightsItems) o;
    return Objects.equals(this.ref, caseInsightsItems.ref) && Objects.equals(this.resourceId, caseInsightsItems.resourceId) && Objects.equals(this.type, caseInsightsItems.type) && Objects.equals(this.additionalProperties, caseInsightsItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(ref,resourceId,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseInsightsItems {\n");
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
