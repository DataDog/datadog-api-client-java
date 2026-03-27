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
   * <p>The scope of the WAF custom rule.</p>
 */
@JsonPropertyOrder({
  ApplicationSecurityWafCustomRuleConditionParameters.JSON_PROPERTY_DATA,
  ApplicationSecurityWafCustomRuleConditionParameters.JSON_PROPERTY_INPUTS,
  ApplicationSecurityWafCustomRuleConditionParameters.JSON_PROPERTY_LIST,
  ApplicationSecurityWafCustomRuleConditionParameters.JSON_PROPERTY_OPTIONS,
  ApplicationSecurityWafCustomRuleConditionParameters.JSON_PROPERTY_REGEX,
  ApplicationSecurityWafCustomRuleConditionParameters.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityWafCustomRuleConditionParameters {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<ApplicationSecurityWafCustomRuleConditionInput> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_LIST = "list";
  private List<String> list = null;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private ApplicationSecurityWafCustomRuleConditionOptions options;

  public static final String JSON_PROPERTY_REGEX = "regex";
  private String regex;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public ApplicationSecurityWafCustomRuleConditionParameters() {}

  @JsonCreator
  public ApplicationSecurityWafCustomRuleConditionParameters(
            @JsonProperty(required=true, value=JSON_PROPERTY_INPUTS)List<ApplicationSecurityWafCustomRuleConditionInput> inputs) {
        this.inputs = inputs;
  }
  public ApplicationSecurityWafCustomRuleConditionParameters data(String data) {
    this.data = data;
    return this;
  }

  /**
   * <p>Identifier of a list of data from the denylist. Can only be used as substitution from the list parameter.</p>
   * @return data
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getData() {
        return data;
      }
  public void setData(String data) {
    this.data = data;
  }
  public ApplicationSecurityWafCustomRuleConditionParameters inputs(List<ApplicationSecurityWafCustomRuleConditionInput> inputs) {
    this.inputs = inputs;
    for (ApplicationSecurityWafCustomRuleConditionInput item : inputs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ApplicationSecurityWafCustomRuleConditionParameters addInputsItem(ApplicationSecurityWafCustomRuleConditionInput inputsItem) {
    this.inputs.add(inputsItem);
    this.unparsed |= inputsItem.unparsed;
    return this;
  }

  /**
   * <p>List of inputs on which at least one should match with the given operator.</p>
   * @return inputs
  **/
      @JsonProperty(JSON_PROPERTY_INPUTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<ApplicationSecurityWafCustomRuleConditionInput> getInputs() {
        return inputs;
      }
  public void setInputs(List<ApplicationSecurityWafCustomRuleConditionInput> inputs) {
    this.inputs = inputs;
  }
  public ApplicationSecurityWafCustomRuleConditionParameters list(List<String> list) {
    this.list = list;
    return this;
  }
  public ApplicationSecurityWafCustomRuleConditionParameters addListItem(String listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * <p>List of value to use with the condition. Only used with the phrase_match, !phrase_match, exact_match and
   * !exact_match operator.</p>
   * @return list
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LIST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getList() {
        return list;
      }
  public void setList(List<String> list) {
    this.list = list;
  }
  public ApplicationSecurityWafCustomRuleConditionParameters options(ApplicationSecurityWafCustomRuleConditionOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * <p>Options for the operator of this condition.</p>
   * @return options
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ApplicationSecurityWafCustomRuleConditionOptions getOptions() {
        return options;
      }
  public void setOptions(ApplicationSecurityWafCustomRuleConditionOptions options) {
    this.options = options;
  }
  public ApplicationSecurityWafCustomRuleConditionParameters regex(String regex) {
    this.regex = regex;
    return this;
  }

  /**
   * <p>Regex to use with the condition. Only used with match_regex and !match_regex operator.</p>
   * @return regex
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REGEX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRegex() {
        return regex;
      }
  public void setRegex(String regex) {
    this.regex = regex;
  }
  public ApplicationSecurityWafCustomRuleConditionParameters value(String value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Store the captured value in the specified tag name. Only used with the capture_data operator.</p>
   * @return value
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getValue() {
        return value;
      }
  public void setValue(String value) {
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
   * @return ApplicationSecurityWafCustomRuleConditionParameters
   */
  @JsonAnySetter
  public ApplicationSecurityWafCustomRuleConditionParameters putAdditionalProperty(String key, Object value) {
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
   * Return true if this ApplicationSecurityWafCustomRuleConditionParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSecurityWafCustomRuleConditionParameters applicationSecurityWafCustomRuleConditionParameters = (ApplicationSecurityWafCustomRuleConditionParameters) o;
    return Objects.equals(this.data, applicationSecurityWafCustomRuleConditionParameters.data) && Objects.equals(this.inputs, applicationSecurityWafCustomRuleConditionParameters.inputs) && Objects.equals(this.list, applicationSecurityWafCustomRuleConditionParameters.list) && Objects.equals(this.options, applicationSecurityWafCustomRuleConditionParameters.options) && Objects.equals(this.regex, applicationSecurityWafCustomRuleConditionParameters.regex) && Objects.equals(this.value, applicationSecurityWafCustomRuleConditionParameters.value) && Objects.equals(this.additionalProperties, applicationSecurityWafCustomRuleConditionParameters.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data,inputs,list,options,regex,value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSecurityWafCustomRuleConditionParameters {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
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
