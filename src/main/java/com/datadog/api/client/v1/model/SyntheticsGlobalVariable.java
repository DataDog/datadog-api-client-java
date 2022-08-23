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
   * <p>Synthetics global variable.</p>
 */
@JsonPropertyOrder({
  SyntheticsGlobalVariable.JSON_PROPERTY_ATTRIBUTES,
  SyntheticsGlobalVariable.JSON_PROPERTY_DESCRIPTION,
  SyntheticsGlobalVariable.JSON_PROPERTY_ID,
  SyntheticsGlobalVariable.JSON_PROPERTY_NAME,
  SyntheticsGlobalVariable.JSON_PROPERTY_PARSE_TEST_OPTIONS,
  SyntheticsGlobalVariable.JSON_PROPERTY_PARSE_TEST_PUBLIC_ID,
  SyntheticsGlobalVariable.JSON_PROPERTY_TAGS,
  SyntheticsGlobalVariable.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsGlobalVariable {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SyntheticsGlobalVariableAttributes attributes;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

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

  public SyntheticsGlobalVariable() {}

  @JsonCreator
  public SyntheticsGlobalVariable(
            @JsonProperty(required=true, value=JSON_PROPERTY_DESCRIPTION)String description,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_TAGS)List<String> tags,
            @JsonProperty(required=true, value=JSON_PROPERTY_VALUE)SyntheticsGlobalVariableValue value) {
        this.description = description;
        this.name = name;
        this.tags = tags;
        this.value = value;
        this.unparsed |= value.unparsed;
  }
  public SyntheticsGlobalVariable attributes(SyntheticsGlobalVariableAttributes attributes) {
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
  public SyntheticsGlobalVariable description(String description) {
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
  public SyntheticsGlobalVariable name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the global variable. Unique across Synthetics global variables.</p>
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
  public SyntheticsGlobalVariable parseTestOptions(SyntheticsGlobalVariableParseTestOptions parseTestOptions) {
    this.parseTestOptions = parseTestOptions;
    this.unparsed |= parseTestOptions.unparsed;
    return this;
  }

  /**
   * <p>Parser options to use for retrieving a Synthetics global variable from a Synthetics Test. Used in conjunction with <code>parse_test_public_id</code>.</p>
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
  public SyntheticsGlobalVariable parseTestPublicId(String parseTestPublicId) {
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
  public SyntheticsGlobalVariable tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public SyntheticsGlobalVariable addTagsItem(String tagsItem) {
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
  public SyntheticsGlobalVariable value(SyntheticsGlobalVariableValue value) {
    this.value = value;
    this.unparsed |= value.unparsed;
    return this;
  }

  /**
   * <p>Value of the global variable.</p>
   * @return value
  **/
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsGlobalVariableValue getValue() {
        return value;
      }
  public void setValue(SyntheticsGlobalVariableValue value) {
    this.value = value;
  }

  /**
   * Return true if this SyntheticsGlobalVariable object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsGlobalVariable syntheticsGlobalVariable = (SyntheticsGlobalVariable) o;
    return Objects.equals(this.attributes, syntheticsGlobalVariable.attributes) && Objects.equals(this.description, syntheticsGlobalVariable.description) && Objects.equals(this.id, syntheticsGlobalVariable.id) && Objects.equals(this.name, syntheticsGlobalVariable.name) && Objects.equals(this.parseTestOptions, syntheticsGlobalVariable.parseTestOptions) && Objects.equals(this.parseTestPublicId, syntheticsGlobalVariable.parseTestPublicId) && Objects.equals(this.tags, syntheticsGlobalVariable.tags) && Objects.equals(this.value, syntheticsGlobalVariable.value);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,description,id,name,parseTestOptions,parseTestPublicId,tags,value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsGlobalVariable {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parseTestOptions: ").append(toIndentedString(parseTestOptions)).append("\n");
    sb.append("    parseTestPublicId: ").append(toIndentedString(parseTestPublicId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
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
