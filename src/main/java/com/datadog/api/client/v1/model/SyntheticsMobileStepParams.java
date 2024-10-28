/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The parameters of a mobile step. */
@JsonPropertyOrder({
  SyntheticsMobileStepParams.JSON_PROPERTY_CHECK,
  SyntheticsMobileStepParams.JSON_PROPERTY_DELAY,
  SyntheticsMobileStepParams.JSON_PROPERTY_DIRECTION,
  SyntheticsMobileStepParams.JSON_PROPERTY_ELEMENT,
  SyntheticsMobileStepParams.JSON_PROPERTY_ENABLE,
  SyntheticsMobileStepParams.JSON_PROPERTY_MAX_SCROLLS,
  SyntheticsMobileStepParams.JSON_PROPERTY_POSITIONS,
  SyntheticsMobileStepParams.JSON_PROPERTY_SUBTEST_PUBLIC_ID,
  SyntheticsMobileStepParams.JSON_PROPERTY_VALUE,
  SyntheticsMobileStepParams.JSON_PROPERTY_VARIABLE,
  SyntheticsMobileStepParams.JSON_PROPERTY_WITH_ENTER,
  SyntheticsMobileStepParams.JSON_PROPERTY_X,
  SyntheticsMobileStepParams.JSON_PROPERTY_Y
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsMobileStepParams {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHECK = "check";
  private SyntheticsCheckType check;

  public static final String JSON_PROPERTY_DELAY = "delay";
  private Long delay;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private SyntheticsMobileStepParamsDirection direction;

  public static final String JSON_PROPERTY_ELEMENT = "element";
  private SyntheticsMobileStepParamsElement element;

  public static final String JSON_PROPERTY_ENABLE = "enable";
  private Boolean enable;

  public static final String JSON_PROPERTY_MAX_SCROLLS = "maxScrolls";
  private Long maxScrolls;

  public static final String JSON_PROPERTY_POSITIONS = "positions";
  private List<SyntheticsMobileStepParamsPositionsItems> positions = null;

  public static final String JSON_PROPERTY_SUBTEST_PUBLIC_ID = "subtestPublicId";
  private String subtestPublicId;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_VARIABLE = "variable";
  private SyntheticsMobileStepParamsVariable variable;

  public static final String JSON_PROPERTY_WITH_ENTER = "withEnter";
  private Boolean withEnter;

  public static final String JSON_PROPERTY_X = "x";
  private Long x;

  public static final String JSON_PROPERTY_Y = "y";
  private Long y;

  public SyntheticsMobileStepParams check(SyntheticsCheckType check) {
    this.check = check;
    this.unparsed |= !check.isValid();
    return this;
  }

  /**
   * Type of assertion to apply in an API test.
   *
   * @return check
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsCheckType getCheck() {
    return check;
  }

  public void setCheck(SyntheticsCheckType check) {
    if (!check.isValid()) {
      this.unparsed = true;
    }
    this.check = check;
  }

  public SyntheticsMobileStepParams delay(Long delay) {
    this.delay = delay;
    return this;
  }

  /**
   * Number of milliseconds to wait between inputs in a <code>typeText</code> step type. minimum: 0
   * maximum: 5000
   *
   * @return delay
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDelay() {
    return delay;
  }

  public void setDelay(Long delay) {
    this.delay = delay;
  }

  public SyntheticsMobileStepParams direction(SyntheticsMobileStepParamsDirection direction) {
    this.direction = direction;
    this.unparsed |= !direction.isValid();
    return this;
  }

  /**
   * The direction of the scroll for a <code>scrollToElement</code> step type.
   *
   * @return direction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsMobileStepParamsDirection getDirection() {
    return direction;
  }

  public void setDirection(SyntheticsMobileStepParamsDirection direction) {
    if (!direction.isValid()) {
      this.unparsed = true;
    }
    this.direction = direction;
  }

  public SyntheticsMobileStepParams element(SyntheticsMobileStepParamsElement element) {
    this.element = element;
    this.unparsed |= element.unparsed;
    return this;
  }

  /**
   * Information about the element used for a step.
   *
   * @return element
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsMobileStepParamsElement getElement() {
    return element;
  }

  public void setElement(SyntheticsMobileStepParamsElement element) {
    this.element = element;
  }

  public SyntheticsMobileStepParams enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Boolean to change the state of the wifi for a <code>toggleWiFi</code> step type.
   *
   * @return enable
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public SyntheticsMobileStepParams maxScrolls(Long maxScrolls) {
    this.maxScrolls = maxScrolls;
    return this;
  }

  /**
   * Maximum number of scrolls to do for a <code>scrollToElement</code> step type.
   *
   * @return maxScrolls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_SCROLLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxScrolls() {
    return maxScrolls;
  }

  public void setMaxScrolls(Long maxScrolls) {
    this.maxScrolls = maxScrolls;
  }

  public SyntheticsMobileStepParams positions(
      List<SyntheticsMobileStepParamsPositionsItems> positions) {
    this.positions = positions;
    for (SyntheticsMobileStepParamsPositionsItems item : positions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsMobileStepParams addPositionsItem(
      SyntheticsMobileStepParamsPositionsItems positionsItem) {
    if (this.positions == null) {
      this.positions = new ArrayList<>();
    }
    this.positions.add(positionsItem);
    this.unparsed |= positionsItem.unparsed;
    return this;
  }

  /**
   * List of positions for the <code>flick</code> step type. The maximum is 10 flicks per step
   *
   * @return positions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsMobileStepParamsPositionsItems> getPositions() {
    return positions;
  }

  public void setPositions(List<SyntheticsMobileStepParamsPositionsItems> positions) {
    this.positions = positions;
  }

  public SyntheticsMobileStepParams subtestPublicId(String subtestPublicId) {
    this.subtestPublicId = subtestPublicId;
    return this;
  }

  /**
   * Public ID of the test to be played as part of a <code>playSubTest</code> step type.
   *
   * @return subtestPublicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBTEST_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubtestPublicId() {
    return subtestPublicId;
  }

  public void setSubtestPublicId(String subtestPublicId) {
    this.subtestPublicId = subtestPublicId;
  }

  public SyntheticsMobileStepParams value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Values used in the step. Used in multiple step types.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public SyntheticsMobileStepParams variable(SyntheticsMobileStepParamsVariable variable) {
    this.variable = variable;
    this.unparsed |= variable.unparsed;
    return this;
  }

  /**
   * Variable object for <code>extractVariable</code> step type.
   *
   * @return variable
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsMobileStepParamsVariable getVariable() {
    return variable;
  }

  public void setVariable(SyntheticsMobileStepParamsVariable variable) {
    this.variable = variable;
  }

  public SyntheticsMobileStepParams withEnter(Boolean withEnter) {
    this.withEnter = withEnter;
    return this;
  }

  /**
   * Boolean to indicate if <code>Enter</code> should be pressed at the end of the <code>typeText
   * </code> step type.
   *
   * @return withEnter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WITH_ENTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getWithEnter() {
    return withEnter;
  }

  public void setWithEnter(Boolean withEnter) {
    this.withEnter = withEnter;
  }

  public SyntheticsMobileStepParams x(Long x) {
    this.x = x;
    return this;
  }

  /**
   * Amount to scroll by on the <code>x</code> axis for a <code>scroll</code> step type.
   *
   * @return x
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getX() {
    return x;
  }

  public void setX(Long x) {
    this.x = x;
  }

  public SyntheticsMobileStepParams y(Long y) {
    this.y = y;
    return this;
  }

  /**
   * Amount to scroll by on the <code>y</code> axis for a <code>scroll</code> step type.
   *
   * @return y
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getY() {
    return y;
  }

  public void setY(Long y) {
    this.y = y;
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
   * @return SyntheticsMobileStepParams
   */
  @JsonAnySetter
  public SyntheticsMobileStepParams putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsMobileStepParams object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsMobileStepParams syntheticsMobileStepParams = (SyntheticsMobileStepParams) o;
    return Objects.equals(this.check, syntheticsMobileStepParams.check)
        && Objects.equals(this.delay, syntheticsMobileStepParams.delay)
        && Objects.equals(this.direction, syntheticsMobileStepParams.direction)
        && Objects.equals(this.element, syntheticsMobileStepParams.element)
        && Objects.equals(this.enable, syntheticsMobileStepParams.enable)
        && Objects.equals(this.maxScrolls, syntheticsMobileStepParams.maxScrolls)
        && Objects.equals(this.positions, syntheticsMobileStepParams.positions)
        && Objects.equals(this.subtestPublicId, syntheticsMobileStepParams.subtestPublicId)
        && Objects.equals(this.value, syntheticsMobileStepParams.value)
        && Objects.equals(this.variable, syntheticsMobileStepParams.variable)
        && Objects.equals(this.withEnter, syntheticsMobileStepParams.withEnter)
        && Objects.equals(this.x, syntheticsMobileStepParams.x)
        && Objects.equals(this.y, syntheticsMobileStepParams.y)
        && Objects.equals(
            this.additionalProperties, syntheticsMobileStepParams.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        check,
        delay,
        direction,
        element,
        enable,
        maxScrolls,
        positions,
        subtestPublicId,
        value,
        variable,
        withEnter,
        x,
        y,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsMobileStepParams {\n");
    sb.append("    check: ").append(toIndentedString(check)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    element: ").append(toIndentedString(element)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    maxScrolls: ").append(toIndentedString(maxScrolls)).append("\n");
    sb.append("    positions: ").append(toIndentedString(positions)).append("\n");
    sb.append("    subtestPublicId: ").append(toIndentedString(subtestPublicId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
    sb.append("    withEnter: ").append(toIndentedString(withEnter)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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
