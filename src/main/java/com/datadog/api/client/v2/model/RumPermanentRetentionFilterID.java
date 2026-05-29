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

/** The identifier of a permanent RUM retention filter. */
@JsonSerialize(using = RumPermanentRetentionFilterID.RumPermanentRetentionFilterIDSerializer.class)
public class RumPermanentRetentionFilterID extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("rum_apm_flat_sampling", "synthetics_sessions", "forced_replay_sessions"));

  public static final RumPermanentRetentionFilterID RUM_APM_FLAT_SAMPLING =
      new RumPermanentRetentionFilterID("rum_apm_flat_sampling");
  public static final RumPermanentRetentionFilterID SYNTHETICS_SESSIONS =
      new RumPermanentRetentionFilterID("synthetics_sessions");
  public static final RumPermanentRetentionFilterID FORCED_REPLAY_SESSIONS =
      new RumPermanentRetentionFilterID("forced_replay_sessions");

  RumPermanentRetentionFilterID(String value) {
    super(value, allowedValues);
  }

  public static class RumPermanentRetentionFilterIDSerializer
      extends StdSerializer<RumPermanentRetentionFilterID> {
    public RumPermanentRetentionFilterIDSerializer(Class<RumPermanentRetentionFilterID> t) {
      super(t);
    }

    public RumPermanentRetentionFilterIDSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumPermanentRetentionFilterID value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumPermanentRetentionFilterID fromValue(String value) {
    return new RumPermanentRetentionFilterID(value);
  }
}
