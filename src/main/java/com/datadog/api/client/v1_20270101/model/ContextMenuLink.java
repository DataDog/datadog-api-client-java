/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ContextMenuLink.JSON_PROPERTY_IS_HIDDEN,
  ContextMenuLink.JSON_PROPERTY_LINK,
  ContextMenuLink.JSON_PROPERTY_OVERRIDE_LABEL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ContextMenuLink {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_HIDDEN = "is_hidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link;

  public static final String JSON_PROPERTY_OVERRIDE_LABEL = "override_label";
  private ContextMenuLinkLabel overrideLabel;

  public ContextMenuLink() {}

  @JsonCreator
  public ContextMenuLink(
      @JsonProperty(required = true, value = JSON_PROPERTY_OVERRIDE_LABEL)
          ContextMenuLinkLabel overrideLabel) {
    this.overrideLabel = overrideLabel;
    this.unparsed |= !overrideLabel.isValid();
  }

  public ContextMenuLink isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return isHidden
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public ContextMenuLink link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return link
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public ContextMenuLink overrideLabel(ContextMenuLinkLabel overrideLabel) {
    this.overrideLabel = overrideLabel;
    this.unparsed |= !overrideLabel.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return overrideLabel
   */
  @JsonProperty(JSON_PROPERTY_OVERRIDE_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ContextMenuLinkLabel getOverrideLabel() {
    return overrideLabel;
  }

  public void setOverrideLabel(ContextMenuLinkLabel overrideLabel) {
    if (!overrideLabel.isValid()) {
      this.unparsed = true;
    }
    this.overrideLabel = overrideLabel;
  }

  /** Return true if this ContextMenuLink object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextMenuLink contextMenuLink = (ContextMenuLink) o;
    return Objects.equals(this.isHidden, contextMenuLink.isHidden)
        && Objects.equals(this.link, contextMenuLink.link)
        && Objects.equals(this.overrideLabel, contextMenuLink.overrideLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHidden, link, overrideLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextMenuLink {\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    overrideLabel: ").append(toIndentedString(overrideLabel)).append("\n");
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
