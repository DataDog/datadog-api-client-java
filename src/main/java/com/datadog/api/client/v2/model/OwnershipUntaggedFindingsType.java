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
 * The type of the ownership untagged findings resource. The value should always be <code>
 * ownership_untagged_findings</code>.
 */
@JsonSerialize(using = OwnershipUntaggedFindingsType.OwnershipUntaggedFindingsTypeSerializer.class)
public class OwnershipUntaggedFindingsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ownership_untagged_findings"));

  public static final OwnershipUntaggedFindingsType OWNERSHIP_UNTAGGED_FINDINGS =
      new OwnershipUntaggedFindingsType("ownership_untagged_findings");

  OwnershipUntaggedFindingsType(String value) {
    super(value, allowedValues);
  }

  public static class OwnershipUntaggedFindingsTypeSerializer
      extends StdSerializer<OwnershipUntaggedFindingsType> {
    public OwnershipUntaggedFindingsTypeSerializer(Class<OwnershipUntaggedFindingsType> t) {
      super(t);
    }

    public OwnershipUntaggedFindingsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OwnershipUntaggedFindingsType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OwnershipUntaggedFindingsType fromValue(String value) {
    return new OwnershipUntaggedFindingsType(value);
  }
}
