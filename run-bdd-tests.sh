#!/usr/bin/env bash

set -euo pipefail

REPO_ROOT="$(cd -- "$(dirname "$0")" >/dev/null 2>&1 && pwd -P)"
TEST_ARTIFACTS=${BDD_TEST_ARTIFACTS:-${REPO_ROOT}/src/test/generated}

if [ ! -x "${TEST_ARTIFACTS}/test-server" ]; then
    echo "Generated test server not found at ${TEST_ARTIFACTS}/test-server" >&2
    exit 1
fi
if [ ! -f "${TEST_ARTIFACTS}/test-runner-data/manifest.json" ]; then
    echo "Generated test runner manifest not found below ${TEST_ARTIFACTS}" >&2
    exit 1
fi

TEST_SERVER_PID=""
cleanup() {
    if [ -n "${TEST_SERVER_PID}" ]; then
        kill "${TEST_SERVER_PID}" 2>/dev/null || true
    fi
}
trap cleanup EXIT

TEST_SERVER_PORT=${BDD_TEST_SERVER_PORT:-18085}
TEST_SERVER_LOG=${BDD_TEST_SERVER_LOG:-${TMPDIR:-/tmp}/datadog-java-test-server.log}
"${TEST_ARTIFACTS}/test-server" --port "${TEST_SERVER_PORT}" >"${TEST_SERVER_LOG}" 2>&1 &
TEST_SERVER_PID=$!
for _ in {1..50}; do
    if curl --silent --fail "http://127.0.0.1:${TEST_SERVER_PORT}/__openapi_transformer__/health" >/dev/null; then
        break
    fi
    sleep 0.1
done
curl --silent --fail "http://127.0.0.1:${TEST_SERVER_PORT}/__openapi_transformer__/health" >/dev/null

cd "${REPO_ROOT}"
DD_TEST_SERVER_URL="http://127.0.0.1:${TEST_SERVER_PORT}" \
DD_TEST_RUNNER_DATA="${TEST_ARTIFACTS}/test-runner-data" \
RECORD=false \
mvn -P surefire-java16 \
    -Dtest=ScenariosTest \
    -Dcucumber.features="${TEST_ARTIFACTS}/test-runner-data/features" \
    -DargLine="--add-exports java.base/sun.security.x509=ALL-UNNAMED --add-opens java.base/sun.net.www.protocol.https=ALL-UNNAMED --add-opens java.base/java.net=ALL-UNNAMED" \
    test "$@"
