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
   * <p>The SIEM pricing model (SKU) for the organization</p>
 */
@JsonSerialize(using = SecurityMonitoringSKU.SecurityMonitoringSKUSerializer.class)
public class SecurityMonitoringSKU extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("per_gb_analyzed", "per_event_in_siem_index_2023", "add_on_2024"));

  public static final SecurityMonitoringSKU PER_GB_ANALYZED = new SecurityMonitoringSKU("per_gb_analyzed");
  public static final SecurityMonitoringSKU PER_EVENT_IN_SIEM_INDEX_2023 = new SecurityMonitoringSKU("per_event_in_siem_index_2023");
  public static final SecurityMonitoringSKU ADD_ON_2024 = new SecurityMonitoringSKU("add_on_2024");


  SecurityMonitoringSKU(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringSKUSerializer extends StdSerializer<SecurityMonitoringSKU> {
      public SecurityMonitoringSKUSerializer(Class<SecurityMonitoringSKU> t) {
          super(t);
      }

      public SecurityMonitoringSKUSerializer() {
          this(null);
      }

      @Override
      public void serialize(SecurityMonitoringSKU value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SecurityMonitoringSKU fromValue(String value) {
    return new SecurityMonitoringSKU(value);
  }
}
