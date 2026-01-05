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

/** A Product Analytics server-side event. */
@JsonPropertyOrder({
  ProductAnalyticsServerSideEventItem.JSON_PROPERTY_ACCOUNT,
  ProductAnalyticsServerSideEventItem.JSON_PROPERTY_APPLICATION,
  ProductAnalyticsServerSideEventItem.JSON_PROPERTY_EVENT,
  ProductAnalyticsServerSideEventItem.JSON_PROPERTY_SESSION,
  ProductAnalyticsServerSideEventItem.JSON_PROPERTY_TYPE,
  ProductAnalyticsServerSideEventItem.JSON_PROPERTY_USR
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsServerSideEventItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private ProductAnalyticsServerSideEventItemAccount account;

  public static final String JSON_PROPERTY_APPLICATION = "application";
  private ProductAnalyticsServerSideEventItemApplication application;

  public static final String JSON_PROPERTY_EVENT = "event";
  private ProductAnalyticsServerSideEventItemEvent event;

  public static final String JSON_PROPERTY_SESSION = "session";
  private ProductAnalyticsServerSideEventItemSession session;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ProductAnalyticsServerSideEventItemType type;

  public static final String JSON_PROPERTY_USR = "usr";
  private ProductAnalyticsServerSideEventItemUsr usr;

  public ProductAnalyticsServerSideEventItem() {}

  @JsonCreator
  public ProductAnalyticsServerSideEventItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLICATION)
          ProductAnalyticsServerSideEventItemApplication application,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT)
          ProductAnalyticsServerSideEventItemEvent event,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ProductAnalyticsServerSideEventItemType type) {
    this.application = application;
    this.unparsed |= application.unparsed;
    this.event = event;
    this.unparsed |= event.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ProductAnalyticsServerSideEventItem account(
      ProductAnalyticsServerSideEventItemAccount account) {
    this.account = account;
    this.unparsed |= account.unparsed;
    return this;
  }

  /**
   * The account linked to your event.
   *
   * @return account
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsServerSideEventItemAccount getAccount() {
    return account;
  }

  public void setAccount(ProductAnalyticsServerSideEventItemAccount account) {
    this.account = account;
  }

  public ProductAnalyticsServerSideEventItem application(
      ProductAnalyticsServerSideEventItemApplication application) {
    this.application = application;
    this.unparsed |= application.unparsed;
    return this;
  }

  /**
   * The application in which you want to send your events.
   *
   * @return application
   */
  @JsonProperty(JSON_PROPERTY_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsServerSideEventItemApplication getApplication() {
    return application;
  }

  public void setApplication(ProductAnalyticsServerSideEventItemApplication application) {
    this.application = application;
  }

  public ProductAnalyticsServerSideEventItem event(ProductAnalyticsServerSideEventItemEvent event) {
    this.event = event;
    this.unparsed |= event.unparsed;
    return this;
  }

  /**
   * Fields used for the event.
   *
   * @return event
   */
  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsServerSideEventItemEvent getEvent() {
    return event;
  }

  public void setEvent(ProductAnalyticsServerSideEventItemEvent event) {
    this.event = event;
  }

  public ProductAnalyticsServerSideEventItem session(
      ProductAnalyticsServerSideEventItemSession session) {
    this.session = session;
    this.unparsed |= session.unparsed;
    return this;
  }

  /**
   * The session linked to your event.
   *
   * @return session
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsServerSideEventItemSession getSession() {
    return session;
  }

  public void setSession(ProductAnalyticsServerSideEventItemSession session) {
    this.session = session;
  }

  public ProductAnalyticsServerSideEventItem type(ProductAnalyticsServerSideEventItemType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of Product Analytics event. Must be <code>server</code> for server-side events.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsServerSideEventItemType getType() {
    return type;
  }

  public void setType(ProductAnalyticsServerSideEventItemType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ProductAnalyticsServerSideEventItem usr(ProductAnalyticsServerSideEventItemUsr usr) {
    this.usr = usr;
    this.unparsed |= usr.unparsed;
    return this;
  }

  /**
   * The user linked to your event.
   *
   * @return usr
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsServerSideEventItemUsr getUsr() {
    return usr;
  }

  public void setUsr(ProductAnalyticsServerSideEventItemUsr usr) {
    this.usr = usr;
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
   * @return ProductAnalyticsServerSideEventItem
   */
  @JsonAnySetter
  public ProductAnalyticsServerSideEventItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsServerSideEventItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsServerSideEventItem productAnalyticsServerSideEventItem =
        (ProductAnalyticsServerSideEventItem) o;
    return Objects.equals(this.account, productAnalyticsServerSideEventItem.account)
        && Objects.equals(this.application, productAnalyticsServerSideEventItem.application)
        && Objects.equals(this.event, productAnalyticsServerSideEventItem.event)
        && Objects.equals(this.session, productAnalyticsServerSideEventItem.session)
        && Objects.equals(this.type, productAnalyticsServerSideEventItem.type)
        && Objects.equals(this.usr, productAnalyticsServerSideEventItem.usr)
        && Objects.equals(
            this.additionalProperties, productAnalyticsServerSideEventItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, application, event, session, type, usr, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsServerSideEventItem {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usr: ").append(toIndentedString(usr)).append("\n");
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
