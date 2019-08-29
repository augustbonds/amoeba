load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

rules_kotlin_version = "legacy-modded-0_26_1-02"
rules_kotlin_sha = "245d0bc1511048aaf82afd0fa8a83e8c3b5afdff0ae4fbcae25e03bb2c6f1a1a"
http_archive(
    name = "io_bazel_rules_kotlin",
    urls = ["https://github.com/cgruber/rules_kotlin/archive/%s.zip" % rules_kotlin_version],
    type = "zip",
    strip_prefix = "rules_kotlin-%s" % rules_kotlin_version,
    sha256 = rules_kotlin_sha,
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kotlin_repositories", "kt_register_toolchains")
kotlin_repositories() # if you want the default. Otherwise see custom kotlinc distribution below
kt_register_toolchains() # to use the default toolchain, otherwise see toolchains below

load(":junit5.bzl", "junit_jupiter_java_repositories", "junit_platform_java_repositories")

JUNIT_JUPITER_VERSION = "5.3.1"

JUNIT_PLATFORM_VERSION = "1.3.1"

junit_jupiter_java_repositories(
    version = JUNIT_JUPITER_VERSION,
)

junit_platform_java_repositories(
    version = JUNIT_PLATFORM_VERSION,
)

maven_jar(
    name = "junit_junit",
    artifact = "junit:junit:4.12",
)

maven_jar(
    name = "junit5_api",
    artifact = "org.junit.jupiter:junit-jupiter-api:5.2.0"
)

maven_server(
    name = "sics_releases",
    url = "http://kompics.sics.se/maven/",
)

maven_jar(
    name = "com_google_guava_guava",
    artifact = "com.google.guava:guava:18.0",
)

maven_jar(
    name = "log4j_log4j",
    artifact = "log4j:log4j:1.2.17",
)

maven_jar(
    name = "commons_logging_commons_logging",
    artifact = "commons-logging:commons-logging:1.1.3",
)

android_sdk_repository(name = "androidsdk")

RULES_JVM_EXTERNAL_TAG = "2.2"
http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
    sha256 = "f1203ce04e232ab6fdd81897cf0ff76f2c04c0741424d192f28e65ae752ce2d6",
)
load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.50",
        "com.android.support.constraint:constraint-layout:1.1.3",
        "androidx.work:work-runtime-ktx:2.2.0",
        "junit:junit:4.12",
        "com.android.support.test.espresso:espresso-core:3.0.2",
    ],
    repositories = [
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
    ],
)
