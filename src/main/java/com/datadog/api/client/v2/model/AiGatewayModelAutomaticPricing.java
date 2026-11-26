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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The automatically synced published price. Present only when it is the effective price. */
@JsonPropertyOrder({
  AiGatewayModelAutomaticPricing.JSON_PROPERTY_LAST_VALIDATED_AT,
  AiGatewayModelAutomaticPricing.JSON_PROPERTY_MAPPING,
  AiGatewayModelAutomaticPricing.JSON_PROPERTY_MODE_TRIGGERS,
  AiGatewayModelAutomaticPricing.JSON_PROPERTY_OBSERVED_AT,
  AiGatewayModelAutomaticPricing.JSON_PROPERTY_RATES,
  AiGatewayModelAutomaticPricing.JSON_PROPERTY_SOURCE,
  AiGatewayModelAutomaticPricing.JSON_PROPERTY_STALE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelAutomaticPricing {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LAST_VALIDATED_AT = "last_validated_at";
  private OffsetDateTime lastValidatedAt;

  public static final String JSON_PROPERTY_MAPPING = "mapping";
  private AiGatewayModelAutomaticPricingMapping mapping;

  public static final String JSON_PROPERTY_MODE_TRIGGERS = "mode_triggers";
  private List<AiGatewayModelAutomaticPricingModeTrigger> modeTriggers = null;

  public static final String JSON_PROPERTY_OBSERVED_AT = "observed_at";
  private OffsetDateTime observedAt;

  public static final String JSON_PROPERTY_RATES = "rates";
  private List<AiGatewayModelAutomaticPricingRate> rates = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCE = "source";
  private AiGatewayModelAutomaticPricingSource source;

  public static final String JSON_PROPERTY_STALE = "stale";
  private Boolean stale;

  public AiGatewayModelAutomaticPricing() {}

  @JsonCreator
  public AiGatewayModelAutomaticPricing(
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_VALIDATED_AT)
          OffsetDateTime lastValidatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_OBSERVED_AT) OffsetDateTime observedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_RATES)
          List<AiGatewayModelAutomaticPricingRate> rates,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          AiGatewayModelAutomaticPricingSource source,
      @JsonProperty(required = true, value = JSON_PROPERTY_STALE) Boolean stale) {
    this.lastValidatedAt = lastValidatedAt;
    this.observedAt = observedAt;
    this.rates = rates;
    for (AiGatewayModelAutomaticPricingRate item : rates) {
      this.unparsed |= item.unparsed;
    }
    this.source = source;
    this.unparsed |= source.unparsed;
    this.stale = stale;
  }

  public AiGatewayModelAutomaticPricing lastValidatedAt(OffsetDateTime lastValidatedAt) {
    this.lastValidatedAt = lastValidatedAt;
    return this;
  }

  /**
   * Time the price was last revalidated against the source.
   *
   * @return lastValidatedAt
   */
  @JsonProperty(JSON_PROPERTY_LAST_VALIDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastValidatedAt() {
    return lastValidatedAt;
  }

  public void setLastValidatedAt(OffsetDateTime lastValidatedAt) {
    this.lastValidatedAt = lastValidatedAt;
  }

  public AiGatewayModelAutomaticPricing mapping(AiGatewayModelAutomaticPricingMapping mapping) {
    this.mapping = mapping;
    this.unparsed |= mapping.unparsed;
    return this;
  }

  /**
   * The reviewed endpoint mapping used to identify a custom provider. Omitted when the provider and
   * model identity matched exactly.
   *
   * @return mapping
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayModelAutomaticPricingMapping getMapping() {
    return mapping;
  }

  public void setMapping(AiGatewayModelAutomaticPricingMapping mapping) {
    this.mapping = mapping;
    if (mapping != null) {
      this.unparsed |= mapping.unparsed;
    }
  }

  public AiGatewayModelAutomaticPricing modeTriggers(
      List<AiGatewayModelAutomaticPricingModeTrigger> modeTriggers) {
    this.modeTriggers = modeTriggers;
    if (modeTriggers != null) {
      for (AiGatewayModelAutomaticPricingModeTrigger item : modeTriggers) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AiGatewayModelAutomaticPricing addModeTriggersItem(
      AiGatewayModelAutomaticPricingModeTrigger modeTriggersItem) {
    if (this.modeTriggers == null) {
      this.modeTriggers = new ArrayList<>();
    }
    this.modeTriggers.add(modeTriggersItem);
    this.unparsed |= modeTriggersItem.unparsed;
    return this;
  }

  /**
   * Request fields that select each priced mode, such as <code>speed: fast</code> for <code>
   * anthropic</code> models. Omitted when the model has a single mode.
   *
   * @return modeTriggers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE_TRIGGERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AiGatewayModelAutomaticPricingModeTrigger> getModeTriggers() {
    return modeTriggers;
  }

  public void setModeTriggers(List<AiGatewayModelAutomaticPricingModeTrigger> modeTriggers) {
    this.modeTriggers = modeTriggers;
    if (modeTriggers != null) {
      for (AiGatewayModelAutomaticPricingModeTrigger item : modeTriggers) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AiGatewayModelAutomaticPricing observedAt(OffsetDateTime observedAt) {
    this.observedAt = observedAt;
    return this;
  }

  /**
   * Time the price was observed in the source.
   *
   * @return observedAt
   */
  @JsonProperty(JSON_PROPERTY_OBSERVED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getObservedAt() {
    return observedAt;
  }

  public void setObservedAt(OffsetDateTime observedAt) {
    this.observedAt = observedAt;
  }

  public AiGatewayModelAutomaticPricing rates(List<AiGatewayModelAutomaticPricingRate> rates) {
    this.rates = rates;
    for (AiGatewayModelAutomaticPricingRate item : rates) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AiGatewayModelAutomaticPricing addRatesItem(AiGatewayModelAutomaticPricingRate ratesItem) {
    this.rates.add(ratesItem);
    this.unparsed |= ratesItem.unparsed;
    return this;
  }

  /**
   * Published rates.
   *
   * @return rates
   */
  @JsonProperty(JSON_PROPERTY_RATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AiGatewayModelAutomaticPricingRate> getRates() {
    return rates;
  }

  public void setRates(List<AiGatewayModelAutomaticPricingRate> rates) {
    this.rates = rates;
    if (rates != null) {
      for (AiGatewayModelAutomaticPricingRate item : rates) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AiGatewayModelAutomaticPricing source(AiGatewayModelAutomaticPricingSource source) {
    this.source = source;
    this.unparsed |= source.unparsed;
    return this;
  }

  /**
   * The pricing source entry the price was read from.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelAutomaticPricingSource getSource() {
    return source;
  }

  public void setSource(AiGatewayModelAutomaticPricingSource source) {
    this.source = source;
    if (source != null) {
      this.unparsed |= source.unparsed;
    }
  }

  public AiGatewayModelAutomaticPricing stale(Boolean stale) {
    this.stale = stale;
    return this;
  }

  /**
   * True when the price has not been revalidated recently and is being retained as last-known-good.
   *
   * @return stale
   */
  @JsonProperty(JSON_PROPERTY_STALE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getStale() {
    return stale;
  }

  public void setStale(Boolean stale) {
    this.stale = stale;
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
   * @return AiGatewayModelAutomaticPricing
   */
  @JsonAnySetter
  public AiGatewayModelAutomaticPricing putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelAutomaticPricing object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelAutomaticPricing aiGatewayModelAutomaticPricing =
        (AiGatewayModelAutomaticPricing) o;
    return Objects.equals(this.lastValidatedAt, aiGatewayModelAutomaticPricing.lastValidatedAt)
        && Objects.equals(this.mapping, aiGatewayModelAutomaticPricing.mapping)
        && Objects.equals(this.modeTriggers, aiGatewayModelAutomaticPricing.modeTriggers)
        && Objects.equals(this.observedAt, aiGatewayModelAutomaticPricing.observedAt)
        && Objects.equals(this.rates, aiGatewayModelAutomaticPricing.rates)
        && Objects.equals(this.source, aiGatewayModelAutomaticPricing.source)
        && Objects.equals(this.stale, aiGatewayModelAutomaticPricing.stale)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelAutomaticPricing.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lastValidatedAt,
        mapping,
        modeTriggers,
        observedAt,
        rates,
        source,
        stale,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelAutomaticPricing {\n");
    sb.append("    lastValidatedAt: ").append(toIndentedString(lastValidatedAt)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    modeTriggers: ").append(toIndentedString(modeTriggers)).append("\n");
    sb.append("    observedAt: ").append(toIndentedString(observedAt)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    stale: ").append(toIndentedString(stale)).append("\n");
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
