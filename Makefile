.PHONY: all
all: .generator
	@rm -rf src/main/java
	@pre-commit run --all-files --hook-stage=manual openapi-generator || true
	@cp -R v1/src/main ./src/
	@cp -R v2/src/main ./src/
	@cp -nR v1/src/test ./src/ || true
	@cp -nR v2/src/test ./src/ || true
	@rm -rf v1 v2
	@rm -rf src/test/java/com/datadog/api/v*/client/model
	@pre-commit run --all-files --hook-stage=manual docs || echo "modified files"
	@pre-commit run --all-files --hook-stage=manual lint || echo "modified files"

target:
	@mkdir $@
	
target/google-java-format.jar: target
	@wget https://github.com/google/google-java-format/releases/download/google-java-format-1.9/google-java-format-1.9-all-deps.jar -O "$@"
	@echo '1d98720a5984de85a822aa32a378eeacd4d17480d31cba6e730caae313466b97  target/google-java-format.jar' | sha256sum --check || ( rm $@; exit 1 )
