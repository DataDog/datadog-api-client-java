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

/** The policy for matching the latest form version during an upsert operation. */
@JsonSerialize(using = LatestVersionMatchPolicy.LatestVersionMatchPolicySerializer.class)
public class LatestVersionMatchPolicy extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("none", "if_etag_match"));

  public static final LatestVersionMatchPolicy NONE = new LatestVersionMatchPolicy("none");
  public static final LatestVersionMatchPolicy IF_ETAG_MATCH =
      new LatestVersionMatchPolicy("if_etag_match");

  LatestVersionMatchPolicy(String value) {
    super(value, allowedValues);
  }

  public static class LatestVersionMatchPolicySerializer
      extends StdSerializer<LatestVersionMatchPolicy> {
    public LatestVersionMatchPolicySerializer(Class<LatestVersionMatchPolicy> t) {
      super(t);
    }

    public LatestVersionMatchPolicySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LatestVersionMatchPolicy value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LatestVersionMatchPolicy fromValue(String value) {
    return new LatestVersionMatchPolicy(value);
  }
}
