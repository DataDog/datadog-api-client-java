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
   * <p>The attributes associated with the custom destination.</p>
 */
@JsonPropertyOrder({
  CustomDestinationResponseAttributes.JSON_PROPERTY_ENABLED,
  CustomDestinationResponseAttributes.JSON_PROPERTY_FORWARD_TAGS,
  CustomDestinationResponseAttributes.JSON_PROPERTY_FORWARD_TAGS_RESTRICTION_LIST,
  CustomDestinationResponseAttributes.JSON_PROPERTY_FORWARD_TAGS_RESTRICTION_LIST_TYPE,
  CustomDestinationResponseAttributes.JSON_PROPERTY_FORWARDER_DESTINATION,
  CustomDestinationResponseAttributes.JSON_PROPERTY_NAME,
  CustomDestinationResponseAttributes.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomDestinationResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled = true;

  public static final String JSON_PROPERTY_FORWARD_TAGS = "forward_tags";
  private Boolean forwardTags = true;

  public static final String JSON_PROPERTY_FORWARD_TAGS_RESTRICTION_LIST = "forward_tags_restriction_list";
  private List<String> forwardTagsRestrictionList = null;

  public static final String JSON_PROPERTY_FORWARD_TAGS_RESTRICTION_LIST_TYPE = "forward_tags_restriction_list_type";
  private CustomDestinationAttributeTagsRestrictionListType forwardTagsRestrictionListType = CustomDestinationAttributeTagsRestrictionListType.ALLOW_LIST;

  public static final String JSON_PROPERTY_FORWARDER_DESTINATION = "forwarder_destination";
  private CustomDestinationResponseForwardDestination forwarderDestination;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query = "";

  public CustomDestinationResponseAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether logs matching this custom destination should be forwarded or not.</p>
   * @return enabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public CustomDestinationResponseAttributes forwardTags(Boolean forwardTags) {
    this.forwardTags = forwardTags;
    return this;
  }

  /**
   * <p>Whether tags from the forwarded logs should be forwarded or not.</p>
   * @return forwardTags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FORWARD_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getForwardTags() {
        return forwardTags;
      }
  public void setForwardTags(Boolean forwardTags) {
    this.forwardTags = forwardTags;
  }
  public CustomDestinationResponseAttributes forwardTagsRestrictionList(List<String> forwardTagsRestrictionList) {
    this.forwardTagsRestrictionList = forwardTagsRestrictionList;
    return this;
  }
  public CustomDestinationResponseAttributes addForwardTagsRestrictionListItem(String forwardTagsRestrictionListItem) {
    if (this.forwardTagsRestrictionList == null) {
      this.forwardTagsRestrictionList = new ArrayList<>();
    }
    this.forwardTagsRestrictionList.add(forwardTagsRestrictionListItem);
    return this;
  }

  /**
   * <p>List of <a href="https://docs.datadoghq.com/getting_started/tagging/#define-tags">keys of tags</a> to be filtered.</p>
   * <p>An empty list represents no restriction is in place and either all or no tags will be
   * forwarded depending on <code>forward_tags_restriction_list_type</code> parameter.</p>
   * @return forwardTagsRestrictionList
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FORWARD_TAGS_RESTRICTION_LIST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getForwardTagsRestrictionList() {
        return forwardTagsRestrictionList;
      }
  public void setForwardTagsRestrictionList(List<String> forwardTagsRestrictionList) {
    this.forwardTagsRestrictionList = forwardTagsRestrictionList;
  }
  public CustomDestinationResponseAttributes forwardTagsRestrictionListType(CustomDestinationAttributeTagsRestrictionListType forwardTagsRestrictionListType) {
    this.forwardTagsRestrictionListType = forwardTagsRestrictionListType;
    this.unparsed |= !forwardTagsRestrictionListType.isValid();
    return this;
  }

  /**
   * <p>How <code>forward_tags_restriction_list</code> parameter should be interpreted.
   * If <code>ALLOW_LIST</code>, then only tags whose keys on the forwarded logs match the ones on the restriction list
   * are forwarded.</p>
   * <p><code>BLOCK_LIST</code> works the opposite way. It does not forward the tags matching the ones on the list.</p>
   * @return forwardTagsRestrictionListType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FORWARD_TAGS_RESTRICTION_LIST_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CustomDestinationAttributeTagsRestrictionListType getForwardTagsRestrictionListType() {
        return forwardTagsRestrictionListType;
      }
  public void setForwardTagsRestrictionListType(CustomDestinationAttributeTagsRestrictionListType forwardTagsRestrictionListType) {
    if (!forwardTagsRestrictionListType.isValid()) {
        this.unparsed = true;
    }
    this.forwardTagsRestrictionListType = forwardTagsRestrictionListType;
  }
  public CustomDestinationResponseAttributes forwarderDestination(CustomDestinationResponseForwardDestination forwarderDestination) {
    this.forwarderDestination = forwarderDestination;
    this.unparsed |= forwarderDestination.unparsed;
    return this;
  }

  /**
   * <p>A custom destination's location to forward logs.</p>
   * @return forwarderDestination
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FORWARDER_DESTINATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CustomDestinationResponseForwardDestination getForwarderDestination() {
        return forwarderDestination;
      }
  public void setForwarderDestination(CustomDestinationResponseForwardDestination forwarderDestination) {
    this.forwarderDestination = forwarderDestination;
  }
  public CustomDestinationResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The custom destination name.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public CustomDestinationResponseAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>The custom destination query filter. Logs matching this query are forwarded to the destination.</p>
   * @return query
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
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
   * @return CustomDestinationResponseAttributes
   */
  @JsonAnySetter
  public CustomDestinationResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CustomDestinationResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDestinationResponseAttributes customDestinationResponseAttributes = (CustomDestinationResponseAttributes) o;
    return Objects.equals(this.enabled, customDestinationResponseAttributes.enabled) && Objects.equals(this.forwardTags, customDestinationResponseAttributes.forwardTags) && Objects.equals(this.forwardTagsRestrictionList, customDestinationResponseAttributes.forwardTagsRestrictionList) && Objects.equals(this.forwardTagsRestrictionListType, customDestinationResponseAttributes.forwardTagsRestrictionListType) && Objects.equals(this.forwarderDestination, customDestinationResponseAttributes.forwarderDestination) && Objects.equals(this.name, customDestinationResponseAttributes.name) && Objects.equals(this.query, customDestinationResponseAttributes.query) && Objects.equals(this.additionalProperties, customDestinationResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(enabled,forwardTags,forwardTagsRestrictionList,forwardTagsRestrictionListType,forwarderDestination,name,query, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDestinationResponseAttributes {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    forwardTags: ").append(toIndentedString(forwardTags)).append("\n");
    sb.append("    forwardTagsRestrictionList: ").append(toIndentedString(forwardTagsRestrictionList)).append("\n");
    sb.append("    forwardTagsRestrictionListType: ").append(toIndentedString(forwardTagsRestrictionListType)).append("\n");
    sb.append("    forwarderDestination: ").append(toIndentedString(forwarderDestination)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
