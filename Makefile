.PHONY: all
all: .generator
	@rm -rf src/main/java
	@pre-commit run --all-files --hook-stage=manual generator-v1 || true
	@pre-commit run --all-files --hook-stage=manual generator-v2 || true
	@pre-commit run --all-files --hook-stage=manual examples || true
	@pre-commit run --all-files --hook-stage=manual docs || echo "modified files"
	@pre-commit run --all-files --hook-stage=manual lint || echo "modified files"
	@pre-commit run --all-files --hook-stage=manual lint-examples || echo "modified files"

target:
	@mkdir $@
	
target/google-java-format.jar: target
	@wget https://github.com/google/google-java-format/releases/download/google-java-format-1.9/google-java-format-1.9-all-deps.jar -O "$@"
	@echo '1d98720a5984de85a822aa32a378eeacd4d17480d31cba6e730caae313466b97  target/google-java-format.jar' | sha256sum --check || ( rm $@; exit 1 )
