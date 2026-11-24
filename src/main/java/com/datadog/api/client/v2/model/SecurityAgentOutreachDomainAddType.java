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

/** Type of an allowed outreach domain add request. */
@JsonSerialize(
    using = SecurityAgentOutreachDomainAddType.SecurityAgentOutreachDomainAddTypeSerializer.class)
public class SecurityAgentOutreachDomainAddType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("outreach_policy_domain_add"));

  public static final SecurityAgentOutreachDomainAddType OUTREACH_POLICY_DOMAIN_ADD =
      new SecurityAgentOutreachDomainAddType("outreach_policy_domain_add");

  SecurityAgentOutreachDomainAddType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityAgentOutreachDomainAddTypeSerializer
      extends StdSerializer<SecurityAgentOutreachDomainAddType> {
    public SecurityAgentOutreachDomainAddTypeSerializer(
        Class<SecurityAgentOutreachDomainAddType> t) {
      super(t);
    }

    public SecurityAgentOutreachDomainAddTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityAgentOutreachDomainAddType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityAgentOutreachDomainAddType fromValue(String value) {
    return new SecurityAgentOutreachDomainAddType(value);
  }
}
