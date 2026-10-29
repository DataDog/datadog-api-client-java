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
 * The type of input to generate the proposed rule from: <code>natural_language</code> for a
 * plain-English description of the behavior to detect, <code>spl</code> for a Splunk SPL search or
 * saved search definition, or <code>kql</code> for a Microsoft KQL query. SPL inputs must be
 * self-contained, with search macros expanded.
 */
@JsonSerialize(
    using =
        SecurityMonitoringRuleProposalInputType.SecurityMonitoringRuleProposalInputTypeSerializer
            .class)
public class SecurityMonitoringRuleProposalInputType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("natural_language", "spl", "kql"));

  public static final SecurityMonitoringRuleProposalInputType NATURAL_LANGUAGE =
      new SecurityMonitoringRuleProposalInputType("natural_language");
  public static final SecurityMonitoringRuleProposalInputType SPL =
      new SecurityMonitoringRuleProposalInputType("spl");
  public static final SecurityMonitoringRuleProposalInputType KQL =
      new SecurityMonitoringRuleProposalInputType("kql");

  SecurityMonitoringRuleProposalInputType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleProposalInputTypeSerializer
      extends StdSerializer<SecurityMonitoringRuleProposalInputType> {
    public SecurityMonitoringRuleProposalInputTypeSerializer(
        Class<SecurityMonitoringRuleProposalInputType> t) {
      super(t);
    }

    public SecurityMonitoringRuleProposalInputTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleProposalInputType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringRuleProposalInputType fromValue(String value) {
    return new SecurityMonitoringRuleProposalInputType(value);
  }
}
