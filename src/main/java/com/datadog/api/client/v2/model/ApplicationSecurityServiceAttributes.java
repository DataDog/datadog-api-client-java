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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Application Security details describing a service in a given environment. */
@JsonPropertyOrder({
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_AGENT_VERSIONS,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_APP_TYPE,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_ASM_THREAT_COMPATIBLE,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_BACKEND_WAF_EVENT_COUNT,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_BUSINESS_LOGIC,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_COLOR,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_ENV,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_EVENT_COUNT,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_EVENT_TREND,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_HAS_APPSEC_ENABLED,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_HITS,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_IAST_PRODUCT_ACTIVATION,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_IAST_PRODUCT_COMPATIBILITY,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_IAST_PRODUCT_COMPATIBILITY_REASONS,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_LANGUAGES,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_LAST_INGESTED_SPANS,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_RC_CAPABILITIES,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_RECOMMENDED_BUSINESS_LOGIC,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_RISK_PRODUCT_ACTIVATION,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_RISK_PRODUCT_COMPATIBILITY,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_RISK_PRODUCT_COMPATIBILITY_REASONS,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_RULES_VERSION,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_SERVICE,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_SIGNAL_COUNT,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_SIGNAL_TREND,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_SOURCE,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_TEAMS,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_TRACER_VERSIONS,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_VM_ACTIVATION,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_VULN_CRITICAL_COUNT,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_VULN_HIGH_COUNT,
  ApplicationSecurityServiceAttributes.JSON_PROPERTY_WITHOUT_FILTER_SERVICES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityServiceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_VERSIONS = "agent_versions";
  private List<String> agentVersions = new ArrayList<>();

  public static final String JSON_PROPERTY_APP_TYPE = "app_type";
  private String appType;

  public static final String JSON_PROPERTY_ASM_THREAT_COMPATIBLE = "asm_threat_compatible";
  private Boolean asmThreatCompatible;

  public static final String JSON_PROPERTY_BACKEND_WAF_EVENT_COUNT = "backend_waf_event_count";
  private Long backendWafEventCount;

  public static final String JSON_PROPERTY_BUSINESS_LOGIC = "business_logic";
  private List<String> businessLogic = new ArrayList<>();

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_EVENT_COUNT = "event_count";
  private Long eventCount;

  public static final String JSON_PROPERTY_EVENT_TREND = "event_trend";
  private List<Long> eventTrend = new ArrayList<>();

  public static final String JSON_PROPERTY_HAS_APPSEC_ENABLED = "has_appsec_enabled";
  private Boolean hasAppsecEnabled;

  public static final String JSON_PROPERTY_HITS = "hits";
  private Long hits;

  public static final String JSON_PROPERTY_IAST_PRODUCT_ACTIVATION = "iast_product_activation";
  private Boolean iastProductActivation;

  public static final String JSON_PROPERTY_IAST_PRODUCT_COMPATIBILITY =
      "iast_product_compatibility";
  private String iastProductCompatibility;

  public static final String JSON_PROPERTY_IAST_PRODUCT_COMPATIBILITY_REASONS =
      "iast_product_compatibility_reasons";
  private List<String> iastProductCompatibilityReasons = new ArrayList<>();

  public static final String JSON_PROPERTY_LANGUAGES = "languages";
  private List<String> languages = new ArrayList<>();

  public static final String JSON_PROPERTY_LAST_INGESTED_SPANS = "last_ingested_spans";
  private Long lastIngestedSpans;

  public static final String JSON_PROPERTY_RC_CAPABILITIES = "rc_capabilities";
  private List<String> rcCapabilities = new ArrayList<>();

  public static final String JSON_PROPERTY_RECOMMENDED_BUSINESS_LOGIC =
      "recommended_business_logic";
  private List<String> recommendedBusinessLogic = new ArrayList<>();

  public static final String JSON_PROPERTY_RISK_PRODUCT_ACTIVATION = "risk_product_activation";
  private Boolean riskProductActivation;

  public static final String JSON_PROPERTY_RISK_PRODUCT_COMPATIBILITY =
      "risk_product_compatibility";
  private String riskProductCompatibility;

  public static final String JSON_PROPERTY_RISK_PRODUCT_COMPATIBILITY_REASONS =
      "risk_product_compatibility_reasons";
  private List<String> riskProductCompatibilityReasons = new ArrayList<>();

  public static final String JSON_PROPERTY_RULES_VERSION = "rules_version";
  private List<String> rulesVersion = new ArrayList<>();

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SIGNAL_COUNT = "signal_count";
  private Long signalCount;

  public static final String JSON_PROPERTY_SIGNAL_TREND = "signal_trend";
  private List<Long> signalTrend = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCE = "source";
  private List<String> source = new ArrayList<>();

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<String> teams = new ArrayList<>();

  public static final String JSON_PROPERTY_TRACER_VERSIONS = "tracer_versions";
  private List<String> tracerVersions = new ArrayList<>();

  public static final String JSON_PROPERTY_VM_ACTIVATION = "vm-activation";
  private String vmActivation;

  public static final String JSON_PROPERTY_VULN_CRITICAL_COUNT = "vuln_critical_count";
  private Long vulnCriticalCount;

  public static final String JSON_PROPERTY_VULN_HIGH_COUNT = "vuln_high_count";
  private Long vulnHighCount;

  public static final String JSON_PROPERTY_WITHOUT_FILTER_SERVICES = "without_filter_services";
  private Long withoutFilterServices;

  public ApplicationSecurityServiceAttributes() {}

  @JsonCreator
  public ApplicationSecurityServiceAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGENT_VERSIONS)
          List<String> agentVersions,
      @JsonProperty(required = true, value = JSON_PROPERTY_APP_TYPE) String appType,
      @JsonProperty(required = true, value = JSON_PROPERTY_ASM_THREAT_COMPATIBLE)
          Boolean asmThreatCompatible,
      @JsonProperty(required = true, value = JSON_PROPERTY_BACKEND_WAF_EVENT_COUNT)
          Long backendWafEventCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_BUSINESS_LOGIC)
          List<String> businessLogic,
      @JsonProperty(required = true, value = JSON_PROPERTY_COLOR) String color,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENV) String env,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT_COUNT) Long eventCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT_TREND) List<Long> eventTrend,
      @JsonProperty(required = true, value = JSON_PROPERTY_HAS_APPSEC_ENABLED)
          Boolean hasAppsecEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_HITS) Long hits,
      @JsonProperty(required = true, value = JSON_PROPERTY_IAST_PRODUCT_ACTIVATION)
          Boolean iastProductActivation,
      @JsonProperty(required = true, value = JSON_PROPERTY_IAST_PRODUCT_COMPATIBILITY)
          String iastProductCompatibility,
      @JsonProperty(required = true, value = JSON_PROPERTY_IAST_PRODUCT_COMPATIBILITY_REASONS)
          List<String> iastProductCompatibilityReasons,
      @JsonProperty(required = true, value = JSON_PROPERTY_LANGUAGES) List<String> languages,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_INGESTED_SPANS)
          Long lastIngestedSpans,
      @JsonProperty(required = true, value = JSON_PROPERTY_RC_CAPABILITIES)
          List<String> rcCapabilities,
      @JsonProperty(required = true, value = JSON_PROPERTY_RECOMMENDED_BUSINESS_LOGIC)
          List<String> recommendedBusinessLogic,
      @JsonProperty(required = true, value = JSON_PROPERTY_RISK_PRODUCT_ACTIVATION)
          Boolean riskProductActivation,
      @JsonProperty(required = true, value = JSON_PROPERTY_RISK_PRODUCT_COMPATIBILITY)
          String riskProductCompatibility,
      @JsonProperty(required = true, value = JSON_PROPERTY_RISK_PRODUCT_COMPATIBILITY_REASONS)
          List<String> riskProductCompatibilityReasons,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULES_VERSION) List<String> rulesVersion,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNAL_COUNT) Long signalCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNAL_TREND) List<Long> signalTrend,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) List<String> source,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAMS) List<String> teams,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRACER_VERSIONS)
          List<String> tracerVersions,
      @JsonProperty(required = true, value = JSON_PROPERTY_VM_ACTIVATION) String vmActivation,
      @JsonProperty(required = true, value = JSON_PROPERTY_VULN_CRITICAL_COUNT)
          Long vulnCriticalCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_VULN_HIGH_COUNT) Long vulnHighCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_WITHOUT_FILTER_SERVICES)
          Long withoutFilterServices) {
    this.agentVersions = agentVersions;
    this.appType = appType;
    this.asmThreatCompatible = asmThreatCompatible;
    this.backendWafEventCount = backendWafEventCount;
    this.businessLogic = businessLogic;
    this.color = color;
    this.env = env;
    this.eventCount = eventCount;
    this.eventTrend = eventTrend;
    this.hasAppsecEnabled = hasAppsecEnabled;
    this.hits = hits;
    this.iastProductActivation = iastProductActivation;
    this.iastProductCompatibility = iastProductCompatibility;
    this.iastProductCompatibilityReasons = iastProductCompatibilityReasons;
    this.languages = languages;
    this.lastIngestedSpans = lastIngestedSpans;
    this.rcCapabilities = rcCapabilities;
    this.recommendedBusinessLogic = recommendedBusinessLogic;
    this.riskProductActivation = riskProductActivation;
    this.riskProductCompatibility = riskProductCompatibility;
    this.riskProductCompatibilityReasons = riskProductCompatibilityReasons;
    this.rulesVersion = rulesVersion;
    this.service = service;
    this.signalCount = signalCount;
    this.signalTrend = signalTrend;
    this.source = source;
    this.teams = teams;
    this.tracerVersions = tracerVersions;
    this.vmActivation = vmActivation;
    this.vulnCriticalCount = vulnCriticalCount;
    this.vulnHighCount = vulnHighCount;
    this.withoutFilterServices = withoutFilterServices;
  }

  public ApplicationSecurityServiceAttributes agentVersions(List<String> agentVersions) {
    this.agentVersions = agentVersions;
    return this;
  }

  public ApplicationSecurityServiceAttributes addAgentVersionsItem(String agentVersionsItem) {
    this.agentVersions.add(agentVersionsItem);
    return this;
  }

  /**
   * The Datadog Agent versions reporting for the service.
   *
   * @return agentVersions
   */
  @JsonProperty(JSON_PROPERTY_AGENT_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getAgentVersions() {
    return agentVersions;
  }

  public void setAgentVersions(List<String> agentVersions) {
    this.agentVersions = agentVersions;
  }

  public ApplicationSecurityServiceAttributes appType(String appType) {
    this.appType = appType;
    return this;
  }

  /**
   * The application type of the service, such as <code>web</code> or <code>serverless</code>.
   *
   * @return appType
   */
  @JsonProperty(JSON_PROPERTY_APP_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAppType() {
    return appType;
  }

  public void setAppType(String appType) {
    this.appType = appType;
  }

  public ApplicationSecurityServiceAttributes asmThreatCompatible(Boolean asmThreatCompatible) {
    this.asmThreatCompatible = asmThreatCompatible;
    return this;
  }

  /**
   * Whether the service is compatible with Application Security Management (Threats).
   *
   * @return asmThreatCompatible
   */
  @JsonProperty(JSON_PROPERTY_ASM_THREAT_COMPATIBLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getAsmThreatCompatible() {
    return asmThreatCompatible;
  }

  public void setAsmThreatCompatible(Boolean asmThreatCompatible) {
    this.asmThreatCompatible = asmThreatCompatible;
  }

  public ApplicationSecurityServiceAttributes backendWafEventCount(Long backendWafEventCount) {
    this.backendWafEventCount = backendWafEventCount;
    return this;
  }

  /**
   * The number of backend WAF events detected for the service.
   *
   * @return backendWafEventCount
   */
  @JsonProperty(JSON_PROPERTY_BACKEND_WAF_EVENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getBackendWafEventCount() {
    return backendWafEventCount;
  }

  public void setBackendWafEventCount(Long backendWafEventCount) {
    this.backendWafEventCount = backendWafEventCount;
  }

  public ApplicationSecurityServiceAttributes businessLogic(List<String> businessLogic) {
    this.businessLogic = businessLogic;
    return this;
  }

  public ApplicationSecurityServiceAttributes addBusinessLogicItem(String businessLogicItem) {
    this.businessLogic.add(businessLogicItem);
    return this;
  }

  /**
   * The enabled business logic detection rules for the service.
   *
   * @return businessLogic
   */
  @JsonProperty(JSON_PROPERTY_BUSINESS_LOGIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getBusinessLogic() {
    return businessLogic;
  }

  public void setBusinessLogic(List<String> businessLogic) {
    this.businessLogic = businessLogic;
  }

  public ApplicationSecurityServiceAttributes color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Deprecated: a display color associated with the service in the UI.
   *
   * @return color
   * @deprecated
   */
  @Deprecated
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getColor() {
    return color;
  }

  @Deprecated
  public void setColor(String color) {
    this.color = color;
  }

  public ApplicationSecurityServiceAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * The environment the service runs in.
   *
   * @return env
   */
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public ApplicationSecurityServiceAttributes eventCount(Long eventCount) {
    this.eventCount = eventCount;
    return this;
  }

  /**
   * The number of Application Security events detected for the service.
   *
   * @return eventCount
   */
  @JsonProperty(JSON_PROPERTY_EVENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getEventCount() {
    return eventCount;
  }

  public void setEventCount(Long eventCount) {
    this.eventCount = eventCount;
  }

  public ApplicationSecurityServiceAttributes eventTrend(List<Long> eventTrend) {
    this.eventTrend = eventTrend;
    return this;
  }

  public ApplicationSecurityServiceAttributes addEventTrendItem(Long eventTrendItem) {
    this.eventTrend.add(eventTrendItem);
    return this;
  }

  /**
   * Deprecated: the trend of Application Security events over time.
   *
   * @return eventTrend
   * @deprecated
   */
  @Deprecated
  @JsonProperty(JSON_PROPERTY_EVENT_TREND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Long> getEventTrend() {
    return eventTrend;
  }

  @Deprecated
  public void setEventTrend(List<Long> eventTrend) {
    this.eventTrend = eventTrend;
  }

  public ApplicationSecurityServiceAttributes hasAppsecEnabled(Boolean hasAppsecEnabled) {
    this.hasAppsecEnabled = hasAppsecEnabled;
    return this;
  }

  /**
   * Whether Application Security Management (Threats) is enabled for the service.
   *
   * @return hasAppsecEnabled
   */
  @JsonProperty(JSON_PROPERTY_HAS_APPSEC_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHasAppsecEnabled() {
    return hasAppsecEnabled;
  }

  public void setHasAppsecEnabled(Boolean hasAppsecEnabled) {
    this.hasAppsecEnabled = hasAppsecEnabled;
  }

  public ApplicationSecurityServiceAttributes hits(Long hits) {
    this.hits = hits;
    return this;
  }

  /**
   * Deprecated: the number of hits for the service.
   *
   * @return hits
   * @deprecated
   */
  @Deprecated
  @JsonProperty(JSON_PROPERTY_HITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getHits() {
    return hits;
  }

  @Deprecated
  public void setHits(Long hits) {
    this.hits = hits;
  }

  public ApplicationSecurityServiceAttributes iastProductActivation(Boolean iastProductActivation) {
    this.iastProductActivation = iastProductActivation;
    return this;
  }

  /**
   * Whether Interactive Application Security Testing (IAST) is enabled for the service.
   *
   * @return iastProductActivation
   */
  @JsonProperty(JSON_PROPERTY_IAST_PRODUCT_ACTIVATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIastProductActivation() {
    return iastProductActivation;
  }

  public void setIastProductActivation(Boolean iastProductActivation) {
    this.iastProductActivation = iastProductActivation;
  }

  public ApplicationSecurityServiceAttributes iastProductCompatibility(
      String iastProductCompatibility) {
    this.iastProductCompatibility = iastProductCompatibility;
    return this;
  }

  /**
   * The Interactive Application Security Testing (IAST) compatibility status of the service.
   *
   * @return iastProductCompatibility
   */
  @JsonProperty(JSON_PROPERTY_IAST_PRODUCT_COMPATIBILITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIastProductCompatibility() {
    return iastProductCompatibility;
  }

  public void setIastProductCompatibility(String iastProductCompatibility) {
    this.iastProductCompatibility = iastProductCompatibility;
  }

  public ApplicationSecurityServiceAttributes iastProductCompatibilityReasons(
      List<String> iastProductCompatibilityReasons) {
    this.iastProductCompatibilityReasons = iastProductCompatibilityReasons;
    return this;
  }

  public ApplicationSecurityServiceAttributes addIastProductCompatibilityReasonsItem(
      String iastProductCompatibilityReasonsItem) {
    this.iastProductCompatibilityReasons.add(iastProductCompatibilityReasonsItem);
    return this;
  }

  /**
   * The reasons explaining the Interactive Application Security Testing (IAST) compatibility
   * status.
   *
   * @return iastProductCompatibilityReasons
   */
  @JsonProperty(JSON_PROPERTY_IAST_PRODUCT_COMPATIBILITY_REASONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getIastProductCompatibilityReasons() {
    return iastProductCompatibilityReasons;
  }

  public void setIastProductCompatibilityReasons(List<String> iastProductCompatibilityReasons) {
    this.iastProductCompatibilityReasons = iastProductCompatibilityReasons;
  }

  public ApplicationSecurityServiceAttributes languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public ApplicationSecurityServiceAttributes addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

  /**
   * The programming languages detected for the service.
   *
   * @return languages
   */
  @JsonProperty(JSON_PROPERTY_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public ApplicationSecurityServiceAttributes lastIngestedSpans(Long lastIngestedSpans) {
    this.lastIngestedSpans = lastIngestedSpans;
    return this;
  }

  /**
   * The Unix timestamp, in seconds, of the last ingested span for the service.
   *
   * @return lastIngestedSpans
   */
  @JsonProperty(JSON_PROPERTY_LAST_INGESTED_SPANS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLastIngestedSpans() {
    return lastIngestedSpans;
  }

  public void setLastIngestedSpans(Long lastIngestedSpans) {
    this.lastIngestedSpans = lastIngestedSpans;
  }

  public ApplicationSecurityServiceAttributes rcCapabilities(List<String> rcCapabilities) {
    this.rcCapabilities = rcCapabilities;
    return this;
  }

  public ApplicationSecurityServiceAttributes addRcCapabilitiesItem(String rcCapabilitiesItem) {
    this.rcCapabilities.add(rcCapabilitiesItem);
    return this;
  }

  /**
   * The Remote Configuration capabilities reported by the service.
   *
   * @return rcCapabilities
   */
  @JsonProperty(JSON_PROPERTY_RC_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRcCapabilities() {
    return rcCapabilities;
  }

  public void setRcCapabilities(List<String> rcCapabilities) {
    this.rcCapabilities = rcCapabilities;
  }

  public ApplicationSecurityServiceAttributes recommendedBusinessLogic(
      List<String> recommendedBusinessLogic) {
    this.recommendedBusinessLogic = recommendedBusinessLogic;
    return this;
  }

  public ApplicationSecurityServiceAttributes addRecommendedBusinessLogicItem(
      String recommendedBusinessLogicItem) {
    this.recommendedBusinessLogic.add(recommendedBusinessLogicItem);
    return this;
  }

  /**
   * The recommended business logic detection rules for the service.
   *
   * @return recommendedBusinessLogic
   */
  @JsonProperty(JSON_PROPERTY_RECOMMENDED_BUSINESS_LOGIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRecommendedBusinessLogic() {
    return recommendedBusinessLogic;
  }

  public void setRecommendedBusinessLogic(List<String> recommendedBusinessLogic) {
    this.recommendedBusinessLogic = recommendedBusinessLogic;
  }

  public ApplicationSecurityServiceAttributes riskProductActivation(Boolean riskProductActivation) {
    this.riskProductActivation = riskProductActivation;
    return this;
  }

  /**
   * Whether Software Composition Analysis (SCA) is enabled for the service.
   *
   * @return riskProductActivation
   */
  @JsonProperty(JSON_PROPERTY_RISK_PRODUCT_ACTIVATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getRiskProductActivation() {
    return riskProductActivation;
  }

  public void setRiskProductActivation(Boolean riskProductActivation) {
    this.riskProductActivation = riskProductActivation;
  }

  public ApplicationSecurityServiceAttributes riskProductCompatibility(
      String riskProductCompatibility) {
    this.riskProductCompatibility = riskProductCompatibility;
    return this;
  }

  /**
   * The Software Composition Analysis (SCA) compatibility status of the service.
   *
   * @return riskProductCompatibility
   */
  @JsonProperty(JSON_PROPERTY_RISK_PRODUCT_COMPATIBILITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRiskProductCompatibility() {
    return riskProductCompatibility;
  }

  public void setRiskProductCompatibility(String riskProductCompatibility) {
    this.riskProductCompatibility = riskProductCompatibility;
  }

  public ApplicationSecurityServiceAttributes riskProductCompatibilityReasons(
      List<String> riskProductCompatibilityReasons) {
    this.riskProductCompatibilityReasons = riskProductCompatibilityReasons;
    return this;
  }

  public ApplicationSecurityServiceAttributes addRiskProductCompatibilityReasonsItem(
      String riskProductCompatibilityReasonsItem) {
    this.riskProductCompatibilityReasons.add(riskProductCompatibilityReasonsItem);
    return this;
  }

  /**
   * The reasons explaining the Software Composition Analysis (SCA) compatibility status.
   *
   * @return riskProductCompatibilityReasons
   */
  @JsonProperty(JSON_PROPERTY_RISK_PRODUCT_COMPATIBILITY_REASONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRiskProductCompatibilityReasons() {
    return riskProductCompatibilityReasons;
  }

  public void setRiskProductCompatibilityReasons(List<String> riskProductCompatibilityReasons) {
    this.riskProductCompatibilityReasons = riskProductCompatibilityReasons;
  }

  public ApplicationSecurityServiceAttributes rulesVersion(List<String> rulesVersion) {
    this.rulesVersion = rulesVersion;
    return this;
  }

  public ApplicationSecurityServiceAttributes addRulesVersionItem(String rulesVersionItem) {
    this.rulesVersion.add(rulesVersionItem);
    return this;
  }

  /**
   * The WAF rules versions applied to the service.
   *
   * @return rulesVersion
   */
  @JsonProperty(JSON_PROPERTY_RULES_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRulesVersion() {
    return rulesVersion;
  }

  public void setRulesVersion(List<String> rulesVersion) {
    this.rulesVersion = rulesVersion;
  }

  public ApplicationSecurityServiceAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The name of the service.
   *
   * @return service
   */
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public ApplicationSecurityServiceAttributes signalCount(Long signalCount) {
    this.signalCount = signalCount;
    return this;
  }

  /**
   * Deprecated: the number of security signals for the service.
   *
   * @return signalCount
   * @deprecated
   */
  @Deprecated
  @JsonProperty(JSON_PROPERTY_SIGNAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSignalCount() {
    return signalCount;
  }

  @Deprecated
  public void setSignalCount(Long signalCount) {
    this.signalCount = signalCount;
  }

  public ApplicationSecurityServiceAttributes signalTrend(List<Long> signalTrend) {
    this.signalTrend = signalTrend;
    return this;
  }

  public ApplicationSecurityServiceAttributes addSignalTrendItem(Long signalTrendItem) {
    this.signalTrend.add(signalTrendItem);
    return this;
  }

  /**
   * Deprecated: the trend of security signals over time.
   *
   * @return signalTrend
   * @deprecated
   */
  @Deprecated
  @JsonProperty(JSON_PROPERTY_SIGNAL_TREND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Long> getSignalTrend() {
    return signalTrend;
  }

  @Deprecated
  public void setSignalTrend(List<Long> signalTrend) {
    this.signalTrend = signalTrend;
  }

  public ApplicationSecurityServiceAttributes source(List<String> source) {
    this.source = source;
    return this;
  }

  public ApplicationSecurityServiceAttributes addSourceItem(String sourceItem) {
    this.source.add(sourceItem);
    return this;
  }

  /**
   * The data sources that contributed information about the service.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSource() {
    return source;
  }

  public void setSource(List<String> source) {
    this.source = source;
  }

  public ApplicationSecurityServiceAttributes teams(List<String> teams) {
    this.teams = teams;
    return this;
  }

  public ApplicationSecurityServiceAttributes addTeamsItem(String teamsItem) {
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * The teams that own the service.
   *
   * @return teams
   */
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTeams() {
    return teams;
  }

  public void setTeams(List<String> teams) {
    this.teams = teams;
  }

  public ApplicationSecurityServiceAttributes tracerVersions(List<String> tracerVersions) {
    this.tracerVersions = tracerVersions;
    return this;
  }

  public ApplicationSecurityServiceAttributes addTracerVersionsItem(String tracerVersionsItem) {
    this.tracerVersions.add(tracerVersionsItem);
    return this;
  }

  /**
   * The Datadog tracing library versions reporting for the service.
   *
   * @return tracerVersions
   */
  @JsonProperty(JSON_PROPERTY_TRACER_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTracerVersions() {
    return tracerVersions;
  }

  public void setTracerVersions(List<String> tracerVersions) {
    this.tracerVersions = tracerVersions;
  }

  public ApplicationSecurityServiceAttributes vmActivation(String vmActivation) {
    this.vmActivation = vmActivation;
    return this;
  }

  /**
   * The Vulnerability Management activation status of the service.
   *
   * @return vmActivation
   */
  @JsonProperty(JSON_PROPERTY_VM_ACTIVATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getVmActivation() {
    return vmActivation;
  }

  public void setVmActivation(String vmActivation) {
    this.vmActivation = vmActivation;
  }

  public ApplicationSecurityServiceAttributes vulnCriticalCount(Long vulnCriticalCount) {
    this.vulnCriticalCount = vulnCriticalCount;
    return this;
  }

  /**
   * Deprecated: the number of critical-severity vulnerabilities for the service.
   *
   * @return vulnCriticalCount
   * @deprecated
   */
  @Deprecated
  @JsonProperty(JSON_PROPERTY_VULN_CRITICAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVulnCriticalCount() {
    return vulnCriticalCount;
  }

  @Deprecated
  public void setVulnCriticalCount(Long vulnCriticalCount) {
    this.vulnCriticalCount = vulnCriticalCount;
  }

  public ApplicationSecurityServiceAttributes vulnHighCount(Long vulnHighCount) {
    this.vulnHighCount = vulnHighCount;
    return this;
  }

  /**
   * Deprecated: the number of high-severity vulnerabilities for the service.
   *
   * @return vulnHighCount
   * @deprecated
   */
  @Deprecated
  @JsonProperty(JSON_PROPERTY_VULN_HIGH_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVulnHighCount() {
    return vulnHighCount;
  }

  @Deprecated
  public void setVulnHighCount(Long vulnHighCount) {
    this.vulnHighCount = vulnHighCount;
  }

  public ApplicationSecurityServiceAttributes withoutFilterServices(Long withoutFilterServices) {
    this.withoutFilterServices = withoutFilterServices;
    return this;
  }

  /**
   * The total number of services available without applying the service filter.
   *
   * @return withoutFilterServices
   */
  @JsonProperty(JSON_PROPERTY_WITHOUT_FILTER_SERVICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getWithoutFilterServices() {
    return withoutFilterServices;
  }

  public void setWithoutFilterServices(Long withoutFilterServices) {
    this.withoutFilterServices = withoutFilterServices;
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
   * @return ApplicationSecurityServiceAttributes
   */
  @JsonAnySetter
  public ApplicationSecurityServiceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ApplicationSecurityServiceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSecurityServiceAttributes applicationSecurityServiceAttributes =
        (ApplicationSecurityServiceAttributes) o;
    return Objects.equals(this.agentVersions, applicationSecurityServiceAttributes.agentVersions)
        && Objects.equals(this.appType, applicationSecurityServiceAttributes.appType)
        && Objects.equals(
            this.asmThreatCompatible, applicationSecurityServiceAttributes.asmThreatCompatible)
        && Objects.equals(
            this.backendWafEventCount, applicationSecurityServiceAttributes.backendWafEventCount)
        && Objects.equals(this.businessLogic, applicationSecurityServiceAttributes.businessLogic)
        && Objects.equals(this.color, applicationSecurityServiceAttributes.color)
        && Objects.equals(this.env, applicationSecurityServiceAttributes.env)
        && Objects.equals(this.eventCount, applicationSecurityServiceAttributes.eventCount)
        && Objects.equals(this.eventTrend, applicationSecurityServiceAttributes.eventTrend)
        && Objects.equals(
            this.hasAppsecEnabled, applicationSecurityServiceAttributes.hasAppsecEnabled)
        && Objects.equals(this.hits, applicationSecurityServiceAttributes.hits)
        && Objects.equals(
            this.iastProductActivation, applicationSecurityServiceAttributes.iastProductActivation)
        && Objects.equals(
            this.iastProductCompatibility,
            applicationSecurityServiceAttributes.iastProductCompatibility)
        && Objects.equals(
            this.iastProductCompatibilityReasons,
            applicationSecurityServiceAttributes.iastProductCompatibilityReasons)
        && Objects.equals(this.languages, applicationSecurityServiceAttributes.languages)
        && Objects.equals(
            this.lastIngestedSpans, applicationSecurityServiceAttributes.lastIngestedSpans)
        && Objects.equals(this.rcCapabilities, applicationSecurityServiceAttributes.rcCapabilities)
        && Objects.equals(
            this.recommendedBusinessLogic,
            applicationSecurityServiceAttributes.recommendedBusinessLogic)
        && Objects.equals(
            this.riskProductActivation, applicationSecurityServiceAttributes.riskProductActivation)
        && Objects.equals(
            this.riskProductCompatibility,
            applicationSecurityServiceAttributes.riskProductCompatibility)
        && Objects.equals(
            this.riskProductCompatibilityReasons,
            applicationSecurityServiceAttributes.riskProductCompatibilityReasons)
        && Objects.equals(this.rulesVersion, applicationSecurityServiceAttributes.rulesVersion)
        && Objects.equals(this.service, applicationSecurityServiceAttributes.service)
        && Objects.equals(this.signalCount, applicationSecurityServiceAttributes.signalCount)
        && Objects.equals(this.signalTrend, applicationSecurityServiceAttributes.signalTrend)
        && Objects.equals(this.source, applicationSecurityServiceAttributes.source)
        && Objects.equals(this.teams, applicationSecurityServiceAttributes.teams)
        && Objects.equals(this.tracerVersions, applicationSecurityServiceAttributes.tracerVersions)
        && Objects.equals(this.vmActivation, applicationSecurityServiceAttributes.vmActivation)
        && Objects.equals(
            this.vulnCriticalCount, applicationSecurityServiceAttributes.vulnCriticalCount)
        && Objects.equals(this.vulnHighCount, applicationSecurityServiceAttributes.vulnHighCount)
        && Objects.equals(
            this.withoutFilterServices, applicationSecurityServiceAttributes.withoutFilterServices)
        && Objects.equals(
            this.additionalProperties, applicationSecurityServiceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agentVersions,
        appType,
        asmThreatCompatible,
        backendWafEventCount,
        businessLogic,
        color,
        env,
        eventCount,
        eventTrend,
        hasAppsecEnabled,
        hits,
        iastProductActivation,
        iastProductCompatibility,
        iastProductCompatibilityReasons,
        languages,
        lastIngestedSpans,
        rcCapabilities,
        recommendedBusinessLogic,
        riskProductActivation,
        riskProductCompatibility,
        riskProductCompatibilityReasons,
        rulesVersion,
        service,
        signalCount,
        signalTrend,
        source,
        teams,
        tracerVersions,
        vmActivation,
        vulnCriticalCount,
        vulnHighCount,
        withoutFilterServices,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSecurityServiceAttributes {\n");
    sb.append("    agentVersions: ").append(toIndentedString(agentVersions)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    asmThreatCompatible: ")
        .append(toIndentedString(asmThreatCompatible))
        .append("\n");
    sb.append("    backendWafEventCount: ")
        .append(toIndentedString(backendWafEventCount))
        .append("\n");
    sb.append("    businessLogic: ").append(toIndentedString(businessLogic)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    eventTrend: ").append(toIndentedString(eventTrend)).append("\n");
    sb.append("    hasAppsecEnabled: ").append(toIndentedString(hasAppsecEnabled)).append("\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
    sb.append("    iastProductActivation: ")
        .append(toIndentedString(iastProductActivation))
        .append("\n");
    sb.append("    iastProductCompatibility: ")
        .append(toIndentedString(iastProductCompatibility))
        .append("\n");
    sb.append("    iastProductCompatibilityReasons: ")
        .append(toIndentedString(iastProductCompatibilityReasons))
        .append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    lastIngestedSpans: ").append(toIndentedString(lastIngestedSpans)).append("\n");
    sb.append("    rcCapabilities: ").append(toIndentedString(rcCapabilities)).append("\n");
    sb.append("    recommendedBusinessLogic: ")
        .append(toIndentedString(recommendedBusinessLogic))
        .append("\n");
    sb.append("    riskProductActivation: ")
        .append(toIndentedString(riskProductActivation))
        .append("\n");
    sb.append("    riskProductCompatibility: ")
        .append(toIndentedString(riskProductCompatibility))
        .append("\n");
    sb.append("    riskProductCompatibilityReasons: ")
        .append(toIndentedString(riskProductCompatibilityReasons))
        .append("\n");
    sb.append("    rulesVersion: ").append(toIndentedString(rulesVersion)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    signalCount: ").append(toIndentedString(signalCount)).append("\n");
    sb.append("    signalTrend: ").append(toIndentedString(signalTrend)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    tracerVersions: ").append(toIndentedString(tracerVersions)).append("\n");
    sb.append("    vmActivation: ").append(toIndentedString(vmActivation)).append("\n");
    sb.append("    vulnCriticalCount: ").append(toIndentedString(vulnCriticalCount)).append("\n");
    sb.append("    vulnHighCount: ").append(toIndentedString(vulnHighCount)).append("\n");
    sb.append("    withoutFilterServices: ")
        .append(toIndentedString(withoutFilterServices))
        .append("\n");
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
