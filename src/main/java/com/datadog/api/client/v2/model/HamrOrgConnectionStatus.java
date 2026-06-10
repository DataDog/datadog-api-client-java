/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Status of the HAMR connection: - 0: UNSPECIFIED - Connection status not specified - 1: ONBOARDING
 * - Initial setup of HAMR connection - 2: PASSIVE - Secondary organization in passive standby mode
 * - 3: FAILOVER - Liminal status between PASSIVE and ACTIVE - 4: ACTIVE - Organization is an active
 * failover - 5: RECOVERY - Recovery operation in progress
 */
@JsonSerialize(using = HamrOrgConnectionStatus.HamrOrgConnectionStatusSerializer.class)
public class HamrOrgConnectionStatus extends ModelEnum<Long> {

  private static final Set<Long> allowedValues =
      new HashSet<Long>(Arrays.asList(0l, 1l, 2l, 3l, 4l, 5l));

  public static final HamrOrgConnectionStatus UNSPECIFIED = new HamrOrgConnectionStatus(0l);
  public static final HamrOrgConnectionStatus ONBOARDING = new HamrOrgConnectionStatus(1l);
  public static final HamrOrgConnectionStatus PASSIVE = new HamrOrgConnectionStatus(2l);
  public static final HamrOrgConnectionStatus FAILOVER = new HamrOrgConnectionStatus(3l);
  public static final HamrOrgConnectionStatus ACTIVE = new HamrOrgConnectionStatus(4l);
  public static final HamrOrgConnectionStatus RECOVERY = new HamrOrgConnectionStatus(5l);

  HamrOrgConnectionStatus(Long value) {
    super(value, allowedValues);
  }

  public static class HamrOrgConnectionStatusSerializer
      extends StdSerializer<HamrOrgConnectionStatus> {
    public HamrOrgConnectionStatusSerializer(Class<HamrOrgConnectionStatus> t) {
      super(t);
    }

    public HamrOrgConnectionStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HamrOrgConnectionStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HamrOrgConnectionStatus fromValue(Long value) {
    return new HamrOrgConnectionStatus(value);
  }
}
