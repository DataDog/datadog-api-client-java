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
 * What snoozed the Page. Only set while the Page is snoozed, together with <code>release_at</code>.
 * <code>ack_timeout</code>: the acknowledgment timeout. <code>team_rules_active_hours</code>: the
 * Page was triggered outside of the active hours of the team's routing rules. <code>manual_snooze
 * </code>: a user snoozed the Page.
 */
@JsonSerialize(using = OnCallPageReleaseOrigin.OnCallPageReleaseOriginSerializer.class)
public class OnCallPageReleaseOrigin extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ack_timeout", "team_rules_active_hours", "manual_snooze"));

  public static final OnCallPageReleaseOrigin ACK_TIMEOUT =
      new OnCallPageReleaseOrigin("ack_timeout");
  public static final OnCallPageReleaseOrigin TEAM_RULES_ACTIVE_HOURS =
      new OnCallPageReleaseOrigin("team_rules_active_hours");
  public static final OnCallPageReleaseOrigin MANUAL_SNOOZE =
      new OnCallPageReleaseOrigin("manual_snooze");

  OnCallPageReleaseOrigin(String value) {
    super(value, allowedValues);
  }

  public static class OnCallPageReleaseOriginSerializer
      extends StdSerializer<OnCallPageReleaseOrigin> {
    public OnCallPageReleaseOriginSerializer(Class<OnCallPageReleaseOrigin> t) {
      super(t);
    }

    public OnCallPageReleaseOriginSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OnCallPageReleaseOrigin value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OnCallPageReleaseOrigin fromValue(String value) {
    return new OnCallPageReleaseOrigin(value);
  }
}
