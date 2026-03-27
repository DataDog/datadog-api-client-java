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

/** IP allowlist Entry type. */
@JsonSerialize(using = IPAllowlistEntryType.IPAllowlistEntryTypeSerializer.class)
public class IPAllowlistEntryType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ip_allowlist_entry"));

  public static final IPAllowlistEntryType IP_ALLOWLIST_ENTRY =
      new IPAllowlistEntryType("ip_allowlist_entry");

  IPAllowlistEntryType(String value) {
    super(value, allowedValues);
  }

  public static class IPAllowlistEntryTypeSerializer extends StdSerializer<IPAllowlistEntryType> {
    public IPAllowlistEntryTypeSerializer(Class<IPAllowlistEntryType> t) {
      super(t);
    }

    public IPAllowlistEntryTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IPAllowlistEntryType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IPAllowlistEntryType fromValue(String value) {
    return new IPAllowlistEntryType(value);
  }
}
