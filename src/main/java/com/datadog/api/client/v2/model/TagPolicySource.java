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

/** The telemetry source that a tag policy applies to. */
@JsonSerialize(using = TagPolicySource.TagPolicySourceSerializer.class)
public class TagPolicySource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("logs", "spans", "metrics", "rum", "feed"));

  public static final TagPolicySource LOGS = new TagPolicySource("logs");
  public static final TagPolicySource SPANS = new TagPolicySource("spans");
  public static final TagPolicySource METRICS = new TagPolicySource("metrics");
  public static final TagPolicySource RUM = new TagPolicySource("rum");
  public static final TagPolicySource FEED = new TagPolicySource("feed");

  TagPolicySource(String value) {
    super(value, allowedValues);
  }

  public static class TagPolicySourceSerializer extends StdSerializer<TagPolicySource> {
    public TagPolicySourceSerializer(Class<TagPolicySource> t) {
      super(t);
    }

    public TagPolicySourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(TagPolicySource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TagPolicySource fromValue(String value) {
    return new TagPolicySource(value);
  }
}
