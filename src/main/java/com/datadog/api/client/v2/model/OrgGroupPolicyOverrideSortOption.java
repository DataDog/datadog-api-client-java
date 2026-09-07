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

/** Field to sort overrides by. */
@JsonSerialize(
    using = OrgGroupPolicyOverrideSortOption.OrgGroupPolicyOverrideSortOptionSerializer.class)
public class OrgGroupPolicyOverrideSortOption extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("id", "-id", "org_uuid", "-org_uuid"));

  public static final OrgGroupPolicyOverrideSortOption ID =
      new OrgGroupPolicyOverrideSortOption("id");
  public static final OrgGroupPolicyOverrideSortOption MINUS_ID =
      new OrgGroupPolicyOverrideSortOption("-id");
  public static final OrgGroupPolicyOverrideSortOption ORG_UUID =
      new OrgGroupPolicyOverrideSortOption("org_uuid");
  public static final OrgGroupPolicyOverrideSortOption MINUS_ORG_UUID =
      new OrgGroupPolicyOverrideSortOption("-org_uuid");

  OrgGroupPolicyOverrideSortOption(String value) {
    super(value, allowedValues);
  }

  public static class OrgGroupPolicyOverrideSortOptionSerializer
      extends StdSerializer<OrgGroupPolicyOverrideSortOption> {
    public OrgGroupPolicyOverrideSortOptionSerializer(Class<OrgGroupPolicyOverrideSortOption> t) {
      super(t);
    }

    public OrgGroupPolicyOverrideSortOptionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OrgGroupPolicyOverrideSortOption value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OrgGroupPolicyOverrideSortOption fromValue(String value) {
    return new OrgGroupPolicyOverrideSortOption(value);
  }
}
