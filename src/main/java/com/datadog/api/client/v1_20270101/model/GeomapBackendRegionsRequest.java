/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.datadog.api.client.AbstractOpenApiSchema;
import com.datadog.api.client.JSON;
import com.datadog.api.client.UnparsedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(using = GeomapBackendRegionsRequest.GeomapBackendRegionsRequestDeserializer.class)
@JsonSerialize(using = GeomapBackendRegionsRequest.GeomapBackendRegionsRequestSerializer.class)
public class GeomapBackendRegionsRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(GeomapBackendRegionsRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class GeomapBackendRegionsRequestSerializer
      extends StdSerializer<GeomapBackendRegionsRequest> {
    public GeomapBackendRegionsRequestSerializer(Class<GeomapBackendRegionsRequest> t) {
      super(t);
    }

    public GeomapBackendRegionsRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GeomapBackendRegionsRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class GeomapBackendRegionsRequestDeserializer
      extends StdDeserializer<GeomapBackendRegionsRequest> {
    public GeomapBackendRegionsRequestDeserializer() {
      this(GeomapBackendRegionsRequest.class);
    }

    public GeomapBackendRegionsRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public GeomapBackendRegionsRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize GeomapBackendRegionsRequest20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457233792
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457233792.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457233792.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457233792.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457233792.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457233792.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457233792.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457233792.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457233792.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457233792.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457233792.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457233792.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457233792.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457233792.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457233792) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457233792'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457233792'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457448128
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457448128.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457448128.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457448128.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457448128.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457448128.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457448128.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457448128.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457448128.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457448128.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457448128.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457448128.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457448128.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457448128.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457448128) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457448128'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457448128'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457449888
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457449888.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457449888.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457449888.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457449888.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457449888.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457449888.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457449888.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457449888.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457449888.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457449888.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457449888.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457449888.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457449888.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457449888) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457449888'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457449888'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457450848
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457450848.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457450848.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457450848.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457450848.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457450848.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457450848.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457450848.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457450848.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457450848.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457450848.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457450848.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457450848.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457450848.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457450848) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457450848'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457450848'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457451808
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457451808.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457451808.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457451808.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457451808.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457451808.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457451808.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457451808.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457451808.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457451808.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457451808.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457451808.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457451808.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457451808.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457451808) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457451808'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457451808'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457452768
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457452768.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457452768.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457452768.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457452768.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457452768.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457452768.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457452768.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457452768.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457452768.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457452768.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457452768.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457452768.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457452768.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457452768) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457452768'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457452768'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457453728
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457453728.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457453728.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457453728.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457453728.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457453728.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457453728.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457453728.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457453728.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457453728.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457453728.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457453728.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457453728.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457453728.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457453728) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457453728'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457453728'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457454688
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457454688.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457454688.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457454688.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457454688.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457454688.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457454688.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457454688.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457454688.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457454688.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457454688.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457454688.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457454688.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457454688.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457454688) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457454688'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457454688'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457455648
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457455648.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457455648.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457455648.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457455648.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457455648.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457455648.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457455648.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457455648.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457455648.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457455648.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457455648.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457455648.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457455648.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457455648) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457455648'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457455648'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457456608
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457456608.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457456608.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457456608.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457456608.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457456608.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457456608.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457456608.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457456608.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457456608.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457456608.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457456608.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457456608.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457456608.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457456608) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457456608'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457456608'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457457568
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457457568.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457457568.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457457568.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457457568.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457457568.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457457568.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457457568.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457457568.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457457568.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457457568.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457457568.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457457568.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457457568.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457457568) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457457568'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457457568'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457458528
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457458528.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457458528.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457458528.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457458528.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457458528.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457458528.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457458528.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457458528.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457458528.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457458528.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457458528.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457458528.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457458528.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457458528) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457458528'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457458528'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457459488
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457459488.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457459488.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457459488.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457459488.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457459488.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457459488.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457459488.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457459488.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457459488.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457459488.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457459488.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457459488.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457459488.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457459488) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457459488'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457459488'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457460448
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457460448.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457460448.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457460448.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457460448.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457460448.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457460448.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457460448.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457460448.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457460448.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457460448.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457460448.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457460448.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457460448.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457460448) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457460448'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457460448'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457461408
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457461408.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457461408.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457461408.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457461408.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457461408.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457461408.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457461408.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457461408.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457461408.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457461408.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457461408.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457461408.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457461408.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457461408) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457461408'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457461408'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457462368
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457462368.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457462368.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457462368.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457462368.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457462368.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457462368.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457462368.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457462368.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457462368.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457462368.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457462368.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457462368.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457462368.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457462368) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457462368'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457462368'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457463328
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457463328.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457463328.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457463328.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457463328.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457463328.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457463328.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457463328.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457463328.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457463328.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457463328.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457463328.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457463328.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457463328.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457463328) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457463328'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457463328'",
            e);
      }

      // deserialize GeomapBackendRegionsRequest20270101OneOf4457645216
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GeomapBackendRegionsRequest20270101OneOf4457645216.class.equals(Integer.class)
            || GeomapBackendRegionsRequest20270101OneOf4457645216.class.equals(Long.class)
            || GeomapBackendRegionsRequest20270101OneOf4457645216.class.equals(Float.class)
            || GeomapBackendRegionsRequest20270101OneOf4457645216.class.equals(Double.class)
            || GeomapBackendRegionsRequest20270101OneOf4457645216.class.equals(Boolean.class)
            || GeomapBackendRegionsRequest20270101OneOf4457645216.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457645216.class.equals(Integer.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457645216.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GeomapBackendRegionsRequest20270101OneOf4457645216.class.equals(Float.class)
                        || GeomapBackendRegionsRequest20270101OneOf4457645216.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457645216.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GeomapBackendRegionsRequest20270101OneOf4457645216.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(GeomapBackendRegionsRequest20270101OneOf4457645216.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GeomapBackendRegionsRequest20270101OneOf4457645216) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'GeomapBackendRegionsRequest20270101OneOf4457645216'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'GeomapBackendRegionsRequest20270101OneOf4457645216'",
            e);
      }

      GeomapBackendRegionsRequest ret = new GeomapBackendRegionsRequest();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else {
        Map<String, Object> res =
            new ObjectMapper()
                .readValue(
                    tree.traverse(jp.getCodec()).readValueAsTree().toString(),
                    new TypeReference<Map<String, Object>>() {});
        ret.setActualInstance(new UnparsedObject(res));
      }
      return ret;
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public GeomapBackendRegionsRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "GeomapBackendRegionsRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public GeomapBackendRegionsRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457233792 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457448128 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457449888 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457450848 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457451808 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457452768 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457453728 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457454688 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457455648 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457456608 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457457568 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457458528 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457459488 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457460448 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457461408 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457462368 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457463328 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public GeomapBackendRegionsRequest(GeomapBackendRegionsRequest20270101OneOf4457645216 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457233792",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457233792>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457448128",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457448128>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457449888",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457449888>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457450848",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457450848>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457451808",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457451808>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457452768",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457452768>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457453728",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457453728>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457454688",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457454688>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457455648",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457455648>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457456608",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457456608>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457457568",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457457568>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457458528",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457458528>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457459488",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457459488>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457460448",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457460448>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457461408",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457461408>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457462368",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457462368>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457463328",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457463328>() {});
    schemas.put(
        "GeomapBackendRegionsRequest20270101OneOf4457645216",
        new GenericType<GeomapBackendRegionsRequest20270101OneOf4457645216>() {});
    JSON.registerDescendants(
        GeomapBackendRegionsRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return GeomapBackendRegionsRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: GeomapBackendRegionsRequest20270101OneOf,
   * GeomapBackendRegionsRequest20270101OneOf4457233792,
   * GeomapBackendRegionsRequest20270101OneOf4457448128,
   * GeomapBackendRegionsRequest20270101OneOf4457449888,
   * GeomapBackendRegionsRequest20270101OneOf4457450848,
   * GeomapBackendRegionsRequest20270101OneOf4457451808,
   * GeomapBackendRegionsRequest20270101OneOf4457452768,
   * GeomapBackendRegionsRequest20270101OneOf4457453728,
   * GeomapBackendRegionsRequest20270101OneOf4457454688,
   * GeomapBackendRegionsRequest20270101OneOf4457455648,
   * GeomapBackendRegionsRequest20270101OneOf4457456608,
   * GeomapBackendRegionsRequest20270101OneOf4457457568,
   * GeomapBackendRegionsRequest20270101OneOf4457458528,
   * GeomapBackendRegionsRequest20270101OneOf4457459488,
   * GeomapBackendRegionsRequest20270101OneOf4457460448,
   * GeomapBackendRegionsRequest20270101OneOf4457461408,
   * GeomapBackendRegionsRequest20270101OneOf4457462368,
   * GeomapBackendRegionsRequest20270101OneOf4457463328,
   * GeomapBackendRegionsRequest20270101OneOf4457645216
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457233792.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457448128.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457449888.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457450848.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457451808.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457452768.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457453728.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457454688.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457455648.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457456608.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457457568.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457458528.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457459488.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457460448.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457461408.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457462368.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457463328.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        GeomapBackendRegionsRequest20270101OneOf4457645216.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be GeomapBackendRegionsRequest20270101OneOf,"
            + " GeomapBackendRegionsRequest20270101OneOf4457233792,"
            + " GeomapBackendRegionsRequest20270101OneOf4457448128,"
            + " GeomapBackendRegionsRequest20270101OneOf4457449888,"
            + " GeomapBackendRegionsRequest20270101OneOf4457450848,"
            + " GeomapBackendRegionsRequest20270101OneOf4457451808,"
            + " GeomapBackendRegionsRequest20270101OneOf4457452768,"
            + " GeomapBackendRegionsRequest20270101OneOf4457453728,"
            + " GeomapBackendRegionsRequest20270101OneOf4457454688,"
            + " GeomapBackendRegionsRequest20270101OneOf4457455648,"
            + " GeomapBackendRegionsRequest20270101OneOf4457456608,"
            + " GeomapBackendRegionsRequest20270101OneOf4457457568,"
            + " GeomapBackendRegionsRequest20270101OneOf4457458528,"
            + " GeomapBackendRegionsRequest20270101OneOf4457459488,"
            + " GeomapBackendRegionsRequest20270101OneOf4457460448,"
            + " GeomapBackendRegionsRequest20270101OneOf4457461408,"
            + " GeomapBackendRegionsRequest20270101OneOf4457462368,"
            + " GeomapBackendRegionsRequest20270101OneOf4457463328,"
            + " GeomapBackendRegionsRequest20270101OneOf4457645216");
  }

  /**
   * Get the actual instance, which can be the following: GeomapBackendRegionsRequest20270101OneOf,
   * GeomapBackendRegionsRequest20270101OneOf4457233792,
   * GeomapBackendRegionsRequest20270101OneOf4457448128,
   * GeomapBackendRegionsRequest20270101OneOf4457449888,
   * GeomapBackendRegionsRequest20270101OneOf4457450848,
   * GeomapBackendRegionsRequest20270101OneOf4457451808,
   * GeomapBackendRegionsRequest20270101OneOf4457452768,
   * GeomapBackendRegionsRequest20270101OneOf4457453728,
   * GeomapBackendRegionsRequest20270101OneOf4457454688,
   * GeomapBackendRegionsRequest20270101OneOf4457455648,
   * GeomapBackendRegionsRequest20270101OneOf4457456608,
   * GeomapBackendRegionsRequest20270101OneOf4457457568,
   * GeomapBackendRegionsRequest20270101OneOf4457458528,
   * GeomapBackendRegionsRequest20270101OneOf4457459488,
   * GeomapBackendRegionsRequest20270101OneOf4457460448,
   * GeomapBackendRegionsRequest20270101OneOf4457461408,
   * GeomapBackendRegionsRequest20270101OneOf4457462368,
   * GeomapBackendRegionsRequest20270101OneOf4457463328,
   * GeomapBackendRegionsRequest20270101OneOf4457645216
   *
   * @return The actual instance (GeomapBackendRegionsRequest20270101OneOf,
   *     GeomapBackendRegionsRequest20270101OneOf4457233792,
   *     GeomapBackendRegionsRequest20270101OneOf4457448128,
   *     GeomapBackendRegionsRequest20270101OneOf4457449888,
   *     GeomapBackendRegionsRequest20270101OneOf4457450848,
   *     GeomapBackendRegionsRequest20270101OneOf4457451808,
   *     GeomapBackendRegionsRequest20270101OneOf4457452768,
   *     GeomapBackendRegionsRequest20270101OneOf4457453728,
   *     GeomapBackendRegionsRequest20270101OneOf4457454688,
   *     GeomapBackendRegionsRequest20270101OneOf4457455648,
   *     GeomapBackendRegionsRequest20270101OneOf4457456608,
   *     GeomapBackendRegionsRequest20270101OneOf4457457568,
   *     GeomapBackendRegionsRequest20270101OneOf4457458528,
   *     GeomapBackendRegionsRequest20270101OneOf4457459488,
   *     GeomapBackendRegionsRequest20270101OneOf4457460448,
   *     GeomapBackendRegionsRequest20270101OneOf4457461408,
   *     GeomapBackendRegionsRequest20270101OneOf4457462368,
   *     GeomapBackendRegionsRequest20270101OneOf4457463328,
   *     GeomapBackendRegionsRequest20270101OneOf4457645216)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf`. If the actual instance
   * is not `GeomapBackendRegionsRequest20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf`
   * @throws ClassCastException if the instance is not `GeomapBackendRegionsRequest20270101OneOf`
   */
  public GeomapBackendRegionsRequest20270101OneOf getGeomapBackendRegionsRequest20270101OneOf()
      throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457233792`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457233792`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457233792`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457233792`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457233792
      getGeomapBackendRegionsRequest20270101OneOf4457233792() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457233792) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457448128`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457448128`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457448128`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457448128`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457448128
      getGeomapBackendRegionsRequest20270101OneOf4457448128() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457448128) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457449888`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457449888`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457449888`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457449888`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457449888
      getGeomapBackendRegionsRequest20270101OneOf4457449888() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457449888) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457450848`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457450848`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457450848`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457450848`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457450848
      getGeomapBackendRegionsRequest20270101OneOf4457450848() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457450848) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457451808`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457451808`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457451808`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457451808`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457451808
      getGeomapBackendRegionsRequest20270101OneOf4457451808() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457451808) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457452768`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457452768`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457452768`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457452768`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457452768
      getGeomapBackendRegionsRequest20270101OneOf4457452768() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457452768) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457453728`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457453728`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457453728`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457453728`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457453728
      getGeomapBackendRegionsRequest20270101OneOf4457453728() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457453728) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457454688`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457454688`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457454688`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457454688`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457454688
      getGeomapBackendRegionsRequest20270101OneOf4457454688() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457454688) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457455648`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457455648`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457455648`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457455648`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457455648
      getGeomapBackendRegionsRequest20270101OneOf4457455648() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457455648) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457456608`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457456608`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457456608`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457456608`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457456608
      getGeomapBackendRegionsRequest20270101OneOf4457456608() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457456608) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457457568`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457457568`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457457568`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457457568`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457457568
      getGeomapBackendRegionsRequest20270101OneOf4457457568() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457457568) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457458528`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457458528`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457458528`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457458528`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457458528
      getGeomapBackendRegionsRequest20270101OneOf4457458528() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457458528) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457459488`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457459488`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457459488`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457459488`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457459488
      getGeomapBackendRegionsRequest20270101OneOf4457459488() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457459488) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457460448`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457460448`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457460448`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457460448`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457460448
      getGeomapBackendRegionsRequest20270101OneOf4457460448() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457460448) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457461408`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457461408`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457461408`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457461408`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457461408
      getGeomapBackendRegionsRequest20270101OneOf4457461408() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457461408) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457462368`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457462368`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457462368`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457462368`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457462368
      getGeomapBackendRegionsRequest20270101OneOf4457462368() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457462368) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457463328`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457463328`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457463328`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457463328`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457463328
      getGeomapBackendRegionsRequest20270101OneOf4457463328() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457463328) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GeomapBackendRegionsRequest20270101OneOf4457645216`. If the actual
   * instance is not `GeomapBackendRegionsRequest20270101OneOf4457645216`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `GeomapBackendRegionsRequest20270101OneOf4457645216`
   * @throws ClassCastException if the instance is not
   *     `GeomapBackendRegionsRequest20270101OneOf4457645216`
   */
  public GeomapBackendRegionsRequest20270101OneOf4457645216
      getGeomapBackendRegionsRequest20270101OneOf4457645216() throws ClassCastException {
    return (GeomapBackendRegionsRequest20270101OneOf4457645216) super.getActualInstance();
  }
}
