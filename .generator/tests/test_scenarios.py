# coding=utf-8
"""Test scenarios."""

from pytest_bdd import scenarios

scenarios(
    "../../src/test/resources/com/datadog/api/client/v1/api", "../../src/test/resources/com/datadog/api/client/v2/api"
)
