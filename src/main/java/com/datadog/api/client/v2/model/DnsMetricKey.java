/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>The metric key for DNS metrics.</p>
 */
@JsonSerialize(using = DnsMetricKey.DnsMetricKeySerializer.class)
public class DnsMetricKey extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("dns_total_requests", "dns_failures", "dns_successful_responses", "dns_failed_responses", "dns_timeouts", "dns_responses.nxdomain", "dns_responses.servfail", "dns_responses.other", "dns_success_latency_percentile", "dns_failure_latency_percentile"));

  public static final DnsMetricKey DNS_TOTAL_REQUESTS = new DnsMetricKey("dns_total_requests");
  public static final DnsMetricKey DNS_FAILURES = new DnsMetricKey("dns_failures");
  public static final DnsMetricKey DNS_SUCCESSFUL_RESPONSES = new DnsMetricKey("dns_successful_responses");
  public static final DnsMetricKey DNS_FAILED_RESPONSES = new DnsMetricKey("dns_failed_responses");
  public static final DnsMetricKey DNS_TIMEOUTS = new DnsMetricKey("dns_timeouts");
  public static final DnsMetricKey DNS_RESPONSES_NXDOMAIN = new DnsMetricKey("dns_responses.nxdomain");
  public static final DnsMetricKey DNS_RESPONSES_SERVFAIL = new DnsMetricKey("dns_responses.servfail");
  public static final DnsMetricKey DNS_RESPONSES_OTHER = new DnsMetricKey("dns_responses.other");
  public static final DnsMetricKey DNS_SUCCESS_LATENCY_PERCENTILE = new DnsMetricKey("dns_success_latency_percentile");
  public static final DnsMetricKey DNS_FAILURE_LATENCY_PERCENTILE = new DnsMetricKey("dns_failure_latency_percentile");


  DnsMetricKey(String value) {
    super(value, allowedValues);
  }

  public static class DnsMetricKeySerializer extends StdSerializer<DnsMetricKey> {
      public DnsMetricKeySerializer(Class<DnsMetricKey> t) {
          super(t);
      }

      public DnsMetricKeySerializer() {
          this(null);
      }

      @Override
      public void serialize(DnsMetricKey value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static DnsMetricKey fromValue(String value) {
    return new DnsMetricKey(value);
  }
}
