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
   * <p>Information about the element used for a step.</p>
 */
@JsonPropertyOrder({
  SyntheticsMobileStepParamsElement.JSON_PROPERTY_CONTEXT,
  SyntheticsMobileStepParamsElement.JSON_PROPERTY_CONTEXT_TYPE,
  SyntheticsMobileStepParamsElement.JSON_PROPERTY_ELEMENT_DESCRIPTION,
  SyntheticsMobileStepParamsElement.JSON_PROPERTY_MULTI_LOCATOR,
  SyntheticsMobileStepParamsElement.JSON_PROPERTY_RELATIVE_POSITION,
  SyntheticsMobileStepParamsElement.JSON_PROPERTY_TEXT_CONTENT,
  SyntheticsMobileStepParamsElement.JSON_PROPERTY_USER_LOCATOR,
  SyntheticsMobileStepParamsElement.JSON_PROPERTY_VIEW_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsMobileStepParamsElement {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTEXT = "context";
  private String context;

  public static final String JSON_PROPERTY_CONTEXT_TYPE = "contextType";
  private SyntheticsMobileStepParamsElementContextType contextType;

  public static final String JSON_PROPERTY_ELEMENT_DESCRIPTION = "elementDescription";
  private String elementDescription;

  public static final String JSON_PROPERTY_MULTI_LOCATOR = "multiLocator";
  private Object multiLocator;

  public static final String JSON_PROPERTY_RELATIVE_POSITION = "relativePosition";
  private SyntheticsMobileStepParamsElementRelativePosition relativePosition;

  public static final String JSON_PROPERTY_TEXT_CONTENT = "textContent";
  private String textContent;

  public static final String JSON_PROPERTY_USER_LOCATOR = "userLocator";
  private SyntheticsMobileStepParamsElementUserLocator userLocator;

  public static final String JSON_PROPERTY_VIEW_NAME = "viewName";
  private String viewName;

  public SyntheticsMobileStepParamsElement context(String context) {
    this.context = context;
    return this;
  }

  /**
   * <p>Context of the element.</p>
   * @return context
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONTEXT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getContext() {
        return context;
      }
  public void setContext(String context) {
    this.context = context;
  }
  public SyntheticsMobileStepParamsElement contextType(SyntheticsMobileStepParamsElementContextType contextType) {
    this.contextType = contextType;
    this.unparsed |= !contextType.isValid();
    return this;
  }

  /**
   * <p>Type of the context that the element is in.</p>
   * @return contextType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONTEXT_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsMobileStepParamsElementContextType getContextType() {
        return contextType;
      }
  public void setContextType(SyntheticsMobileStepParamsElementContextType contextType) {
    if (!contextType.isValid()) {
        this.unparsed = true;
    }
    this.contextType = contextType;
  }
  public SyntheticsMobileStepParamsElement elementDescription(String elementDescription) {
    this.elementDescription = elementDescription;
    return this;
  }

  /**
   * <p>Description of the element.</p>
   * @return elementDescription
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ELEMENT_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getElementDescription() {
        return elementDescription;
      }
  public void setElementDescription(String elementDescription) {
    this.elementDescription = elementDescription;
  }
  public SyntheticsMobileStepParamsElement multiLocator(Object multiLocator) {
    this.multiLocator = multiLocator;
    return this;
  }

  /**
   * <p>Multi-locator to find the element.</p>
   * @return multiLocator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MULTI_LOCATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Object getMultiLocator() {
        return multiLocator;
      }
  public void setMultiLocator(Object multiLocator) {
    this.multiLocator = multiLocator;
  }
  public SyntheticsMobileStepParamsElement relativePosition(SyntheticsMobileStepParamsElementRelativePosition relativePosition) {
    this.relativePosition = relativePosition;
    this.unparsed |= relativePosition.unparsed;
    return this;
  }

  /**
   * <p>Position of the action relative to the element.</p>
   * @return relativePosition
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RELATIVE_POSITION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsMobileStepParamsElementRelativePosition getRelativePosition() {
        return relativePosition;
      }
  public void setRelativePosition(SyntheticsMobileStepParamsElementRelativePosition relativePosition) {
    this.relativePosition = relativePosition;
  }
  public SyntheticsMobileStepParamsElement textContent(String textContent) {
    this.textContent = textContent;
    return this;
  }

  /**
   * <p>Text content of the element.</p>
   * @return textContent
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEXT_CONTENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTextContent() {
        return textContent;
      }
  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }
  public SyntheticsMobileStepParamsElement userLocator(SyntheticsMobileStepParamsElementUserLocator userLocator) {
    this.userLocator = userLocator;
    this.unparsed |= userLocator.unparsed;
    return this;
  }

  /**
   * <p>User locator to find the element.</p>
   * @return userLocator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USER_LOCATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsMobileStepParamsElementUserLocator getUserLocator() {
        return userLocator;
      }
  public void setUserLocator(SyntheticsMobileStepParamsElementUserLocator userLocator) {
    this.userLocator = userLocator;
  }
  public SyntheticsMobileStepParamsElement viewName(String viewName) {
    this.viewName = viewName;
    return this;
  }

  /**
   * <p>Name of the view of the element.</p>
   * @return viewName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VIEW_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getViewName() {
        return viewName;
      }
  public void setViewName(String viewName) {
    this.viewName = viewName;
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
   * @return SyntheticsMobileStepParamsElement
   */
  @JsonAnySetter
  public SyntheticsMobileStepParamsElement putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsMobileStepParamsElement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsMobileStepParamsElement syntheticsMobileStepParamsElement = (SyntheticsMobileStepParamsElement) o;
    return Objects.equals(this.context, syntheticsMobileStepParamsElement.context) && Objects.equals(this.contextType, syntheticsMobileStepParamsElement.contextType) && Objects.equals(this.elementDescription, syntheticsMobileStepParamsElement.elementDescription) && Objects.equals(this.multiLocator, syntheticsMobileStepParamsElement.multiLocator) && Objects.equals(this.relativePosition, syntheticsMobileStepParamsElement.relativePosition) && Objects.equals(this.textContent, syntheticsMobileStepParamsElement.textContent) && Objects.equals(this.userLocator, syntheticsMobileStepParamsElement.userLocator) && Objects.equals(this.viewName, syntheticsMobileStepParamsElement.viewName) && Objects.equals(this.additionalProperties, syntheticsMobileStepParamsElement.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(context,contextType,elementDescription,multiLocator,relativePosition,textContent,userLocator,viewName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsMobileStepParamsElement {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    elementDescription: ").append(toIndentedString(elementDescription)).append("\n");
    sb.append("    multiLocator: ").append(toIndentedString(multiLocator)).append("\n");
    sb.append("    relativePosition: ").append(toIndentedString(relativePosition)).append("\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
    sb.append("    userLocator: ").append(toIndentedString(userLocator)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
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
