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
   * <p>Details of the global variable to create.</p>
 */
@JsonPropertyOrder({
  SyntheticsGlobalVariableRequest.JSON_PROPERTY_ATTRIBUTES,
  SyntheticsGlobalVariableRequest.JSON_PROPERTY_DESCRIPTION,
  SyntheticsGlobalVariableRequest.JSON_PROPERTY_ID,
  SyntheticsGlobalVariableRequest.JSON_PROPERTY_IS_FIDO,
  SyntheticsGlobalVariableRequest.JSON_PROPERTY_IS_TOTP,
  SyntheticsGlobalVariableRequest.JSON_PROPERTY_NAME,
  SyntheticsGlobalVariableRequest.JSON_PROPERTY_PARSE_TEST_OPTIONS,
  SyntheticsGlobalVariableRequest.JSON_PROPERTY_PARSE_TEST_PUBLIC_ID,
  SyntheticsGlobalVariableRequest.JSON_PROPERTY_TAGS,
  SyntheticsGlobalVariableRequest.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsGlobalVariableRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SyntheticsGlobalVariableAttributes attributes;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_FIDO = "is_fido";
  private Boolean isFido;

  public static final String JSON_PROPERTY_IS_TOTP = "is_totp";
  private Boolean isTotp;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PARSE_TEST_OPTIONS = "parse_test_options";
  private SyntheticsGlobalVariableParseTestOptions parseTestOptions;

  public static final String JSON_PROPERTY_PARSE_TEST_PUBLIC_ID = "parse_test_public_id";
  private String parseTestPublicId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_VALUE = "value";
  private SyntheticsGlobalVariableValue value;

  public SyntheticsGlobalVariableRequest() {}

  @JsonCreator
  public SyntheticsGlobalVariableRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_DESCRIPTION)String description,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_TAGS)List<String> tags) {
        this.description = description;
        this.name = name;
        this.tags = tags;
  }
  public SyntheticsGlobalVariableRequest attributes(SyntheticsGlobalVariableAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>Attributes of the global variable.</p>
   * @return attributes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsGlobalVariableAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(SyntheticsGlobalVariableAttributes attributes) {
    this.attributes = attributes;
  }
  public SyntheticsGlobalVariableRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Description of the global variable.</p>
   * @return description
  **/
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * <p>Unique identifier of the global variable.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public SyntheticsGlobalVariableRequest isFido(Boolean isFido) {
    this.isFido = isFido;
    return this;
  }

  /**
   * <p>Determines if the global variable is a FIDO variable.</p>
   * @return isFido
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_FIDO)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsFido() {
        return isFido;
      }
  public void setIsFido(Boolean isFido) {
    this.isFido = isFido;
  }
  public SyntheticsGlobalVariableRequest isTotp(Boolean isTotp) {
    this.isTotp = isTotp;
    return this;
  }

  /**
   * <p>Determines if the global variable is a TOTP/MFA variable.</p>
   * @return isTotp
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_TOTP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsTotp() {
        return isTotp;
      }
  public void setIsTotp(Boolean isTotp) {
    this.isTotp = isTotp;
  }
  public SyntheticsGlobalVariableRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the global variable. Unique across Synthetic global variables.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public SyntheticsGlobalVariableRequest parseTestOptions(SyntheticsGlobalVariableParseTestOptions parseTestOptions) {
    this.parseTestOptions = parseTestOptions;
    this.unparsed |= parseTestOptions.unparsed;
    return this;
  }

  /**
   * <p>Parser options to use for retrieving a Synthetic global variable from a Synthetic test. Used in conjunction with <code>parse_test_public_id</code>.</p>
   * @return parseTestOptions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PARSE_TEST_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsGlobalVariableParseTestOptions getParseTestOptions() {
        return parseTestOptions;
      }
  public void setParseTestOptions(SyntheticsGlobalVariableParseTestOptions parseTestOptions) {
    this.parseTestOptions = parseTestOptions;
  }
  public SyntheticsGlobalVariableRequest parseTestPublicId(String parseTestPublicId) {
    this.parseTestPublicId = parseTestPublicId;
    return this;
  }

  /**
   * <p>A Synthetic test ID to use as a test to generate the variable value.</p>
   * @return parseTestPublicId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PARSE_TEST_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getParseTestPublicId() {
        return parseTestPublicId;
      }
  public void setParseTestPublicId(String parseTestPublicId) {
    this.parseTestPublicId = parseTestPublicId;
  }
  public SyntheticsGlobalVariableRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public SyntheticsGlobalVariableRequest addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>Tags of the global variable.</p>
   * @return tags
  **/
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public SyntheticsGlobalVariableRequest value(SyntheticsGlobalVariableValue value) {
    this.value = value;
    this.unparsed |= value.unparsed;
    return this;
  }

  /**
   * <p>Value of the global variable.</p>
   * @return value
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsGlobalVariableValue getValue() {
        return value;
      }
  public void setValue(SyntheticsGlobalVariableValue value) {
    this.value = value;
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
   * @return SyntheticsGlobalVariableRequest
   */
  @JsonAnySetter
  public SyntheticsGlobalVariableRequest putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsGlobalVariableRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsGlobalVariableRequest syntheticsGlobalVariableRequest = (SyntheticsGlobalVariableRequest) o;
    return Objects.equals(this.attributes, syntheticsGlobalVariableRequest.attributes) && Objects.equals(this.description, syntheticsGlobalVariableRequest.description) && Objects.equals(this.id, syntheticsGlobalVariableRequest.id) && Objects.equals(this.isFido, syntheticsGlobalVariableRequest.isFido) && Objects.equals(this.isTotp, syntheticsGlobalVariableRequest.isTotp) && Objects.equals(this.name, syntheticsGlobalVariableRequest.name) && Objects.equals(this.parseTestOptions, syntheticsGlobalVariableRequest.parseTestOptions) && Objects.equals(this.parseTestPublicId, syntheticsGlobalVariableRequest.parseTestPublicId) && Objects.equals(this.tags, syntheticsGlobalVariableRequest.tags) && Objects.equals(this.value, syntheticsGlobalVariableRequest.value) && Objects.equals(this.additionalProperties, syntheticsGlobalVariableRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,description,id,isFido,isTotp,name,parseTestOptions,parseTestPublicId,tags,value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsGlobalVariableRequest {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFido: ").append(toIndentedString(isFido)).append("\n");
    sb.append("    isTotp: ").append(toIndentedString(isTotp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parseTestOptions: ").append(toIndentedString(parseTestOptions)).append("\n");
    sb.append("    parseTestPublicId: ").append(toIndentedString(parseTestPublicId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
