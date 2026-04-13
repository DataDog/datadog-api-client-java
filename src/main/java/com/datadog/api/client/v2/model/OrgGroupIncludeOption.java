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

/** Allowed include options for org group endpoints. */
@JsonSerialize(using = OrgGroupIncludeOption.OrgGroupIncludeOptionSerializer.class)
public class OrgGroupIncludeOption extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("memberships"));

  public static final OrgGroupIncludeOption MEMBERSHIPS = new OrgGroupIncludeOption("memberships");

  OrgGroupIncludeOption(String value) {
    super(value, allowedValues);
  }

  public static class OrgGroupIncludeOptionSerializer extends StdSerializer<OrgGroupIncludeOption> {
    public OrgGroupIncludeOptionSerializer(Class<OrgGroupIncludeOption> t) {
      super(t);
    }

    public OrgGroupIncludeOptionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OrgGroupIncludeOption value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OrgGroupIncludeOption fromValue(String value) {
    return new OrgGroupIncludeOption(value);
  }
}
