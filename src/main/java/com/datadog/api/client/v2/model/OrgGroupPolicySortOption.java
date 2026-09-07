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

/** Field to sort policies by. */
@JsonSerialize(using = OrgGroupPolicySortOption.OrgGroupPolicySortOptionSerializer.class)
public class OrgGroupPolicySortOption extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("id", "-id", "name", "-name"));

  public static final OrgGroupPolicySortOption ID = new OrgGroupPolicySortOption("id");
  public static final OrgGroupPolicySortOption MINUS_ID = new OrgGroupPolicySortOption("-id");
  public static final OrgGroupPolicySortOption NAME = new OrgGroupPolicySortOption("name");
  public static final OrgGroupPolicySortOption MINUS_NAME = new OrgGroupPolicySortOption("-name");

  OrgGroupPolicySortOption(String value) {
    super(value, allowedValues);
  }

  public static class OrgGroupPolicySortOptionSerializer
      extends StdSerializer<OrgGroupPolicySortOption> {
    public OrgGroupPolicySortOptionSerializer(Class<OrgGroupPolicySortOption> t) {
      super(t);
    }

    public OrgGroupPolicySortOptionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OrgGroupPolicySortOption value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OrgGroupPolicySortOption fromValue(String value) {
    return new OrgGroupPolicySortOption(value);
  }
}
