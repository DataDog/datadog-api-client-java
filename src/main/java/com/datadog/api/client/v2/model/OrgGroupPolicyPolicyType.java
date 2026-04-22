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
 * The type of the policy. Only <code>org_config</code> is supported, indicating a policy backed by
 * an organization configuration setting.
 */
@JsonSerialize(using = OrgGroupPolicyPolicyType.OrgGroupPolicyPolicyTypeSerializer.class)
public class OrgGroupPolicyPolicyType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("org_config"));

  public static final OrgGroupPolicyPolicyType ORG_CONFIG =
      new OrgGroupPolicyPolicyType("org_config");

  OrgGroupPolicyPolicyType(String value) {
    super(value, allowedValues);
  }

  public static class OrgGroupPolicyPolicyTypeSerializer
      extends StdSerializer<OrgGroupPolicyPolicyType> {
    public OrgGroupPolicyPolicyTypeSerializer(Class<OrgGroupPolicyPolicyType> t) {
      super(t);
    }

    public OrgGroupPolicyPolicyTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OrgGroupPolicyPolicyType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OrgGroupPolicyPolicyType fromValue(String value) {
    return new OrgGroupPolicyPolicyType(value);
  }
}
