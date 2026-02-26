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
   * <p>The metadata action applied on the scope matching the rule</p>
 */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleActionMetadata.JSON_PROPERTY_IMAGE_TAG,
  CloudWorkloadSecurityAgentRuleActionMetadata.JSON_PROPERTY_SERVICE,
  CloudWorkloadSecurityAgentRuleActionMetadata.JSON_PROPERTY_SHORT_IMAGE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleActionMetadata {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_IMAGE_TAG = "image_tag";
  private String imageTag;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SHORT_IMAGE = "short_image";
  private String shortImage;

  public CloudWorkloadSecurityAgentRuleActionMetadata imageTag(String imageTag) {
    this.imageTag = imageTag;
    return this;
  }

  /**
   * <p>The image tag of the metadata action</p>
   * @return imageTag
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IMAGE_TAG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getImageTag() {
        return imageTag;
      }
  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }
  public CloudWorkloadSecurityAgentRuleActionMetadata service(String service) {
    this.service = service;
    return this;
  }

  /**
   * <p>The service of the metadata action</p>
   * @return service
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getService() {
        return service;
      }
  public void setService(String service) {
    this.service = service;
  }
  public CloudWorkloadSecurityAgentRuleActionMetadata shortImage(String shortImage) {
    this.shortImage = shortImage;
    return this;
  }

  /**
   * <p>The short image of the metadata action</p>
   * @return shortImage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHORT_IMAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getShortImage() {
        return shortImage;
      }
  public void setShortImage(String shortImage) {
    this.shortImage = shortImage;
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
   * @return CloudWorkloadSecurityAgentRuleActionMetadata
   */
  @JsonAnySetter
  public CloudWorkloadSecurityAgentRuleActionMetadata putAdditionalProperty(String key, Object value) {
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
   * Return true if this CloudWorkloadSecurityAgentRuleActionMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleActionMetadata cloudWorkloadSecurityAgentRuleActionMetadata = (CloudWorkloadSecurityAgentRuleActionMetadata) o;
    return Objects.equals(this.imageTag, cloudWorkloadSecurityAgentRuleActionMetadata.imageTag) && Objects.equals(this.service, cloudWorkloadSecurityAgentRuleActionMetadata.service) && Objects.equals(this.shortImage, cloudWorkloadSecurityAgentRuleActionMetadata.shortImage) && Objects.equals(this.additionalProperties, cloudWorkloadSecurityAgentRuleActionMetadata.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(imageTag,service,shortImage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleActionMetadata {\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    shortImage: ").append(toIndentedString(shortImage)).append("\n");
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
