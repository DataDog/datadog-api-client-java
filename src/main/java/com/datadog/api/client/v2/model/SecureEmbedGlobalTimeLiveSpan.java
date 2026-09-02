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

/** Dashboard global time live_span selection. */
@JsonSerialize(using = SecureEmbedGlobalTimeLiveSpan.SecureEmbedGlobalTimeLiveSpanSerializer.class)
public class SecureEmbedGlobalTimeLiveSpan extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("15m", "1h", "4h", "1d", "2d", "1w", "1mo", "3mo"));

  public static final SecureEmbedGlobalTimeLiveSpan PAST_FIFTEEN_MINUTES =
      new SecureEmbedGlobalTimeLiveSpan("15m");
  public static final SecureEmbedGlobalTimeLiveSpan PAST_ONE_HOUR =
      new SecureEmbedGlobalTimeLiveSpan("1h");
  public static final SecureEmbedGlobalTimeLiveSpan PAST_FOUR_HOURS =
      new SecureEmbedGlobalTimeLiveSpan("4h");
  public static final SecureEmbedGlobalTimeLiveSpan PAST_ONE_DAY =
      new SecureEmbedGlobalTimeLiveSpan("1d");
  public static final SecureEmbedGlobalTimeLiveSpan PAST_TWO_DAYS =
      new SecureEmbedGlobalTimeLiveSpan("2d");
  public static final SecureEmbedGlobalTimeLiveSpan PAST_ONE_WEEK =
      new SecureEmbedGlobalTimeLiveSpan("1w");
  public static final SecureEmbedGlobalTimeLiveSpan PAST_ONE_MONTH =
      new SecureEmbedGlobalTimeLiveSpan("1mo");
  public static final SecureEmbedGlobalTimeLiveSpan PAST_THREE_MONTHS =
      new SecureEmbedGlobalTimeLiveSpan("3mo");

  SecureEmbedGlobalTimeLiveSpan(String value) {
    super(value, allowedValues);
  }

  public static class SecureEmbedGlobalTimeLiveSpanSerializer
      extends StdSerializer<SecureEmbedGlobalTimeLiveSpan> {
    public SecureEmbedGlobalTimeLiveSpanSerializer(Class<SecureEmbedGlobalTimeLiveSpan> t) {
      super(t);
    }

    public SecureEmbedGlobalTimeLiveSpanSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecureEmbedGlobalTimeLiveSpan value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecureEmbedGlobalTimeLiveSpan fromValue(String value) {
    return new SecureEmbedGlobalTimeLiveSpan(value);
  }
}
