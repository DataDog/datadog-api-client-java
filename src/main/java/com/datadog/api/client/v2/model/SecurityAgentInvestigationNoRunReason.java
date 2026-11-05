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
 * Why <code>filter[signal_id]</code> returned no investigation. Set only on the first page of an
 * empty result. The reason is based on the organization's current settings. Poll again only on
 * <code>investigation_not_started</code>, after the number of seconds in the <code>Retry-After
 * </code> header; treat the others as final for this signal. - <code>investigation_not_started
 * </code>: no investigation has started yet, but one may still start. - <code>not_investigated
 * </code>: no investigation started within an hour of the signal, so none is expected. The signal
 * was skipped for a reason this API doesn't report, such as its severity or a rate limit. - <code>
 * rule_not_enabled</code>: the signal's detection rule doesn't have Bits Security Analyst enabled,
 * so no investigation starts automatically. - <code>signal_not_found</code>: the ID isn't a signal
 * ID, or no signal with this ID exists in the organization. - <code>org_not_activated</code>: the
 * organization hasn't activated Bits Security Analyst.
 */
@JsonSerialize(
    using =
        SecurityAgentInvestigationNoRunReason.SecurityAgentInvestigationNoRunReasonSerializer.class)
public class SecurityAgentInvestigationNoRunReason extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "investigation_not_started",
              "not_investigated",
              "rule_not_enabled",
              "signal_not_found",
              "org_not_activated"));

  public static final SecurityAgentInvestigationNoRunReason INVESTIGATION_NOT_STARTED =
      new SecurityAgentInvestigationNoRunReason("investigation_not_started");
  public static final SecurityAgentInvestigationNoRunReason NOT_INVESTIGATED =
      new SecurityAgentInvestigationNoRunReason("not_investigated");
  public static final SecurityAgentInvestigationNoRunReason RULE_NOT_ENABLED =
      new SecurityAgentInvestigationNoRunReason("rule_not_enabled");
  public static final SecurityAgentInvestigationNoRunReason SIGNAL_NOT_FOUND =
      new SecurityAgentInvestigationNoRunReason("signal_not_found");
  public static final SecurityAgentInvestigationNoRunReason ORG_NOT_ACTIVATED =
      new SecurityAgentInvestigationNoRunReason("org_not_activated");

  SecurityAgentInvestigationNoRunReason(String value) {
    super(value, allowedValues);
  }

  public static class SecurityAgentInvestigationNoRunReasonSerializer
      extends StdSerializer<SecurityAgentInvestigationNoRunReason> {
    public SecurityAgentInvestigationNoRunReasonSerializer(
        Class<SecurityAgentInvestigationNoRunReason> t) {
      super(t);
    }

    public SecurityAgentInvestigationNoRunReasonSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityAgentInvestigationNoRunReason value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityAgentInvestigationNoRunReason fromValue(String value) {
    return new SecurityAgentInvestigationNoRunReason(value);
  }
}
