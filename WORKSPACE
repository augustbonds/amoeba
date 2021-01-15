# Utils
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# Kotlin
rules_kotlin_version = "legacy-1.3.0"
rules_kotlin_sha = "4fd769fb0db5d3c6240df8a9500515775101964eebdf85a3f9f0511130885fde"
http_archive(
    name = "io_bazel_rules_kotlin",
    urls = ["https://github.com/bazelbuild/rules_kotlin/archive/%s.zip" % rules_kotlin_version],
    type = "zip",
    strip_prefix = "rules_kotlin-%s" % rules_kotlin_version,
    sha256 = rules_kotlin_sha,
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kotlin_repositories", "kt_register_toolchains")
kotlin_repositories() # if you want the default. Otherwise see custom kotlinc distribution below
kt_register_toolchains() # to use the default toolchain, otherwise see toolchains below


#Junit 5
load(":junit5.bzl", "junit_jupiter_java_repositories", "junit_platform_java_repositories")

JUNIT_JUPITER_VERSION = "5.7.0"

JUNIT_PLATFORM_VERSION = "1.7.0"

junit_jupiter_java_repositories(
    version = JUNIT_JUPITER_VERSION,
)

junit_platform_java_repositories(
    version = JUNIT_PLATFORM_VERSION,
)


# Android SDK
android_sdk_repository(name = "androidsdk")

# Maven
RULES_JVM_EXTERNAL_TAG = "4.0"
RULES_JVM_EXTERNAL_SHA = "31701ad93dbfe544d597dbe62c9a1fdd76d81d8a9150c2bf1ecf928ecdf97169"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "log4j:log4j:1.2.17",
        "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.50",
        "com.android.support.constraint:constraint-layout:1.1.3",
        "androidx.work:work-runtime-ktx:2.2.0",
        "junit:junit:4.12",
        "com.android.support.test.espresso:espresso-core:3.0.2",
        "commons-logging:commons-logging:1.1.3",
        "com.google.guava:guava:18.0",
        "org.junit.jupiter:junit-jupiter-api:5.7.0",
        "junit:junit:4.12"
    ],
    repositories = [
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
        "http://kompics.sics.se/maven/",
    ],
)
