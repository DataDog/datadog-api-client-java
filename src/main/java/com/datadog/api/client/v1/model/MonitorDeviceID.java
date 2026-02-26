/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
 * ID of the device the Synthetics monitor is running on. Same as <code>SyntheticsDeviceID</code>.
 */
@JsonSerialize(using = MonitorDeviceID.MonitorDeviceIDSerializer.class)
public class MonitorDeviceID extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "laptop_large",
              "tablet",
              "mobile_small",
              "chrome.laptop_large",
              "chrome.tablet",
              "chrome.mobile_small",
              "firefox.laptop_large",
              "firefox.tablet",
              "firefox.mobile_small"));

  public static final MonitorDeviceID LAPTOP_LARGE = new MonitorDeviceID("laptop_large");
  public static final MonitorDeviceID TABLET = new MonitorDeviceID("tablet");
  public static final MonitorDeviceID MOBILE_SMALL = new MonitorDeviceID("mobile_small");
  public static final MonitorDeviceID CHROME_LAPTOP_LARGE =
      new MonitorDeviceID("chrome.laptop_large");
  public static final MonitorDeviceID CHROME_TABLET = new MonitorDeviceID("chrome.tablet");
  public static final MonitorDeviceID CHROME_MOBILE_SMALL =
      new MonitorDeviceID("chrome.mobile_small");
  public static final MonitorDeviceID FIREFOX_LAPTOP_LARGE =
      new MonitorDeviceID("firefox.laptop_large");
  public static final MonitorDeviceID FIREFOX_TABLET = new MonitorDeviceID("firefox.tablet");
  public static final MonitorDeviceID FIREFOX_MOBILE_SMALL =
      new MonitorDeviceID("firefox.mobile_small");

  MonitorDeviceID(String value) {
    super(value, allowedValues);
  }

  public static class MonitorDeviceIDSerializer extends StdSerializer<MonitorDeviceID> {
    public MonitorDeviceIDSerializer(Class<MonitorDeviceID> t) {
      super(t);
    }

    public MonitorDeviceIDSerializer() {
      this(null);
    }

    @Override
    public void serialize(MonitorDeviceID value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorDeviceID fromValue(String value) {
    return new MonitorDeviceID(value);
  }
}
