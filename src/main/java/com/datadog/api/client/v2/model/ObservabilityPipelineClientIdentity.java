/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Restricts which clients may connect, based on the identities in their TLS certificate. Checks run
 * during the TLS handshake, after the client certificate chain is validated against <code>ca_file
 * </code>, and never relax that validation. Requires <code>verify_certificate: true</code> and
 * <code>ca_file</code>. Set exactly one of <code>allowlist_file</code> or <code>allowlist</code>.
 * When set, connections are closed after a maximum age of 300 seconds so that clients removed from
 * the allowlist are disconnected. Requires Observability Pipelines Worker 2.27 or later.
 */
@JsonPropertyOrder({
  ObservabilityPipelineClientIdentity.JSON_PROPERTY_ALLOWLIST,
  ObservabilityPipelineClientIdentity.JSON_PROPERTY_ALLOWLIST_FILE,
  ObservabilityPipelineClientIdentity.JSON_PROPERTY_MODE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineClientIdentity {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOWLIST = "allowlist";
  private ObservabilityPipelineClientIdentityAllowlist allowlist;

  public static final String JSON_PROPERTY_ALLOWLIST_FILE = "allowlist_file";
  private String allowlistFile;

  public static final String JSON_PROPERTY_MODE = "mode";
  private ObservabilityPipelineClientIdentityMode mode =
      ObservabilityPipelineClientIdentityMode.ENFORCE;

  public ObservabilityPipelineClientIdentity allowlist(
      ObservabilityPipelineClientIdentityAllowlist allowlist) {
    this.allowlist = allowlist;
    this.unparsed |= allowlist.unparsed;
    return this;
  }

  /**
   * An allowlist of client identities. A client is allowed when any rule matches.
   *
   * @return allowlist
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWLIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineClientIdentityAllowlist getAllowlist() {
    return allowlist;
  }

  public void setAllowlist(ObservabilityPipelineClientIdentityAllowlist allowlist) {
    this.allowlist = allowlist;
    if (allowlist != null) {
      this.unparsed |= allowlist.unparsed;
    }
  }

  public ObservabilityPipelineClientIdentity allowlistFile(String allowlistFile) {
    this.allowlistFile = allowlistFile;
    return this;
  }

  /**
   * Path to an allowlist file, relative to the Worker's data directory. The Worker reloads the file
   * when it changes. Must not contain parent directory (<code>..</code>) references.
   *
   * @return allowlistFile
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWLIST_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAllowlistFile() {
    return allowlistFile;
  }

  public void setAllowlistFile(String allowlistFile) {
    this.allowlistFile = allowlistFile;
  }

  public ObservabilityPipelineClientIdentity mode(ObservabilityPipelineClientIdentityMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * What happens to a client that no rule allows. <code>enforce</code> rejects the TLS handshake.
   * <code>audit</code> accepts the client and reports that it would have been rejected.
   *
   * @return mode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineClientIdentityMode getMode() {
    return mode;
  }

  public void setMode(ObservabilityPipelineClientIdentityMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
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
   * @return ObservabilityPipelineClientIdentity
   */
  @JsonAnySetter
  public ObservabilityPipelineClientIdentity putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineClientIdentity object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineClientIdentity observabilityPipelineClientIdentity =
        (ObservabilityPipelineClientIdentity) o;
    return Objects.equals(this.allowlist, observabilityPipelineClientIdentity.allowlist)
        && Objects.equals(this.allowlistFile, observabilityPipelineClientIdentity.allowlistFile)
        && Objects.equals(this.mode, observabilityPipelineClientIdentity.mode)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineClientIdentity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowlist, allowlistFile, mode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineClientIdentity {\n");
    sb.append("    allowlist: ").append(toIndentedString(allowlist)).append("\n");
    sb.append("    allowlistFile: ").append(toIndentedString(allowlistFile)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
