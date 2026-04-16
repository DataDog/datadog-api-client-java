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

/** An indicator of compromise with threat intelligence data. */
@JsonPropertyOrder({
  IoCIndicator.JSON_PROPERTY_AS_GEO,
  IoCIndicator.JSON_PROPERTY_AS_TYPE,
  IoCIndicator.JSON_PROPERTY_BENIGN_SOURCES,
  IoCIndicator.JSON_PROPERTY_CATEGORIES,
  IoCIndicator.JSON_PROPERTY_FIRST_SEEN,
  IoCIndicator.JSON_PROPERTY_ID,
  IoCIndicator.JSON_PROPERTY_INDICATOR,
  IoCIndicator.JSON_PROPERTY_INDICATOR_TYPE,
  IoCIndicator.JSON_PROPERTY_LAST_SEEN,
  IoCIndicator.JSON_PROPERTY_LOG_MATCHES,
  IoCIndicator.JSON_PROPERTY_M_AS_TYPE,
  IoCIndicator.JSON_PROPERTY_M_PERSISTENCE,
  IoCIndicator.JSON_PROPERTY_M_SIGNAL,
  IoCIndicator.JSON_PROPERTY_M_SOURCES,
  IoCIndicator.JSON_PROPERTY_MALICIOUS_SOURCES,
  IoCIndicator.JSON_PROPERTY_MAX_TRUST_SCORE,
  IoCIndicator.JSON_PROPERTY_SCORE,
  IoCIndicator.JSON_PROPERTY_SIGNAL_MATCHES,
  IoCIndicator.JSON_PROPERTY_SIGNAL_TIER,
  IoCIndicator.JSON_PROPERTY_SUSPICIOUS_SOURCES,
  IoCIndicator.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IoCIndicator {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AS_GEO = "as_geo";
  private IoCGeoLocation asGeo;

  public static final String JSON_PROPERTY_AS_TYPE = "as_type";
  private String asType;

  public static final String JSON_PROPERTY_BENIGN_SOURCES = "benign_sources";
  private JsonNullable<List<IoCSource>> benignSources = JsonNullable.<List<IoCSource>>undefined();

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<String> categories = null;

  public static final String JSON_PROPERTY_FIRST_SEEN = "first_seen";
  private OffsetDateTime firstSeen;

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

  public static final String JSON_PROPERTY_SIGNAL_MATCHES = "signal_matches";
  private Long signalMatches;

  public static final String JSON_PROPERTY_SIGNAL_TIER = "signal_tier";
  private Long signalTier;

  public static final String JSON_PROPERTY_SUSPICIOUS_SOURCES = "suspicious_sources";
  private JsonNullable<List<IoCSource>> suspiciousSources =
      JsonNullable.<List<IoCSource>>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public IoCIndicator asGeo(IoCGeoLocation asGeo) {
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

  public IoCIndicator asType(String asType) {
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

  public IoCIndicator benignSources(List<IoCSource> benignSources) {
    this.benignSources = JsonNullable.<List<IoCSource>>of(benignSources);
    return this;
  }

  public IoCIndicator addBenignSourcesItem(IoCSource benignSourcesItem) {
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

  public IoCIndicator categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public IoCIndicator addCategoriesItem(String categoriesItem) {
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

  public IoCIndicator firstSeen(OffsetDateTime firstSeen) {
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

  public IoCIndicator id(String id) {
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

  public IoCIndicator indicator(String indicator) {
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

  public IoCIndicator indicatorType(String indicatorType) {
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

  public IoCIndicator lastSeen(OffsetDateTime lastSeen) {
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

  public IoCIndicator logMatches(Long logMatches) {
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

  public IoCIndicator mAsType(IoCScoreEffect mAsType) {
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

  public IoCIndicator mPersistence(IoCScoreEffect mPersistence) {
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

  public IoCIndicator mSignal(IoCScoreEffect mSignal) {
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

  public IoCIndicator mSources(IoCScoreEffect mSources) {
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

  public IoCIndicator maliciousSources(List<IoCSource> maliciousSources) {
    this.maliciousSources = JsonNullable.<List<IoCSource>>of(maliciousSources);
    return this;
  }

  public IoCIndicator addMaliciousSourcesItem(IoCSource maliciousSourcesItem) {
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

  public IoCIndicator maxTrustScore(IoCScoreEffect maxTrustScore) {
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

  public IoCIndicator score(Double score) {
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

  public IoCIndicator signalMatches(Long signalMatches) {
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

  public IoCIndicator signalTier(Long signalTier) {
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

  public IoCIndicator suspiciousSources(List<IoCSource> suspiciousSources) {
    this.suspiciousSources = JsonNullable.<List<IoCSource>>of(suspiciousSources);
    return this;
  }

  public IoCIndicator addSuspiciousSourcesItem(IoCSource suspiciousSourcesItem) {
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

  public IoCIndicator tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public IoCIndicator addTagsItem(String tagsItem) {
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
   * @return IoCIndicator
   */
  @JsonAnySetter
  public IoCIndicator putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IoCIndicator object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoCIndicator ioCIndicator = (IoCIndicator) o;
    return Objects.equals(this.asGeo, ioCIndicator.asGeo)
        && Objects.equals(this.asType, ioCIndicator.asType)
        && Objects.equals(this.benignSources, ioCIndicator.benignSources)
        && Objects.equals(this.categories, ioCIndicator.categories)
        && Objects.equals(this.firstSeen, ioCIndicator.firstSeen)
        && Objects.equals(this.id, ioCIndicator.id)
        && Objects.equals(this.indicator, ioCIndicator.indicator)
        && Objects.equals(this.indicatorType, ioCIndicator.indicatorType)
        && Objects.equals(this.lastSeen, ioCIndicator.lastSeen)
        && Objects.equals(this.logMatches, ioCIndicator.logMatches)
        && Objects.equals(this.mAsType, ioCIndicator.mAsType)
        && Objects.equals(this.mPersistence, ioCIndicator.mPersistence)
        && Objects.equals(this.mSignal, ioCIndicator.mSignal)
        && Objects.equals(this.mSources, ioCIndicator.mSources)
        && Objects.equals(this.maliciousSources, ioCIndicator.maliciousSources)
        && Objects.equals(this.maxTrustScore, ioCIndicator.maxTrustScore)
        && Objects.equals(this.score, ioCIndicator.score)
        && Objects.equals(this.signalMatches, ioCIndicator.signalMatches)
        && Objects.equals(this.signalTier, ioCIndicator.signalTier)
        && Objects.equals(this.suspiciousSources, ioCIndicator.suspiciousSources)
        && Objects.equals(this.tags, ioCIndicator.tags)
        && Objects.equals(this.additionalProperties, ioCIndicator.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        asGeo,
        asType,
        benignSources,
        categories,
        firstSeen,
        id,
        indicator,
        indicatorType,
        lastSeen,
        logMatches,
        mAsType,
        mPersistence,
        mSignal,
        mSources,
        maliciousSources,
        maxTrustScore,
        score,
        signalMatches,
        signalTier,
        suspiciousSources,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoCIndicator {\n");
    sb.append("    asGeo: ").append(toIndentedString(asGeo)).append("\n");
    sb.append("    asType: ").append(toIndentedString(asType)).append("\n");
    sb.append("    benignSources: ").append(toIndentedString(benignSources)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    indicatorType: ").append(toIndentedString(indicatorType)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    logMatches: ").append(toIndentedString(logMatches)).append("\n");
    sb.append("    mAsType: ").append(toIndentedString(mAsType)).append("\n");
    sb.append("    mPersistence: ").append(toIndentedString(mPersistence)).append("\n");
    sb.append("    mSignal: ").append(toIndentedString(mSignal)).append("\n");
    sb.append("    mSources: ").append(toIndentedString(mSources)).append("\n");
    sb.append("    maliciousSources: ").append(toIndentedString(maliciousSources)).append("\n");
    sb.append("    maxTrustScore: ").append(toIndentedString(maxTrustScore)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    signalMatches: ").append(toIndentedString(signalMatches)).append("\n");
    sb.append("    signalTier: ").append(toIndentedString(signalTier)).append("\n");
    sb.append("    suspiciousSources: ").append(toIndentedString(suspiciousSources)).append("\n");
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
