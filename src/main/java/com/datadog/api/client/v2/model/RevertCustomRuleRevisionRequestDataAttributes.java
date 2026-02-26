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

 */
@JsonPropertyOrder({
  RevertCustomRuleRevisionRequestDataAttributes.JSON_PROPERTY_CURRENT_REVISION,
  RevertCustomRuleRevisionRequestDataAttributes.JSON_PROPERTY_REVERT_TO_REVISION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RevertCustomRuleRevisionRequestDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURRENT_REVISION = "currentRevision";
  private String currentRevision;

  public static final String JSON_PROPERTY_REVERT_TO_REVISION = "revertToRevision";
  private String revertToRevision;

  public RevertCustomRuleRevisionRequestDataAttributes currentRevision(String currentRevision) {
    this.currentRevision = currentRevision;
    return this;
  }

  /**
   * <p>Current revision ID</p>
   * @return currentRevision
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CURRENT_REVISION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCurrentRevision() {
        return currentRevision;
      }
  public void setCurrentRevision(String currentRevision) {
    this.currentRevision = currentRevision;
  }
  public RevertCustomRuleRevisionRequestDataAttributes revertToRevision(String revertToRevision) {
    this.revertToRevision = revertToRevision;
    return this;
  }

  /**
   * <p>Target revision ID to revert to</p>
   * @return revertToRevision
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REVERT_TO_REVISION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRevertToRevision() {
        return revertToRevision;
      }
  public void setRevertToRevision(String revertToRevision) {
    this.revertToRevision = revertToRevision;
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
   * @return RevertCustomRuleRevisionRequestDataAttributes
   */
  @JsonAnySetter
  public RevertCustomRuleRevisionRequestDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this RevertCustomRuleRevisionRequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevertCustomRuleRevisionRequestDataAttributes revertCustomRuleRevisionRequestDataAttributes = (RevertCustomRuleRevisionRequestDataAttributes) o;
    return Objects.equals(this.currentRevision, revertCustomRuleRevisionRequestDataAttributes.currentRevision) && Objects.equals(this.revertToRevision, revertCustomRuleRevisionRequestDataAttributes.revertToRevision) && Objects.equals(this.additionalProperties, revertCustomRuleRevisionRequestDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(currentRevision,revertToRevision, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevertCustomRuleRevisionRequestDataAttributes {\n");
    sb.append("    currentRevision: ").append(toIndentedString(currentRevision)).append("\n");
    sb.append("    revertToRevision: ").append(toIndentedString(revertToRevision)).append("\n");
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
