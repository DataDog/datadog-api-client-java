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
 * Case-sensitive matching mode. Exact compares strings. Glob matches the entire value: * matches
 * any number of characters, including /, and ? matches one character. Other characters are literal;
 * escaping is not supported.
 */
@JsonSerialize(using = OIDCCloudAuthClaimMatchMode.OIDCCloudAuthClaimMatchModeSerializer.class)
public class OIDCCloudAuthClaimMatchMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("exact", "glob"));

  public static final OIDCCloudAuthClaimMatchMode EXACT = new OIDCCloudAuthClaimMatchMode("exact");
  public static final OIDCCloudAuthClaimMatchMode GLOB = new OIDCCloudAuthClaimMatchMode("glob");

  OIDCCloudAuthClaimMatchMode(String value) {
    super(value, allowedValues);
  }

  public static class OIDCCloudAuthClaimMatchModeSerializer
      extends StdSerializer<OIDCCloudAuthClaimMatchMode> {
    public OIDCCloudAuthClaimMatchModeSerializer(Class<OIDCCloudAuthClaimMatchMode> t) {
      super(t);
    }

    public OIDCCloudAuthClaimMatchModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OIDCCloudAuthClaimMatchMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OIDCCloudAuthClaimMatchMode fromValue(String value) {
    return new OIDCCloudAuthClaimMatchMode(value);
  }
}
