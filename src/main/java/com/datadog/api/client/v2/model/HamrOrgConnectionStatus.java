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
   * <p>Status of the HAMR connection:
   * - 0: UNSPECIFIED - Connection status not specified
   * - 1: ONBOARDING - Initial setup of HAMR connection
   * - 2: PASSIVE - Secondary organization in passive standby mode
   * - 3: FAILOVER - Liminal status between PASSIVE and ACTIVE
   * - 4: ACTIVE - Organization is an active failover
   * - 5: RECOVERY - Recovery operation in progress</p>
 */
@JsonSerialize(using = HamrOrgConnectionStatus.HamrOrgConnectionStatusSerializer.class)
public class HamrOrgConnectionStatus extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));

  public static final HamrOrgConnectionStatus UNSPECIFIED = new HamrOrgConnectionStatus(0);
  public static final HamrOrgConnectionStatus ONBOARDING = new HamrOrgConnectionStatus(1);
  public static final HamrOrgConnectionStatus PASSIVE = new HamrOrgConnectionStatus(2);
  public static final HamrOrgConnectionStatus FAILOVER = new HamrOrgConnectionStatus(3);
  public static final HamrOrgConnectionStatus ACTIVE = new HamrOrgConnectionStatus(4);
  public static final HamrOrgConnectionStatus RECOVERY = new HamrOrgConnectionStatus(5);


  HamrOrgConnectionStatus(Integer value) {
    super(value, allowedValues);
  }

  public static class HamrOrgConnectionStatusSerializer extends StdSerializer<HamrOrgConnectionStatus> {
      public HamrOrgConnectionStatusSerializer(Class<HamrOrgConnectionStatus> t) {
          super(t);
      }

      public HamrOrgConnectionStatusSerializer() {
          this(null);
      }

      @Override
      public void serialize(HamrOrgConnectionStatus value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static HamrOrgConnectionStatus fromValue(Integer value) {
    return new HamrOrgConnectionStatus(value);
  }
}
