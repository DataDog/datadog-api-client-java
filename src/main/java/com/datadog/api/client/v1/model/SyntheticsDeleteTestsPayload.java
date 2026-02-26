/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>A JSON list of the ID or IDs of the Synthetic tests that you want
   * to delete.</p>
 */
@JsonPropertyOrder({
  SyntheticsDeleteTestsPayload.JSON_PROPERTY_FORCE_DELETE_DEPENDENCIES,
  SyntheticsDeleteTestsPayload.JSON_PROPERTY_PUBLIC_IDS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsDeleteTestsPayload {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORCE_DELETE_DEPENDENCIES = "force_delete_dependencies";
  private Boolean forceDeleteDependencies;

  public static final String JSON_PROPERTY_PUBLIC_IDS = "public_ids";
  private List<String> publicIds = null;

  public SyntheticsDeleteTestsPayload forceDeleteDependencies(Boolean forceDeleteDependencies) {
    this.forceDeleteDependencies = forceDeleteDependencies;
    return this;
  }

  /**
   * <p>Delete the Synthetic test even if it's referenced by other resources
   * (for example, SLOs and composite monitors).</p>
   * @return forceDeleteDependencies
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FORCE_DELETE_DEPENDENCIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getForceDeleteDependencies() {
        return forceDeleteDependencies;
      }
  public void setForceDeleteDependencies(Boolean forceDeleteDependencies) {
    this.forceDeleteDependencies = forceDeleteDependencies;
  }
  public SyntheticsDeleteTestsPayload publicIds(List<String> publicIds) {
    this.publicIds = publicIds;
    return this;
  }
  public SyntheticsDeleteTestsPayload addPublicIdsItem(String publicIdsItem) {
    if (this.publicIds == null) {
      this.publicIds = new ArrayList<>();
    }
    this.publicIds.add(publicIdsItem);
    return this;
  }

  /**
   * <p>An array of Synthetic test IDs you want to delete.</p>
   * @return publicIds
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PUBLIC_IDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getPublicIds() {
        return publicIds;
      }
  public void setPublicIds(List<String> publicIds) {
    this.publicIds = publicIds;
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
   * @return SyntheticsDeleteTestsPayload
   */
  @JsonAnySetter
  public SyntheticsDeleteTestsPayload putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsDeleteTestsPayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsDeleteTestsPayload syntheticsDeleteTestsPayload = (SyntheticsDeleteTestsPayload) o;
    return Objects.equals(this.forceDeleteDependencies, syntheticsDeleteTestsPayload.forceDeleteDependencies) && Objects.equals(this.publicIds, syntheticsDeleteTestsPayload.publicIds) && Objects.equals(this.additionalProperties, syntheticsDeleteTestsPayload.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(forceDeleteDependencies,publicIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsDeleteTestsPayload {\n");
    sb.append("    forceDeleteDependencies: ").append(toIndentedString(forceDeleteDependencies)).append("\n");
    sb.append("    publicIds: ").append(toIndentedString(publicIds)).append("\n");
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
