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
 * The enforcement tier of the policy. <code>DEFAULT</code> means the policy is set but member orgs
 * may mutate it. <code>ENFORCE</code> means the policy is strictly controlled and mutations are
 * blocked for affected orgs. <code>DELEGATE</code> means each member org controls its own value.
 */
@JsonSerialize(using = OrgGroupPolicyEnforcementTier.OrgGroupPolicyEnforcementTierSerializer.class)
public class OrgGroupPolicyEnforcementTier extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("DEFAULT", "ENFORCE", "DELEGATE"));

  public static final OrgGroupPolicyEnforcementTier DEFAULT =
      new OrgGroupPolicyEnforcementTier("DEFAULT");
  public static final OrgGroupPolicyEnforcementTier ENFORCE =
      new OrgGroupPolicyEnforcementTier("ENFORCE");
  public static final OrgGroupPolicyEnforcementTier DELEGATE =
      new OrgGroupPolicyEnforcementTier("DELEGATE");

  OrgGroupPolicyEnforcementTier(String value) {
    super(value, allowedValues);
  }

  public static class OrgGroupPolicyEnforcementTierSerializer
      extends StdSerializer<OrgGroupPolicyEnforcementTier> {
    public OrgGroupPolicyEnforcementTierSerializer(Class<OrgGroupPolicyEnforcementTier> t) {
      super(t);
    }

    public OrgGroupPolicyEnforcementTierSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OrgGroupPolicyEnforcementTier value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OrgGroupPolicyEnforcementTier fromValue(String value) {
    return new OrgGroupPolicyEnforcementTier(value);
  }
}
