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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** An indicator of compromise with extended context from your environment. */
@JsonPropertyOrder({
  IoCIndicatorDetailed.JSON_PROPERTY_ADDITIONAL_DATA,
  IoCIndicatorDetailed.JSON_PROPERTY_AS_CIDR_BLOCK,
  IoCIndicatorDetailed.JSON_PROPERTY_AS_GEO,
  IoCIndicatorDetailed.JSON_PROPERTY_AS_NUMBER,
  IoCIndicatorDetailed.JSON_PROPERTY_AS_ORGANIZATION,
  IoCIndicatorDetailed.JSON_PROPERTY_AS_TYPE,
  IoCIndicatorDetailed.JSON_PROPERTY_BENIGN_SOURCES,
  IoCIndicatorDetailed.JSON_PROPERTY_CATEGORIES,
  IoCIndicatorDetailed.JSON_PROPERTY_CRITICAL_ASSETS,
  IoCIndicatorDetailed.JSON_PROPERTY_FIRST_SEEN,
  IoCIndicatorDetailed.JSON_PROPERTY_HOSTS,
  IoCIndicatorDetailed.JSON_PROPERTY_ID,
  IoCIndicatorDetailed.JSON_PROPERTY_INDICATOR,
  IoCIndicatorDetailed.JSON_PROPERTY_INDICATOR_TYPE,
  IoCIndicatorDetailed.JSON_PROPERTY_LAST_SEEN,
  IoCIndicatorDetailed.JSON_PROPERTY_LOG_MATCHES,
  IoCIndicatorDetailed.JSON_PROPERTY_LOG_SOURCES,
  IoCIndicatorDetailed.JSON_PROPERTY_M_AS_TYPE,
  IoCIndicatorDetailed.JSON_PROPERTY_M_PERSISTENCE,
  IoCIndicatorDetailed.JSON_PROPERTY_M_SIGNAL,
  IoCIndicatorDetailed.JSON_PROPERTY_M_SOURCES,
  IoCIndicatorDetailed.JSON_PROPERTY_MALICIOUS_SOURCES,
  IoCIndicatorDetailed.JSON_PROPERTY_MAX_TRUST_SCORE,
  IoCIndicatorDetailed.JSON_PROPERTY_SCORE,
  IoCIndicatorDetailed.JSON_PROPERTY_SERVICES,
  IoCIndicatorDetailed.JSON_PROPERTY_SIGNAL_MATCHES,
  IoCIndicatorDetailed.JSON_PROPERTY_SIGNAL_SEVERITY,
  IoCIndicatorDetailed.JSON_PROPERTY_SIGNAL_TIER,
  IoCIndicatorDetailed.JSON_PROPERTY_SUSPICIOUS_SOURCES,
  IoCIndicatorDetailed.JSON_PROPERTY_TAGS,
  IoCIndicatorDetailed.JSON_PROPERTY_USERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IoCIndicatorDetailed {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additional_data";
  private Map<String, Object> additionalData = null;

  public static final String JSON_PROPERTY_AS_CIDR_BLOCK = "as_cidr_block";
  private String asCidrBlock;

  public static final String JSON_PROPERTY_AS_GEO = "as_geo";
  private IoCGeoLocation asGeo;

  public static final String JSON_PROPERTY_AS_NUMBER = "as_number";
  private String asNumber;

  public static final String JSON_PROPERTY_AS_ORGANIZATION = "as_organization";
  private String asOrganization;

  public static final String JSON_PROPERTY_AS_TYPE = "as_type";
  private String asType;

  public static final String JSON_PROPERTY_BENIGN_SOURCES = "benign_sources";
  private JsonNullable<List<IoCSource>> benignSources = JsonNullable.<List<IoCSource>>undefined();

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<String> categories = null;

  public static final String JSON_PROPERTY_CRITICAL_ASSETS = "critical_assets";
  private List<String> criticalAssets = null;

  public static final String JSON_PROPERTY_FIRST_SEEN = "first_seen";
  private OffsetDateTime firstSeen;

  public static final String JSON_PROPERTY_HOSTS = "hosts";
  private List<String> hosts = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INDICATOR = "indicator";
  private String indicator;

  public static final String JSON_PROPERTY_INDICATOR_TYPE = "indicator_type";
  private String indicatorType;

  public static final String JSON_PROPERTY_LAST_SEEN = "last_seen";
  private OffsetDateTime lastSeen;

  public static final String JSON_PROPERTY_LOG_MATCHES = "log_matches";
  private Long logMatches;

  public static final String JSON_PROPERTY_LOG_SOURCES = "log_sources";
  private List<String> logSources = null;

  public static final String JSON_PROPERTY_M_AS_TYPE = "m_as_type";
  private IoCScoreEffect mAsType;

  public static final String JSON_PROPERTY_M_PERSISTENCE = "m_persistence";
  private IoCScoreEffect mPersistence;

  public static final String JSON_PROPERTY_M_SIGNAL = "m_signal";
  private IoCScoreEffect mSignal;

  public static final String JSON_PROPERTY_M_SOURCES = "m_sources";
  private IoCScoreEffect mSources;

  public static final String JSON_PROPERTY_MALICIOUS_SOURCES = "malicious_sources";
  private JsonNullable<List<IoCSource>> maliciousSources =
      JsonNullable.<List<IoCSource>>undefined();

  public static final String JSON_PROPERTY_MAX_TRUST_SCORE = "max_trust_score";
  private IoCScoreEffect maxTrustScore;

  public static final String JSON_PROPERTY_SCORE = "score";
  private Double score;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<String> services = null;

  public static final String JSON_PROPERTY_SIGNAL_MATCHES = "signal_matches";
  private Long signalMatches;

  public static final String JSON_PROPERTY_SIGNAL_SEVERITY = "signal_severity";
  private List<IoCSignalSeverityCount> signalSeverity = null;

  public static final String JSON_PROPERTY_SIGNAL_TIER = "signal_tier";
  private Long signalTier;

  public static final String JSON_PROPERTY_SUSPICIOUS_SOURCES = "suspicious_sources";
  private JsonNullable<List<IoCSource>> suspiciousSources =
      JsonNullable.<List<IoCSource>>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_USERS = "users";
  private Map<String, List<String>> users = null;

  public IoCIndicatorDetailed additionalData(Map<String, Object> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public IoCIndicatorDetailed putAdditionalDataItem(String key, Object additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

  /**
   * Additional domain-specific context from threat intelligence sources.
   *
   * @return additionalData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(Map<String, Object> additionalData) {
    this.additionalData = additionalData;
  }

  public IoCIndicatorDetailed asCidrBlock(String asCidrBlock) {
    this.asCidrBlock = asCidrBlock;
    return this;
  }

  /**
   * Autonomous system CIDR block.
   *
   * @return asCidrBlock
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AS_CIDR_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAsCidrBlock() {
    return asCidrBlock;
  }

  public void setAsCidrBlock(String asCidrBlock) {
    this.asCidrBlock = asCidrBlock;
  }

  public IoCIndicatorDetailed asGeo(IoCGeoLocation asGeo) {
    this.asGeo = asGeo;
    this.unparsed |= asGeo.unparsed;
    return this;
  }

  /**
   * Geographic location information for an IP indicator.
   *
   * @return asGeo
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AS_GEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IoCGeoLocation getAsGeo() {
    return asGeo;
  }

  public void setAsGeo(IoCGeoLocation asGeo) {
    this.asGeo = asGeo;
  }

  public IoCIndicatorDetailed asNumber(String asNumber) {
    this.asNumber = asNumber;
    return this;
  }

  /**
   * Autonomous system number.
   *
   * @return asNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AS_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAsNumber() {
    return asNumber;
  }

  public void setAsNumber(String asNumber) {
    this.asNumber = asNumber;
  }

  public IoCIndicatorDetailed asOrganization(String asOrganization) {
    this.asOrganization = asOrganization;
    return this;
  }

  /**
   * Autonomous system organization name.
   *
   * @return asOrganization
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AS_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAsOrganization() {
    return asOrganization;
  }

  public void setAsOrganization(String asOrganization) {
    this.asOrganization = asOrganization;
  }

  public IoCIndicatorDetailed asType(String asType) {
    this.asType = asType;
    return this;
  }

  /**
   * Autonomous system type.
   *
   * @return asType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAsType() {
    return asType;
  }

  public void setAsType(String asType) {
    this.asType = asType;
  }

  public IoCIndicatorDetailed benignSources(List<IoCSource> benignSources) {
    this.benignSources = JsonNullable.<List<IoCSource>>of(benignSources);
    return this;
  }

  public IoCIndicatorDetailed addBenignSourcesItem(IoCSource benignSourcesItem) {
    if (this.benignSources == null || !this.benignSources.isPresent()) {
      this.benignSources = JsonNullable.<List<IoCSource>>of(new ArrayList<>());
    }
    try {
      this.benignSources.get().add(benignSourcesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Threat intelligence sources that flagged this indicator as benign.
   *
   * @return benignSources
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<IoCSource> getBenignSources() {
    return benignSources.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BENIGN_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<IoCSource>> getBenignSources_JsonNullable() {
    return benignSources;
  }

  @JsonProperty(JSON_PROPERTY_BENIGN_SOURCES)
  public void setBenignSources_JsonNullable(JsonNullable<List<IoCSource>> benignSources) {
    this.benignSources = benignSources;
  }

  public void setBenignSources(List<IoCSource> benignSources) {
    this.benignSources = JsonNullable.<List<IoCSource>>of(benignSources);
  }

  public IoCIndicatorDetailed categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public IoCIndicatorDetailed addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Threat categories associated with the indicator.
   *
   * @return categories
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public IoCIndicatorDetailed criticalAssets(List<String> criticalAssets) {
    this.criticalAssets = criticalAssets;
    return this;
  }

  public IoCIndicatorDetailed addCriticalAssetsItem(String criticalAssetsItem) {
    if (this.criticalAssets == null) {
      this.criticalAssets = new ArrayList<>();
    }
    this.criticalAssets.add(criticalAssetsItem);
    return this;
  }

  /**
   * Critical assets associated with this indicator.
   *
   * @return criticalAssets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRITICAL_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCriticalAssets() {
    return criticalAssets;
  }

  public void setCriticalAssets(List<String> criticalAssets) {
    this.criticalAssets = criticalAssets;
  }

  public IoCIndicatorDetailed firstSeen(OffsetDateTime firstSeen) {
    this.firstSeen = firstSeen;
    return this;
  }

  /**
   * Timestamp when the indicator was first seen.
   *
   * @return firstSeen
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getFirstSeen() {
    return firstSeen;
  }

  public void setFirstSeen(OffsetDateTime firstSeen) {
    this.firstSeen = firstSeen;
  }

  public IoCIndicatorDetailed hosts(List<String> hosts) {
    this.hosts = hosts;
    return this;
  }

  public IoCIndicatorDetailed addHostsItem(String hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

  /**
   * Hosts associated with this indicator.
   *
   * @return hosts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getHosts() {
    return hosts;
  }

  public void setHosts(List<String> hosts) {
    this.hosts = hosts;
  }

  public IoCIndicatorDetailed id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the indicator.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IoCIndicatorDetailed indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * The indicator value (for example, an IP address or domain).
   *
   * @return indicator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public IoCIndicatorDetailed indicatorType(String indicatorType) {
    this.indicatorType = indicatorType;
    return this;
  }

  /**
   * Type of indicator (for example, IP address or domain).
   *
   * @return indicatorType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDICATOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIndicatorType() {
    return indicatorType;
  }

  public void setIndicatorType(String indicatorType) {
    this.indicatorType = indicatorType;
  }

  public IoCIndicatorDetailed lastSeen(OffsetDateTime lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

  /**
   * Timestamp when the indicator was last seen.
   *
   * @return lastSeen
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(OffsetDateTime lastSeen) {
    this.lastSeen = lastSeen;
  }

  public IoCIndicatorDetailed logMatches(Long logMatches) {
    this.logMatches = logMatches;
    return this;
  }

  /**
   * Number of logs that matched this indicator.
   *
   * @return logMatches
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOG_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLogMatches() {
    return logMatches;
  }

  public void setLogMatches(Long logMatches) {
    this.logMatches = logMatches;
  }

  public IoCIndicatorDetailed logSources(List<String> logSources) {
    this.logSources = logSources;
    return this;
  }

  public IoCIndicatorDetailed addLogSourcesItem(String logSourcesItem) {
    if (this.logSources == null) {
      this.logSources = new ArrayList<>();
    }
    this.logSources.add(logSourcesItem);
    return this;
  }

  /**
   * Log sources where this indicator was observed.
   *
   * @return logSources
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOG_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getLogSources() {
    return logSources;
  }

  public void setLogSources(List<String> logSources) {
    this.logSources = logSources;
  }

  public IoCIndicatorDetailed mAsType(IoCScoreEffect mAsType) {
    this.mAsType = mAsType;
    this.unparsed |= !mAsType.isValid();
    return this;
  }

  /**
   * Effect of a scoring factor on the indicator's threat score.
   *
   * @return mAsType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_M_AS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IoCScoreEffect getMAsType() {
    return mAsType;
  }

  public void setMAsType(IoCScoreEffect mAsType) {
    if (!mAsType.isValid()) {
      this.unparsed = true;
    }
    this.mAsType = mAsType;
  }

  public IoCIndicatorDetailed mPersistence(IoCScoreEffect mPersistence) {
    this.mPersistence = mPersistence;
    this.unparsed |= !mPersistence.isValid();
    return this;
  }

  /**
   * Effect of a scoring factor on the indicator's threat score.
   *
   * @return mPersistence
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_M_PERSISTENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IoCScoreEffect getMPersistence() {
    return mPersistence;
  }

  public void setMPersistence(IoCScoreEffect mPersistence) {
    if (!mPersistence.isValid()) {
      this.unparsed = true;
    }
    this.mPersistence = mPersistence;
  }

  public IoCIndicatorDetailed mSignal(IoCScoreEffect mSignal) {
    this.mSignal = mSignal;
    this.unparsed |= !mSignal.isValid();
    return this;
  }

  /**
   * Effect of a scoring factor on the indicator's threat score.
   *
   * @return mSignal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_M_SIGNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IoCScoreEffect getMSignal() {
    return mSignal;
  }

  public void setMSignal(IoCScoreEffect mSignal) {
    if (!mSignal.isValid()) {
      this.unparsed = true;
    }
    this.mSignal = mSignal;
  }

  public IoCIndicatorDetailed mSources(IoCScoreEffect mSources) {
    this.mSources = mSources;
    this.unparsed |= !mSources.isValid();
    return this;
  }

  /**
   * Effect of a scoring factor on the indicator's threat score.
   *
   * @return mSources
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_M_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IoCScoreEffect getMSources() {
    return mSources;
  }

  public void setMSources(IoCScoreEffect mSources) {
    if (!mSources.isValid()) {
      this.unparsed = true;
    }
    this.mSources = mSources;
  }

  public IoCIndicatorDetailed maliciousSources(List<IoCSource> maliciousSources) {
    this.maliciousSources = JsonNullable.<List<IoCSource>>of(maliciousSources);
    return this;
  }

  public IoCIndicatorDetailed addMaliciousSourcesItem(IoCSource maliciousSourcesItem) {
    if (this.maliciousSources == null || !this.maliciousSources.isPresent()) {
      this.maliciousSources = JsonNullable.<List<IoCSource>>of(new ArrayList<>());
    }
    try {
      this.maliciousSources.get().add(maliciousSourcesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Threat intelligence sources that flagged this indicator as malicious.
   *
   * @return maliciousSources
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<IoCSource> getMaliciousSources() {
    return maliciousSources.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MALICIOUS_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<IoCSource>> getMaliciousSources_JsonNullable() {
    return maliciousSources;
  }

  @JsonProperty(JSON_PROPERTY_MALICIOUS_SOURCES)
  public void setMaliciousSources_JsonNullable(JsonNullable<List<IoCSource>> maliciousSources) {
    this.maliciousSources = maliciousSources;
  }

  public void setMaliciousSources(List<IoCSource> maliciousSources) {
    this.maliciousSources = JsonNullable.<List<IoCSource>>of(maliciousSources);
  }

  public IoCIndicatorDetailed maxTrustScore(IoCScoreEffect maxTrustScore) {
    this.maxTrustScore = maxTrustScore;
    this.unparsed |= !maxTrustScore.isValid();
    return this;
  }

  /**
   * Effect of a scoring factor on the indicator's threat score.
   *
   * @return maxTrustScore
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_TRUST_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IoCScoreEffect getMaxTrustScore() {
    return maxTrustScore;
  }

  public void setMaxTrustScore(IoCScoreEffect maxTrustScore) {
    if (!maxTrustScore.isValid()) {
      this.unparsed = true;
    }
    this.maxTrustScore = maxTrustScore;
  }

  public IoCIndicatorDetailed score(Double score) {
    this.score = score;
    return this;
  }

  /**
   * Threat score for the indicator (0-100).
   *
   * @return score
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public IoCIndicatorDetailed services(List<String> services) {
    this.services = services;
    return this;
  }

  public IoCIndicatorDetailed addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Services where this indicator was observed.
   *
   * @return services
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }

  public IoCIndicatorDetailed signalMatches(Long signalMatches) {
    this.signalMatches = signalMatches;
    return this;
  }

  /**
   * Number of security signals that matched this indicator.
   *
   * @return signalMatches
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNAL_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSignalMatches() {
    return signalMatches;
  }

  public void setSignalMatches(Long signalMatches) {
    this.signalMatches = signalMatches;
  }

  public IoCIndicatorDetailed signalSeverity(List<IoCSignalSeverityCount> signalSeverity) {
    this.signalSeverity = signalSeverity;
    for (IoCSignalSeverityCount item : signalSeverity) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IoCIndicatorDetailed addSignalSeverityItem(IoCSignalSeverityCount signalSeverityItem) {
    if (this.signalSeverity == null) {
      this.signalSeverity = new ArrayList<>();
    }
    this.signalSeverity.add(signalSeverityItem);
    this.unparsed |= signalSeverityItem.unparsed;
    return this;
  }

  /**
   * Breakdown of security signals by severity.
   *
   * @return signalSeverity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNAL_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IoCSignalSeverityCount> getSignalSeverity() {
    return signalSeverity;
  }

  public void setSignalSeverity(List<IoCSignalSeverityCount> signalSeverity) {
    this.signalSeverity = signalSeverity;
  }

  public IoCIndicatorDetailed signalTier(Long signalTier) {
    this.signalTier = signalTier;
    return this;
  }

  /**
   * Signal tier level.
   *
   * @return signalTier
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNAL_TIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSignalTier() {
    return signalTier;
  }

  public void setSignalTier(Long signalTier) {
    this.signalTier = signalTier;
  }

  public IoCIndicatorDetailed suspiciousSources(List<IoCSource> suspiciousSources) {
    this.suspiciousSources = JsonNullable.<List<IoCSource>>of(suspiciousSources);
    return this;
  }

  public IoCIndicatorDetailed addSuspiciousSourcesItem(IoCSource suspiciousSourcesItem) {
    if (this.suspiciousSources == null || !this.suspiciousSources.isPresent()) {
      this.suspiciousSources = JsonNullable.<List<IoCSource>>of(new ArrayList<>());
    }
    try {
      this.suspiciousSources.get().add(suspiciousSourcesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Threat intelligence sources that flagged this indicator as suspicious.
   *
   * @return suspiciousSources
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<IoCSource> getSuspiciousSources() {
    return suspiciousSources.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUSPICIOUS_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<IoCSource>> getSuspiciousSources_JsonNullable() {
    return suspiciousSources;
  }

  @JsonProperty(JSON_PROPERTY_SUSPICIOUS_SOURCES)
  public void setSuspiciousSources_JsonNullable(JsonNullable<List<IoCSource>> suspiciousSources) {
    this.suspiciousSources = suspiciousSources;
  }

  public void setSuspiciousSources(List<IoCSource> suspiciousSources) {
    this.suspiciousSources = JsonNullable.<List<IoCSource>>of(suspiciousSources);
  }

  public IoCIndicatorDetailed tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public IoCIndicatorDetailed addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the indicator.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public IoCIndicatorDetailed users(Map<String, List<String>> users) {
    this.users = users;
    return this;
  }

  public IoCIndicatorDetailed putUsersItem(String key, List<String> usersItem) {
    if (this.users == null) {
      this.users = new HashMap<>();
    }
    this.users.put(key, usersItem);
    return this;
  }

  /**
   * Users associated with this indicator, grouped by category.
   *
   * @return users
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, List<String>> getUsers() {
    return users;
  }

  public void setUsers(Map<String, List<String>> users) {
    this.users = users;
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
   * @return IoCIndicatorDetailed
   */
  @JsonAnySetter
  public IoCIndicatorDetailed putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IoCIndicatorDetailed object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoCIndicatorDetailed ioCIndicatorDetailed = (IoCIndicatorDetailed) o;
    return Objects.equals(this.additionalData, ioCIndicatorDetailed.additionalData)
        && Objects.equals(this.asCidrBlock, ioCIndicatorDetailed.asCidrBlock)
        && Objects.equals(this.asGeo, ioCIndicatorDetailed.asGeo)
        && Objects.equals(this.asNumber, ioCIndicatorDetailed.asNumber)
        && Objects.equals(this.asOrganization, ioCIndicatorDetailed.asOrganization)
        && Objects.equals(this.asType, ioCIndicatorDetailed.asType)
        && Objects.equals(this.benignSources, ioCIndicatorDetailed.benignSources)
        && Objects.equals(this.categories, ioCIndicatorDetailed.categories)
        && Objects.equals(this.criticalAssets, ioCIndicatorDetailed.criticalAssets)
        && Objects.equals(this.firstSeen, ioCIndicatorDetailed.firstSeen)
        && Objects.equals(this.hosts, ioCIndicatorDetailed.hosts)
        && Objects.equals(this.id, ioCIndicatorDetailed.id)
        && Objects.equals(this.indicator, ioCIndicatorDetailed.indicator)
        && Objects.equals(this.indicatorType, ioCIndicatorDetailed.indicatorType)
        && Objects.equals(this.lastSeen, ioCIndicatorDetailed.lastSeen)
        && Objects.equals(this.logMatches, ioCIndicatorDetailed.logMatches)
        && Objects.equals(this.logSources, ioCIndicatorDetailed.logSources)
        && Objects.equals(this.mAsType, ioCIndicatorDetailed.mAsType)
        && Objects.equals(this.mPersistence, ioCIndicatorDetailed.mPersistence)
        && Objects.equals(this.mSignal, ioCIndicatorDetailed.mSignal)
        && Objects.equals(this.mSources, ioCIndicatorDetailed.mSources)
        && Objects.equals(this.maliciousSources, ioCIndicatorDetailed.maliciousSources)
        && Objects.equals(this.maxTrustScore, ioCIndicatorDetailed.maxTrustScore)
        && Objects.equals(this.score, ioCIndicatorDetailed.score)
        && Objects.equals(this.services, ioCIndicatorDetailed.services)
        && Objects.equals(this.signalMatches, ioCIndicatorDetailed.signalMatches)
        && Objects.equals(this.signalSeverity, ioCIndicatorDetailed.signalSeverity)
        && Objects.equals(this.signalTier, ioCIndicatorDetailed.signalTier)
        && Objects.equals(this.suspiciousSources, ioCIndicatorDetailed.suspiciousSources)
        && Objects.equals(this.tags, ioCIndicatorDetailed.tags)
        && Objects.equals(this.users, ioCIndicatorDetailed.users)
        && Objects.equals(this.additionalProperties, ioCIndicatorDetailed.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalData,
        asCidrBlock,
        asGeo,
        asNumber,
        asOrganization,
        asType,
        benignSources,
        categories,
        criticalAssets,
        firstSeen,
        hosts,
        id,
        indicator,
        indicatorType,
        lastSeen,
        logMatches,
        logSources,
        mAsType,
        mPersistence,
        mSignal,
        mSources,
        maliciousSources,
        maxTrustScore,
        score,
        services,
        signalMatches,
        signalSeverity,
        signalTier,
        suspiciousSources,
        tags,
        users,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoCIndicatorDetailed {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    asCidrBlock: ").append(toIndentedString(asCidrBlock)).append("\n");
    sb.append("    asGeo: ").append(toIndentedString(asGeo)).append("\n");
    sb.append("    asNumber: ").append(toIndentedString(asNumber)).append("\n");
    sb.append("    asOrganization: ").append(toIndentedString(asOrganization)).append("\n");
    sb.append("    asType: ").append(toIndentedString(asType)).append("\n");
    sb.append("    benignSources: ").append(toIndentedString(benignSources)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    criticalAssets: ").append(toIndentedString(criticalAssets)).append("\n");
    sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    indicatorType: ").append(toIndentedString(indicatorType)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    logMatches: ").append(toIndentedString(logMatches)).append("\n");
    sb.append("    logSources: ").append(toIndentedString(logSources)).append("\n");
    sb.append("    mAsType: ").append(toIndentedString(mAsType)).append("\n");
    sb.append("    mPersistence: ").append(toIndentedString(mPersistence)).append("\n");
    sb.append("    mSignal: ").append(toIndentedString(mSignal)).append("\n");
    sb.append("    mSources: ").append(toIndentedString(mSources)).append("\n");
    sb.append("    maliciousSources: ").append(toIndentedString(maliciousSources)).append("\n");
    sb.append("    maxTrustScore: ").append(toIndentedString(maxTrustScore)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    signalMatches: ").append(toIndentedString(signalMatches)).append("\n");
    sb.append("    signalSeverity: ").append(toIndentedString(signalSeverity)).append("\n");
    sb.append("    signalTier: ").append(toIndentedString(signalTier)).append("\n");
    sb.append("    suspiciousSources: ").append(toIndentedString(suspiciousSources)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
