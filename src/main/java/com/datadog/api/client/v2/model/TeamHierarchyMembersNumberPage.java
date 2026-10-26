/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Pagination metadata using number and size. */
@JsonPropertyOrder({
  TeamHierarchyMembersNumberPage.JSON_PROPERTY_FIRST_NUMBER,
  TeamHierarchyMembersNumberPage.JSON_PROPERTY_LAST_NUMBER,
  TeamHierarchyMembersNumberPage.JSON_PROPERTY_NEXT_NUMBER,
  TeamHierarchyMembersNumberPage.JSON_PROPERTY_NUMBER,
  TeamHierarchyMembersNumberPage.JSON_PROPERTY_PREV_NUMBER,
  TeamHierarchyMembersNumberPage.JSON_PROPERTY_SIZE,
  TeamHierarchyMembersNumberPage.JSON_PROPERTY_TOTAL,
  TeamHierarchyMembersNumberPage.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamHierarchyMembersNumberPage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIRST_NUMBER = "first_number";
  private Long firstNumber;

  public static final String JSON_PROPERTY_LAST_NUMBER = "last_number";
  private Long lastNumber;

  public static final String JSON_PROPERTY_NEXT_NUMBER = "next_number";
  private Long nextNumber;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private Long number;

  public static final String JSON_PROPERTY_PREV_NUMBER = "prev_number";
  private Long prevNumber;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TeamHierarchyMembersNumberPageType type = TeamHierarchyMembersNumberPageType.NUMBER_SIZE;

  public TeamHierarchyMembersNumberPage() {}

  @JsonCreator
  public TeamHierarchyMembersNumberPage(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIRST_NUMBER) Long firstNumber,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_NUMBER) Long lastNumber,
      @JsonProperty(required = true, value = JSON_PROPERTY_NEXT_NUMBER) Long nextNumber,
      @JsonProperty(required = true, value = JSON_PROPERTY_NUMBER) Long number,
      @JsonProperty(required = true, value = JSON_PROPERTY_PREV_NUMBER) Long prevNumber,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIZE) Long size,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL) Long total,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TeamHierarchyMembersNumberPageType type) {
    this.firstNumber = firstNumber;
    this.lastNumber = lastNumber;
    if (lastNumber != null) {}
    this.nextNumber = nextNumber;
    if (nextNumber != null) {}
    this.number = number;
    this.prevNumber = prevNumber;
    if (prevNumber != null) {}
    this.size = size;
    this.total = total;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TeamHierarchyMembersNumberPage firstNumber(Long firstNumber) {
    this.firstNumber = firstNumber;
    return this;
  }

  /**
   * First page number.
   *
   * @return firstNumber
   */
  @JsonProperty(JSON_PROPERTY_FIRST_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFirstNumber() {
    return firstNumber;
  }

  public void setFirstNumber(Long firstNumber) {
    this.firstNumber = firstNumber;
  }

  public TeamHierarchyMembersNumberPage lastNumber(Long lastNumber) {
    this.lastNumber = lastNumber;
    if (lastNumber != null) {}
    return this;
  }

  /**
   * Last page number. Null when unavailable.
   *
   * @return lastNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLastNumber() {
    return lastNumber;
  }

  public void setLastNumber(Long lastNumber) {
    this.lastNumber = lastNumber;
  }

  public TeamHierarchyMembersNumberPage nextNumber(Long nextNumber) {
    this.nextNumber = nextNumber;
    if (nextNumber != null) {}
    return this;
  }

  /**
   * Next page number. Null when unavailable.
   *
   * @return nextNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getNextNumber() {
    return nextNumber;
  }

  public void setNextNumber(Long nextNumber) {
    this.nextNumber = nextNumber;
  }

  public TeamHierarchyMembersNumberPage number(Long number) {
    this.number = number;
    return this;
  }

  /**
   * Current zero-based page number.
   *
   * @return number
   */
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  public TeamHierarchyMembersNumberPage prevNumber(Long prevNumber) {
    this.prevNumber = prevNumber;
    if (prevNumber != null) {}
    return this;
  }

  /**
   * Previous page number. Null when unavailable.
   *
   * @return prevNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREV_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPrevNumber() {
    return prevNumber;
  }

  public void setPrevNumber(Long prevNumber) {
    this.prevNumber = prevNumber;
  }

  public TeamHierarchyMembersNumberPage size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Maximum number of members per page.
   *
   * @return size
   */
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public TeamHierarchyMembersNumberPage total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of members matching the filters.
   *
   * @return total
   */
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public TeamHierarchyMembersNumberPage type(TeamHierarchyMembersNumberPageType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Pagination mode.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TeamHierarchyMembersNumberPageType getType() {
    return type;
  }

  public void setType(TeamHierarchyMembersNumberPageType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return TeamHierarchyMembersNumberPage
   */
  @JsonAnySetter
  public TeamHierarchyMembersNumberPage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamHierarchyMembersNumberPage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamHierarchyMembersNumberPage teamHierarchyMembersNumberPage =
        (TeamHierarchyMembersNumberPage) o;
    return Objects.equals(this.firstNumber, teamHierarchyMembersNumberPage.firstNumber)
        && Objects.equals(this.lastNumber, teamHierarchyMembersNumberPage.lastNumber)
        && Objects.equals(this.nextNumber, teamHierarchyMembersNumberPage.nextNumber)
        && Objects.equals(this.number, teamHierarchyMembersNumberPage.number)
        && Objects.equals(this.prevNumber, teamHierarchyMembersNumberPage.prevNumber)
        && Objects.equals(this.size, teamHierarchyMembersNumberPage.size)
        && Objects.equals(this.total, teamHierarchyMembersNumberPage.total)
        && Objects.equals(this.type, teamHierarchyMembersNumberPage.type)
        && Objects.equals(
            this.additionalProperties, teamHierarchyMembersNumberPage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        firstNumber,
        lastNumber,
        nextNumber,
        number,
        prevNumber,
        size,
        total,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamHierarchyMembersNumberPage {\n");
    sb.append("    firstNumber: ").append(toIndentedString(firstNumber)).append("\n");
    sb.append("    lastNumber: ").append(toIndentedString(lastNumber)).append("\n");
    sb.append("    nextNumber: ").append(toIndentedString(nextNumber)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    prevNumber: ").append(toIndentedString(prevNumber)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
