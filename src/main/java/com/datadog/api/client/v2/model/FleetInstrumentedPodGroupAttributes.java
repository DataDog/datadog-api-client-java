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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of a group of instrumented pods targeted for SSI injection. */
@JsonPropertyOrder({
  FleetInstrumentedPodGroupAttributes.JSON_PROPERTY_APPLIED_TARGET,
  FleetInstrumentedPodGroupAttributes.JSON_PROPERTY_APPLIED_TARGET_NAME,
  FleetInstrumentedPodGroupAttributes.JSON_PROPERTY_INJECTED_TAGS,
  FleetInstrumentedPodGroupAttributes.JSON_PROPERTY_KUBE_OWNERREF_KIND,
  FleetInstrumentedPodGroupAttributes.JSON_PROPERTY_KUBE_OWNERREF_NAME,
  FleetInstrumentedPodGroupAttributes.JSON_PROPERTY_LIB_INJECTION_ANNOTATIONS,
  FleetInstrumentedPodGroupAttributes.JSON_PROPERTY_NAMESPACE,
  FleetInstrumentedPodGroupAttributes.JSON_PROPERTY_POD_COUNT,
  FleetInstrumentedPodGroupAttributes.JSON_PROPERTY_POD_NAMES,
  FleetInstrumentedPodGroupAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetInstrumentedPodGroupAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLIED_TARGET = "applied_target";
  private Map<String, Object> appliedTarget = null;

  public static final String JSON_PROPERTY_APPLIED_TARGET_NAME = "applied_target_name";
  private String appliedTargetName;

  public static final String JSON_PROPERTY_INJECTED_TAGS = "injected_tags";
  private List<String> injectedTags = null;

  public static final String JSON_PROPERTY_KUBE_OWNERREF_KIND = "kube_ownerref_kind";
  private String kubeOwnerrefKind;

  public static final String JSON_PROPERTY_KUBE_OWNERREF_NAME = "kube_ownerref_name";
  private String kubeOwnerrefName;

  public static final String JSON_PROPERTY_LIB_INJECTION_ANNOTATIONS = "lib_injection_annotations";
  private List<String> libInjectionAnnotations = null;

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private String namespace;

  public static final String JSON_PROPERTY_POD_COUNT = "pod_count";
  private Long podCount;

  public static final String JSON_PROPERTY_POD_NAMES = "pod_names";
  private List<String> podNames = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = null;

  public FleetInstrumentedPodGroupAttributes appliedTarget(Map<String, Object> appliedTarget) {
    this.appliedTarget = appliedTarget;
    return this;
  }

  public FleetInstrumentedPodGroupAttributes putAppliedTargetItem(
      String key, Object appliedTargetItem) {
    if (this.appliedTarget == null) {
      this.appliedTarget = new HashMap<>();
    }
    this.appliedTarget.put(key, appliedTargetItem);
    return this;
  }

  /**
   * The SSI injection target configuration applied to the pod group.
   *
   * @return appliedTarget
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLIED_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getAppliedTarget() {
    return appliedTarget;
  }

  public void setAppliedTarget(Map<String, Object> appliedTarget) {
    this.appliedTarget = appliedTarget;
  }

  public FleetInstrumentedPodGroupAttributes appliedTargetName(String appliedTargetName) {
    this.appliedTargetName = appliedTargetName;
    return this;
  }

  /**
   * The name of the applied SSI injection target.
   *
   * @return appliedTargetName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLIED_TARGET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAppliedTargetName() {
    return appliedTargetName;
  }

  public void setAppliedTargetName(String appliedTargetName) {
    this.appliedTargetName = appliedTargetName;
  }

  public FleetInstrumentedPodGroupAttributes injectedTags(List<String> injectedTags) {
    this.injectedTags = injectedTags;
    return this;
  }

  public FleetInstrumentedPodGroupAttributes addInjectedTagsItem(String injectedTagsItem) {
    if (this.injectedTags == null) {
      this.injectedTags = new ArrayList<>();
    }
    this.injectedTags.add(injectedTagsItem);
    return this;
  }

  /**
   * Tags injected into the pods by the Admission Controller.
   *
   * @return injectedTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INJECTED_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getInjectedTags() {
    return injectedTags;
  }

  public void setInjectedTags(List<String> injectedTags) {
    this.injectedTags = injectedTags;
  }

  public FleetInstrumentedPodGroupAttributes kubeOwnerrefKind(String kubeOwnerrefKind) {
    this.kubeOwnerrefKind = kubeOwnerrefKind;
    return this;
  }

  /**
   * The kind of the Kubernetes owner reference.
   *
   * @return kubeOwnerrefKind
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KUBE_OWNERREF_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKubeOwnerrefKind() {
    return kubeOwnerrefKind;
  }

  public void setKubeOwnerrefKind(String kubeOwnerrefKind) {
    this.kubeOwnerrefKind = kubeOwnerrefKind;
  }

  public FleetInstrumentedPodGroupAttributes kubeOwnerrefName(String kubeOwnerrefName) {
    this.kubeOwnerrefName = kubeOwnerrefName;
    return this;
  }

  /**
   * The name of the Kubernetes owner reference (deployment, statefulset, etc.).
   *
   * @return kubeOwnerrefName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KUBE_OWNERREF_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKubeOwnerrefName() {
    return kubeOwnerrefName;
  }

  public void setKubeOwnerrefName(String kubeOwnerrefName) {
    this.kubeOwnerrefName = kubeOwnerrefName;
  }

  public FleetInstrumentedPodGroupAttributes libInjectionAnnotations(
      List<String> libInjectionAnnotations) {
    this.libInjectionAnnotations = libInjectionAnnotations;
    return this;
  }

  public FleetInstrumentedPodGroupAttributes addLibInjectionAnnotationsItem(
      String libInjectionAnnotationsItem) {
    if (this.libInjectionAnnotations == null) {
      this.libInjectionAnnotations = new ArrayList<>();
    }
    this.libInjectionAnnotations.add(libInjectionAnnotationsItem);
    return this;
  }

  /**
   * Library injection annotations on the pod group.
   *
   * @return libInjectionAnnotations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIB_INJECTION_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getLibInjectionAnnotations() {
    return libInjectionAnnotations;
  }

  public void setLibInjectionAnnotations(List<String> libInjectionAnnotations) {
    this.libInjectionAnnotations = libInjectionAnnotations;
  }

  public FleetInstrumentedPodGroupAttributes namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * The Kubernetes namespace of the pod group.
   *
   * @return namespace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public FleetInstrumentedPodGroupAttributes podCount(Long podCount) {
    this.podCount = podCount;
    return this;
  }

  /**
   * Total number of pods in the group.
   *
   * @return podCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPodCount() {
    return podCount;
  }

  public void setPodCount(Long podCount) {
    this.podCount = podCount;
  }

  public FleetInstrumentedPodGroupAttributes podNames(List<String> podNames) {
    this.podNames = podNames;
    return this;
  }

  public FleetInstrumentedPodGroupAttributes addPodNamesItem(String podNamesItem) {
    if (this.podNames == null) {
      this.podNames = new ArrayList<>();
    }
    this.podNames.add(podNamesItem);
    return this;
  }

  /**
   * Names of the individual pods in the group.
   *
   * @return podNames
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POD_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getPodNames() {
    return podNames;
  }

  public void setPodNames(List<String> podNames) {
    this.podNames = podNames;
  }

  public FleetInstrumentedPodGroupAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public FleetInstrumentedPodGroupAttributes putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Additional tags associated with the pod group.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
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
   * @return FleetInstrumentedPodGroupAttributes
   */
  @JsonAnySetter
  public FleetInstrumentedPodGroupAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetInstrumentedPodGroupAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetInstrumentedPodGroupAttributes fleetInstrumentedPodGroupAttributes =
        (FleetInstrumentedPodGroupAttributes) o;
    return Objects.equals(this.appliedTarget, fleetInstrumentedPodGroupAttributes.appliedTarget)
        && Objects.equals(
            this.appliedTargetName, fleetInstrumentedPodGroupAttributes.appliedTargetName)
        && Objects.equals(this.injectedTags, fleetInstrumentedPodGroupAttributes.injectedTags)
        && Objects.equals(
            this.kubeOwnerrefKind, fleetInstrumentedPodGroupAttributes.kubeOwnerrefKind)
        && Objects.equals(
            this.kubeOwnerrefName, fleetInstrumentedPodGroupAttributes.kubeOwnerrefName)
        && Objects.equals(
            this.libInjectionAnnotations,
            fleetInstrumentedPodGroupAttributes.libInjectionAnnotations)
        && Objects.equals(this.namespace, fleetInstrumentedPodGroupAttributes.namespace)
        && Objects.equals(this.podCount, fleetInstrumentedPodGroupAttributes.podCount)
        && Objects.equals(this.podNames, fleetInstrumentedPodGroupAttributes.podNames)
        && Objects.equals(this.tags, fleetInstrumentedPodGroupAttributes.tags)
        && Objects.equals(
            this.additionalProperties, fleetInstrumentedPodGroupAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        appliedTarget,
        appliedTargetName,
        injectedTags,
        kubeOwnerrefKind,
        kubeOwnerrefName,
        libInjectionAnnotations,
        namespace,
        podCount,
        podNames,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetInstrumentedPodGroupAttributes {\n");
    sb.append("    appliedTarget: ").append(toIndentedString(appliedTarget)).append("\n");
    sb.append("    appliedTargetName: ").append(toIndentedString(appliedTargetName)).append("\n");
    sb.append("    injectedTags: ").append(toIndentedString(injectedTags)).append("\n");
    sb.append("    kubeOwnerrefKind: ").append(toIndentedString(kubeOwnerrefKind)).append("\n");
    sb.append("    kubeOwnerrefName: ").append(toIndentedString(kubeOwnerrefName)).append("\n");
    sb.append("    libInjectionAnnotations: ")
        .append(toIndentedString(libInjectionAnnotations))
        .append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    podCount: ").append(toIndentedString(podCount)).append("\n");
    sb.append("    podNames: ").append(toIndentedString(podNames)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
