load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library")
load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_test")

kt_jvm_library(
    name = "cli",
    srcs = glob(["cli/**/*.kt"]),
    deps = [],
    visibility = ["//logserver:__pkg__"]
)

kt_jvm_test(
    name = "cli-test",
    srcs = glob(["test/*.kt"]),
    size = "small",
    deps = ["cli",
            "@com_github_jetbrains_kotlin//:kotlin-test",
            "@maven//:junit_junit",
           ],
    test_class = "com.augustbonds.cli.test.TestCommands",
)
