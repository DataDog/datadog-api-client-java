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
@JsonSerialize(using = RUMPermanentRetentionFilterID.RUMPermanentRetentionFilterIDSerializer.class)
public class RUMPermanentRetentionFilterID extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("rum_apm_flat_sampling", "synthetics_sessions", "forced_replay_sessions"));

  public static final RUMPermanentRetentionFilterID RUM_APM_FLAT_SAMPLING =
      new RUMPermanentRetentionFilterID("rum_apm_flat_sampling");
  public static final RUMPermanentRetentionFilterID SYNTHETICS_SESSIONS =
      new RUMPermanentRetentionFilterID("synthetics_sessions");
  public static final RUMPermanentRetentionFilterID FORCED_REPLAY_SESSIONS =
      new RUMPermanentRetentionFilterID("forced_replay_sessions");

  RUMPermanentRetentionFilterID(String value) {
    super(value, allowedValues);
  }

  public static class RUMPermanentRetentionFilterIDSerializer
      extends StdSerializer<RUMPermanentRetentionFilterID> {
    public RUMPermanentRetentionFilterIDSerializer(Class<RUMPermanentRetentionFilterID> t) {
      super(t);
    }

    public RUMPermanentRetentionFilterIDSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMPermanentRetentionFilterID value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMPermanentRetentionFilterID fromValue(String value) {
    return new RUMPermanentRetentionFilterID(value);
  }
}
