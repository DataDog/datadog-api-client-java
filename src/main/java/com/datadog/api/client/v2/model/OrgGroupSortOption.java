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

/** Field to sort org groups by. */
@JsonSerialize(using = OrgGroupSortOption.OrgGroupSortOptionSerializer.class)
public class OrgGroupSortOption extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("name", "-name", "uuid", "-uuid"));

  public static final OrgGroupSortOption NAME = new OrgGroupSortOption("name");
  public static final OrgGroupSortOption MINUS_NAME = new OrgGroupSortOption("-name");
  public static final OrgGroupSortOption UUID = new OrgGroupSortOption("uuid");
  public static final OrgGroupSortOption MINUS_UUID = new OrgGroupSortOption("-uuid");

  OrgGroupSortOption(String value) {
    super(value, allowedValues);
  }

  public static class OrgGroupSortOptionSerializer extends StdSerializer<OrgGroupSortOption> {
    public OrgGroupSortOptionSerializer(Class<OrgGroupSortOption> t) {
      super(t);
    }

    public OrgGroupSortOptionSerializer() {
      this(null);
    }

    @Override
    public void serialize(OrgGroupSortOption value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OrgGroupSortOption fromValue(String value) {
    return new OrgGroupSortOption(value);
  }
}
